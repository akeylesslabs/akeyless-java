

# DynamicSecretUpdateGcp

dynamicSecretUpdateGcp is a command that updates a GCP dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**gcpCredType** | **String** |  |  [optional] |
|**gcpKey** | **String** | Base64-encoded service account private key text |  [optional] |
|**gcpKeyAlgo** | **String** | Service account key algorithm, e.g. KEY_ALG_RSA_1024 |  [optional] |
|**gcpProjectId** | **String** | GCP Project ID override for dynamic secret operations (tmp service accounts) |  [optional] |
|**gcpSaEmail** | **String** | The email of the fixed service acocunt to generate keys or tokens for. (revelant for service-account-type&#x3D;fixed) |  [optional] |
|**gcpTokenScopes** | **String** | Access token scopes list, e.g. scope1,scope2 |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**roleBinding** | **String** | Role binding definitions in json format |  [optional] |
|**serviceAccountType** | **String** | The type of the gcp dynamic secret. Options[fixed, dynamic] |  |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



