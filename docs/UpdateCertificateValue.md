

# UpdateCertificateValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**certificateData** | **String** | Content of the certificate in a Base64 format. |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional] |
|**format** | **String** | CertificateFormat of the certificate and private key, possible values: cer,crt,pem,pfx,p12. Required when passing inline certificate content with --certificate-data or --key-data, otherwise format is derived from the file extension. |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key to use to encrypt the certificate&#39;s key (if empty, the account default protectionKey key will be used) |  [optional] |
|**keyData** | **String** | Content of the certificate&#39;s private key in a Base64 format. |  [optional] |
|**metadata** | **String** | Deprecated - use description |  [optional] |
|**name** | **String** | Certificate name |  |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



