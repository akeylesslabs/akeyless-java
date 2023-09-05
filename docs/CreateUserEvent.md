

# CreateUserEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | **List&lt;String&gt;** | List of the required capabilities options: [read, update, delete,sra_transparently_connect]. Relevant only for request-access event types |  [optional]
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**eventSource** | **String** |  |  [optional]
**eventType** | **String** |  | 
**itemName** | **String** | Event item name | 
**itemType** | **String** | Event item type can be either \&quot;target\&quot; or type of item eg \&quot;static_secret\&quot;/\&quot;dynamic_secret\&quot; To get type of some item run &#x60;akeyless describe-item -n {ITEM_NAME} --jq-expression .item_type&#x60; | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**requestAccessTtl** | **Long** | TTL in minutes for how long to grant the requested access |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



