

# GatewayUpdateProducerPostgreSQL

gatewayUpdateProducerPostgreSQL is a command that updates postgresql producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationStatements** | **String** | PostgreSQL Creation statements |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**postgresqlDbName** | **String** | PostgreSQL DB Name |  [optional]
**postgresqlHost** | **String** | PostgreSQL Host |  [optional]
**postgresqlPassword** | **String** | PostgreSQL Password |  [optional]
**postgresqlPort** | **String** | PostgreSQL Port |  [optional]
**postgresqlUsername** | **String** | PostgreSQL Username |  [optional]
**producerEncryptionKey** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessDbSchema** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessWeb** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



