

# CreateZeroSSLTarget

createZeroSSLTarget is a command that creates a new target. [Deprecated: Use target-create-zerossl command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** | API Key of the ZeroSSLTarget account |  |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**imapFqdn** | **String** | ImapFQDN of the IMAP service, FQDN or IPv4 address. Must be FQDN if the IMAP is using TLS |  |
|**imapPassword** | **String** | ImapPassword to access the IMAP service |  |
|**imapPort** | **String** | ImapPort of the IMAP service |  [optional] |
|**imapTargetEmail** | **String** | ImapValidationEmail to use when asking ZeroSSL to send a validation email, if empty will user imap-username |  [optional] |
|**imapUsername** | **String** | ImapUsername to access the IMAP service |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**timeout** | **String** | Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



