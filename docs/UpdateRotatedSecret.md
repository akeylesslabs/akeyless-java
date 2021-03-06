

# UpdateRotatedSecret

updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**apiId** | **String** |  |  [optional]
**apiKey** | **String** |  |  [optional]
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Secret name | 
**newMetadata** | **String** | New item metadata |  [optional]
**newName** | **String** | New item name |  [optional]
**newVersion** | **Boolean** | Whether to create a new version of not |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**rotationHour** | **Integer** |  |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (7-365) |  [optional]
**rotatorCredsType** | **String** |  |  [optional]
**sshPassword** | **String** |  |  [optional]
**sshUsername** | **String** |  |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



