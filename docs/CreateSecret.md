

# CreateSecret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | **String** | Metadata about the secret |  [optional]
**multilineValue** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]
**value** | **String** | The secret value | 



