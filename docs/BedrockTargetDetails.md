

# BedrockTargetDetails

BedrockTargetDetails defines details related to connecting to an Amazon Bedrock provider. Connectivity checks and model-listing reuse the OpenAI-compat-style `/openai/v1` and control-plane endpoints, but chat/ tool-calling generation uses the native Converse API instead of the OpenAI client (see go/src/ai_agents/bedrock/client.go), since Converse supports the full Bedrock model catalog.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** |  |  [optional] |
|**bedrockUrl** | **String** |  |  [optional] |



