

# CreateSalesforceTarget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appPrivateKeyData** | **String** | Base64 encoded PEM of the connected app private key (relevant for JWT auth only) |  [optional]
**authFlow** | **String** | type of the auth flow (&#39;jwt&#39; / &#39;user-password&#39;) | 
**caCertData** | **String** | Base64 encoded PEM cert to use when uploading a new key to Salesforce |  [optional]
**caCertName** | **String** | name of the certificate in Salesforce tenant to use when uploading new key |  [optional]
**clientId** | **String** | Client ID of the oauth2 app to use for connecting to Salesforce | 
**clientSecret** | **String** | Client secret of the oauth2 app to use for connecting to Salesforce (required for password flow) |  [optional]
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**email** | **String** | The email of the user attached to the oauth2 app used for connecting to Salesforce | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**password** | **String** | The password of the user attached to the oauth2 app used for connecting to Salesforce (required for user-password flow) |  [optional]
**securityToken** | **String** | The security token of the user attached to the oauth2 app used for connecting to Salesforce  (required for user-password flow) |  [optional]
**tenantUrl** | **String** | Url of the Salesforce tenant | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



