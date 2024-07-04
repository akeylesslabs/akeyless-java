

# CreateGKETarget

createGKETarget is a command that creates a new target. [Deprecated: Use target-create-gke command]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Deprecated - use description |  [optional]
**description** | **String** | Description of the object |  [optional]
**gkeAccountKey** | **String** | GKE Service Account key file path |  [optional]
**gkeClusterCert** | **String** | GKE cluster CA certificate |  [optional]
**gkeClusterEndpoint** | **String** | GKE cluster URL endpoint |  [optional]
**gkeClusterName** | **String** | GKE cluster name |  [optional]
**gkeServiceAccountEmail** | **String** | GKE service account email |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional]
**name** | **String** | Target name | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**useGwCloudIdentity** | **Boolean** |  |  [optional]



