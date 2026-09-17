

# SystemAccessCredentialsReplyObj


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessId** | **String** |  |  [optional] |
|**authCreds** | **String** | Temporary credentials for accessing Auth |  [optional] |
|**csrfToken** | **String** | CSRF token for synchronizer-token pattern (only populated for WebUI clients) |  [optional] |
|**expiry** | **Long** | Credentials expiration date |  [optional] |
|**kfmCreds** | **String** | Temporary credentials for accessing the KFMs instances |  [optional] |
|**needMfaAppFirstConfig** | **Boolean** | If the user didn&#39;t complete to configure the MFA app |  [optional] |
|**recoveryKeyId** | **String** | RecoveryKeyID identifies the DPoP-bound recovery key for WebUI session recovery. |  [optional] |
|**requiredMfa** | **String** |  |  [optional] |
|**subClaims** | **Map&lt;String, List&lt;String&gt;&gt;** | SubClaims carries the IdP-verified RBAC claims for offline placeholder creds (empty UAM JWT); parsed from the ID token at callback time. |  [optional] |
|**token** | **String** | Credentials tmp token |  [optional] |
|**uamCreds** | **String** | Temporary credentials for accessing the UAM service |  [optional] |
|**uniqueId** | **String** | UniqueId is set only on Gateway-minted offline placeholder creds (empty UAM JWT), carrying the IdP unique identifier so usage-time RBAC can resolve identity. |  [optional] |



