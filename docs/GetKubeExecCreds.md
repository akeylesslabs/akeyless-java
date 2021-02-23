

# GetKubeExecCreds

getKubeExecCreds is a command that gets credentials for authentication with Kubernetes cluster based on a PKI cert issuer.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altNames** | **String** | The Subject Alternative Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]
**certIssuerName** | **String** | The name of the PKI certificate issuer | 
**commonName** | **String** | The common name to be included in the PKI certificate |  [optional]
**keyFilePath** | **String** | The client public or private key file path (in case of a private key, it will be use to extract the public key) | 
**outfile** | **String** | Output file path with the certificate. If not provided, the file with the certificate will be created in the same location of the provided public key with the -cert extension |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uriSans** | **String** | The URI Subject Alternative Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]



