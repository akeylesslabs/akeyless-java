

# DynamicSecretCreateGithub

dynamicSecretCreateGithub is a command that creates github dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**githubAppId** | **Long** | Github app id |  [optional] |
|**githubAppPrivateKey** | **String** | App private key |  [optional] |
|**githubBaseUrl** | **String** | Base URL |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) Mirrors commands.AgenticRulesParams — kept separate because ResourceDS cannot embed it (different package, different struct layout). |  [optional] |
|**installationId** | **Long** | GitHub application installation id |  [optional] |
|**installationOrganization** | **String** | Optional, mutually exclusive with installation id, GitHub organization name |  [optional] |
|**installationRepository** | **String** | Optional, mutually exclusive with installation id, GitHub repository &#39;&lt;owner&gt;/&lt;repo-name&gt;&#39; |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**tokenPermissions** | **List&lt;String&gt;** | Optional - installation token&#39;s allowed permissions |  [optional] |
|**tokenRepositories** | **List&lt;String&gt;** | Optional - installation token&#39;s allowed repositories |  [optional] |
|**tokenTtl** | **String** | Token TTL |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



