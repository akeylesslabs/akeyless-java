

# CreateDBTarget

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Comment about the target |  [optional]
**dbName** | **String** |  |  [optional]
**dbServerCertificates** | **String** | (Optional) DB server certificates |  [optional]
**dbServerName** | **String** | (Optional) Server name for certificate verification |  [optional]
**dbType** | **String** |  | 
**host** | **String** |  |  [optional]
**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional]
**mongodbAtlas** | **Boolean** |  |  [optional]
**mongodbAtlasApiPrivateKey** | **String** | MongoDB Atlas private key |  [optional]
**mongodbAtlasApiPublicKey** | **String** | MongoDB Atlas public key |  [optional]
**mongodbAtlasProjectId** | **String** | MongoDB Atlas project ID |  [optional]
**mongodbDefaultAuthDb** | **String** | MongoDB server default authentication database |  [optional]
**mongodbUriOptions** | **String** | MongoDB server URI options |  [optional]
**name** | **String** | Target name | 
**oracleServiceName** | **String** |  |  [optional]
**password** | **String** | Required only when the authentication process requires a username and password |  [optional]
**port** | **String** |  |  [optional]
**pwd** | **String** |  |  [optional]
**snowflakeAccount** | **String** |  |  [optional]
**ssl** | **Boolean** | SSL connection mode |  [optional]
**sslCertificate** | **String** | SSL connection certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userName** | **String** |  |  [optional]
**username** | **String** | Required only when the authentication process requires a username and password |  [optional]



