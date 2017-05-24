package com.logsentinel;

import com.logsentinel.auth.HttpBasicAuth;
import com.logsentinel.client.AuditLogControllerApi;
import com.logsentinel.client.HashControllerApi;

/**
 * Builder used to create an instance of the LogSentinel client.
 * @author bozho
 *
 */
public class LogSentinelClientBuilder {

    private String applicationId;
    private String organizationId;
    private String secret;
    
    private byte[] encryptionKey;
    private BodySerializer bodySerializer;
    private String basePath;
    
    public static LogSentinelClientBuilder create(String applicationId, String organizationId, String secret) {
        LogSentinelClientBuilder builder = new LogSentinelClientBuilder();
        return builder.setApplicationId(applicationId)
                .setOrganizationId(organizationId)
                .setSecret(secret);
    }

    public LogSentinelClient build() {
        ApiClient apiClient = new ApiClient();
        if (basePath != null) {
            apiClient.setBasePath(basePath);
        }
        HttpBasicAuth auth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        auth.setUsername(organizationId);
        auth.setPassword(secret);
        
        BodySerializer serializer = bodySerializer != null ? bodySerializer : new JsonBodySerializer(apiClient.getJSON());
        if (encryptionKey != null) {
            serializer = new EncryptingBodySerializer(encryptionKey, serializer);
        }
        AuditLogControllerApi auditLogActions = new AuditLogControllerApi(apiClient, serializer);
        HashControllerApi hashActions = new HashControllerApi(apiClient, serializer);
        
        LogSentinelClient client = new LogSentinelClient(auditLogActions, hashActions);
        return client;
    }
    
    public String getApplicationId() {
        return applicationId;
    }

    public LogSentinelClientBuilder setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public LogSentinelClientBuilder setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public LogSentinelClientBuilder setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public byte[] getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the (symmetric) key used to encrypt outgoing messages. If not set, messages are
     * set unencrypted. Refer to the LogSentniel documentation to get more
     * information on when and why you should encrypt the requests
     * 
     * @param encryptionKey the symmetric (AES) encryption key
     * @return the builder
     */
    public LogSentinelClientBuilder setEncryptionKey(byte[] encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    public BodySerializer getBodySerializer() {
        return bodySerializer;
    }

    /**
     * Sets a custom body serializer. If none is specified, JSON serializer is used for the body
     * 
     * @param bodySerializer
     * @return the builder
     */
    public LogSentinelClientBuilder setBodySerializer(BodySerializer bodySerializer) {
        this.bodySerializer = bodySerializer;
        return this;
    }

    public String getBasePath() {
        return basePath;
    }

    /**
     * Sets a custom base path for the API, other than logsentinel.com. Should
     * be used when running a local/hosted instance rather than using the cloud
     * one
     * 
     * @param basePath
     * @return
     */
    public LogSentinelClientBuilder setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    
}
