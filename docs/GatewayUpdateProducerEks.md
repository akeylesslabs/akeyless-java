

# GatewayUpdateProducerEks

gatewayUpdateProducerEks is a command that updates eks producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**eksAccessKeyId** | **String** | Access Key ID |  [optional]
**eksAssumeRole** | **String** | IAM assume role |  [optional]
**eksClusterCaCert** | **String** | EKS cluster CA certificate |  [optional]
**eksClusterEndpoint** | **String** | EKS cluster URL endpoint |  [optional]
**eksClusterName** | **String** | EKS cluster name |  [optional]
**eksRegion** | **String** | Region |  [optional]
**eksSecretAccessKey** | **String** | Secret Access Key |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**newName** | **String** | Producer name |  [optional]
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessAllowPortForwading** | **Boolean** | Enable Port forwarding while using CLI access |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessClusterEndpoint** | **String** | The K8s cluster endpoint URL |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



