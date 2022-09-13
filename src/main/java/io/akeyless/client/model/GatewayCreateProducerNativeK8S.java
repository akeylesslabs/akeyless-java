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
 * gatewayCreateProducerNativeK8S is a command that creates k8s producer
 */
@ApiModel(description = "gatewayCreateProducerNativeK8S is a command that creates k8s producer")

public class GatewayCreateProducerNativeK8S {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_CA_CERT = "k8s-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_CA_CERT)
  private String k8sClusterCaCert;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT = "k8s-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT)
  private String k8sClusterEndpoint;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_TOKEN = "k8s-cluster-token";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_TOKEN)
  private String k8sClusterToken;

  public static final String SERIALIZED_NAME_K8S_NAMESPACE = "k8s-namespace";
  @SerializedName(SERIALIZED_NAME_K8S_NAMESPACE)
  private String k8sNamespace;

  public static final String SERIALIZED_NAME_K8S_SERVICE_ACCOUNT = "k8s-service-account";
  @SerializedName(SERIALIZED_NAME_K8S_SERVICE_ACCOUNT)
  private String k8sServiceAccount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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
  private Boolean secureAccessWeb;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy;

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

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";


  public GatewayCreateProducerNativeK8S deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayCreateProducerNativeK8S json(Boolean json) {
    
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


  public GatewayCreateProducerNativeK8S k8sClusterCaCert(String k8sClusterCaCert) {
    
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


  public GatewayCreateProducerNativeK8S k8sClusterEndpoint(String k8sClusterEndpoint) {
    
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


  public GatewayCreateProducerNativeK8S k8sClusterToken(String k8sClusterToken) {
    
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


  public GatewayCreateProducerNativeK8S k8sNamespace(String k8sNamespace) {
    
    this.k8sNamespace = k8sNamespace;
    return this;
  }

   /**
   * K8S namespace
   * @return k8sNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S namespace")

  public String getK8sNamespace() {
    return k8sNamespace;
  }


  public void setK8sNamespace(String k8sNamespace) {
    this.k8sNamespace = k8sNamespace;
  }


  public GatewayCreateProducerNativeK8S k8sServiceAccount(String k8sServiceAccount) {
    
    this.k8sServiceAccount = k8sServiceAccount;
    return this;
  }

   /**
   * K8S service account
   * @return k8sServiceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S service account")

  public String getK8sServiceAccount() {
    return k8sServiceAccount;
  }


  public void setK8sServiceAccount(String k8sServiceAccount) {
    this.k8sServiceAccount = k8sServiceAccount;
  }


  public GatewayCreateProducerNativeK8S name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateProducerNativeK8S producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerNativeK8S secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Get secureAccessAllowPortForwading
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayCreateProducerNativeK8S secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Get secureAccessBastionIssuer
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayCreateProducerNativeK8S secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * Get secureAccessClusterEndpoint
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayCreateProducerNativeK8S secureAccessDashboardUrl(String secureAccessDashboardUrl) {
    
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
    return this;
  }

   /**
   * Get secureAccessDashboardUrl
   * @return secureAccessDashboardUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessDashboardUrl() {
    return secureAccessDashboardUrl;
  }


  public void setSecureAccessDashboardUrl(String secureAccessDashboardUrl) {
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
  }


  public GatewayCreateProducerNativeK8S secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Get secureAccessEnable
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayCreateProducerNativeK8S secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Get secureAccessWeb
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayCreateProducerNativeK8S secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Get secureAccessWebBrowsing
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public GatewayCreateProducerNativeK8S secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Get secureAccessWebProxy
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public GatewayCreateProducerNativeK8S tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerNativeK8S addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this secret
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this secret")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayCreateProducerNativeK8S targetName(String targetName) {
    
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


  public GatewayCreateProducerNativeK8S token(String token) {
    
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


  public GatewayCreateProducerNativeK8S uidToken(String uidToken) {
    
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


  public GatewayCreateProducerNativeK8S userTtl(String userTtl) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerNativeK8S gatewayCreateProducerNativeK8S = (GatewayCreateProducerNativeK8S) o;
    return Objects.equals(this.deleteProtection, gatewayCreateProducerNativeK8S.deleteProtection) &&
        Objects.equals(this.json, gatewayCreateProducerNativeK8S.json) &&
        Objects.equals(this.k8sClusterCaCert, gatewayCreateProducerNativeK8S.k8sClusterCaCert) &&
        Objects.equals(this.k8sClusterEndpoint, gatewayCreateProducerNativeK8S.k8sClusterEndpoint) &&
        Objects.equals(this.k8sClusterToken, gatewayCreateProducerNativeK8S.k8sClusterToken) &&
        Objects.equals(this.k8sNamespace, gatewayCreateProducerNativeK8S.k8sNamespace) &&
        Objects.equals(this.k8sServiceAccount, gatewayCreateProducerNativeK8S.k8sServiceAccount) &&
        Objects.equals(this.name, gatewayCreateProducerNativeK8S.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerNativeK8S.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessAllowPortForwading, gatewayCreateProducerNativeK8S.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayCreateProducerNativeK8S.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayCreateProducerNativeK8S.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessDashboardUrl, gatewayCreateProducerNativeK8S.secureAccessDashboardUrl) &&
        Objects.equals(this.secureAccessEnable, gatewayCreateProducerNativeK8S.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayCreateProducerNativeK8S.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, gatewayCreateProducerNativeK8S.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, gatewayCreateProducerNativeK8S.secureAccessWebProxy) &&
        Objects.equals(this.tags, gatewayCreateProducerNativeK8S.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerNativeK8S.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerNativeK8S.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerNativeK8S.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerNativeK8S.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, json, k8sClusterCaCert, k8sClusterEndpoint, k8sClusterToken, k8sNamespace, k8sServiceAccount, name, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessClusterEndpoint, secureAccessDashboardUrl, secureAccessEnable, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerNativeK8S {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sClusterCaCert: ").append(toIndentedString(k8sClusterCaCert)).append("\n");
    sb.append("    k8sClusterEndpoint: ").append(toIndentedString(k8sClusterEndpoint)).append("\n");
    sb.append("    k8sClusterToken: ").append(toIndentedString(k8sClusterToken)).append("\n");
    sb.append("    k8sNamespace: ").append(toIndentedString(k8sNamespace)).append("\n");
    sb.append("    k8sServiceAccount: ").append(toIndentedString(k8sServiceAccount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

