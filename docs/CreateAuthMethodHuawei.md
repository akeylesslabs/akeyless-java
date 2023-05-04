

# CreateAuthMethodHuawei

createAuthMethodHuawei is a command that creates a new auth method that will be able to authenticate using Huawei credentials.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**authUrl** | **String** | sts URL |  [optional]
**boundDomainId** | **List&lt;String&gt;** | A list of domain IDs that the access is restricted to |  [optional]
**boundDomainName** | **List&lt;String&gt;** | A list of domain names that the access is restricted to |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional]
**boundTenantId** | **List&lt;String&gt;** | A list of full tenant ids that the access is restricted to |  [optional]
**boundTenantName** | **List&lt;String&gt;** | A list of full tenant names that the access is restricted to |  [optional]
**boundUserId** | **List&lt;String&gt;** | A list of full user ids that the access is restricted to |  [optional]
**boundUserName** | **List&lt;String&gt;** | A list of full user-name that the access is restricted to |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**jwtTtl** | **Long** | Jwt TTL |  [optional]
**name** | **String** | Auth Method name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



