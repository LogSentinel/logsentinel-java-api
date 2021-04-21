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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ActionChainAlertRule
 */

public class ActionChainAlertRule {
  @JsonProperty("actions")
  private List<String> actions = null;

  @JsonProperty("aggregationPeriod")
  private String aggregationPeriod = null;

  @JsonProperty("alertDestinationIds")
  private List<UUID> alertDestinationIds = null;

  @JsonProperty("applicationIds")
  private List<UUID> applicationIds = null;

  @JsonProperty("automaticCase")
  private Boolean automaticCase = null;

  @JsonProperty("count")
  private List<Integer> count = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("distinctByFields")
  private List<String> distinctByFields = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("initialAction")
  private String initialAction = null;

  @JsonProperty("insideWorkingHours")
  private Boolean insideWorkingHours = null;

  @JsonProperty("joinAlertsPeriod")
  private Integer joinAlertsPeriod = null;

  /**
   * Gets or Sets joinAlertsPeriodType
   */
  public enum JoinAlertsPeriodTypeEnum {
    SECOND("SECOND"),
    
    MINUTE("MINUTE"),
    
    HOUR("HOUR"),
    
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    JoinAlertsPeriodTypeEnum(String value) {
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
    public static JoinAlertsPeriodTypeEnum fromValue(String text) {
      for (JoinAlertsPeriodTypeEnum b : JoinAlertsPeriodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("joinAlertsPeriodType")
  private JoinAlertsPeriodTypeEnum joinAlertsPeriodType = null;

  @JsonProperty("less")
  private List<Boolean> less = null;

  @JsonProperty("matchParam")
  private String matchParam = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("percentage")
  private Integer percentage = null;

  @JsonProperty("queries")
  private List<String> queries = null;

  @JsonProperty("riskLevel")
  private Integer riskLevel = null;

  @JsonProperty("searchPeriod")
  private String searchPeriod = null;

  @JsonProperty("sumAction")
  private String sumAction = null;

  @JsonProperty("sumActionTypes")
  private String sumActionTypes = null;

  @JsonProperty("sumTimeFrame")
  private Long sumTimeFrame = null;

  @JsonProperty("sumValuePath")
  private String sumValuePath = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("timeFrames")
  private List<Long> timeFrames = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  @JsonProperty("withActorsOnly")
  private Boolean withActorsOnly = null;

  public ActionChainAlertRule actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public ActionChainAlertRule addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public ActionChainAlertRule aggregationPeriod(String aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
    return this;
  }

   /**
   * Get aggregationPeriod
   * @return aggregationPeriod
  **/
  @ApiModelProperty(value = "")
  public String getAggregationPeriod() {
    return aggregationPeriod;
  }

  public void setAggregationPeriod(String aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
  }

  public ActionChainAlertRule alertDestinationIds(List<UUID> alertDestinationIds) {
    this.alertDestinationIds = alertDestinationIds;
    return this;
  }

  public ActionChainAlertRule addAlertDestinationIdsItem(UUID alertDestinationIdsItem) {
    if (this.alertDestinationIds == null) {
      this.alertDestinationIds = new ArrayList<>();
    }
    this.alertDestinationIds.add(alertDestinationIdsItem);
    return this;
  }

   /**
   * Get alertDestinationIds
   * @return alertDestinationIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAlertDestinationIds() {
    return alertDestinationIds;
  }

  public void setAlertDestinationIds(List<UUID> alertDestinationIds) {
    this.alertDestinationIds = alertDestinationIds;
  }

  public ActionChainAlertRule applicationIds(List<UUID> applicationIds) {
    this.applicationIds = applicationIds;
    return this;
  }

  public ActionChainAlertRule addApplicationIdsItem(UUID applicationIdsItem) {
    if (this.applicationIds == null) {
      this.applicationIds = new ArrayList<>();
    }
    this.applicationIds.add(applicationIdsItem);
    return this;
  }

   /**
   * Get applicationIds
   * @return applicationIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getApplicationIds() {
    return applicationIds;
  }

  public void setApplicationIds(List<UUID> applicationIds) {
    this.applicationIds = applicationIds;
  }

  public ActionChainAlertRule automaticCase(Boolean automaticCase) {
    this.automaticCase = automaticCase;
    return this;
  }

   /**
   * Get automaticCase
   * @return automaticCase
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutomaticCase() {
    return automaticCase;
  }

  public void setAutomaticCase(Boolean automaticCase) {
    this.automaticCase = automaticCase;
  }

  public ActionChainAlertRule count(List<Integer> count) {
    this.count = count;
    return this;
  }

  public ActionChainAlertRule addCountItem(Integer countItem) {
    if (this.count == null) {
      this.count = new ArrayList<>();
    }
    this.count.add(countItem);
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getCount() {
    return count;
  }

  public void setCount(List<Integer> count) {
    this.count = count;
  }

  public ActionChainAlertRule created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public ActionChainAlertRule description(String description) {
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

  public ActionChainAlertRule distinctByFields(List<String> distinctByFields) {
    this.distinctByFields = distinctByFields;
    return this;
  }

  public ActionChainAlertRule addDistinctByFieldsItem(String distinctByFieldsItem) {
    if (this.distinctByFields == null) {
      this.distinctByFields = new ArrayList<>();
    }
    this.distinctByFields.add(distinctByFieldsItem);
    return this;
  }

   /**
   * Get distinctByFields
   * @return distinctByFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getDistinctByFields() {
    return distinctByFields;
  }

  public void setDistinctByFields(List<String> distinctByFields) {
    this.distinctByFields = distinctByFields;
  }

  public ActionChainAlertRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ActionChainAlertRule entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ActionChainAlertRule id(UUID id) {
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

  public ActionChainAlertRule initialAction(String initialAction) {
    this.initialAction = initialAction;
    return this;
  }

   /**
   * Get initialAction
   * @return initialAction
  **/
  @ApiModelProperty(value = "")
  public String getInitialAction() {
    return initialAction;
  }

  public void setInitialAction(String initialAction) {
    this.initialAction = initialAction;
  }

  public ActionChainAlertRule insideWorkingHours(Boolean insideWorkingHours) {
    this.insideWorkingHours = insideWorkingHours;
    return this;
  }

   /**
   * Get insideWorkingHours
   * @return insideWorkingHours
  **/
  @ApiModelProperty(value = "")
  public Boolean isInsideWorkingHours() {
    return insideWorkingHours;
  }

  public void setInsideWorkingHours(Boolean insideWorkingHours) {
    this.insideWorkingHours = insideWorkingHours;
  }

  public ActionChainAlertRule joinAlertsPeriod(Integer joinAlertsPeriod) {
    this.joinAlertsPeriod = joinAlertsPeriod;
    return this;
  }

   /**
   * Get joinAlertsPeriod
   * @return joinAlertsPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getJoinAlertsPeriod() {
    return joinAlertsPeriod;
  }

  public void setJoinAlertsPeriod(Integer joinAlertsPeriod) {
    this.joinAlertsPeriod = joinAlertsPeriod;
  }

  public ActionChainAlertRule joinAlertsPeriodType(JoinAlertsPeriodTypeEnum joinAlertsPeriodType) {
    this.joinAlertsPeriodType = joinAlertsPeriodType;
    return this;
  }

   /**
   * Get joinAlertsPeriodType
   * @return joinAlertsPeriodType
  **/
  @ApiModelProperty(value = "")
  public JoinAlertsPeriodTypeEnum getJoinAlertsPeriodType() {
    return joinAlertsPeriodType;
  }

  public void setJoinAlertsPeriodType(JoinAlertsPeriodTypeEnum joinAlertsPeriodType) {
    this.joinAlertsPeriodType = joinAlertsPeriodType;
  }

  public ActionChainAlertRule less(List<Boolean> less) {
    this.less = less;
    return this;
  }

  public ActionChainAlertRule addLessItem(Boolean lessItem) {
    if (this.less == null) {
      this.less = new ArrayList<>();
    }
    this.less.add(lessItem);
    return this;
  }

   /**
   * Get less
   * @return less
  **/
  @ApiModelProperty(value = "")
  public List<Boolean> getLess() {
    return less;
  }

  public void setLess(List<Boolean> less) {
    this.less = less;
  }

  public ActionChainAlertRule matchParam(String matchParam) {
    this.matchParam = matchParam;
    return this;
  }

   /**
   * Get matchParam
   * @return matchParam
  **/
  @ApiModelProperty(value = "")
  public String getMatchParam() {
    return matchParam;
  }

  public void setMatchParam(String matchParam) {
    this.matchParam = matchParam;
  }

  public ActionChainAlertRule name(String name) {
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

  public ActionChainAlertRule organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public ActionChainAlertRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public ActionChainAlertRule queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public ActionChainAlertRule addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(value = "")
  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }

  public ActionChainAlertRule riskLevel(Integer riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Integer riskLevel) {
    this.riskLevel = riskLevel;
  }

  public ActionChainAlertRule searchPeriod(String searchPeriod) {
    this.searchPeriod = searchPeriod;
    return this;
  }

   /**
   * Get searchPeriod
   * @return searchPeriod
  **/
  @ApiModelProperty(value = "")
  public String getSearchPeriod() {
    return searchPeriod;
  }

  public void setSearchPeriod(String searchPeriod) {
    this.searchPeriod = searchPeriod;
  }

  public ActionChainAlertRule sumAction(String sumAction) {
    this.sumAction = sumAction;
    return this;
  }

   /**
   * Get sumAction
   * @return sumAction
  **/
  @ApiModelProperty(value = "")
  public String getSumAction() {
    return sumAction;
  }

  public void setSumAction(String sumAction) {
    this.sumAction = sumAction;
  }

  public ActionChainAlertRule sumActionTypes(String sumActionTypes) {
    this.sumActionTypes = sumActionTypes;
    return this;
  }

   /**
   * Get sumActionTypes
   * @return sumActionTypes
  **/
  @ApiModelProperty(value = "")
  public String getSumActionTypes() {
    return sumActionTypes;
  }

  public void setSumActionTypes(String sumActionTypes) {
    this.sumActionTypes = sumActionTypes;
  }

  public ActionChainAlertRule sumTimeFrame(Long sumTimeFrame) {
    this.sumTimeFrame = sumTimeFrame;
    return this;
  }

   /**
   * Get sumTimeFrame
   * @return sumTimeFrame
  **/
  @ApiModelProperty(value = "")
  public Long getSumTimeFrame() {
    return sumTimeFrame;
  }

  public void setSumTimeFrame(Long sumTimeFrame) {
    this.sumTimeFrame = sumTimeFrame;
  }

  public ActionChainAlertRule sumValuePath(String sumValuePath) {
    this.sumValuePath = sumValuePath;
    return this;
  }

   /**
   * Get sumValuePath
   * @return sumValuePath
  **/
  @ApiModelProperty(value = "")
  public String getSumValuePath() {
    return sumValuePath;
  }

  public void setSumValuePath(String sumValuePath) {
    this.sumValuePath = sumValuePath;
  }

  public ActionChainAlertRule tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ActionChainAlertRule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ActionChainAlertRule timeFrames(List<Long> timeFrames) {
    this.timeFrames = timeFrames;
    return this;
  }

  public ActionChainAlertRule addTimeFramesItem(Long timeFramesItem) {
    if (this.timeFrames == null) {
      this.timeFrames = new ArrayList<>();
    }
    this.timeFrames.add(timeFramesItem);
    return this;
  }

   /**
   * Get timeFrames
   * @return timeFrames
  **/
  @ApiModelProperty(value = "")
  public List<Long> getTimeFrames() {
    return timeFrames;
  }

  public void setTimeFrames(List<Long> timeFrames) {
    this.timeFrames = timeFrames;
  }

  public ActionChainAlertRule updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public ActionChainAlertRule withActorsOnly(Boolean withActorsOnly) {
    this.withActorsOnly = withActorsOnly;
    return this;
  }

   /**
   * Get withActorsOnly
   * @return withActorsOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isWithActorsOnly() {
    return withActorsOnly;
  }

  public void setWithActorsOnly(Boolean withActorsOnly) {
    this.withActorsOnly = withActorsOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionChainAlertRule actionChainAlertRule = (ActionChainAlertRule) o;
    return Objects.equals(this.actions, actionChainAlertRule.actions) &&
        Objects.equals(this.aggregationPeriod, actionChainAlertRule.aggregationPeriod) &&
        Objects.equals(this.alertDestinationIds, actionChainAlertRule.alertDestinationIds) &&
        Objects.equals(this.applicationIds, actionChainAlertRule.applicationIds) &&
        Objects.equals(this.automaticCase, actionChainAlertRule.automaticCase) &&
        Objects.equals(this.count, actionChainAlertRule.count) &&
        Objects.equals(this.created, actionChainAlertRule.created) &&
        Objects.equals(this.description, actionChainAlertRule.description) &&
        Objects.equals(this.distinctByFields, actionChainAlertRule.distinctByFields) &&
        Objects.equals(this.enabled, actionChainAlertRule.enabled) &&
        Objects.equals(this.entityType, actionChainAlertRule.entityType) &&
        Objects.equals(this.id, actionChainAlertRule.id) &&
        Objects.equals(this.initialAction, actionChainAlertRule.initialAction) &&
        Objects.equals(this.insideWorkingHours, actionChainAlertRule.insideWorkingHours) &&
        Objects.equals(this.joinAlertsPeriod, actionChainAlertRule.joinAlertsPeriod) &&
        Objects.equals(this.joinAlertsPeriodType, actionChainAlertRule.joinAlertsPeriodType) &&
        Objects.equals(this.less, actionChainAlertRule.less) &&
        Objects.equals(this.matchParam, actionChainAlertRule.matchParam) &&
        Objects.equals(this.name, actionChainAlertRule.name) &&
        Objects.equals(this.organizationId, actionChainAlertRule.organizationId) &&
        Objects.equals(this.percentage, actionChainAlertRule.percentage) &&
        Objects.equals(this.queries, actionChainAlertRule.queries) &&
        Objects.equals(this.riskLevel, actionChainAlertRule.riskLevel) &&
        Objects.equals(this.searchPeriod, actionChainAlertRule.searchPeriod) &&
        Objects.equals(this.sumAction, actionChainAlertRule.sumAction) &&
        Objects.equals(this.sumActionTypes, actionChainAlertRule.sumActionTypes) &&
        Objects.equals(this.sumTimeFrame, actionChainAlertRule.sumTimeFrame) &&
        Objects.equals(this.sumValuePath, actionChainAlertRule.sumValuePath) &&
        Objects.equals(this.tags, actionChainAlertRule.tags) &&
        Objects.equals(this.timeFrames, actionChainAlertRule.timeFrames) &&
        Objects.equals(this.updated, actionChainAlertRule.updated) &&
        Objects.equals(this.withActorsOnly, actionChainAlertRule.withActorsOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, aggregationPeriod, alertDestinationIds, applicationIds, automaticCase, count, created, description, distinctByFields, enabled, entityType, id, initialAction, insideWorkingHours, joinAlertsPeriod, joinAlertsPeriodType, less, matchParam, name, organizationId, percentage, queries, riskLevel, searchPeriod, sumAction, sumActionTypes, sumTimeFrame, sumValuePath, tags, timeFrames, updated, withActorsOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionChainAlertRule {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    aggregationPeriod: ").append(toIndentedString(aggregationPeriod)).append("\n");
    sb.append("    alertDestinationIds: ").append(toIndentedString(alertDestinationIds)).append("\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    automaticCase: ").append(toIndentedString(automaticCase)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distinctByFields: ").append(toIndentedString(distinctByFields)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialAction: ").append(toIndentedString(initialAction)).append("\n");
    sb.append("    insideWorkingHours: ").append(toIndentedString(insideWorkingHours)).append("\n");
    sb.append("    joinAlertsPeriod: ").append(toIndentedString(joinAlertsPeriod)).append("\n");
    sb.append("    joinAlertsPeriodType: ").append(toIndentedString(joinAlertsPeriodType)).append("\n");
    sb.append("    less: ").append(toIndentedString(less)).append("\n");
    sb.append("    matchParam: ").append(toIndentedString(matchParam)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    searchPeriod: ").append(toIndentedString(searchPeriod)).append("\n");
    sb.append("    sumAction: ").append(toIndentedString(sumAction)).append("\n");
    sb.append("    sumActionTypes: ").append(toIndentedString(sumActionTypes)).append("\n");
    sb.append("    sumTimeFrame: ").append(toIndentedString(sumTimeFrame)).append("\n");
    sb.append("    sumValuePath: ").append(toIndentedString(sumValuePath)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timeFrames: ").append(toIndentedString(timeFrames)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    withActorsOnly: ").append(toIndentedString(withActorsOnly)).append("\n");
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

