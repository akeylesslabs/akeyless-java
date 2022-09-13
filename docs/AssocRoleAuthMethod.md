

# AssocRoleAuthMethod

assocRoleAuthMethod is a command that creates an association between role and auth method.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amName** | **String** | The auth method to associate | 
**caseSensitive** | **String** |  |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**roleName** | **String** | The role to associate | 
**subClaims** | **Map&lt;String, String&gt;** | key/val of sub claims, e.g group&#x3D;admins,developers |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



