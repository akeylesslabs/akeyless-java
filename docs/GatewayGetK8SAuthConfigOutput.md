

# GatewayGetK8SAuthConfigOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amTokenExpiration** | **Long** | AuthMethodTokenExpiration is time in seconds of expiration of the Akeyless Kube Auth Method token |  [optional]
**authMethodAccessId** | **String** | AuthMethodAccessId of the Kubernetes auth method |  [optional]
**authMethodPrvKeyPem** | **String** | AuthMethodSigningKey is the private key (in base64 of the PEM format) associated with the public key defined in the Kubernetes auth method, that used to sign the internal token for the Akeyless Kubernetes Auth Method |  [optional]
**clusterApiType** | **String** | ClusterApiType defines types of API access to cluster |  [optional]
**disableIssValidation** | **Boolean** | DisableISSValidation is optional parameter to disable ISS validation |  [optional]
**id** | **String** |  |  [optional]
**k8sCaCert** | **String** | K8SCACert is the CA Cert to use to call into the kubernetes API |  [optional]
**k8sHost** | **String** | K8SHost is the url string for the kubernetes API |  [optional]
**k8sIssuer** | **String** | K8SIssuer is the claim that specifies who issued the Kubernetes token |  [optional]
**k8sPubKeysPem** | **List&lt;String&gt;** | K8SPublicKeysPEM is the list of public key in PEM format |  [optional]
**k8sTokenReviewerJwt** | **String** | K8STokenReviewerJWT is the bearer for clusterApiTypeK8s, used during TokenReview API call |  [optional]
**name** | **String** |  |  [optional]
**protectionKey** | **String** |  |  [optional]
**rancherApiKey** | **String** | RancherApiKey the bear token for clusterApiTypeRancher |  [optional]
**rancherClusterId** | **String** | RancherClusterId cluster id as define in rancher (in case of clusterApiTypeRancher) |  [optional]
**useLocalCaJwt** | **Boolean** | UseLocalCAJwt is an optional parameter to set defaulting to using the local service account when running in a Kubernetes pod |  [optional]



