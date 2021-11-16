

# Configure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | Access ID |  [optional]
**accessKey** | **String** | Access Key |  [optional]
**accessType** | **String** | Access Type (access_key/password/azure_ad/saml/oidc/ldap/aws_iam/gcp/k8s) |  [optional]
**adminEmail** | **String** | Email (relevant only for access-type&#x3D;password) |  [optional]
**adminPassword** | **String** | Password (relevant only for access-type&#x3D;password) |  [optional]
**azureAdObjectId** | **String** | Azure Active Directory ObjectId (relevant only for access-type&#x3D;azure_ad) |  [optional]
**gcpAudience** | **String** | GCP JWT audience |  [optional]
**k8sAuthConfigName** | **String** | The K8S Auth config name (relevant only for access-type&#x3D;k8s) |  [optional]



