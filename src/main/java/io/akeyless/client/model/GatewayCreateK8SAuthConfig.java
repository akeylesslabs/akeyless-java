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

/**
 * gatewayCreateK8SAuth is a command that creates k8s auth config
 */
@ApiModel(description = "gatewayCreateK8SAuth is a command that creates k8s auth config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayCreateK8SAuthConfig {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_CLUSTER_API_TYPE = "cluster-api-type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_API_TYPE)
  private String clusterApiType = "native_k8s";

  public static final String SERIALIZED_NAME_DISABLE_ISSUER_VALIDATION = "disable-issuer-validation";
  @SerializedName(SERIALIZED_NAME_DISABLE_ISSUER_VALIDATION)
  private String disableIssuerValidation;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_AUTH_TYPE = "k8s-auth-type";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_TYPE)
  private String k8sAuthType = "token";

  public static final String SERIALIZED_NAME_K8S_CA_CERT = "k8s-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERT)
  private String k8sCaCert;

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE = "k8s-client-certificate";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE)
  private String k8sClientCertificate;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY = "k8s-client-key";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY)
  private String k8sClientKey;

  public static final String SERIALIZED_NAME_K8S_HOST = "k8s-host";
  @SerializedName(SERIALIZED_NAME_K8S_HOST)
  private String k8sHost;

  public static final String SERIALIZED_NAME_K8S_ISSUER = "k8s-issuer";
  @SerializedName(SERIALIZED_NAME_K8S_ISSUER)
  private String k8sIssuer = "kubernetes/serviceaccount";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RANCHER_API_KEY = "rancher-api-key";
  @SerializedName(SERIALIZED_NAME_RANCHER_API_KEY)
  private String rancherApiKey;

  public static final String SERIALIZED_NAME_RANCHER_CLUSTER_ID = "rancher-cluster-id";
  @SerializedName(SERIALIZED_NAME_RANCHER_CLUSTER_ID)
  private String rancherClusterId;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signing-key";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  private String signingKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXP = "token-exp";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXP)
  private Long tokenExp = 300l;

  public static final String SERIALIZED_NAME_TOKEN_REVIEWER_JWT = "token-reviewer-jwt";
  @SerializedName(SERIALIZED_NAME_TOKEN_REVIEWER_JWT)
  private String tokenReviewerJwt;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT = "use-gw-service-account";
  @SerializedName(SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT)
  private Boolean useGwServiceAccount;

  public GatewayCreateK8SAuthConfig() { 
  }

  public GatewayCreateK8SAuthConfig accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * The access ID of the Kubernetes auth method
   * @return accessId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The access ID of the Kubernetes auth method")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public GatewayCreateK8SAuthConfig clusterApiType(String clusterApiType) {
    
    this.clusterApiType = clusterApiType;
    return this;
  }

   /**
   * Cluster access type. options: [native_k8s, rancher]
   * @return clusterApiType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cluster access type. options: [native_k8s, rancher]")

  public String getClusterApiType() {
    return clusterApiType;
  }


  public void setClusterApiType(String clusterApiType) {
    this.clusterApiType = clusterApiType;
  }


  public GatewayCreateK8SAuthConfig disableIssuerValidation(String disableIssuerValidation) {
    
    this.disableIssuerValidation = disableIssuerValidation;
    return this;
  }

   /**
   * Disable issuer validation [true/false]
   * @return disableIssuerValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable issuer validation [true/false]")

  public String getDisableIssuerValidation() {
    return disableIssuerValidation;
  }


  public void setDisableIssuerValidation(String disableIssuerValidation) {
    this.disableIssuerValidation = disableIssuerValidation;
  }


  public GatewayCreateK8SAuthConfig json(Boolean json) {
    
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


  public GatewayCreateK8SAuthConfig k8sAuthType(String k8sAuthType) {
    
    this.k8sAuthType = k8sAuthType;
    return this;
  }

   /**
   * K8S auth type [token/certificate]. (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S auth type [token/certificate]. (relevant for \"native_k8s\" only)")

  public String getK8sAuthType() {
    return k8sAuthType;
  }


  public void setK8sAuthType(String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
  }


  public GatewayCreateK8SAuthConfig k8sCaCert(String k8sCaCert) {
    
    this.k8sCaCert = k8sCaCert;
    return this;
  }

   /**
   * The CA Certificate (base64 encoded) to use to call into the kubernetes API server
   * @return k8sCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CA Certificate (base64 encoded) to use to call into the kubernetes API server")

  public String getK8sCaCert() {
    return k8sCaCert;
  }


  public void setK8sCaCert(String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
  }


  public GatewayCreateK8SAuthConfig k8sClientCertificate(String k8sClientCertificate) {
    
    this.k8sClientCertificate = k8sClientCertificate;
    return this;
  }

   /**
   * Content of the k8 client certificate (PEM format) in a Base64 format (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sClientCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of the k8 client certificate (PEM format) in a Base64 format (relevant for \"native_k8s\" only)")

  public String getK8sClientCertificate() {
    return k8sClientCertificate;
  }


  public void setK8sClientCertificate(String k8sClientCertificate) {
    this.k8sClientCertificate = k8sClientCertificate;
  }


  public GatewayCreateK8SAuthConfig k8sClientKey(String k8sClientKey) {
    
    this.k8sClientKey = k8sClientKey;
    return this;
  }

   /**
   * Content of the k8 client private key (PEM format) in a Base64 format (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sClientKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of the k8 client private key (PEM format) in a Base64 format (relevant for \"native_k8s\" only)")

  public String getK8sClientKey() {
    return k8sClientKey;
  }


  public void setK8sClientKey(String k8sClientKey) {
    this.k8sClientKey = k8sClientKey;
  }


  public GatewayCreateK8SAuthConfig k8sHost(String k8sHost) {
    
    this.k8sHost = k8sHost;
    return this;
  }

   /**
   * The URL of the kubernetes API server
   * @return k8sHost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL of the kubernetes API server")

  public String getK8sHost() {
    return k8sHost;
  }


  public void setK8sHost(String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public GatewayCreateK8SAuthConfig k8sIssuer(String k8sIssuer) {
    
    this.k8sIssuer = k8sIssuer;
    return this;
  }

   /**
   * The Kubernetes JWT issuer name. K8SIssuer is the claim that specifies who issued the Kubernetes token
   * @return k8sIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Kubernetes JWT issuer name. K8SIssuer is the claim that specifies who issued the Kubernetes token")

  public String getK8sIssuer() {
    return k8sIssuer;
  }


  public void setK8sIssuer(String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
  }


  public GatewayCreateK8SAuthConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * K8S Auth config name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "K8S Auth config name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateK8SAuthConfig rancherApiKey(String rancherApiKey) {
    
    this.rancherApiKey = rancherApiKey;
    return this;
  }

   /**
   * The api key used to access the TokenReview API to validate other JWTs (relevant for \&quot;rancher\&quot; only)
   * @return rancherApiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The api key used to access the TokenReview API to validate other JWTs (relevant for \"rancher\" only)")

  public String getRancherApiKey() {
    return rancherApiKey;
  }


  public void setRancherApiKey(String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
  }


  public GatewayCreateK8SAuthConfig rancherClusterId(String rancherClusterId) {
    
    this.rancherClusterId = rancherClusterId;
    return this;
  }

   /**
   * The cluster id as define in rancher (relevant for \&quot;rancher\&quot; only)
   * @return rancherClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cluster id as define in rancher (relevant for \"rancher\" only)")

  public String getRancherClusterId() {
    return rancherClusterId;
  }


  public void setRancherClusterId(String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
  }


  public GatewayCreateK8SAuthConfig signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The private key (base64 encoded) associated with the public key defined in the Kubernetes auth
   * @return signingKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The private key (base64 encoded) associated with the public key defined in the Kubernetes auth")

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public GatewayCreateK8SAuthConfig token(String token) {
    
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


  public GatewayCreateK8SAuthConfig tokenExp(Long tokenExp) {
    
    this.tokenExp = tokenExp;
    return this;
  }

   /**
   * Time in seconds of expiration of the Akeyless Kube Auth Method token
   * @return tokenExp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in seconds of expiration of the Akeyless Kube Auth Method token")

  public Long getTokenExp() {
    return tokenExp;
  }


  public void setTokenExp(Long tokenExp) {
    this.tokenExp = tokenExp;
  }


  public GatewayCreateK8SAuthConfig tokenReviewerJwt(String tokenReviewerJwt) {
    
    this.tokenReviewerJwt = tokenReviewerJwt;
    return this;
  }

   /**
   * A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs (relevant for \&quot;native_k8s\&quot; only). If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API.
   * @return tokenReviewerJwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs (relevant for \"native_k8s\" only). If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API.")

  public String getTokenReviewerJwt() {
    return tokenReviewerJwt;
  }


  public void setTokenReviewerJwt(String tokenReviewerJwt) {
    this.tokenReviewerJwt = tokenReviewerJwt;
  }


  public GatewayCreateK8SAuthConfig uidToken(String uidToken) {
    
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


  public GatewayCreateK8SAuthConfig useGwServiceAccount(Boolean useGwServiceAccount) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateK8SAuthConfig gatewayCreateK8SAuthConfig = (GatewayCreateK8SAuthConfig) o;
    return Objects.equals(this.accessId, gatewayCreateK8SAuthConfig.accessId) &&
        Objects.equals(this.clusterApiType, gatewayCreateK8SAuthConfig.clusterApiType) &&
        Objects.equals(this.disableIssuerValidation, gatewayCreateK8SAuthConfig.disableIssuerValidation) &&
        Objects.equals(this.json, gatewayCreateK8SAuthConfig.json) &&
        Objects.equals(this.k8sAuthType, gatewayCreateK8SAuthConfig.k8sAuthType) &&
        Objects.equals(this.k8sCaCert, gatewayCreateK8SAuthConfig.k8sCaCert) &&
        Objects.equals(this.k8sClientCertificate, gatewayCreateK8SAuthConfig.k8sClientCertificate) &&
        Objects.equals(this.k8sClientKey, gatewayCreateK8SAuthConfig.k8sClientKey) &&
        Objects.equals(this.k8sHost, gatewayCreateK8SAuthConfig.k8sHost) &&
        Objects.equals(this.k8sIssuer, gatewayCreateK8SAuthConfig.k8sIssuer) &&
        Objects.equals(this.name, gatewayCreateK8SAuthConfig.name) &&
        Objects.equals(this.rancherApiKey, gatewayCreateK8SAuthConfig.rancherApiKey) &&
        Objects.equals(this.rancherClusterId, gatewayCreateK8SAuthConfig.rancherClusterId) &&
        Objects.equals(this.signingKey, gatewayCreateK8SAuthConfig.signingKey) &&
        Objects.equals(this.token, gatewayCreateK8SAuthConfig.token) &&
        Objects.equals(this.tokenExp, gatewayCreateK8SAuthConfig.tokenExp) &&
        Objects.equals(this.tokenReviewerJwt, gatewayCreateK8SAuthConfig.tokenReviewerJwt) &&
        Objects.equals(this.uidToken, gatewayCreateK8SAuthConfig.uidToken) &&
        Objects.equals(this.useGwServiceAccount, gatewayCreateK8SAuthConfig.useGwServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, clusterApiType, disableIssuerValidation, json, k8sAuthType, k8sCaCert, k8sClientCertificate, k8sClientKey, k8sHost, k8sIssuer, name, rancherApiKey, rancherClusterId, signingKey, token, tokenExp, tokenReviewerJwt, uidToken, useGwServiceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateK8SAuthConfig {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    clusterApiType: ").append(toIndentedString(clusterApiType)).append("\n");
    sb.append("    disableIssuerValidation: ").append(toIndentedString(disableIssuerValidation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sAuthType: ").append(toIndentedString(k8sAuthType)).append("\n");
    sb.append("    k8sCaCert: ").append(toIndentedString(k8sCaCert)).append("\n");
    sb.append("    k8sClientCertificate: ").append(toIndentedString(k8sClientCertificate)).append("\n");
    sb.append("    k8sClientKey: ").append(toIndentedString(k8sClientKey)).append("\n");
    sb.append("    k8sHost: ").append(toIndentedString(k8sHost)).append("\n");
    sb.append("    k8sIssuer: ").append(toIndentedString(k8sIssuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rancherApiKey: ").append(toIndentedString(rancherApiKey)).append("\n");
    sb.append("    rancherClusterId: ").append(toIndentedString(rancherClusterId)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExp: ").append(toIndentedString(tokenExp)).append("\n");
    sb.append("    tokenReviewerJwt: ").append(toIndentedString(tokenReviewerJwt)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useGwServiceAccount: ").append(toIndentedString(useGwServiceAccount)).append("\n");
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

