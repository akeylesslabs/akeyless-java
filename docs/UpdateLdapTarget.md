

# UpdateLdapTarget

updateLdapTarget is a command that updates an existing target. [Deprecated: Use target-update-ldap command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindDn** | **String** | Bind DN |  |
|**bindDnPassword** | **String** | Bind DN Password |  |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**ldapCaCert** | **String** | CA Certificate File Content |  [optional] |
|**ldapUrl** | **String** | LDAP Server URL |  |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**newName** | **String** | New target name |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**serverType** | **String** | Set Ldap server type, Options:[OpenLDAP, ActiveDirectory] |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**tokenExpiration** | **String** | Token expiration |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**updateVersion** | **Boolean** | Deprecated |  [optional] |
|**username** | **String** | Username returned for Rotated Secrets. Use the format required by your application, such as sAMAccountName, with or without the domain. |  [optional] |



