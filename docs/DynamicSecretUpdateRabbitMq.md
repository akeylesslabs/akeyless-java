

# DynamicSecretUpdateRabbitMq

dynamicSecretUpdateRabbitMq is a command that updates rabbitmq dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**rabbitmqAdminPwd** | **String** | RabbitMQ Admin password |  [optional] |
|**rabbitmqAdminUser** | **String** | RabbitMQ Admin User |  [optional] |
|**rabbitmqServerUri** | **String** | Server URI |  [optional] |
|**rabbitmqUserConfPermission** | **String** | User configuration permission |  [optional] |
|**rabbitmqUserReadPermission** | **String** | User read permission |  [optional] |
|**rabbitmqUserTags** | **String** | User Tags |  [optional] |
|**rabbitmqUserVhost** | **String** | User Virtual Host |  [optional] |
|**rabbitmqUserWritePermission** | **String** | User write permission |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



