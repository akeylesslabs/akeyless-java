

# GatewayCreateProducerMSSQL

gatewayCreateProducerMSSQL is a command that creates mssql producer [Deprecated: Use dynamic-secret-create-mssql command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**mssqlAllowedDbNames** | **String** | CSV of allowed DB names for runtime selection when getting the secret value. Empty &#x3D;&gt; use target DB only; \&quot;*\&quot; &#x3D;&gt; any DB allowed; One or more names &#x3D;&gt; user must choose from this list |  [optional] |
|**mssqlCreateStatements** | **String** | MSSQL Creation statements |  [optional] |
|**mssqlDbname** | **String** | MSSQL Name |  [optional] |
|**mssqlHost** | **String** | MSSQL Host |  [optional] |
|**mssqlPassword** | **String** | MSSQL Password |  [optional] |
|**mssqlPort** | **String** | MSSQL Port |  [optional] |
|**mssqlRevocationStatements** | **String** | MSSQL Revocation statements |  [optional] |
|**mssqlUsername** | **String** | MSSQL Username |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessDbSchema** | **String** | The DB schema |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



