

# CreateRotatedSecret

createRotatedSecret is a command that creates a rotated secret [Deprecated: Use rotated-secret-create commands]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerType** | **String** |  |  [optional]
**apiId** | **String** | API ID to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional]
**apiKey** | **String** | API key to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional]
**applicationId** | **String** | ApplicationId (used in azure) |  [optional]
**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional]
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional]
**awsRegion** | **String** | Aws Region (relevant only for aws) |  [optional]
**customPayload** | **String** | Secret payload to be sent with rotation request (relevant only for rotator-type&#x3D;custom) |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**gcpServiceAccountEmail** | **String** | The email of the gcp service account to rotate |  [optional]
**gcpServiceAccountKeyId** | **String** | The key id of the gcp service account to rotate |  [optional]
**graceRotation** | **String** | Create a new access key without deleting the old key from AWS for backup (relevant only for AWS) [true/false] |  [optional]
**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for Secure Remote Access of ssh cert issuer, ldap rotated secret and ldap dynamic secret |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | Secret name | 
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional]
**rotatedPassword** | **String** | rotated-username password (relevant only for rotator-type&#x3D;password) |  [optional]
**rotatedUsername** | **String** | username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;password) |  [optional]
**rotationHour** | **Integer** | The Hour of the rotation in UTC. Default rotation-hour is 14:00 |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional]
**rotatorCredsType** | **String** |  |  [optional]
**rotatorCustomCmd** | **String** | Custom rotation command (relevant only for ssh target) |  [optional]
**rotatorType** | **String** | Rotator Type | 
**samePassword** | **String** | Rotate same password for each host from the Linked Target (relevant only for Linked Target) |  [optional]
**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users (relevant only for rdp) |  [optional]
**secureAccessAwsAccountId** | **String** | The AWS account id (relevant only for aws) |  [optional]
**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional]
**secureAccessDbSchema** | **String** | The db schema (relevant only for mssql or postgresql) |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional]
**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret) |  [optional]
**secureAccessRdpUser** | **String** | Override the RDP Domain username (relevant only for rdp) |  [optional]
**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless Web Access Bastion (relevant only for aws or azure) |  [optional]
**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless Web Access Bastion (relevant only for aws or azure) |  [optional]
**sshPassword** | **String** | Deprecated: use RotatedPassword |  [optional]
**sshUsername** | **String** | Deprecated: use RotatedUser |  [optional]
**storageAccountKeyName** | **String** | The name of the storage account key to rotate [key1/key2/kerb1/kerb2] (relevat to azure-storage-account) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**target** | **List&lt;String&gt;** | A list of linked targets to be associated, Relevant only for Secure Remote Access for ssh cert issuer, ldap rotated secret and ldap dynamic secret, To specify multiple targets use argument multiple times |  [optional]
**targetName** | **String** | Target name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userAttribute** | **String** | LDAP User Attribute, Default value \&quot;cn\&quot; |  [optional]
**userDn** | **String** | LDAP User Base DN |  [optional]



