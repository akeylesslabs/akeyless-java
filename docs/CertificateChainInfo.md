

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
|**leafCertificatePem** | **String** | LeafCertificatePem contains only the leaf certificate, derived from CertificatePem. Populated only when the certificate was issued with SplitCertificateChain enabled. |  [optional] |
|**nextAutoRenewalDate** | **OffsetDateTime** | NextAutoRenewalDate is when auto-renewal will next renew the certificate. It is worked out when the certificate is described and never stored, and it is empty when the certificate will not be auto-renewed. |  [optional] |
|**notBefore** | **OffsetDateTime** |  |  [optional] |
|**renewBeforeExpirationInDays** | **Long** |  |  [optional] |
|**splitCertificateChain** | **Boolean** | SplitCertificateChain reflects whether this certificate was issued while its PKI Cert Issuer had split-certificate-chain enabled. When true, LeafCertificatePem is populated in addition to CertificatePem (which always holds the full chain). |  [optional] |



