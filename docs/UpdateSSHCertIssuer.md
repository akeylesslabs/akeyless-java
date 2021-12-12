

# UpdateSSHCertIssuer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**allowedUsers** | **String** | Users allowed to fetch the certificate, e.g root,ubuntu | 
**extensions** | **Map&lt;String, String&gt;** | Signed certificates with extensions, e.g permit-port-forwarding&#x3D;\\\&quot;\\\&quot; |  [optional]
**metadata** | **String** | A metadata about the issuer |  [optional]
**name** | **String** | SSH certificate issuer name | 
**newName** | **String** | New item name |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**principals** | **String** | Signed certificates with principal, e.g example_role1,example_role2 |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**secureAccessBastionApi** | **String** |  |  [optional]
**secureAccessBastionSsh** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessSshCredsUser** | **String** |  |  [optional]
**secureAccessUseInternalBastion** | **Boolean** |  |  [optional]
**signerKeyName** | **String** | A key to sign the certificate with | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | he requested Time To Live for the certificate, in seconds | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



