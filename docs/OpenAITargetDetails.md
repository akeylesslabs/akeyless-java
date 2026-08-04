

# OpenAITargetDetails

OpenAITargetDetails defines details related to connecting to an OpenAI provider

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** |  |  [optional] |
|**apiKeyId** | **String** |  |  [optional] |
|**authMode** | **String** | AuthMode selects how this target authenticates. Empty (default) uses ApiKey as a static bearer token against BaseURL, matching all pre-existing behavior. OpenAIAuthModeChatGPTOAuth instead uses the OAuth* fields below. |  [optional] |
|**oauthAccessToken** | **String** | OAuthAccessToken is the current ChatGPT-issued access token (the &#x60;tokens.access_token&#x60; field of the customer&#39;s local auth.json). Akeyless refreshes this automatically; do not treat it as long-lived. |  [optional] |
|**oauthAccountId** | **String** | OAuthAccountID is the ChatGPT workspace/account id (&#x60;tokens.account_id&#x60; in auth.json), required on every request to the ChatGPT backend. |  [optional] |
|**oauthLastRefresh** | **String** | OAuthLastRefresh is the RFC3339 timestamp of the last successful Akeyless-performed refresh; used as a fallback expiry heuristic when the access token&#39;s JWT exp claim can&#39;t be parsed. |  [optional] |
|**oauthRefreshToken** | **String** | OAuthRefreshToken mints new access tokens. It rotates on every refresh - Akeyless persists the new value after each successful refresh, so the previous value becomes invalid. |  [optional] |
|**openaiUrl** | **String** |  |  [optional] |
|**organizationId** | **String** |  |  [optional] |
|**projectId** | **String** |  |  [optional] |



