

# UpdateRotatedSecret

updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**apiId** | **String** |  |  [optional]
**apiKey** | **String** |  |  [optional]
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation |  [optional]
**awsRegion** | **String** | Region (used in aws) |  [optional]
**customPayload** | **String** |  |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** |  |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Secret name | 
**newMetadata** | **String** | New item metadata |  [optional]
**newName** | **String** | New item name |  [optional]
**newVersion** | **Boolean** | Deprecated |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**rotatedPassword** | **String** |  |  [optional]
**rotatedUsername** | **String** |  |  [optional]
**rotationHour** | **Integer** |  |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (7-365) |  [optional]
**rotatorCredsType** | **String** |  |  [optional]
**rotatorCustomCmd** | **String** |  |  [optional]
**secureAccessAllowExternalUser** | **Boolean** | Secure Access Allow Providing External User (used in ssh) |  [optional]
**secureAccessAwsAccountId** | **String** | Secure Access Account Id (used in aws) |  [optional]
**secureAccessAwsNativeCli** | **Boolean** | Secure Access Aws Native Cli (used in aws) |  [optional]
**secureAccessBastionIssuer** | **String** | Secure Access Bastion Issuer |  [optional]
**secureAccessDbName** | **String** | Secure Access DB Name (used in data bases) |  [optional]
**secureAccessDbSchema** | **String** | Secure Access Schema (used in mssql, postgresql) |  [optional]
**secureAccessEnable** | **String** | Secure Access Enabled |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Secure Access Host |  [optional]
**secureAccessRdpDomain** | **String** | Secure Access Domain (used in ssh) |  [optional]
**secureAccessRdpUser** | **String** | Secure Access Override User (used in ssh) |  [optional]
**secureAccessWeb** | **Boolean** | Secure Access Web |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure Access Isolated (used in aws, azure) |  [optional]
**secureAccessWebProxy** | **Boolean** | Secure Access Web Proxy (used in aws, azure) |  [optional]
**sshPassword** | **String** | Deprecated: use RotatedPassword |  [optional]
**sshUsername** | **String** | Deprecated: use RotatedUser |  [optional]
**storageAccountKeyName** | **String** | The name of the storage account key to rotate [key1/key2/kerb1/kerb2] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



