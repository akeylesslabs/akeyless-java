

# GatewayCreateProducerAws

gatewayCreateProducerAws is a command that creates aws producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessMode** | **String** |  |  [optional]
**adminRotationIntervalDays** | **Long** | Admin credentials rotation interval (days) |  [optional]
**awsAccessKeyId** | **String** | Access Key ID |  [optional]
**awsAccessSecretKey** | **String** | Secret Access Key |  [optional]
**awsRoleArns** | **String** | AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode) |  [optional]
**awsUserConsoleAccess** | **Boolean** | AWS User console access |  [optional]
**awsUserGroups** | **String** | AWS User groups |  [optional]
**awsUserPolicies** | **String** | AWS User policies |  [optional]
**awsUserProgrammaticAccess** | **Boolean** | AWS User programmatic access |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**enableAdminRotation** | **Boolean** | Automatic admin credentials rotation |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**region** | **String** | Region |  [optional]
**secureAccessAwsAccountId** | **String** |  |  [optional]
**secureAccessAwsNativeCli** | **Boolean** |  |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessWeb** | **Boolean** |  |  [optional]
**secureAccessWebBrowsing** | **Boolean** |  |  [optional]
**secureAccessWebProxy** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



