

# ShareItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessibility** | **String** | for personal password manager |  [optional] |
|**action** | **String** | Action to be performed on the item [start/stop/describe] |  |
|**emails** | **List&lt;String&gt;** | List of emails to start/stop sharing the secret with |  [optional] |
|**itemName** | **String** | Item name |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**shareType** | **String** | Share type [email/token] |  [optional] |
|**sharedTokenId** | **List&lt;String&gt;** | Shared token ids in order to stop sharing a secret |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**ttl** | **Integer** | TTL of the Availability of the shared secret in seconds |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**viewOnce** | **Boolean** | ViewOnlyOnce Shared secrets can only be viewed once [true/false] |  [optional] |



