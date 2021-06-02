

# CreateKey

createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096] | 
**customerFrgId** | **String** | The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment) |  [optional]
**metadata** | **String** | Metadata about the key |  [optional]
**name** | **String** | Key name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**splitLevel** | **Long** | The number of fragments that the item will be split into (not includes customer fragment) |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



