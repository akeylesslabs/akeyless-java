

# GatewayCreateMigration

gatewayCreateMigration is a command that create migration
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_1passwordEmail** | **String** | 1Password user email to connect to the API |  [optional]
**_1passwordPassword** | **String** | 1Password user password to connect to the API |  [optional]
**_1passwordSecretKey** | **String** | 1Password user secret key to connect to the API |  [optional]
**_1passwordUrl** | **String** | 1Password api container url |  [optional]
**_1passwordVaults** | **List&lt;String&gt;** | 1Password list of vault to get the items from |  [optional]
**adAutoRotate** | **String** | Enable/Disable automatic/recurrent rotation for migrated secrets. Default is false: only manual rotation is allowed for migrated secrets. If set to true, this command should be combined with --ad-rotation-interval and --ad-rotation-hour parameters (Relevant only for Active Directory migration) |  [optional]
**adComputerBaseDn** | **String** | Distinguished Name of Computer objects (servers) to search in Active Directory e.g.: CN&#x3D;Computers,DC&#x3D;example,DC&#x3D;com (Relevant only for Active Directory migration) |  [optional]
**adDiscoverLocalUsers** | **String** | Enable/Disable discovery of local users from each domain server and migrate them as SSH Rotated Secrets. Default is false: only domain users will be migrated. Discovery of local users might require further installation of SSH on the servers, based on the supplied computer base DN. This will be implemented automatically as part of the migration process (Relevant only for Active Directory migration) |  [optional]
**adDomainName** | **String** | Active Directory Domain Name (Relevant only for Active Directory migration) |  [optional]
**adDomainUsersPathTemplate** | **String** | Path location template for migrating domain users as Rotated Secrets e.g.: .../DomainUsers/{{USERNAME}} (Relevant only for Active Directory migration) |  [optional]
**adLocalUsersIgnore** | **String** | Comma-separated list of Local Users which should not be migrated (Relevant only for Active Directory migration) |  [optional]
**adLocalUsersPathTemplate** | **String** | Path location template for migrating domain users as Rotated Secrets e.g.: .../LocalUsers/{{COMPUTER_NAME}}/{{USERNAME}} (Relevant only for Active Directory migration) |  [optional]
**adRotationHour** | **Integer** | The hour of the scheduled rotation in UTC (Relevant only for Active Directory migration) |  [optional]
**adRotationInterval** | **Integer** | The number of days to wait between every automatic rotation [1-365] (Relevant only for Active Directory migration) |  [optional]
**adSraEnableRdp** | **String** | Enable/Disable RDP Secure Remote Access for the migrated local users rotated secrets. Default is false: rotated secrets will not be created with SRA (Relevant only for Active Directory migration) |  [optional]
**adTargetName** | **String** | Active Directory LDAP Target Name. Server type should be Active Directory (Relevant only for Active Directory migration) |  [optional]
**adTargetsPathTemplate** | **String** | Path location template for migrating domain servers as SSH Targets e.g.: .../Servers/{{COMPUTER_NAME}} (Relevant only for Active Directory migration) |  [optional]
**adUserBaseDn** | **String** | Distinguished Name of User objects to search in Active Directory, e.g.: CN&#x3D;Users,DC&#x3D;example,DC&#x3D;com (Relevant only for Active Directory migration) |  [optional]
**adUserGroups** | **String** | Comma-separated list of domain groups from which privileged domain users will be migrated (Relevant only for Active Directory migration) |  [optional]
**asSshPort** | **String** | Set the SSH Port for further connection to the domain servers. Default is port 22 (Relevant only for Active Directory migration) |  [optional]
**awsKey** | **String** | AWS Secret Access Key (relevant only for AWS migration) |  [optional]
**awsKeyId** | **String** | AWS Access Key ID with sufficient permissions to get all secrets, e.g. &#39;arn:aws:secretsmanager:[Region]:[AccountId]:secret:[/path/to/secrets/_*]&#39; (relevant only for AWS migration) |  [optional]
**awsRegion** | **String** | AWS region of the required Secrets Manager (relevant only for AWS migration) |  [optional]
**azureClientId** | **String** | Azure Key Vault Access client ID, should be Azure AD App with a service principal (relevant only for Azure Key Vault migration) |  [optional]
**azureKvName** | **String** | Azure Key Vault Name (relevant only for Azure Key Vault migration) |  [optional]
**azureSecret** | **String** | Azure Key Vault secret (relevant only for Azure Key Vault migration) |  [optional]
**azureTenantId** | **String** | Azure Key Vault Access tenant ID (relevant only for Azure Key Vault migration) |  [optional]
**gcpKey** | **String** | Base64-encoded GCP Service Account private key text with sufficient permissions to Secrets Manager, Minimum required permission is Secret Manager Secret Accessor, e.g. &#39;roles/secretmanager.secretAccessor&#39; (relevant only for GCP migration) |  [optional]
**hashiJson** | **String** | Import secret key as json value or independent secrets (relevant only for HasiCorp Vault migration) [true/false] |  [optional]
**hashiNs** | **List&lt;String&gt;** | HashiCorp Vault Namespaces is a comma-separated list of namespaces which need to be imported into Akeyless Vault. For every provided namespace, all its child namespaces are imported as well, e.g. nmsp/subnmsp1/subnmsp2,nmsp/anothernmsp. By default, import all namespaces (relevant only for HasiCorp Vault migration) |  [optional]
**hashiToken** | **String** | HashiCorp Vault access token with sufficient permissions to preform list &amp; read operations on secrets objects (relevant only for HasiCorp Vault migration) |  [optional]
**hashiUrl** | **String** | HashiCorp Vault API URL, e.g. https://vault-mgr01:8200 (relevant only for HasiCorp Vault migration) |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sCaCertificate** | **List&lt;Integer&gt;** | For Certificate Authentication method K8s Cluster CA certificate (relevant only for K8s migration with Certificate Authentication method) |  [optional]
**k8sClientCertificate** | **List&lt;Integer&gt;** | K8s Client certificate with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Certificate Authentication method) |  [optional]
**k8sClientKey** | **List&lt;Integer&gt;** | K8s Client key (relevant only for K8s migration with Certificate Authentication method) |  [optional]
**k8sNamespace** | **String** | K8s Namespace, Use this field to import secrets from a particular namespace only. By default, the secrets are imported from all namespaces (relevant only for K8s migration) |  [optional]
**k8sPassword** | **String** | K8s Client password (relevant only for K8s migration with Password Authentication method) |  [optional]
**k8sSkipSystem** | **Boolean** | K8s Skip Control Plane Secrets, This option allows to avoid importing secrets from system namespaces (relevant only for K8s migration) |  [optional]
**k8sToken** | **String** | For Token Authentication method K8s Bearer Token with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Token Authentication method) |  [optional]
**k8sUrl** | **String** | K8s API Server URL, e.g. https://k8s-api.mycompany.com:6443 (relevant only for K8s migration) |  [optional]
**k8sUsername** | **String** | For Password Authentication method K8s Client username with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Password Authentication method) |  [optional]
**name** | **String** | Migration name | 
**protectionKey** | **String** | The name of the key that protects the classic key value (if empty, the account default key will be used) |  [optional]
**targetLocation** | **String** | Target location in Akeyless for imported secrets | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | Migration type (hashi/aws/gcp/k8s/azure_kv/1password/active_directory) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



