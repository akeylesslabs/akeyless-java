

# GenerateCsr


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** |  |  [optional]
**altNames** | **String** | The DNS Alternative Names to be included in the CSR certificate (in a comma-separated list) |  [optional]
**certificateType** | **String** | The certificateType to be included in the CSR certificate (ssl-client/ssl-server/certificate-signing) |  [optional]
**city** | **String** | The city to be included in the CSR certificate |  [optional]
**commonName** | **String** | The commonName to be included in the CSR certificate | 
**country** | **String** | The country to be included in the CSR certificate |  [optional]
**critical** | **Boolean** | Add critical to the key usage extension (will be false if not added) |  [optional]
**dep** | **String** | The department to be included in the CSR certificate |  [optional]
**description** | **String** | Description of the object |  [optional]
**emailAddresses** | **String** | The email addresses Alternative Names to be included in the CSR certificate (in a comma-separated list) |  [optional]
**generateKey** | **Boolean** | Generate a new csr key |  [optional]
**ipAddresses** | **String** | The ip addresses Alternative Names to be included in the CSR certificate (in a comma-separated list) |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | Key name in akeyless | 
**org** | **String** | The organization to be included in the CSR certificate |  [optional]
**state** | **String** | The state to be included in the CSR certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uriSans** | **String** | The URI Subject Alternative Names to be included in the CSR certificate (in a comma-separated list) |  [optional]



