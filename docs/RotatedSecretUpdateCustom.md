

# RotatedSecretUpdateCustom


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addTag** | **List&lt;String&gt;** | List of the new tags that will be attached to this item |  [optional] |
|**authenticationCredentials** | **String** | The credentials to connect with use-user-creds/use-target-creds |  [optional] |
|**autoRotate** | **String** | Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false] |  [optional] |
|**customPayload** | **String** | Secret payload to be sent with rotation request |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**enablePasswordPolicy** | **String** | Enable password policy |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Rotated secret name |  |
|**newName** | **String** | New item name |  [optional] |
|**passwordLength** | **String** | The length of the password to be generated |  [optional] |
|**rmTag** | **List&lt;String&gt;** | List of the existent tags that will be removed from this item |  [optional] |
|**rotateAfterDisconnect** | **String** | Rotate the value of the secret after SRA session ends [true/false] |  [optional] |
|**rotationEventIn** | **List&lt;String&gt;** | How many days before the rotation of the item would you like to be notified |  [optional] |
|**rotationHour** | **Integer** | The Hour of the rotation in UTC |  [optional] |
|**rotationInterval** | **String** | The number of days to wait between every automatic key rotation (1-365) |  [optional] |
|**secureAccessAllowExternalUser** | **Boolean** | Allow providing external user for a domain users |  [optional] |
|**secureAccessBastionIssuer** | **String** | Deprecated. use secure-access-certificate-issuer |  [optional] |
|**secureAccessCertificateIssuer** | **String** | Path to the SSH Certificate Issuer for your Akeyless Secure Access |  [optional] |
|**secureAccessEnable** | **String** | Enable/Disable secure remote access [true/false] |  [optional] |
|**secureAccessHost** | **List&lt;String&gt;** | Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers) |  [optional] |
|**secureAccessRdpDomain** | **String** | Default domain name server. i.e. microsoft.com |  [optional] |
|**secureAccessRdpUser** | **String** | Override the RDP Domain username |  [optional] |
|**secureAccessSshUser** | **String** | Override the SSH username as indicated in SSH Certificate Issuer |  [optional] |
|**secureAccessUrl** | **String** | Destination URL to inject secrets |  [optional] |
|**secureAccessWeb** | **Boolean** | Enable Web Secure Remote Access |  [optional] |
|**secureAccessWebBrowsing** | **Boolean** | Secure browser via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**secureAccessWebProxy** | **Boolean** | Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA) |  [optional] |
|**timeoutSec** | **Long** | Maximum allowed time in seconds for the custom rotator to return the results |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |
|**useCapitalLetters** | **String** | Password must contain capital letters [true/false] |  [optional] |
|**useLowerLetters** | **String** | Password must contain lower case letters [true/false] |  [optional] |
|**useNumbers** | **String** | Password must contain numbers [true/false] |  [optional] |
|**useSpecialCharacters** | **String** | Password must contain special characters [true/false] |  [optional] |



