

# TargetUpdateLetsEncrypt

targetUpdateLetsEncrypt is a command that updates an existing Let's Encrypt target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acmeChallenge** | **String** |  |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**dnsTargetCreds** | **String** | Name of existing cloud target for DNS credentials. Required when acme-challenge&#x3D;dns. Supported: AWS, Azure, GCP targets |  [optional] |
|**email** | **String** | Email address for ACME account registration |  |
|**gcpProject** | **String** | GCP Cloud DNS: Project ID. Optional - can be derived from service account |  [optional] |
|**hostedZone** | **String** | AWS Route53 hosted zone ID. Required when dns-target-creds points to AWS target |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**letsEncryptUrl** | **String** |  |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**newName** | **String** | New target name |  [optional] |
|**resourceGroup** | **String** | Azure resource group name. Required when dns-target-creds points to Azure target |  [optional] |
|**timeout** | **String** |  |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



