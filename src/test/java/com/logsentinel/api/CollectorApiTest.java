/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.api;

import com.logsentinel.ApiException;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectorApi
 */
@Ignore
public class CollectorApiTest {

    private final CollectorApi api = new CollectorApi();

    
    /**
     * Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendStatisticsTest() throws ApiException {
        api.sendStatistics(null);

        // TODO: test validations
    }
    
    /**
     * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sysInitTest() throws ApiException {
        api.sysInit(null);

        // TODO: test validations
    }
    
    /**
     * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStatusTest() throws ApiException {
        api.updateStatus(null);

        // TODO: test validations
    }
    
}
