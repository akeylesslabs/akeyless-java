

# DynamicSecretCreateMongoDb

dynamicSecretCreateMongoDb is a command that creates either mongodb  dynamic secret or mongodb atlas dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**mongodbAtlasApiPrivateKey** | **String** | MongoDB Atlas private key |  [optional] |
|**mongodbAtlasApiPublicKey** | **String** | MongoDB Atlas public key |  [optional] |
|**mongodbAtlasProjectId** | **String** | MongoDB Atlas project ID |  [optional] |
|**mongodbCustomData** | **String** | MongoDB custom data |  [optional] |
|**mongodbDefaultAuthDb** | **String** | MongoDB server default authentication database |  [optional] |
|**mongodbHostPort** | **String** | MongoDB server host and port |  [optional] |
|**mongodbName** | **String** | MongoDB Name |  [optional] |
|**mongodbPassword** | **String** | MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters |  [optional] |
|**mongodbRoles** | **String** | MongoDB Roles |  [optional] |
|**mongodbServerUri** | **String** | MongoDB server URI |  [optional] |
|**mongodbUriOptions** | **String** | MongoDB server URI options |  [optional] |
|**mongodbUsername** | **String** | MongoDB server username |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Encrypt producer with following key |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



