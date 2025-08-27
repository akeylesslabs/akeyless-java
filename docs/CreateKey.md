

# CreateKey

createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alg** | **String** | Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, AES128CBC, AES256CBC, RSA1024, RSA2048, RSA3072, RSA4096] |  |
|**certificateCommonName** | **String** | Common name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional] |
|**certificateCountry** | **String** | Country name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional] |
|**certificateDigestAlgo** | **String** | Digest algorithm to be used for the certificate key signing. |  [optional] |
|**certificateLocality** | **String** | Locality for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional] |
|**certificateOrganization** | **String** | Organization name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional] |
|**certificateProvince** | **String** | Province name for the generated certificate. Relevant only for generate-self-signed-certificate. |  [optional] |
|**certificateTtl** | **Long** | TTL in days for the generated certificate. Required only for generate-self-signed-certificate. |  [optional] |
|**confFileData** | **String** | The csr config data in base64 encoding |  [optional] |
|**customerFrgId** | **String** | The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment) |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**generateSelfSignedCertificate** | **Boolean** | Whether to generate a self signed certificate with the key. If set, --certificate-ttl must be provided. |  [optional] |
|**hashAlgorithm** | **String** | Specifies the hash algorithm used for the encryption key&#39;s operations, available options: [SHA256, SHA384, SHA512] |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**metadata** | **String** | Deprecated - use description |  [optional] |
|**name** | **String** | Key name |  |
|**splitLevel** | **Long** | The number of fragments that the item will be split into (not includes customer fragment) |  [optional] |
|**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



