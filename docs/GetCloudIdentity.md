

# GetCloudIdentity

getCloudIdentity is a command that gets Cloud Identity Token (relevant only for access-type=azure_ad, aws_iam, gcp).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azureAdObjectId** | **String** | Azure Active Directory ObjectId (relevant only for access-type&#x3D;azure_ad) |  [optional]
**debug** | **Boolean** |  |  [optional]
**gcpAudience** | **String** | GCP JWT audience |  [optional]
**urlSafe** | **Boolean** | Escapes the token so it can be safely placed inside a URL query |  [optional]



