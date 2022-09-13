

# Encrypt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayId** | **String** | The display id of the key to use in the encryption process |  [optional]
**encryptionContext** | **Map&lt;String, String&gt;** | name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail |  [optional]
**inputFormat** | **String** | If specified, the plaintext input is assumed to be formatted accordingly. Current supported options: [base64] |  [optional]
**itemId** | **Long** | The item id of the key to use in the encryption process |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyName** | **String** | The name of the key to use in the encryption process | 
**plaintext** | **String** | Data to be encrypted |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



