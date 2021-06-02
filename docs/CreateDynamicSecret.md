

# CreateDynamicSecret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The name of a key that used to encrypt the dynamic secret values (if empty, the account default protectionKey key will be used) |  [optional]
**metadata** | **String** | Metadata about the dynamic secret |  [optional]
**name** | **String** | Dynamic secret name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



