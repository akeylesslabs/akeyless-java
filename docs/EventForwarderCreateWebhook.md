

# EventForwarderCreateWebhook

eventForwarderCreateWebhook is a command that creates webhook event forwarder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMethodsEventSourceLocations** | **List&lt;String&gt;** | Auth Method Event sources |  [optional]
**authToken** | **String** | Base64 encoded Token string for authentication type Token |  [optional]
**authType** | **String** | The Webhook authentication type [user-pass, token, certificate] |  [optional]
**clientCertData** | **String** | Base64 encoded PEM certificate, relevant for certificate auth-type |  [optional]
**description** | **String** | Description of the object |  [optional]
**eventTypes** | **List&lt;String&gt;** | List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated] |  [optional]
**every** | **String** | Rate of periodic runner repetition in hours |  [optional]
**gatewaysEventSourceLocations** | **List&lt;String&gt;** | Event sources | 
**itemsEventSourceLocations** | **List&lt;String&gt;** | Items Event sources |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | EventForwarder name | 
**password** | **String** | Password for authentication relevant for user-pass auth-type |  [optional]
**privateKeyData** | **String** | Base64 encoded PEM RSA Private Key, relevant for certificate auth-type |  [optional]
**runnerType** | **String** |  | 
**serverCertificates** | **String** | Base64 encoded PEM certificate of the Webhook |  [optional]
**targetsEventSourceLocations** | **List&lt;String&gt;** | Targets Event sources |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**url** | **String** | Webhook URL |  [optional]
**username** | **String** | Username for authentication relevant for user-pass auth-type |  [optional]



