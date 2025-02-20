

# GatewayUpdateLogForwardingLogstash

gatewayUpdateLogForwardingLogstash is a command that updates log forwarding config (logstash target)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dns** | **String** | Logstash dns |  [optional] |
|**enable** | **String** | Enable Log Forwarding [true/false] |  [optional] |
|**enableTls** | **Boolean** | Enable tls |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**outputFormat** | **String** | Logs format [text/json] |  [optional] |
|**protocol** | **String** | Logstash protocol [tcp/udp] |  [optional] |
|**pullInterval** | **String** | Pull interval in seconds |  [optional] |
|**tlsCertificate** | **String** | Logstash tls certificate |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



