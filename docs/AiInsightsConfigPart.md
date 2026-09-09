

# AiInsightsConfigPart

TargetId/TargetName/Model predate multi-model support and are retained for backward compatibility in both directions - they mirror the Default entry on write, and are adopted as a synthesized Default entry on read when Models is empty. See EffectiveModels and syncLegacyFields in types_ai_insights_config.go, where all the model-list behavior lives.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enable** | **Boolean** |  |  [optional] |
|**model** | **String** |  |  [optional] |
|**models** | [**List&lt;AiModelEntry&gt;**](AiModelEntry.md) | Models holds every configured model, in whatever order and with whatever Default flag was stored - it is NOT canonicalized on write, so nothing may assume the Default sits at index 0. Empty on configs written before multi-model support. Never read it directly: use EffectiveModels for the list as stored (which also handles the legacy case), or PolicyModels for exactly one Default in row 1 followed by the Quorum models. |  [optional] |
|**targetId** | **Long** |  |  [optional] |
|**targetName** | **String** |  |  [optional] |
|**version** | **Long** | Version is an optimistic-concurrency token, bumped by gator on every accepted write.  Every mutation of this part is a read-modify-write across the network (the gateway reads the whole part, edits one entry, writes it back), and the write replaces the part wholesale. Without a token, two admins adding a quorum model at the same time silently lose one of the two - which, since the list must always carry exactly one Default, can also change which model serves every other AI feature.  Zero means \&quot;unversioned\&quot;: a client that predates this field, whose write gator accepts rather than rejecting outright. See updateGatewayAiInsightsConfig. |  [optional] |



