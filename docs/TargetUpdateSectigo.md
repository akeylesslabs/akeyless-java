

# TargetUpdateSectigo

targetUpdateSectigo is a command that updates an existing Sectigo target

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificateProfileId** | **Long** | Certificate Profile ID in Sectigo account | 
**customerUri** | **String** | Customer Uri of the Sectigo account | 
**description** | **String** | Description of the object |  [optional]
**externalRequester** | **String** | External Requester - a comma separated list of emails | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**newName** | **String** | New target name |  [optional]
**organizationId** | **Long** | Organization ID in Sectigo account | 
**password** | **String** | Password of the Sectigo account user | 
**timeout** | **String** | Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h. |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Username of the Sectigo account | 



