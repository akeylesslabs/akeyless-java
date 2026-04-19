

# UscList

uscList is a command that lists the secrets of a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**objectType** | **String** |  |  [optional] |
|**pageSize** | **Long** | Optional: number of items requested per response (Azure KV). When set, response may include next_token |  [optional] |
|**pageToken** | **String** | Optional: continuation token returned by a previous usc list --page-size call |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscName** | **String** | Name of the Universal Secrets Connector item |  |



