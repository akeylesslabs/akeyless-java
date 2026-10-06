

# GenerateIntermediateCA


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alg** | **String** |  |  [optional] |
|**allowedDomains** | **String** | Allowed domains for future leaf issuance, not inherited into the SCEP subordinate CA certificate |  [optional] |
|**commonName** | **String** | Optional Common Name for the intermediate CA certificate |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**destinationPath** | **String** | Destination path for SCEP-issued leaf certificates. Not derived from the CA certificate item path. |  [optional] |
|**enableScep** | **Boolean** | Enable the fixed SCEP Stage 1 profile |  [optional] |
|**extendedKeyUsage** | **String** | Extended key usage for future leaf issuance (serverauth / clientauth / codesigning) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**maxPathLen** | **Long** | The maximum path length of the generated intermediate CA certificate |  [optional] |
|**name** | **String** | Base path for derived intermediate CA resources |  |
|**parentCaName** | **String** | Parent PKI certificate issuer name |  [optional] |
|**scepPassword** | **String** | SCEP static challenge password. Request-only; never returned |  [optional] |
|**splitLevel** | **Long** | The number of fragments that the DFC key will be split into |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**ttl** | **String** | Maximum TTL for certificates issued by the new intermediate issuer, supported formats are s,m,h,d |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



