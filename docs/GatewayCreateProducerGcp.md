

# GatewayCreateProducerGcp

gatewayCreateProducerGcp is a command that creates a GCP producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gatewayUrl** | **String** | Gateway url |  [optional]
**gcpCredType** | **String** |  | 
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**gcpKeyAlgo** | **String** | Service account key algorithm, e.g. KEY_ALG_RSA_1024 |  [optional]
**gcpSaEmail** | **String** | GCP service account email | 
**gcpTokenScopes** | **String** | Access token scopes list, e.g. scope1,scope2 |  [optional]
**name** | **String** | Producer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



