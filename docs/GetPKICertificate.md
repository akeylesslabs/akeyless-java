

# GetPKICertificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altNames** | **String** | The Subject Alternative Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]
**certIssuerName** | **String** | The name of the PKI certificate issuer | 
**commonName** | **String** | The common name to be included in the PKI certificate |  [optional]
**keyDataBase64** | **String** | PKI key file contents. If this option is used, the certificate will be printed to stdout |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uriSans** | **String** | The URI Subject Alternative Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]



