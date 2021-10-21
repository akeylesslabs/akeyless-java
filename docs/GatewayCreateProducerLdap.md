

# GatewayCreateProducerLdap

gatewayCreateProducerLdap is a command that creates ldap producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | Access ID |  [optional]
**bindDn** | **String** | Bind DN |  [optional]
**bindDnPassword** | **String** | Bind DN Password |  [optional]
**enableAnonymSearch** | **Boolean** | EnableAnonymousSearch |  [optional]
**fixedUserOnly** | **String** | Fixed user |  [optional]
**groupAttribute** | **String** | Group attribute |  [optional]
**groupDn** | **String** | Group DN |  [optional]
**groupFilter** | **String** | Group attribute |  [optional]
**ldapCaCert** | **String** | CA Certificate File Content |  [optional]
**ldapUrl** | **String** | LDAP Server URL |  [optional]
**name** | **String** | Producer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**privateKey** | **String** | Base64-encoded ldap private key text |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenExpiration** | **String** | Token expiration |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userAttribute** | **String** | User Attribute |  [optional]
**userDn** | **String** | User DN |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



