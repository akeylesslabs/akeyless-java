

# RotatedSecretProvisionCreate

provision-on-rotation provisions this target after a successful key rotation and is only supported for rotator type key-rotator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**privateKeyPassphrase** | **String** | Optional passphrase used to encrypt the private key file on the remote host |  [optional] |
|**privateKeyRemotePath** | **String** | Remote path for the private key (required when provision-keys is private-key on host targets) |  [optional] |
|**provisionKeys** | **String** | Keys to provision: public-key (default) or private-key (also pushes the public key) |  [optional] |
|**provisionOnRotation** | **Boolean** | When true, provision keys to this target after a successful key rotation. Only supported for rotator type key-rotator. Defaults to true. Set false to turn it off. |  [optional] |
|**publicKeyRemotePath** | **String** | Remote path for the public key (defaults from the rotated secret) |  [optional] |
|**targetName** | **String** | Target name to provision keys to (must differ from the rotation target) |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



