

# CreateSSHCertIssuer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedUsers** | **String** | Users allowed to fetch the certificate, e.g root,ubuntu | 
**extensions** | **Map&lt;String, String&gt;** | Signed certificates with extensions, e.g permit-port-forwarding&#x3D;\\\&quot;\\\&quot; |  [optional]
**metadata** | **String** | A metadata about the issuer |  [optional]
**name** | **String** | SSH certificate issuer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**principals** | **String** | Signed certificates with principal, e.g example_role1,example_role2 |  [optional]
**secureAccessBastionApi** | **String** |  |  [optional]
**secureAccessBastionSsh** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessSshCredsUser** | **String** |  |  [optional]
**secureAccessUseInternalBastion** | **Boolean** |  |  [optional]
**signerKeyName** | **String** | A key to sign the certificate with | 
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | he requested Time To Live for the certificate, in seconds | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



