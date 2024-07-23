

# DynamicSecretUpdateRedis

dynamicSecretUpdateRedis is a command that updates redis dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aclRules** | **String** | A JSON array list of redis ACL rules to attach to the created user. For available rules see the ACL CAT command https://redis.io/commands/acl-cat By default the user will have permissions to read all keys &#39;[\&quot;~*\&quot;, \&quot;+@read\&quot;]&#39; |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**host** | **String** | Redis Host |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret name |  [optional]
**password** | **String** | Redis Password |  [optional]
**passwordLength** | **String** | The length of the password to be generated |  [optional]
**port** | **String** | Redis Port |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional]
**sslCertificate** | **String** | SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Redis Username |  [optional]



