

# CustomerFragmentConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**fragmentType** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**keyLabel** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**value** | **String** |  |  [optional] |
|**wrapAlg** | **String** | WrapAlg selects the HSM wrap algorithm for hsm_wrap_encrypt (e.g. rsa-oaep-sha256, aes-gcm, aes-cbc, aes-cbc-pad). RSA uses only WrapAlg; AES modes may require WrapIV and/or WrapTag. |  [optional] |
|**wrapIv** | **String** | WrapIV is the base64 IV for AES modes that require it (GCM/CBC). Empty for RSA and modes without IV metadata. |  [optional] |
|**wrapTag** | **String** | WrapTag is the base64 auth tag for AES-GCM only. Empty for RSA and other modes. |  [optional] |



