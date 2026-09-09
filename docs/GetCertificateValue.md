

# GetCertificateValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certIssuerName** | **String** | The parent PKI Certificate Issuer&#39;s name of the certificate, required when used with display-id and token |  [optional] |
|**displayId** | **String** | Certificate display ID |  [optional] |
|**format** | **String** | Format to download the certificate in [pem/pfx/jks], pfx/jks require a password |  [optional] |
|**ignoreCache** | **String** | Retrieve the Secret value without checking the Gateway&#39;s cache [true/false]. This flag is only relevant when using the RestAPI |  [optional] |
|**includePrivateKey** | **Boolean** | If set, includes the private key in the pfx/jks file, only relevant when format is pfx or jks |  [optional] |
|**issuanceToken** | **String** | Token for getting the issued certificate |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**leafOnly** | **Boolean** | If set, downloads only the leaf certificate instead of the full chain, only available for certificates issued with split certificate chain enabled |  [optional] |
|**name** | **String** | Certificate name |  [optional] |
|**password** | **String** | Password to protect the pfx/jks file, required when format is pfx or jks |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**version** | **Integer** | Certificate version |  [optional] |



