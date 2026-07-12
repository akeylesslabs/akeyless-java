

# GrokTargetDetails

GrokTargetDetails defines details related to connecting to an xAI (Grok) provider. Grok exposes an OpenAI-compatible REST API, so the agent layer reuses the OpenAI client with a custom BaseURL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** |  |  [optional] |
|**grokUrl** | **String** |  |  [optional] |
|**teamId** | **String** | TeamID is the xAI team this API key belongs to. Stored only; not sent to xAI by the gateway. |  [optional] |



