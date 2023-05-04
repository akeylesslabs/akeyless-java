

# EsmDelete

esmDelete is a command that deletes a secret from an External Secrets Manager

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esmName** | **String** | Name of the External Secrets Manager item | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**secretId** | **String** | The external secret id (or name, for AWS, Azure or K8s targets) to delete | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



