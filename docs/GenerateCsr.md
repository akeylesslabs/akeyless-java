

# GenerateCsr


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alg** | **String** |  |  [optional] |
|**altNames** | **String** | A comma-separated list of dns alternative names |  [optional] |
|**certificateType** | **String** | The certificate type to be included in the CSR certificate (ssl-client/ssl-server/certificate-signing) |  [optional] |
|**city** | **String** | The city to be included in the CSR certificate |  [optional] |
|**commonName** | **String** | The common name to be included in the CSR certificate |  |
|**country** | **String** | The country to be included in the CSR certificate |  [optional] |
|**critical** | **Boolean** | Add critical to the key usage extension (will be false if not added) |  [optional] |
|**dep** | **String** | The department to be included in the CSR certificate |  [optional] |
|**emailAddresses** | **String** | A comma-separated list of email addresses alternative names |  [optional] |
|**exportPrivateKey** | **Boolean** | The flag to indicate if the private key should be exported |  [optional] |
|**generateKey** | **Boolean** | Generate a new classic key for the csr |  [optional] |
|**ipAddresses** | **String** | A comma-separated list of ip addresses alternative names |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyType** | **String** | The type of the key to generate (classic-key/dfc) |  |
|**name** | **String** | The key name |  |
|**org** | **String** | The organization to be included in the CSR certificate |  [optional] |
|**splitLevel** | **Long** | The number of fragments that the item will be split into (not includes customer fragment) |  [optional] |
|**state** | **String** | The state to be included in the CSR certificate |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uriSans** | **String** | A comma-separated list of uri alternative names |  [optional] |



