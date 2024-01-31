

# SignDataWithClassicKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **String** | Data | 
**displayId** | **String** | The name of the key to use in the sign data process | 
**hashed** | **Boolean** | Defines whether the data should be hashed as part of the signing. If true, the data will not be hashed |  [optional]
**hashingMethod** | **String** | HashingMethod |  [optional]
**ignoreCache** | **String** | Retrieve the Secret value without checking the Gateway&#39;s cache [true/false]. This flag is only relevant when using the RestAPI |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | ClassicKey name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**version** | **Integer** | classic key version | 



