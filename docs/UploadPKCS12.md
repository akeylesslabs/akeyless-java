

# UploadPKCS12

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerFrgId** | **String** | The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment) |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**in** | **String** | PKCS#12 input file (private key and certificate only) | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | Name of key to be created | 
**passphrase** | **String** | Passphrase to unlock the pkcs#12 bundle | 
**splitLevel** | **Long** | The number of fragments that the item will be split into |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



