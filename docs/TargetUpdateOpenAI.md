

# TargetUpdateOpenAI

targetUpdateOpenAI is a command that updates an existing openai target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** | API key for OpenAI |  [optional] |
|**apiKeyId** | **String** | API key ID |  [optional] |
|**codexOauthAccessToken** | **String** | Codex OAuth access token (auth.json tokens.access_token), used when codex-oauth-mode&#x3D;chatgpt_oauth |  [optional] |
|**codexOauthAccountId** | **String** | Codex OAuth account id (auth.json tokens.account_id), used when codex-oauth-mode&#x3D;chatgpt_oauth |  [optional] |
|**codexOauthMode** | **String** | Auth mode: empty (default, static api-key) or chatgpt_oauth |  [optional] |
|**codexOauthRefreshToken** | **String** | Codex OAuth refresh token (auth.json tokens.refresh_token), used when codex-oauth-mode&#x3D;chatgpt_oauth |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**model** | **String** | Default model to use with OpenAI |  [optional] |
|**name** | **String** | Target name |  |
|**newComment** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New target name |  [optional] |
|**openaiUrl** | **String** | Base URL of the OpenAI API |  [optional] |
|**organizationId** | **String** | Organization ID |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



