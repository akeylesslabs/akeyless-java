

# UscGet

uscGet is a command that gets the value and internal details of a secret from a Universal Secrets Connector

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**json** | **Boolean** | Set output format to JSON |  [optional]
**namespace** | **String** | The namespace (relevant for Hashi vault target) |  [optional]
**secretId** | **String** | The secret id (or name, for AWS, Azure, K8s or Hashi vault targets) to get from the Universal Secrets Connector | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**uscName** | **String** | Name of the Universal Secrets Connector item | 
**versionId** | **String** | The version id (if not specified, will retrieve the last version) |  [optional]



