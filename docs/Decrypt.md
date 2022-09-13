

# Decrypt

decrypt is a command that decrypts ciphertext into plaintext by using an AES key.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ciphertext** | **String** | Ciphertext to be decrypted in base64 encoded format |  [optional]
**displayId** | **String** | The display id of the key to use in the decryption process |  [optional]
**encryptionContext** | **Map&lt;String, String&gt;** | The encryption context. If this was specified in the encrypt command, it must be specified here or the decryption operation will fail |  [optional]
**itemId** | **Long** | The item id of the key to use in the decryption process |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyName** | **String** | The name of the key to use in the decryption process | 
**outputFormat** | **String** | If specified, the output will be formatted accordingly. options: [base64] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



