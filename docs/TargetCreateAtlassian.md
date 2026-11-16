

# TargetCreateAtlassian


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atlassianAuthType** | **String** | Atlassian auth type: oauth, service_account_token or user_api_token on cloud, pat on data center |  [optional] |
|**atlassianAutomationKey** | **String** | Optional Automation REST API key (Jira settings &gt; System &gt; Automation &gt; API keys); the automation API refuses an account token, so without it the automation rules are reported as not read |  [optional] |
|**atlassianCaCertificate** | **String** | CA certificate (base64-encoded PEM) of a Data Center site signed by a private CA |  [optional] |
|**atlassianClientId** | **String** | Atlassian OAuth 2.0 service account client ID |  [optional] |
|**atlassianClientSecret** | **String** | Atlassian OAuth 2.0 service account client secret |  [optional] |
|**atlassianCloudId** | **String** | Atlassian Cloud ID of the site (resolved from the site URL when empty) |  [optional] |
|**atlassianConfluenceToken** | **String** | Confluence Data Center personal access token |  [optional] |
|**atlassianConfluenceUrl** | **String** | Confluence Data Center base URL |  [optional] |
|**atlassianDeploymentType** | **String** | Atlassian deployment type: cloud or data_center (inferred from the URL when empty) |  [optional] |
|**atlassianEmail** | **String** | Atlassian account email paired with a user API token |  [optional] |
|**atlassianJiraToken** | **String** | Jira Data Center personal access token |  [optional] |
|**atlassianJiraUrl** | **String** | Jira Data Center base URL |  [optional] |
|**atlassianProducts** | **List&lt;String&gt;** | Atlassian products to connect to on cloud: jira, confluence or both (default both) |  [optional] |
|**atlassianToken** | **String** | Atlassian Cloud service account API token or user API token |  [optional] |
|**atlassianUrl** | **String** | Atlassian Cloud site base URL (https://&lt;site&gt;.atlassian.net) |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



