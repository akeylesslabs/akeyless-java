

# DynamicSecretUpdateGitlab

dynamicSecretUpdateGitlab is a command that updates gitlab dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**gitlabAccessToken** | **String** | Gitlab access token |  [optional]
**gitlabAccessType** | **String** | Gitlab access token type [project,group] | 
**gitlabCertificate** | **String** | Gitlab tls certificate (base64 encoded) |  [optional]
**gitlabRole** | **String** | Gitlab role |  [optional]
**gitlabTokenScopes** | **String** | Comma-separated list of access token scopes to grant | 
**gitlabUrl** | **String** | Gitlab base url |  [optional]
**groupName** | **String** | Gitlab group name, required for access-type&#x3D;group |  [optional]
**installationOrganization** | **String** | Gitlab project name, required for access-type&#x3D;project |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret new name |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **String** | Access Token TTL |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



