

# AiModelEntry

AiModelEntry is a single configured AI model: which Akeyless target holds the credentials, which LLM to call on it, and what part it plays in policy evaluation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** |  |  [optional] |
|**provider** | **String** | Provider is display-only: it carries the provider label the model catalog reported for Model (meaningful for Bedrock, which fronts several providers) so the console can render its Provider column without re-fetching the whole catalog per row. Never used for credential resolution or validation - the target type is the authority there. |  [optional] |
|**role** | **String** | A gateway has exactly one AiModelRoleDefault entry whenever any entry exists: it serves AI Insight, ISI, and the standard policy decisions in Secretless AI / ARA. AiModelRoleQuorum entries are consulted alongside the default to double-check policy decisions before a risky action is allowed. |  [optional] |
|**targetId** | **Long** | TargetId uses the repo-wide spelling (see types.Target.TargetId and AiInsightsConfigPart.TargetId) rather than the Go-idiomatic TargetID. |  [optional] |
|**targetName** | **String** |  |  [optional] |
|**targetType** | **String** | TargetType is display-only, captured at write time like Provider. The console shows it as a read-only column; resolving it per row from the targets list instead would mean an extra lookup that can disagree with what the entry was created against. |  [optional] |



