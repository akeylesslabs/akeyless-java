

# CreateWindowsTarget

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate** | **String** | SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA) |  [optional]
**description** | **String** | Description of the object |  [optional]
**hostname** | **String** | Server hostname | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Target name | 
**password** | **String** | Privileged user password | 
**port** | **String** | Server WinRM port |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useTls** | **String** | Enable/Disable TLS for WinRM over HTTPS [true/false] |  [optional]
**username** | **String** | Privileged username | 



