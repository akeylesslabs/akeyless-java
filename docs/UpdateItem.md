

# UpdateItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional]
**certFileData** | **String** | PEM Certificate in a Base64 format. Used for updating RSA keys&#39; certificates. |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Current item name | 
**newMetadata** | **String** | Deprecated - use description |  [optional]
**newName** | **String** | New item name |  [optional]
**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional]
**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] (relevant only for Rotated-secret) |  [optional]
**secureAccessAddHost** | **List&lt;String&gt;** | List of the new hosts that will be attached to SRA servers host |  [optional]
**secureAccessAllowExternalUser** | **String** | Allow providing external user for a domain users [true/false] |  [optional]
**secureAccessAllowPortForwading** | **Boolean** | Enable Port forwarding while using CLI access (relevant only for EKS/GKE/K8s Dynamic-Secret) |  [optional]
**secureAccessAwsAccountId** | **String** | The AWS account id (relevant only for aws) |  [optional]
**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli (relevant only for aws) |  [optional]
**secureAccessAwsRegion** | **String** | The AWS region (relevant only for aws) |  [optional]
**secureAccessBastionApi** | **String** | Bastion&#39;s SSH control API endpoint. E.g. https://my.bastion:9900 (relevant only for ssh cert issuer) |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessBastionSsh** | **String** | Bastion&#39;s SSH server. E.g. my.bastion:22 (relevant only for ssh cert issuer) |  [optional]
**secureAccessClusterEndpoint** | **String** | The K8s cluster endpoint URL (relevant only for EKS/GKE/K8s Dynamic-Secret) |  [optional]
**secureAccessDashboardUrl** | **String** | The K8s dashboard url (relevant only for k8s) |  [optional]
**secureAccessDbName** | **String** | The DB name (relevant only for DB Dynamic-Secret) |  [optional]
**secureAccessDbSchema** | **String** | The DB schema (relevant only for DB Dynamic-Secret) |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional]
**secureAccessRdGatewayServer** | **String** | RD Gateway server (relevant only for rdp) |  [optional]
**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret) |  [optional]
**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional]
**secureAccessRmHost** | **List&lt;String&gt;** | List of the existent hosts that will be removed from SRA servers host |  [optional]
**secureAccessSshCreds** | **String** | Secret values contains SSH Credentials, either Private Key or Password [password/private-key] (relevant only for Static-Secret or Rotated-secret) |  [optional]
**secureAccessSshCredsUser** | **String** | SSH username to connect to target server, must be in &#39;Allowed Users&#39; list (relevant only for ssh cert issuer) |  [optional]
**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional]
**secureAccessUseInternalBastion** | **Boolean** | Use internal SSH Bastion |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless Web Access Bastion |  [optional]
**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless Web Access Bastion |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



