

# SplunkTargetDetails

SplunkTargetDetails defines details related to connecting to a Splunk server

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** | Token audience |  [optional] |
|**authMode** | **String** | Authentication mode: \&quot;username\&quot; or \&quot;token\&quot; |  [optional] |
|**password** | **String** |  |  [optional] |
|**splunkPayload** | [**SplunkPayload**](SplunkPayload.md) |  |  [optional] |
|**splunkUrl** | **String** | Splunk server URL |  [optional] |
|**token** | **String** | Token is used when AuthMode &#x3D;&#x3D; \&quot;token\&quot; |  [optional] |
|**tokenOwner** | **String** | Token owner (the Splunk user who owns the token, required for token rotation) |  [optional] |
|**useTls** | **Boolean** | Use TLS certificate verification when connecting to the Splunk management API. |  [optional] |
|**username** | **String** | Username &amp; Password are used when AuthMode &#x3D;&#x3D; \&quot;username\&quot; |  [optional] |



