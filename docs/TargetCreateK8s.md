

# TargetCreateK8s

targetCreateK8s is a command that creates a new k8s target

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sAuthType** | **String** | K8S auth type [token/certificate] |  [optional]
**k8sClientCertificate** | **String** | Content of the k8 client certificate (PEM format) in a Base64 format |  [optional]
**k8sClientKey** | **String** | Content of the k8 client private key (PEM format) in a Base64 format |  [optional]
**k8sClusterCaCert** | **String** | K8S cluster CA certificate | 
**k8sClusterEndpoint** | **String** | K8S cluster URL endpoint | 
**k8sClusterName** | **String** | K8S cluster name |  [optional]
**k8sClusterToken** | **String** | K8S cluster Bearer token | 
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useGwServiceAccount** | **Boolean** | Use the GW&#39;s service account |  [optional]



