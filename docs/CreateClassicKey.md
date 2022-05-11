

# CreateClassicKey

CreateClassicKey is a command that creates classic key
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | Classic Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096, EC256, EC384] | 
**certFileData** | **String** | Certificate in a PEM format. |  [optional]
**keyData** | **String** | Base64-encoded classic key value |  [optional]
**keyOperations** | **List&lt;String&gt;** | A list of allowed operations for the key (required for azure targets) |  [optional]
**keyringName** | **String** | Keyring name of the GCP KMS (required for gcp targets) |  [optional]
**kmsAlgorithm** | **String** | Algorithm of the key in GCP KMS (required for gcp targets) |  [optional]
**locationId** | **String** | Location id of the GCP KMS (required for gcp targets) |  [optional]
**metadata** | **String** | Metadata about the classic key |  [optional]
**name** | **String** | ClassicKey name | 
**projectId** | **String** | Project id of the GCP KMS (required for gcp targets) |  [optional]
**protectionKeyName** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**purpose** | **String** | Purpose of the key in GCP KMS (required for gcp targets) |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this classic key |  [optional]
**targetName** | **String** | Target name |  [optional]
**tenantSecretType** | **String** | The tenant secret type [Data/SearchIndex/Analytics] (required for salesforce targets) |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**vaultName** | **String** | Name of the vault used (required for azure targets) |  [optional]



