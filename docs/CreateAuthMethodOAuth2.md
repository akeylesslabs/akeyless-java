

# CreateAuthMethodOAuth2

createAuthMethodOAuth2 is a command that creates a new auth method that will be able to authenticate using OpenID/Oauth2.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**audience** | **String** | The audience in the JWT |  [optional]
**boundClientIds** | **List&lt;String&gt;** | The clients ids that the access is restricted to |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist of the IPs that the access is restricted to |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**issuer** | **String** | Issuer URL |  [optional]
**jwksUri** | **String** | The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. | 
**name** | **String** | Auth Method name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uniqueIdentifier** | **String** | A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization. | 
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



