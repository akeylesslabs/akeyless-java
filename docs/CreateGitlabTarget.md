

# CreateGitlabTarget

createGitlabTarget is a command that creates a new target. [Deprecated: Use target-create-gitlab command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**gitlabAccessToken** | **String** | Gitlab access token |  [optional] |
|**gitlabCertificate** | **String** | Gitlab tls certificate (base64 encoded) |  [optional] |
|**gitlabUrl** | **String** | Gitlab base url |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



