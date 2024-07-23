

# UpdateSSHCertIssuer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerType** | **String** |  |  [optional]
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**allowedUsers** | **String** | Users allowed to fetch the certificate, e.g root,ubuntu | 
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**extensions** | **Map&lt;String, String&gt;** | Signed certificates with extensions, e.g permit-port-forwarding&#x3D;\\\&quot;\\\&quot; |  [optional]
**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for Secure Remote Access of ssh cert issuer, ldap rotated secret and ldap dynamic secret |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | SSH certificate issuer name | 
**newName** | **String** | New item name |  [optional]
**principals** | **String** | Signed certificates with principal, e.g example_role1,example_role2 |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**secureAccessBastionApi** | **String** | Bastion&#39;s SSH control API endpoint. E.g. https://my.bastion:9900 |  [optional]
**secureAccessBastionSsh** | **String** | Bastion&#39;s SSH server. E.g. my.bastion:22 |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional]
**secureAccessSshCredsUser** | **String** | SSH username to connect to target server, must be in &#39;Allowed Users&#39; list |  [optional]
**secureAccessUseInternalBastion** | **Boolean** | Use internal SSH Bastion |  [optional]
**signerKeyName** | **String** | A key to sign the certificate with | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | The requested Time To Live for the certificate, in seconds | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



