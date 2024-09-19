

# AccountGeneralSettings

AccountGeneralSettings describes general settings for an account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountDefaultKeyItemId** | **Long** | AccountDefaultKeyItemID is the item ID of the DFC key item configured as the default protection key |  [optional]
**accountDefaultKeyName** | **String** | AccountDefaultKeyName is the name of the DFC key item configured as the default key This is here simply for the response to include the item name in addition to the display ID so the client can properly show this to the user. It will not be saved to the DB, only the AccountDefaultKeyItemID will. |  [optional]
**allowedClientsIps** | [**AllowedIpSettings**](AllowedIpSettings.md) |  |  [optional]
**allowedGatewaysIps** | [**AllowedIpSettings**](AllowedIpSettings.md) |  |  [optional]
**authUsageEvent** | [**UsageEventSetting**](UsageEventSetting.md) |  |  [optional]
**dataProtectionSection** | [**DataProtectionSection**](DataProtectionSection.md) |  |  [optional]
**dynamicSecretMaxTtl** | [**DynamicSecretMaxTtl**](DynamicSecretMaxTtl.md) |  |  [optional]
**enableRequestForAccess** | **Boolean** |  |  [optional]
**invalidCharacters** | **String** | InvalidCharacters is the invalid characters for items/targets/roles/auths/notifier_forwarder naming convention |  [optional]
**itemUsageEvent** | [**UsageEventSetting**](UsageEventSetting.md) |  |  [optional]
**lockDefaultKey** | **Boolean** | LockDefaultKey determines whether the configured default key can be updated by end-users on a per-request basis true - all requests use the configured default key false - every request can determine its protection key (default) nil - change nothing (every request can determine its protection key (default)) This parameter is only relevant if AccountDefaultKeyItemID is not empty |  [optional]
**passwordExpirationInfo** | [**PasswordExpirationInfo**](PasswordExpirationInfo.md) |  |  [optional]
**passwordPolicy** | [**PasswordPolicyInfo**](PasswordPolicyInfo.md) |  |  [optional]
**protectItemsByDefault** | **Boolean** |  |  [optional]
**rotationSecretMaxInterval** | [**RotationSecretMaxInterval**](RotationSecretMaxInterval.md) |  |  [optional]
**sharingPolicy** | [**SharingPolicyInfo**](SharingPolicyInfo.md) |  |  [optional]



