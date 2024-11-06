

# CreatePasskey

CreatePasskey is a command that creates a new passkey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**alg** | **String** | Passkey type; options: [EC256, EC384, EC512] | 
**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | ClassicKey name | 
**originUrl** | **List&lt;String&gt;** | Originating websites for this passkey |  [optional]
**protectionKeyName** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | For Password Management use |  [optional]



