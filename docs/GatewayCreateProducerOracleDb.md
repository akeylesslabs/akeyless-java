

# GatewayCreateProducerOracleDb

gatewayCreateProducerOracleDb is a command that creates oracle db producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dbServerCertificates** | **String** | (Optional) DB server certificates |  [optional]
**dbServerName** | **String** | (Optional) Server name for certificate verification |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**oracleHost** | **String** | Oracle Host |  [optional]
**oraclePassword** | **String** | Oracle Password |  [optional]
**oraclePort** | **String** | Oracle Port |  [optional]
**oracleScreationStatements** | **String** | Oracle Creation statements |  [optional]
**oracleServiceName** | **String** | Oracle DB Name |  [optional]
**oracleUsername** | **String** | Oracle Username |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



