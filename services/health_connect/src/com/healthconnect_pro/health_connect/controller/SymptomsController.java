/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.healthconnect_pro.health_connect.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.commons.file.manager.ExportedFileManager;
import com.wavemaker.runtime.commons.file.model.Downloadable;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.tools.api.core.annotations.MapTo;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.healthconnect_pro.health_connect.Symptoms;
import com.healthconnect_pro.health_connect.service.SymptomsService;


/**
 * Controller object for domain model class Symptoms.
 * @see Symptoms
 */
@RestController("health_connect.SymptomsController")
@Api(value = "SymptomsController", description = "Exposes APIs to work with Symptoms resource.")
@RequestMapping("/health_connect/Symptoms")
public class SymptomsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SymptomsController.class);

    @Autowired
	@Qualifier("health_connect.SymptomsService")
	private SymptomsService symptomsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Symptoms instance.")
    @PostMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Symptoms createSymptoms(@RequestBody Symptoms symptoms) {
		LOGGER.debug("Create Symptoms with information: {}" , symptoms);

		symptoms = symptomsService.create(symptoms);
		LOGGER.debug("Created Symptoms with information: {}" , symptoms);

	    return symptoms;
	}

    @ApiOperation(value = "Returns the Symptoms instance associated with the given id.")
    @GetMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Symptoms getSymptoms(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Symptoms with id: {}" , id);

        Symptoms foundSymptoms = symptomsService.getById(id);
        LOGGER.debug("Symptoms details with id: {}" , foundSymptoms);

        return foundSymptoms;
    }

    @ApiOperation(value = "Updates the Symptoms instance associated with the given id.")
    @PutMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Symptoms editSymptoms(@PathVariable("id") Integer id, @RequestBody Symptoms symptoms) {
        LOGGER.debug("Editing Symptoms with id: {}" , symptoms.getId());

        symptoms.setId(id);
        symptoms = symptomsService.update(symptoms);
        LOGGER.debug("Symptoms details with id: {}" , symptoms);

        return symptoms;
    }
    
    @ApiOperation(value = "Partially updates the Symptoms instance associated with the given id.")
    @PatchMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Symptoms patchSymptoms(@PathVariable("id") Integer id, @RequestBody @MapTo(Symptoms.class) Map<String, Object> symptomsPatch) {
        LOGGER.debug("Partially updating Symptoms with id: {}" , id);

        Symptoms symptoms = symptomsService.partialUpdate(id, symptomsPatch);
        LOGGER.debug("Symptoms details after partial update: {}" , symptoms);

        return symptoms;
    }

    @ApiOperation(value = "Deletes the Symptoms instance associated with the given id.")
    @DeleteMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteSymptoms(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Symptoms with id: {}" , id);

        Symptoms deletedSymptoms = symptomsService.delete(id);

        return deletedSymptoms != null;
    }

    /**
     * @deprecated Use {@link #findSymptoms(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Symptoms instances matching the search criteria.")
    @PostMapping(value = "/search")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Symptoms> searchSymptomsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Symptoms list by query filter:{}", (Object) queryFilters);
        return symptomsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Symptoms instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @GetMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Symptoms> findSymptoms(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Symptoms list by filter:", query);
        return symptomsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Symptoms instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @PostMapping(value="/filter", consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Symptoms> filterSymptoms(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Symptoms list by filter", query);
        return symptomsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param.")
    @GetMapping(value = "/export/{exportType}", produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportSymptoms(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return symptomsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @PostMapping(value = "/export", consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSymptomsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Symptoms.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> symptomsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Symptoms instances matching the optional query (q) request param.")
	@GetMapping(value = "/count")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countSymptoms( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Symptoms");
		return symptomsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@PostMapping(value = "/aggregations")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getSymptomsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return symptomsService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SymptomsService instance
	 */
	protected void setSymptomsService(SymptomsService service) {
		this.symptomsService = service;
	}

}