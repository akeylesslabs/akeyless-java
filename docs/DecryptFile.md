

# DecryptFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cyphertextHeader** | **String** |  |  [optional]
**displayId** | **String** | The display id of the key to use in the decryption process |  [optional]
**in** | **String** | Path to the file to be decrypted. If not provided, the content will be taken from stdin | 
**itemId** | **Long** | The item id of the key to use in the decryption process |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyName** | **String** | The name of the key to use in the decryption process | 
**out** | **String** | Path to the output file. If not provided, the output will be sent to stdout |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



