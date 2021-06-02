

# DeleteItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteImmediately** | **Boolean** | When delete-in-days&#x3D;-1, must be set |  [optional]
**deleteInDays** | **Long** | The number of days to wait before deleting the item (relevant for keys only) |  [optional]
**name** | **String** | Item name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]
**version** | **Integer** | The specific version you want to delete - 0&#x3D;last version, -1&#x3D;entire item with all versions (default) |  [optional]



