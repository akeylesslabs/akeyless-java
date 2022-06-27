

# GatewayCreateProducerNativeK8S

gatewayCreateProducerNativeK8S is a command that creates k8s producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**k8sClusterCaCert** | **String** | K8S cluster CA certificate |  [optional]
**k8sClusterEndpoint** | **String** | K8S cluster URL endpoint |  [optional]
**k8sClusterToken** | **String** | K8S cluster Bearer token |  [optional]
**k8sNamespace** | **String** | K8S namespace |  [optional]
**k8sServiceAccount** | **String** | K8S service account |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessAllowPortForwading** | **Boolean** |  |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessClusterEndpoint** | **String** |  |  [optional]
**secureAccessDashboardUrl** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessWeb** | **Boolean** |  |  [optional]
**secureAccessWebBrowsing** | **Boolean** |  |  [optional]
**secureAccessWebProxy** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



