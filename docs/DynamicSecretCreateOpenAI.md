

# DynamicSecretCreateOpenAI

dynamicSecretCreateOpenAI is a command that creates OpenAI dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**projectId** | **String** | Project ID |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Name of existing target to use in producer creation |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



