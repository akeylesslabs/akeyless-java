

# UscDelete

uscDelete is a command that deletes a secret from a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**awsAccountId** | **String** | The AWS account ID that contains the secret. Required when the connector spans multiple account IDs. |  [optional] |
|**forceDelete** | **Boolean** | Force delete objects that are soft deleted by default (relavent only for Azure target) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**namespace** | **String** | The namespace (relevant for Hashi vault target) |  [optional] |
|**objectType** | **String** |  |  [optional] |
|**region** | **String** | The AWS region that contains the secret (AWS only). If empty, uses the target region. |  [optional] |
|**secretId** | **String** | The universal secrets id (or name, for AWS, Azure, K8s or Hashi vault targets) to delete |  |
|**selectedRepositories** | **String** | GitHub selected repositories. For repository scope: repo name. For repository-environment scope: repo/env (format: repo-name/env-name). Required when multiple repos/envs configured. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscName** | **String** | Name of the Universal Secrets Connector item |  |



