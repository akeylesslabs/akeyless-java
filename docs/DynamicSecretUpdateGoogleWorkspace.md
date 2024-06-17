

# DynamicSecretUpdateGoogleWorkspace

dynamicSecretUpdateGoogleWorkspace is a command that updates a Google Workspace dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessMode** | **String** |  | 
**adminEmail** | **String** | Admin user email | 
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**groupEmail** | **String** | A group email, relevant only for group access-mode |  [optional]
**groupRole** | **String** |  |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret new name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**roleName** | **String** | Name of the admin role to assign to the user, relevant only for role access-mode |  [optional]
**roleScope** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Name of existing target to use in dynamic secret creation |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



