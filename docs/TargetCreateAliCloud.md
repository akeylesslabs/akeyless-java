

# TargetCreateAliCloud


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKey** | **String** | AliCloud RAM access key secret |  [optional] |
|**accessKeyId** | **String** | AliCloud RAM access key ID |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**generateExternalId** | **Boolean** | A unique auto-generated value used in your AliCloud account when configuring the RAM role trust policy to securely delegate access to Akeyless. Relevant only when using GW cloud ID |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**region** | **String** | AliCloud region. Selects the regional STS endpoint. If empty, the global STS endpoint is used |  [optional] |
|**roleArn** | **String** | AliCloud RAM role ARN that the Gateway will assume in your AliCloud account (acs:ram::&lt;account-id&gt;:role/&lt;role-name&gt;), relevant only when using external ID |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**sessionToken** | **String** | Required only for temporary security credentials retrieved using STS |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useGwCloudIdentity** | **Boolean** | Use the Gateway cloud identity |  [optional] |



