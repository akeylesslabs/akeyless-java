

# CreatePKICertIssuer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowAnyName** | **Boolean** | If set, clients can request certificates for any CN |  [optional]
**allowSubdomains** | **Boolean** | If set, clients can request certificates for subdomains and wildcard subdomains of the allowed domains |  [optional]
**allowedDomains** | **String** | A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list) |  [optional]
**allowedUriSans** | **String** | A list of the allowed URIs that clients can request to be included in the certificate as part of the URI Subject Alternative Names (in a comma-delimited list) |  [optional]
**clientFlag** | **Boolean** | If set, certificates will be flagged for client auth use |  [optional]
**codeSigningFlag** | **Boolean** | If set, certificates will be flagged for code signing use |  [optional]
**country** | **String** | A comma-separated list of countries that will be set in the issued certificate |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyUsage** | **String** | key-usage |  [optional]
**locality** | **String** | A comma-separated list of localities that will be set in the issued certificate |  [optional]
**metadata** | **String** | A metadata about the issuer |  [optional]
**name** | **String** | PKI certificate issuer name | 
**notEnforceHostnames** | **Boolean** | If set, any names are allowed for CN and SANs in the certificate and not only a valid host name |  [optional]
**notRequireCn** | **Boolean** | If set, clients can request certificates without a CN |  [optional]
**organizationalUnits** | **String** | A comma-separated list of organizational units (OU) that will be set in the issued certificate |  [optional]
**organizations** | **String** | A comma-separated list of organizations (O) that will be set in the issued certificate |  [optional]
**postalCode** | **String** | A comma-separated list of postal codes that will be set in the issued certificate |  [optional]
**province** | **String** | A comma-separated list of provinces that will be set in the issued certificate |  [optional]
**serverFlag** | **Boolean** | If set, certificates will be flagged for server auth use |  [optional]
**signerKeyName** | **String** | A key to sign the certificate with | 
**streetAddress** | **String** | A comma-separated list of street addresses that will be set in the issued certificate |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**ttl** | **Long** | he requested Time To Live for the certificate, in seconds | 
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



