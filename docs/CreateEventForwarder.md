

# CreateEventForwarder

createEventForwarder is a command that creates a new event forwarder [Deprecated - please use event-forwarder-create-* command]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminName** | **String** | Workstation Admin Name |  [optional] |
|**adminPwd** | **String** | Workstation Admin password |  [optional] |
|**appPrivateKeyBase64** | **String** | The RSA Private Key PEM formatted in base64 to use when connecting to ServiceNow with jwt authentication |  [optional] |
|**authType** | **String** | The authentication type to use when connecting to ServiceNow (user-pass / jwt) |  [optional] |
|**clientId** | **String** | The client ID to use when connecting to ServiceNow with jwt authentication |  [optional] |
|**clientSecret** | **String** | The client secret to use when connecting to ServiceNow with jwt authentication |  [optional] |
|**comment** | **String** | Deprecated - use description |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**emailTo** | **String** | A comma seperated list of email addresses to send event to (relevant only for \&quot;email\&quot; Event Forwarder) |  [optional] |
|**eventSourceLocations** | **List&lt;String&gt;** | Event sources |  |
|**eventSourceType** | **String** | Event Source type [item, target, auth_method, gateway] |  [optional] |
|**eventTypes** | **List&lt;String&gt;** | List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated] |  [optional] |
|**every** | **String** | Rate of periodic runner repetition in hours |  [optional] |
|**forwarderType** | **String** |  |  |
|**host** | **String** | Workstation Host |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**name** | **String** | EventForwarder name |  |
|**runnerType** | **String** |  |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**userEmail** | **String** | The user email to use when connecting to ServiceNow with jwt authentication |  [optional] |



