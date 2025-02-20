

# GenerateCA

GenerateCA is a command that creates a new PKI CA and Intermediate issuers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alg** | **String** |  |  [optional] |
|**allowedDomains** | **String** | A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list) |  |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**extendedKeyUsage** | **String** | A comma sepereted list of extended key usage for the intermediate (serverauth / clientauth / codesigning) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyType** | **String** |  |  [optional] |
|**maxPathLen** | **Long** | The maximum number of intermediate certificates that can appear in a certification path |  [optional] |
|**pkiChainName** | **String** | PKI chain name |  |
|**protectionKeyName** | **String** | The name of a key that used to encrypt the secrets values (if empty, the account default protectionKey key will be used) |  [optional] |
|**splitLevel** | **Long** | The number of fragments that the item will be split into |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**ttl** | **String** | The maximum requested Time To Live for issued certificate by default in seconds, supported formats are s,m,h,d |  |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



