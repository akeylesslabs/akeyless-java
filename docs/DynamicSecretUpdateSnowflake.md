

# DynamicSecretUpdateSnowflake

GatewayUpdateProducerSnowflakeCmd is a command that updates a Snowflake dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **String** | Account name |  [optional] |
|**accountPassword** | **String** | Database Password |  [optional] |
|**accountUsername** | **String** | Database Username |  [optional] |
|**authMode** | **String** | The authentication mode for the temporary user [password/key] |  [optional] |
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**dbName** | **String** | Database name |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyAlgo** | **String** |  |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**privateKey** | **String** | RSA Private key (base64 encoded) |  [optional] |
|**privateKeyPassphrase** | **String** | The Private key passphrase |  [optional] |
|**role** | **String** | User role |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |
|**warehouse** | **String** | Warehouse name |  [optional] |



