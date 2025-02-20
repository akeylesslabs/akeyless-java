

# SignPKCS1

signPKCS1 is a command that calculates the signature of hashed data using RSASSA-PKCS1-V1_5-SIGN from RSA PKCS#1 v1.5.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayId** | **String** | The display id of the key to use in the signing process |  [optional] |
|**hashFunction** | **String** | HashFunction defines the hash function (e.g. sha-256) |  [optional] |
|**inputFormat** | **String** | Select default assumed format for the plaintext message. Currently supported options: [base64] |  [optional] |
|**itemId** | **Long** | The item id of the key to use in the signing process |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyName** | **String** | The name of the RSA key to use in the signing process |  [optional] |
|**message** | **String** | The message to be signed |  |
|**prehashed** | **Boolean** | Markes that the message is already hashed |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**version** | **Integer** | The version of the key to use for signing |  [optional] |



