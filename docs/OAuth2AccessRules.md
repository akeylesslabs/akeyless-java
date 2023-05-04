

# OAuth2AccessRules

OAuth2AccessRules contains access rules specific to OAuth2 authentication method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience** | **String** | The audience in the JWT. |  [optional]
**boundClaims** | [**List&lt;OAuth2CustomClaim&gt;**](OAuth2CustomClaim.md) | The claims that login is restricted to. |  [optional]
**boundClientsId** | **List&lt;String&gt;** | The clients ids that login is restricted to. |  [optional]
**issuer** | **String** | Issuer URL |  [optional]
**jwksJsonData** | **String** | The JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. base64 encoded string |  [optional]
**jwksUri** | **String** | The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. |  [optional]
**uniqueIdentifier** | **String** | A unique identifier to distinguish different users |  [optional]



