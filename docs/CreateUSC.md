

# CreateUSC

CreateUSC is a command that creates a Universal Secrets Connector

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azureKvName** | **String** | Azure Key Vault name (Relevant only for Azure targets) |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the Universal Secrets Connector |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sNamespace** | **String** | K8s namespace (Relevant to Kubernetes targets) |  [optional]
**name** | **String** | Universal Secrets Connector name | 
**tags** | **List&lt;String&gt;** | List of the tags attached to this Universal Secrets Connector |  [optional]
**targetToAssociate** | **String** | Target Universal Secrets Connector to connect | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



