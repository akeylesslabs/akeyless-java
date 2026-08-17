

# RotatedSecretDetailsInfo

RotatedSecretDetailsInfo The rotated secret rotator info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**awsUserName** | **String** |  |  [optional] |
|**deletePreviousVersionInDays** | **Integer** |  |  [optional] |
|**enableCustomPasswordPolicy** | **Boolean** |  |  [optional] |
|**graceRotation** | **Boolean** |  |  [optional] |
|**graceRotationHour** | **Integer** |  |  [optional] |
|**graceRotationInterval** | **Integer** |  |  [optional] |
|**graceRotationTiming** | **String** |  |  [optional] |
|**gwClusterId** | **Long** |  |  [optional] |
|**iisAppsDetails** | [**List&lt;WindowsService&gt;**](WindowsService.md) |  |  [optional] |
|**keyAlgorithm** | **String** | SSHKeyAlgorithm identifies the key algorithm an SSH rotated secret uses. Kept apart from Algorithm, which is an encryption-key enum and has no ECDSA-384 or ECDSA-521. |  [optional] |
|**lastRotationError** | **String** |  |  [optional] |
|**managedByAkeyless** | **Boolean** |  |  [optional] |
|**maxVersions** | **Long** |  |  [optional] |
|**nextAutoRotateType** | **String** |  |  [optional] |
|**numberOfVersionsToSave** | **Integer** |  |  [optional] |
|**publicKeyRemotePath** | **String** |  |  [optional] |
|**rotationHour** | **Integer** |  |  [optional] |
|**rotationIntervalMin** | **Boolean** |  |  [optional] |
|**rotationStatement** | **String** |  |  [optional] |
|**rotatorCredsType** | **String** |  |  [optional] |
|**rotatorStatus** | **String** | RotationStatus defines types of rotation Status |  [optional] |
|**rotatorType** | **String** |  |  [optional] |
|**samePassword** | **Boolean** |  |  [optional] |
|**servicesDetails** | [**List&lt;WindowsService&gt;**](WindowsService.md) |  |  [optional] |
|**skipDryRun** | **Boolean** |  |  [optional] |
|**timeoutSeconds** | **Long** |  |  [optional] |



