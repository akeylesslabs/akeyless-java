

# DynamicSecretCreateEks

dynamicSecretCreateEks is a command that creates eks dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**eksAccessKeyId** | **String** | Access Key ID |  [optional] |
|**eksAssumeRole** | **String** | IAM assume role |  [optional] |
|**eksClusterCaCert** | **String** | EKS cluster CA certificate |  [optional] |
|**eksClusterEndpoint** | **String** | EKS cluster URL endpoint |  [optional] |
|**eksClusterName** | **String** | EKS cluster name |  [optional] |
|**eksRegion** | **String** | Region |  [optional] |
|**eksSecretAccessKey** | **String** | Secret Access Key |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**secureAccessAllowPortForwading** | **Boolean** | Enable Port forwarding while using CLI access |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessClusterEndpoint** | **String** | The K8s cluster endpoint URL |  [optional] |
|**secureAccessDelay** | **Long** | The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | User TTL |  [optional] |



