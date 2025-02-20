

# GatewayUpdateProducerCustom

gatewayUpdateProducerCustom is a command that updates a custom producer. [Deprecated: Use dynamic-secret-update-custom command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminRotationIntervalDays** | **Long** | Define rotation interval in days |  [optional] |
|**createSyncUrl** | **String** | URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create |  |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**enableAdminRotation** | **Boolean** | Should admin credentials be rotated |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**payload** | **String** | Secret payload to be sent with each create/revoke webhook request |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**revokeSyncUrl** | **String** | URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke |  |
|**rotateSyncUrl** | **String** | URL of an endpoint that implements /sync/rotate method, for example https://webhook.example.com/sync/rotate |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**timeoutSec** | **Long** | Maximum allowed time in seconds for the webhook to return the results |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



