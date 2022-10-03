

# GatewayMigratePersonalItems

gatewayMigratePersonalItems is a command that migrate personal items from external vault
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_1passwordEmail** | **String** | 1Password user email to connect to the API |  [optional]
**_1passwordPassword** | **String** | 1Password user password to connect to the API |  [optional]
**_1passwordSecretKey** | **String** | 1Password user secret key to connect to the API |  [optional]
**_1passwordUrl** | **String** | 1Password api container url |  [optional]
**_1passwordVaults** | **List&lt;String&gt;** | 1Password list of vault to get the items from |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the secret value |  [optional]
**targetLocation** | **String** | Target location in Akeyless for migrated secrets |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | Migration type for now only 1password. |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



