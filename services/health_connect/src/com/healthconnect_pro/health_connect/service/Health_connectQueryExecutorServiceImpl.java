/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.healthconnect_pro.health_connect.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

import com.healthconnect_pro.health_connect.models.query.UpdateAppointTimingsVariableRequest;

@Service
public class Health_connectQueryExecutorServiceImpl implements Health_connectQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Health_connectQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("health_connectWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "health_connectTransactionManager")
    @Override
    public Integer executeUpdateAppointTimingsVariable(UpdateAppointTimingsVariableRequest updateAppointTimingsVariableRequest) {
        Map<String, Object> params = new HashMap<>(3);

        params.put("date2", updateAppointTimingsVariableRequest.getDate2());
        params.put("select1", updateAppointTimingsVariableRequest.getSelect1());
        params.put("id", updateAppointTimingsVariableRequest.getId());

        return queryExecutor.executeNamedQueryForUpdate("updateAppointTimingsVariable", params);
    }

}