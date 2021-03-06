
# AlertRuleRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actorIds** | **List&lt;String&gt;** |  |  [optional]
**actualValue** | **Double** |  |  [optional]
**affectedHosts** | **List&lt;String&gt;** |  |  [optional]
**alertRuleId** | [**UUID**](UUID.md) |  |  [optional]
**alertRuleName** | **String** |  |  [optional]
**alertType** | [**AlertTypeEnum**](#AlertTypeEnum) |  |  [optional]
**applicationName** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**details** | **String** |  |  [optional]
**entryIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**executionDuration** | **Long** |  |  [optional]
**fired** | **Boolean** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**ioc** | **List&lt;String&gt;** |  |  [optional]
**iocTypes** | **List&lt;String&gt;** |  |  [optional]
**notified** | **Boolean** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**resolutionTime** | **Long** |  |  [optional]
**riskLevel** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**threshold** | **Double** |  |  [optional]
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) |  |  [optional]
**triageStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="AlertTypeEnum"></a>
## Enum: AlertTypeEnum
Name | Value
---- | -----
STATISTICAL | &quot;STATISTICAL&quot;
CORRELATION | &quot;CORRELATION&quot;
ANOMALY | &quot;ANOMALY&quot;
LOG_LEVEL_BASED | &quot;LOG_LEVEL_BASED&quot;
THREAT_INTEL_MATCH | &quot;THREAT_INTEL_MATCH&quot;
HEALTHCHECK | &quot;HEALTHCHECK&quot;
WEBSITE_STATIC_RESOURCE_CHANGE | &quot;WEBSITE_STATIC_RESOURCE_CHANGE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW_ALERT | &quot;NEW_ALERT&quot;
IN_TRIAGE | &quot;IN_TRIAGE&quot;
CONFIRMED | &quot;CONFIRMED&quot;
RESOLVED | &quot;RESOLVED&quot;
DISMISSED | &quot;DISMISSED&quot;


<a name="ThresholdTypeEnum"></a>
## Enum: ThresholdTypeEnum
Name | Value
---- | -----
ABOVE | &quot;ABOVE&quot;
BELOW | &quot;BELOW&quot;
BOTH | &quot;BOTH&quot;



