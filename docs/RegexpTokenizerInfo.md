

# RegexpTokenizerInfo

RegexpTokenizerInfo represents a general Regexp tokenization template
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alphabet** | **String** | The Alphabet used for the tokenization |  [optional]
**decodingTemplate** | **String** | Transformation to perform on the decrypted data |  [optional]
**encodingTemplate** | **String** | Transformation to perform on the encrypted data, if the required output template doesn&#39;t match the input string The output Should still be valid for the Pattern, otherwise the secret would be able to be decrypted. |  [optional]
**pattern** | **String** | Regexp pattern to extract and deposit the text/encdata |  [optional]



