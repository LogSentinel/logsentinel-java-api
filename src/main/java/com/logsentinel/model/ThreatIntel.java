/*
 * RESTful API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * ThreatIntel
 */

public class ThreatIntel {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("feedId")
  private UUID feedId = null;

  @JsonProperty("intelType")
  private String intelType = null;

  @JsonProperty("intelValue")
  private String intelValue = null;

  public ThreatIntel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThreatIntel feedId(UUID feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
  @ApiModelProperty(value = "")
  public UUID getFeedId() {
    return feedId;
  }

  public void setFeedId(UUID feedId) {
    this.feedId = feedId;
  }

  public ThreatIntel intelType(String intelType) {
    this.intelType = intelType;
    return this;
  }

   /**
   * Get intelType
   * @return intelType
  **/
  @ApiModelProperty(value = "")
  public String getIntelType() {
    return intelType;
  }

  public void setIntelType(String intelType) {
    this.intelType = intelType;
  }

  public ThreatIntel intelValue(String intelValue) {
    this.intelValue = intelValue;
    return this;
  }

   /**
   * Get intelValue
   * @return intelValue
  **/
  @ApiModelProperty(value = "")
  public String getIntelValue() {
    return intelValue;
  }

  public void setIntelValue(String intelValue) {
    this.intelValue = intelValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatIntel threatIntel = (ThreatIntel) o;
    return Objects.equals(this.description, threatIntel.description) &&
        Objects.equals(this.feedId, threatIntel.feedId) &&
        Objects.equals(this.intelType, threatIntel.intelType) &&
        Objects.equals(this.intelValue, threatIntel.intelValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, intelType, intelValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatIntel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    intelType: ").append(toIndentedString(intelType)).append("\n");
    sb.append("    intelValue: ").append(toIndentedString(intelValue)).append("\n");
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

