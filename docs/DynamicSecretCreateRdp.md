

# DynamicSecretCreateRdp

dynamicSecretCreateRdp is a command that creates rdp dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowUserExtendSession** | **Long** | AllowUserExtendSession |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**fixedUserOnly** | **String** | Allow access using externally (IdP) provided username [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**rdpAdminName** | **String** | RDP Admin Name |  [optional]
**rdpAdminPwd** | **String** | RDP Admin password |  [optional]
**rdpHostName** | **String** | Hostname |  [optional]
**rdpHostPort** | **String** | Port |  [optional]
**rdpUserGroups** | **String** | Groups |  [optional]
**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional]
**secureAccessRdGatewayServer** | **String** | RD Gateway server |  [optional]
**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user |  [optional]
**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**warnUserBeforeExpiration** | **Long** | WarnBeforeUserExpiration |  [optional]



