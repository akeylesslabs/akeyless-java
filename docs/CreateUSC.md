

# CreateUSC

CreateUSC is a command that creates a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**azureKvName** | **String** | Azure Key Vault name (Relevant only for Azure targets) |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the Universal Secrets Connector |  [optional] |
|**environmentNames** | **String** | The environments in repo-name/environment-name format, comma-separated (only relevant for: github-scope&#x3D;repository-environment) |  [optional] |
|**gcpProjectId** | **String** | GCP Project ID (Relevant only for GCP targets) |  [optional] |
|**gcpSmRegions** | **String** | GCP Secret Manager regions to query for regional secrets (comma-separated, e.g., us-east1,us-west1). Max 12 regions. Required when listing with object-type&#x3D;regional-secrets. |  [optional] |
|**githubScope** | **String** | The scope where secrets will be created, available options: [repository, organization, repository-environment] |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**k8sNamespace** | **String** | K8s namespace (Relevant to Kubernetes targets) |  [optional] |
|**name** | **String** | Universal Secrets Connector name |  |
|**organizationName** | **String** | The organization name to create the secret in |  [optional] |
|**repositoryAccess** | **String** |  |  [optional] |
|**repositoryNames** | **String** | The repository names, comma-separated (only relevant for: github-scope&#x3D;repository) |  [optional] |
|**tags** | **List&lt;String&gt;** | List of the tags attached to this Universal Secrets Connector |  [optional] |
|**targetToAssociate** | **String** | Target Universal Secrets Connector to connect |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscPrefix** | **String** | Prefix for all secrets created in AWS Secrets Manager |  [optional] |
|**uscTags** | **String** | Comma-separated list of tags to apply to all secrets created on the remote USC |  [optional] |
|**usePrefixAsFilter** | **String** | Whether to filter the USC secret list using the specified usc-prefix [true/false] |  [optional] |
|**useTagsAsFilter** | **Boolean** | Filter the USC secret list by the value(s) of --usc-tags. [true|false] |  [optional] |



