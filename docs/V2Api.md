# V2Api

All URIs are relative to *https://api.akeyless.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assocRoleAuthMethod**](V2Api.md#assocRoleAuthMethod) | **POST** /assoc-role-am | 
[**assocTargetItem**](V2Api.md#assocTargetItem) | **POST** /assoc-target-item | 
[**auth**](V2Api.md#auth) | **POST** /auth | 
[**configure**](V2Api.md#configure) | **POST** /configure | 
[**connect**](V2Api.md#connect) | **POST** /connect | 
[**createAWSTarget**](V2Api.md#createAWSTarget) | **POST** /create-aws-target | 
[**createArtifactoryTarget**](V2Api.md#createArtifactoryTarget) | **POST** /create-artifactory-target | 
[**createAuthMethod**](V2Api.md#createAuthMethod) | **POST** /create-auth-method | 
[**createAuthMethodAWSIAM**](V2Api.md#createAuthMethodAWSIAM) | **POST** /create-auth-method-aws-iam | 
[**createAuthMethodAzureAD**](V2Api.md#createAuthMethodAzureAD) | **POST** /create-auth-method-azure-ad | 
[**createAuthMethodGCP**](V2Api.md#createAuthMethodGCP) | **POST** /create-auth-method-gcp | 
[**createAuthMethodHuawei**](V2Api.md#createAuthMethodHuawei) | **POST** /create-auth-method-huawei | 
[**createAuthMethodOAuth2**](V2Api.md#createAuthMethodOAuth2) | **POST** /create-auth-method-oauth2 | 
[**createAuthMethodOIDC**](V2Api.md#createAuthMethodOIDC) | **POST** /create-auth-method-oidc | 
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
[**createNativeK8STarget**](V2Api.md#createNativeK8STarget) | **POST** /create-k8s-target | 
[**createPKICertIssuer**](V2Api.md#createPKICertIssuer) | **POST** /create-pki-cert-issuer | 
[**createRabbitMQTarget**](V2Api.md#createRabbitMQTarget) | **POST** /create-rabbitmq-target | 
[**createRole**](V2Api.md#createRole) | **POST** /create-role | 
[**createRotatedSecret**](V2Api.md#createRotatedSecret) | **POST** /create-rotated-secret | 
[**createSSHCertIssuer**](V2Api.md#createSSHCertIssuer) | **POST** /create-ssh-cert-issuer | 
[**createSSHTarget**](V2Api.md#createSSHTarget) | **POST** /create-ssh-target | 
[**createSecret**](V2Api.md#createSecret) | **POST** /create-secret | 
[**createWebTarget**](V2Api.md#createWebTarget) | **POST** /create-web-target | 
[**createldapTarget**](V2Api.md#createldapTarget) | **POST** /create-ldap-target | 
[**decrypt**](V2Api.md#decrypt) | **POST** /decrypt | 
[**decryptPKCS1**](V2Api.md#decryptPKCS1) | **POST** /decrypt-pkcs1 | 
[**decryptWithClassicKey**](V2Api.md#decryptWithClassicKey) | **POST** /decrypt-with-classic-key | 
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
[**encryptWithClassicKey**](V2Api.md#encryptWithClassicKey) | **POST** /encrypt-with-classic-key | 
[**gatewayCreateK8SAuthConfig**](V2Api.md#gatewayCreateK8SAuthConfig) | **POST** /gateway-create-k8s-auth-config | 
[**gatewayCreateProducerArtifactory**](V2Api.md#gatewayCreateProducerArtifactory) | **POST** /gateway-create-producer-artifactory | 
[**gatewayCreateProducerAws**](V2Api.md#gatewayCreateProducerAws) | **POST** /gateway-create-producer-aws | 
[**gatewayCreateProducerAzure**](V2Api.md#gatewayCreateProducerAzure) | **POST** /gateway-create-producer-azure | 
[**gatewayCreateProducerCassandra**](V2Api.md#gatewayCreateProducerCassandra) | **POST** /gateway-create-producer-cassandra | 
[**gatewayCreateProducerCertificateAutomation**](V2Api.md#gatewayCreateProducerCertificateAutomation) | **POST** /gateway-create-producer-certificate-automation | 
[**gatewayCreateProducerCustom**](V2Api.md#gatewayCreateProducerCustom) | **POST** /gateway-create-producer-custom | 
[**gatewayCreateProducerEks**](V2Api.md#gatewayCreateProducerEks) | **POST** /gateway-create-producer-eks | 
[**gatewayCreateProducerGcp**](V2Api.md#gatewayCreateProducerGcp) | **POST** /gateway-create-producer-gcp | 
[**gatewayCreateProducerGke**](V2Api.md#gatewayCreateProducerGke) | **POST** /gateway-create-producer-gke | 
[**gatewayCreateProducerLdap**](V2Api.md#gatewayCreateProducerLdap) | **POST** /gateway-create-producer-ldap | 
[**gatewayCreateProducerMSSQL**](V2Api.md#gatewayCreateProducerMSSQL) | **POST** /gateway-create-producer-mssql | 
[**gatewayCreateProducerMongo**](V2Api.md#gatewayCreateProducerMongo) | **POST** /gateway-create-producer-mongo | 
[**gatewayCreateProducerMySQL**](V2Api.md#gatewayCreateProducerMySQL) | **POST** /gateway-create-producer-mysql | 
[**gatewayCreateProducerNativeK8S**](V2Api.md#gatewayCreateProducerNativeK8S) | **POST** /gateway-create-producer-k8s-native | 
[**gatewayCreateProducerOracleDb**](V2Api.md#gatewayCreateProducerOracleDb) | **POST** /gateway-create-producer-oracle | 
[**gatewayCreateProducerPostgreSQL**](V2Api.md#gatewayCreateProducerPostgreSQL) | **POST** /gateway-create-producer-postgresql | 
[**gatewayCreateProducerRabbitMQ**](V2Api.md#gatewayCreateProducerRabbitMQ) | **POST** /gateway-create-producer-rabbitmq | 
[**gatewayCreateProducerRdp**](V2Api.md#gatewayCreateProducerRdp) | **POST** /gateway-create-producer-rdp | 
[**gatewayCreateProducerRedshift**](V2Api.md#gatewayCreateProducerRedshift) | **POST** /gateway-create-producer-redshift | 
[**gatewayCreateProducerSnowflake**](V2Api.md#gatewayCreateProducerSnowflake) | **POST** /gateway-create-producer-snowflake | 
[**gatewayDeleteAllowedManagementAccess**](V2Api.md#gatewayDeleteAllowedManagementAccess) | **POST** /gateway-delete-allowed-management-access | 
[**gatewayDeleteK8SAuthConfig**](V2Api.md#gatewayDeleteK8SAuthConfig) | **POST** /gateway-delete-k8s-auth-config | 
[**gatewayDeleteProducer**](V2Api.md#gatewayDeleteProducer) | **POST** /gateway-delete-producer | 
[**gatewayGetConfig**](V2Api.md#gatewayGetConfig) | **POST** /gateway-get-config | 
[**gatewayGetK8SAuthConfig**](V2Api.md#gatewayGetK8SAuthConfig) | **POST** /gateway-get-k8s-auth-config | 
[**gatewayGetProducer**](V2Api.md#gatewayGetProducer) | **POST** /gateway-get-producer | 
[**gatewayGetTmpUsers**](V2Api.md#gatewayGetTmpUsers) | **POST** /gateway-get-producer-tmp-creds | 
[**gatewayListAllowedManagementAccess**](V2Api.md#gatewayListAllowedManagementAccess) | **POST** /gateway-list-allowed-management-access | 
[**gatewayListMigration**](V2Api.md#gatewayListMigration) | **POST** /gateway-list-migration | 
[**gatewayListProducers**](V2Api.md#gatewayListProducers) | **POST** /gateway-list-producers | 
[**gatewayRevokeTmpUsers**](V2Api.md#gatewayRevokeTmpUsers) | **POST** /gateway-revoke-producer-tmp-creds | 
[**gatewayStartProducer**](V2Api.md#gatewayStartProducer) | **POST** /gateway-start-producer | 
[**gatewayStopProducer**](V2Api.md#gatewayStopProducer) | **POST** /gateway-stop-producer | 
[**gatewaySyncMigration**](V2Api.md#gatewaySyncMigration) | **POST** /gateway-sync-migration | 
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
[**kmipClientDeleteRule**](V2Api.md#kmipClientDeleteRule) | **POST** /kmip-client-delete-rule | 
[**kmipClientSetRule**](V2Api.md#kmipClientSetRule) | **POST** /kmip-client-set-rule | 
[**kmipCreateClient**](V2Api.md#kmipCreateClient) | **POST** /kmip-create-client | 
[**kmipDeleteClient**](V2Api.md#kmipDeleteClient) | **POST** /kmip-delete-client | 
[**kmipDescribeClient**](V2Api.md#kmipDescribeClient) | **POST** /kmip-get-client | 
[**kmipDescribeServer**](V2Api.md#kmipDescribeServer) | **POST** /kmip-get-environment | 
[**kmipListClients**](V2Api.md#kmipListClients) | **POST** /kmip-list-clients | 
[**kmipRenewClientCertificate**](V2Api.md#kmipRenewClientCertificate) | **POST** /kmip-renew-client | 
[**kmipRenewServerCertificate**](V2Api.md#kmipRenewServerCertificate) | **POST** /kmip-renew-environment | 
[**kmipServerSetup**](V2Api.md#kmipServerSetup) | **POST** /kmip-create-environment | 
[**kmipSetServerState**](V2Api.md#kmipSetServerState) | **POST** /kmip-set-environment-state | 
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
[**signJWTWithClassicKey**](V2Api.md#signJWTWithClassicKey) | **POST** /sign-jwt-with-classic-key | 
[**signPKCS1**](V2Api.md#signPKCS1) | **POST** /sign-pkcs1 | 
[**signPKICertWithClassicKey**](V2Api.md#signPKICertWithClassicKey) | **POST** /sign-pki-cert-with-classic-key | 
[**staticCredsAuth**](V2Api.md#staticCredsAuth) | **POST** /static-creds-auth | 
[**uidCreateChildToken**](V2Api.md#uidCreateChildToken) | **POST** /uid-create-child-token | 
[**uidGenerateToken**](V2Api.md#uidGenerateToken) | **POST** /uid-generate-token | 
[**uidListChildren**](V2Api.md#uidListChildren) | **POST** /uid-list-children | 
[**uidRevokeToken**](V2Api.md#uidRevokeToken) | **POST** /uid-revoke-token | 
[**uidRotateToken**](V2Api.md#uidRotateToken) | **POST** /uid-rotate-token | 
[**updateAWSTarget**](V2Api.md#updateAWSTarget) | **PUT** /update-aws-target | 
[**updateAWSTargetDetails**](V2Api.md#updateAWSTargetDetails) | **POST** /update-aws-target-details | 
[**updateAssoc**](V2Api.md#updateAssoc) | **POST** /update-assoc | 
[**updateAzureTarget**](V2Api.md#updateAzureTarget) | **PUT** /update-azure-target | 
[**updateDBTarget**](V2Api.md#updateDBTarget) | **POST** /update-db-target | 
[**updateDBTargetDetails**](V2Api.md#updateDBTargetDetails) | **POST** /update-db-target-details | 
[**updateEKSTarget**](V2Api.md#updateEKSTarget) | **PUT** /update-eks-target | 
[**updateGKETarget**](V2Api.md#updateGKETarget) | **PUT** /update-gke-target | 
[**updateGcpTarget**](V2Api.md#updateGcpTarget) | **PUT** /update-gcp-target | 
[**updateItem**](V2Api.md#updateItem) | **POST** /update-item | 
[**updateNativeK8STarget**](V2Api.md#updateNativeK8STarget) | **PUT** /update-k8s-target | 
[**updateRDPTargetDetails**](V2Api.md#updateRDPTargetDetails) | **POST** /update-rdp-target-details | 
[**updateRabbitMQTarget**](V2Api.md#updateRabbitMQTarget) | **PUT** /update-rabbitmq-target | 
[**updateRabbitMQTargetDetails**](V2Api.md#updateRabbitMQTargetDetails) | **POST** /update-rabbitmq-target-details | 
[**updateRole**](V2Api.md#updateRole) | **POST** /update-role | 
[**updateRotatedSecret**](V2Api.md#updateRotatedSecret) | **POST** /update-rotated-secret | 
[**updateRotationSettings**](V2Api.md#updateRotationSettings) | **POST** /update-rotation-settingsrotate-key | 
[**updateSSHTarget**](V2Api.md#updateSSHTarget) | **POST** /update-ssh-target | 
[**updateSSHTargetDetails**](V2Api.md#updateSSHTargetDetails) | **POST** /update-ssh-target-details | 
[**updateSecretVal**](V2Api.md#updateSecretVal) | **POST** /update-secret-val | 
[**updateTarget**](V2Api.md#updateTarget) | **POST** /update-target | 
[**updateTargetDetails**](V2Api.md#updateTargetDetails) | **POST** /update-target-details | 
[**updateWebTarget**](V2Api.md#updateWebTarget) | **POST** /update-web-target | 
[**updateWebTargetDetails**](V2Api.md#updateWebTargetDetails) | **POST** /update-web-target-details | 
[**uploadRSA**](V2Api.md#uploadRSA) | **POST** /upload-rsa | 
[**verifyJWTWithClassicKey**](V2Api.md#verifyJWTWithClassicKey) | **POST** /verify-jwt-with-classic-key | 
[**verifyPKCS1**](V2Api.md#verifyPKCS1) | **POST** /verify-pkcs1 | 
[**verifyPKICertWithClassicKey**](V2Api.md#verifyPKICertWithClassicKey) | **POST** /verify-pki-cert-with-classic-key | 


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

<a name="connect"></a>
# **connect**
> Object connect(body)



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
    Connect body = new Connect(); // Connect | 
    try {
      Object result = apiInstance.connect(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#connect");
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
 **body** | [**Connect**](Connect.md)|  |

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
**200** | connectResponse wraps response body. |  -  |
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

<a name="createAuthMethodOIDC"></a>
# **createAuthMethodOIDC**
> CreateAuthMethodOIDCOutput createAuthMethodOIDC(body)



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
    CreateAuthMethodOIDC body = new CreateAuthMethodOIDC(); // CreateAuthMethodOIDC | 
    try {
      CreateAuthMethodOIDCOutput result = apiInstance.createAuthMethodOIDC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createAuthMethodOIDC");
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
 **body** | [**CreateAuthMethodOIDC**](CreateAuthMethodOIDC.md)|  |

### Return type

[**CreateAuthMethodOIDCOutput**](CreateAuthMethodOIDCOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createAuthMethodOIDCResponse wraps response body. |  -  |
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

<a name="createNativeK8STarget"></a>
# **createNativeK8STarget**
> CreateNativeK8STarget createNativeK8STarget()



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
      CreateNativeK8STarget result = apiInstance.createNativeK8STarget();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createNativeK8STarget");
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

[**CreateNativeK8STarget**](CreateNativeK8STarget.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createNativeK8STarget |  -  |
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

<a name="createldapTarget"></a>
# **createldapTarget**
> CreateLdapTargetOutput createldapTarget(body)



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
    CreateLdapTarget body = new CreateLdapTarget(); // CreateLdapTarget | 
    try {
      CreateLdapTargetOutput result = apiInstance.createldapTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#createldapTarget");
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
 **body** | [**CreateLdapTarget**](CreateLdapTarget.md)|  |

### Return type

[**CreateLdapTargetOutput**](CreateLdapTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | createldapTargetResponse wraps response body. |  -  |
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

<a name="decryptWithClassicKey"></a>
# **decryptWithClassicKey**
> DecryptWithClassicKeyOutput decryptWithClassicKey(body)



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
    DecryptWithClassicKey body = new DecryptWithClassicKey(); // DecryptWithClassicKey | 
    try {
      DecryptWithClassicKeyOutput result = apiInstance.decryptWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#decryptWithClassicKey");
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
 **body** | [**DecryptWithClassicKey**](DecryptWithClassicKey.md)|  |

### Return type

[**DecryptWithClassicKeyOutput**](DecryptWithClassicKeyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | decryptWithClassicKeyResponse wraps response body. |  -  |
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

<a name="encryptWithClassicKey"></a>
# **encryptWithClassicKey**
> EncryptOutput encryptWithClassicKey(body)



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
    EncryptWithClassicKey body = new EncryptWithClassicKey(); // EncryptWithClassicKey | 
    try {
      EncryptOutput result = apiInstance.encryptWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#encryptWithClassicKey");
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
 **body** | [**EncryptWithClassicKey**](EncryptWithClassicKey.md)|  |

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

<a name="gatewayCreateK8SAuthConfig"></a>
# **gatewayCreateK8SAuthConfig**
> GatewayCreateK8SAuthConfigOutput gatewayCreateK8SAuthConfig(body)



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
    GatewayCreateK8SAuthConfig body = new GatewayCreateK8SAuthConfig(); // GatewayCreateK8SAuthConfig | 
    try {
      GatewayCreateK8SAuthConfigOutput result = apiInstance.gatewayCreateK8SAuthConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateK8SAuthConfig");
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
 **body** | [**GatewayCreateK8SAuthConfig**](GatewayCreateK8SAuthConfig.md)|  |

### Return type

[**GatewayCreateK8SAuthConfigOutput**](GatewayCreateK8SAuthConfigOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateK8SAuthConfigResponse wraps response body. |  -  |
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

<a name="gatewayCreateProducerCassandra"></a>
# **gatewayCreateProducerCassandra**
> GatewayCreateProducerCassandraOutput gatewayCreateProducerCassandra(body)



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
    GatewayCreateProducerCassandra body = new GatewayCreateProducerCassandra(); // GatewayCreateProducerCassandra | 
    try {
      GatewayCreateProducerCassandraOutput result = apiInstance.gatewayCreateProducerCassandra(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerCassandra");
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
 **body** | [**GatewayCreateProducerCassandra**](GatewayCreateProducerCassandra.md)|  |

### Return type

[**GatewayCreateProducerCassandraOutput**](GatewayCreateProducerCassandraOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerCassandraResponse wraps response body. |  -  |
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

<a name="gatewayCreateProducerLdap"></a>
# **gatewayCreateProducerLdap**
> GatewayCreateProducerLdapOutput gatewayCreateProducerLdap(body)



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
    GatewayCreateProducerLdap body = new GatewayCreateProducerLdap(); // GatewayCreateProducerLdap | 
    try {
      GatewayCreateProducerLdapOutput result = apiInstance.gatewayCreateProducerLdap(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerLdap");
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
 **body** | [**GatewayCreateProducerLdap**](GatewayCreateProducerLdap.md)|  |

### Return type

[**GatewayCreateProducerLdapOutput**](GatewayCreateProducerLdapOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerLdapResponse wraps response body. |  -  |
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

<a name="gatewayCreateProducerNativeK8S"></a>
# **gatewayCreateProducerNativeK8S**
> GatewayCreateProducerNativeK8SOutput gatewayCreateProducerNativeK8S(body)



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
    GatewayCreateProducerNativeK8S body = new GatewayCreateProducerNativeK8S(); // GatewayCreateProducerNativeK8S | 
    try {
      GatewayCreateProducerNativeK8SOutput result = apiInstance.gatewayCreateProducerNativeK8S(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerNativeK8S");
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
 **body** | [**GatewayCreateProducerNativeK8S**](GatewayCreateProducerNativeK8S.md)|  |

### Return type

[**GatewayCreateProducerNativeK8SOutput**](GatewayCreateProducerNativeK8SOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerNativeK8SResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="gatewayCreateProducerOracleDb"></a>
# **gatewayCreateProducerOracleDb**
> GatewayCreateProducerOracleDbOutput gatewayCreateProducerOracleDb(body)



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
    GatewayCreateProducerOracleDb body = new GatewayCreateProducerOracleDb(); // GatewayCreateProducerOracleDb | 
    try {
      GatewayCreateProducerOracleDbOutput result = apiInstance.gatewayCreateProducerOracleDb(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerOracleDb");
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
 **body** | [**GatewayCreateProducerOracleDb**](GatewayCreateProducerOracleDb.md)|  |

### Return type

[**GatewayCreateProducerOracleDbOutput**](GatewayCreateProducerOracleDbOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerOracleDbResponse wraps response body. |  -  |
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

<a name="gatewayCreateProducerRedshift"></a>
# **gatewayCreateProducerRedshift**
> GatewayCreateProducerRedshiftOutput gatewayCreateProducerRedshift(body)



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
    GatewayCreateProducerRedshift body = new GatewayCreateProducerRedshift(); // GatewayCreateProducerRedshift | 
    try {
      GatewayCreateProducerRedshiftOutput result = apiInstance.gatewayCreateProducerRedshift(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayCreateProducerRedshift");
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
 **body** | [**GatewayCreateProducerRedshift**](GatewayCreateProducerRedshift.md)|  |

### Return type

[**GatewayCreateProducerRedshiftOutput**](GatewayCreateProducerRedshiftOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayCreateProducerRedshiftResponse wraps response body. |  -  |
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

<a name="gatewayDeleteAllowedManagementAccess"></a>
# **gatewayDeleteAllowedManagementAccess**
> Object gatewayDeleteAllowedManagementAccess(body)



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
    GatewayDeleteAllowedManagementAccess body = new GatewayDeleteAllowedManagementAccess(); // GatewayDeleteAllowedManagementAccess | 
    try {
      Object result = apiInstance.gatewayDeleteAllowedManagementAccess(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayDeleteAllowedManagementAccess");
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
 **body** | [**GatewayDeleteAllowedManagementAccess**](GatewayDeleteAllowedManagementAccess.md)|  |

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

<a name="gatewayDeleteK8SAuthConfig"></a>
# **gatewayDeleteK8SAuthConfig**
> GatewayDeleteK8SAuthConfigOutput gatewayDeleteK8SAuthConfig(body)



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
    GatewayDeleteK8SAuthConfig body = new GatewayDeleteK8SAuthConfig(); // GatewayDeleteK8SAuthConfig | 
    try {
      GatewayDeleteK8SAuthConfigOutput result = apiInstance.gatewayDeleteK8SAuthConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayDeleteK8SAuthConfig");
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
 **body** | [**GatewayDeleteK8SAuthConfig**](GatewayDeleteK8SAuthConfig.md)|  |

### Return type

[**GatewayDeleteK8SAuthConfigOutput**](GatewayDeleteK8SAuthConfigOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayDeleteK8SAuthConfigResponse wraps response body. |  -  |
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

<a name="gatewayGetK8SAuthConfig"></a>
# **gatewayGetK8SAuthConfig**
> GatewayGetK8SAuthConfigOutput gatewayGetK8SAuthConfig(body)



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
    GatewayGetK8SAuthConfig body = new GatewayGetK8SAuthConfig(); // GatewayGetK8SAuthConfig | 
    try {
      GatewayGetK8SAuthConfigOutput result = apiInstance.gatewayGetK8SAuthConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayGetK8SAuthConfig");
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
 **body** | [**GatewayGetK8SAuthConfig**](GatewayGetK8SAuthConfig.md)|  |

### Return type

[**GatewayGetK8SAuthConfigOutput**](GatewayGetK8SAuthConfigOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | gatewayGetK8SAuthConfigResponse wraps response body. |  -  |
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

<a name="gatewayListAllowedManagementAccess"></a>
# **gatewayListAllowedManagementAccess**
> GetSubAdminsListReplyObj gatewayListAllowedManagementAccess(body)



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
    GatewayListAllowedManagementAccess body = new GatewayListAllowedManagementAccess(); // GatewayListAllowedManagementAccess | 
    try {
      GetSubAdminsListReplyObj result = apiInstance.gatewayListAllowedManagementAccess(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayListAllowedManagementAccess");
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
 **body** | [**GatewayListAllowedManagementAccess**](GatewayListAllowedManagementAccess.md)|  |

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

<a name="gatewayListMigration"></a>
# **gatewayListMigration**
> GatewayMigrationListOutput gatewayListMigration(body)



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
    GatewayListMigration body = new GatewayListMigration(); // GatewayListMigration | 
    try {
      GatewayMigrationListOutput result = apiInstance.gatewayListMigration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewayListMigration");
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
 **body** | [**GatewayListMigration**](GatewayListMigration.md)|  |

### Return type

[**GatewayMigrationListOutput**](GatewayMigrationListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayMigrationListResponse wraps response body. |  -  |
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

<a name="gatewaySyncMigration"></a>
# **gatewaySyncMigration**
> GatewayMigrationSyncOutput gatewaySyncMigration(body)



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
    GatewaySyncMigration body = new GatewaySyncMigration(); // GatewaySyncMigration | 
    try {
      GatewayMigrationSyncOutput result = apiInstance.gatewaySyncMigration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#gatewaySyncMigration");
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
 **body** | [**GatewaySyncMigration**](GatewaySyncMigration.md)|  |

### Return type

[**GatewayMigrationSyncOutput**](GatewayMigrationSyncOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | gatewayMigrationSyncResponse wraps response body. |  -  |
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
> Map&lt;String, Object&gt; getRotatedSecretValue(body)



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
      Map<String, Object> result = apiInstance.getRotatedSecretValue(body);
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

**Map&lt;String, Object&gt;**

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

<a name="kmipClientDeleteRule"></a>
# **kmipClientDeleteRule**
> KMIPClientUpdateResponse kmipClientDeleteRule(body)



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
    KmipClientDeleteRule body = new KmipClientDeleteRule(); // KmipClientDeleteRule | 
    try {
      KMIPClientUpdateResponse result = apiInstance.kmipClientDeleteRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipClientDeleteRule");
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
 **body** | [**KmipClientDeleteRule**](KmipClientDeleteRule.md)|  | [optional]

### Return type

[**KMIPClientUpdateResponse**](KMIPClientUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipClientDeleteRuleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipClientSetRule"></a>
# **kmipClientSetRule**
> KMIPClientUpdateResponse kmipClientSetRule(body)



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
    KmipClientSetRule body = new KmipClientSetRule(); // KmipClientSetRule | 
    try {
      KMIPClientUpdateResponse result = apiInstance.kmipClientSetRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipClientSetRule");
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
 **body** | [**KmipClientSetRule**](KmipClientSetRule.md)|  | [optional]

### Return type

[**KMIPClientUpdateResponse**](KMIPClientUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipClientSetRuleResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipCreateClient"></a>
# **kmipCreateClient**
> KmipCreateClientOutput kmipCreateClient(body)



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
    KmipCreateClient body = new KmipCreateClient(); // KmipCreateClient | 
    try {
      KmipCreateClientOutput result = apiInstance.kmipCreateClient(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipCreateClient");
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
 **body** | [**KmipCreateClient**](KmipCreateClient.md)|  | [optional]

### Return type

[**KmipCreateClientOutput**](KmipCreateClientOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipCreateClientResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipDeleteClient"></a>
# **kmipDeleteClient**
> Object kmipDeleteClient(body)



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
    KmipDeleteClient body = new KmipDeleteClient(); // KmipDeleteClient | 
    try {
      Object result = apiInstance.kmipDeleteClient(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipDeleteClient");
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
 **body** | [**KmipDeleteClient**](KmipDeleteClient.md)|  | [optional]

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
**200** | kmipDeleteClientResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipDescribeClient"></a>
# **kmipDescribeClient**
> KMIPClientGetResponse kmipDescribeClient(body)



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
    KmipDescribeClient body = new KmipDescribeClient(); // KmipDescribeClient | 
    try {
      KMIPClientGetResponse result = apiInstance.kmipDescribeClient(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipDescribeClient");
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
 **body** | [**KmipDescribeClient**](KmipDescribeClient.md)|  | [optional]

### Return type

[**KMIPClientGetResponse**](KMIPClientGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipDescribeClientResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipDescribeServer"></a>
# **kmipDescribeServer**
> KmipDescribeServerOutput kmipDescribeServer(body)



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
    KmipDescribeServer body = new KmipDescribeServer(); // KmipDescribeServer | 
    try {
      KmipDescribeServerOutput result = apiInstance.kmipDescribeServer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipDescribeServer");
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
 **body** | [**KmipDescribeServer**](KmipDescribeServer.md)|  | [optional]

### Return type

[**KmipDescribeServerOutput**](KmipDescribeServerOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipDescribeServerResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipListClients"></a>
# **kmipListClients**
> KMIPClientListResponse kmipListClients(body)



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
    KmipListClients body = new KmipListClients(); // KmipListClients | 
    try {
      KMIPClientListResponse result = apiInstance.kmipListClients(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipListClients");
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
 **body** | [**KmipListClients**](KmipListClients.md)|  | [optional]

### Return type

[**KMIPClientListResponse**](KMIPClientListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipListClientsResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipRenewClientCertificate"></a>
# **kmipRenewClientCertificate**
> KmipRenewClientCertificateOutput kmipRenewClientCertificate(body)



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
    KmipRenewClientCertificate body = new KmipRenewClientCertificate(); // KmipRenewClientCertificate | 
    try {
      KmipRenewClientCertificateOutput result = apiInstance.kmipRenewClientCertificate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipRenewClientCertificate");
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
 **body** | [**KmipRenewClientCertificate**](KmipRenewClientCertificate.md)|  | [optional]

### Return type

[**KmipRenewClientCertificateOutput**](KmipRenewClientCertificateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipRenewClientCertificateResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipRenewServerCertificate"></a>
# **kmipRenewServerCertificate**
> KmipRenewServerCertificateOutput kmipRenewServerCertificate(body)



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
    KmipRenewServerCertificate body = new KmipRenewServerCertificate(); // KmipRenewServerCertificate | 
    try {
      KmipRenewServerCertificateOutput result = apiInstance.kmipRenewServerCertificate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipRenewServerCertificate");
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
 **body** | [**KmipRenewServerCertificate**](KmipRenewServerCertificate.md)|  | [optional]

### Return type

[**KmipRenewServerCertificateOutput**](KmipRenewServerCertificateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipRenewServerCertificateResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipServerSetup"></a>
# **kmipServerSetup**
> KMIPEnvironmentCreateResponse kmipServerSetup(body)



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
    KmipServerSetup body = new KmipServerSetup(); // KmipServerSetup | 
    try {
      KMIPEnvironmentCreateResponse result = apiInstance.kmipServerSetup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipServerSetup");
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
 **body** | [**KmipServerSetup**](KmipServerSetup.md)|  | [optional]

### Return type

[**KMIPEnvironmentCreateResponse**](KMIPEnvironmentCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipServerSetupResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="kmipSetServerState"></a>
# **kmipSetServerState**
> KmipSetServerStateOutput kmipSetServerState(body)



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
    KmipSetServerState body = new KmipSetServerState(); // KmipSetServerState | 
    try {
      KmipSetServerStateOutput result = apiInstance.kmipSetServerState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#kmipSetServerState");
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
 **body** | [**KmipSetServerState**](KmipSetServerState.md)|  | [optional]

### Return type

[**KmipSetServerStateOutput**](KmipSetServerStateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | kmipSetServerStateResponse wraps response body. |  -  |
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

<a name="signJWTWithClassicKey"></a>
# **signJWTWithClassicKey**
> SignJWTOutput signJWTWithClassicKey(body)



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
    SignJWTWithClassicKey body = new SignJWTWithClassicKey(); // SignJWTWithClassicKey | 
    try {
      SignJWTOutput result = apiInstance.signJWTWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#signJWTWithClassicKey");
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
 **body** | [**SignJWTWithClassicKey**](SignJWTWithClassicKey.md)|  |

### Return type

[**SignJWTOutput**](SignJWTOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | signJWTWithClassicKeyResponse wraps response body. |  -  |
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

<a name="signPKICertWithClassicKey"></a>
# **signPKICertWithClassicKey**
> SignPKICertOutput signPKICertWithClassicKey(body)



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
    SignPKICertWithClassicKey body = new SignPKICertWithClassicKey(); // SignPKICertWithClassicKey | 
    try {
      SignPKICertOutput result = apiInstance.signPKICertWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#signPKICertWithClassicKey");
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
 **body** | [**SignPKICertWithClassicKey**](SignPKICertWithClassicKey.md)|  |

### Return type

[**SignPKICertOutput**](SignPKICertOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | signPKICertWithClassicKeyResponse wraps response body. |  -  |
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

<a name="updateAWSTarget"></a>
# **updateAWSTarget**
> Object updateAWSTarget(body)



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
    UpdateAWSTarget body = new UpdateAWSTarget(); // UpdateAWSTarget | 
    try {
      Object result = apiInstance.updateAWSTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateAWSTarget");
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
 **body** | [**UpdateAWSTarget**](UpdateAWSTarget.md)|  |

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
**200** | updateAWSTargetResponse wraps response body. |  -  |
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

<a name="updateAzureTarget"></a>
# **updateAzureTarget**
> UpdateAzureTargetOutput updateAzureTarget(body)



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
    UpdateAzureTarget body = new UpdateAzureTarget(); // UpdateAzureTarget | 
    try {
      UpdateAzureTargetOutput result = apiInstance.updateAzureTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateAzureTarget");
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
 **body** | [**UpdateAzureTarget**](UpdateAzureTarget.md)|  |

### Return type

[**UpdateAzureTargetOutput**](UpdateAzureTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateAzureTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateDBTarget"></a>
# **updateDBTarget**
> UpdateDBTargetOutput updateDBTarget(body)



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
    UpdateDBTarget body = new UpdateDBTarget(); // UpdateDBTarget | 
    try {
      UpdateDBTargetOutput result = apiInstance.updateDBTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateDBTarget");
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
 **body** | [**UpdateDBTarget**](UpdateDBTarget.md)|  |

### Return type

[**UpdateDBTargetOutput**](UpdateDBTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateDBTargetResponse wraps response body. |  -  |
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

<a name="updateEKSTarget"></a>
# **updateEKSTarget**
> UpdateEKSTargetOutput updateEKSTarget(body)



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
    UpdateEKSTarget body = new UpdateEKSTarget(); // UpdateEKSTarget | 
    try {
      UpdateEKSTargetOutput result = apiInstance.updateEKSTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateEKSTarget");
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
 **body** | [**UpdateEKSTarget**](UpdateEKSTarget.md)|  |

### Return type

[**UpdateEKSTargetOutput**](UpdateEKSTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateEKSTargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateGKETarget"></a>
# **updateGKETarget**
> UpdateGKETargetOutput updateGKETarget(body)



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
    UpdateGKETarget body = new UpdateGKETarget(); // UpdateGKETarget | 
    try {
      UpdateGKETargetOutput result = apiInstance.updateGKETarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateGKETarget");
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
 **body** | [**UpdateGKETarget**](UpdateGKETarget.md)|  |

### Return type

[**UpdateGKETargetOutput**](UpdateGKETargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateGKETargetResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

<a name="updateGcpTarget"></a>
# **updateGcpTarget**
> UpdateGcpTargetOutput updateGcpTarget(body)



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
    UpdateGcpTarget body = new UpdateGcpTarget(); // UpdateGcpTarget | 
    try {
      UpdateGcpTargetOutput result = apiInstance.updateGcpTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateGcpTarget");
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
 **body** | [**UpdateGcpTarget**](UpdateGcpTarget.md)|  |

### Return type

[**UpdateGcpTargetOutput**](UpdateGcpTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateGcpTargetResponse wraps response body. |  -  |
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

<a name="updateNativeK8STarget"></a>
# **updateNativeK8STarget**
> UpdateNativeK8STarget updateNativeK8STarget(body)



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
    UpdateNativeK8STarget body = new UpdateNativeK8STarget(); // UpdateNativeK8STarget | 
    try {
      UpdateNativeK8STarget result = apiInstance.updateNativeK8STarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateNativeK8STarget");
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
 **body** | [**UpdateNativeK8STarget**](UpdateNativeK8STarget.md)|  |

### Return type

[**UpdateNativeK8STarget**](UpdateNativeK8STarget.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateNativeK8STarget |  -  |
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

<a name="updateRabbitMQTarget"></a>
# **updateRabbitMQTarget**
> UpdateRabbitMQTargetOutput updateRabbitMQTarget(body)



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
    UpdateRabbitMQTarget body = new UpdateRabbitMQTarget(); // UpdateRabbitMQTarget | 
    try {
      UpdateRabbitMQTargetOutput result = apiInstance.updateRabbitMQTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateRabbitMQTarget");
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
 **body** | [**UpdateRabbitMQTarget**](UpdateRabbitMQTarget.md)|  |

### Return type

[**UpdateRabbitMQTargetOutput**](UpdateRabbitMQTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateRabbitMQTargetResponse wraps response body. |  -  |
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

<a name="updateSSHTarget"></a>
# **updateSSHTarget**
> UpdateSSHTargetOutput updateSSHTarget(body)



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
    UpdateSSHTarget body = new UpdateSSHTarget(); // UpdateSSHTarget | 
    try {
      UpdateSSHTargetOutput result = apiInstance.updateSSHTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateSSHTarget");
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
 **body** | [**UpdateSSHTarget**](UpdateSSHTarget.md)|  |

### Return type

[**UpdateSSHTargetOutput**](UpdateSSHTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateSSHTargetResponse wraps response body. |  -  |
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

<a name="updateWebTarget"></a>
# **updateWebTarget**
> UpdateWebTargetOutput updateWebTarget(body)



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
    UpdateWebTarget body = new UpdateWebTarget(); // UpdateWebTarget | 
    try {
      UpdateWebTargetOutput result = apiInstance.updateWebTarget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#updateWebTarget");
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
 **body** | [**UpdateWebTarget**](UpdateWebTarget.md)|  |

### Return type

[**UpdateWebTargetOutput**](UpdateWebTargetOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updateWebTargetResponse wraps response body. |  -  |
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

<a name="verifyJWTWithClassicKey"></a>
# **verifyJWTWithClassicKey**
> VerifyJWTOutput verifyJWTWithClassicKey(body)



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
    VerifyJWTWithClassicKey body = new VerifyJWTWithClassicKey(); // VerifyJWTWithClassicKey | 
    try {
      VerifyJWTOutput result = apiInstance.verifyJWTWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#verifyJWTWithClassicKey");
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
 **body** | [**VerifyJWTWithClassicKey**](VerifyJWTWithClassicKey.md)|  |

### Return type

[**VerifyJWTOutput**](VerifyJWTOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | verifyJWTWithClassicKeyResponse wraps response body. |  -  |
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

<a name="verifyPKICertWithClassicKey"></a>
# **verifyPKICertWithClassicKey**
> VerifyPKICertOutput verifyPKICertWithClassicKey(body)



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
    VerifyPKICertWithClassicKey body = new VerifyPKICertWithClassicKey(); // VerifyPKICertWithClassicKey | 
    try {
      VerifyPKICertOutput result = apiInstance.verifyPKICertWithClassicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#verifyPKICertWithClassicKey");
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
 **body** | [**VerifyPKICertWithClassicKey**](VerifyPKICertWithClassicKey.md)|  |

### Return type

[**VerifyPKICertOutput**](VerifyPKICertOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | verifyPKICertWithClassicKeyResponse wraps response body. |  -  |
**0** | errorResponse wraps any error to return it as a JSON object with one \&quot;error\&quot; field. |  -  |

