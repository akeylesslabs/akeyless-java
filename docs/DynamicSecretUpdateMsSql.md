

# DynamicSecretUpdateMsSql

dynamicSecretUpdateMsSql is a command that updates mssql dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**mssqlCreateStatements** | **String** | MSSQL Creation statements |  [optional]
**mssqlDbname** | **String** | MSSQL Name |  [optional]
**mssqlHost** | **String** | MSSQL Host |  [optional]
**mssqlPassword** | **String** | MSSQL Password |  [optional]
**mssqlPort** | **String** | MSSQL Port |  [optional]
**mssqlRevocationStatements** | **String** | MSSQL Revocation statements |  [optional]
**mssqlUsername** | **String** | MSSQL Username |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret name |  [optional]
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessDbSchema** | **String** | The DB schema |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



