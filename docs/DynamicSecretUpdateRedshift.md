

# DynamicSecretUpdateRedshift

dynamicSecretUpdateRedshift is a command that updates redshift dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationStatements** | **String** | Redshift Creation statements |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret name |  [optional]
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**producerEncryptionKey** | **String** | Dynamic producer encryption key |  [optional]
**redshiftDbName** | **String** | Redshift DB Name |  [optional]
**redshiftHost** | **String** | Redshift Host |  [optional]
**redshiftPassword** | **String** | Redshift Password |  [optional]
**redshiftPort** | **String** | Redshift Port |  [optional]
**redshiftUsername** | **String** | Redshift Username |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts) |  [optional]
**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



