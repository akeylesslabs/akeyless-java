

# GatewayCreateProducerMSSQL

gatewayCreateProducerMSSQL is a command that creates mssql producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**mssqlCreateStatements** | **String** | MSSQL Creation statements |  [optional]
**mssqlDbname** | **String** | MSSQL Name |  [optional]
**mssqlHost** | **String** | MSSQL Host |  [optional]
**mssqlPassword** | **String** | MSSQL Password |  [optional]
**mssqlPort** | **String** | MSSQL Port |  [optional]
**mssqlRevocationStatements** | **String** | MSSQL Revocation statements |  [optional]
**mssqlUsername** | **String** | MSSQL Username |  [optional]
**name** | **String** | Producer name | 
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



