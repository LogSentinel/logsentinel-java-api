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


package com.logsentinel.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.logsentinel.model.ConnectorMetadataDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * CollectorMetadataDto
 */

public class CollectorMetadataDto {
  @JsonProperty("collectorId")
  private UUID collectorId = null;

  @JsonProperty("connectorMetadata")
  private Map<String, ConnectorMetadataDto> connectorMetadata = null;

  public CollectorMetadataDto collectorId(UUID collectorId) {
    this.collectorId = collectorId;
    return this;
  }

   /**
   * Get collectorId
   * @return collectorId
  **/
  @ApiModelProperty(value = "")
  public UUID getCollectorId() {
    return collectorId;
  }

  public void setCollectorId(UUID collectorId) {
    this.collectorId = collectorId;
  }

  public CollectorMetadataDto connectorMetadata(Map<String, ConnectorMetadataDto> connectorMetadata) {
    this.connectorMetadata = connectorMetadata;
    return this;
  }

  public CollectorMetadataDto putConnectorMetadataItem(String key, ConnectorMetadataDto connectorMetadataItem) {
    if (this.connectorMetadata == null) {
      this.connectorMetadata = new HashMap<>();
    }
    this.connectorMetadata.put(key, connectorMetadataItem);
    return this;
  }

   /**
   * Get connectorMetadata
   * @return connectorMetadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, ConnectorMetadataDto> getConnectorMetadata() {
    return connectorMetadata;
  }

  public void setConnectorMetadata(Map<String, ConnectorMetadataDto> connectorMetadata) {
    this.connectorMetadata = connectorMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectorMetadataDto collectorMetadataDto = (CollectorMetadataDto) o;
    return Objects.equals(this.collectorId, collectorMetadataDto.collectorId) &&
        Objects.equals(this.connectorMetadata, collectorMetadataDto.connectorMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorId, connectorMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectorMetadataDto {\n");
    
    sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
    sb.append("    connectorMetadata: ").append(toIndentedString(connectorMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

