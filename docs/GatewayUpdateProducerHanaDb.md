

# GatewayUpdateProducerHanaDb

gatewayUpdateProducerHanaDb is a command that updates hanadb producer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**hanaDbname** | **String** | HanaDb Name |  [optional]
**hanadbCreateStatements** | **String** | HanaDb Creation statements |  [optional]
**hanadbHost** | **String** | HanaDb Host |  [optional]
**hanadbPassword** | **String** | HanaDb Password |  [optional]
**hanadbPort** | **String** | HanaDb Port |  [optional]
**hanadbRevocationStatements** | **String** | HanaDb Revocation statements |  [optional]
**hanadbUsername** | **String** | HanaDb Username |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
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



