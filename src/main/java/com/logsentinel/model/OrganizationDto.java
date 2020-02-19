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


package com.logsentinel.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * OrganizationDto
 */

public class OrganizationDto {
  @JsonProperty("attributes")
  private Map<String, String> attributes = null;

  @JsonProperty("defaultTimezone")
  private String defaultTimezone = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reportRecipients")
  private List<String> reportRecipients = null;

  @JsonProperty("secret")
  private String secret = null;

  public OrganizationDto attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public OrganizationDto putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public OrganizationDto defaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
    return this;
  }

   /**
   * Get defaultTimezone
   * @return defaultTimezone
  **/
  @ApiModelProperty(value = "")
  public String getDefaultTimezone() {
    return defaultTimezone;
  }

  public void setDefaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
  }

  public OrganizationDto id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public OrganizationDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationDto reportRecipients(List<String> reportRecipients) {
    this.reportRecipients = reportRecipients;
    return this;
  }

  public OrganizationDto addReportRecipientsItem(String reportRecipientsItem) {
    if (this.reportRecipients == null) {
      this.reportRecipients = new ArrayList<>();
    }
    this.reportRecipients.add(reportRecipientsItem);
    return this;
  }

   /**
   * Get reportRecipients
   * @return reportRecipients
  **/
  @ApiModelProperty(value = "")
  public List<String> getReportRecipients() {
    return reportRecipients;
  }

  public void setReportRecipients(List<String> reportRecipients) {
    this.reportRecipients = reportRecipients;
  }

  public OrganizationDto secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDto organizationDto = (OrganizationDto) o;
    return Objects.equals(this.attributes, organizationDto.attributes) &&
        Objects.equals(this.defaultTimezone, organizationDto.defaultTimezone) &&
        Objects.equals(this.id, organizationDto.id) &&
        Objects.equals(this.name, organizationDto.name) &&
        Objects.equals(this.reportRecipients, organizationDto.reportRecipients) &&
        Objects.equals(this.secret, organizationDto.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, defaultTimezone, id, name, reportRecipients, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationDto {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    defaultTimezone: ").append(toIndentedString(defaultTimezone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportRecipients: ").append(toIndentedString(reportRecipients)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
