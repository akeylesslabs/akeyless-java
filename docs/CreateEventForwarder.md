

# CreateEventForwarder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminName** | **String** | Workstation Admin Name |  [optional]
**adminPwd** | **String** | Workstation Admin password |  [optional]
**comment** | **String** | Comment about the EventForwarder |  [optional]
**emailTo** | **String** | A comma seperated list of email addresses to send event to (relevant only for \\\&quot;email\\\&quot; Event Forwarder) |  [optional]
**eventSourceLocations** | **List&lt;String&gt;** | Event sources | 
**eventSourceType** | **String** | Event Source type [item, target] |  [optional]
**eventTypes** | **List&lt;String&gt;** | Event types |  [optional]
**every** | **String** | Rate of periodic runner repetition in hours |  [optional]
**forwarderType** | **String** |  | 
**host** | **String** | Workstation Host |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**key** | **String** | The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used) |  [optional]
**name** | **String** | EventForwarder name | 
**runnerType** | **String** |  | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



