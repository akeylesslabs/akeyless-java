

# ScanResults

ScanResults contains detailed results from a certificate scan

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countExisting** | **Long** |  |  [optional] |
|**countFailed** | **Long** |  |  [optional] |
|**countHosts** | **Long** |  |  [optional] |
|**countNew** | **Long** |  |  [optional] |
|**countSubdomains** | **Long** |  |  [optional] |
|**domainCoverage** | [**List&lt;DomainCoverage&gt;**](DomainCoverage.md) | DomainCoverage says, per public domain, how much of it subdomain discovery managed to cover. Clients that predate it ignore it, and a scan with no public domain omits it. |  [optional] |
|**error** | **String** |  |  [optional] |
|**failedTargets** | [**List&lt;TargetError&gt;**](TargetError.md) |  |  [optional] |
|**itemNames** | **List&lt;String&gt;** |  |  [optional] |



