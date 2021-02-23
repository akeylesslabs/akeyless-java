

# Auth

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | Access ID |  [optional]
**accessKey** | **String** | Access key (relevant only for access-type&#x3D;access_key) |  [optional]
**accessType** | **String** | Access Type (access_key/password/saml/ldap/azure_ad/aws_iam/universal_identity/jwt) |  [optional]
**adminEmail** | **String** | Email (relevant only for access-type&#x3D;password) |  [optional]
**adminPassword** | **String** | Password (relevant only for access-type&#x3D;password) |  [optional]
**cloudId** | **String** | The cloud identity (relevant only for access-type&#x3D;azure_ad,aws_iam) |  [optional]
**jwt** | **String** | The Json Web Token (relevant only for access-type&#x3D;jwt/oidc) |  [optional]
**ldapPassword** | **String** | LDAP password (relevant only for access-type&#x3D;ldap) |  [optional]
**ldapUsername** | **String** | LDAP username (relevant only for access-type&#x3D;ldap) |  [optional]
**uidToken** | **String** | The universal_identity token (relevant only for access-type&#x3D;universal_identity) |  [optional]



