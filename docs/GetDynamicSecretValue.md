

# GetDynamicSecretValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Optional arguments as key&#x3D;value pairs or JSON strings, e.g - \\\&quot;--args&#x3D;csr&#x3D;base64_encoded_csr --args&#x3D;common_name&#x3D;bar\\\&quot; or args&#x3D;&#39;{\\\&quot;csr\\\&quot;:\\\&quot;base64_encoded_csr\\\&quot;}. It is possible to combine both formats.&#39; |  [optional]
**host** | **String** | Host |  [optional]
**name** | **String** | Dynamic secret name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**target** | **String** | Target Name |  [optional]
**timeout** | **Long** | Timeout in seconds |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



