

# CreateManagedKey

CreateManagedKey is a command that creates managed key
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | Managed Key type; options: [AES256GCM, RSA2048] | 
**managedKeyValue** | **String** | Base64-encoded managed key value |  [optional]
**metadata** | **String** | Metadata about the managed key |  [optional]
**name** | **String** | ManagedKey name | 
**protectionKey** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this managed key |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



