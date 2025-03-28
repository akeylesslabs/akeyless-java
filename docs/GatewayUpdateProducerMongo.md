

# GatewayUpdateProducerMongo

gatewayUpdateProducerMongo is a command that updates either mongodb  producer or mongodb atlas producer [Deprecated: Use dynamic-secret-update-mongodb command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
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
|**newName** | **String** | Dynamic secret name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Encrypt producer with following key |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



