

# AerospikeTargetDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aerospikeAdminUsername** | **String** |  |  [optional] |
|**aerospikeClientId** | **String** |  |  [optional] |
|**aerospikeClientSecret** | **String** |  |  [optional] |
|**aerospikeCloud** | **Boolean** |  |  [optional] |
|**aerospikeClusterId** | **String** |  |  [optional] |
|**aerospikeHostname** | **String** |  |  [optional] |
|**aerospikeNamespace** | **String** |  |  [optional] |
|**aerospikePassword** | **String** |  |  [optional] |
|**aerospikePort** | **String** |  |  [optional] |
|**clientCertificate** | **String** | (Optional) ClientCertificate defines the client certificate for mutual TLS. Must be base64 certificate loaded by UI using file loader field |  [optional] |
|**clientKeyPassphrase** | **String** | (Optional) ClientKeyPassphrase defines the passphrase for the client private key |  [optional] |
|**clientPrivateKey** | **String** | (Optional) ClientPrivateKey defines the client private key for mutual TLS. Must be base64 private key loaded by UI using file loader field |  [optional] |
|**cloudServiceProvider** | **String** |  |  [optional] |
|**clusterMode** | **Boolean** |  |  [optional] |
|**connectionType** | **String** |  |  [optional] |
|**dbClientId** | **String** |  |  [optional] |
|**dbClientSecret** | **String** |  |  [optional] |
|**dbHostName** | **String** |  |  [optional] |
|**dbName** | **String** |  |  [optional] |
|**dbPort** | **String** |  |  [optional] |
|**dbPrivateKey** | **String** | (Optional) Private Key in PEM format |  [optional] |
|**dbPrivateKeyPassphrase** | **String** |  |  [optional] |
|**dbPwd** | **String** |  |  [optional] |
|**dbServerCertificates** | **String** | (Optional) DBServerCertificates defines the set of root certificate authorities that clients use when verifying server certificates. If DBServerCertificates is empty, TLS uses the host&#39;s root CA set. |  [optional] |
|**dbServerName** | **String** | (Optional) ServerName is used to verify the hostname on the returned certificates unless InsecureSkipVerify is given. It is also included in the client&#39;s handshake to support virtual hosting unless it is an IP address. |  [optional] |
|**dbTenantId** | **String** |  |  [optional] |
|**dbUserName** | **String** |  |  [optional] |
|**enableMtls** | **Boolean** | (Optional) EnableMTLS defines if mutual TLS will be used to connect to DB |  [optional] |
|**oracleWalletDetails** | [**WalletDetails**](WalletDetails.md) |  |  [optional] |
|**sfAccount** | **String** |  |  [optional] |
|**skipServerNameValidation** | **String** | (Optional) SkipServerNameValidation disables server name verification while still validating the certificate chain. Postgres treats empty as legacy \&quot;skip hostname validation\&quot;; MySQL treats empty as false. |  [optional] |
|**sslConnectionCertificate** | **String** | (Optional) SSLConnectionCertificate defines the certificate for SSL connection. Must be base64 certificate loaded by UI using file loader field |  [optional] |
|**sslConnectionMode** | **Boolean** | (Optional) SSLConnectionMode defines if SSL mode will be used to connect to DB |  [optional] |



