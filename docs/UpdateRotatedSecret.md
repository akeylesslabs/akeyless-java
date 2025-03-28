

# UpdateRotatedSecret

updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use rotated-secret update commands]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerType** | **String** |  |  [optional] |
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**apiId** | **String** | API ID to rotate |  [optional] |
|**apiKey** | **String** | API key to rotate |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**awsRegion** | **String** | Aws Region (relevant only for aws) |  [optional] |
|**customPayload** | **String** | Secret payload to be sent with rotation request (relevant only for rotator-type&#x3D;custom) |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**gcpKey** | **String** | Base64-encoded service account private key text |  [optional] |
|**graceRotation** | **String** | Create a new access key without deleting the old key from AWS for backup (relevant only for AWS) [true/false] |  [optional] |
|**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for Secure Remote Access of ssh cert issuer, ldap rotated secret and ldap dynamic secret |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**name** | **String** | Secret name |  |
|**newMetadata** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New item name |  [optional] |
|**newVersion** | **Boolean** | Deprecated |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional] |
|**rotatedPassword** | **String** | rotated-username password |  [optional] |
|**rotatedUsername** | **String** | username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (7-365) |  [optional] |
|**rotatorCredsType** | **String** | The credentials to connect with use-self-creds/use-target-creds |  [optional] |
|**rotatorCustomCmd** | **String** | \&quot;Custom rotation command (relevant only for ssh target) |  [optional] |
|**samePassword** | **String** | Rotate same password for each host from the Linked Target (relevant only for Linked Target) |  [optional] |
|**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users (relevant only for rdp) |  [optional] |
|**secureAccessAwsAccountId** | **String** | The AWS account id (relevant only for aws) |  [optional] |
|**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessDbSchema** | **String** | The db schema (relevant only for mssql or postgresql) |  [optional] |
|**secureAccessDisableConcurrentConnections** | **Boolean** | Enable this flag to prevent simultaneous use of the same secret |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret) |  [optional] |
|**secureAccessRdpUser** | **String** | Override the RDP Domain username (relevant only for rdp) |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser viaAkeyless&#39;s Secure Remote Access (SRA) (relevant only for aws or azure) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) (relevant only for aws or azure) |  [optional] |
|**sshPassword** | **String** | Deprecated: use RotatedPassword |  [optional] |
|**sshUsername** | **String** | Deprecated: use RotatedUser |  [optional] |
|**storageAccountKeyName** | **String** | The name of the storage account key to rotate [key1/key2/kerb1/kerb2] |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userAttribute** | **String** | LDAP User Attribute, Default value \&quot;cn\&quot; |  [optional] |
|**userDn** | **String** | LDAP User Base DN |  [optional] |



