

# CreateAuthMethodAWSIAM

createAuthMethodAWSIAM is a command that creates a new Auth Method that will be able to authenticate using AWS IAM credentials.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**boundArn** | **List&lt;String&gt;** | A list of full arns that the access is restricted to |  [optional]
**boundAwsAccountId** | **List&lt;String&gt;** | A list of AWS account-IDs that the access is restricted to | 
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional]
**boundResourceId** | **List&lt;String&gt;** | A list of full resource ids that the access is restricted to |  [optional]
**boundRoleId** | **List&lt;String&gt;** | A list of full role ids that the access is restricted to |  [optional]
**boundRoleName** | **List&lt;String&gt;** | A list of full role-name that the access is restricted to |  [optional]
**boundUserId** | **List&lt;String&gt;** | A list of full user ids that the access is restricted to |  [optional]
**boundUserName** | **List&lt;String&gt;** | A list of full user-name that the access is restricted to |  [optional]
**description** | **String** | Auth Method description |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**jwtTtl** | **Long** | Jwt TTL |  [optional]
**name** | **String** | Auth Method name | 
**stsUrl** | **String** | sts URL |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



