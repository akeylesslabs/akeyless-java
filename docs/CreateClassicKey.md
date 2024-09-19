

# CreateClassicKey

CreateClassicKey is a command that creates classic key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | Classic Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096, EC256, EC384, GPG] | 
**autoRotate** | **String** | Whether to automatically rotate every rotation_interval days, or disable existing automatic rotation [true/false] |  [optional]
**certFileData** | **String** | Certificate in a PEM format. |  [optional]
**certificateCommonName** | **String** | Common name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional]
**certificateCountry** | **String** | Country name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional]
**certificateDigestAlgo** | **String** | Digest algorithm to be used for the certificate key signing. Currently, we support only \&quot;sha256\&quot; so we hide this option for CLI. |  [optional]
**certificateFormat** | **String** |  |  [optional]
**certificateLocality** | **String** | Locality for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional]
**certificateOrganization** | **String** | Organization name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional]
**certificateProvince** | **String** | Province name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional]
**certificateTtl** | **Long** | TTL in days for the generated certificate. Required only for generate-self-signed-certificate. |  [optional]
**confFileData** | **String** | The csr config data in base64 encoding |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional]
**generateSelfSignedCertificate** | **Boolean** | Whether to generate a self signed certificate with the key. If set, --certificate-ttl must be provided. |  [optional]
**gpgAlg** | **String** | gpg alg: Relevant only if GPG key type selected; options: [RSA1024, RSA2048, RSA3072, RSA4096, Ed25519] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyData** | **String** | Base64-encoded classic key value |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | ClassicKey name | 
**protectionKeyName** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional]
**rotationInterval** | **String** | The number of days to wait between every automatic rotation (1-365) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



