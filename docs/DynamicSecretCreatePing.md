

# DynamicSecretCreatePing

dynamicSecretCreatePing is a command that creates ping dynamic secret

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Dynamic secret name |  |
|**pingAdministrativePort** | **String** | Ping Federate administrative port |  [optional] |
|**pingAtmId** | **String** | Set a specific Access Token Management (ATM) instance for the created OAuth Client by providing the ATM Id. If no explicit value is given, the default pingfederate server ATM will be set. |  [optional] |
|**pingAuthorizationPort** | **String** | Ping Federate authorization port |  [optional] |
|**pingCertSubjectDn** | **String** | The subject DN of the client certificate. If no explicit value is given, the producer will create CA certificate and matched client certificate and return it as value. Used in conjunction with ping-issuer-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method) |  [optional] |
|**pingClientAuthenticationType** | **String** | OAuth Client Authentication Type [CLIENT_SECRET, PRIVATE_KEY_JWT, CLIENT_TLS_CERTIFICATE] |  [optional] |
|**pingEnforceReplayPrevention** | **String** | Determines whether PingFederate requires a unique signed JWT from the client for each action (relevant for PRIVATE_KEY_JWT authentication method) [true/false] |  [optional] |
|**pingGrantTypes** | **List&lt;String&gt;** | List of OAuth client grant types [IMPLICIT, AUTHORIZATION_CODE, CLIENT_CREDENTIALS, TOKEN_EXCHANGE, REFRESH_TOKEN, ASSERTION_GRANTS, PASSWORD, RESOURCE_OWNER_CREDENTIALS]. If no explicit value is given, AUTHORIZATION_CODE will be selected as default. |  [optional] |
|**pingIssuerDn** | **String** | Issuer DN of trusted CA certificate that imported into Ping Federate server. You may select \\\&quot;Trust Any\\\&quot; to trust all the existing issuers in Ping Federate server. Used in conjunction with ping-cert-subject-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method) |  [optional] |
|**pingJwks** | **String** | Base64-encoded JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT (Sign Algo: RS256) and return it as value (relevant for PRIVATE_KEY_JWT authentication method) |  [optional] |
|**pingJwksUrl** | **String** | The URL of the JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT and return it as value (relevant for PRIVATE_KEY_JWT authentication method) |  [optional] |
|**pingPassword** | **String** | Ping Federate privileged user password |  [optional] |
|**pingPrivilegedUser** | **String** | Ping Federate privileged user |  [optional] |
|**pingRedirectUris** | **List&lt;String&gt;** | List of URIs to which the OAuth authorization server may redirect the resource owner&#39;s user agent after authorization is obtained. At least one redirection URI is required for the AUTHORIZATION_CODE and IMPLICIT grant types. |  [optional] |
|**pingRestrictedScopes** | **List&lt;String&gt;** | Limit the OAuth client to specific scopes list |  [optional] |
|**pingSigningAlgo** | **String** | The signing algorithm that the client must use to sign its request objects [RS256,RS384,RS512,ES256,ES384,ES512,PS256,PS384,PS512] If no explicit value is given, the client can use any of the supported signing algorithms (relevant for PRIVATE_KEY_JWT authentication method) |  [optional] |
|**pingUrl** | **String** | Ping URL |  [optional] |
|**producerEncryptionKeyName** | **String** | Dynamic producer encryption key |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | Target name |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userTtl** | **String** | The time from dynamic secret creation to expiration. |  [optional] |



