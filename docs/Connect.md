

# Connect

Connect is a command that performs secure remote access

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**helper** | **Object** |  |  [optional]
**rcFileOverride** | **String** | used to override .akeyless-connect.rc in tests |  [optional]
**bastionCtrlPath** | **String** | The Bastion API path |  [optional]
**bastionCtrlPort** | **String** | The Bastion API Port |  [optional]
**bastionCtrlProto** | **String** | The Bastion API protocol |  [optional]
**bastionCtrlSubdomain** | **String** | The Bastion API prefix |  [optional]
**certIssuerName** | **String** | The Akeyless certificate issuer name |  [optional]
**identityFile** | **String** | The file from which the identity (private key) for public key authentication is read |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**justification** | **String** |  |  [optional]
**name** | **String** | The Secret name (for database and AWS producers - producer name) |  [optional]
**sshCommand** | **String** | Path to SSH executable. e.g. /usr/bin/ssh |  [optional]
**sshExtraArgs** | **String** | Additional SSH arguments (except -i) |  [optional]
**sshLegacySigningAlg** | **Boolean** | Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the ssh certificate. |  [optional]
**target** | **String** | The target |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useSshAgent** | **Boolean** | Enable ssh-agent |  [optional]
**viaBastion** | **String** | The jump box server |  [optional]



