

# CreateAzureTarget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** |  |  [optional]
**clientSecret** | **String** |  |  [optional]
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Target name | 
**resourceGroupName** | **String** | The Resource Group name in your Azure subscription |  [optional]
**resourceName** | **String** | The name of the relevant Resource |  [optional]
**subscriptionId** | **String** | Azure Subscription Id |  [optional]
**tenantId** | **String** |  |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useGwCloudIdentity** | **Boolean** |  |  [optional]



