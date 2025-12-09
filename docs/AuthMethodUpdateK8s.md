

# AuthMethodUpdateK8s

authMethodUpdateK8s is a command that updates a new auth method that will be able to authenticate using K8S.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional] |
|**allowedClientType** | **List&lt;String&gt;** | limit the auth method usage for specific client types [cli,ui,gateway-admin,sdk,mobile,extension] |  [optional] |
|**audience** | **String** | The audience in the Kubernetes JWT that the access is restricted to |  [optional] |
|**auditLogsClaims** | **List&lt;String&gt;** | Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot; |  [optional] |
|**boundIps** | **List&lt;String&gt;** | A CIDR whitelist with the IPs that the access is restricted to |  [optional] |
|**boundNamespaces** | **List&lt;String&gt;** | A list of namespaces that the access is restricted to |  [optional] |
|**boundPodNames** | **List&lt;String&gt;** | A list of pod names that the access is restricted to |  [optional] |
|**boundSaNames** | **List&lt;String&gt;** | A list of service account names that the access is restricted to |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Auth Method description |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the auth method would you like to be notified. |  [optional] |
|**forceSubClaims** | **Boolean** | if true: enforce role-association must include sub claims |  [optional] |
|**genKey** | **String** | Automatically generate key-pair for K8S configuration. If set to false, a public key needs to be provided [true/false] |  [optional] |
|**gwBoundIps** | **List&lt;String&gt;** | A CIDR whitelist with the GW IPs that the access is restricted to |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**jwtTtl** | **Long** | Jwt TTL |  [optional] |
|**name** | **String** | Auth Method name |  |
|**newName** | **String** | Auth Method new name |  [optional] |
|**productType** | **List&lt;String&gt;** | Choose the relevant product type for the auth method [sm, sra, pm, dp, ca] |  [optional] |
|**publicKey** | **String** | Base64-encoded or PEM formatted public key data for K8S authentication method is required [RSA2048] |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



