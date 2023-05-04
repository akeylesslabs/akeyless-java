

# OIDCAccessRules

OIDCAccessRules contains access rules specific to Open Id Connect authentication method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedRedirectURIs** | **List&lt;String&gt;** | Allowed redirect URIs after the authentication |  [optional]
**audience** | **String** | Audience claim to be used as part of the authentication flow. In case set, it must match the one configured on the Identity Provider&#39;s Application |  [optional]
**boundClaims** | [**List&lt;OIDCCustomClaim&gt;**](OIDCCustomClaim.md) | The claims that login is restricted to. |  [optional]
**clientId** | **String** | Client ID |  [optional]
**clientSecret** | **String** | Client Secret |  [optional]
**isInternal** | **Boolean** | IsInternal indicates whether this is an internal Auth Method where the client has no control over it, or it was created by the client e.g - Sign In with Google will create an OIDC Auth Method with IsInternal&#x3D;true |  [optional]
**issuer** | **String** | Issuer URL |  [optional]
**requiredScopes** | **List&lt;String&gt;** | A list of required scopes to request from the oidc provider, and to check on the token |  [optional]
**requiredScopesPrefix** | **String** | A prefix to add to the required scopes (for example, azures&#39; Application ID URI) |  [optional]
**uniqueIdentifier** | **String** | A unique identifier to distinguish different users |  [optional]



