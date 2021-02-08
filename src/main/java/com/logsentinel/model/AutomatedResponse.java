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
import com.logsentinel.model.AuditLogEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AutomatedResponse
 */

public class AutomatedResponse {
  @JsonProperty("command")
  private String command = null;

  @JsonProperty("commandParameter")
  private String commandParameter = null;

  @JsonProperty("context")
  private List<AuditLogEntry> context = null;

  @JsonProperty("pythonScript")
  private String pythonScript = null;

  @JsonProperty("targetHost")
  private String targetHost = null;

  public AutomatedResponse command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(value = "")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public AutomatedResponse commandParameter(String commandParameter) {
    this.commandParameter = commandParameter;
    return this;
  }

   /**
   * Get commandParameter
   * @return commandParameter
  **/
  @ApiModelProperty(value = "")
  public String getCommandParameter() {
    return commandParameter;
  }

  public void setCommandParameter(String commandParameter) {
    this.commandParameter = commandParameter;
  }

  public AutomatedResponse context(List<AuditLogEntry> context) {
    this.context = context;
    return this;
  }

  public AutomatedResponse addContextItem(AuditLogEntry contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public List<AuditLogEntry> getContext() {
    return context;
  }

  public void setContext(List<AuditLogEntry> context) {
    this.context = context;
  }

  public AutomatedResponse pythonScript(String pythonScript) {
    this.pythonScript = pythonScript;
    return this;
  }

   /**
   * Get pythonScript
   * @return pythonScript
  **/
  @ApiModelProperty(value = "")
  public String getPythonScript() {
    return pythonScript;
  }

  public void setPythonScript(String pythonScript) {
    this.pythonScript = pythonScript;
  }

  public AutomatedResponse targetHost(String targetHost) {
    this.targetHost = targetHost;
    return this;
  }

   /**
   * Get targetHost
   * @return targetHost
  **/
  @ApiModelProperty(value = "")
  public String getTargetHost() {
    return targetHost;
  }

  public void setTargetHost(String targetHost) {
    this.targetHost = targetHost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomatedResponse automatedResponse = (AutomatedResponse) o;
    return Objects.equals(this.command, automatedResponse.command) &&
        Objects.equals(this.commandParameter, automatedResponse.commandParameter) &&
        Objects.equals(this.context, automatedResponse.context) &&
        Objects.equals(this.pythonScript, automatedResponse.pythonScript) &&
        Objects.equals(this.targetHost, automatedResponse.targetHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, commandParameter, context, pythonScript, targetHost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomatedResponse {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    commandParameter: ").append(toIndentedString(commandParameter)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    pythonScript: ").append(toIndentedString(pythonScript)).append("\n");
    sb.append("    targetHost: ").append(toIndentedString(targetHost)).append("\n");
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
