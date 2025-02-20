

# RevokeCertificate

RevokeCertificate is a command that revokes a certificate and adds it to the crl

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **Long** | The item id of the certificate to revoke |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Certificate item name to revoke |  [optional] |
|**serialNumber** | **String** | The serial number of the certificate to revoke |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**version** | **Integer** | Certificate version to revoke. Required if item-id or name are used. |  [optional] |



