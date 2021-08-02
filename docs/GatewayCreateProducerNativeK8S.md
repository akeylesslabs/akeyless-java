

# GatewayCreateProducerNativeK8S

gatewayCreateProducerNativeK8S is a command that creates k8s producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**k8sClusterCaCert** | **String** | K8S cluster CA certificate | 
**k8sClusterEndpoint** | **String** | K8S cluster URL endpoint | 
**k8sClusterToken** | **String** | K8S cluster Bearer token | 
**k8sNamespace** | **String** | K8S namespace |  [optional]
**k8sServiceAccount** | **String** | K8S service account | 
**name** | **String** | Producer name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessAllowPortForwading** | **Boolean** |  |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessClusterEndpoint** | **String** |  |  [optional]
**secureAccessDashboardUrl** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessWebBrowsing** | **Boolean** |  |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



