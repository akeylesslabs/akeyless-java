

# UpdateAWSTargetDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKey** | **String** | The aws secret access key |  [optional] |
|**accessKeyId** | **String** | The aws access key id |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**name** | **String** | Target name |  |
|**newVersion** | **Boolean** | Deprecated |  [optional] |
|**protectionKey** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**region** | **String** | The aws region |  [optional] |
|**sessionToken** | **String** | Required only for temporary security credentials retrieved via STS, otherwise it can be an empty string |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



