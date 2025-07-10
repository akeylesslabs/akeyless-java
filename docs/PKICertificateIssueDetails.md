

# PKICertificateIssueDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acmeEnabled** | **Boolean** |  |  [optional] |
|**allowAnyName** | **Boolean** |  |  [optional] |
|**allowCopyExtFromCsr** | **Boolean** |  |  [optional] |
|**allowSubdomains** | **Boolean** |  |  [optional] |
|**allowedDomainsList** | **List&lt;String&gt;** |  |  [optional] |
|**allowedExtraExtensions** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**allowedIpSans** | **List&lt;String&gt;** |  |  [optional] |
|**allowedUriSans** | **List&lt;String&gt;** |  |  [optional] |
|**autoRenewCertificate** | **Boolean** |  |  [optional] |
|**basicConstraintsValidForNonCa** | **Boolean** |  |  [optional] |
|**certificateAuthorityMode** | **String** |  |  [optional] |
|**clientFlag** | **Boolean** |  |  [optional] |
|**codeSigningFlag** | **Boolean** |  |  [optional] |
|**country** | **List&lt;String&gt;** |  |  [optional] |
|**createPrivateCrl** | **Boolean** |  |  [optional] |
|**createPublicCrl** | **Boolean** |  |  [optional] |
|**destinationPath** | **String** | DestinationPath is the destination to save generated certificates |  [optional] |
|**disableWildcards** | **Boolean** |  |  [optional] |
|**enforceHostnames** | **Boolean** |  |  [optional] |
|**expirationEvents** | [**List&lt;CertificateExpirationEvent&gt;**](CertificateExpirationEvent.md) | ExpirationNotification holds a list of expiration notices that should be sent in case a certificate is about to expire, this value is being propagated to the Certificate resources that are created |  [optional] |
|**gwClusterId** | **Long** |  |  [optional] |
|**gwClusterUrl** | **String** | GWClusterURL is required when CAMode is \&quot;public\&quot; and it defines the cluster URL the PKI should be issued from. The GW cluster must have permissions to read associated target&#39;s details |  [optional] |
|**isCa** | **Boolean** |  |  [optional] |
|**keyBits** | **Long** |  |  [optional] |
|**keyType** | **String** |  |  [optional] |
|**keyUsageList** | **List&lt;String&gt;** |  |  [optional] |
|**locality** | **List&lt;String&gt;** |  |  [optional] |
|**maxPathLen** | **Long** |  |  [optional] |
|**nonCriticalKeyUsage** | **Boolean** |  |  [optional] |
|**notBeforeDuration** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |
|**organizationList** | **List&lt;String&gt;** |  |  [optional] |
|**organizationUnitList** | **List&lt;String&gt;** |  |  [optional] |
|**pkiIssuerType** | **String** |  |  [optional] |
|**postalCode** | **List&lt;String&gt;** |  |  [optional] |
|**protectGeneratedCertificates** | **Boolean** | ProtectGeneratedCertificates dictates whether the created certificates should be protected from deletion |  [optional] |
|**province** | **List&lt;String&gt;** |  |  [optional] |
|**renewBeforeExpirationInDays** | **Long** |  |  [optional] |
|**requireCn** | **Boolean** |  |  [optional] |
|**serverFlag** | **Boolean** |  |  [optional] |
|**streetAddress** | **List&lt;String&gt;** |  |  [optional] |



