

# RotatedSecretUpdateLdap


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerType** | **String** |  |  [optional] |
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**araEnabled** | **Boolean** | Enable or disable Agentic Runtime Authority rule enforcement for this item. When false, user-defined input/output rules are stored but not enforced; the base security validation still runs.  AraEnabled is tri-state (nil/true/false), not a plain bool: it self-encodes its wire value (see akl.OptionalBool) so an explicit false survives the curl-proxy relay instead of being dropped like a default-false bool flag. |  [optional] |
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** |  |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enableAgenticRuntimeAuthority** | **Boolean** | EnableAra is the documented spelling of AraEnabled. Both set the same field; --ara-enabled shipped first and stays as an undocumented alias so existing scripts and the Terraform provider keep working. |  [optional] |
|**enableAiQuorum** | **Boolean** | Turns on AI Quorum checks for this item. |  [optional] |
|**hostProvider** | **String** | Host provider type [explicit/target], Default Host provider is explicit, Relevant only for SRA items. |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** |  |  [optional] |
|**lockDuringSraSession** | **String** | Lock this secret for read/update while an SRA session is active |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**newName** | **String** | New item name |  [optional] |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotateAfterDisconnect** | **String** | StringOrBool accepts JSON strings, booleans, and numbers for backward compatibility with older SDK versions that send boolean values for rotate-after-disconnect. |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**rotatedPassword** | **String** | rotated-username password (relevant only for rotator-type&#x3D;ldap) |  [optional] |
|**rotatedUsername** | **String** | username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;ldap) |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** |  |  [optional] |
|**rotationInterval** | **String** |  |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessEnforceHostsRestriction** | **Boolean** | Enforce connections only to allowed SRA hosts |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdpDomain** | **String** | Default domain name server. i.e. microsoft.com |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**skipDryRun** | **Boolean** | If set, dry-run will be skipped [true/false] |  [optional] |
|**target** | **List&lt;String&gt;** | A list of targets to be associated with an SRA item, To specify multiple targets use argument multiple times |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useCapitalLetters** | **String** | Specifies whether the generated temporary password must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). [true/false] |  [optional] |
|**useLowerLetters** | **String** | Specifies whether the generated temporary password must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). [true/false] |  [optional] |
|**useNumbers** | **String** | Specifies whether the generated temporary password must contain at least one numeric character (0 to 9). [true/false] |  [optional] |
|**useSpecialCharacters** | **String** |  |  [optional] |
|**userAttribute** | **String** | LDAP User Attribute, Default value \&quot;cn\&quot; |  [optional] |
|**userDn** | **String** | Base DN to Perform User Search |  [optional] |



