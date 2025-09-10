

# Auth


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessId** | **String** | Access ID |  [optional] |
|**accessKey** | **String** | Access key (relevant only for access-type&#x3D;access_key) |  [optional] |
|**accessType** | **String** | Access Type (access_key/password/saml/ldap/k8s/azure_ad/oidc/aws_iam/universal_identity/jwt/gcp/cert/oci/kerberos) |  [optional] |
|**accountId** | **String** | Account id (relevant only for access-type&#x3D;password where the email address is associated with more than one account) |  [optional] |
|**adminEmail** | **String** | Email (relevant only for access-type&#x3D;password) |  [optional] |
|**adminPassword** | **String** | Password (relevant only for access-type&#x3D;password) |  [optional] |
|**certChallenge** | **String** | Certificate challenge encoded in base64. (relevant only for access-type&#x3D;cert) |  [optional] |
|**certData** | **String** | Certificate data encoded in base64. Used if file was not provided. (relevant only for access-type&#x3D;cert) |  [optional] |
|**cloudId** | **String** | The cloud identity (relevant only for access-type&#x3D;azure_ad,aws_iam,gcp) |  [optional] |
|**debug** | **Boolean** |  |  [optional] |
|**disablePafxfast** | **String** | Disable the FAST negotiation in the Kerberos authentication method |  [optional] |
|**gatewaySpn** | **String** | The service principal name of the gateway as registered in LDAP (i.e., HTTP/gateway) |  [optional] |
|**gatewayUrl** | **String** | Gateway URL relevant only for access-type&#x3D;k8s/oauth2/saml/oidc |  [optional] |
|**gcpAudience** | **String** | GCP JWT audience |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**jwt** | **String** | The Json Web Token (relevant only for access-type&#x3D;jwt/oidc) |  [optional] |
|**k8sAuthConfigName** | **String** | The K8S Auth config name (relevant only for access-type&#x3D;k8s) |  [optional] |
|**k8sServiceAccountToken** | **String** | The K8S service account token. (relevant only for access-type&#x3D;k8s) |  [optional] |
|**kerberosToken** | **String** | KerberosToken represents a Kerberos token generated for the gateway SPN (Service Principal Name). |  [optional] |
|**kerberosUsername** | **String** | TThe username for the entry within the keytab to authenticate via Kerberos |  [optional] |
|**keyData** | **String** | Private key data encoded in base64. Used if file was not provided.(relevant only for access-type&#x3D;cert) |  [optional] |
|**keytabData** | **String** | Base64-encoded content of a valid keytab file, containing the service account&#39;s entry. |  [optional] |
|**krb5ConfData** | **String** | Base64-encoded content of a valid krb5.conf file, specifying the settings and parameters required for Kerberos authentication. |  [optional] |
|**ldapPassword** | **String** | LDAP password (relevant only for access-type&#x3D;ldap) |  [optional] |
|**ociAuthType** | **String** | The type of the OCI configuration to use [instance/apikey/resource] (relevant only for access-type&#x3D;oci) |  [optional] |
|**ociGroupOcid** | **List&lt;String&gt;** | A list of Oracle Cloud IDs groups (relevant only for access-type&#x3D;oci) |  [optional] |
|**otp** | **String** |  |  [optional] |
|**signedCertChallenge** | **String** | Signed certificate challenge encoded in base64. (relevant only for access-type&#x3D;cert) |  [optional] |
|**uidToken** | **String** | The universal_identity token (relevant only for access-type&#x3D;universal_identity) |  [optional] |
|**useRemoteBrowser** | **Boolean** | Returns a link to complete the authentication remotely (relevant only for access-type&#x3D;saml/oidc) |  [optional] |
|**username** | **String** | LDAP username (relevant only for access-type&#x3D;ldap) |  [optional] |



