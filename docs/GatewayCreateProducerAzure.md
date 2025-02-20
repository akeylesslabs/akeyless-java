

# GatewayCreateProducerAzure

gatewayCreateProducerAzure is a command that creates azure dynamic secret [Deprecated: Use dynamic-secret-create-azure command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appObjId** | **String** | Azure App Object Id |  [optional] |
|**azureClientId** | **String** | Azure Client ID |  [optional] |
|**azureClientSecret** | **String** | Azure Client Secret |  [optional] |
|**azureTenantId** | **String** | Azure Tenant ID |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**fixedUserClaimKeyname** | **String** | FixedUserClaimKeyname |  [optional] |
|**fixedUserOnly** | **Boolean** | Fixed user |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic secret encryption key |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userGroupObjId** | **String** | User Group Object Id |  [optional] |
|**userPortalAccess** | **Boolean** | Azure User portal access |  [optional] |
|**userPrincipalName** | **String** | User Principal Name |  [optional] |
|**userProgrammaticAccess** | **Boolean** | Azure User programmatic access |  [optional] |
|**userRoleTemplateId** | **String** | User Role Template Id |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



