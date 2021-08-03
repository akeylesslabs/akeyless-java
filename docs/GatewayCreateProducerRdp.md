

# GatewayCreateProducerRdp

gatewayCreateProducerRdp is a command that creates rdp producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixedUserOnly** | **String** | Fixed user |  [optional]
**name** | **String** | Producer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**rdpAdminName** | **String** | RDP Admin Name | 
**rdpAdminPwd** | **String** | RDP Admin password | 
**rdpHostName** | **String** | Hostname |  [optional]
**rdpHostPort** | **String** | Port |  [optional]
**rdpUserGroups** | **String** | Groups |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessRdpDomain** | **String** |  |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



