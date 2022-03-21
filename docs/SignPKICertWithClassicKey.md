

# SignPKICertWithClassicKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commonName** | **String** | The common name to be included in the PKI certificate |  [optional]
**country** | **String** | A comma-separated list of the country that will be set in the issued certificate |  [optional]
**displayId** | **String** | The name of the key to use in the sign PKI Cert process | 
**dnsNames** | **String** | DNS Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]
**keyUsage** | **String** | key-usage |  [optional]
**locality** | **String** | A comma-separated list of the locality that will be set in the issued certificate |  [optional]
**organizationalUnits** | **String** | A comma-separated list of organizational units (OU) that will be set in the issued certificate |  [optional]
**organizations** | **String** | A comma-separated list of organizations (O) that will be set in the issued certificate |  [optional]
**postalCode** | **String** | A comma-separated list of the postal code that will be set in the issued certificate |  [optional]
**province** | **String** | A comma-separated list of the province that will be set in the issued certificate |  [optional]
**publicKeyPemData** | **String** | PublicKey using for signing in a PEM format. |  [optional]
**signingMethod** | **String** | SigningMethod | 
**streetAddress** | **String** | A comma-separated list of the street address that will be set in the issued certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | he requested Time To Live for the certificate, in seconds | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uriSans** | **String** | The URI Subject Alternative Names to be included in the PKI certificate (in a comma-delimited list) |  [optional]
**version** | **Integer** | classic key version | 



