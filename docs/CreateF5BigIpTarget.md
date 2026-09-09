

# CreateF5BigIpTarget

createF5BigIpTarget is a command that creates a new f5-big-ip target. [Deprecated: Use target-create-f5-big-ip command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**password** | **String** |  |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**url** | **String** | F5 BIG-IP target URL |  |
|**username** | **String** | F5 username with permission to manage certificate |  |



