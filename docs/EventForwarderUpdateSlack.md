

# EventForwarderUpdateSlack

eventForwarderUpdateSlack is a command that updates slack event forwarder

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authMethodsEventSourceLocations** | **List&lt;String&gt;** | Auth Method Event sources |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enable** | **String** | Enable/Disable Event Forwarder [true/false] |  [optional] |
|**eventTypes** | **List&lt;String&gt;** | List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated, rate-limiting, usage-report, secret-sync] |  [optional] |
|**gatewaysEventSourceLocations** | **List&lt;String&gt;** | Event sources |  |
|**itemsEventSourceLocations** | **List&lt;String&gt;** | Items Event sources |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**name** | **String** | EventForwarder name |  |
|**newName** | **String** | New EventForwarder name |  [optional] |
|**targetsEventSourceLocations** | **List&lt;String&gt;** | Targets Event sources |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**url** | **String** | Slack Webhook URL |  |



