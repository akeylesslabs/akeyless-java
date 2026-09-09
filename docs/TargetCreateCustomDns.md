

# TargetCreateCustomDns


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**dnsParameter** | **Map&lt;String, String&gt;** | Lego DNS provider parameters as KEY&#x3D;VALUE pairs using lego environment variable names |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**providerType** | **String** | Lego DNS provider code (e.g. infoblox, route53, azion). See https://go-acme.github.io/lego/dns/ |  |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



