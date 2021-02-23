

# UpdateSecretVal

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**multiline** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**newVersion** | **Boolean** | Whether to create a new version of not |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**value** | **String** | The new secret value | 



