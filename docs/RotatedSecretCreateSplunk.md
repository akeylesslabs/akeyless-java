

# RotatedSecretCreateSplunk

rotatedSecretCreateSplunk is a command that creates a rotated secret for a Splunk target. Currently we support target-rotator behavior (rotate credentials on the target itself).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** | Token audience for Splunk token creation (required for rotator-type&#x3D;token) |  [optional] |
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**expirationDate** | **String** | Token expiration date in YYYY-MM-DD format (required for rotator-type&#x3D;token when manual rotation is selected and no existing token is provided). Time will be set to 00:00 UTC. |  [optional] |
|**hecToken** | **String** | Current Splunk HEC token value to store (relevant only for rotator-type&#x3D;hec-token). If not provided, a new HEC input will be created in Splunk. |  [optional] |
|**hecTokenName** | **String** | Splunk HEC input name to manage  (required for rotator-type&#x3D;hec-token) |  [optional] |
|**itemCustomFields** | **Map&lt;String, String&gt;** | Additional custom fields to associate with the item |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rotatedPassword** | **String** | rotated-username password (relevant only for rotator-type&#x3D;password) |  [optional] |
|**rotatedUsername** | **String** | username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;password) |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional] |
|**rotatorType** | **String** | The rotator type. options: [target/password/token/hec-token] |  |
|**splunkToken** | **String** | Current Splunk authentication token to store (relevant only for rotator-type&#x3D;token). If not provided, a new token will be created in Splunk. |  [optional] |
|**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional] |
|**targetName** | **String** | The target name to associate |  |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**tokenOwner** | **String** | Splunk token owner username (relevant only for rotator-type&#x3D;token) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



