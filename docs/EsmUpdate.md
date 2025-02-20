

# EsmUpdate

esmUpdate is a command that updates a secret in an External Secrets Manager

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryValue** | **Boolean** | Use this option if the external secret value is a base64 encoded binary |  [optional] |
|**description** | **String** | Description of the external secret |  [optional] |
|**esmName** | **String** | Name of the External Secrets Manager item |  |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**secretId** | **String** | The external secret id (or name, for AWS, Azure or K8s targets) to update |  |
|**tags** | **Map&lt;String, String&gt;** | Tags for the external secret |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**value** | **String** | Value of the external secret item, either text or base64 encoded binary |  |



