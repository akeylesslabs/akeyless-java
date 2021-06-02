

# UploadPKCS12

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cert** | **String** | Path to a file that contain the certificate in a PEM format. If this parameter is not empty, the certificate will be taken from here and not from the PKCS#12 input file |  [optional]
**customerFrgId** | **String** | The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment) |  [optional]
**in** | **String** | PKCS#12 input file (private key and certificate only) | 
**metadata** | **String** | A metadata about the key |  [optional]
**name** | **String** | Name of key to be created | 
**passphrase** | **String** | Passphrase to unlock the pkcs#12 bundle | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**splitLevel** | **Long** | The number of fragments that the item will be split into |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



