

# UpdateSSHTargetDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** |  |  [optional]
**name** | **String** | Target name | 
**newVersion** | **Boolean** | Whether to create a new version of not |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**port** | **String** |  |  [optional]
**privateKey** | **String** |  |  [optional]
**privateKeyPassword** | **String** |  |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**sshPassword** | **String** |  |  [optional]
**sshUsername** | **String** |  |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



