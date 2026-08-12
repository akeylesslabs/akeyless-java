

# CreateMcpSecretBearerToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessibility** | **String** | for personal password manager |  [optional] |
|**araEnabled** | **Boolean** | Enable or disable Agentic Runtime Authority rule enforcement for this item. When false, user-defined input/output rules are stored but not enforced; the base security validation still runs.  AraEnabled is tri-state (nil/true/false), not a plain bool: it self-encodes its wire value (see akl.OptionalBool) so an explicit false survives the curl-proxy relay instead of being dropped like a default-false bool flag. |  [optional] |
|**bearerToken** | **String** | Bearer token value |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**metadata** | **String** | Deprecated - use description |  [optional] |
|**name** | **String** | Secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**protectionKey** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**url** | **String** | URL of the service |  [optional] |



