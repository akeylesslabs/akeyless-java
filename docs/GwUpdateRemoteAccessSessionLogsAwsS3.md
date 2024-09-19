

# GwUpdateRemoteAccessSessionLogsAwsS3

gwUpdateRemoteAccessSessionLogsAwsS3 is a command that updates session log forwarding config (aws-s3 target)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | AWS access id relevant for access_key auth-type |  [optional]
**accessKey** | **String** | AWS access key relevant for access_key auth-type |  [optional]
**authType** | **String** | AWS auth type [access_key/cloud_id/assume_role] |  [optional]
**bucketName** | **String** | AWS S3 bucket name |  [optional]
**enable** | **String** | Enable Log Forwarding [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**logFolder** | **String** | AWS S3 destination folder for logs |  [optional]
**outputFormat** | **String** | Logs format [text/json] |  [optional]
**pullInterval** | **String** | Pull interval in seconds |  [optional]
**region** | **String** | AWS region |  [optional]
**roleArn** | **String** | AWS role arn relevant for assume_role auth-type |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



