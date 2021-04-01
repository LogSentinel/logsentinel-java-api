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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhishingDetectionApi
 */
@Ignore
public class PhishingDetectionApiTest {

    private final PhishingDetectionApi api = new PhishingDetectionApi();

    
    /**
     * Detects phishing attempts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detectAndReportTest() throws ApiException {
        List<String> attachments = null;
        String body = null;
        String from = null;
        String subject = null;
        Integer response = api.detectAndReport(attachments, body, from, subject);

        // TODO: test validations
    }
    
}