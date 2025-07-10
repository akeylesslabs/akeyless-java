

# StaticSecretSync


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Static secret name |  |
|**namespace** | **String** | Vault namespace, releavnt only for Hashicorp Vault Target |  [optional] |
|**remoteSecretName** | **String** | Remote Secret Name that will be synced on the remote endpoint |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscName** | **String** | Universal Secret Connector name, If not provided all attached USC&#39;s will be synced |  [optional] |



