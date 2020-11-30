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
import java.util.UUID;

/**
 * KubernetesLogObjectRef
 */

public class KubernetesLogObjectRef {
  @JsonProperty("apiGroup")
  private String apiGroup = null;

  @JsonProperty("apiVersion")
  private String apiVersion = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  @JsonProperty("subresource")
  private String subresource = null;

  @JsonProperty("uid")
  private UUID uid = null;

  public KubernetesLogObjectRef apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

   /**
   * Get apiGroup
   * @return apiGroup
  **/
  @ApiModelProperty(value = "")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }

  public KubernetesLogObjectRef apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public KubernetesLogObjectRef name(String name) {
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

  public KubernetesLogObjectRef namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public KubernetesLogObjectRef resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(value = "")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public KubernetesLogObjectRef resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Get resourceVersion
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public KubernetesLogObjectRef subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

   /**
   * Get subresource
   * @return subresource
  **/
  @ApiModelProperty(value = "")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public KubernetesLogObjectRef uid(UUID uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(value = "")
  public UUID getUid() {
    return uid;
  }

  public void setUid(UUID uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesLogObjectRef kubernetesLogObjectRef = (KubernetesLogObjectRef) o;
    return Objects.equals(this.apiGroup, kubernetesLogObjectRef.apiGroup) &&
        Objects.equals(this.apiVersion, kubernetesLogObjectRef.apiVersion) &&
        Objects.equals(this.name, kubernetesLogObjectRef.name) &&
        Objects.equals(this.namespace, kubernetesLogObjectRef.namespace) &&
        Objects.equals(this.resource, kubernetesLogObjectRef.resource) &&
        Objects.equals(this.resourceVersion, kubernetesLogObjectRef.resourceVersion) &&
        Objects.equals(this.subresource, kubernetesLogObjectRef.subresource) &&
        Objects.equals(this.uid, kubernetesLogObjectRef.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, apiVersion, name, namespace, resource, resourceVersion, subresource, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesLogObjectRef {\n");
    
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
