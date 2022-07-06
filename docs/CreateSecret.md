

# CreateSecret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customFields** | **Map&lt;String, String&gt;** | For Password Management use, additional fields |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**itemAccessibility** | **String** | for personal password manager |  [optional]
**metadata** | **String** | Metadata about the secret |  [optional]
**multilineValue** | **Boolean** | The provided value is a multiline value (separated by &#39;\\n&#39;) |  [optional]
**name** | **String** | Secret name | 
**passwordLength** | **Long** | For PasswordPolicy use |  [optional]
**protectionKey** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessSshCreds** | **String** |  |  [optional]
**secureAccessSshUser** | **String** |  |  [optional]
**secureAccessUrl** | **String** |  |  [optional]
**secureAccessWebBrowsing** | **Boolean** |  |  [optional]
**secureAccessWebProxy** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | For Password Management use, reflect the website context |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useLowerLetters** | **String** | For PasswordPolicy use |  [optional]
**useNumbers** | **String** | For PasswordPolicy use |  [optional]
**useSpecialCharacters** | **String** | For PasswordPolicy use |  [optional]
**useCapitalLetters** | **String** | For PasswordPolicy use |  [optional]
**username** | **String** | For Password Management use |  [optional]
**value** | **String** | The secret value | 
**website** | **String** | For Password Management use, reflect the website context |  [optional]



