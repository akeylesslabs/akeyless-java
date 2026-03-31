

# RotatedSecretCreateAws


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiId** | **String** | API ID to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional] |
|**apiKey** | **String** | API key to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional] |
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**awsRegion** | **String** | Aws Region |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**graceRotation** | **String** | Enable graceful rotation (keep both versions temporarily). When enabled, a new secret version is created while the previous version is kept for the grace period, so both versions exist for a limited time. [true/false] |  [optional] |
|**graceRotationHour** | **Integer** | The Hour of the grace rotation in UTC |  [optional] |
|**graceRotationInterval** | **String** | The number of days to wait before deleting the old key (must be bigger than rotation-interval) |  [optional] |
|**graceRotationTiming** | **String** | When to create the new version relative to the rotation date [after/before] |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockDuringSraSession** | **String** | Lock this secret for read/update while an SRA session is active |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rotateAfterDisconnect** | **String** | StringOrBool accepts JSON strings, booleans, and numbers for backward compatibility with older SDK versions that send boolean values for rotate-after-disconnect. |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional] |
|**rotatorType** | **String** | The rotator type. options: [target/api-key] |  |
|**secureAccessAwsAccountId** | **String** | The AWS account id |  [optional] |
|**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | The target name to associate |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



