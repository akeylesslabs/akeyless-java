

# GatewayAddSubAdmins

gatewayAddSubAdmins is a command that adds sub-admins
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowGwApi** | **Boolean** |  |  [optional]
**allowGwLogin** | **Boolean** |  |  [optional]
**gatewayUrl** | **String** | Gateway url |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**subAdminAccessId** | **String** | SubAdmins to add | 
**subClaims** | **Map&lt;String, String&gt;** | key/val of sub claims, e.g group&#x3D;admins,developers |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



