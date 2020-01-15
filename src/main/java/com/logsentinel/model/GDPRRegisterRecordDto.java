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
import com.logsentinel.model.GDPRRecipient;
import com.logsentinel.model.GDPRResponsibleEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * GDPRRegisterRecordDto
 */

public class GDPRRegisterRecordDto {
  @JsonProperty("auditTrailCorrelationKey")
  private String auditTrailCorrelationKey = null;

  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("controller")
  private GDPRResponsibleEntity controller = null;

  @JsonProperty("controllersDescription")
  private String controllersDescription = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  /**
   * Gets or Sets dataRecipientCategories
   */
  public enum DataRecipientCategoriesEnum {
    STAFF("STAFF"),
    
    PUBLIC_AUTHORITY("PUBLIC_AUTHORITY"),
    
    CONTRACTOR("CONTRACTOR"),
    
    OTHER("OTHER");

    private String value;

    DataRecipientCategoriesEnum(String value) {
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
    public static DataRecipientCategoriesEnum fromValue(String text) {
      for (DataRecipientCategoriesEnum b : DataRecipientCategoriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataRecipientCategories")
  private List<DataRecipientCategoriesEnum> dataRecipientCategories = null;

  @JsonProperty("dataRecipientCategoriesOther")
  private List<String> dataRecipientCategoriesOther = null;

  /**
   * Gets or Sets dataSubjectCategory
   */
  public enum DataSubjectCategoryEnum {
    EMPLOYEES("EMPLOYEES"),
    
    JOB_CANDIDATES("JOB_CANDIDATES"),
    
    CONTRACTORS("CONTRACTORS"),
    
    CUSTOMERS("CUSTOMERS"),
    
    USERS("USERS"),
    
    SUPPLIERS("SUPPLIERS"),
    
    OTHER("OTHER");

    private String value;

    DataSubjectCategoryEnum(String value) {
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
    public static DataSubjectCategoryEnum fromValue(String text) {
      for (DataSubjectCategoryEnum b : DataSubjectCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataSubjectCategory")
  private DataSubjectCategoryEnum dataSubjectCategory = null;

  @JsonProperty("dataSubjectCategoryOther")
  private String dataSubjectCategoryOther = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("jointControllers")
  private List<GDPRResponsibleEntity> jointControllers = null;

  @JsonProperty("notes")
  private String notes = null;

  /**
   * Gets or Sets organizationRole
   */
  public enum OrganizationRoleEnum {
    CONTROLLER("CONTROLLER"),
    
    PROCESSOR("PROCESSOR");

    private String value;

    OrganizationRoleEnum(String value) {
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
    public static OrganizationRoleEnum fromValue(String text) {
      for (OrganizationRoleEnum b : OrganizationRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("organizationRole")
  private OrganizationRoleEnum organizationRole = null;

  /**
   * Gets or Sets personalDataCategory
   */
  public enum PersonalDataCategoryEnum {
    EMPLOYEE_DATA("EMPLOYEE_DATA"),
    
    CUSTOMER_DATA("CUSTOMER_DATA"),
    
    USER_DATA("USER_DATA"),
    
    CIVIL_STATUS("CIVIL_STATUS"),
    
    PERSONAL_LIFE("PERSONAL_LIFE"),
    
    FINANCIAL_DATA("FINANCIAL_DATA"),
    
    LOCATION_DATA("LOCATION_DATA"),
    
    SENSITIVE_DATA("SENSITIVE_DATA"),
    
    CONTACT_DATA("CONTACT_DATA"),
    
    IDENTIFICATION_DATA("IDENTIFICATION_DATA"),
    
    OTHER("OTHER");

    private String value;

    PersonalDataCategoryEnum(String value) {
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
    public static PersonalDataCategoryEnum fromValue(String text) {
      for (PersonalDataCategoryEnum b : PersonalDataCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("personalDataCategory")
  private PersonalDataCategoryEnum personalDataCategory = null;

  @JsonProperty("personalDataCategoryOther")
  private String personalDataCategoryOther = null;

  @JsonProperty("personalDataFields")
  private String personalDataFields = null;

  @JsonProperty("processOwner")
  private String processOwner = null;

  @JsonProperty("processingActivityCode")
  private String processingActivityCode = null;

  @JsonProperty("processingActivityName")
  private String processingActivityName = null;

  /**
   * Gets or Sets processingLegalBasis
   */
  public enum ProcessingLegalBasisEnum {
    LEGITIMATE_INTEREST("LEGITIMATE_INTEREST"),
    
    CONSENT("CONSENT"),
    
    CONTRACT_ENFORCEMENT("CONTRACT_ENFORCEMENT"),
    
    LEGAL_COMPLIANCE("LEGAL_COMPLIANCE"),
    
    VITAL_INTERESTS_PROTECTION("VITAL_INTERESTS_PROTECTION"),
    
    PUBLIC_INTEREST("PUBLIC_INTEREST");

    private String value;

    ProcessingLegalBasisEnum(String value) {
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
    public static ProcessingLegalBasisEnum fromValue(String text) {
      for (ProcessingLegalBasisEnum b : ProcessingLegalBasisEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("processingLegalBasis")
  private ProcessingLegalBasisEnum processingLegalBasis = null;

  @JsonProperty("processor")
  private GDPRResponsibleEntity processor = null;

  @JsonProperty("purposes")
  private List<String> purposes = null;

  @JsonProperty("recipients")
  private List<GDPRRecipient> recipients = null;

  @JsonProperty("relevantDepartment")
  private String relevantDepartment = null;

  @JsonProperty("retentionMonths")
  private Integer retentionMonths = null;

  @JsonProperty("riskDescription")
  private String riskDescription = null;

  /**
   * Gets or Sets sensitivePersonalDataCategory
   */
  public enum SensitivePersonalDataCategoryEnum {
    RACIAL_OR_ETHNIC("RACIAL_OR_ETHNIC"),
    
    POLITICAL_OPINION("POLITICAL_OPINION"),
    
    RELIGIOUS_BELIEFS("RELIGIOUS_BELIEFS"),
    
    TRADE_UNION_MEMBERSHIP("TRADE_UNION_MEMBERSHIP"),
    
    GENETIC_DATA("GENETIC_DATA"),
    
    BIOMETRIC_DATA("BIOMETRIC_DATA"),
    
    HEALTH_DATA("HEALTH_DATA"),
    
    SEX_LIFE_DATA("SEX_LIFE_DATA"),
    
    CRIMINAL_CONVICTION_DATA("CRIMINAL_CONVICTION_DATA"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    SensitivePersonalDataCategoryEnum(String value) {
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
    public static SensitivePersonalDataCategoryEnum fromValue(String text) {
      for (SensitivePersonalDataCategoryEnum b : SensitivePersonalDataCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sensitivePersonalDataCategory")
  private SensitivePersonalDataCategoryEnum sensitivePersonalDataCategory = null;

  @JsonProperty("software")
  private String software = null;

  @JsonProperty("subProcessors")
  private List<GDPRResponsibleEntity> subProcessors = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  /**
   * Gets or Sets technicalMeasures
   */
  public enum TechnicalMeasuresEnum {
    PSEUDONYMIZATION("PSEUDONYMIZATION"),
    
    ENCRYPTION_AT_REST("ENCRYPTION_AT_REST"),
    
    ENCRYPTION_IN_TRANSIT("ENCRYPTION_IN_TRANSIT"),
    
    AUDITING_ACCESS("AUDITING_ACCESS"),
    
    DATA_INTEGRITY_PROTECTION("DATA_INTEGRITY_PROTECTION"),
    
    SOFTWARE_UPDATE_POLICY("SOFTWARE_UPDATE_POLICY"),
    
    DATA_REDUNDANCY("DATA_REDUNDANCY");

    private String value;

    TechnicalMeasuresEnum(String value) {
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
    public static TechnicalMeasuresEnum fromValue(String text) {
      for (TechnicalMeasuresEnum b : TechnicalMeasuresEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("technicalMeasures")
  private List<TechnicalMeasuresEnum> technicalMeasures = null;

  @JsonProperty("technicalMeasuresOther")
  private List<String> technicalMeasuresOther = null;

  @JsonProperty("thirdCountryTransferSafeguards")
  private List<String> thirdCountryTransferSafeguards = null;

  @JsonProperty("thirdCountryTransfers")
  private List<String> thirdCountryTransfers = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  public GDPRRegisterRecordDto auditTrailCorrelationKey(String auditTrailCorrelationKey) {
    this.auditTrailCorrelationKey = auditTrailCorrelationKey;
    return this;
  }

   /**
   * Get auditTrailCorrelationKey
   * @return auditTrailCorrelationKey
  **/
  @ApiModelProperty(value = "")
  public String getAuditTrailCorrelationKey() {
    return auditTrailCorrelationKey;
  }

  public void setAuditTrailCorrelationKey(String auditTrailCorrelationKey) {
    this.auditTrailCorrelationKey = auditTrailCorrelationKey;
  }

  public GDPRRegisterRecordDto branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public GDPRRegisterRecordDto controller(GDPRResponsibleEntity controller) {
    this.controller = controller;
    return this;
  }

   /**
   * Get controller
   * @return controller
  **/
  @ApiModelProperty(value = "")
  public GDPRResponsibleEntity getController() {
    return controller;
  }

  public void setController(GDPRResponsibleEntity controller) {
    this.controller = controller;
  }

  public GDPRRegisterRecordDto controllersDescription(String controllersDescription) {
    this.controllersDescription = controllersDescription;
    return this;
  }

   /**
   * Get controllersDescription
   * @return controllersDescription
  **/
  @ApiModelProperty(value = "")
  public String getControllersDescription() {
    return controllersDescription;
  }

  public void setControllersDescription(String controllersDescription) {
    this.controllersDescription = controllersDescription;
  }

  public GDPRRegisterRecordDto created(LocalDateTime created) {
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

  public GDPRRegisterRecordDto dataRecipientCategories(List<DataRecipientCategoriesEnum> dataRecipientCategories) {
    this.dataRecipientCategories = dataRecipientCategories;
    return this;
  }

  public GDPRRegisterRecordDto addDataRecipientCategoriesItem(DataRecipientCategoriesEnum dataRecipientCategoriesItem) {
    if (this.dataRecipientCategories == null) {
      this.dataRecipientCategories = new ArrayList<>();
    }
    this.dataRecipientCategories.add(dataRecipientCategoriesItem);
    return this;
  }

   /**
   * Get dataRecipientCategories
   * @return dataRecipientCategories
  **/
  @ApiModelProperty(value = "")
  public List<DataRecipientCategoriesEnum> getDataRecipientCategories() {
    return dataRecipientCategories;
  }

  public void setDataRecipientCategories(List<DataRecipientCategoriesEnum> dataRecipientCategories) {
    this.dataRecipientCategories = dataRecipientCategories;
  }

  public GDPRRegisterRecordDto dataRecipientCategoriesOther(List<String> dataRecipientCategoriesOther) {
    this.dataRecipientCategoriesOther = dataRecipientCategoriesOther;
    return this;
  }

  public GDPRRegisterRecordDto addDataRecipientCategoriesOtherItem(String dataRecipientCategoriesOtherItem) {
    if (this.dataRecipientCategoriesOther == null) {
      this.dataRecipientCategoriesOther = new ArrayList<>();
    }
    this.dataRecipientCategoriesOther.add(dataRecipientCategoriesOtherItem);
    return this;
  }

   /**
   * Get dataRecipientCategoriesOther
   * @return dataRecipientCategoriesOther
  **/
  @ApiModelProperty(value = "")
  public List<String> getDataRecipientCategoriesOther() {
    return dataRecipientCategoriesOther;
  }

  public void setDataRecipientCategoriesOther(List<String> dataRecipientCategoriesOther) {
    this.dataRecipientCategoriesOther = dataRecipientCategoriesOther;
  }

  public GDPRRegisterRecordDto dataSubjectCategory(DataSubjectCategoryEnum dataSubjectCategory) {
    this.dataSubjectCategory = dataSubjectCategory;
    return this;
  }

   /**
   * Get dataSubjectCategory
   * @return dataSubjectCategory
  **/
  @ApiModelProperty(value = "")
  public DataSubjectCategoryEnum getDataSubjectCategory() {
    return dataSubjectCategory;
  }

  public void setDataSubjectCategory(DataSubjectCategoryEnum dataSubjectCategory) {
    this.dataSubjectCategory = dataSubjectCategory;
  }

  public GDPRRegisterRecordDto dataSubjectCategoryOther(String dataSubjectCategoryOther) {
    this.dataSubjectCategoryOther = dataSubjectCategoryOther;
    return this;
  }

   /**
   * Get dataSubjectCategoryOther
   * @return dataSubjectCategoryOther
  **/
  @ApiModelProperty(value = "")
  public String getDataSubjectCategoryOther() {
    return dataSubjectCategoryOther;
  }

  public void setDataSubjectCategoryOther(String dataSubjectCategoryOther) {
    this.dataSubjectCategoryOther = dataSubjectCategoryOther;
  }

  public GDPRRegisterRecordDto description(String description) {
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

  public GDPRRegisterRecordDto jointControllers(List<GDPRResponsibleEntity> jointControllers) {
    this.jointControllers = jointControllers;
    return this;
  }

  public GDPRRegisterRecordDto addJointControllersItem(GDPRResponsibleEntity jointControllersItem) {
    if (this.jointControllers == null) {
      this.jointControllers = new ArrayList<>();
    }
    this.jointControllers.add(jointControllersItem);
    return this;
  }

   /**
   * Get jointControllers
   * @return jointControllers
  **/
  @ApiModelProperty(value = "")
  public List<GDPRResponsibleEntity> getJointControllers() {
    return jointControllers;
  }

  public void setJointControllers(List<GDPRResponsibleEntity> jointControllers) {
    this.jointControllers = jointControllers;
  }

  public GDPRRegisterRecordDto notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public GDPRRegisterRecordDto organizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

   /**
   * Get organizationRole
   * @return organizationRole
  **/
  @ApiModelProperty(value = "")
  public OrganizationRoleEnum getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
  }

  public GDPRRegisterRecordDto personalDataCategory(PersonalDataCategoryEnum personalDataCategory) {
    this.personalDataCategory = personalDataCategory;
    return this;
  }

   /**
   * Get personalDataCategory
   * @return personalDataCategory
  **/
  @ApiModelProperty(value = "")
  public PersonalDataCategoryEnum getPersonalDataCategory() {
    return personalDataCategory;
  }

  public void setPersonalDataCategory(PersonalDataCategoryEnum personalDataCategory) {
    this.personalDataCategory = personalDataCategory;
  }

  public GDPRRegisterRecordDto personalDataCategoryOther(String personalDataCategoryOther) {
    this.personalDataCategoryOther = personalDataCategoryOther;
    return this;
  }

   /**
   * Get personalDataCategoryOther
   * @return personalDataCategoryOther
  **/
  @ApiModelProperty(value = "")
  public String getPersonalDataCategoryOther() {
    return personalDataCategoryOther;
  }

  public void setPersonalDataCategoryOther(String personalDataCategoryOther) {
    this.personalDataCategoryOther = personalDataCategoryOther;
  }

  public GDPRRegisterRecordDto personalDataFields(String personalDataFields) {
    this.personalDataFields = personalDataFields;
    return this;
  }

   /**
   * Get personalDataFields
   * @return personalDataFields
  **/
  @ApiModelProperty(value = "")
  public String getPersonalDataFields() {
    return personalDataFields;
  }

  public void setPersonalDataFields(String personalDataFields) {
    this.personalDataFields = personalDataFields;
  }

  public GDPRRegisterRecordDto processOwner(String processOwner) {
    this.processOwner = processOwner;
    return this;
  }

   /**
   * Get processOwner
   * @return processOwner
  **/
  @ApiModelProperty(value = "")
  public String getProcessOwner() {
    return processOwner;
  }

  public void setProcessOwner(String processOwner) {
    this.processOwner = processOwner;
  }

  public GDPRRegisterRecordDto processingActivityCode(String processingActivityCode) {
    this.processingActivityCode = processingActivityCode;
    return this;
  }

   /**
   * Get processingActivityCode
   * @return processingActivityCode
  **/
  @ApiModelProperty(value = "")
  public String getProcessingActivityCode() {
    return processingActivityCode;
  }

  public void setProcessingActivityCode(String processingActivityCode) {
    this.processingActivityCode = processingActivityCode;
  }

  public GDPRRegisterRecordDto processingActivityName(String processingActivityName) {
    this.processingActivityName = processingActivityName;
    return this;
  }

   /**
   * Get processingActivityName
   * @return processingActivityName
  **/
  @ApiModelProperty(value = "")
  public String getProcessingActivityName() {
    return processingActivityName;
  }

  public void setProcessingActivityName(String processingActivityName) {
    this.processingActivityName = processingActivityName;
  }

  public GDPRRegisterRecordDto processingLegalBasis(ProcessingLegalBasisEnum processingLegalBasis) {
    this.processingLegalBasis = processingLegalBasis;
    return this;
  }

   /**
   * Get processingLegalBasis
   * @return processingLegalBasis
  **/
  @ApiModelProperty(value = "")
  public ProcessingLegalBasisEnum getProcessingLegalBasis() {
    return processingLegalBasis;
  }

  public void setProcessingLegalBasis(ProcessingLegalBasisEnum processingLegalBasis) {
    this.processingLegalBasis = processingLegalBasis;
  }

  public GDPRRegisterRecordDto processor(GDPRResponsibleEntity processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public GDPRResponsibleEntity getProcessor() {
    return processor;
  }

  public void setProcessor(GDPRResponsibleEntity processor) {
    this.processor = processor;
  }

  public GDPRRegisterRecordDto purposes(List<String> purposes) {
    this.purposes = purposes;
    return this;
  }

  public GDPRRegisterRecordDto addPurposesItem(String purposesItem) {
    if (this.purposes == null) {
      this.purposes = new ArrayList<>();
    }
    this.purposes.add(purposesItem);
    return this;
  }

   /**
   * Get purposes
   * @return purposes
  **/
  @ApiModelProperty(value = "")
  public List<String> getPurposes() {
    return purposes;
  }

  public void setPurposes(List<String> purposes) {
    this.purposes = purposes;
  }

  public GDPRRegisterRecordDto recipients(List<GDPRRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public GDPRRegisterRecordDto addRecipientsItem(GDPRRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public List<GDPRRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<GDPRRecipient> recipients) {
    this.recipients = recipients;
  }

  public GDPRRegisterRecordDto relevantDepartment(String relevantDepartment) {
    this.relevantDepartment = relevantDepartment;
    return this;
  }

   /**
   * Get relevantDepartment
   * @return relevantDepartment
  **/
  @ApiModelProperty(value = "")
  public String getRelevantDepartment() {
    return relevantDepartment;
  }

  public void setRelevantDepartment(String relevantDepartment) {
    this.relevantDepartment = relevantDepartment;
  }

  public GDPRRegisterRecordDto retentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
    return this;
  }

   /**
   * Get retentionMonths
   * @return retentionMonths
  **/
  @ApiModelProperty(value = "")
  public Integer getRetentionMonths() {
    return retentionMonths;
  }

  public void setRetentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
  }

  public GDPRRegisterRecordDto riskDescription(String riskDescription) {
    this.riskDescription = riskDescription;
    return this;
  }

   /**
   * Get riskDescription
   * @return riskDescription
  **/
  @ApiModelProperty(value = "")
  public String getRiskDescription() {
    return riskDescription;
  }

  public void setRiskDescription(String riskDescription) {
    this.riskDescription = riskDescription;
  }

  public GDPRRegisterRecordDto sensitivePersonalDataCategory(SensitivePersonalDataCategoryEnum sensitivePersonalDataCategory) {
    this.sensitivePersonalDataCategory = sensitivePersonalDataCategory;
    return this;
  }

   /**
   * Get sensitivePersonalDataCategory
   * @return sensitivePersonalDataCategory
  **/
  @ApiModelProperty(value = "")
  public SensitivePersonalDataCategoryEnum getSensitivePersonalDataCategory() {
    return sensitivePersonalDataCategory;
  }

  public void setSensitivePersonalDataCategory(SensitivePersonalDataCategoryEnum sensitivePersonalDataCategory) {
    this.sensitivePersonalDataCategory = sensitivePersonalDataCategory;
  }

  public GDPRRegisterRecordDto software(String software) {
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @ApiModelProperty(value = "")
  public String getSoftware() {
    return software;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  public GDPRRegisterRecordDto subProcessors(List<GDPRResponsibleEntity> subProcessors) {
    this.subProcessors = subProcessors;
    return this;
  }

  public GDPRRegisterRecordDto addSubProcessorsItem(GDPRResponsibleEntity subProcessorsItem) {
    if (this.subProcessors == null) {
      this.subProcessors = new ArrayList<>();
    }
    this.subProcessors.add(subProcessorsItem);
    return this;
  }

   /**
   * Get subProcessors
   * @return subProcessors
  **/
  @ApiModelProperty(value = "")
  public List<GDPRResponsibleEntity> getSubProcessors() {
    return subProcessors;
  }

  public void setSubProcessors(List<GDPRResponsibleEntity> subProcessors) {
    this.subProcessors = subProcessors;
  }

  public GDPRRegisterRecordDto tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GDPRRegisterRecordDto addTagsItem(String tagsItem) {
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

  public GDPRRegisterRecordDto technicalMeasures(List<TechnicalMeasuresEnum> technicalMeasures) {
    this.technicalMeasures = technicalMeasures;
    return this;
  }

  public GDPRRegisterRecordDto addTechnicalMeasuresItem(TechnicalMeasuresEnum technicalMeasuresItem) {
    if (this.technicalMeasures == null) {
      this.technicalMeasures = new ArrayList<>();
    }
    this.technicalMeasures.add(technicalMeasuresItem);
    return this;
  }

   /**
   * Get technicalMeasures
   * @return technicalMeasures
  **/
  @ApiModelProperty(value = "")
  public List<TechnicalMeasuresEnum> getTechnicalMeasures() {
    return technicalMeasures;
  }

  public void setTechnicalMeasures(List<TechnicalMeasuresEnum> technicalMeasures) {
    this.technicalMeasures = technicalMeasures;
  }

  public GDPRRegisterRecordDto technicalMeasuresOther(List<String> technicalMeasuresOther) {
    this.technicalMeasuresOther = technicalMeasuresOther;
    return this;
  }

  public GDPRRegisterRecordDto addTechnicalMeasuresOtherItem(String technicalMeasuresOtherItem) {
    if (this.technicalMeasuresOther == null) {
      this.technicalMeasuresOther = new ArrayList<>();
    }
    this.technicalMeasuresOther.add(technicalMeasuresOtherItem);
    return this;
  }

   /**
   * Get technicalMeasuresOther
   * @return technicalMeasuresOther
  **/
  @ApiModelProperty(value = "")
  public List<String> getTechnicalMeasuresOther() {
    return technicalMeasuresOther;
  }

  public void setTechnicalMeasuresOther(List<String> technicalMeasuresOther) {
    this.technicalMeasuresOther = technicalMeasuresOther;
  }

  public GDPRRegisterRecordDto thirdCountryTransferSafeguards(List<String> thirdCountryTransferSafeguards) {
    this.thirdCountryTransferSafeguards = thirdCountryTransferSafeguards;
    return this;
  }

  public GDPRRegisterRecordDto addThirdCountryTransferSafeguardsItem(String thirdCountryTransferSafeguardsItem) {
    if (this.thirdCountryTransferSafeguards == null) {
      this.thirdCountryTransferSafeguards = new ArrayList<>();
    }
    this.thirdCountryTransferSafeguards.add(thirdCountryTransferSafeguardsItem);
    return this;
  }

   /**
   * Get thirdCountryTransferSafeguards
   * @return thirdCountryTransferSafeguards
  **/
  @ApiModelProperty(value = "")
  public List<String> getThirdCountryTransferSafeguards() {
    return thirdCountryTransferSafeguards;
  }

  public void setThirdCountryTransferSafeguards(List<String> thirdCountryTransferSafeguards) {
    this.thirdCountryTransferSafeguards = thirdCountryTransferSafeguards;
  }

  public GDPRRegisterRecordDto thirdCountryTransfers(List<String> thirdCountryTransfers) {
    this.thirdCountryTransfers = thirdCountryTransfers;
    return this;
  }

  public GDPRRegisterRecordDto addThirdCountryTransfersItem(String thirdCountryTransfersItem) {
    if (this.thirdCountryTransfers == null) {
      this.thirdCountryTransfers = new ArrayList<>();
    }
    this.thirdCountryTransfers.add(thirdCountryTransfersItem);
    return this;
  }

   /**
   * Get thirdCountryTransfers
   * @return thirdCountryTransfers
  **/
  @ApiModelProperty(value = "")
  public List<String> getThirdCountryTransfers() {
    return thirdCountryTransfers;
  }

  public void setThirdCountryTransfers(List<String> thirdCountryTransfers) {
    this.thirdCountryTransfers = thirdCountryTransfers;
  }

  public GDPRRegisterRecordDto updated(LocalDateTime updated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRRegisterRecordDto gdPRRegisterRecordDto = (GDPRRegisterRecordDto) o;
    return Objects.equals(this.auditTrailCorrelationKey, gdPRRegisterRecordDto.auditTrailCorrelationKey) &&
        Objects.equals(this.branch, gdPRRegisterRecordDto.branch) &&
        Objects.equals(this.controller, gdPRRegisterRecordDto.controller) &&
        Objects.equals(this.controllersDescription, gdPRRegisterRecordDto.controllersDescription) &&
        Objects.equals(this.created, gdPRRegisterRecordDto.created) &&
        Objects.equals(this.dataRecipientCategories, gdPRRegisterRecordDto.dataRecipientCategories) &&
        Objects.equals(this.dataRecipientCategoriesOther, gdPRRegisterRecordDto.dataRecipientCategoriesOther) &&
        Objects.equals(this.dataSubjectCategory, gdPRRegisterRecordDto.dataSubjectCategory) &&
        Objects.equals(this.dataSubjectCategoryOther, gdPRRegisterRecordDto.dataSubjectCategoryOther) &&
        Objects.equals(this.description, gdPRRegisterRecordDto.description) &&
        Objects.equals(this.jointControllers, gdPRRegisterRecordDto.jointControllers) &&
        Objects.equals(this.notes, gdPRRegisterRecordDto.notes) &&
        Objects.equals(this.organizationRole, gdPRRegisterRecordDto.organizationRole) &&
        Objects.equals(this.personalDataCategory, gdPRRegisterRecordDto.personalDataCategory) &&
        Objects.equals(this.personalDataCategoryOther, gdPRRegisterRecordDto.personalDataCategoryOther) &&
        Objects.equals(this.personalDataFields, gdPRRegisterRecordDto.personalDataFields) &&
        Objects.equals(this.processOwner, gdPRRegisterRecordDto.processOwner) &&
        Objects.equals(this.processingActivityCode, gdPRRegisterRecordDto.processingActivityCode) &&
        Objects.equals(this.processingActivityName, gdPRRegisterRecordDto.processingActivityName) &&
        Objects.equals(this.processingLegalBasis, gdPRRegisterRecordDto.processingLegalBasis) &&
        Objects.equals(this.processor, gdPRRegisterRecordDto.processor) &&
        Objects.equals(this.purposes, gdPRRegisterRecordDto.purposes) &&
        Objects.equals(this.recipients, gdPRRegisterRecordDto.recipients) &&
        Objects.equals(this.relevantDepartment, gdPRRegisterRecordDto.relevantDepartment) &&
        Objects.equals(this.retentionMonths, gdPRRegisterRecordDto.retentionMonths) &&
        Objects.equals(this.riskDescription, gdPRRegisterRecordDto.riskDescription) &&
        Objects.equals(this.sensitivePersonalDataCategory, gdPRRegisterRecordDto.sensitivePersonalDataCategory) &&
        Objects.equals(this.software, gdPRRegisterRecordDto.software) &&
        Objects.equals(this.subProcessors, gdPRRegisterRecordDto.subProcessors) &&
        Objects.equals(this.tags, gdPRRegisterRecordDto.tags) &&
        Objects.equals(this.technicalMeasures, gdPRRegisterRecordDto.technicalMeasures) &&
        Objects.equals(this.technicalMeasuresOther, gdPRRegisterRecordDto.technicalMeasuresOther) &&
        Objects.equals(this.thirdCountryTransferSafeguards, gdPRRegisterRecordDto.thirdCountryTransferSafeguards) &&
        Objects.equals(this.thirdCountryTransfers, gdPRRegisterRecordDto.thirdCountryTransfers) &&
        Objects.equals(this.updated, gdPRRegisterRecordDto.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditTrailCorrelationKey, branch, controller, controllersDescription, created, dataRecipientCategories, dataRecipientCategoriesOther, dataSubjectCategory, dataSubjectCategoryOther, description, jointControllers, notes, organizationRole, personalDataCategory, personalDataCategoryOther, personalDataFields, processOwner, processingActivityCode, processingActivityName, processingLegalBasis, processor, purposes, recipients, relevantDepartment, retentionMonths, riskDescription, sensitivePersonalDataCategory, software, subProcessors, tags, technicalMeasures, technicalMeasuresOther, thirdCountryTransferSafeguards, thirdCountryTransfers, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRRegisterRecordDto {\n");
    
    sb.append("    auditTrailCorrelationKey: ").append(toIndentedString(auditTrailCorrelationKey)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    controllersDescription: ").append(toIndentedString(controllersDescription)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dataRecipientCategories: ").append(toIndentedString(dataRecipientCategories)).append("\n");
    sb.append("    dataRecipientCategoriesOther: ").append(toIndentedString(dataRecipientCategoriesOther)).append("\n");
    sb.append("    dataSubjectCategory: ").append(toIndentedString(dataSubjectCategory)).append("\n");
    sb.append("    dataSubjectCategoryOther: ").append(toIndentedString(dataSubjectCategoryOther)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jointControllers: ").append(toIndentedString(jointControllers)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    personalDataCategory: ").append(toIndentedString(personalDataCategory)).append("\n");
    sb.append("    personalDataCategoryOther: ").append(toIndentedString(personalDataCategoryOther)).append("\n");
    sb.append("    personalDataFields: ").append(toIndentedString(personalDataFields)).append("\n");
    sb.append("    processOwner: ").append(toIndentedString(processOwner)).append("\n");
    sb.append("    processingActivityCode: ").append(toIndentedString(processingActivityCode)).append("\n");
    sb.append("    processingActivityName: ").append(toIndentedString(processingActivityName)).append("\n");
    sb.append("    processingLegalBasis: ").append(toIndentedString(processingLegalBasis)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    purposes: ").append(toIndentedString(purposes)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    relevantDepartment: ").append(toIndentedString(relevantDepartment)).append("\n");
    sb.append("    retentionMonths: ").append(toIndentedString(retentionMonths)).append("\n");
    sb.append("    riskDescription: ").append(toIndentedString(riskDescription)).append("\n");
    sb.append("    sensitivePersonalDataCategory: ").append(toIndentedString(sensitivePersonalDataCategory)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    subProcessors: ").append(toIndentedString(subProcessors)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    technicalMeasures: ").append(toIndentedString(technicalMeasures)).append("\n");
    sb.append("    technicalMeasuresOther: ").append(toIndentedString(technicalMeasuresOther)).append("\n");
    sb.append("    thirdCountryTransferSafeguards: ").append(toIndentedString(thirdCountryTransferSafeguards)).append("\n");
    sb.append("    thirdCountryTransfers: ").append(toIndentedString(thirdCountryTransfers)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

