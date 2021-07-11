

# UpdateRabbitMQTarget

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Comment about the target |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Target name | 
**newName** | **String** | New target name |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**rabbitmqServerPassword** | **String** |  |  [optional]
**rabbitmqServerUri** | **String** |  |  [optional]
**rabbitmqServerUser** | **String** |  |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**updateVersion** | **Boolean** | Create new version for the target |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



