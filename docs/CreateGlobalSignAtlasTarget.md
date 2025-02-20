

# CreateGlobalSignAtlasTarget

createGlobalSignAtlasTarget is a command that creates a new target. [Deprecated: Use target-create-globalsign-atlas command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** | API Key of the GlobalSign Atlas account |  |
|**apiSecret** | **String** | API Secret of the GlobalSign Atlas account |  |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**mtlsCertDataBase64** | **String** | Mutual TLS Certificate contents of the GlobalSign Atlas account encoded in base64, either mtls-cert-file-path or mtls-cert-data-base64 must be supplied |  [optional] |
|**mtlsKeyDataBase64** | **String** | Mutual TLS Key contents of the GlobalSign Atlas account encoded in base64, either mtls-key-file-path or mtls-data-base64 must be supplied |  [optional] |
|**name** | **String** | Target name |  |
|**timeout** | **String** | Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



