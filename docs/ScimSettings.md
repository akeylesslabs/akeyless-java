

# ScimSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bearerAccessId** | **String** | Access ID of the API Key auth method the IdP uses as the SCIM bearer. |  [optional] |
|**defaultIdentityType** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**endpoint** | **String** |  |  [optional] |
|**gatewayUrl** | **String** | URL of the gateway that serves the SCIM endpoint to the IdP, for the private endpoint. |  [optional] |
|**provisionedAccessId** | **String** | ProvisionedAccessId and ProvisionedType are set on the bearer itself, not on the auth method it provisions. They point back to the SAML or OIDC auth method the bearer provisions, so the gateway can find that auth method from the bearer. |  [optional] |
|**provisionedType** | **String** |  |  [optional] |



