

# AssocTargetItem

assocTargetItem is a command that creates an association between target and item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindSslProfiles** | **List&lt;String&gt;** | Bind the provisioned certificate to an existing client-ssl/server-ssl profile, in the format &lt;type&gt;:&lt;partition&gt;:&lt;name&gt; (relevant only for F5 BIG-IP certificate provisioning). Leave the partition empty to use the certificate&#39;s partition. For a profile in a folder, add the folder to the partition, for example client-ssl:Common/Shared:my-profile. Repeat the parameter to bind several profiles. |  [optional] |
|**certificateArn** | **String** | The ARN of an existing imported ACM certificate to re-import into, which replaces its certificate and key; if empty, a new ACM certificate is created on every provisioning, including after renewal (relevant only for AWS certificate provisioning) |  [optional] |
|**certificateFormat** | **String** | The format the certificate will be provisioned with, available options: pem,pfx (relevant only for certificate provisioning) |  [optional] |
|**certificateName** | **String** | The name of the certificate object in the cloud provider (relevant only for AWS, Azure, and GCP certificate provisioning) |  [optional] |
|**certificatePath** | **String** | A path on the target to store the certificate pem file (relevant only for certificate provisioning) |  [optional] |
|**chainPath** | **String** | A path on the target to store the full chain pem file (relevant only for certificate provisioning) |  [optional] |
|**disablePreviousKeyVersion** | **Boolean** | Automatically disable previous key version (required for azure targets) |  [optional] |
|**externalKeyName** | **String** | The external key name to associate with the classic key (Relevant only for Classic Key AWS/Azure/GCP targets) |  [optional] |
|**f5SaveConfig** | **Boolean** | Save the F5 running configuration after each successful provisioning, so the certificate survives a reboot. This also saves any other unsaved change on the device (relevant only for F5 BIG-IP certificate provisioning) |  [optional] |
|**f5SyncDeviceGroup** | **String** | Sync the F5 configuration to this device group after each successful provisioning, so the HA peer serves the same certificate. This overwrites unsynced changes on the other members of the group. Implies f5-save-config (relevant only for F5 BIG-IP certificate provisioning) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyOperations** | **List&lt;String&gt;** | A list of allowed operations for the key (required for azure targets) |  [optional] |
|**keyVault** | **String** | The Azure Key Vault name to provision the certificate to (relevant only for Azure certificate provisioning) |  [optional] |
|**keyringName** | **String** | Keyring name of the GCP KMS (required for gcp targets) |  [optional] |
|**kmsAlgorithm** | **String** | Algorithm of the key in GCP KMS (required for gcp targets) |  [optional] |
|**locationId** | **String** | Location id of the GCP KMS (required for gcp targets) |  [optional] |
|**locationScope** | **String** | The GCP Certificate Manager location to provision the certificate to: global or a region such as us-central1 (relevant only for GCP certificate provisioning) |  [optional] |
|**multiRegion** | **String** | Set to &#39;true&#39; to create a multi-region managed key. (Relevant only for Classic Key AWS targets) |  [optional] |
|**name** | **String** | The item to associate |  |
|**pfxPassword** | **String** | Password used to protect the provisioned PFX file. Required when --certificate-format&#x3D;pfx (relevant only for certificate provisioning) |  [optional] |
|**postProvisionCommand** | **String** | A custom command to run on the remote target after successful provisioning (relevant only for SSH and Windows certificate provisioning, not supported for F5 BIG-IP) |  [optional] |
|**privateKeyPath** | **String** | A path on the target to store the private key (relevant only for certificate provisioning) |  [optional] |
|**projectId** | **String** | Project id of the GCP KMS (required for gcp targets) |  [optional] |
|**protectionLevel** | **String** | Protection level of the key [software/hardware] (relevant for gcp targets) |  [optional] |
|**purpose** | **String** | Purpose of the key in GCP KMS (required for gcp targets) |  [optional] |
|**regions** | **List&lt;String&gt;** | The list of regions to create a copy of the key in (relevant for aws targets) |  [optional] |
|**sraAssociation** | **Boolean** | Is the target to associate is for sra, relevant only for linked target association for ldap rotated secret |  [optional] |
|**targetName** | **String** | The target to associate |  |
|**tenantSecretType** | **String** | The tenant secret type [Data/SearchIndex/Analytics] (required for salesforce targets) |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**vaultName** | **String** | Name of the vault used (required for azure targets) |  [optional] |



