

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
|**graceRotation** | **String** | Create a new access key without deleting the old key from AWS/Azure/GCP for backup (relevant only for AWS/Azure/GCP) [true/false] |  [optional] |
|**graceRotationHour** | **Integer** | The Hour of the grace rotation in UTC |  [optional] |
|**graceRotationInterval** | **String** | The number of days to wait before deleting the old key (must be bigger than rotation-interval) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional] |
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
|**targetName** | **String** | Target name |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



