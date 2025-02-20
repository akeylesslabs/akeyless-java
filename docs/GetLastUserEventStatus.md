

# GetLastUserEventStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventSource** | **String** |  |  [optional] |
|**eventType** | **String** |  |  |
|**itemName** | **String** | Event item name |  |
|**itemType** | **String** | Event item type can be either \&quot;target\&quot; or type of item eg \&quot;static_secret\&quot;/\&quot;dynamic_secret\&quot; To get type of some item run &#x60;akeyless describe-item -n {ITEM_NAME} --jq-expression .item_type&#x60; |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**timeBack** | **String** | The time back to search the event, for example if the value is \&quot;5m\&quot; we will return the last user event issued in the last 5 minutes. By default, we will search without any time boundary. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



