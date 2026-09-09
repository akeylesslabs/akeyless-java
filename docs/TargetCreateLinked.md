

# TargetCreateLinked


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**hosts** | **String** | A comma seperated list of server hosts and server descriptions joined by semicolon &#39;;&#39; (i.e. &#39;server-dev.com;My Dev server,server-prod.com;My Prod server description&#39;) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**parentTargetName** | **String** | The parent Target name |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**type** | **String** | Specifies the hosts type, relevant only when working without parent target |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



