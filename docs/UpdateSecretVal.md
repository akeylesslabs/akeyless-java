

# UpdateSecretVal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**multiline** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**newVersion** | **Boolean** | Deprecated |  [optional]
**passwordManagerCustomField** | **Map&lt;String, String&gt;** | For Password Management use, additional fields |  [optional]
**passwordManagerInjectUrl** | **List&lt;String&gt;** | For Password Management use, reflect the website context |  [optional]
**passwordManagerPassword** | **String** | For Password Management use, additional fields |  [optional]
**passwordManagerUsername** | **String** | For Password Management use |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**value** | **String** | The new secret value | 



