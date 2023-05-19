/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.healthconnect_pro.health_connect.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.wavemaker.commons.InvalidInputException;
import com.wavemaker.commons.MessageResource;
import com.wavemaker.runtime.commons.file.model.Downloadable;
import com.wavemaker.runtime.data.annotations.EntityService;
import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;

import com.healthconnect_pro.health_connect.Appointments;


/**
 * ServiceImpl object for domain model class Appointments.
 *
 * @see Appointments
 */
@Service("health_connect.AppointmentsService")
@Validated
@EntityService(entityClass = Appointments.class, serviceId = "health_connect")
public class AppointmentsServiceImpl implements AppointmentsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentsServiceImpl.class);


    @Autowired
    @Qualifier("health_connect.AppointmentsDao")
    private WMGenericDao<Appointments, Integer> wmGenericDao;

    @Autowired
    @Qualifier("wmAppObjectMapper")
    private ObjectMapper objectMapper;


    public void setWMGenericDao(WMGenericDao<Appointments, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "health_connectTransactionManager")
    @Override
    public Appointments create(Appointments appointments) {
        LOGGER.debug("Creating a new Appointments with information: {}", appointments);

        Appointments appointmentsCreated = this.wmGenericDao.create(appointments);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(appointmentsCreated);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public Appointments getById(Integer appointmentsId) {
        LOGGER.debug("Finding Appointments by id: {}", appointmentsId);
        return this.wmGenericDao.findById(appointmentsId);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public Appointments findById(Integer appointmentsId) {
        LOGGER.debug("Finding Appointments by id: {}", appointmentsId);
        try {
            return this.wmGenericDao.findById(appointmentsId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Appointments found with id: {}", appointmentsId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public List<Appointments> findByMultipleIds(List<Integer> appointmentsIds, boolean orderedReturn) {
        LOGGER.debug("Finding Appointments by ids: {}", appointmentsIds);

        return this.wmGenericDao.findByMultipleIds(appointmentsIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "health_connectTransactionManager")
    @Override
    public Appointments update(Appointments appointments) {
        LOGGER.debug("Updating Appointments with information: {}", appointments);

        this.wmGenericDao.update(appointments);
        this.wmGenericDao.refresh(appointments);

        return appointments;
    }

    @Transactional(value = "health_connectTransactionManager")
    @Override
    public Appointments partialUpdate(Integer appointmentsId, Map<String, Object>appointmentsPatch) {
        LOGGER.debug("Partially Updating the Appointments with id: {}", appointmentsId);

        Appointments appointments = getById(appointmentsId);

        try {
            ObjectReader appointmentsReader = this.objectMapper.reader().forType(Appointments.class).withValueToUpdate(appointments);
            appointments = appointmentsReader.readValue(this.objectMapper.writeValueAsString(appointmentsPatch));
        } catch (IOException ex) {
            LOGGER.debug("There was a problem in applying the patch: {}", appointmentsPatch, ex);
            throw new InvalidInputException("Could not apply patch",ex);
        }

        appointments = update(appointments);

        return appointments;
    }

    @Transactional(value = "health_connectTransactionManager")
    @Override
    public Appointments delete(Integer appointmentsId) {
        LOGGER.debug("Deleting Appointments with id: {}", appointmentsId);
        Appointments deleted = this.wmGenericDao.findById(appointmentsId);
        if (deleted == null) {
            LOGGER.debug("No Appointments found with id: {}", appointmentsId);
            throw new EntityNotFoundException(MessageResource.create("com.wavemaker.runtime.entity.not.found"), Appointments.class.getSimpleName(), appointmentsId);
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "health_connectTransactionManager")
    @Override
    public void delete(Appointments appointments) {
        LOGGER.debug("Deleting Appointments with {}", appointments);
        this.wmGenericDao.delete(appointments);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public Page<Appointments> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Appointments");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public Page<Appointments> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Appointments");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service health_connect for table Appointments to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service health_connect for table Appointments to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "health_connectTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}