

# GatewayCreateAllowedAccess

gatewayCreateAllowedAccess is a command that creates allowed access in Gator

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subClaimsCaseInsensitive** | **Boolean** |  |  [optional]
**accessId** | **String** | Access ID The access id to be attached to this allowed access. Auth method with this access id should already exist. | 
**caseSensitive** | **String** | Treat sub claims as case-sensitive [true/false] |  [optional]
**description** | **String** | Allowed access description |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Allowed access name | 
**permissions** | **String** | Permissions  Comma-seperated list of permissions for this allowed access. Available permissions: [defaults,targets,classic_keys,automatic_migration,ldap_auth,dynamic_secret,k8s_auth,log_forwarding,zero_knowledge_encryption,rotated_secret,caching,event_forwarding,admin,kmip,general] |  [optional]
**subClaims** | **Map&lt;String, String&gt;** | Sub claims key/val of sub claims, e.g group&#x3D;admins,developers |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



