

# UpdateAuthMethodAWSIAM

updateAuthMethodAWSIAM is a command that updates a new Auth Method that will be able to authenticate using AWS IAM credentials.
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
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**name** | **String** | Auth Method name | 
**newName** | **String** | Auth Method new name |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**stsUrl** | **String** | sts URL |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



