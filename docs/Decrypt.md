

# Decrypt

decrypt is a command that decrypts ciphertext into plaintext by using an AES key.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ciphertext** | **String** | Ciphertext to be decrypted in base64 encoded format | 
**displayId** | **String** | The display id of the key to use in the decryption process |  [optional]
**encryptionContext** | **Map&lt;String, String&gt;** | The encryption context. If this was specified in the encrypt command, it must be specified here or the decryption operation will fail |  [optional]
**keyName** | **String** | The name of the key to use in the decryption process |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



