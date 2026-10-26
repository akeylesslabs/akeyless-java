

# AttributeTypeAndValue

When parsed as part of a pkix.Name structure in a crypto/x509 type, the Value will be  a string if the ASN.1 type is PrintableString, IA5String, NumericString, BMPString, T61String, or UTF8String; an int64 if the ASN.1 type is INTEGER; an asn1.BitString if the ASN.1 type is BIT STRING; a []byte if the ASN.1 type is OCTET STRING; an asn1.ObjectIdentifier if the ASN.1 type is OBJECT IDENTIFIER; a time.Time if the ASN.1 type is UTCTIME or GENERALIZEDTIME; a bool if the ASN.1 type is BOOLEAN; nil if the ASN.1 type is NULL; an asn1.RawValue otherwise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **List&lt;Long&gt;** |  |  [optional] |
|**value** | **Object** |  |  [optional] |



