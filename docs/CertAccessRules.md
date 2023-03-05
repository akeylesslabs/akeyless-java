

# CertAccessRules

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedCors** | **List&lt;String&gt;** | a list of allowed cors domains if used for browser authentication |  [optional]
**boundCommonNames** | **List&lt;String&gt;** | A list of names. At least one must exist in the Common Name. Supports globbing. |  [optional]
**boundDnsSans** | **List&lt;String&gt;** | A list of DNS names. At least one must exist in the SANs. Supports globbing. |  [optional]
**boundEmailSans** | **List&lt;String&gt;** | A list of Email Addresses. At least one must exist in the SANs. Supports globbing. |  [optional]
**boundExtensions** | **List&lt;String&gt;** | A list of extensions formatted as \&quot;oid:value\&quot;. Expects the extension value to be some type of ASN1 encoded string. All values must match. Supports globbing on \&quot;value\&quot;. |  [optional]
**boundOrganizationalUnits** | **List&lt;String&gt;** | A list of Organizational Units names. At least one must exist in the OU field. |  [optional]
**boundUriSans** | **List&lt;String&gt;** | A list of URIs. At least one must exist in the SANs. Supports globbing. |  [optional]
**certificate** | **String** | Base64 encdoed PEM certificate |  [optional]
**revokedCertIds** | **List&lt;String&gt;** | A list of revoked cert ids |  [optional]
**uniqueIdentifier** | **String** | A unique identifier to distinguish different users |  [optional]



