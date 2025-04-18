

# UpdateRole


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analyticsAccess** | **String** | Allow this role to view analytics. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported, allowing associated auth methods to view reports produced by the same auth methods. |  [optional] |
|**auditAccess** | **String** | Allow this role to view audit logs. Currently only &#39;none&#39;, &#39;own&#39; and &#39;all&#39; values are supported, allowing associated auth methods to view audit logs produced by the same auth methods. |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**eventCenterAccess** | **String** | Allow this role to view Event Center. Currently only &#39;none&#39;, &#39;own&#39; and &#39;all&#39; values are supported |  [optional] |
|**eventForwarderAccess** | **String** | Allow this role to manage Event Forwarders. Currently only &#39;none&#39; and &#39;all&#39; values are supported. |  [optional] |
|**gwAnalyticsAccess** | **String** | Allow this role to view gw analytics. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported, allowing associated auth methods to view reports produced by the same auth methods. |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Role name |  |
|**newComment** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New Role name |  [optional] |
|**sraReportsAccess** | **String** | Allow this role to view SRA Clusters. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**usageReportsAccess** | **String** | Allow this role to view Usage Report. Currently only &#39;none&#39; and &#39;all&#39; values are supported. |  [optional] |



