

# TargetUpdateAerospike


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminUsername** | **String** | Username of an account with the user-admin role |  [optional] |
|**aerospikeClientId** | **String** | Client ID for Aerospike Cloud authentication (relevant only for Aerospike Cloud) |  [optional] |
|**aerospikeClientSecret** | **String** | Client secret for Aerospike Cloud authentication (relevant only for Aerospike Cloud) |  [optional] |
|**aerospikeCloud** | **Boolean** | Set to &#39;true&#39; for Aerospike Cloud deployments |  [optional] |
|**aerospikeClusterId** | **String** | Cloud cluster ID (relevant only for Aerospike Cloud) |  [optional] |
|**clientCertificate** | **String** | Client certificate for mTLS (mTLS only) |  [optional] |
|**clientPrivateKey** | **String** | Client private key for mTLS (mTLS only) |  [optional] |
|**dbServerName** | **String** | TLS server name used to verify the certificate hostname. If empty, the Aerospike hostname is used. |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enableMtls** | **Boolean** | Enable mutual TLS authentication - requires --ssl&#x3D;true (true/false) |  [optional] |
|**hostname** | **String** | Aerospike host address and port (e.g. url.to.aerospike.db) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**namespace** | **String** | Namespace name (relevant only for Aerospike db) |  [optional] |
|**newComment** | **String** | Deprecated - use description |  [optional] |
|**newName** | **String** | New target name |  [optional] |
|**password** | **String** | Password for the admin user |  [optional] |
|**port** | **String** | Database connection port |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**skipServerNameValidation** | **String** | Skip server name verification while still validating the certificate chain (true/false). Empty means do not skip. |  [optional] |
|**ssl** | **Boolean** | Enable SSL encryption (true/false) |  [optional] |
|**sslCertificate** | **String** | Base64-encoded SSL CA certificate from a trusted Certificate Authority (CA) |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



