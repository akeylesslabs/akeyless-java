

# GwUpdateRemoteAccessSessionLogsSplunk

gwUpdateRemoteAccessSessionLogsSplunk is a command that updates session log forwarding config (splunk target)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enable** | **String** | Enable Log Forwarding [true/false] |  [optional] |
|**enableBatch** | **String** | Enable batch forwarding [true/false] |  [optional] |
|**enableTls** | **Boolean** | Enable tls |  [optional] |
|**index** | **String** | Splunk index |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**outputFormat** | **String** | Logs format [text/json] |  [optional] |
|**pullInterval** | **String** | Pull interval in seconds |  [optional] |
|**source** | **String** | Splunk source |  [optional] |
|**sourceType** | **String** | Splunk source type |  [optional] |
|**splunkToken** | **String** | Splunk token |  [optional] |
|**splunkUrl** | **String** | Splunk server URL |  [optional] |
|**tlsCertificate** | **String** | Splunk tls certificate |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



