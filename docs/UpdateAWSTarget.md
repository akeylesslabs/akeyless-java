

# UpdateAWSTarget

updateAWSTarget is a command that updates a new target. [Deprecated: Use target-update-aws command]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKey** | **String** | AWS secret access key | 
**accessKeyId** | **String** | AWS access key ID | 
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**newName** | **String** | New target name |  [optional]
**region** | **String** | AWS region |  [optional]
**sessionToken** | **String** | Required only for temporary security credentials retrieved using STS |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**updateVersion** | **Boolean** | Deprecated |  [optional]
**useGwCloudIdentity** | **Boolean** | Use the GW&#39;s Cloud IAM |  [optional]



