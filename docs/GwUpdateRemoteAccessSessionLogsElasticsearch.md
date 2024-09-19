

# GwUpdateRemoteAccessSessionLogsElasticsearch

gwUpdateRemoteAccessSessionLogsElasticsearch is a command that updates session log forwarding config (elasticsearch target)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiKey** | **String** | Elasticsearch api key relevant only for api_key auth-type |  [optional]
**authType** | **String** | Elasticsearch auth type [api_key/password] |  [optional]
**cloudId** | **String** | Elasticsearch cloud id relevant only for cloud server-type |  [optional]
**enable** | **String** | Enable Log Forwarding [true/false] |  [optional]
**enableTls** | **Boolean** | Enable tls |  [optional]
**index** | **String** | Elasticsearch index |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**nodes** | **String** | Elasticsearch nodes relevant only for nodes server-type |  [optional]
**outputFormat** | **String** | Logs format [text/json] |  [optional]
**password** | **String** | Elasticsearch password relevant only for password auth-type |  [optional]
**pullInterval** | **String** | Pull interval in seconds |  [optional]
**serverType** | **String** | Elasticsearch server type [cloud/nodes] |  [optional]
**tlsCertificate** | **String** | Elasticsearch tls certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userName** | **String** | Elasticsearch user name relevant only for password auth-type |  [optional]



