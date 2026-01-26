

# UscCreate

uscCreate is a command that creates a new secret in a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryValue** | **Boolean** | Use this option if the universal secrets value is a base64 encoded binary |  [optional] |
|**description** | **String** | Description of the universal secrets |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**namespace** | **String** | The namespace (relevant for Hashi vault target) |  [optional] |
|**objectType** | **String** |  |  [optional] |
|**pfxPassword** | **String** | Optional, the passphrase that protects the private key within the pfx certificate (Relevant only for Azure KV certificates) |  [optional] |
|**region** | **String** | Optional, create secret in a specific region (GCP only). If empty, a global secret will be created (provider default). |  [optional] |
|**secretName** | **String** | Name for the new universal secrets |  |
|**tags** | **Map&lt;String, String&gt;** | Tags for the universal secrets |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscEncryptionKey** | **String** | Optional, The name of the remote key that used to encrypt the secret value (if empty, the default key will be used) |  [optional] |
|**uscName** | **String** | Name of the Universal Secrets Connector item |  |
|**value** | **String** | Value of the universal secrets item, either text or base64 encoded binary |  |



