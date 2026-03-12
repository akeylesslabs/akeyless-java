

# CertificateChainInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoRenewCertificate** | **Boolean** |  |  [optional] |
|**certificateChain** | [**List&lt;CertificateInfo&gt;**](CertificateInfo.md) |  |  [optional] |
|**certificateFormat** | **String** |  |  [optional] |
|**certificateHasPrivateKey** | **Boolean** |  |  [optional] |
|**certificateIssuerGwClusterId** | **Long** |  |  [optional] |
|**certificateIssuerGwClusterUrl** | **String** |  |  [optional] |
|**certificateIssuerItemId** | **Long** |  |  [optional] |
|**certificateIssuerName** | **String** |  |  [optional] |
|**certificatePem** | **String** |  |  [optional] |
|**certificateStatus** | **String** |  |  [optional] |
|**commonName** | **String** |  |  [optional] |
|**csrPem** | **String** | CSRPEM contains the PEM-encoded CSR for pending certificates (HTTP-01 challenge) |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |
|**expirationEvents** | [**List&lt;CertificateExpirationEvent&gt;**](CertificateExpirationEvent.md) |  |  [optional] |
|**externalCaId** | [**NullString**](NullString.md) |  |  [optional] |
|**issuanceStatus** | **String** |  |  [optional] |
|**notBefore** | **OffsetDateTime** |  |  [optional] |
|**renewBeforeExpirationInDays** | **Long** |  |  [optional] |



