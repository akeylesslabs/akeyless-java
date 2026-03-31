

# TargetUpdateDigiCert

targetUpdateDigiCert is a command that updates an existing DigiCert target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acmeChallenge** | **String** | ACME challenge type. Options: [dns] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**digicertUrl** | **String** | DigiCert ACME endpoint selector. Options: [us-production/eu-production/us-demo/eu-demo] |  [optional] |
|**dnsTargetCreds** | **String** | Name of existing cloud target for DNS credentials. Required when challenge type is dns. Supported providers: AWS, Azure, GCP |  [optional] |
|**eabHmacKey** | **String** | External Account Binding HMAC key (required for ACME account bootstrap on create) |  [optional] |
|**eabKeyId** | **String** | External Account Binding key identifier (required for ACME account bootstrap on create) |  [optional] |
|**email** | **String** | Email address for ACME account registration |  |
|**gcpProject** | **String** | GCP Cloud DNS project ID. Optional and can be derived from service account |  [optional] |
|**hostedZone** | **String** | AWS Route53 hosted zone ID. Required when DNS credentials target is AWS |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**newName** | **String** | New target name |  [optional] |
|**resourceGroup** | **String** | Azure resource group name. Required when DNS credentials target is Azure |  [optional] |
|**timeout** | **String** | Timeout for challenge validation |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



