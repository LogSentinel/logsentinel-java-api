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
import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.ConsistencyProof;
import com.logsentinel.model.InclusionProof;
import com.logsentinel.model.MerkleTreeInfo;
import com.logsentinel.model.ResolvedVerificationFailureResponse;
import com.logsentinel.model.TreeHead;
import java.util.UUID;
import com.logsentinel.model.Verification;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationApi
 */
@Ignore
public class VerificationApiTest {

    private final VerificationApi api = new VerificationApi();

    
    /**
     * Get consistency proof for an application merkle tree. Async operation, as the generation may be slow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyProofTest() throws ApiException {
        UUID applicationId = null;
        String firstTreeHash = null;
        String secondTreeHash = null;
        ConsistencyProof response = api.getConsistencyProof(applicationId, firstTreeHash, secondTreeHash);

        // TODO: test validations
    }
    
    /**
     * Get all entries between two hashes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntriesBetweenHashesTest() throws ApiException {
        UUID applicationId = null;
        String endHash = null;
        String startHash = null;
        List<AuditLogEntry> response = api.getEntriesBetweenHashes(applicationId, endHash, startHash);

        // TODO: test validations
    }
    
    /**
     * Get inclusion proof for the application merkle tree. Async operation, as the generation may be slow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInclusionProofTest() throws ApiException {
        UUID applicationId = null;
        String hash = null;
        InclusionProof response = api.getInclusionProof(applicationId, hash);

        // TODO: test validations
    }
    
    /**
     * Get latest tree head of the application merkle tree. Async operation, as the operation may be slow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestTreeHeadTest() throws ApiException {
        UUID applicationId = null;
        TreeHead response = api.getLatestTreeHead(applicationId);

        // TODO: test validations
    }
    
    /**
     * Get general info about merkle tree parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerkleTreeInfoTest() throws ApiException {
        MerkleTreeInfo response = api.getMerkleTreeInfo();

        // TODO: test validations
    }
    
    /**
     * Get all resolved verification failures
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResolvedVerificationFailuresTest() throws ApiException {
        UUID applicationId = null;
        List<ResolvedVerificationFailureResponse> response = api.getResolvedVerificationFailures(applicationId);

        // TODO: test validations
    }
    
    /**
     * Verify whether a given hash is present, indicating that the log is intact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyTest() throws ApiException {
        String applicationId = null;
        String hash = null;
        Verification response = api.verify(applicationId, hash);

        // TODO: test validations
    }
    
    /**
     * Verify whether a given entry&#39;s hash is present, indicating that the log is intact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyEntryTest() throws ApiException {
        String applicationId = null;
        String entryId = null;
        Verification response = api.verifyEntry(applicationId, entryId);

        // TODO: test validations
    }
    
}
