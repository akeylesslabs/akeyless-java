

# EncryptFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptionContext** | **Map&lt;String, String&gt;** | name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail |  [optional]
**in** | **String** | Path to the file to be encrypted. If not provided, the content will be taken from stdin | 
**keyName** | **String** | The name of the key to use in the encryption process | 
**out** | **String** | Path to the output file. If not provided, the output will be sent to stdout |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



