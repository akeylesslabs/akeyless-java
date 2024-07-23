

# DynamicSecretUpdateDockerhub

dynamicSecretUpdateDockerhub is a command that updates a DOCKERHUB dynamic secret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**dockerhubPassword** | **String** | DockerhubPassword is either the user&#39;s password access token to manage the repository |  [optional]
**dockerhubTokenScopes** | **String** | Access token scopes list (comma-separated) to give the dynamic secret valid options are in \&quot;repo:admin\&quot;, \&quot;repo:write\&quot;, \&quot;repo:read\&quot;, \&quot;repo:public_read\&quot; |  [optional]
**dockerhubUsername** | **String** | DockerhubUsername is the name of the user in dockerhub |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret new name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



