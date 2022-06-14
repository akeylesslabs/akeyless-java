

# GatewayUpdateMigration

gatewayUpdateMigration is a command that update migration
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsKey** | **String** | AWS Secret Access Key |  [optional]
**awsKeyId** | **String** | AWS Access Key ID |  [optional]
**awsRegion** | **String** | AWS region |  [optional]
**azureClientId** | **String** | Azure KV Access client ID |  [optional]
**azureKvName** | **String** | Azure Key Vault Name |  [optional]
**azureSecret** | **String** | Azure KV secret |  [optional]
**azureTenantId** | **String** | Azure KV Access tenant ID |  [optional]
**gcpKey** | **String** | Base64-encoded service account private key text |  [optional]
**hashiJson** | **String** | Import secret key as json value or independent secrets |  [optional]
**hashiNs** | **List&lt;String&gt;** | Hashi namespaces |  [optional]
**hashiToken** | **String** | Hashi token |  [optional]
**hashiUrl** | **String** | Hashi url |  [optional]
**id** | **String** | Migration ID |  [optional]
**k8sCaCertificate** | **List&lt;Integer&gt;** | For Certificate Authentication method K8s Cluster CA certificate |  [optional]
**k8sClientCertificate** | **List&lt;Integer&gt;** | K8s Client certificate |  [optional]
**k8sClientKey** | **List&lt;Integer&gt;** | K8s Client key |  [optional]
**k8sNamespace** | **String** | K8s Namespace |  [optional]
**k8sPassword** | **String** | K8s client password |  [optional]
**k8sSkipSystem** | **Boolean** | K8s Skip Control Plane Secrets |  [optional]
**k8sToken** | **String** | For Token Authentication method K8s Bearer Token |  [optional]
**k8sUrl** | **String** | K8s Endpoint URL |  [optional]
**k8sUsername** | **String** | For Password Authentication method K8s client username |  [optional]
**name** | **String** | Migration name | 
**protectionKey** | **String** | The name of the key that protects the classic key value (if empty, the account default key will be used) |  [optional]
**targetLocation** | **String** | Target location in Akeyless for imported secrets |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | Migration type, can be: hashi/aws/gcp/k8s/azure_kv |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



