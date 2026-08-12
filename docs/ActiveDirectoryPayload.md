

# ActiveDirectoryPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeDirectoryTargetId** | **Long** |  |  [optional] |
|**aiCertificateDiscovery** | **Boolean** |  |  [optional] |
|**autoRotate** | **Boolean** |  |  [optional] |
|**autoRotateIntervalInDays** | **Integer** |  |  [optional] |
|**autoRotateRotationHour** | **Integer** |  |  [optional] |
|**certificatesExpirationEvents** | [**List&lt;CertificateExpirationEvent&gt;**](CertificateExpirationEvent.md) |  |  [optional] |
|**certificatesPathTemplate** | **String** |  |  [optional] |
|**computerBaseDn** | **String** |  |  [optional] |
|**discoverIisApps** | **Boolean** |  |  [optional] |
|**discoverLocalUsers** | **Boolean** | Deprecated |  [optional] |
|**discoverServices** | **Boolean** |  |  [optional] |
|**discoveryTypes** | **List&lt;String&gt;** |  |  [optional] |
|**domainName** | **String** |  |  [optional] |
|**domainServerTargetsPathTemplate** | **String** |  |  [optional] |
|**domainUsersRotatedSecretsPathTemplate** | **String** |  |  [optional] |
|**enablePasswordPolicy** | **Boolean** | EnablePasswordPolicy enables applying PasswordPolicy to newly created domain/local user rotated secrets. Pointer so omitted values are preserved on partial update (nil &#x3D; not provided). |  [optional] |
|**enableRdpSra** | **Boolean** |  |  [optional] |
|**localUsersIgnoreList** | **Map&lt;String, Boolean&gt;** |  |  [optional] |
|**localUsersRotatedSecretsPathTemplate** | **String** |  |  [optional] |
|**osFilter** | **String** |  |  [optional] |
|**passwordPolicy** | [**PasswordPolicyInfo**](PasswordPolicyInfo.md) |  |  [optional] |
|**skipDryRun** | **Boolean** | SkipDryRun enables skip_dry_run on newly created domain/local user rotated secrets. Pointer so omitted values are preserved on partial update (nil &#x3D; not provided). When false/unset, existing rotated-secret SkipDryRun values are left unchanged on sync. |  [optional] |
|**sshPort** | **String** |  |  [optional] |
|**targetFormat** | **String** |  |  [optional] |
|**targetsType** | **String** |  |  [optional] |
|**userBaseDn** | **String** |  |  [optional] |
|**userGroups** | **List&lt;String&gt;** |  |  [optional] |
|**winrmOverHttp** | **Boolean** |  |  [optional] |
|**winrmPort** | **String** |  |  [optional] |



