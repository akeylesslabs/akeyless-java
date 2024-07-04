

# TargetCreateLdap

targetCreateLdap is a command that creates a new ldap target

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bindDn** | **String** | Bind DN | 
**bindDnPassword** | **String** | Bind DN Password | 
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**ldapCaCert** | **String** | CA Certificate File Content |  [optional]
**ldapUrl** | **String** | LDAP Server URL | 
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**serverType** | **String** | Set Ldap server type, Options:[OpenLDAP, ActiveDirectory]. Default is OpenLDAP |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenExpiration** | **String** | Token expiration |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



