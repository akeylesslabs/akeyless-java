

# SSHCertificateIssueDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedDomains** | **List&lt;String&gt;** | Relevant for host certificate |  [optional] |
|**allowedUserKeyLengths** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**allowedUsers** | **List&lt;String&gt;** | Relevant for user certificate |  [optional] |
|**certType** | **Integer** |  |  [optional] |
|**criticalOptions** | **Map&lt;String, String&gt;** |  |  [optional] |
|**extensions** | **Map&lt;String, String&gt;** |  |  [optional] |
|**externallyProvidedUserSubClaimKey** | **String** | ExternallyProvidedUserSubClaimKey is the claim key name where the user name should be taken from |  [optional] |
|**isExternallyProvidedUser** | **Boolean** | IsExternallyProvidedUser is true if allow users should be taken from claims and not from AllowedUsers |  [optional] |
|**principals** | **List&lt;String&gt;** |  |  [optional] |
|**staticKeyId** | **String** | In case it is empty, the key ID will be combination of user identifiers and a random string |  [optional] |



