

# GatewayCreateProducerRedshift

gatewayCreateProducerRedshift is a command that creates redshift producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationStatements** | **String** | Redshift Creation statements |  [optional]
**name** | **String** | Producer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**producerEncryptionKey** | **String** | Dynamic producer encryption key |  [optional]
**redshiftDbName** | **String** | Redshift DB Name |  [optional]
**redshiftHost** | **String** | Redshift Host |  [optional]
**redshiftPassword** | **String** | Redshift Password |  [optional]
**redshiftPort** | **String** | Redshift Port |  [optional]
**redshiftUsername** | **String** | Redshift Username |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



