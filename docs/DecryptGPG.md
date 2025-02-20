

# DecryptGPG


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciphertext** | **String** | Ciphertext to be decrypted |  |
|**displayId** | **String** | The display id of the key to use in the decryption process |  [optional] |
|**inputFormat** | **String** | Select default assumed format for the ciphertext. Currently supported options: [base64,raw] |  [optional] |
|**itemId** | **Long** | The item id of the key to use in the decryption process |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyName** | **String** | The name of the key to use in the decryption process |  |
|**outputFormat** | **String** | If specified, the output will be formatted accordingly. options: [base64] |  [optional] |
|**passphrase** | **String** | Passphrase that was used to generate the key |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



