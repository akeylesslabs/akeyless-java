

# CreateTokenizer

createTokenizer is a command that creates a tokenizer item
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alphabet** | **String** | Alphabet to use in regexp vaultless tokenization |  [optional]
**decryptionTemplate** | **String** | The Decryption output template to use in regexp vaultless tokenization |  [optional]
**encryptionKeyName** | **String** | AES key name to use in vaultless tokenization |  [optional]
**encryptionTemplate** | **String** | The Encryption output template to use in regexp vaultless tokenization |  [optional]
**metadata** | **String** | A metadata about the tokenizer |  [optional]
**name** | **String** | Tokenizer name | 
**pattern** | **String** | Pattern to use in regexp vaultless tokenization |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this key |  [optional]
**templateType** | **String** | Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp] | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenizerType** | **String** | Tokenizer type | 
**tweakType** | **String** | The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking] |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



