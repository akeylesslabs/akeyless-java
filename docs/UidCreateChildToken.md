

# UidCreateChildToken

uidCreateChildToken is a command that creates a new child token using Akeyless Universal Identity.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMethodName** | **String** | The universal identity auth method name, required only when uid-token is not provided |  [optional]
**childDenyInheritance** | **Boolean** | Deny from new child to create their own children |  [optional]
**childDenyRotate** | **Boolean** | Deny from new child to rotate |  [optional]
**childTtl** | **Integer** | New child token ttl |  [optional]
**comment** | **String** | New Token comment |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uidTokenId** | **String** | The ID of the uid-token, required only when uid-token is not provided |  [optional]



