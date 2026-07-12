

# SAMLAccessRules


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedRedirectURIs** | **List&lt;String&gt;** | Allowed redirect URIs after the authentication |  [optional] |
|**boundAttributes** | [**List&lt;SAMLAttribute&gt;**](SAMLAttribute.md) | The attributes that login is restricted to. |  [optional] |
|**idpMetadataUrl** | **String** | IDP metadata url |  [optional] |
|**idpMetadataXml** | **String** | IDP metadata XML |  [optional] |
|**uniqueIdentifier** | **String** | A unique identifier to distinguish different users |  [optional] |
|**useDedicatedSamlUrls** | **Boolean** | When true, the login AuthnRequest is signed with this access method&#39;s dedicated SP identity (Entity ID https://&lt;sp&gt;/saml/sp/{access_id} and ACS https://&lt;sp&gt;/saml/acs/{access_id}) instead of the shared global identity. Default false keeps the legacy global identity for backward compatibility. |  [optional] |



