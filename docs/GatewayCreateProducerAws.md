

# GatewayCreateProducerAws

gatewayCreateProducerAws is a command that creates aws producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeyId** | **String** | Access Key ID | 
**accessMode** | **String** |  |  [optional]
**accessSecretKey** | **String** | Secret Access Key | 
**adminRotationIntervalDays** | **Long** | Admin credentials rotation interval (days) |  [optional]
**awsRoleArns** | **String** | AWS Role ARNs to be use in the Assume Role operation (relevant only for assume_rile mode) |  [optional]
**awsUserConsoleAccess** | **Boolean** | AWS User console access |  [optional]
**awsUserGroups** | **String** | AWS User groups |  [optional]
**awsUserPolicies** | **String** | AWS User policies |  [optional]
**awsUserProgrammaticAccess** | **Boolean** | AWS User programmatic access |  [optional]
**enableAdminRotation** | **Boolean** | Automatic admin credentials rotation |  [optional]
**gatewayUrl** | **String** | Gateway url |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**region** | **String** | Region |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



