

# RotatedSecretUpdateSplunk

rotatedSecretUpdateSplunk is a command that updates a rotated secret for a Splunk target. It reuses the rotator type chosen at create time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**audience** | **String** | Token audience for Splunk token creation (relevant only for rotator-type&#x3D;token) |  [optional] |
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**expirationDate** | **String** | Token expiration date in YYYY-MM-DD format (relevant only for rotator-type&#x3D;token when manual rotation is selected). Time will be set to 00:00 UTC. |  [optional] |
|**hecToken** | **String** | For rotator-type&#x3D;hec-token, optionally set/replace the stored HEC token value. |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**newName** | **String** | New item name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional] |
|**splunkToken** | **String** | For rotator-type&#x3D;token, optionally set/replace the stored Splunk authentication token value. |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**tokenOwner** | **String** | For rotator-type&#x3D;token, specify the Splunk username that the new token should be issued for. (Splunk 10 requires name&#x3D;&lt;token-owner&gt; when creating auth tokens.) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



