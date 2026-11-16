

# TargetCreateAnthropic

targetCreateAnthropic is a command that creates a new anthropic target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anthropicUrl** | **String** | Base URL of the Anthropic API |  [optional] |
|**apiKey** | **String** | API key for Anthropic |  [optional] |
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
|**useGwCloudIdentity** | **Boolean** | Use the Gateway&#39;s cloud identity (Anthropic Workload Identity Federation) instead of an API key |  [optional] |
|**wifAzureAudience** | **String** | Identifier URI (api://&lt;app-id&gt;) of the Entra app registration for the Claude API audience, required with the azure source |  [optional] |
|**wifFederationRuleId** | **String** | Federation rule ID (fdrl_...), required with use-gw-cloud-identity |  [optional] |
|**wifIdentityTokenSource** | **String** | Where the Gateway reads its identity token: file (default), gcp, aws or azure |  [optional] |
|**wifOrganizationId** | **String** | Anthropic organization ID (UUID), required with use-gw-cloud-identity |  [optional] |
|**wifServiceAccountId** | **String** | Claude service account ID (svac_...), required with use-gw-cloud-identity |  [optional] |
|**wifWorkspaceId** | **String** | Workspace ID (wrkspc_...), needed only when the federation rule covers more than one workspace |  [optional] |



