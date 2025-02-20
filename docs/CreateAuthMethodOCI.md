

# CreateAuthMethodOCI

createAuthMethodOCI is a command that Creates a new Oracle Auth Method that will be used in the account using OCI principle and groups. [Deprecated: Use auth-method-create-oci command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional] |
|**auditLogsClaims** | **List&lt;String&gt;** | Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot; |  [optional] |
|**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Auth Method description |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the auth method would you like to be notified. |  [optional] |
|**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional] |
|**groupOcid** | **List&lt;String&gt;** | A list of required groups ocids |  |
|**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**jwtTtl** | **Long** | Jwt TTL |  [optional] |
|**name** | **String** | Auth Method name |  |
|**productType** | **List&lt;String&gt;** | Choose the relevant product type for the auth method [sm, sra, pm, dp, ca] |  [optional] |
|**tenantOcid** | **String** | The Oracle Cloud tenant ID |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



