

# VerifyPKCS1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayId** | **String** | The display id of the key to use in the verification process |  [optional] |
|**hashFunction** | **String** | HashFunction defines the hash function (e.g. sha-256) |  [optional] |
|**inputFormat** | **String** | Select default assumed format for the plaintext message. Currently supported options: [base64] |  [optional] |
|**itemId** | **Long** | The item id of the key to use in the verification process |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyName** | **String** | The name of the RSA key to use in the verification process |  |
|**message** | **String** | The message to be verified |  |
|**prehashed** | **Boolean** | Markes that the message is already hashed |  [optional] |
|**signature** | **String** | The message&#39;s signature |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**version** | **Integer** | The version of the key to use for verification |  [optional] |



