

# AuthMethodCreateKerberos

authMethodCreateKerberos is a command that creates a new auth method that will be able to authenticate using Kerberos

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional] |
|**allowedClientType** | **List&lt;String&gt;** | limit the auth method usage for specific client types [cli,ui,gateway-admin,sdk,mobile,extension] |  [optional] |
|**auditLogsClaims** | **List&lt;String&gt;** | Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot; |  [optional] |
|**bindDn** | **String** |  |  [optional] |
|**bindDnPassword** | **String** |  |  [optional] |
|**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Auth Method description |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the auth method would you like to be notified. |  [optional] |
|**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional] |
|**groupAttr** | **String** |  |  [optional] |
|**groupDn** | **String** |  |  [optional] |
|**groupFilter** | **String** |  |  [optional] |
|**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**jwtTtl** | **Long** | Jwt TTL |  [optional] |
|**keytabFileData** | **String** |  |  [optional] |
|**keytabFilePath** | **String** |  |  [optional] |
|**krb5ConfData** | **String** |  |  [optional] |
|**krb5ConfPath** | **String** |  |  [optional] |
|**ldapAnonymousSearch** | **Boolean** |  |  [optional] |
|**ldapCaCert** | **String** |  |  [optional] |
|**ldapUrl** | **String** |  |  [optional] |
|**name** | **String** | Auth Method name |  |
|**productType** | **List&lt;String&gt;** | Choose the relevant product type for the auth method [sm, sra, pm, dp, ca] |  [optional] |
|**subclaimsDelimiters** | **List&lt;String&gt;** | A list of additional sub claims delimiters (relevant only for SAML, OIDC, OAuth2/JWT) |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uniqueIdentifier** | **String** | A unique identifier (ID) value which is a \&quot;sub claim\&quot; name that contains details uniquely identifying that resource. This \&quot;sub claim\&quot; is used to distinguish between different identities. |  [optional] |
|**userAttribute** | **String** |  |  [optional] |
|**userDn** | **String** |  |  [optional] |



