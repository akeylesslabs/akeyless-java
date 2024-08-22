

# AuthMethodCreateAzureAD

authMethodCreateAzureAD is a command that creates a new auth method that will be able to authenticate using Azure Active Directory credentials.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**audience** | **String** | Deprecated (Deprecated) The audience in the JWT |  [optional]
**auditLogsClaims** | **List&lt;String&gt;** | Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot; |  [optional]
**boundGroupId** | **List&lt;String&gt;** | A list of group ids that the access is restricted to |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional]
**boundProviders** | **List&lt;String&gt;** | A list of resource providers that the access is restricted to (e.g, Microsoft.Compute, Microsoft.ManagedIdentity, etc) |  [optional]
**boundResourceId** | **List&lt;String&gt;** | A list of full resource ids that the access is restricted to |  [optional]
**boundResourceNames** | **List&lt;String&gt;** | A list of resource names that the access is restricted to (e.g, a virtual machine name, scale set name, etc). |  [optional]
**boundResourceTypes** | **List&lt;String&gt;** | A list of resource types that the access is restricted to (e.g, virtualMachines, userAssignedIdentities, etc) |  [optional]
**boundRgId** | **List&lt;String&gt;** | A list of resource groups that the access is restricted to |  [optional]
**boundSpid** | **List&lt;String&gt;** | A list of service principal IDs that the access is restricted to |  [optional]
**boundSubId** | **List&lt;String&gt;** | A list of subscription ids that the access is restricted to |  [optional]
**boundTenantId** | **String** | The Azure tenant id that the access is restricted to | 
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Auth Method description |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional]
**issuer** | **String** | Issuer URL |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**jwksUri** | **String** | The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. |  [optional]
**jwtTtl** | **Long** | Jwt TTL |  [optional]
**name** | **String** | Auth Method name | 
**productType** | **List&lt;String&gt;** | Choose the relevant product type for the auth method [sm, sra, pm, dp, ca] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uniqueIdentifier** | **String** | A unique identifier (ID) value which is a \&quot;sub claim\&quot; name that contains details uniquely identifying that resource. This \&quot;sub claim\&quot; is used to distinguish between different identities. |  [optional]



