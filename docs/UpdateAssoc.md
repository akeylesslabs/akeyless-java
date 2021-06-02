

# UpdateAssoc

updateAssoc is a command that updates the sub-claims of an association between role and auth method.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assocId** | **String** | The association id to be updated | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**subClaims** | **Map&lt;String, String&gt;** | key/val of sub claims, e.g group&#x3D;admins,developers |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



