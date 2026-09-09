

# UpdateItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerType** | **String** |  |  [optional] |
|**accessibility** | **String** | for personal password manager |  [optional] |
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**araEnabled** | **Boolean** | Enable or disable Agentic Runtime Authority rule enforcement for this item. When false, user-defined input/output rules are stored but not enforced; the base security validation still runs.  AraEnabled is tri-state (nil/true/false), not a plain bool: it self-encodes its wire value (see akl.OptionalBool) so an explicit false survives the curl-proxy relay instead of being dropped like a default-false bool flag. |  [optional] |
|**certFileData** | **String** | PEM Certificate in a Base64 format. Used for updating RSA keys&#39; certificates. |  [optional] |
|**certificateFormat** | **String** |  |  [optional] |
|**changeEvent** | **String** | Trigger an event when a secret value changed [true/false] (Relevant only for Static Secret) |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enableAgenticRuntimeAuthority** | **Boolean** | EnableAra is the documented spelling of AraEnabled. Both set the same field; --ara-enabled shipped first and stays as an undocumented alias so existing scripts and the Terraform provider keep working. |  [optional] |
|**enableAiQuorum** | **Boolean** | Turns on AI Quorum checks for this item. |  [optional] |
|**expirationEventIn** | **List&lt;String&gt;** | How many days before the expiration of the certificate would you like to be notified. |  [optional] |
|**gcpSmRegions** | **String** | GCP Secret Manager regions to query for regional secrets (comma-separated, e.g., us-east1,us-west1). Max 12 regions. USC with GCP targets only. |  [optional] |
|**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for SRA items. |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**lockDuringSraSession** | **String** | Lock this secret for read/update while an SRA session is active |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Current item name |  |
|**newMetadata** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New item name |  [optional] |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotateAfterDisconnect** | **String** | StringOrBool accepts JSON strings, booleans, and numbers for backward compatibility with older SDK versions that send boolean values for rotate-after-disconnect. |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
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
|**secureAccessEnforceHostsRestriction** | **Boolean** | Enforce connections only to allowed SRA hosts |  [optional] |
|**secureAccessGateway** | **String** |  |  [optional] |
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
|**target** | **List&lt;String&gt;** | A list of targets to be associated with an SRA item, To specify multiple targets use argument multiple times |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscTags** | **String** | Comma-separated list of tags to apply to all secrets created/synced on the remote USC  USC items only. |  [optional] |
|**useTagsAsFilter** | **String** | Whether to filter the USC secret list using the specified usc-tags [true/false]  USC items only. |  [optional] |



