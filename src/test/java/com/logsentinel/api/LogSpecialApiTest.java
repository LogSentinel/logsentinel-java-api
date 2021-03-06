/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
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
import com.logsentinel.model.LogResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogSpecialApi
 */
@Ignore
public class LogSpecialApiTest {

    private final LogSpecialApi api = new LogSpecialApi();

    
    /**
     * Logs a Provenance document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logProvenanceTest() throws ApiException {
        String applicationId = null;
        String provenanceDocument = null;
        LogResponse response = api.logProvenance(applicationId, provenanceDocument);

        // TODO: test validations
    }
    
}
