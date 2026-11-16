

# AnthropicTargetDetails

AnthropicTargetDetails defines details related to connecting to an Anthropic provider

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anthropicUrl** | **String** |  |  [optional] |
|**apiKey** | **String** |  |  [optional] |
|**useGwCloudIdentity** | **Boolean** | UseGatewayCloudIdentity authenticates with Anthropic Workload Identity Federation instead of ApiKey: the Gateway exchanges its own identity token for a short-lived Anthropic access token. ApiKey must be empty. See go/src/targets/llm/anthropic_wif_client.go. |  [optional] |
|**wifAzureAudience** | **String** | WIFAzureAudience is the identifier URI (api://&lt;app-id&gt;) of the Entra app registration that represents the Claude API audience. Required with the azure source, empty with every other source. |  [optional] |
|**wifFederationRuleId** | **String** | WIFFederationRuleID is the federation rule ID (fdrl_...). |  [optional] |
|**wifIdentityTokenSource** | **String** | WIFIdentityTokenSource selects where the Gateway takes its identity token: file (default, projected Kubernetes or SPIFFE token), gcp (Google Cloud metadata server), aws (STS web identity token) or azure (Microsoft Entra ID). |  [optional] |
|**wifOrganizationId** | **String** | WIFOrganizationID is the UUID of the Anthropic organization. |  [optional] |
|**wifServiceAccountId** | **String** | WIFServiceAccountID is the Claude service account ID (svac_...). |  [optional] |
|**wifWorkspaceId** | **String** | WIFWorkspaceID is the optional workspace ID (wrkspc_...). Required by Anthropic only when the rule is enabled for more than one workspace. |  [optional] |



