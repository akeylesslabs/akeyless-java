

# GetCertificateValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certIssuerName** | **String** | The parent PKI Certificate Issuer&#39;s name of the certificate, required when used with display-id and token |  [optional]
**certificateFileOutput** | **String** | File to write the certificates to. |  [optional]
**displayId** | **String** | Certificate display ID |  [optional]
**ignoreCache** | **String** | Retrieve the Secret value without checking the Gateway&#39;s cache [true/false]. This flag is only relevant when using the RestAPI |  [optional]
**issuanceToken** | **String** | Token for getting the issued certificate |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Certificate name | 
**privateKeyFileOutput** | **String** | File to write the private key to. |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**version** | **Integer** | Certificate version |  [optional]



