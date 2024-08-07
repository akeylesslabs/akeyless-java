/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * gatewayUpdateProducerNativeK8S is a command that updates k8s producer [Deprecated: Use dynamic-secret-update-k8s command]
 */
@ApiModel(description = "gatewayUpdateProducerNativeK8S is a command that updates k8s producer [Deprecated: Use dynamic-secret-update-k8s command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateProducerNativeK8S {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_ALLOWED_NAMESPACES = "k8s-allowed-namespaces";
  @SerializedName(SERIALIZED_NAME_K8S_ALLOWED_NAMESPACES)
  private String k8sAllowedNamespaces;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_CA_CERT = "k8s-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_CA_CERT)
  private String k8sClusterCaCert;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT = "k8s-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT)
  private String k8sClusterEndpoint;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_NAME = "k8s-cluster-name";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_NAME)
  private String k8sClusterName;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_TOKEN = "k8s-cluster-token";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_TOKEN)
  private String k8sClusterToken;

  public static final String SERIALIZED_NAME_K8S_NAMESPACE = "k8s-namespace";
  @SerializedName(SERIALIZED_NAME_K8S_NAMESPACE)
  private String k8sNamespace;

  public static final String SERIALIZED_NAME_K8S_PREDEFINED_ROLE_NAME = "k8s-predefined-role-name";
  @SerializedName(SERIALIZED_NAME_K8S_PREDEFINED_ROLE_NAME)
  private String k8sPredefinedRoleName;

  public static final String SERIALIZED_NAME_K8S_PREDEFINED_ROLE_TYPE = "k8s-predefined-role-type";
  @SerializedName(SERIALIZED_NAME_K8S_PREDEFINED_ROLE_TYPE)
  private String k8sPredefinedRoleType;

  public static final String SERIALIZED_NAME_K8S_ROLEBINDING_YAML_DEF = "k8s-rolebinding-yaml-def";
  @SerializedName(SERIALIZED_NAME_K8S_ROLEBINDING_YAML_DEF)
  private String k8sRolebindingYamlDef;

  public static final String SERIALIZED_NAME_K8S_SERVICE_ACCOUNT = "k8s-service-account";
  @SerializedName(SERIALIZED_NAME_K8S_SERVICE_ACCOUNT)
  private String k8sServiceAccount;

  public static final String SERIALIZED_NAME_K8S_SERVICE_ACCOUNT_TYPE = "k8s-service-account-type";
  @SerializedName(SERIALIZED_NAME_K8S_SERVICE_ACCOUNT_TYPE)
  private String k8sServiceAccountType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING = "secure-access-allow-port-forwading";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING)
  private Boolean secureAccessAllowPortForwading;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT = "secure-access-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT)
  private String secureAccessClusterEndpoint;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DASHBOARD_URL = "secure-access-dashboard-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DASHBOARD_URL)
  private String secureAccessDashboardUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT = "use-gw-service-account";
  @SerializedName(SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT)
  private Boolean useGwServiceAccount;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public GatewayUpdateProducerNativeK8S() { 
  }

  public GatewayUpdateProducerNativeK8S deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this object [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayUpdateProducerNativeK8S json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public GatewayUpdateProducerNativeK8S k8sAllowedNamespaces(String k8sAllowedNamespaces) {
    
    this.k8sAllowedNamespaces = k8sAllowedNamespaces;
    return this;
  }

   /**
   * Comma-separated list of allowed K8S namespaces for the generated ServiceAccount (relevant only for k8s-service-account-type&#x3D;dynamic)
   * @return k8sAllowedNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma-separated list of allowed K8S namespaces for the generated ServiceAccount (relevant only for k8s-service-account-type=dynamic)")

  public String getK8sAllowedNamespaces() {
    return k8sAllowedNamespaces;
  }


  public void setK8sAllowedNamespaces(String k8sAllowedNamespaces) {
    this.k8sAllowedNamespaces = k8sAllowedNamespaces;
  }


  public GatewayUpdateProducerNativeK8S k8sClusterCaCert(String k8sClusterCaCert) {
    
    this.k8sClusterCaCert = k8sClusterCaCert;
    return this;
  }

   /**
   * K8S cluster CA certificate
   * @return k8sClusterCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S cluster CA certificate")

  public String getK8sClusterCaCert() {
    return k8sClusterCaCert;
  }


  public void setK8sClusterCaCert(String k8sClusterCaCert) {
    this.k8sClusterCaCert = k8sClusterCaCert;
  }


  public GatewayUpdateProducerNativeK8S k8sClusterEndpoint(String k8sClusterEndpoint) {
    
    this.k8sClusterEndpoint = k8sClusterEndpoint;
    return this;
  }

   /**
   * K8S cluster URL endpoint
   * @return k8sClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S cluster URL endpoint")

  public String getK8sClusterEndpoint() {
    return k8sClusterEndpoint;
  }


  public void setK8sClusterEndpoint(String k8sClusterEndpoint) {
    this.k8sClusterEndpoint = k8sClusterEndpoint;
  }


  public GatewayUpdateProducerNativeK8S k8sClusterName(String k8sClusterName) {
    
    this.k8sClusterName = k8sClusterName;
    return this;
  }

   /**
   * K8S cluster name
   * @return k8sClusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S cluster name")

  public String getK8sClusterName() {
    return k8sClusterName;
  }


  public void setK8sClusterName(String k8sClusterName) {
    this.k8sClusterName = k8sClusterName;
  }


  public GatewayUpdateProducerNativeK8S k8sClusterToken(String k8sClusterToken) {
    
    this.k8sClusterToken = k8sClusterToken;
    return this;
  }

   /**
   * K8S cluster Bearer token
   * @return k8sClusterToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S cluster Bearer token")

  public String getK8sClusterToken() {
    return k8sClusterToken;
  }


  public void setK8sClusterToken(String k8sClusterToken) {
    this.k8sClusterToken = k8sClusterToken;
  }


  public GatewayUpdateProducerNativeK8S k8sNamespace(String k8sNamespace) {
    
    this.k8sNamespace = k8sNamespace;
    return this;
  }

   /**
   * K8S Namespace where the ServiceAccount exists.
   * @return k8sNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S Namespace where the ServiceAccount exists.")

  public String getK8sNamespace() {
    return k8sNamespace;
  }


  public void setK8sNamespace(String k8sNamespace) {
    this.k8sNamespace = k8sNamespace;
  }


  public GatewayUpdateProducerNativeK8S k8sPredefinedRoleName(String k8sPredefinedRoleName) {
    
    this.k8sPredefinedRoleName = k8sPredefinedRoleName;
    return this;
  }

   /**
   * The pre-existing Role or ClusterRole name to bind the generated ServiceAccount to (relevant only for k8s-service-account-type&#x3D;dynamic)
   * @return k8sPredefinedRoleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pre-existing Role or ClusterRole name to bind the generated ServiceAccount to (relevant only for k8s-service-account-type=dynamic)")

  public String getK8sPredefinedRoleName() {
    return k8sPredefinedRoleName;
  }


  public void setK8sPredefinedRoleName(String k8sPredefinedRoleName) {
    this.k8sPredefinedRoleName = k8sPredefinedRoleName;
  }


  public GatewayUpdateProducerNativeK8S k8sPredefinedRoleType(String k8sPredefinedRoleType) {
    
    this.k8sPredefinedRoleType = k8sPredefinedRoleType;
    return this;
  }

   /**
   * Specifies the type of the pre-existing K8S role [Role, ClusterRole] (relevant only for k8s-service-account-type&#x3D;dynamic)
   * @return k8sPredefinedRoleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the pre-existing K8S role [Role, ClusterRole] (relevant only for k8s-service-account-type=dynamic)")

  public String getK8sPredefinedRoleType() {
    return k8sPredefinedRoleType;
  }


  public void setK8sPredefinedRoleType(String k8sPredefinedRoleType) {
    this.k8sPredefinedRoleType = k8sPredefinedRoleType;
  }


  public GatewayUpdateProducerNativeK8S k8sRolebindingYamlDef(String k8sRolebindingYamlDef) {
    
    this.k8sRolebindingYamlDef = k8sRolebindingYamlDef;
    return this;
  }

   /**
   * Path to yaml file that contains definitions of K8S role and role binding (relevant only for k8s-service-account-type&#x3D;dynamic)
   * @return k8sRolebindingYamlDef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to yaml file that contains definitions of K8S role and role binding (relevant only for k8s-service-account-type=dynamic)")

  public String getK8sRolebindingYamlDef() {
    return k8sRolebindingYamlDef;
  }


  public void setK8sRolebindingYamlDef(String k8sRolebindingYamlDef) {
    this.k8sRolebindingYamlDef = k8sRolebindingYamlDef;
  }


  public GatewayUpdateProducerNativeK8S k8sServiceAccount(String k8sServiceAccount) {
    
    this.k8sServiceAccount = k8sServiceAccount;
    return this;
  }

   /**
   * K8S ServiceAccount to extract token from.
   * @return k8sServiceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S ServiceAccount to extract token from.")

  public String getK8sServiceAccount() {
    return k8sServiceAccount;
  }


  public void setK8sServiceAccount(String k8sServiceAccount) {
    this.k8sServiceAccount = k8sServiceAccount;
  }


  public GatewayUpdateProducerNativeK8S k8sServiceAccountType(String k8sServiceAccountType) {
    
    this.k8sServiceAccountType = k8sServiceAccountType;
    return this;
  }

   /**
   * K8S ServiceAccount type [fixed, dynamic].
   * @return k8sServiceAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S ServiceAccount type [fixed, dynamic].")

  public String getK8sServiceAccountType() {
    return k8sServiceAccountType;
  }


  public void setK8sServiceAccountType(String k8sServiceAccountType) {
    this.k8sServiceAccountType = k8sServiceAccountType;
  }


  public GatewayUpdateProducerNativeK8S name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayUpdateProducerNativeK8S newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerNativeK8S producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayUpdateProducerNativeK8S secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Enable Port forwarding while using CLI access
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Port forwarding while using CLI access")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayUpdateProducerNativeK8S secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Path to the SSH Certificate Issuer for your Akeyless Bastion
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the SSH Certificate Issuer for your Akeyless Bastion")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayUpdateProducerNativeK8S secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * The K8s cluster endpoint URL
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8s cluster endpoint URL")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayUpdateProducerNativeK8S secureAccessDashboardUrl(String secureAccessDashboardUrl) {
    
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
    return this;
  }

   /**
   * The K8s dashboard url
   * @return secureAccessDashboardUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8s dashboard url")

  public String getSecureAccessDashboardUrl() {
    return secureAccessDashboardUrl;
  }


  public void setSecureAccessDashboardUrl(String secureAccessDashboardUrl) {
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
  }


  public GatewayUpdateProducerNativeK8S secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable secure remote access [true/false]")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayUpdateProducerNativeK8S secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Web Secure Remote Access")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayUpdateProducerNativeK8S secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Secure browser via Akeyless Web Access Bastion
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure browser via Akeyless Web Access Bastion")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public GatewayUpdateProducerNativeK8S secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Web-Proxy via Akeyless Web Access Bastion
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Web-Proxy via Akeyless Web Access Bastion")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public GatewayUpdateProducerNativeK8S tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerNativeK8S addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayUpdateProducerNativeK8S targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public GatewayUpdateProducerNativeK8S token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public GatewayUpdateProducerNativeK8S uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  public GatewayUpdateProducerNativeK8S useGwServiceAccount(Boolean useGwServiceAccount) {
    
    this.useGwServiceAccount = useGwServiceAccount;
    return this;
  }

   /**
   * Use the GW&#39;s service account
   * @return useGwServiceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the GW's service account")

  public Boolean getUseGwServiceAccount() {
    return useGwServiceAccount;
  }


  public void setUseGwServiceAccount(Boolean useGwServiceAccount) {
    this.useGwServiceAccount = useGwServiceAccount;
  }


  public GatewayUpdateProducerNativeK8S userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateProducerNativeK8S gatewayUpdateProducerNativeK8S = (GatewayUpdateProducerNativeK8S) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerNativeK8S.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerNativeK8S.json) &&
        Objects.equals(this.k8sAllowedNamespaces, gatewayUpdateProducerNativeK8S.k8sAllowedNamespaces) &&
        Objects.equals(this.k8sClusterCaCert, gatewayUpdateProducerNativeK8S.k8sClusterCaCert) &&
        Objects.equals(this.k8sClusterEndpoint, gatewayUpdateProducerNativeK8S.k8sClusterEndpoint) &&
        Objects.equals(this.k8sClusterName, gatewayUpdateProducerNativeK8S.k8sClusterName) &&
        Objects.equals(this.k8sClusterToken, gatewayUpdateProducerNativeK8S.k8sClusterToken) &&
        Objects.equals(this.k8sNamespace, gatewayUpdateProducerNativeK8S.k8sNamespace) &&
        Objects.equals(this.k8sPredefinedRoleName, gatewayUpdateProducerNativeK8S.k8sPredefinedRoleName) &&
        Objects.equals(this.k8sPredefinedRoleType, gatewayUpdateProducerNativeK8S.k8sPredefinedRoleType) &&
        Objects.equals(this.k8sRolebindingYamlDef, gatewayUpdateProducerNativeK8S.k8sRolebindingYamlDef) &&
        Objects.equals(this.k8sServiceAccount, gatewayUpdateProducerNativeK8S.k8sServiceAccount) &&
        Objects.equals(this.k8sServiceAccountType, gatewayUpdateProducerNativeK8S.k8sServiceAccountType) &&
        Objects.equals(this.name, gatewayUpdateProducerNativeK8S.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerNativeK8S.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerNativeK8S.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessAllowPortForwading, gatewayUpdateProducerNativeK8S.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerNativeK8S.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayUpdateProducerNativeK8S.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessDashboardUrl, gatewayUpdateProducerNativeK8S.secureAccessDashboardUrl) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerNativeK8S.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerNativeK8S.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, gatewayUpdateProducerNativeK8S.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, gatewayUpdateProducerNativeK8S.secureAccessWebProxy) &&
        Objects.equals(this.tags, gatewayUpdateProducerNativeK8S.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerNativeK8S.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerNativeK8S.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerNativeK8S.uidToken) &&
        Objects.equals(this.useGwServiceAccount, gatewayUpdateProducerNativeK8S.useGwServiceAccount) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerNativeK8S.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, json, k8sAllowedNamespaces, k8sClusterCaCert, k8sClusterEndpoint, k8sClusterName, k8sClusterToken, k8sNamespace, k8sPredefinedRoleName, k8sPredefinedRoleType, k8sRolebindingYamlDef, k8sServiceAccount, k8sServiceAccountType, name, newName, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessClusterEndpoint, secureAccessDashboardUrl, secureAccessEnable, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, useGwServiceAccount, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerNativeK8S {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sAllowedNamespaces: ").append(toIndentedString(k8sAllowedNamespaces)).append("\n");
    sb.append("    k8sClusterCaCert: ").append(toIndentedString(k8sClusterCaCert)).append("\n");
    sb.append("    k8sClusterEndpoint: ").append(toIndentedString(k8sClusterEndpoint)).append("\n");
    sb.append("    k8sClusterName: ").append(toIndentedString(k8sClusterName)).append("\n");
    sb.append("    k8sClusterToken: ").append(toIndentedString(k8sClusterToken)).append("\n");
    sb.append("    k8sNamespace: ").append(toIndentedString(k8sNamespace)).append("\n");
    sb.append("    k8sPredefinedRoleName: ").append(toIndentedString(k8sPredefinedRoleName)).append("\n");
    sb.append("    k8sPredefinedRoleType: ").append(toIndentedString(k8sPredefinedRoleType)).append("\n");
    sb.append("    k8sRolebindingYamlDef: ").append(toIndentedString(k8sRolebindingYamlDef)).append("\n");
    sb.append("    k8sServiceAccount: ").append(toIndentedString(k8sServiceAccount)).append("\n");
    sb.append("    k8sServiceAccountType: ").append(toIndentedString(k8sServiceAccountType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessAllowPortForwading: ").append(toIndentedString(secureAccessAllowPortForwading)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessClusterEndpoint: ").append(toIndentedString(secureAccessClusterEndpoint)).append("\n");
    sb.append("    secureAccessDashboardUrl: ").append(toIndentedString(secureAccessDashboardUrl)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useGwServiceAccount: ").append(toIndentedString(useGwServiceAccount)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

