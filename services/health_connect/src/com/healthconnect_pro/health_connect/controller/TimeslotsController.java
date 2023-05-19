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

import com.healthconnect_pro.health_connect.Appointments;
import com.healthconnect_pro.health_connect.Timeslots;
import com.healthconnect_pro.health_connect.service.TimeslotsService;


/**
 * Controller object for domain model class Timeslots.
 * @see Timeslots
 */
@RestController("health_connect.TimeslotsController")
@Api(value = "TimeslotsController", description = "Exposes APIs to work with Timeslots resource.")
@RequestMapping("/health_connect/Timeslots")
public class TimeslotsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimeslotsController.class);

    @Autowired
	@Qualifier("health_connect.TimeslotsService")
	private TimeslotsService timeslotsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Timeslots instance.")
    @PostMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Timeslots createTimeslots(@RequestBody Timeslots timeslots) {
		LOGGER.debug("Create Timeslots with information: {}" , timeslots);

		timeslots = timeslotsService.create(timeslots);
		LOGGER.debug("Created Timeslots with information: {}" , timeslots);

	    return timeslots;
	}

    @ApiOperation(value = "Returns the Timeslots instance associated with the given id.")
    @GetMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Timeslots getTimeslots(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Timeslots with id: {}" , id);

        Timeslots foundTimeslots = timeslotsService.getById(id);
        LOGGER.debug("Timeslots details with id: {}" , foundTimeslots);

        return foundTimeslots;
    }

    @ApiOperation(value = "Updates the Timeslots instance associated with the given id.")
    @PutMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Timeslots editTimeslots(@PathVariable("id") Integer id, @RequestBody Timeslots timeslots) {
        LOGGER.debug("Editing Timeslots with id: {}" , timeslots.getId());

        timeslots.setId(id);
        timeslots = timeslotsService.update(timeslots);
        LOGGER.debug("Timeslots details with id: {}" , timeslots);

        return timeslots;
    }
    
    @ApiOperation(value = "Partially updates the Timeslots instance associated with the given id.")
    @PatchMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Timeslots patchTimeslots(@PathVariable("id") Integer id, @RequestBody @MapTo(Timeslots.class) Map<String, Object> timeslotsPatch) {
        LOGGER.debug("Partially updating Timeslots with id: {}" , id);

        Timeslots timeslots = timeslotsService.partialUpdate(id, timeslotsPatch);
        LOGGER.debug("Timeslots details after partial update: {}" , timeslots);

        return timeslots;
    }

    @ApiOperation(value = "Deletes the Timeslots instance associated with the given id.")
    @DeleteMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTimeslots(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Timeslots with id: {}" , id);

        Timeslots deletedTimeslots = timeslotsService.delete(id);

        return deletedTimeslots != null;
    }

    /**
     * @deprecated Use {@link #findTimeslots(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Timeslots instances matching the search criteria.")
    @PostMapping(value = "/search")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Timeslots> searchTimeslotsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Timeslots list by query filter:{}", (Object) queryFilters);
        return timeslotsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Timeslots instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @GetMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Timeslots> findTimeslots(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Timeslots list by filter:", query);
        return timeslotsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Timeslots instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @PostMapping(value="/filter", consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Timeslots> filterTimeslots(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Timeslots list by filter", query);
        return timeslotsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param.")
    @GetMapping(value = "/export/{exportType}", produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTimeslots(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return timeslotsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @PostMapping(value = "/export", consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportTimeslotsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Timeslots.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> timeslotsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Timeslots instances matching the optional query (q) request param.")
	@GetMapping(value = "/count")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTimeslots( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Timeslots");
		return timeslotsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@PostMapping(value = "/aggregations")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTimeslotsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return timeslotsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @GetMapping(value="/{id:.+}/appointmentses")
    @ApiOperation(value = "Gets the appointmentses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Appointments> findAssociatedAppointmentses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated appointmentses");
        return timeslotsService.findAssociatedAppointmentses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TimeslotsService instance
	 */
	protected void setTimeslotsService(TimeslotsService service) {
		this.timeslotsService = service;
	}

}