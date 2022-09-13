

# GetSSHCertificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certIssuerName** | **String** | The name of the SSH certificate issuer | 
**certUsername** | **String** | The username to sign in the SSH certificate | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**legacySigningAlgName** | **Boolean** | Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the certificate. |  [optional]
**publicKeyData** | **String** | SSH public key file contents. If this option is used, the certificate will be printed to stdout |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



