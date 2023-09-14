

# UpdateDBTarget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dbDefinedConnectionType** | **String** |  |  [optional]
**azureClientId** | **String** | (Optional) Client id (relevant for \&quot;cloud-service-provider\&quot; only) |  [optional]
**azureClientSecret** | **String** | (Optional) Client secret (relevant for \&quot;cloud-service-provider\&quot; only) |  [optional]
**azureTenantId** | **String** | (Optional) Tenant id (relevant for \&quot;cloud-service-provider\&quot; only) |  [optional]
**cloudServiceProvider** | **String** | (Optional) Cloud service provider (currently only supports Azure) |  [optional]
**comment** | **String** | Deprecated - use description |  [optional]
**connectionType** | **String** | (Optional) Type of connection to mssql database [credentials/cloud-identity] | 
**dbName** | **String** |  |  [optional]
**dbServerCertificates** | **String** | (Optional) DB server certificates |  [optional]
**dbServerName** | **String** | (Optional) Server name for certificate verification |  [optional]
**dbType** | **String** |  | 
**description** | **String** | Description of the object |  [optional]
**host** | **String** |  |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**mongodbAtlas** | **Boolean** |  |  [optional]
**mongodbAtlasApiPrivateKey** | **String** | MongoDB Atlas private key |  [optional]
**mongodbAtlasApiPublicKey** | **String** | MongoDB Atlas public key |  [optional]
**mongodbAtlasProjectId** | **String** | MongoDB Atlas project ID |  [optional]
**mongodbDefaultAuthDb** | **String** | MongoDB server default authentication database |  [optional]
**mongodbUriOptions** | **String** | MongoDB server URI options |  [optional]
**name** | **String** | Target name | 
**newName** | **String** | New target name |  [optional]
**oracleServiceName** | **String** |  |  [optional]
**port** | **String** |  |  [optional]
**pwd** | **String** |  |  [optional]
**snowflakeAccount** | **String** |  |  [optional]
**snowflakeApiPrivateKey** | **String** | RSA Private key (base64 encoded) |  [optional]
**snowflakeApiPrivateKeyPassword** | **String** | The Private key passphrase |  [optional]
**ssl** | **Boolean** | Enable/Disable SSL [true/false] |  [optional]
**sslCertificate** | **String** | SSL connection certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**updateVersion** | **Boolean** | Deprecated |  [optional]
**userName** | **String** |  |  [optional]



