

# AuthMethodAccessInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** |  |  [optional]
**accessIdAlias** | **String** | for accounts where AccessId holds encrypted email this field will hold generated AccessId, for accounts based on regular AccessId it will be equal to accessId itself |  [optional]
**apiKeyAccessRules** | [**APIKeyAccessRules**](APIKeyAccessRules.md) |  |  [optional]
**awsIamAccessRules** | [**AWSIAMAccessRules**](AWSIAMAccessRules.md) |  |  [optional]
**azureAdAccessRules** | [**AzureADAccessRules**](AzureADAccessRules.md) |  |  [optional]
**certAccessRules** | [**CertAccessRules**](CertAccessRules.md) |  |  [optional]
**cidrWhitelist** | **String** |  |  [optional]
**emailPassAccessRules** | [**EmailPassAccessRules**](EmailPassAccessRules.md) |  |  [optional]
**forceSubClaims** | **Boolean** | if true the role associated with this auth method must include sub claims |  [optional]
**gcpAccessRules** | [**GCPAccessRules**](GCPAccessRules.md) |  |  [optional]
**gwCidrWhitelist** | **String** |  |  [optional]
**huaweiAccessRules** | [**HuaweiAccessRules**](HuaweiAccessRules.md) |  |  [optional]
**jwtTtl** | **Long** |  |  [optional]
**k8sAccessRules** | [**KubernetesAccessRules**](KubernetesAccessRules.md) |  |  [optional]
**ldapAccessRules** | [**LDAPAccessRules**](LDAPAccessRules.md) |  |  [optional]
**oauth2AccessRules** | [**OAuth2AccessRules**](OAuth2AccessRules.md) |  |  [optional]
**ociAccessRules** | [**OCIAccessRules**](OCIAccessRules.md) |  |  [optional]
**oidcAccessRules** | [**OIDCAccessRules**](OIDCAccessRules.md) |  |  [optional]
**rulesType** | **String** |  |  [optional]
**samlAccessRules** | [**SAMLAccessRules**](SAMLAccessRules.md) |  |  [optional]
**subClaimsDelimiters** | **List&lt;String&gt;** |  |  [optional]
**universalIdentityAccessRules** | [**UniversalIdentityAccessRules**](UniversalIdentityAccessRules.md) |  |  [optional]



