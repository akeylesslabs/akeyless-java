

# UpdateSecretVal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**customField** | **Map&lt;String, String&gt;** | For Password Management use, additional fields |  [optional]
**format** | **String** | Secret format [text/json] (relevant only for type &#39;generic&#39;) |  [optional]
**injectUrl** | **List&lt;String&gt;** | For Password Management use, reflect the website context |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**lastVersion** | **Integer** | The last version number before the update |  [optional]
**multiline** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**newVersion** | **Boolean** | Deprecated |  [optional]
**password** | **String** | For Password Management use, additional fields |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | For Password Management use |  [optional]
**value** | **String** | The secret value (relevant only for type &#39;generic&#39;) | 



