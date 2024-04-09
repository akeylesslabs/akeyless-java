

# RotatedSecretCreateAzure


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiId** | **String** | API ID to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional]
**apiKey** | **String** | API key to rotate (relevant only for rotator-type&#x3D;api-key) |  [optional]
**applicationId** | **String** | Id of the azure app that hold the serect to be rotated (relevant only for rotator-type&#x3D;api-key &amp; authentication-credentials&#x3D;use-target-creds) |  [optional]
**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional]
**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Rotated secret name | 
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional]
**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional]
**rotatorType** | **String** | The rotator type. options: [target/password/api-key/azure-storage-account] | 
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless Web Access Bastion |  [optional]
**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless Web Access Bastion |  [optional]
**storageAccountKeyName** | **String** | The name of the storage account key to rotate [key1/key2/kerb1/kerb2] (relevat to azure-storage-account) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | The user principal name to rotate his password (relevant only for rotator-type&#x3D;password) |  [optional]



