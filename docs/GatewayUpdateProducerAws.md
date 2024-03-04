

# GatewayUpdateProducerAws

gatewayUpdateProducerAws is a command that Updates aws producer [Deprecated: Use dynamic-secret-update-aws command]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessMode** | **String** |  |  [optional]
**adminRotationIntervalDays** | **Long** | Admin credentials rotation interval (days) |  [optional]
**awsAccessKeyId** | **String** | Access Key ID |  [optional]
**awsAccessSecretKey** | **String** | Secret Access Key |  [optional]
**awsRoleArns** | **String** | AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode) |  [optional]
**awsUserConsoleAccess** | **Boolean** | AWS User console access |  [optional]
**awsUserGroups** | **String** | AWS User groups |  [optional]
**awsUserPolicies** | **String** | AWS User policies |  [optional]
**awsUserProgrammaticAccess** | **Boolean** | Enable AWS User programmatic access |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**enableAdminRotation** | **Boolean** | Automatic admin credentials rotation |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**newName** | **String** | Dynamic secret name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**region** | **String** | Region |  [optional]
**secureAccessAwsAccountId** | **String** | The AWS account id |  [optional]
**secureAccessAwsNativeCli** | **Boolean** | The AWS native cli |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless Web Access Bastion |  [optional]
**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless Web Access Bastion |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



