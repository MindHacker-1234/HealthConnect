/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.healthconnect_pro.health_connect.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.commons.file.model.Downloadable;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;

import com.healthconnect_pro.health_connect.Appointments;
import com.healthconnect_pro.health_connect.Patients;

/**
 * Service object for domain model class {@link Patients}.
 */
public interface PatientsService {

    /**
     * Creates a new Patients. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Patients if any.
     *
     * @param patients Details of the Patients to be created; value cannot be null.
     * @return The newly created Patients.
     */
    Patients create(@Valid Patients patients);


	/**
     * Returns Patients by given id if exists.
     *
     * @param patientsId The id of the Patients to get; value cannot be null.
     * @return Patients associated with the given patientsId.
	 * @throws EntityNotFoundException If no Patients is found.
     */
    Patients getById(Integer patientsId);

    /**
     * Find and return the Patients by given id if exists, returns null otherwise.
     *
     * @param patientsId The id of the Patients to get; value cannot be null.
     * @return Patients associated with the given patientsId.
     */
    Patients findById(Integer patientsId);

	/**
     * Find and return the list of Patients by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param patientsIds The id's of the Patients to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Patients associated with the given patientsIds.
     */
    List<Patients> findByMultipleIds(List<Integer> patientsIds, boolean orderedReturn);

    /**
     * Find and return the Patients for given email  if exists.
     *
     * @param email value of email; value cannot be null.
     * @return Patients associated with the given inputs.
     * @throws EntityNotFoundException if no matching Patients found.
     */
    Patients getByEmail(String email);

    /**
     * Updates the details of an existing Patients. It replaces all fields of the existing Patients with the given patients.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Patients if any.
     *
     * @param patients The details of the Patients to be updated; value cannot be null.
     * @return The updated Patients.
     * @throws EntityNotFoundException if no Patients is found with given input.
     */
    Patients update(@Valid Patients patients);


    /**
     * Partially updates the details of an existing Patients. It updates only the
     * fields of the existing Patients which are passed in the patientsPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Patients if any.
     *
     * @param patientsId The id of the Patients to be deleted; value cannot be null.
     * @param patientsPatch The partial data of Patients which is supposed to be updated; value cannot be null.
     * @return The updated Patients.
     * @throws EntityNotFoundException if no Patients is found with given input.
     */
    Patients partialUpdate(Integer patientsId, Map<String, Object> patientsPatch);

    /**
     * Deletes an existing Patients with the given id.
     *
     * @param patientsId The id of the Patients to be deleted; value cannot be null.
     * @return The deleted Patients.
     * @throws EntityNotFoundException if no Patients found with the given id.
     */
    Patients delete(Integer patientsId);

    /**
     * Deletes an existing Patients with the given object.
     *
     * @param patients The instance of the Patients to be deleted; value cannot be null.
     */
    void delete(Patients patients);

    /**
     * Find all Patients matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Patients.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Patients> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Patients matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Patients.
     *
     * @see Pageable
     * @see Page
     */
    Page<Patients> findAll(String query, Pageable pageable);

    /**
     * Exports all Patients matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Patients matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Patients in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Patients.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated appointmentses for given Patients id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Appointments instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Appointments> findAssociatedAppointmentses(Integer id, Pageable pageable);

}