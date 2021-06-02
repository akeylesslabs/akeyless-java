# V2Api

All URIs are relative to *https://api.akeyless.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assocRoleAuthMethod**](V2Api.md#assocRoleAuthMethod) | **POST** /assoc-role-am | 
[**assocTargetItem**](V2Api.md#assocTargetItem) | **POST** /assoc-target-item | 
[**auth**](V2Api.md#auth) | **POST** /auth | 
[**configure**](V2Api.md#configure) | **POST** /configure | 
[**createAWSTarget**](V2Api.md#createAWSTarget) | **POST** /create-aws-target | 
[**createArtifactoryTarget**](V2Api.md#createArtifactoryTarget) | **POST** /create-artifactory-target | 
[**createAuthMethod**](V2Api.md#createAuthMethod) | **POST** /create-auth-method | 
[**createAuthMethodAWSIAM**](V2Api.md#createAuthMethodAWSIAM) | **POST** /create-auth-method-aws-iam | 
[**createAuthMethodAzureAD**](V2Api.md#createAuthMethodAzureAD) | **POST** /create-auth-method-azure-ad | 
[**createAuthMethodGCP**](V2Api.md#createAuthMethodGCP) | **POST** /create-auth-method-gcp | 
[**createAuthMethodHuawei**](V2Api.md#createAuthMethodHuawei) | **POST** /create-auth-method-huawei | 
[**createAuthMethodOAuth2**](V2Api.md#createAuthMethodOAuth2) | **POST** /create-auth-method-oauth2 | 
[**createAuthMethodSAML**](V2Api.md#createAuthMethodSAML) | **POST** /create-auth-method-saml | 
[**createAuthMethodUniversalIdentity**](V2Api.md#createAuthMethodUniversalIdentity) | **POST** /create-auth-method-universal-identity | 
[**createAzureTarget**](V2Api.md#createAzureTarget) | **POST** /create-azure-target | 
[**createClassicKey**](V2Api.md#createClassicKey) | **POST** /create-classic-key | 
[**createDBTarget**](V2Api.md#createDBTarget) | **POST** /create-db-target | 
[**createDFCKey**](V2Api.md#createDFCKey) | **POST** /create-dfc-key | 
[**createDynamicSecret**](V2Api.md#createDynamicSecret) | **POST** /create-dynamic-secret | 
[**createEKSTarget**](V2Api.md#createEKSTarget) | **POST** /create-eks-target | 
[**createGKETarget**](V2Api.md#createGKETarget) | **POST** /create-gke-target | 
[**createGcpTarget**](V2Api.md#createGcpTarget) | **POST** /create-gcp-target | 
[**createKey**](V2Api.md#createKey) | **POST** /create-key | 
[**createPKICertIssuer**](V2Api.md#createPKICertIssuer) | **POST** /create-pki-cert-issuer | 
[**createRabbitMQTarget**](V2Api.md#createRabbitMQTarget) | **POST** /create-rabbitmq-target | 
[**createRole**](V2Api.md#createRole) | **POST** /create-role | 
[**createRotatedSecret**](V2Api.md#createRotatedSecret) | **POST** /create-rotated-secret | 
[**createSSHCertIssuer**](V2Api.md#createSSHCertIssuer) | **POST** /create-ssh-cert-issuer | 
[**createSSHTarget**](V2Api.md#createSSHTarget) | **POST** /create-ssh-target | 
[**createSecret**](V2Api.md#createSecret) | **POST** /create-secret | 
[**createWebTarget**](V2Api.md#createWebTarget) | **POST** /create-web-target | 
[**decrypt**](V2Api.md#decrypt) | **POST** /decrypt | 
[**decryptPKCS1**](V2Api.md#decryptPKCS1) | **POST** /decrypt-pkcs1 | 
[**deleteAuthMethod**](V2Api.md#deleteAuthMethod) | **POST** /delete-auth-method | 
[**deleteAuthMethods**](V2Api.md#deleteAuthMethods) | **POST** /delete-auth-methods | 
[**deleteItem**](V2Api.md#deleteItem) | **POST** /delete-item | 
[**deleteItems**](V2Api.md#deleteItems) | **POST** /delete-items | 
[**deleteRole**](V2Api.md#deleteRole) | **POST** /delete-role | 
[**deleteRoleAssociation**](V2Api.md#deleteRoleAssociation) | **POST** /delete-assoc | 
[**deleteRoleRule**](V2Api.md#deleteRoleRule) | **POST** /delete-role-rule | 
[**deleteRoles**](V2Api.md#deleteRoles) | **POST** /delete-roles | 
[**deleteTarget**](V2Api.md#deleteTarget) | **POST** /delete-target | 
[**deleteTargetAssociation**](V2Api.md#deleteTargetAssociation) | **POST** /delete-assoc-target-item | 
[**deleteTargets**](V2Api.md#deleteTargets) | **POST** /delete-targets | 
[**describeItem**](V2Api.md#describeItem) | **POST** /describe-item | 
[**describePermissions**](V2Api.md#describePermissions) | **POST** /describe-permissions | 
[**encrypt**](V2Api.md#encrypt) | **POST** /encrypt | 
[**encryptPKCS1**](V2Api.md#encryptPKCS1) | **POST** /encrypt-pkcs1 | 
[**gatewayAddSubAdmins**](V2Api.md#gatewayAddSubAdmins) | **POST** /gateway-add-sub-admins | 
[**gatewayCreateProducerArtifactory**](V2Api.md#gatewayCreateProducerArtifactory) | **POST** /gateway-create-producer-artifactory | 
[**gatewayCreateProducerAws**](V2Api.md#gatewayCreateProducerAws) | **POST** /gateway-create-producer-aws | 
[**gatewayCreateProducerAzure**](V2Api.md#gatewayCreateProducerAzure) | **POST** /gateway-create-producer-azure | 
[**gatewayCreateProducerCertificateAutomation**](V2Api.md#gatewayCreateProducerCertificateAutomation) | **POST** /gateway-create-producer-certificate-automation | 
[**gatewayCreateProducerCustom**](V2Api.md#gatewayCreateProducerCustom) | **POST** /gateway-create-producer-custom | 
[**gatewayCreateProducerEks**](V2Api.md#gatewayCreateProducerEks) | **POST** /gateway-create-producer-eks | 
[**gatewayCreateProducerGcp**](V2Api.md#gatewayCreateProducerGcp) | **POST** /gateway-create-producer-gcp | 
[**gatewayCreateProducerGke**](V2Api.md#gatewayCreateProducerGke) | **POST** /gateway-create-producer-gke | 
[**gatewayCreateProducerMSSQL**](V2Api.md#gatewayCreateProducerMSSQL) | **POST** /gateway-create-producer-mssql | 
[**gatewayCreateProducerMongo**](V2Api.md#gatewayCreateProducerMongo) | **POST** /gateway-create-producer-mongo | 
[**gatewayCreateProducerMySQL**](V2Api.md#gatewayCreateProducerMySQL) | **POST** /gateway-create-producer-mysql | 
[**gatewayCreateProducerPostgreSQL**](V2Api.md#gatewayCreateProducerPostgreSQL) | **POST** /gateway-create-producer-postgresql | 
[**gatewayCreateProducerRabbitMQ**](V2Api.md#gatewayCreateProducerRabbitMQ) | **POST** /gateway-create-producer-rabbitmq | 
[**gatewayCreateProducerRdp**](V2Api.md#gatewayCreateProducerRdp) | **POST** /gateway-create-producer-rdp | 
[**gatewayCreateProducerSnowflake**](V2Api.md#gatewayCreateProducerSnowflake) | **POST** /gateway-create-producer-snowflake | 
[**gatewayDeleteProducer**](V2Api.md#gatewayDeleteProducer) | **POST** /gateway-delete-producer | 
[**gatewayDeleteSubAdmins**](V2Api.md#gatewayDeleteSubAdmins) | **POST** /gateway-delete-sub-admins | 
[**gatewayGetConfig**](V2Api.md#gatewayGetConfig) | **POST** /gateway-get-config | 
[**gatewayGetProducer**](V2Api.md#gatewayGetProducer) | **POST** /gateway-get-producer | 
[**gatewayGetTmpUsers**](V2Api.md#gatewayGetTmpUsers) | **POST** /gateway-get-producer-tmp-creds | 
[**gatewayListProducers**](V2Api.md#gatewayListProducers) | **POST** /gateway-list-producers | 
[**gatewayListSubAdmins**](V2Api.md#gatewayListSubAdmins) | **POST** /gateway-list-SubAdmins | 
[**gatewayRevokeTmpUsers**](V2Api.md#gatewayRevokeTmpUsers) | **POST** /gateway-revoke-producer-tmp-creds | 
[**gatewayStartProducer**](V2Api.md#gatewayStartProducer) | **POST** /gateway-start-producer | 
[**gatewayStopProducer**](V2Api.md#gatewayStopProducer) | **POST** /gateway-stop-producer | 
[**gatewayUpdateTmpUsers**](V2Api.md#gatewayUpdateTmpUsers) | **POST** /gateway-update-producer-tmp-creds | 
[**getAccountLogo**](V2Api.md#getAccountLogo) | **POST** /get-account-logo | 
[**getAuthMethod**](V2Api.md#getAuthMethod) | **POST** /get-auth-method | 
[**getDynamicSecretValue**](V2Api.md#getDynamicSecretValue) | **POST** /get-dynamic-secret-value | 
[**getKubeExecCreds**](V2Api.md#getKubeExecCreds) | **POST** /get-kube-exec-creds | 
[**getPKICertificate**](V2Api.md#getPKICertificate) | **POST** /get-pki-certificate | 
[**getRSAPublic**](V2Api.md#getRSAPublic) | **POST** /get-rsa-public | 
[**getRole**](V2Api.md#getRole) | **POST** /get-role | 
[**getRotatedSecretValue**](V2Api.md#getRotatedSecretValue) | **POST** /get-rotated-secret-value | 
[**getSSHCertificate**](V2Api.md#getSSHCertificate) | **POST** /get-ssh-certificate | 
[**getSecretValue**](V2Api.md#getSecretValue) | **POST** /get-secret-value | 
[**getTarget**](V2Api.md#getTarget) | **POST** /get-target | 
[**getTargetDetails**](V2Api.md#getTargetDetails) | **POST** /get-target-details | 
[**listAuthMethods**](V2Api.md#listAuthMethods) | **POST** /list-auth-methods | 
[**listItems**](V2Api.md#listItems) | **POST** /list-items | 
[**listRoles**](V2Api.md#listRoles) | **POST** /list-roles | 
[**listTargets**](V2Api.md#listTargets) | **POST** /list-targets | 
[**moveObjects**](V2Api.md#moveObjects) | **POST** /move-objects | 
[**rawCreds**](V2Api.md#rawCreds) | **POST** /raw-creds | 
[**refreshKey**](V2Api.md#refreshKey) | **POST** /refresh-key | 
[**reverseRBAC**](V2Api.md#reverseRBAC) | **POST** /reverse-rbac | 
[**rollbackSecret**](V2Api.md#rollbackSecret) | **POST** /rollback-secret | 
[**rotateKey**](V2Api.md#rotateKey) | **POST** /rotate-key | 
[**setItemState**](V2Api.md#setItemState) | **POST** /set-item-state | 
[**setRoleRule**](V2Api.md#setRoleRule) | **POST** /set-role-rule | 
[**signPKCS1**](V2Api.md#signPKCS1) | **POST** /sign-pkcs1 | 
[**staticCredsAuth**](V2Api.md#staticCredsAuth) | **POST** /static-creds-auth | 
[**uidCreateChildToken**](V2Api.md#uidCreateChildToken) | **POST** /uid-create-child-token | 
[**uidGenerateToken**](V2Api.md#uidGenerateToken) | **POST** /uid-generate-token | 
[**uidListChildren**](V2Api.md#uidListChildren) | **POST** /uid-list-children | 
[**uidRevokeToken**](V2Api.md#uidRevokeToken) | **POST** /uid-revoke-token | 
[**uidRotateToken**](V2Api.md#uidRotateToken) | **POST** /uid-rotate-token | 
[**updateAWSTargetDetails**](V2Api.md#updateAWSTargetDetails) | **POST** /update-aws-target-details | 
[**updateAssoc**](V2Api.md#updateAssoc) | **POST** /update-assoc | 
[**updateDBTargetDetails**](V2Api.md#updateDBTargetDetails) | **POST** /update-db-target-details | 
[**updateItem**](V2Api.md#updateItem) | **POST** /update-item | 
[**updateRDPTargetDetails**](V2Api.md#updateRDPTargetDetails) | **POST** /update-rdp-target-details | 
[**updateRabbitMQTargetDetails**](V2Api.md#updateRabbitMQTargetDetails) | **POST** /update-rabbitmq-target-details | 
[**updateRole**](V2Api.md#updateRole) | **POST** /update-role | 
[**updateRotatedSecret**](V2Api.md#updateRotatedSecret) | **POST** /update-rotated-secret | 
[**updateRotationSettings**](V2Api.md#updateRotationSettings) | **POST** /update-rotation-settingsrotate-key | 
[**updateSSHTargetDetails**](V2Api.md#updateSSHTargetDetails) | **POST** /update-ssh-target-details | 
[**updateSecretVal**](V2Api.md#updateSecretVal) | **POST** /update-secret-val | 
[**updateTarget**](V2Api.md#updateTarget) | **POST** /update-target | 
[**updateTargetDetails**](V2Api.md#updateTargetDetails) | **POST** /update-target-details | 
[**updateWebTargetDetails**](V2Api.md#updateWebTargetDetails) | **POST** /update-web-target-details | 
[**uploadRSA**](V2Api.md#uploadRSA) | **POST** /upload-rsa | 
[**verifyPKCS1**](V2Api.md#verifyPKCS1) | **POST** /verify-pkcs1 | 


<a name="assocRoleAuthMethod"></a>
# **assocRoleAuthMethod**
> CreateRoleAuthMethodAssocOutput assocRoleAuthMethod(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    AssocRoleAuthMethod body = new AssocRoleAuthMethod(); // AssocRoleAuthMethod | 
    try {
      CreateRoleAuthMethodAssocOutput result = apiInstance.assocRoleAuthMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#assocRoleAuthMethod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssocRoleAuthMethod**](AssocRoleAuthMethod.md)|  |

### Return type

[**CreateRoleAuthMethodAssocOutput**](CreateRoleAuthMethodAssocOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | assocRoleAuthMethodResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="assocTargetItem"></a>
# **assocTargetItem**
> CreateTargetItemAssocOutput assocTargetItem(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    AssocTargetItem body = new AssocTargetItem(); // AssocTargetItem | 
    try {
      CreateTargetItemAssocOutput result = apiInstance.assocTargetItem(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#assocTargetItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssocTargetItem**](AssocTargetItem.md)|  |

### Return type

[**CreateTargetItemAssocOutput**](CreateTargetItemAssocOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | assocTargetItemResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="auth"></a>
# **auth**
> AuthOutput auth(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    Auth body = new Auth(); // Auth | 
    try {
      AuthOutput result = apiInstance.auth(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#auth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth**](Auth.md)|  |

### Return type

[**AuthOutput**](AuthOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | authResponse wraps response body. |  -  |
**401** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="configure"></a>
# **configure**
> ConfigureOutput configure(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    Configure body = new Configure(); // Configure | 
    try {
      ConfigureOutput result = apiInstance.configure(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#configure");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Configure**](Configure.md)|  |

### Return type

[**ConfigureOutput**](ConfigureOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | configureResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAWSTarget"></a>
# **createAWSTarget**
> CreateAWSTargetOutput createAWSTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAWSTarget body = new CreateAWSTarget(); // CreateAWSTarget | 
    try {
      CreateAWSTargetOutput result = apiInstance.createAWSTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAWSTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAWSTarget**](CreateAWSTarget.md)|  |

### Return type

[**CreateAWSTargetOutput**](CreateAWSTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAWSTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createArtifactoryTarget"></a>
# **createArtifactoryTarget**
> CreateArtifactoryTargetOutput createArtifactoryTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateArtifactoryTarget body = new CreateArtifactoryTarget(); // CreateArtifactoryTarget | 
    try {
      CreateArtifactoryTargetOutput result = apiInstance.createArtifactoryTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createArtifactoryTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateArtifactoryTarget**](CreateArtifactoryTarget.md)|  |

### Return type

[**CreateArtifactoryTargetOutput**](CreateArtifactoryTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createArtifactoryTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethod"></a>
# **createAuthMethod**
> CreateAuthMethodOutput createAuthMethod(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethod body = new CreateAuthMethod(); // CreateAuthMethod | 
    try {
      CreateAuthMethodOutput result = apiInstance.createAuthMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethod**](CreateAuthMethod.md)|  |

### Return type

[**CreateAuthMethodOutput**](CreateAuthMethodOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodAWSIAM"></a>
# **createAuthMethodAWSIAM**
> CreateAuthMethodAWSIAMOutput createAuthMethodAWSIAM(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodAWSIAM body = new CreateAuthMethodAWSIAM(); // CreateAuthMethodAWSIAM | 
    try {
      CreateAuthMethodAWSIAMOutput result = apiInstance.createAuthMethodAWSIAM(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodAWSIAM");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodAWSIAM**](CreateAuthMethodAWSIAM.md)|  |

### Return type

[**CreateAuthMethodAWSIAMOutput**](CreateAuthMethodAWSIAMOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodAWSIAMResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodAzureAD"></a>
# **createAuthMethodAzureAD**
> CreateAuthMethodAzureADOutput createAuthMethodAzureAD(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodAzureAD body = new CreateAuthMethodAzureAD(); // CreateAuthMethodAzureAD | 
    try {
      CreateAuthMethodAzureADOutput result = apiInstance.createAuthMethodAzureAD(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodAzureAD");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodAzureAD**](CreateAuthMethodAzureAD.md)|  |

### Return type

[**CreateAuthMethodAzureADOutput**](CreateAuthMethodAzureADOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodAzureADResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodGCP"></a>
# **createAuthMethodGCP**
> CreateAuthMethodGCPOutput createAuthMethodGCP(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodGCP body = new CreateAuthMethodGCP(); // CreateAuthMethodGCP | 
    try {
      CreateAuthMethodGCPOutput result = apiInstance.createAuthMethodGCP(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodGCP");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodGCP**](CreateAuthMethodGCP.md)|  |

### Return type

[**CreateAuthMethodGCPOutput**](CreateAuthMethodGCPOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodGCPResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodHuawei"></a>
# **createAuthMethodHuawei**
> CreateAuthMethodHuaweiOutput createAuthMethodHuawei(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodHuawei body = new CreateAuthMethodHuawei(); // CreateAuthMethodHuawei | 
    try {
      CreateAuthMethodHuaweiOutput result = apiInstance.createAuthMethodHuawei(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodHuawei");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodHuawei**](CreateAuthMethodHuawei.md)|  |

### Return type

[**CreateAuthMethodHuaweiOutput**](CreateAuthMethodHuaweiOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodHuaweiResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodOAuth2"></a>
# **createAuthMethodOAuth2**
> CreateAuthMethodOAuth2Output createAuthMethodOAuth2(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodOAuth2 body = new CreateAuthMethodOAuth2(); // CreateAuthMethodOAuth2 | 
    try {
      CreateAuthMethodOAuth2Output result = apiInstance.createAuthMethodOAuth2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodOAuth2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodOAuth2**](CreateAuthMethodOAuth2.md)|  |

### Return type

[**CreateAuthMethodOAuth2Output**](CreateAuthMethodOAuth2Output.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodOAuth2Response wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodSAML"></a>
# **createAuthMethodSAML**
> CreateAuthMethodSAMLOutput createAuthMethodSAML(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodSAML body = new CreateAuthMethodSAML(); // CreateAuthMethodSAML | 
    try {
      CreateAuthMethodSAMLOutput result = apiInstance.createAuthMethodSAML(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodSAML");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodSAML**](CreateAuthMethodSAML.md)|  |

### Return type

[**CreateAuthMethodSAMLOutput**](CreateAuthMethodSAMLOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodSAMLResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAuthMethodUniversalIdentity"></a>
# **createAuthMethodUniversalIdentity**
> CreateAuthMethodUniversalIdentityOutput createAuthMethodUniversalIdentity(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAuthMethodUniversalIdentity body = new CreateAuthMethodUniversalIdentity(); // CreateAuthMethodUniversalIdentity | 
    try {
      CreateAuthMethodUniversalIdentityOutput result = apiInstance.createAuthMethodUniversalIdentity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodUniversalIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAuthMethodUniversalIdentity**](CreateAuthMethodUniversalIdentity.md)|  |

### Return type

[**CreateAuthMethodUniversalIdentityOutput**](CreateAuthMethodUniversalIdentityOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodUniversalIdentityResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createAzureTarget"></a>
# **createAzureTarget**
> CreateAzureTargetOutput createAzureTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateAzureTarget body = new CreateAzureTarget(); // CreateAzureTarget | 
    try {
      CreateAzureTargetOutput result = apiInstance.createAzureTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAzureTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAzureTarget**](CreateAzureTarget.md)|  |

### Return type

[**CreateAzureTargetOutput**](CreateAzureTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAzureTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createClassicKey"></a>
# **createClassicKey**
> CreateClassicKeyOutput createClassicKey(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateClassicKey body = new CreateClassicKey(); // CreateClassicKey | 
    try {
      CreateClassicKeyOutput result = apiInstance.createClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createClassicKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateClassicKey**](CreateClassicKey.md)|  |

### Return type

[**CreateClassicKeyOutput**](CreateClassicKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | CreateClassicKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createDBTarget"></a>
# **createDBTarget**
> CreateDBTargetOutput createDBTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateDBTarget body = new CreateDBTarget(); // CreateDBTarget | 
    try {
      CreateDBTargetOutput result = apiInstance.createDBTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createDBTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDBTarget**](CreateDBTarget.md)|  |

### Return type

[**CreateDBTargetOutput**](CreateDBTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createDBTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createDFCKey"></a>
# **createDFCKey**
> CreateDFCKeyOutput createDFCKey(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateDFCKey body = new CreateDFCKey(); // CreateDFCKey | 
    try {
      CreateDFCKeyOutput result = apiInstance.createDFCKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createDFCKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDFCKey**](CreateDFCKey.md)|  |

### Return type

[**CreateDFCKeyOutput**](CreateDFCKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createDFCKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createDynamicSecret"></a>
# **createDynamicSecret**
> Object createDynamicSecret(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateDynamicSecret body = new CreateDynamicSecret(); // CreateDynamicSecret | 
    try {
      Object result = apiInstance.createDynamicSecret(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createDynamicSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDynamicSecret**](CreateDynamicSecret.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createDynamicSecretResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createEKSTarget"></a>
# **createEKSTarget**
> CreateEKSTargetOutput createEKSTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateEKSTarget body = new CreateEKSTarget(); // CreateEKSTarget | 
    try {
      CreateEKSTargetOutput result = apiInstance.createEKSTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createEKSTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEKSTarget**](CreateEKSTarget.md)|  |

### Return type

[**CreateEKSTargetOutput**](CreateEKSTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createEKSTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createGKETarget"></a>
# **createGKETarget**
> CreateGKETargetOutput createGKETarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateGKETarget body = new CreateGKETarget(); // CreateGKETarget | 
    try {
      CreateGKETargetOutput result = apiInstance.createGKETarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createGKETarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateGKETarget**](CreateGKETarget.md)|  |

### Return type

[**CreateGKETargetOutput**](CreateGKETargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createGKETargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createGcpTarget"></a>
# **createGcpTarget**
> CreateGcpTargetOutput createGcpTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateGcpTarget body = new CreateGcpTarget(); // CreateGcpTarget | 
    try {
      CreateGcpTargetOutput result = apiInstance.createGcpTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createGcpTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateGcpTarget**](CreateGcpTarget.md)|  |

### Return type

[**CreateGcpTargetOutput**](CreateGcpTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createGcpTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createKey"></a>
# **createKey**
> CreateKeyOutput createKey(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateKey body = new CreateKey(); // CreateKey | 
    try {
      CreateKeyOutput result = apiInstance.createKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateKey**](CreateKey.md)|  |

### Return type

[**CreateKeyOutput**](CreateKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createPKICertIssuer"></a>
# **createPKICertIssuer**
> CreatePKICertIssuerOutput createPKICertIssuer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreatePKICertIssuer body = new CreatePKICertIssuer(); // CreatePKICertIssuer | 
    try {
      CreatePKICertIssuerOutput result = apiInstance.createPKICertIssuer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createPKICertIssuer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePKICertIssuer**](CreatePKICertIssuer.md)|  |

### Return type

[**CreatePKICertIssuerOutput**](CreatePKICertIssuerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createPKICertIssuerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createRabbitMQTarget"></a>
# **createRabbitMQTarget**
> CreateRabbitMQTargetOutput createRabbitMQTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateRabbitMQTarget body = new CreateRabbitMQTarget(); // CreateRabbitMQTarget | 
    try {
      CreateRabbitMQTargetOutput result = apiInstance.createRabbitMQTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createRabbitMQTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRabbitMQTarget**](CreateRabbitMQTarget.md)|  |

### Return type

[**CreateRabbitMQTargetOutput**](CreateRabbitMQTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createRabbitMQTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createRole"></a>
# **createRole**
> Object createRole(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateRole body = new CreateRole(); // CreateRole | 
    try {
      Object result = apiInstance.createRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRole**](CreateRole.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createRoleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createRotatedSecret"></a>
# **createRotatedSecret**
> CreateRotatedSecretOutput createRotatedSecret(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateRotatedSecret body = new CreateRotatedSecret(); // CreateRotatedSecret | 
    try {
      CreateRotatedSecretOutput result = apiInstance.createRotatedSecret(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createRotatedSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRotatedSecret**](CreateRotatedSecret.md)|  |

### Return type

[**CreateRotatedSecretOutput**](CreateRotatedSecretOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createRotatedSecretResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createSSHCertIssuer"></a>
# **createSSHCertIssuer**
> CreateSSHCertIssuerOutput createSSHCertIssuer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateSSHCertIssuer body = new CreateSSHCertIssuer(); // CreateSSHCertIssuer | 
    try {
      CreateSSHCertIssuerOutput result = apiInstance.createSSHCertIssuer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createSSHCertIssuer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSSHCertIssuer**](CreateSSHCertIssuer.md)|  |

### Return type

[**CreateSSHCertIssuerOutput**](CreateSSHCertIssuerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createSSHCertIssuerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createSSHTarget"></a>
# **createSSHTarget**
> CreateSSHTargetOutput createSSHTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateSSHTarget body = new CreateSSHTarget(); // CreateSSHTarget | 
    try {
      CreateSSHTargetOutput result = apiInstance.createSSHTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createSSHTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSSHTarget**](CreateSSHTarget.md)|  |

### Return type

[**CreateSSHTargetOutput**](CreateSSHTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createSSHTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createSecret"></a>
# **createSecret**
> CreateSecretOutput createSecret(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateSecret body = new CreateSecret(); // CreateSecret | 
    try {
      CreateSecretOutput result = apiInstance.createSecret(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSecret**](CreateSecret.md)|  |

### Return type

[**CreateSecretOutput**](CreateSecretOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createSecretResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="createWebTarget"></a>
# **createWebTarget**
> CreateWebTargetOutput createWebTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    CreateWebTarget body = new CreateWebTarget(); // CreateWebTarget | 
    try {
      CreateWebTargetOutput result = apiInstance.createWebTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createWebTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateWebTarget**](CreateWebTarget.md)|  |

### Return type

[**CreateWebTargetOutput**](CreateWebTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createWebTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="decrypt"></a>
# **decrypt**
> DecryptOutput decrypt(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    Decrypt body = new Decrypt(); // Decrypt | 
    try {
      DecryptOutput result = apiInstance.decrypt(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#decrypt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Decrypt**](Decrypt.md)|  |

### Return type

[**DecryptOutput**](DecryptOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | decryptResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="decryptPKCS1"></a>
# **decryptPKCS1**
> DecryptPKCS1Output decryptPKCS1(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DecryptPKCS1 body = new DecryptPKCS1(); // DecryptPKCS1 | 
    try {
      DecryptPKCS1Output result = apiInstance.decryptPKCS1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#decryptPKCS1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DecryptPKCS1**](DecryptPKCS1.md)|  |

### Return type

[**DecryptPKCS1Output**](DecryptPKCS1Output.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | decryptPKCS1Response wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteAuthMethod"></a>
# **deleteAuthMethod**
> DeleteAuthMethodOutput deleteAuthMethod(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteAuthMethod body = new DeleteAuthMethod(); // DeleteAuthMethod | 
    try {
      DeleteAuthMethodOutput result = apiInstance.deleteAuthMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteAuthMethod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteAuthMethod**](DeleteAuthMethod.md)|  |

### Return type

[**DeleteAuthMethodOutput**](DeleteAuthMethodOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteAuthMethodResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteAuthMethods"></a>
# **deleteAuthMethods**
> DeleteAuthMethodsOutput deleteAuthMethods(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteAuthMethods body = new DeleteAuthMethods(); // DeleteAuthMethods | 
    try {
      DeleteAuthMethodsOutput result = apiInstance.deleteAuthMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteAuthMethods");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteAuthMethods**](DeleteAuthMethods.md)|  |

### Return type

[**DeleteAuthMethodsOutput**](DeleteAuthMethodsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteAuthMethodsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteItem"></a>
# **deleteItem**
> DeleteItemOutput deleteItem(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteItem body = new DeleteItem(); // DeleteItem | 
    try {
      DeleteItemOutput result = apiInstance.deleteItem(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteItem**](DeleteItem.md)|  |

### Return type

[**DeleteItemOutput**](DeleteItemOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteItemResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteItems"></a>
# **deleteItems**
> DeleteItemsOutput deleteItems(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteItems body = new DeleteItems(); // DeleteItems | 
    try {
      DeleteItemsOutput result = apiInstance.deleteItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteItems**](DeleteItems.md)|  |

### Return type

[**DeleteItemsOutput**](DeleteItemsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteItemsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteRole"></a>
# **deleteRole**
> Object deleteRole(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteRole body = new DeleteRole(); // DeleteRole | 
    try {
      Object result = apiInstance.deleteRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRole**](DeleteRole.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteRoleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteRoleAssociation"></a>
# **deleteRoleAssociation**
> Object deleteRoleAssociation(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteRoleAssociation body = new DeleteRoleAssociation(); // DeleteRoleAssociation | 
    try {
      Object result = apiInstance.deleteRoleAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteRoleAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRoleAssociation**](DeleteRoleAssociation.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteRoleAssociationResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteRoleRule"></a>
# **deleteRoleRule**
> DeleteRoleRuleOutput deleteRoleRule(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteRoleRule body = new DeleteRoleRule(); // DeleteRoleRule | 
    try {
      DeleteRoleRuleOutput result = apiInstance.deleteRoleRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteRoleRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRoleRule**](DeleteRoleRule.md)|  |

### Return type

[**DeleteRoleRuleOutput**](DeleteRoleRuleOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteRoleRuleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteRoles"></a>
# **deleteRoles**
> Object deleteRoles(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteRoles body = new DeleteRoles(); // DeleteRoles | 
    try {
      Object result = apiInstance.deleteRoles(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRoles**](DeleteRoles.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteRolesResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteTarget"></a>
# **deleteTarget**
> Object deleteTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteTarget body = new DeleteTarget(); // DeleteTarget | 
    try {
      Object result = apiInstance.deleteTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTarget**](DeleteTarget.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteTargetAssociation"></a>
# **deleteTargetAssociation**
> Object deleteTargetAssociation(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteTargetAssociation body = new DeleteTargetAssociation(); // DeleteTargetAssociation | 
    try {
      Object result = apiInstance.deleteTargetAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteTargetAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTargetAssociation**](DeleteTargetAssociation.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteTargetAssociationResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="deleteTargets"></a>
# **deleteTargets**
> Object deleteTargets(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DeleteTargets body = new DeleteTargets(); // DeleteTargets | 
    try {
      Object result = apiInstance.deleteTargets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#deleteTargets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTargets**](DeleteTargets.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | deleteTargetsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="describeItem"></a>
# **describeItem**
> Item describeItem(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DescribeItem body = new DescribeItem(); // DescribeItem | 
    try {
      Item result = apiInstance.describeItem(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#describeItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DescribeItem**](DescribeItem.md)|  |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | describeItemResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="describePermissions"></a>
# **describePermissions**
> DescribePermissionsOutput describePermissions(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    DescribePermissions body = new DescribePermissions(); // DescribePermissions | 
    try {
      DescribePermissionsOutput result = apiInstance.describePermissions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#describePermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DescribePermissions**](DescribePermissions.md)|  |

### Return type

[**DescribePermissionsOutput**](DescribePermissionsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DescribePermissionsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="encrypt"></a>
# **encrypt**
> EncryptOutput encrypt(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    Encrypt body = new Encrypt(); // Encrypt | 
    try {
      EncryptOutput result = apiInstance.encrypt(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#encrypt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Encrypt**](Encrypt.md)|  |

### Return type

[**EncryptOutput**](EncryptOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | encryptResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="encryptPKCS1"></a>
# **encryptPKCS1**
> EncryptPKCS1Output encryptPKCS1(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    EncryptPKCS1 body = new EncryptPKCS1(); // EncryptPKCS1 | 
    try {
      EncryptPKCS1Output result = apiInstance.encryptPKCS1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#encryptPKCS1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EncryptPKCS1**](EncryptPKCS1.md)|  |

### Return type

[**EncryptPKCS1Output**](EncryptPKCS1Output.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | encryptPKCS1Response wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayAddSubAdmins"></a>
# **gatewayAddSubAdmins**
> Object gatewayAddSubAdmins(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayAddSubAdmins body = new GatewayAddSubAdmins(); // GatewayAddSubAdmins | 
    try {
      Object result = apiInstance.gatewayAddSubAdmins(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayAddSubAdmins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayAddSubAdmins**](GatewayAddSubAdmins.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayAddSubAdminsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerArtifactory"></a>
# **gatewayCreateProducerArtifactory**
> GatewayCreateProducerArtifactoryOutput gatewayCreateProducerArtifactory(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerArtifactory body = new GatewayCreateProducerArtifactory(); // GatewayCreateProducerArtifactory | 
    try {
      GatewayCreateProducerArtifactoryOutput result = apiInstance.gatewayCreateProducerArtifactory(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerArtifactory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerArtifactory**](GatewayCreateProducerArtifactory.md)|  |

### Return type

[**GatewayCreateProducerArtifactoryOutput**](GatewayCreateProducerArtifactoryOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerArtifactoryResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerAws"></a>
# **gatewayCreateProducerAws**
> GatewayCreateProducerAwsOutput gatewayCreateProducerAws(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerAws body = new GatewayCreateProducerAws(); // GatewayCreateProducerAws | 
    try {
      GatewayCreateProducerAwsOutput result = apiInstance.gatewayCreateProducerAws(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerAws");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerAws**](GatewayCreateProducerAws.md)|  |

### Return type

[**GatewayCreateProducerAwsOutput**](GatewayCreateProducerAwsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerAwsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerAzure"></a>
# **gatewayCreateProducerAzure**
> GatewayCreateProducerAzureOutput gatewayCreateProducerAzure(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerAzure body = new GatewayCreateProducerAzure(); // GatewayCreateProducerAzure | 
    try {
      GatewayCreateProducerAzureOutput result = apiInstance.gatewayCreateProducerAzure(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerAzure");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerAzure**](GatewayCreateProducerAzure.md)|  |

### Return type

[**GatewayCreateProducerAzureOutput**](GatewayCreateProducerAzureOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerAzureResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerCertificateAutomation"></a>
# **gatewayCreateProducerCertificateAutomation**
> GatewayCreateProducerCertificateAutomationOutput gatewayCreateProducerCertificateAutomation(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerCertificateAutomation body = new GatewayCreateProducerCertificateAutomation(); // GatewayCreateProducerCertificateAutomation | 
    try {
      GatewayCreateProducerCertificateAutomationOutput result = apiInstance.gatewayCreateProducerCertificateAutomation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerCertificateAutomation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerCertificateAutomation**](GatewayCreateProducerCertificateAutomation.md)|  |

### Return type

[**GatewayCreateProducerCertificateAutomationOutput**](GatewayCreateProducerCertificateAutomationOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerCertificateAutomationResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerCustom"></a>
# **gatewayCreateProducerCustom**
> GatewayCreateProducerCustomOutput gatewayCreateProducerCustom(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerCustom body = new GatewayCreateProducerCustom(); // GatewayCreateProducerCustom | 
    try {
      GatewayCreateProducerCustomOutput result = apiInstance.gatewayCreateProducerCustom(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerCustom");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerCustom**](GatewayCreateProducerCustom.md)|  | [optional]

### Return type

[**GatewayCreateProducerCustomOutput**](GatewayCreateProducerCustomOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayCreateProducerCustomResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerEks"></a>
# **gatewayCreateProducerEks**
> GatewayCreateProducerEksOutput gatewayCreateProducerEks(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerEks body = new GatewayCreateProducerEks(); // GatewayCreateProducerEks | 
    try {
      GatewayCreateProducerEksOutput result = apiInstance.gatewayCreateProducerEks(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerEks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerEks**](GatewayCreateProducerEks.md)|  |

### Return type

[**GatewayCreateProducerEksOutput**](GatewayCreateProducerEksOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerEksResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerGcp"></a>
# **gatewayCreateProducerGcp**
> GatewayCreateProducerGcpOutput gatewayCreateProducerGcp(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerGcp body = new GatewayCreateProducerGcp(); // GatewayCreateProducerGcp | 
    try {
      GatewayCreateProducerGcpOutput result = apiInstance.gatewayCreateProducerGcp(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerGcp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerGcp**](GatewayCreateProducerGcp.md)|  |

### Return type

[**GatewayCreateProducerGcpOutput**](GatewayCreateProducerGcpOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerGcpResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerGke"></a>
# **gatewayCreateProducerGke**
> GatewayCreateProducerGkeOutput gatewayCreateProducerGke(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerGke body = new GatewayCreateProducerGke(); // GatewayCreateProducerGke | 
    try {
      GatewayCreateProducerGkeOutput result = apiInstance.gatewayCreateProducerGke(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerGke");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerGke**](GatewayCreateProducerGke.md)|  |

### Return type

[**GatewayCreateProducerGkeOutput**](GatewayCreateProducerGkeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerGkeResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerMSSQL"></a>
# **gatewayCreateProducerMSSQL**
> GatewayCreateProducerMSSQLOutput gatewayCreateProducerMSSQL(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerMSSQL body = new GatewayCreateProducerMSSQL(); // GatewayCreateProducerMSSQL | 
    try {
      GatewayCreateProducerMSSQLOutput result = apiInstance.gatewayCreateProducerMSSQL(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerMSSQL");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerMSSQL**](GatewayCreateProducerMSSQL.md)|  |

### Return type

[**GatewayCreateProducerMSSQLOutput**](GatewayCreateProducerMSSQLOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerMSSQLResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerMongo"></a>
# **gatewayCreateProducerMongo**
> GatewayCreateProducerMongoOutput gatewayCreateProducerMongo(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerMongo body = new GatewayCreateProducerMongo(); // GatewayCreateProducerMongo | 
    try {
      GatewayCreateProducerMongoOutput result = apiInstance.gatewayCreateProducerMongo(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerMongo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerMongo**](GatewayCreateProducerMongo.md)|  |

### Return type

[**GatewayCreateProducerMongoOutput**](GatewayCreateProducerMongoOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerMongoResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerMySQL"></a>
# **gatewayCreateProducerMySQL**
> GatewayCreateProducerMySQLOutput gatewayCreateProducerMySQL(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerMySQL body = new GatewayCreateProducerMySQL(); // GatewayCreateProducerMySQL | 
    try {
      GatewayCreateProducerMySQLOutput result = apiInstance.gatewayCreateProducerMySQL(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerMySQL");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerMySQL**](GatewayCreateProducerMySQL.md)|  |

### Return type

[**GatewayCreateProducerMySQLOutput**](GatewayCreateProducerMySQLOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerMySQLResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerPostgreSQL"></a>
# **gatewayCreateProducerPostgreSQL**
> GatewayCreateProducerPostgreSQLOutput gatewayCreateProducerPostgreSQL(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerPostgreSQL body = new GatewayCreateProducerPostgreSQL(); // GatewayCreateProducerPostgreSQL | 
    try {
      GatewayCreateProducerPostgreSQLOutput result = apiInstance.gatewayCreateProducerPostgreSQL(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerPostgreSQL");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerPostgreSQL**](GatewayCreateProducerPostgreSQL.md)|  |

### Return type

[**GatewayCreateProducerPostgreSQLOutput**](GatewayCreateProducerPostgreSQLOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerPostgreSQLResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerRabbitMQ"></a>
# **gatewayCreateProducerRabbitMQ**
> GatewayCreateProducerRabbitMQOutput gatewayCreateProducerRabbitMQ(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerRabbitMQ body = new GatewayCreateProducerRabbitMQ(); // GatewayCreateProducerRabbitMQ | 
    try {
      GatewayCreateProducerRabbitMQOutput result = apiInstance.gatewayCreateProducerRabbitMQ(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerRabbitMQ");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerRabbitMQ**](GatewayCreateProducerRabbitMQ.md)|  |

### Return type

[**GatewayCreateProducerRabbitMQOutput**](GatewayCreateProducerRabbitMQOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerRabbitMQResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerRdp"></a>
# **gatewayCreateProducerRdp**
> GatewayCreateProducerRdpOutput gatewayCreateProducerRdp(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerRdp body = new GatewayCreateProducerRdp(); // GatewayCreateProducerRdp | 
    try {
      GatewayCreateProducerRdpOutput result = apiInstance.gatewayCreateProducerRdp(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerRdp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerRdp**](GatewayCreateProducerRdp.md)|  |

### Return type

[**GatewayCreateProducerRdpOutput**](GatewayCreateProducerRdpOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerRdpResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerSnowflake"></a>
# **gatewayCreateProducerSnowflake**
> GatewayCreateProducerSnowflakeOutput gatewayCreateProducerSnowflake(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayCreateProducerSnowflake body = new GatewayCreateProducerSnowflake(); // GatewayCreateProducerSnowflake | 
    try {
      GatewayCreateProducerSnowflakeOutput result = apiInstance.gatewayCreateProducerSnowflake(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerSnowflake");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayCreateProducerSnowflake**](GatewayCreateProducerSnowflake.md)|  |

### Return type

[**GatewayCreateProducerSnowflakeOutput**](GatewayCreateProducerSnowflakeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerSnowflakeResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayDeleteProducer"></a>
# **gatewayDeleteProducer**
> GatewayDeleteProducerOutput gatewayDeleteProducer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayDeleteProducer body = new GatewayDeleteProducer(); // GatewayDeleteProducer | 
    try {
      GatewayDeleteProducerOutput result = apiInstance.gatewayDeleteProducer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayDeleteProducer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayDeleteProducer**](GatewayDeleteProducer.md)|  |

### Return type

[**GatewayDeleteProducerOutput**](GatewayDeleteProducerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayDeleteProducerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayDeleteSubAdmins"></a>
# **gatewayDeleteSubAdmins**
> Object gatewayDeleteSubAdmins(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayDeleteSubAdmins body = new GatewayDeleteSubAdmins(); // GatewayDeleteSubAdmins | 
    try {
      Object result = apiInstance.gatewayDeleteSubAdmins(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayDeleteSubAdmins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayDeleteSubAdmins**](GatewayDeleteSubAdmins.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayDeleteSubAdminsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayGetConfig"></a>
# **gatewayGetConfig**
> AkeylessGatewayConfig gatewayGetConfig(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayGetConfig body = new GatewayGetConfig(); // GatewayGetConfig | 
    try {
      AkeylessGatewayConfig result = apiInstance.gatewayGetConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayGetConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayGetConfig**](GatewayGetConfig.md)|  |

### Return type

[**AkeylessGatewayConfig**](AkeylessGatewayConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayGetConfigResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayGetProducer"></a>
# **gatewayGetProducer**
> DSProducerDetails gatewayGetProducer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayGetProducer body = new GatewayGetProducer(); // GatewayGetProducer | 
    try {
      DSProducerDetails result = apiInstance.gatewayGetProducer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayGetProducer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayGetProducer**](GatewayGetProducer.md)|  |

### Return type

[**DSProducerDetails**](DSProducerDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayGetProducerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayGetTmpUsers"></a>
# **gatewayGetTmpUsers**
> List&lt;TmpUserData&gt; gatewayGetTmpUsers(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayGetTmpUsers body = new GatewayGetTmpUsers(); // GatewayGetTmpUsers | 
    try {
      List<TmpUserData> result = apiInstance.gatewayGetTmpUsers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayGetTmpUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayGetTmpUsers**](GatewayGetTmpUsers.md)|  |

### Return type

[**List&lt;TmpUserData&gt;**](TmpUserData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayGetTmpUsersResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayListProducers"></a>
# **gatewayListProducers**
> GetProducersListReplyObj gatewayListProducers(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayListProducers body = new GatewayListProducers(); // GatewayListProducers | 
    try {
      GetProducersListReplyObj result = apiInstance.gatewayListProducers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayListProducers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayListProducers**](GatewayListProducers.md)|  |

### Return type

[**GetProducersListReplyObj**](GetProducersListReplyObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayListProducersResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayListSubAdmins"></a>
# **gatewayListSubAdmins**
> GetSubAdminsListReplyObj gatewayListSubAdmins(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayListSubAdmins body = new GatewayListSubAdmins(); // GatewayListSubAdmins | 
    try {
      GetSubAdminsListReplyObj result = apiInstance.gatewayListSubAdmins(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayListSubAdmins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayListSubAdmins**](GatewayListSubAdmins.md)|  |

### Return type

[**GetSubAdminsListReplyObj**](GetSubAdminsListReplyObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayListSubAdminsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayRevokeTmpUsers"></a>
# **gatewayRevokeTmpUsers**
> gatewayRevokeTmpUsers(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayRevokeTmpUsers body = new GatewayRevokeTmpUsers(); // GatewayRevokeTmpUsers | 
    try {
      apiInstance.gatewayRevokeTmpUsers(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayRevokeTmpUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayRevokeTmpUsers**](GatewayRevokeTmpUsers.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayRevokeTmpUsersResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayStartProducer"></a>
# **gatewayStartProducer**
> GatewayStartProducerOutput gatewayStartProducer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayStartProducer body = new GatewayStartProducer(); // GatewayStartProducer | 
    try {
      GatewayStartProducerOutput result = apiInstance.gatewayStartProducer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayStartProducer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayStartProducer**](GatewayStartProducer.md)|  |

### Return type

[**GatewayStartProducerOutput**](GatewayStartProducerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayStartProducerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayStopProducer"></a>
# **gatewayStopProducer**
> GatewayStopProducerOutput gatewayStopProducer(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayStopProducer body = new GatewayStopProducer(); // GatewayStopProducer | 
    try {
      GatewayStopProducerOutput result = apiInstance.gatewayStopProducer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayStopProducer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayStopProducer**](GatewayStopProducer.md)|  |

### Return type

[**GatewayStopProducerOutput**](GatewayStopProducerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayStopProducerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayUpdateTmpUsers"></a>
# **gatewayUpdateTmpUsers**
> gatewayUpdateTmpUsers(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GatewayUpdateTmpUsers body = new GatewayUpdateTmpUsers(); // GatewayUpdateTmpUsers | 
    try {
      apiInstance.gatewayUpdateTmpUsers(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayUpdateTmpUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayUpdateTmpUsers**](GatewayUpdateTmpUsers.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayUpdateTmpUsersResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getAccountLogo"></a>
# **getAccountLogo**
> Map&lt;String, String&gt; getAccountLogo()



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    try {
      Map<String, String> result = apiInstance.getAccountLogo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getAccountLogo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getAccountLogoResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getAuthMethod"></a>
# **getAuthMethod**
> AuthMethod getAuthMethod(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetAuthMethod body = new GetAuthMethod(); // GetAuthMethod | 
    try {
      AuthMethod result = apiInstance.getAuthMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getAuthMethod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetAuthMethod**](GetAuthMethod.md)|  |

### Return type

[**AuthMethod**](AuthMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getAuthMethodResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getDynamicSecretValue"></a>
# **getDynamicSecretValue**
> Map&lt;String, String&gt; getDynamicSecretValue(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetDynamicSecretValue body = new GetDynamicSecretValue(); // GetDynamicSecretValue | 
    try {
      Map<String, String> result = apiInstance.getDynamicSecretValue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getDynamicSecretValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetDynamicSecretValue**](GetDynamicSecretValue.md)|  |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getDynamicSecretValueResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getKubeExecCreds"></a>
# **getKubeExecCreds**
> GetKubeExecCredsOutput getKubeExecCreds(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetKubeExecCreds body = new GetKubeExecCreds(); // GetKubeExecCreds | 
    try {
      GetKubeExecCredsOutput result = apiInstance.getKubeExecCreds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getKubeExecCreds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetKubeExecCreds**](GetKubeExecCreds.md)|  |

### Return type

[**GetKubeExecCredsOutput**](GetKubeExecCredsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getKubeExecCredsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getPKICertificate"></a>
# **getPKICertificate**
> GetPKICertificateOutput getPKICertificate(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetPKICertificate body = new GetPKICertificate(); // GetPKICertificate | 
    try {
      GetPKICertificateOutput result = apiInstance.getPKICertificate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getPKICertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetPKICertificate**](GetPKICertificate.md)|  |

### Return type

[**GetPKICertificateOutput**](GetPKICertificateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getPKICertificateResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getRSAPublic"></a>
# **getRSAPublic**
> GetRSAPublicOutput getRSAPublic(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetRSAPublic body = new GetRSAPublic(); // GetRSAPublic | 
    try {
      GetRSAPublicOutput result = apiInstance.getRSAPublic(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getRSAPublic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetRSAPublic**](GetRSAPublic.md)|  |

### Return type

[**GetRSAPublicOutput**](GetRSAPublicOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getRSAPublicResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getRole"></a>
# **getRole**
> Role getRole(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetRole body = new GetRole(); // GetRole | 
    try {
      Role result = apiInstance.getRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetRole**](GetRole.md)|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getRoleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getRotatedSecretValue"></a>
# **getRotatedSecretValue**
> Map&lt;String, String&gt; getRotatedSecretValue(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetRotatedSecretValue body = new GetRotatedSecretValue(); // GetRotatedSecretValue | 
    try {
      Map<String, String> result = apiInstance.getRotatedSecretValue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getRotatedSecretValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetRotatedSecretValue**](GetRotatedSecretValue.md)|  |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getRotatedSecretValueResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getSSHCertificate"></a>
# **getSSHCertificate**
> GetSSHCertificateOutput getSSHCertificate(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetSSHCertificate body = new GetSSHCertificate(); // GetSSHCertificate | 
    try {
      GetSSHCertificateOutput result = apiInstance.getSSHCertificate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSSHCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetSSHCertificate**](GetSSHCertificate.md)|  |

### Return type

[**GetSSHCertificateOutput**](GetSSHCertificateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getSSHCertificateResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getSecretValue"></a>
# **getSecretValue**
> Map&lt;String, String&gt; getSecretValue(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetSecretValue body = new GetSecretValue(); // GetSecretValue | 
    try {
      Map<String, String> result = apiInstance.getSecretValue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSecretValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetSecretValue**](GetSecretValue.md)|  |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getSecretValueResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getTarget"></a>
# **getTarget**
> Target getTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetTarget body = new GetTarget(); // GetTarget | 
    try {
      Target result = apiInstance.getTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetTarget**](GetTarget.md)|  |

### Return type

[**Target**](Target.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="getTargetDetails"></a>
# **getTargetDetails**
> GetTargetDetailsOutput getTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    GetTargetDetails body = new GetTargetDetails(); // GetTargetDetails | 
    try {
      GetTargetDetailsOutput result = apiInstance.getTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetTargetDetails**](GetTargetDetails.md)|  |

### Return type

[**GetTargetDetailsOutput**](GetTargetDetailsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | getTargetDetailsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="listAuthMethods"></a>
# **listAuthMethods**
> ListAuthMethodsOutput listAuthMethods(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    ListAuthMethods body = new ListAuthMethods(); // ListAuthMethods | 
    try {
      ListAuthMethodsOutput result = apiInstance.listAuthMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#listAuthMethods");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListAuthMethods**](ListAuthMethods.md)|  |

### Return type

[**ListAuthMethodsOutput**](ListAuthMethodsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | listAuthMethodsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="listItems"></a>
# **listItems**
> ListItemsInPathOutput listItems(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    ListItems body = new ListItems(); // ListItems | 
    try {
      ListItemsInPathOutput result = apiInstance.listItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#listItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListItems**](ListItems.md)|  |

### Return type

[**ListItemsInPathOutput**](ListItemsInPathOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | listItemsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="listRoles"></a>
# **listRoles**
> ListRolesOutput listRoles(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    ListRoles body = new ListRoles(); // ListRoles | 
    try {
      ListRolesOutput result = apiInstance.listRoles(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#listRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListRoles**](ListRoles.md)|  |

### Return type

[**ListRolesOutput**](ListRolesOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | listRolesResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="listTargets"></a>
# **listTargets**
> ListTargetsOutput listTargets(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    ListTargets body = new ListTargets(); // ListTargets | 
    try {
      ListTargetsOutput result = apiInstance.listTargets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#listTargets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListTargets**](ListTargets.md)|  |

### Return type

[**ListTargetsOutput**](ListTargetsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | listTargetsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="moveObjects"></a>
# **moveObjects**
> Object moveObjects(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    MoveObjects body = new MoveObjects(); // MoveObjects | 
    try {
      Object result = apiInstance.moveObjects(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#moveObjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MoveObjects**](MoveObjects.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | moveObjectsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="rawCreds"></a>
# **rawCreds**
> SystemAccessCredentialsReplyObj rawCreds(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    RawCreds body = new RawCreds(); // RawCreds | 
    try {
      SystemAccessCredentialsReplyObj result = apiInstance.rawCreds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#rawCreds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawCreds**](RawCreds.md)|  | [optional]

### Return type

[**SystemAccessCredentialsReplyObj**](SystemAccessCredentialsReplyObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | rawCredsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="refreshKey"></a>
# **refreshKey**
> RefreshKeyOutput refreshKey(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    RefreshKey body = new RefreshKey(); // RefreshKey | 
    try {
      RefreshKeyOutput result = apiInstance.refreshKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#refreshKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefreshKey**](RefreshKey.md)|  |

### Return type

[**RefreshKeyOutput**](RefreshKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | refreshKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="reverseRBAC"></a>
# **reverseRBAC**
> ReverseRBACOutput reverseRBAC(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    ReverseRBAC body = new ReverseRBAC(); // ReverseRBAC | 
    try {
      ReverseRBACOutput result = apiInstance.reverseRBAC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#reverseRBAC");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReverseRBAC**](ReverseRBAC.md)|  |

### Return type

[**ReverseRBACOutput**](ReverseRBACOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | reverseRBACResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="rollbackSecret"></a>
# **rollbackSecret**
> RollbackSecretOutput rollbackSecret(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    RollbackSecret body = new RollbackSecret(); // RollbackSecret | 
    try {
      RollbackSecretOutput result = apiInstance.rollbackSecret(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#rollbackSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RollbackSecret**](RollbackSecret.md)|  |

### Return type

[**RollbackSecretOutput**](RollbackSecretOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | rollbackSecretResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="rotateKey"></a>
# **rotateKey**
> RotateKeyOutput rotateKey(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateRotationSettings body = new UpdateRotationSettings(); // UpdateRotationSettings | 
    try {
      RotateKeyOutput result = apiInstance.rotateKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#rotateKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRotationSettings**](UpdateRotationSettings.md)|  |

### Return type

[**RotateKeyOutput**](RotateKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | rotateKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="setItemState"></a>
# **setItemState**
> Object setItemState(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    SetItemState body = new SetItemState(); // SetItemState | 
    try {
      Object result = apiInstance.setItemState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#setItemState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetItemState**](SetItemState.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | setItemStateResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="setRoleRule"></a>
# **setRoleRule**
> Object setRoleRule(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    SetRoleRule body = new SetRoleRule(); // SetRoleRule | 
    try {
      Object result = apiInstance.setRoleRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#setRoleRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetRoleRule**](SetRoleRule.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | setRoleRuleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="signPKCS1"></a>
# **signPKCS1**
> SignPKCS1Output signPKCS1(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    SignPKCS1 body = new SignPKCS1(); // SignPKCS1 | 
    try {
      SignPKCS1Output result = apiInstance.signPKCS1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#signPKCS1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignPKCS1**](SignPKCS1.md)|  |

### Return type

[**SignPKCS1Output**](SignPKCS1Output.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | signPKCS1Response wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="staticCredsAuth"></a>
# **staticCredsAuth**
> StaticCredsAuthOutput staticCredsAuth(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    StaticCredsAuth body = new StaticCredsAuth(); // StaticCredsAuth | 
    try {
      StaticCredsAuthOutput result = apiInstance.staticCredsAuth(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#staticCredsAuth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StaticCredsAuth**](StaticCredsAuth.md)|  |

### Return type

[**StaticCredsAuthOutput**](StaticCredsAuthOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | staticCredsAuthResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uidCreateChildToken"></a>
# **uidCreateChildToken**
> UidCreateChildTokenOutput uidCreateChildToken(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UidCreateChildToken body = new UidCreateChildToken(); // UidCreateChildToken | 
    try {
      UidCreateChildTokenOutput result = apiInstance.uidCreateChildToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uidCreateChildToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UidCreateChildToken**](UidCreateChildToken.md)|  |

### Return type

[**UidCreateChildTokenOutput**](UidCreateChildTokenOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uidCreateChildTokenResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uidGenerateToken"></a>
# **uidGenerateToken**
> UidGenerateTokenOutput uidGenerateToken(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UidGenerateToken body = new UidGenerateToken(); // UidGenerateToken | 
    try {
      UidGenerateTokenOutput result = apiInstance.uidGenerateToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uidGenerateToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UidGenerateToken**](UidGenerateToken.md)|  |

### Return type

[**UidGenerateTokenOutput**](UidGenerateTokenOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uidGenerateTokenResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uidListChildren"></a>
# **uidListChildren**
> UniversalIdentityDetails uidListChildren(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UidListChildren body = new UidListChildren(); // UidListChildren | 
    try {
      UniversalIdentityDetails result = apiInstance.uidListChildren(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uidListChildren");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UidListChildren**](UidListChildren.md)|  |

### Return type

[**UniversalIdentityDetails**](UniversalIdentityDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uidListChildrenResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uidRevokeToken"></a>
# **uidRevokeToken**
> Object uidRevokeToken(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UidRevokeToken body = new UidRevokeToken(); // UidRevokeToken | 
    try {
      Object result = apiInstance.uidRevokeToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uidRevokeToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UidRevokeToken**](UidRevokeToken.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uidRevokeTokenResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uidRotateToken"></a>
# **uidRotateToken**
> UidRotateTokenOutput uidRotateToken(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UidRotateToken body = new UidRotateToken(); // UidRotateToken | 
    try {
      UidRotateTokenOutput result = apiInstance.uidRotateToken(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uidRotateToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UidRotateToken**](UidRotateToken.md)|  |

### Return type

[**UidRotateTokenOutput**](UidRotateTokenOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uidRotateTokenResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateAWSTargetDetails"></a>
# **updateAWSTargetDetails**
> UpdateTargetOutput updateAWSTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateAWSTargetDetails body = new UpdateAWSTargetDetails(); // UpdateAWSTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateAWSTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateAWSTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAWSTargetDetails**](UpdateAWSTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateAssoc"></a>
# **updateAssoc**
> Object updateAssoc(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateAssoc body = new UpdateAssoc(); // UpdateAssoc | 
    try {
      Object result = apiInstance.updateAssoc(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateAssoc");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAssoc**](UpdateAssoc.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateAssocResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateDBTargetDetails"></a>
# **updateDBTargetDetails**
> UpdateTargetOutput updateDBTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateDBTargetDetails body = new UpdateDBTargetDetails(); // UpdateDBTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateDBTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateDBTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateDBTargetDetails**](UpdateDBTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateItem"></a>
# **updateItem**
> UpdateItemOutput updateItem(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateItem body = new UpdateItem(); // UpdateItem | 
    try {
      UpdateItemOutput result = apiInstance.updateItem(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateItem**](UpdateItem.md)|  |

### Return type

[**UpdateItemOutput**](UpdateItemOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateItemResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateRDPTargetDetails"></a>
# **updateRDPTargetDetails**
> UpdateTargetOutput updateRDPTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateRDPTargetDetails body = new UpdateRDPTargetDetails(); // UpdateRDPTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateRDPTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRDPTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRDPTargetDetails**](UpdateRDPTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateRabbitMQTargetDetails"></a>
# **updateRabbitMQTargetDetails**
> UpdateTargetOutput updateRabbitMQTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateRabbitMQTargetDetails body = new UpdateRabbitMQTargetDetails(); // UpdateRabbitMQTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateRabbitMQTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRabbitMQTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRabbitMQTargetDetails**](UpdateRabbitMQTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateRole"></a>
# **updateRole**
> UpdateRoleOutput updateRole(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateRole body = new UpdateRole(); // UpdateRole | 
    try {
      UpdateRoleOutput result = apiInstance.updateRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRole**](UpdateRole.md)|  |

### Return type

[**UpdateRoleOutput**](UpdateRoleOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateRoleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateRotatedSecret"></a>
# **updateRotatedSecret**
> UpdateRotatedSecretOutput updateRotatedSecret(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateRotatedSecret body = new UpdateRotatedSecret(); // UpdateRotatedSecret | 
    try {
      UpdateRotatedSecretOutput result = apiInstance.updateRotatedSecret(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRotatedSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRotatedSecret**](UpdateRotatedSecret.md)|  |

### Return type

[**UpdateRotatedSecretOutput**](UpdateRotatedSecretOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateRotatedSecretResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateRotationSettings"></a>
# **updateRotationSettings**
> RotateKeyOutput updateRotationSettings()



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    try {
      RotateKeyOutput result = apiInstance.updateRotationSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRotationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RotateKeyOutput**](RotateKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | rotateKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateSSHTargetDetails"></a>
# **updateSSHTargetDetails**
> UpdateTargetOutput updateSSHTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateSSHTargetDetails body = new UpdateSSHTargetDetails(); // UpdateSSHTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateSSHTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateSSHTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateSSHTargetDetails**](UpdateSSHTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateSecretVal"></a>
# **updateSecretVal**
> UpdateSecretValOutput updateSecretVal(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateSecretVal body = new UpdateSecretVal(); // UpdateSecretVal | 
    try {
      UpdateSecretValOutput result = apiInstance.updateSecretVal(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateSecretVal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateSecretVal**](UpdateSecretVal.md)|  |

### Return type

[**UpdateSecretValOutput**](UpdateSecretValOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateSecretValResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateTarget"></a>
# **updateTarget**
> UpdateTargetOutput updateTarget(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateTarget body = new UpdateTarget(); // UpdateTarget | 
    try {
      UpdateTargetOutput result = apiInstance.updateTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateTarget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateTarget**](UpdateTarget.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateTargetDetails"></a>
# **updateTargetDetails**
> UpdateTargetOutput updateTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    Object body = null; // Object | 
    try {
      UpdateTargetOutput result = apiInstance.updateTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateWebTargetDetails"></a>
# **updateWebTargetDetails**
> UpdateTargetOutput updateWebTargetDetails(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UpdateWebTargetDetails body = new UpdateWebTargetDetails(); // UpdateWebTargetDetails | 
    try {
      UpdateTargetOutput result = apiInstance.updateWebTargetDetails(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateWebTargetDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateWebTargetDetails**](UpdateWebTargetDetails.md)|  |

### Return type

[**UpdateTargetOutput**](UpdateTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="uploadRSA"></a>
# **uploadRSA**
> Object uploadRSA(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    UploadRSA body = new UploadRSA(); // UploadRSA | 
    try {
      Object result = apiInstance.uploadRSA(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#uploadRSA");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UploadRSA**](UploadRSA.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | uploadRSAResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="verifyPKCS1"></a>
# **verifyPKCS1**
> Object verifyPKCS1(body)



### Example
```java
// Import classes:
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.akeyless.io");

    V2Api apiInstance = new V2Api(defaultClient);
    VerifyPKCS1 body = new VerifyPKCS1(); // VerifyPKCS1 | 
    try {
      Object result = apiInstance.verifyPKCS1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#verifyPKCS1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyPKCS1**](VerifyPKCS1.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | verifyPKCS1Response wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

