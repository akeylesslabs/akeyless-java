

# CreateAuthMethodK8S

createAuthMethodK8S is a command that creates a new auth method that will be able to authenticate using K8S.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**audience** | **String** | The audience in the Kubernetes JWT that the access is restricted to |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional]
**boundNamespaces** | **List&lt;String&gt;** | A list of namespaces that the access is restricted to |  [optional]
**boundPodNames** | **List&lt;String&gt;** | A list of pod names that the access is restricted to |  [optional]
**boundSaNames** | **List&lt;String&gt;** | A list of service account names that the access is restricted to |  [optional]
**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional]
**genKey** | **String** | If this flag is set to true, there is no need to manually provide a public key for the Kubernetes Auth Method, and instead, a key pair, will be generated as part of the command and the private part of the key will be returned (the private key is required for the K8S Auth Config in the Akeyless Gateway) |  [optional]
**name** | **String** | Auth Method name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**publicKey** | **String** | Base64-encoded public key text for K8S authentication method is required [RSA2048] |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



