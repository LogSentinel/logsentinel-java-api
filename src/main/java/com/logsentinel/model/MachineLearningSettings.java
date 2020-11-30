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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MachineLearningSettings
 */

public class MachineLearningSettings {
  @JsonProperty("alertDestinations")
  private List<UUID> alertDestinations = null;

  @JsonProperty("anomalyDetectionEnabled")
  private Boolean anomalyDetectionEnabled = null;

  @JsonProperty("anomalyDetectionEnabledDate")
  private OffsetDateTime anomalyDetectionEnabledDate = null;

  @JsonProperty("anomalyScoreThreshold")
  private Double anomalyScoreThreshold = null;

  @JsonProperty("includeEntityFields")
  private Boolean includeEntityFields = null;

  @JsonProperty("includeParams")
  private Boolean includeParams = null;

  @JsonProperty("queryStringFormatFields")
  private List<String> queryStringFormatFields = null;

  /**
   * Gets or Sets timestampField
   */
  public enum TimestampFieldEnum {
    RECEIVED("RECEIVED"),
    
    ORIGINAL("ORIGINAL");

    private String value;

    TimestampFieldEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TimestampFieldEnum fromValue(String text) {
      for (TimestampFieldEnum b : TimestampFieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("timestampField")
  private TimestampFieldEnum timestampField = null;

  public MachineLearningSettings alertDestinations(List<UUID> alertDestinations) {
    this.alertDestinations = alertDestinations;
    return this;
  }

  public MachineLearningSettings addAlertDestinationsItem(UUID alertDestinationsItem) {
    if (this.alertDestinations == null) {
      this.alertDestinations = new ArrayList<>();
    }
    this.alertDestinations.add(alertDestinationsItem);
    return this;
  }

   /**
   * Get alertDestinations
   * @return alertDestinations
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAlertDestinations() {
    return alertDestinations;
  }

  public void setAlertDestinations(List<UUID> alertDestinations) {
    this.alertDestinations = alertDestinations;
  }

  public MachineLearningSettings anomalyDetectionEnabled(Boolean anomalyDetectionEnabled) {
    this.anomalyDetectionEnabled = anomalyDetectionEnabled;
    return this;
  }

   /**
   * Get anomalyDetectionEnabled
   * @return anomalyDetectionEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnomalyDetectionEnabled() {
    return anomalyDetectionEnabled;
  }

  public void setAnomalyDetectionEnabled(Boolean anomalyDetectionEnabled) {
    this.anomalyDetectionEnabled = anomalyDetectionEnabled;
  }

  public MachineLearningSettings anomalyDetectionEnabledDate(OffsetDateTime anomalyDetectionEnabledDate) {
    this.anomalyDetectionEnabledDate = anomalyDetectionEnabledDate;
    return this;
  }

   /**
   * Get anomalyDetectionEnabledDate
   * @return anomalyDetectionEnabledDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAnomalyDetectionEnabledDate() {
    return anomalyDetectionEnabledDate;
  }

  public void setAnomalyDetectionEnabledDate(OffsetDateTime anomalyDetectionEnabledDate) {
    this.anomalyDetectionEnabledDate = anomalyDetectionEnabledDate;
  }

  public MachineLearningSettings anomalyScoreThreshold(Double anomalyScoreThreshold) {
    this.anomalyScoreThreshold = anomalyScoreThreshold;
    return this;
  }

   /**
   * Get anomalyScoreThreshold
   * @return anomalyScoreThreshold
  **/
  @ApiModelProperty(value = "")
  public Double getAnomalyScoreThreshold() {
    return anomalyScoreThreshold;
  }

  public void setAnomalyScoreThreshold(Double anomalyScoreThreshold) {
    this.anomalyScoreThreshold = anomalyScoreThreshold;
  }

  public MachineLearningSettings includeEntityFields(Boolean includeEntityFields) {
    this.includeEntityFields = includeEntityFields;
    return this;
  }

   /**
   * Get includeEntityFields
   * @return includeEntityFields
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeEntityFields() {
    return includeEntityFields;
  }

  public void setIncludeEntityFields(Boolean includeEntityFields) {
    this.includeEntityFields = includeEntityFields;
  }

  public MachineLearningSettings includeParams(Boolean includeParams) {
    this.includeParams = includeParams;
    return this;
  }

   /**
   * Get includeParams
   * @return includeParams
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeParams() {
    return includeParams;
  }

  public void setIncludeParams(Boolean includeParams) {
    this.includeParams = includeParams;
  }

  public MachineLearningSettings queryStringFormatFields(List<String> queryStringFormatFields) {
    this.queryStringFormatFields = queryStringFormatFields;
    return this;
  }

  public MachineLearningSettings addQueryStringFormatFieldsItem(String queryStringFormatFieldsItem) {
    if (this.queryStringFormatFields == null) {
      this.queryStringFormatFields = new ArrayList<>();
    }
    this.queryStringFormatFields.add(queryStringFormatFieldsItem);
    return this;
  }

   /**
   * Get queryStringFormatFields
   * @return queryStringFormatFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getQueryStringFormatFields() {
    return queryStringFormatFields;
  }

  public void setQueryStringFormatFields(List<String> queryStringFormatFields) {
    this.queryStringFormatFields = queryStringFormatFields;
  }

  public MachineLearningSettings timestampField(TimestampFieldEnum timestampField) {
    this.timestampField = timestampField;
    return this;
  }

   /**
   * Get timestampField
   * @return timestampField
  **/
  @ApiModelProperty(value = "")
  public TimestampFieldEnum getTimestampField() {
    return timestampField;
  }

  public void setTimestampField(TimestampFieldEnum timestampField) {
    this.timestampField = timestampField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineLearningSettings machineLearningSettings = (MachineLearningSettings) o;
    return Objects.equals(this.alertDestinations, machineLearningSettings.alertDestinations) &&
        Objects.equals(this.anomalyDetectionEnabled, machineLearningSettings.anomalyDetectionEnabled) &&
        Objects.equals(this.anomalyDetectionEnabledDate, machineLearningSettings.anomalyDetectionEnabledDate) &&
        Objects.equals(this.anomalyScoreThreshold, machineLearningSettings.anomalyScoreThreshold) &&
        Objects.equals(this.includeEntityFields, machineLearningSettings.includeEntityFields) &&
        Objects.equals(this.includeParams, machineLearningSettings.includeParams) &&
        Objects.equals(this.queryStringFormatFields, machineLearningSettings.queryStringFormatFields) &&
        Objects.equals(this.timestampField, machineLearningSettings.timestampField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertDestinations, anomalyDetectionEnabled, anomalyDetectionEnabledDate, anomalyScoreThreshold, includeEntityFields, includeParams, queryStringFormatFields, timestampField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineLearningSettings {\n");
    
    sb.append("    alertDestinations: ").append(toIndentedString(alertDestinations)).append("\n");
    sb.append("    anomalyDetectionEnabled: ").append(toIndentedString(anomalyDetectionEnabled)).append("\n");
    sb.append("    anomalyDetectionEnabledDate: ").append(toIndentedString(anomalyDetectionEnabledDate)).append("\n");
    sb.append("    anomalyScoreThreshold: ").append(toIndentedString(anomalyScoreThreshold)).append("\n");
    sb.append("    includeEntityFields: ").append(toIndentedString(includeEntityFields)).append("\n");
    sb.append("    includeParams: ").append(toIndentedString(includeParams)).append("\n");
    sb.append("    queryStringFormatFields: ").append(toIndentedString(queryStringFormatFields)).append("\n");
    sb.append("    timestampField: ").append(toIndentedString(timestampField)).append("\n");
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
