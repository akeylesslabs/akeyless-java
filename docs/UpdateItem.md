

# UpdateItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerType** | **String** |  |  [optional] |
|**accessibility** | **String** | for personal password manager |  [optional] |
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**certFileData** | **String** | PEM Certificate in a Base64 format. Used for updating RSA keys&#39; certificates. |  [optional] |
|**certificateFormat** | **String** |  |  [optional] |
|**changeEvent** | **String** | Trigger an event when a secret value changed [true/false] (Relevant only for Static Secret) |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional] |
|**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for Secure Remote Access of ssh cert issuer, ldap rotated secret and ldap dynamic secret |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Current item name |  |
|**newMetadata** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New item name |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional] |
|**secureAccessAddHost** | **List&lt;String&gt;** | List of the new hosts that will be attached to SRA servers host |  [optional] |
|**secureAccessAllowExternalUser** | **String** | Allow providing external user for a domain users [true/false] |  [optional] |
|**secureAccessAllowPortForwading** | **Boolean** | Enable Port forwarding while using CLI access (relevant only for EKS/GKE/K8s Dynamic-Secret) |  [optional] |
|**secureAccessApi** | **String** | Bastion&#39;s SSH control API endpoint. E.g. https://my.sra-server:9900 (relevant only for ssh cert issuer) |  [optional] |
|**secureAccessAwsAccountId** | **String** | The AWS account id (relevant only for aws) |  [optional] |
|**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli (relevant only for aws) |  [optional] |
|**secureAccessAwsRegion** | **String** | The AWS region (relevant only for aws) |  [optional] |
|**secureAccessBastionApi** | **String** | Deprecated. use secure-access-api |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessBastionSsh** | **String** | Deprecated. use secure-access-ssh |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessClusterEndpoint** | **String** | The K8s cluster endpoint URL (relevant only for EKS/GKE/K8s Dynamic-Secret) |  [optional] |
|**secureAccessDashboardUrl** | **String** | The K8s dashboard url (relevant only for k8s) |  [optional] |
|**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessDbSchema** | **String** | The DB schema (relevant only for DB Dynamic-Secret) |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdGatewayServer** | **String** | RD Gateway server (relevant only for rdp) |  [optional] |
|**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret) |  [optional] |
|**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional] |
|**secureAccessRmHost** | **List&lt;String&gt;** | List of the existent hosts that will be removed from SRA servers host |  [optional] |
|**secureAccessSsh** | **String** | Bastion&#39;s SSH server. E.g. my.sra-server:22 (relevant only for ssh cert issuer) |  [optional] |
|**secureAccessSshCreds** | **String** | Secret values contains SSH Credentials, either Private Key or Password [password/private-key] (relevant only for Static-Secret or Rotated-secret) |  [optional] |
|**secureAccessSshCredsUser** | **String** | SSH username to connect to target server, must be in &#39;Allowed Users&#39; list (relevant only for ssh cert issuer) |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessUseInternalBastion** | **Boolean** | Deprecated. Use secure-access-use-internal-ssh-access |  [optional] |
|**secureAccessUseInternalSshAccess** | **Boolean** | Use internal SSH Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



