

# GatewayUpdateLogForwardingSyslog

gatewayUpdateLogForwardingSyslog is a command that updates log forwarding config (syslog target)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable** | **String** | Enable Log Forwarding [true/false] |  [optional]
**enableTls** | **Boolean** | Enable tls relevant only for network type TCP |  [optional]
**formatter** | **String** | Syslog formatter [text/cef] |  [optional]
**host** | **String** | Syslog host |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**network** | **String** | Syslog network [tcp/udp] |  [optional]
**outputFormat** | **String** | Logs format [text/json] |  [optional]
**pullInterval** | **String** | Pull interval in seconds |  [optional]
**targetTag** | **String** | Syslog target tag |  [optional]
**tlsCertificate** | **String** | Syslog tls certificate |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



