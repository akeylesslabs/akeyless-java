

# GatewayCreateProducerMySQL

gatewayCreateProducerMySQL is a command that creates mysql producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dbServerCertificates** | **String** | (Optional) DB server certificates |  [optional]
**dbServerName** | **String** | (Optional) Server name for certificate verification |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**mysqlDbname** | **String** | MySQL DB Name |  [optional]
**mysqlHost** | **String** | MySQL Host |  [optional]
**mysqlPassword** | **String** | MySQL Password |  [optional]
**mysqlPort** | **String** | MySQL Port |  [optional]
**mysqlScreationStatements** | **String** | MySQL Creation statements |  [optional]
**mysqlUsername** | **String** | MySQL Username |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional]
**sslCertificate** | **String** | SSL connection certificate |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



