

# UploadRSA

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | Key type. options: [RSA1024, RSA2048, RSA3072, RSA4096] | 
**certFileData** | **String** | Certificate in a PEM format. |  [optional]
**customerFrgId** | **String** | The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment) |  [optional]
**metadata** | **String** | A metadata about the key |  [optional]
**name** | **String** | Name of key to be created | 
**rsaFileData** | **String** | RSA private key data, base64 encoded |  [optional]
**splitLevel** | **Long** | The number of fragments that the item will be split into |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



