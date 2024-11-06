

# Configure


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | Access ID |  [optional]
**accessKey** | **String** | Access Key |  [optional]
**accessType** | **String** | Access Type (access_key/password/azure_ad/saml/oidc/aws_iam/gcp/k8s/cert) |  [optional]
**accountId** | **String** | Account id (relevant only for access-type&#x3D;password where the email address is associated with more than one account) |  [optional]
**adminEmail** | **String** | Email (relevant only for access-type&#x3D;password) |  [optional]
**adminPassword** | **String** | Password (relevant only for access-type&#x3D;password) |  [optional]
**azureAdObjectId** | **String** | Azure Active Directory ObjectId (relevant only for access-type&#x3D;azure_ad) |  [optional]
**certData** | **String** | Certificate data encoded in base64. Used if file was not provided. (relevant only for access-type&#x3D;cert in Curl Context) |  [optional]
**certIssuerName** | **String** | Certificate Issuer Name |  [optional]
**certUsername** | **String** | The username to sign in the SSH certificate (use a comma-separated list for more than one username) |  [optional]
**defaultLocationPrefix** | **String** | Default path prefix for name of items, targets and auth methods |  [optional]
**disablePafxfast** | **String** | Disable the FAST negotiation in the Kerberos authentication method |  [optional]
**gatewaySpn** | **String** | The service principal name of the gateway as registered in LDAP (i.e., HTTP/gateway) |  [optional]
**gcpAudience** | **String** | GCP JWT audience |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sAuthConfigName** | **String** | The K8S Auth config name (relevant only for access-type&#x3D;k8s) |  [optional]
**kerberosUsername** | **String** | TThe username for the entry within the keytab to authenticate via Kerberos |  [optional]
**keyData** | **String** | Private key data encoded in base64. Used if file was not provided.(relevant only for access-type&#x3D;cert in Curl Context) |  [optional]
**keytabData** | **String** | Base64-encoded content of a valid keytab file, containing the service account&#39;s entry. |  [optional]
**krb5ConfData** | **String** | Base64-encoded content of a valid krb5.conf file, specifying the settings and parameters required for Kerberos authentication. |  [optional]
**legacySigningAlgName** | **Boolean** | Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the certificate. |  [optional]
**ociAuthType** | **String** | The type of the OCI configuration to use [instance/apikey/resource] (relevant only for access-type&#x3D;oci) |  [optional]
**ociGroupOcid** | **List&lt;String&gt;** | A list of Oracle Cloud IDs groups (relevant only for access-type&#x3D;oci) |  [optional]



