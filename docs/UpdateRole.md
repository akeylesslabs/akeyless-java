

# UpdateRole

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyticsAccess** | **String** | Allow this role to view analytics. Currently only &#39;none&#39; and &#39;self&#39; values are supported, allowing associated auth methods to view reports produced by the same auth methods. |  [optional]
**auditAccess** | **String** | Allow this role to view audit logs. Currently only &#39;none&#39; and &#39;self&#39; values are supported, allowing associated auth methods to view audit logs produced by the same auth methods. |  [optional]
**name** | **String** | Role name | 
**newComment** | **String** | New comment about the role |  [optional]
**newName** | **String** | New Role name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



