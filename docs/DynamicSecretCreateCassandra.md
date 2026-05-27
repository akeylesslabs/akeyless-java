

# DynamicSecretCreateCassandra

dynamicSecretCreateCassandra is a command that creates a Cassandra dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cassandraCreationStatements** | **String** | Cassandra creation statements |  [optional] |
|**cassandraHosts** | **String** | Cassandra hosts IP or addresses, comma separated |  [optional] |
|**cassandraPassword** | **String** | Cassandra superuser password |  [optional] |
|**cassandraPort** | **String** | Cassandra port |  [optional] |
|**cassandraUsername** | **String** | Cassandra superuser username |  [optional] |
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) Mirrors commands.AgenticRulesParams — kept separate because ResourceDS cannot embed it (different package, different struct layout). |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional] |
|**sslCertificate** | **String** | SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useCapitalLetters** | **String** | Specifies whether the generated temporary password must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). [true/false] |  [optional] |
|**useLowerLetters** | **String** | Specifies whether the generated temporary password must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). [true/false] |  [optional] |
|**useNumbers** | **String** | Specifies whether the generated temporary password must contain at least one numeric character (0 to 9). [true/false] |  [optional] |
|**useSpecialCharacters** | **String** |  |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



