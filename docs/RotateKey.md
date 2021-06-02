

# RotateKey

rotateKey is a command that rotates an existing key, creating a new version. [Deprecated: Use command update-rotation-settings] of it.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation |  [optional]
**name** | **String** | Key name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (7-365) |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



