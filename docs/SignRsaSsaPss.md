

# SignRsaSsaPss

signRsaSsaPss is a command that calculates the signature of a given message using rsassa-pss

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayId** | **String** | The display id of the RSA key to use in the signing process |  [optional]
**hashFunction** | **String** | HashFunction defines the hash function (e.g. sha-256) |  [optional]
**itemId** | **Long** | The item id of the RSA key to use in the signing process |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyName** | **String** | The name of the RSA key to use in the signing process |  [optional]
**message** | **String** | The input message to sign in a base64 format | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



