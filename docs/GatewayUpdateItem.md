

# GatewayUpdateItem

gatewayUpdateItem is a command that updates classic key
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**apiId** | **String** |  |  [optional]
**apiKey** | **String** |  |  [optional]
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation |  [optional]
**customPayload** | **String** |  |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**description** | **String** | Description of the object |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** |  |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Item name | 
**newMetadata** | **String** | Deprecated - use description |  [optional]
**newName** | **String** | New item name |  [optional]
**newVersion** | **Boolean** | Deprecated |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**rotatedPassword** | **String** |  |  [optional]
**rotatedUsername** | **String** |  |  [optional]
**rotationHour** | **Integer** | The Rotation Hour |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional]
**rotatorCredsType** | **String** | The rotation credentials type |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | Item type | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



