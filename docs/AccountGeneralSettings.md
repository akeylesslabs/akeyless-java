

# AccountGeneralSettings

AccountGeneralSettings describes general settings for an account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountDefaultKeyItemId** | **Long** | AccountDefaultKeyItemID is the item ID of the DFC key item configured as the default protection key |  [optional]
**accountDefaultKeyName** | **String** | AccountDefaultKeyName is the name of the DFC key item configured as the default key This is here simply for the response to include the item name in addition to the display ID so the client can properly show this to the user. It will not be saved to the DB, only the AccountDefaultKeyItemID will. |  [optional]
**dataProtectionSection** | [**DataProtectionSection**](DataProtectionSection.md) |  |  [optional]
**enableRequestForAccess** | **Boolean** |  |  [optional]
**passwordPolicy** | [**PasswordPolicyInfo**](PasswordPolicyInfo.md) |  |  [optional]
**protectItemsByDefault** | **Boolean** |  |  [optional]
**sharingPolicy** | [**SharingPolicyInfo**](SharingPolicyInfo.md) |  |  [optional]



