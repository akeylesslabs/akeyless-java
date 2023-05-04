

# AddGatewayAllowedAccessId

Responses:  default: errorResponse 200: addGatewayAllowedAccessIdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | The access id that will be able to access to gateway | 
**clusterName** | **String** | The name of the updated cluster, e.g. acc-abcd12345678/p-123456789012/defaultCluster | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**subClaims** | **Map&lt;String, String&gt;** | key/val of sub claims, e.g group&#x3D;admins,developers |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



