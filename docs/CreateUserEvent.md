

# CreateUserEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capabilities** | **List&lt;String&gt;** | List of the required capabilities options: [read, update, delete,sra_transparently_connect]. Relevant only for request-access event types |  [optional] |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**eventSource** | **String** |  |  [optional] |
|**eventType** | **String** |  |  |
|**itemName** | **String** | EventItemName Event item name |  |
|**itemType** | **String** | EventItemType Event item type |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**requestAccessTtl** | **Long** | For how long to grant the requested access, in minutes |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



