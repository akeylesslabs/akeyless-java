

# DynamicSecretCreateGitlab

dynamicSecretCreateGitlab is a command that creates gitlab dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**gitlabAccessToken** | **String** | Gitlab access token |  [optional] |
|**gitlabAccessType** | **String** | Gitlab access token type [project,group] |  |
|**gitlabCertificate** | **String** | Gitlab tls certificate (base64 encoded) |  [optional] |
|**gitlabRole** | **String** | Gitlab role |  [optional] |
|**gitlabTokenScopes** | **String** | Comma-separated list of access token scopes to grant |  |
|**gitlabUrl** | **String** | Gitlab base url |  [optional] |
|**groupName** | **String** | Gitlab group name, required for access-type&#x3D;group |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) Mirrors commands.AgenticRulesParams — kept separate because ResourceDS cannot embed it (different package, different struct layout). |  [optional] |
|**installationOrganization** | **String** | Gitlab project name, required for access-type&#x3D;project |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**ttl** | **String** | Access Token TTL |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



