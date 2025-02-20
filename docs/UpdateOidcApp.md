

# UpdateOidcApp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** | A comma separated list of allowed audiences |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the OIDC application (if empty, the account default protectionKey key will be used) |  [optional] |
|**name** | **String** | OIDC application name |  |
|**permissionAssignment** | **String** | A json string defining the access permission assignment for this app |  [optional] |
|**_public** | **Boolean** | Set to true if the app is public (cannot keep secrets) |  [optional] |
|**redirectUris** | **String** | A comma separated list of allowed redirect uris |  [optional] |
|**scopes** | **String** | A comma separated list of allowed scopes |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



