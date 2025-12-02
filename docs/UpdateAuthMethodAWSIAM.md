

# UpdateAuthMethodAWSIAM

updateAuthMethodAWSIAM is a command that updates a new Auth Method that will be able to authenticate using AWS IAM credentials. [Deprecated: Use auth-method-update-aws-iam command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional] |
|**allowedClientType** | **List&lt;String&gt;** |  |  [optional] |
|**auditLogsClaims** | **List&lt;String&gt;** | Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot; |  [optional] |
|**boundArn** | **List&lt;String&gt;** | A list of full arns that the access is restricted to |  [optional] |
|**boundAwsAccountId** | **List&lt;String&gt;** | A list of AWS account-IDs that the access is restricted to |  |
|**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional] |
|**boundResourceId** | **List&lt;String&gt;** | A list of full resource ids that the access is restricted to |  [optional] |
|**boundRoleId** | **List&lt;String&gt;** | A list of full role ids that the access is restricted to |  [optional] |
|**boundRoleName** | **List&lt;String&gt;** | A list of full role-name that the access is restricted to |  [optional] |
|**boundUserId** | **List&lt;String&gt;** | A list of full user ids that the access is restricted to |  [optional] |
|**boundUserName** | **List&lt;String&gt;** | A list of full user-name that the access is restricted to |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Auth Method description |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the auth method would you like to be notified. |  [optional] |
|**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional] |
|**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**jwtTtl** | **Long** | Jwt TTL |  [optional] |
|**name** | **String** | Auth Method name |  |
|**newName** | **String** | Auth Method new name |  [optional] |
|**productType** | **List&lt;String&gt;** | Choose the relevant product type for the auth method [sm, sra, pm, dp, ca] |  [optional] |
|**stsUrl** | **String** | sts URL |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uniqueIdentifier** | **String** | A unique identifier (ID) value which is a \&quot;sub claim\&quot; name that contains details uniquely identifying that resource. This \&quot;sub claim\&quot; is used to distinguish between different identities. |  [optional] |



