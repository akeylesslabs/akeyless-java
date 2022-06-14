

# AssocTargetItem

assocTargetItem is a command that creates an association between target and item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyOperations** | **List&lt;String&gt;** | A list of allowed operations for the key (required for azure targets) |  [optional]
**keyringName** | **String** | Keyring name of the GCP KMS (required for gcp targets) |  [optional]
**kmsAlgorithm** | **String** | Algorithm of the key in GCP KMS (required for gcp targets) |  [optional]
**locationId** | **String** | Location id of the GCP KMS (required for gcp targets) |  [optional]
**name** | **String** | The item to associate | 
**projectId** | **String** | Project id of the GCP KMS (required for gcp targets) |  [optional]
**purpose** | **String** | Purpose of the key in GCP KMS (required for gcp targets) |  [optional]
**targetName** | **String** | The target to associate | 
**tenantSecretType** | **String** | The tenant secret type [Data/SearchIndex/Analytics] (required for salesforce targets) |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**vaultName** | **String** | Name of the vault used (required for azure targets) |  [optional]



