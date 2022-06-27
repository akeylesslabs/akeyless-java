

# GatewayUpdateProducerDockerhub

gatewayUpdateProducerDockerhub is a command that updates a DOCKERHUB producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**dockerhubPassword** | **String** | DockerhubPassword is either the user&#39;s password access token to manage the repository |  [optional]
**dockerhubTokenScopes** | **String** | Access token scopes list (comma seperated) to give the dynamic secret valid options are in \&quot;repo:admin\&quot;, \&quot;repo:write\&quot;, \&quot;repo:read\&quot;, \&quot;repo:public_read\&quot; |  [optional]
**dockerhubUsername** | **String** | DockerhubUsername is the name of the user in dockerhub |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



