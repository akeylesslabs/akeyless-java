

# GatewayUpdateProducerCassandra

gatewayUpdateProducerCassandra is a command that updates a Cassandra producer [Deprecated: Use dynamic-secret-update-cassandra command]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cassandraCreationStatements** | **String** | Cassandra creation statements |  [optional]
**cassandraHosts** | **String** | Cassandra hosts IP or addresses, comma separated |  [optional]
**cassandraPassword** | **String** | Cassandra superuser password |  [optional]
**cassandraPort** | **String** | Cassandra port |  [optional]
**cassandraUsername** | **String** | Cassandra superuser username |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret name |  [optional]
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional]
**sslCertificate** | **String** | SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



