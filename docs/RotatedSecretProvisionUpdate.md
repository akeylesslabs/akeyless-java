

# RotatedSecretProvisionUpdate

provision-on-rotation provisions this target after a successful key rotation and is only supported for rotator type key-rotator. Omit the flag to keep the current value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**newTargetName** | **String** | New target name when retargeting the provisioning association |  [optional] |
|**privateKeyPassphrase** | **String** | Passphrase used to encrypt the private key file (omit to keep current; requires Read) |  [optional] |
|**privateKeyRemotePath** | **String** | Remote path for the private key (omit to keep current) |  [optional] |
|**provisionKeys** | **String** | Keys to provision: public-key or private-key (omit to keep current) |  [optional] |
|**provisionOnRotation** | **Boolean** | When true, provision keys to this target after a successful key rotation. Only supported for rotator type key-rotator. Omit to keep the current value. Set false to turn it off. |  [optional] |
|**publicKeyRemotePath** | **String** | Remote path for the public key (omit to keep current) |  [optional] |
|**targetName** | **String** | Target name of the provisioning association to update |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



