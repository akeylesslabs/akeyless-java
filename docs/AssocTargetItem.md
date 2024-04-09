

# AssocTargetItem

assocTargetItem is a command that creates an association between target and item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificatePath** | **String** | A path on the target to store the certificate pem file (relevant only for certificate provisioning) |  [optional]
**chainPath** | **String** | A path on the target to store the full chain pem file (relevant only for certificate provisioning) |  [optional]
**disablePreviousKeyVersion** | **Boolean** | Automatically disable previous key version (required for azure targets) |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyOperations** | **List&lt;String&gt;** | A list of allowed operations for the key (required for azure targets) |  [optional]
**keyringName** | **String** | Keyring name of the GCP KMS (required for gcp targets) |  [optional]
**kmsAlgorithm** | **String** | Algorithm of the key in GCP KMS (required for gcp targets) |  [optional]
**locationId** | **String** | Location id of the GCP KMS (required for gcp targets) |  [optional]
**multiRegion** | **String** | Set to &#39;true&#39; to create a multi-region managed key. (Relevant only for Classic Key AWS targets) |  [optional]
**name** | **String** | The item to associate | 
**postProvisionCommand** | **String** | A custom command to run on the remote target after successful provisioning (relevant only for certificate provisioning) |  [optional]
**privateKeyPath** | **String** | A path on the target to store the private key (relevant only for certificate provisioning) |  [optional]
**projectId** | **String** | Project id of the GCP KMS (required for gcp targets) |  [optional]
**purpose** | **String** | Purpose of the key in GCP KMS (required for gcp targets) |  [optional]
**regions** | **List&lt;String&gt;** | The list of regions to create a copy of the key in (relevant for aws targets) |  [optional]
**sraAssociation** | **Boolean** | Is the target to associate is for sra, relevant only for linked target association for ldap rotated secret |  [optional]
**targetName** | **String** | The target to associate | 
**tenantSecretType** | **String** | The tenant secret type [Data/SearchIndex/Analytics] (required for salesforce targets) |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**vaultName** | **String** | Name of the vault used (required for azure targets) |  [optional]



