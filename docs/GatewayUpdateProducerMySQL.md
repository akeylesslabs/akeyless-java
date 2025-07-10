

# GatewayUpdateProducerMySQL

gatewayUpdateProducerMySQL is a command that updates mysql producer [Deprecated: Use dynamic-secret-update-mysql command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**dbServerCertificates** | **String** | (Optional) DB server certificates |  [optional] |
|**dbServerName** | **String** | (Optional) Server name for certificate verification |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**mysqlDbname** | **String** | MySQL DB Name |  [optional] |
|**mysqlHost** | **String** | MySQL Host |  [optional] |
|**mysqlPassword** | **String** | MySQL Password |  [optional] |
|**mysqlPort** | **String** | MySQL Port |  [optional] |
|**mysqlRevocationStatements** | **String** | MySQL Revocation statements |  [optional] |
|**mysqlScreationStatements** | **String** | MySQL Creation statements |  [optional] |
|**mysqlUsername** | **String** | MySQL Username |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional] |
|**sslCertificate** | **String** | SSL connection certificate |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



