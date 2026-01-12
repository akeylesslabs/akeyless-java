

# UscDelete

uscDelete is a command that deletes a secret from a Universal Secrets Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forceDelete** | **Boolean** | Force delete objects that are soft deleted by default (relavent only for Azure target) |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**namespace** | **String** | The namespace (relevant for Hashi vault target) |  [optional] |
|**secretId** | **String** | The universal secrets id (or name, for AWS, Azure, K8s or Hashi vault targets) to delete |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**uscName** | **String** | Name of the Universal Secrets Connector item |  |



