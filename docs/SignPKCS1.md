

# SignPKCS1

signPKCS1 is a command that calculates the signature of hashed data using RSASSA-PKCS1-V1_5-SIGN from RSA PKCS#1 v1.5.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyName** | **String** | The name of the RSA key to use in the signing process | 
**message** | **String** | The message to be signed | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



