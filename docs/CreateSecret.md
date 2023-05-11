

# CreateSecret


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**multilineValue** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**passwordManagerCustomField** | **Map&lt;String, String&gt;** | For Password Management use, additional fields |  [optional]
**passwordManagerInjectUrl** | **List&lt;String&gt;** | For Password Management use, reflect the website context |  [optional]
**passwordManagerPassword** | **String** | For Password Management use, additional fields |  [optional]
**passwordManagerUsername** | **String** | For Password Management use |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional]
**secureAccessRdpUser** | **String** | Remote Desktop Username |  [optional]
**secureAccessSshCreds** | **String** | Static-Secret values contains SSH Credentials, either Private Key or Password [password/private-key] |  [optional]
**secureAccessSshUser** | **String** | Override the SSH username as indicated in SSH Certificate Issuer |  [optional]
**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless Web Access Bastion |  [optional]
**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless Web Access Bastion |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | The secret sub type [generic/password] |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**value** | **String** | The secret value | 



