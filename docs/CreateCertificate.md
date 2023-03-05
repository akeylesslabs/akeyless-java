

# CreateCertificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificateData** | **String** | Content of the certificate PEM in a Base64 format. |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key to use to encrypt the certificate&#39;s key (if empty, the account default protectionKey key will be used) |  [optional]
**keyData** | **String** | Content of the certificate&#39;s private key PEM in a Base64 format. |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | Certificate name | 
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



