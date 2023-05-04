

# UpdateSSHTargetDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | The ssh host name |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**name** | **String** | Target name | 
**newVersion** | **Boolean** | Deprecated |  [optional]
**port** | **String** | ssh port |  [optional]
**privateKey** | **String** | ssh private key |  [optional]
**privateKeyPassword** | **String** | The ssh private key password |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**sshPassword** | **String** | ssh pawssword to rotate |  [optional]
**sshUsername** | **String** | ssh username |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



