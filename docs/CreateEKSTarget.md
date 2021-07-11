

# CreateEKSTarget

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Comment about the target |  [optional]
**eksAccessKeyId** | **String** | Access Key ID | 
**eksClusterCaCert** | **String** | EKS cluster CA certificate | 
**eksClusterEndpoint** | **String** | EKS cluster URL endpoint | 
**eksClusterName** | **String** | EKS cluster name | 
**eksRegion** | **String** | Region |  [optional]
**eksSecretAccessKey** | **String** | Secret Access Key | 
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | Target name | 
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



