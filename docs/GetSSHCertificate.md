

# GetSSHCertificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certIssuerName** | **String** | The name of the SSH certificate issuer | 
**certUsername** | **String** | The username to sign in the SSH certificate | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**publicKeyData** | **String** | SSH public key file contents. If this option is used, the certificate will be printed to stdout |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



