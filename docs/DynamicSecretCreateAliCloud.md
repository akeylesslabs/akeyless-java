

# DynamicSecretCreateAliCloud

dynamicSecretCreateAliCloud is a command that creates AliCloud dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alicloudAccessKeyId** | **String** | AliCloud RAM access key ID |  [optional] |
|**alicloudAccessMode** | **String** |  |  [optional] |
|**alicloudAccessSecretKey** | **String** | AliCloud RAM access key secret |  [optional] |
|**alicloudExternalId** | **String** | The external ID in the trust policy of the AliCloud roles (relevant only for assume_role mode) |  [optional] |
|**alicloudRegion** | **String** | AliCloud region. Selects the regional STS endpoint. If empty, the global STS endpoint is used |  [optional] |
|**alicloudRoleArns** | **String** | AliCloud role ARNs allowed in the Assume Role operation (relevant only for assume_role mode) |  [optional] |
|**alicloudSessionPolicy** | **String** | Session policy document (JSON) that limits the assumed role session (relevant only for assume_role mode) |  [optional] |
|**alicloudSetSourceIdentity** | **Boolean** | Send the requester&#39;s identity as the SourceIdentity of the assumed role session, so it shows in ActionTrail (relevant only for assume_role mode). Needs sts:SetSourceIdentity in both the producer identity&#39;s policy and the role trust policy |  [optional] |
|**alicloudSite** | **String** | The Alibaba Cloud site of the account: international or china. It selects the console sign-in host of the RAM user |  [optional] |
|**alicloudUserConsoleAccess** | **Boolean** | Enable AliCloud RAM user console access (relevant only for ram_user mode) |  [optional] |
|**alicloudUserGroups** | **String** | AliCloud user groups (relevant only for ram_user mode) |  [optional] |
|**alicloudUserInlinePolicy** | **String** | RAM policy document (JSON) for a custom policy created for each RAM user (relevant only for ram_user mode) |  [optional] |
|**alicloudUserPolicies** | **String** | AliCloud policies attached to the RAM user, in the form &lt;System|Custom&gt;:&lt;PolicyName&gt; (relevant only for ram_user mode) |  [optional] |
|**alicloudUserProgrammaticAccess** | **Boolean** | Enable AliCloud RAM user programmatic access (relevant only for ram_user mode) |  [optional] |
|**araEnabled** | **Boolean** | Enable or disable Agentic Runtime Authority rule enforcement for this item. Mirrors commands.AgenticRulesParams.AraEnabled. |  [optional] |
|**customUsernameTemplate** | **String** | Customize how temporary usernames are generated using go template |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enableAgenticRuntimeAuthority** | **Boolean** | EnableAra is the documented spelling of AraEnabled; --ara-enabled shipped first and stays as an undocumented alias. |  [optional] |
|**enableAiQuorum** | **Boolean** | Turns on AI Quorum checks for this item. |  [optional] |
|**inputRule** | **List&lt;String&gt;** | Agentic input rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Sanitize input) Mirrors commands.AgenticRulesParams — kept separate because ResourceDS cannot embed it (different package, different struct layout). |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**outputRule** | **List&lt;String&gt;** | Agentic output rule in name&#x3D;...,rule&#x3D;... format (e.g. name&#x3D;rule1,rule&#x3D;Mask secrets) |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**skipDryRun** | **Boolean** | If set, dry-run will be skipped [true/false] |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useCapitalLetters** | **String** | Specifies whether the generated temporary password must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). [true/false] |  [optional] |
|**useLowerLetters** | **String** | Specifies whether the generated temporary password must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). [true/false] |  [optional] |
|**useNumbers** | **String** | Specifies whether the generated temporary password must contain at least one numeric character (0 to 9). [true/false] |  [optional] |
|**useSpecialCharacters** | **String** |  |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



