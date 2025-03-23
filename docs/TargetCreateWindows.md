

# TargetCreateWindows

GatewayCreateProducerWindowsCmd is a command that creates a new windows target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **String** | SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA) |  [optional] |
|**connectionType** | **String** | Type of connection to Windows Server [credentials/parent-target] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**domain** | **String** | User domain name |  [optional] |
|**hostname** | **String** | Server hostname |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**parentTargetName** | **String** | Name of the parent target, relevant only when connection-type is parent-target |  [optional] |
|**password** | **String** | Privileged user password |  |
|**port** | **String** | Server WinRM port |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useTls** | **String** | Enable/Disable TLS for WinRM over HTTPS [true/false] |  [optional] |
|**username** | **String** | Privileged username |  |



