

# CreateAuthMethodSAML

createAuthMethodSAML is a command that creates a new auth method that will be available to authenticate using SAML.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**allowedRedirectUri** | **List&lt;String&gt;** | Allowed redirect URIs after the authentication |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional]
**description** | **String** | Auth Method description |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional]
**idpMetadataUrl** | **String** | IDP metadata url |  [optional]
**idpMetadataXmlData** | **String** | IDP metadata xml data |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**jwtTtl** | **Long** | Jwt TTL |  [optional]
**name** | **String** | Auth Method name | 
**subclaimsDelimiters** | **List&lt;String&gt;** | A list of additional sub claims delimiters (relevant only for SAML, OIDC, OAuth2/JWT) |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uniqueIdentifier** | **String** | A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization. | 



