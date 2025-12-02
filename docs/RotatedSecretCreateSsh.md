

# RotatedSecretCreateSsh


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**keyDataBase64** | **String** | Private key file contents encoded using base64 |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**publicKeyRemotePath** | **String** | The path to the public key that will be rotated on the server |  [optional] |
|**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional] |
|**rotatedPassword** | **String** | rotated-username password (relevant only for rotator-type&#x3D;password) |  [optional] |
|**rotatedUsername** | **String** | username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;password) |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional] |
|**rotatorCustomCmd** | **String** | Custom rotation command |  [optional] |
|**rotatorType** | **String** | The rotator type. options: [target/password] |  |
|**samePassword** | **String** | Rotate same password for each host from the Linked Target (relevant only for Linked Target) |  [optional] |
|**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdpDomain** | **String** | Default domain name server. i.e. microsoft.com |  [optional] |
|**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional] |
|**secureAccessSshUser** | **String** | Override the SSH username as indicated in SSH Certificate Issuer |  [optional] |
|**secureAccessTargetType** | **String** | Specify target type. Options are ssh or rdp |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



