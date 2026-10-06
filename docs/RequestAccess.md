

# RequestAccess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capability** | **List&lt;String&gt;** | List of the required capabilities options: [read, update, delete] |  |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Item name |  |
|**requestedTtl** | **Long** | Requested access TTL in minutes. Allowed range is 1 to 1440. Defaults to 60 when omitted. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**type** | **String** | Item type |  |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



