

# GatewayCreateProducerGke

gatewayCreateProducerGke is a command that creates gke producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**gkeAccountKey** | **String** | GKE Service Account key file path |  [optional]
**gkeClusterCert** | **String** | GKE cluster CA certificate |  [optional]
**gkeClusterEndpoint** | **String** | GKE cluster URL endpoint |  [optional]
**gkeClusterName** | **String** | GKE cluster name |  [optional]
**gkeServiceAccountEmail** | **String** | GKE service account email |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional]
**secureAccessAllowPortForwading** | **Boolean** | Enable Port forwarding while using CLI access |  [optional]
**secureAccessBastionIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Bastion |  [optional]
**secureAccessClusterEndpoint** | **String** | The K8s cluster endpoint URL |  [optional]
**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional]
**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional]
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



