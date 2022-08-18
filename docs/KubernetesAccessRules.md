

# KubernetesAccessRules

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** |  |  [optional]
**audience** | **String** | Audience is an optional Kubernetes jwt claim to verify |  [optional]
**boundNamespaces** | **List&lt;String&gt;** | A list of namespaces that the authentication is restricted to. |  [optional]
**boundPodNames** | **List&lt;String&gt;** | A list of pods names that the authentication is restricted to. |  [optional]
**boundServiceAccountNames** | **List&lt;String&gt;** | A list of service account names that the authentication is restricted to. |  [optional]
**genKeyPair** | **String** | Generate public/private key (the private key is required for the K8S Auth Config in the Akeyless Gateway) |  [optional]
**pubKey** | **String** | The public key value of the Kubernetes auth method configuration in the Akeyless Gateway. |  [optional]



