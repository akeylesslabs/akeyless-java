

# GatewayUpdateRemoteAccess

gatewayUpdateRemoteAccess is a command that update remote access config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedUrls** | **String** | List of valid URLs to redirect from the Portal back to the remote access server (in a comma-delimited list) |  [optional]
**hideSessionRecording** | **String** | Specifies whether to show/hide if the session is currently recorded [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**kexalgs** | **String** | Decide which algorithm will be used as part of the SSH initial hand-shake process |  [optional]
**keyboardLayout** | **String** | Enable support for additional keyboard layouts |  [optional]
**legacySshAlgorithm** | **String** | Signs SSH certificates using legacy ssh-rsa-cert-01@openssh.com signing algorithm [true/false] |  [optional]
**rdpTargetConfiguration** | **String** | Specify the usernameSubClaim that exists inside the IDP JWT, e.g. email |  [optional]
**sshTargetConfiguration** | **String** | Specify the usernameSubClaim that exists inside the IDP JWT, e.g. email |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



