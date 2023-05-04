

# CreateTokenizer

createTokenizer is a command that creates a tokenizer item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alphabet** | **String** | Alphabet to use in regexp vaultless tokenization |  [optional]
**decodingTemplate** | **String** | The Decoding output template to use in regexp vaultless tokenization |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**description** | **String** | Description of the object |  [optional]
**encodingTemplate** | **String** | The Encoding output template to use in regexp vaultless tokenization |  [optional]
**encryptionKeyName** | **String** | AES key name to use in vaultless tokenization |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Deprecated - use description |  [optional]
**name** | **String** | Tokenizer name | 
**pattern** | **String** | Pattern to use in regexp vaultless tokenization |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**templateType** | **String** | Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp] | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenizerType** | **String** | Tokenizer type | 
**tweakType** | **String** | The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking] |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



