

# GatewayCreateProducerCassandra

gatewayCreateProducerCassandra is a command that creates a Cassandra producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cassandraCreationStatements** | **String** | Cassandra creation statements |  [optional]
**cassandraHosts** | **String** | Cassandra hosts IP or addresses, comma separated |  [optional]
**cassandraPassword** | **String** | Cassandra superuser password |  [optional]
**cassandraPort** | **String** | Cassandra port |  [optional]
**cassandraUsername** | **String** | Cassandra superuser username |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



