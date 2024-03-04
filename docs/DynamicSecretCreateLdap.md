

# DynamicSecretCreateLdap

dynamicSecretCreateLdap is a command that creates ldap dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bindDn** | **String** | Bind DN |  [optional]
**bindDnPassword** | **String** | Bind DN Password |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**externalUsername** | **String** | Externally provided username [true/false] |  [optional]
**groupDn** | **String** | Group DN which the temporary user should be added |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**ldapCaCert** | **String** | CA Certificate File Content |  [optional]
**ldapUrl** | **String** | LDAP Server URL |  [optional]
**name** | **String** | Dynamic secret name | 
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenExpiration** | **String** | Token expiration |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userAttribute** | **String** | User Attribute |  [optional]
**userDn** | **String** | User DN |  [optional]
**userTtl** | **String** | User TTL |  [optional]



