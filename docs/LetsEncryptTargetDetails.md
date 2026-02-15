

# LetsEncryptTargetDetails

LetsEncryptTargetDetails defines configuration for Let's Encrypt ACME target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountKeyPem** | **String** | ACME Account Private Key (PEM-encoded) Supports ECDSA (P-256, P-384, P-521), RSA (2048+), and Ed25519 Auto-generated as ECDSA P-256 on first certificate issuance if not provided Stored encrypted, required for certificate operations and revocation |  [optional] |
|**accountUrl** | **String** | ACME Account URL (returned after registration with Let&#39;s Encrypt) Used to retrieve existing account instead of re-registering |  [optional] |
|**acmeEnvironment** | **String** | ACMEEnvironment defines Let&#39;s Encrypt ACME directory environment |  [optional] |
|**challengeType** | **String** | ACMEChallengeType defines ACME challenge type for Let&#39;s Encrypt |  [optional] |
|**dnsTargetName** | **String** | Name of DNS target (transient field - not stored in DB) Used by CLI to pass DNS target name to SDK for creating target_object_assoc Retrieved from target_object_assoc when reading target Required when ChallengeType is \&quot;dns\&quot; |  [optional] |
|**dnsTargetType** | **String** |  |  [optional] |
|**email** | **String** | Email address for ACME account registration Required |  [optional] |
|**gcpProject** | **String** | GCP Cloud DNS: Project ID Optional - can be derived from service account |  [optional] |
|**hostedZone** | **String** | AWS Route53: Hosted zone ID Required when DNSTargetType is AWS |  [optional] |
|**resourceGroup** | **String** | Azure DNS: Resource group name Required when DNSTargetType is Azure |  [optional] |
|**timeout** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |



