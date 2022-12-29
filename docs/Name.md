

# Name

Name represents an X.509 distinguished name. This only includes the common elements of a DN. Note that Name is only an approximation of the X.509 structure. If an accurate representation is needed, asn1.Unmarshal the raw subject or issuer as an RDNSequence.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **List&lt;String&gt;** |  |  [optional]
**extraNames** | [**List&lt;AttributeTypeAndValue&gt;**](AttributeTypeAndValue.md) | ExtraNames contains attributes to be copied, raw, into any marshaled distinguished names. Values override any attributes with the same OID. The ExtraNames field is not populated when parsing, see Names. |  [optional]
**locality** | **List&lt;String&gt;** |  |  [optional]
**names** | [**List&lt;AttributeTypeAndValue&gt;**](AttributeTypeAndValue.md) | Names contains all parsed attributes. When parsing distinguished names, this can be used to extract non-standard attributes that are not parsed by this package. When marshaling to RDNSequences, the Names field is ignored, see ExtraNames. |  [optional]
**serialNumber** | **String** |  |  [optional]
**streetAddress** | **List&lt;String&gt;** |  |  [optional]



