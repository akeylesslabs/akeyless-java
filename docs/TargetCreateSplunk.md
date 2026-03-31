

# TargetCreateSplunk

targetCreateSplunk is a command that creates a new splunk target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** | Splunk token audience (required when using token authentication for rotation) |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**password** | **String** | Splunk Password (used when authenticating with username/password) |  [optional] |
|**splunkToken** | **String** | Splunk Token (used when authenticating with token) |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**tokenOwner** | **String** | Splunk Token Owner (required when using token authentication for rotation) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**url** | **String** | Splunk server URL |  |
|**useTls** | **Boolean** | Use TLS certificate verification when connecting to the Splunk management API |  [optional] |
|**username** | **String** | Splunk Username (used when authenticating with username/password) |  [optional] |



