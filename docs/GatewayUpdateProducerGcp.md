

# GatewayUpdateProducerGcp

gatewayUpdateProducerGcp is a command that updates a GCP producer [Deprecated: Use dynamic-secret-update-gcp command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | **String** |  |  [optional] |
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**fixedUserClaimKeyname** | **String** | For externally provided users, denotes the key-name of IdP claim to extract the username from (Relevant only when --access-type&#x3D;external) |  [optional] |
|**gcpCredType** | **String** |  |  [optional] |
|**gcpKey** | **String** | Base64-encoded service account private key text |  [optional] |
|**gcpKeyAlgo** | **String** | Service account key algorithm, e.g. KEY_ALG_RSA_1024 (Relevant only when --access-type&#x3D;sa and --gcp-cred-type&#x3D;key) |  [optional] |
|**gcpProjectId** | **String** | GCP Project ID override for dynamic secret operations |  [optional] |
|**gcpSaEmail** | **String** | The email of the fixed service account to generate keys or tokens for (Relevant only when --access-type&#x3D;sa and --service-account-type&#x3D;fixed) |  [optional] |
|**gcpTokenScopes** | **String** | Access token scopes list, e.g. scope1,scope2 (Relevant only when --access-type&#x3D;sa; required when --gcp-cred-type&#x3D;token) |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**newName** | **String** | Dynamic secret name |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**roleBinding** | **String** | Role binding definitions in JSON format (Relevant only when --access-type&#x3D;sa and --service-account-type&#x3D;dynamic) |  [optional] |
|**roleNames** | **String** | Comma-separated list of GCP roles to assign to the user (Relevant only when --access-type&#x3D;external) |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**serviceAccountType** | **String** | The type of the GCP service account. Options [fixed, dynamic] (Relevant only when --access-type&#x3D;sa) |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



