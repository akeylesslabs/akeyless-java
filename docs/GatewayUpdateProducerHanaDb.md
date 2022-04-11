

# GatewayUpdateProducerHanaDb

gatewayUpdateProducerHanaDb is a command that updates mssql producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hanaDbname** | **String** | HanaDb Name |  [optional]
**hanadbCreateStatements** | **String** | HanaDb Creation statements |  [optional]
**hanadbHost** | **String** | HanaDb Host |  [optional]
**hanadbPassword** | **String** | HanaDb Password |  [optional]
**hanadbPort** | **String** | HanaDb Port |  [optional]
**hanadbRevocationStatements** | **String** | HanaDb Revocation statements |  [optional]
**hanadbUsername** | **String** | HanaDb Username |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
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



