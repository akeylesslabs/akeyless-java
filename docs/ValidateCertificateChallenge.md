

# ValidateCertificateChallenge

ValidateCertificateChallenge validates HTTP-01 challenge and finalizes certificate issuance (Phase 2)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | [**ValidateCertificateChallengeOutput**](ValidateCertificateChallengeOutput.md) |  |  [optional] |
|**certDisplayId** | **String** | Certificate display ID from Phase 1 |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**name** | **String** | Certificate name (alternative to cert-display-id) |  [optional] |
|**timeout** | **Long** | Validation timeout in seconds |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



