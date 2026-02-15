

# PolicyCreateKeys


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedAlgorithms** | **List&lt;String&gt;** | Specify allowed key algorithms (e.g., [RSA2048,AES128GCM]) |  [optional] |
|**allowedKeyNames** | **List&lt;String&gt;** | Specify allowed protection key names. To enforce using the account&#39;s default protection key, use &#39;default-account-key&#39; |  [optional] |
|**allowedKeyTypes** | **List&lt;String&gt;** | Specify allowed key protection types (dfc, classic-key) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**maxRotationIntervalDays** | **Integer** | Set the maximum rotation interval for automatic key rotation. |  [optional] |
|**objectTypes** | **List&lt;String&gt;** | The object types this policy will apply to (items, targets). If not provided, defaults to [items, targets]. |  [optional] |
|**path** | **String** | The path the policy refers to |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



