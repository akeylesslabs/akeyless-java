

# UscCreate

uscCreate is a command that creates a new secret in a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**awsAccountId** | **String** | The AWS account ID to create the secret in. Required when the connector spans multiple account IDs. |  [optional] |
|**binaryValue** | **Boolean** | Use this option if the universal secrets value is a base64 encoded binary |  [optional] |
|**description** | **String** | Description of the universal secrets |  [optional] |
|**gcpProjectId** | **String** | The GCP project to create the secret in (GCP only). Required when the connector spans multiple projects or uses folder/organization scope. |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**namespace** | **String** | The namespace (relevant for Hashi vault target) |  [optional] |
|**objectType** | **String** |  |  [optional] |
|**pfxPassword** | **String** | Optional, the passphrase that protects the private key within the pfx certificate (Relevant only for Azure KV certificates) |  [optional] |
|**region** | **String** | AWS Organization scope region or GCP regional secret location. GCP creates a global secret when empty. |  [optional] |
|**remoteSecretActivationDate** | **String** | Activation date for the secret on the remote endpoint, in UTC format: YYYY-MM-DDTHH:MM:SSZ |  [optional] |
|**remoteSecretExpires** | **String** | Expiration time for the secret on the remote endpoint, in UTC format: YYYY-MM-DDTHH:MM:SSZ |  [optional] |
|**secretName** | **String** | Name for the new universal secrets |  |
|**selectedRepositories** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Tags for the universal secrets |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscEncryptionKey** | **String** | Optional, The name of the remote key that used to encrypt the secret value (if empty, the default key will be used) |  [optional] |
|**uscName** | **String** | Name of the Universal Secrets Connector item |  |
|**value** | **String** | Value of the universal secrets item, either text or base64 encoded binary |  |



