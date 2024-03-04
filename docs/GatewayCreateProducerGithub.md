

# GatewayCreateProducerGithub

gatewayCreateProducerGithub is a command that creates github producer [Deprecated: Use dynamic-secret-create-github command]

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item [true/false] |  [optional]
**githubAppId** | **Long** | Github app id |  [optional]
**githubAppPrivateKey** | **String** | App private key |  [optional]
**githubBaseUrl** | **String** | Base URL |  [optional]
**installationId** | **Long** | Github app installation id |  [optional]
**installationOrganization** | **String** | Optional, instead of installation id, set a GitHub organization name |  [optional]
**installationRepository** | **String** | Optional, instead of installation id, set a GitHub repository &#39;&lt;owner&gt;/&lt;repo-name&gt; |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**name** | **String** | Dynamic secret name | 
**tags** | **List&lt;String&gt;** | Add tags attached to this object |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenPermissions** | **List&lt;String&gt;** | Optional - installation token&#39;s allowed permissions |  [optional]
**tokenRepositories** | **List&lt;String&gt;** | Optional - installation token&#39;s allowed repositories |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



