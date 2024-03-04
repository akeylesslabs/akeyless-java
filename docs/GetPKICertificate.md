

# GetPKICertificate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altNames** | **String** | The Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any DNS.* names are taken from it) |  [optional]
**certIssuerName** | **String** | The name of the PKI certificate issuer | 
**commonName** | **String** | The common name to be included in the PKI certificate (if CSR is supplied this flag is ignored and the CSR subject CN is taken) |  [optional]
**csrDataBase64** | **String** | Certificate Signing Request contents encoded in base64 to generate the certificate with |  [optional]
**extendedKeyUsage** | **String** | A comma-separated list of extended key usage requests which will be used for certificate issuance. Supported values: &#39;clientauth&#39;, &#39;serverauth&#39;. |  [optional]
**extraExtensions** | **String** | A json string that defines the requested extra extensions for the certificate |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyDataBase64** | **String** | PKI key file contents. If this option is used, the certificate will be printed to stdout |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uriSans** | **String** | The URI Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any URI.* names are taken from it) |  [optional]



