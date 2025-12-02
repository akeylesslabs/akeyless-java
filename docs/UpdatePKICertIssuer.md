

# UpdatePKICertIssuer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**allowAnyName** | **Boolean** | If set, clients can request certificates for any CN |  [optional] |
|**allowCopyExtFromCsr** | **Boolean** | If set, will allow copying the extra extensions from the csr file (if given) |  [optional] |
|**allowSubdomains** | **Boolean** | If set, clients can request certificates for subdomains of the allowed domains |  [optional] |
|**allowedDomains** | **String** | A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list) |  [optional] |
|**allowedExtraExtensions** | **String** | A json string containing the allowed extra extensions for the pki cert issuer |  [optional] |
|**allowedIpSans** | **String** | A list of the allowed CIDRs for ips that clients can request to be included in the certificate as part of the IP Subject Alternative Names (in a comma-delimited list) |  [optional] |
|**allowedUriSans** | **String** | A list of the allowed URIs that clients can request to be included in the certificate as part of the URI Subject Alternative Names (in a comma-delimited list) |  [optional] |
|**autoRenew** | **Boolean** | Automatically renew certificates before expiration |  [optional] |
|**clientFlag** | **Boolean** | If set, certificates will be flagged for client auth use |  [optional] |
|**codeSigningFlag** | **Boolean** | If set, certificates will be flagged for code signing use |  [optional] |
|**country** | **String** | A comma-separated list of countries that will be set in the issued certificate |  [optional] |
|**createPrivateCrl** | **Boolean** | Set this to allow the issuer will expose a CRL endpoint in the Gateway |  [optional] |
|**createPrivateOcsp** | **Boolean** |  |  [optional] |
|**createPublicCrl** | **Boolean** | Set this to allow the cert issuer will expose a public CRL endpoint |  [optional] |
|**createPublicOcsp** | **Boolean** |  |  [optional] |
|**criticalKeyUsage** | **String** | Mark key usage as critical [true/false] |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**destinationPath** | **String** | A path in which to save generated certificates |  [optional] |
|**disableWildcards** | **Boolean** | If set, generation of wildcard certificates will be disabled. |  [optional] |
|**enableAcme** | **Boolean** | If set, the cert issuer will support the acme protocol |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional] |
|**gwClusterUrl** | **String** | The GW cluster URL to issue the certificate from. Required in Public CA mode, to allow CRLs on private CA, or to enable ACME |  [optional] |
|**isCa** | **Boolean** | If set, the basic constraints extension will be added to certificate |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keyUsage** | **String** | key-usage |  [optional] |
|**locality** | **String** | A comma-separated list of localities that will be set in the issued certificate |  [optional] |
|**maxPathLen** | **Long** | The maximum path length for the generated certificate. -1, means unlimited |  [optional] |
|**metadata** | **String** | Deprecated - use description |  [optional] |
|**name** | **String** | PKI certificate issuer name |  |
|**newName** | **String** | New item name |  [optional] |
|**notEnforceHostnames** | **Boolean** | If set, any names are allowed for CN and SANs in the certificate and not only a valid host name |  [optional] |
|**notRequireCn** | **Boolean** | If set, clients can request certificates without a CN |  [optional] |
|**ocspTtl** | **String** |  |  [optional] |
|**organizationalUnits** | **String** | A comma-separated list of organizational units (OU) that will be set in the issued certificate |  [optional] |
|**organizations** | **String** | A comma-separated list of organizations (O) that will be set in the issued certificate |  [optional] |
|**postalCode** | **String** | A comma-separated list of postal codes that will be set in the issued certificate |  [optional] |
|**protectCertificates** | **Boolean** | Whether to protect generated certificates from deletion |  [optional] |
|**province** | **String** | A comma-separated list of provinces that will be set in the issued certificate |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**scheduledRenew** | **Long** | Number of days before expiration to renew certificates |  [optional] |
|**serverFlag** | **Boolean** | If set, certificates will be flagged for server auth use |  [optional] |
|**signerKeyName** | **String** | A key to sign the certificate with, required in Private CA mode |  [optional] |
|**streetAddress** | **String** | A comma-separated list of street addresses that will be set in the issued certificate |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**ttl** | **String** | The maximum requested Time To Live for issued certificates, in seconds. In case of Public CA, this is based on the CA target&#39;s supported maximum TTLs |  |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



