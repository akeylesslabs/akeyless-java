

# GatewayGetK8SAuthConfigOutput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amTokenExpiration** | **Long** | AuthMethodTokenExpiration is time in seconds of expiration of the Akeyless Kube Auth Method token |  [optional]
**authMethodAccessId** | **String** | AuthMethodAccessId of the Kubernetes auth method |  [optional]
**authMethodPrvKeyPem** | **String** | AuthMethodSigningKey is the private key (in base64 of the PEM format) associated with the public key defined in the Kubernetes auth method, that used to sign the internal token for the Akeyless Kubernetes Auth Method |  [optional]
**disableIssValidation** | **Boolean** | DisableISSValidation is optional parameter to disable ISS validation |  [optional]
**id** | **String** |  |  [optional]
**k8sCaCert** | **String** | K8SCACert is the CA Cert to use to call into the kubernetes API |  [optional]
**k8sHost** | **String** | K8SHost is the url string for the kubernetes API |  [optional]
**k8sIssuer** | **String** | K8SIssuer is the claim that specifies who issued the Kubernetes token |  [optional]
**k8sPubKeysPem** | **List&lt;String&gt;** | K8SPublicKeysPEM is the list of public key in PEM format |  [optional]
**k8sTokenReviewerJwt** | **String** | K8STokenReviewerJW\&quot;K8S Auth config %v successfully created\\n\&quot;, clictx.Color().Bold(c.K8SAuthConfigName)T is the bearer to use during the TokenReview API call |  [optional]
**name** | **String** |  |  [optional]
**protectionKey** | **String** |  |  [optional]
**useLocalCaJwt** | **Boolean** | UseLocalCAJwt is an optional parameter to set defaulting to using the local CA cert and service account jwt when running in a Kubernetes pod |  [optional]



