

# CreateNativeK8STarget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sClusterCaCert** | **String** | K8S cluster CA certificate | 
**k8sClusterEndpoint** | **String** | K8S cluster URL endpoint | 
**k8sClusterToken** | **String** | K8S cluster Bearer token | 
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Target name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useGwServiceAccount** | **Boolean** | Use the GW&#39;s service account |  [optional]



