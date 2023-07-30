

# DbTargetDetails

DbTargetDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dbHostName** | **String** |  |  [optional]
**dbName** | **String** |  |  [optional]
**dbPort** | **String** |  |  [optional]
**dbPrivateKey** | **String** | (Optional) Private Key in PEM format |  [optional]
**dbPrivateKeyPassphrase** | **String** |  |  [optional]
**dbPwd** | **String** |  |  [optional]
**dbServerCertificates** | **String** | (Optional) DBServerCertificates defines the set of root certificate authorities that clients use when verifying server certificates. If DBServerCertificates is empty, TLS uses the host&#39;s root CA set. |  [optional]
**dbServerName** | **String** | (Optional) ServerName is used to verify the hostname on the returned certificates unless InsecureSkipVerify is given. It is also included in the client&#39;s handshake to support virtual hosting unless it is an IP address. |  [optional]
**dbUserName** | **String** |  |  [optional]
**sfAccount** | **String** |  |  [optional]
**sslConnectionCertificate** | **String** | (Optional) SSLConnectionCertificate defines the certificate for SSL connection. Must be base64 certificate loaded by UI using file loader field |  [optional]
**sslConnectionMode** | **Boolean** | (Optional) SSLConnectionMode defines if SSL mode will be used to connect to DB |  [optional]



