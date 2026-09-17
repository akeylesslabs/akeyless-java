

# GatewayCreateProducerRdp

gatewayCreateProducerRdp is a command that creates rdp producer [Deprecated: Use dynamic-secret-create-rdp command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerType** | **String** |  |  [optional] |
|**allowUserExtendSession** | **Long** | AllowUserExtendSession |  [optional] |
|**araEnabled** | **Boolean** | Enable or disable Agentic Runtime Authority rule enforcement for this item. Mirrors commands.AgenticRulesParams.AraEnabled. |  [optional] |
|**blockParentTargetAccess** | **String** | Block access to the parent target when using a linked target [true/false]. Empty keeps the existing value on update |  [optional] |
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**enableAgenticRuntimeAuthority** | **Boolean** | EnableAra is the documented spelling of AraEnabled; --ara-enabled shipped first and stays as an undocumented alias. |  [optional] |
|**enableAiQuorum** | **Boolean** | Turns on AI Quorum checks for this item. |  [optional] |
|**fixedUserClaimKeyname** | **String** | For externally provided users, denotes the key-name of IdP claim to extract the username from (relevant only for fixed-user-only&#x3D;true) |  [optional] |
|**fixedUserOnly** | **String** | Allow access using externally (IdP) provided username [true/false] |  [optional] |
|**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for SRA items. |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) Mirrors commands.AgenticRulesParams — kept separate because ResourceDS cannot embed it (different package, different struct layout). |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**rdpAdminName** | **String** | RDP Admin Name |  [optional] |
|**rdpAdminPwd** | **String** | RDP Admin password |  [optional] |
|**rdpHostName** | **String** | Hostname |  [optional] |
|**rdpHostPort** | **String** | Port |  [optional] |
|**rdpUserGroups** | **String** | Groups |  [optional] |
|**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessEnforceHostsRestriction** | **Boolean** | Enforce connections only to allowed SRA hosts |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdGatewayServer** | **String** | RD Gateway server |  [optional] |
|**secureAccessRdpDomain** | **String** | Required when the Dynamic Secret is used for a domain user |  [optional] |
|**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional] |
|**skipDryRun** | **Boolean** | If set, dry-run will be skipped [true/false] |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**target** | **List&lt;String&gt;** | A list of targets to be associated with an SRA item, To specify multiple targets use argument multiple times |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useCapitalLetters** | **String** | Specifies whether the generated temporary password must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). [true/false] |  [optional] |
|**useLowerLetters** | **String** | Specifies whether the generated temporary password must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). [true/false] |  [optional] |
|**useNumbers** | **String** | Specifies whether the generated temporary password must contain at least one numeric character (0 to 9). [true/false] |  [optional] |
|**useSpecialCharacters** | **String** |  |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |
|**warnUserBeforeExpiration** | **Long** | WarnBeforeUserExpiration |  [optional] |



