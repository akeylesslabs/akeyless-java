

# CreateHashiVaultTarget

createHashiVaultTarget is a command that creates a new hashi-vault target. [Deprecated: Use target-create-hashi-vault command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the object |  [optional] |
|**hashiUrl** | **String** | HashiCorp Vault API URL, e.g. https://vault-mgr01:8200 |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**namespace** | **List&lt;String&gt;** | Comma-separated list of vault namespaces |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**vaultToken** | **String** | Vault access token with sufficient permissions |  [optional] |



