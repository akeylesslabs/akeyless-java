

# GatewayUpdateRemoteAccessRdpRecordings

gatewayUpdateRemoteAccessRdpRecordings is a command that update remote access rdp recording config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsStorageAccessKeyId** | **String** | AWS access key id. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html |  [optional]
**awsStorageBucketName** | **String** | The AWS bucket name. For more information refer to https://docs.aws.amazon.com/s3/ |  [optional]
**awsStorageBucketPrefix** | **String** | The folder name in S3 bucket. For more information refer to https://docs.aws.amazon.com/s3/ |  [optional]
**awsStorageRegion** | **String** | The region where the storage is located |  [optional]
**awsStorageSecretAccessKey** | **String** | AWS secret access key. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html |  [optional]
**azureStorageAccountName** | **String** | Azure account name. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-overview |  [optional]
**azureStorageClientId** | **String** | Azure client id. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs&#x3D;portal |  [optional]
**azureStorageClientSecret** | **String** | Azure client secret. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs&#x3D;portal |  [optional]
**azureStorageContainerName** | **String** | Azure container name. For more information refer to https://learn.microsoft.com/en-us/rest/api/storageservices/naming-and-referencing-containers--blobs--and-metadata |  [optional]
**azureStorageTenantId** | **String** | Azure tenant id. For more information refer to https://learn.microsoft.com/en-us/entra/fundamentals/how-to-find-tenant |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**rdpSessionRecording** | **String** | Enable recording of rdp session [true/false] |  [optional]
**rdpSessionStorage** | **String** | Rdp session recording storage destination [local/aws/azure] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



