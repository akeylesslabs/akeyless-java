

# UpdateAccountSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Address |  [optional]
**city** | **String** | City |  [optional]
**companyName** | **String** | Company name |  [optional]
**country** | **String** | Country |  [optional]
**defaultKeyName** | **String** | Set the account default key based on the DFC key name. Use \&quot;set-original-akeyless-default-key\&quot; to revert to using the original default key of the account. |  [optional]
**defaultShareLinkTtlMinutes** | **String** | Set the default ttl in minutes for sharing item number between 60 and 43200 |  [optional]
**defaultVersioning** | **String** | If set to true, new versions is enabled by default |  [optional]
**dpEnableClassicKeyProtection** | **String** | Set to update protection with classic keys state [true/false] |  [optional]
**dynamicSecretMaxTtl** | **Long** | Set the maximum ttl for dynamic secrets |  [optional]
**dynamicSecretMaxTtlEnable** | **String** | Set a maximum ttl for dynamic secrets [true/false] |  [optional]
**forceNewVersions** | **String** | If set to true, new version will be created on update |  [optional]
**invalidCharacters** | **String** | Characters that cannot be used for items/targets/roles/auths/event_forwarder names. Empty string will enforce nothing. |  [optional]
**itemType** | **String** | VersionSettingsObjectType defines object types for account version settings |  [optional]
**itemsDeletionProtection** | **String** | Set or unset the default behaviour of items deletion protection [true/false] |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**jwtTtlDefault** | **Long** | Default ttl |  [optional]
**jwtTtlMax** | **Long** | Maximum ttl |  [optional]
**jwtTtlMin** | **Long** | Minimum ttl |  [optional]
**lockDefaultKey** | **String** | Lock the account&#39;s default protection key, if set - users will not be able to use a different protection key, relevant only if default-key-name is configured [true/false] |  [optional]
**maxRotationInterval** | **Integer** | Set the maximum rotation interval for rotated secrets auto rotation settings |  [optional]
**maxRotationIntervalEnable** | **String** | Set a maximum rotation interval for rotated secrets auto rotation settings [true/false] |  [optional]
**maxVersions** | **String** | Max versions |  [optional]
**passwordLength** | **Long** | Password length between 5 - to 50 characters |  [optional]
**phone** | **String** | Phone number |  [optional]
**postalCode** | **String** | Postal code |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**usageEventEnable** | **String** | Enable event for objects that have not been used or changed [true/false] |  [optional]
**usageEventInterval** | **Long** | Interval by days for unused objects. Default and minimum interval is 90 days |  [optional]
**usageEventObjectType** | **String** | Usage event is supported for auth method or secrets-and-keys [auth/item] |  [optional]
**useLowerLetters** | **String** | Password must contain lower case letters [true/false] |  [optional]
**useNumbers** | **String** | Password must contain numbers [true/false] |  [optional]
**useSpecialCharacters** | **String** | Password must contain special characters [true/false] |  [optional]
**useCapitalLetters** | **String** | Password must contain capital letters [true/false] |  [optional]



