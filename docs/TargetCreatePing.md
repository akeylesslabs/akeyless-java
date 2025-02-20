

# TargetCreatePing

targetCreatePing is a command that creates a new ping target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**administrativePort** | **String** | Ping Federate administrative port |  [optional] |
|**authorizationPort** | **String** | Ping Federate authorization port |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**password** | **String** | Ping Federate privileged user password |  [optional] |
|**pingUrl** | **String** | Ping URL |  [optional] |
|**privilegedUser** | **String** | Ping Federate privileged user |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



