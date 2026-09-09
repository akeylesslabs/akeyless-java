

# TargetCreateOpenAI

targetCreateOpenAI is a command that creates a new openai target

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
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**model** | **String** | Default model to use with OpenAI |  [optional] |
|**name** | **String** | Target name |  |
|**openaiUrl** | **String** | Base URL of the OpenAI API |  [optional] |
|**organizationId** | **String** | Organization ID |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



