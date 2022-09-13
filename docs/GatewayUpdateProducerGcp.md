

# GatewayUpdateProducerGcp

gatewayUpdateProducerGcp is a command that updates a GCP producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**gcpCredType** | **String** |  |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**gcpKeyAlgo** | **String** | Service account key algorithm, e.g. KEY_ALG_RSA_1024 |  [optional]
**gcpSaEmail** | **String** | GCP service account email |  [optional]
**gcpTokenScopes** | **String** | Access token scopes list, e.g. scope1,scope2 |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



