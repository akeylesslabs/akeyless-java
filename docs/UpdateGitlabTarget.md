

# UpdateGitlabTarget

updateGitlabTarget is a command that updates an existing target. [Deprecated: Use target-update-gitlab command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**gitlabAccessToken** | **String** | Gitlab access token |  [optional] |
|**gitlabCertificate** | **String** | Gitlab tls certificate (base64 encoded) |  [optional] |
|**gitlabUrl** | **String** | Gitlab base url |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**newName** | **String** | New target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**updateVersion** | **Boolean** | Deprecated |  [optional] |



