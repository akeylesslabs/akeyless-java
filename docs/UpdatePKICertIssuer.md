

# UpdatePKICertIssuer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**allowAnyName** | **Boolean** | If set, clients can request certificates for any CN |  [optional]
**allowSubdomains** | **Boolean** | If set, clients can request certificates for subdomains and wildcard subdomains of the allowed domains |  [optional]
**allowedDomains** | **String** | A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list) |  [optional]
**allowedUriSans** | **String** | A list of the allowed URIs that clients can request to be included in the certificate as part of the URI Subject Alternative Names (in a comma-delimited list) |  [optional]
**clientFlag** | **Boolean** | If set, certificates will be flagged for client auth use |  [optional]
**codeSigningFlag** | **Boolean** | If set, certificates will be flagged for code signing use |  [optional]
**country** | **String** | A comma-separated list of countries that will be set in the issued certificate |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**destinationPath** | **String** | A path in which to save generated certificates |  [optional]
**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional]
**gwClusterUrl** | **String** | The GW cluster URL to issue the certificate from, required in Public CA mode |  [optional]
**isCa** | **Boolean** | If set, the basic constraints extension will be added to certificate |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyUsage** | **String** | key-usage |  [optional]
**locality** | **String** | A comma-separated list of localities that will be set in the issued certificate |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | PKI certificate issuer name | 
**newName** | **String** | New item name |  [optional]
**notEnforceHostnames** | **Boolean** | If set, any names are allowed for CN and SANs in the certificate and not only a valid host name |  [optional]
**notRequireCn** | **Boolean** | If set, clients can request certificates without a CN |  [optional]
**organizationalUnits** | **String** | A comma-separated list of organizational units (OU) that will be set in the issued certificate |  [optional]
**organizations** | **String** | A comma-separated list of organizations (O) that will be set in the issued certificate |  [optional]
**postalCode** | **String** | A comma-separated list of postal codes that will be set in the issued certificate |  [optional]
**protectCertificates** | **Boolean** | Whether to protect generated certificates from deletion |  [optional]
**province** | **String** | A comma-separated list of provinces that will be set in the issued certificate |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**serverFlag** | **Boolean** | If set, certificates will be flagged for server auth use |  [optional]
**signerKeyName** | **String** | A key to sign the certificate with, required in Private CA mode | 
**streetAddress** | **String** | A comma-separated list of street addresses that will be set in the issued certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | The maximum requested Time To Live for issued certificates, in seconds. In case of Public CA, this is based on the CA target&#39;s supported maximum TTLs | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



