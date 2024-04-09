

# UpdateLdapTarget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bindDn** | **String** |  |  [optional]
**bindDnPassword** | **String** |  |  [optional]
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**ldapCaCert** | **String** |  |  [optional]
**ldapUrl** | **String** |  |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**newName** | **String** | New target name |  [optional]
**serverType** | **String** | Set Ldap server type, Options:[OpenLDAP, ActiveDirectory] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenExpiration** | **String** |  |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**updateVersion** | **Boolean** | Deprecated |  [optional]



