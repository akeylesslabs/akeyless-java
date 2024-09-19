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
 * GatewayPartialUpdateK8SAuthConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayPartialUpdateK8SAuthConfig {
  public static final String SERIALIZED_NAME_USE_DEFAULT_IDENTITY_BOOL = "UseDefaultIdentityBool";
  @SerializedName(SERIALIZED_NAME_USE_DEFAULT_IDENTITY_BOOL)
  private Boolean useDefaultIdentityBool;

  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

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
  private String k8sIssuer;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

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
  private Long tokenExp;

  public static final String SERIALIZED_NAME_TOKEN_REVIEWER_JWT = "token-reviewer-jwt";
  @SerializedName(SERIALIZED_NAME_TOKEN_REVIEWER_JWT)
  private String tokenReviewerJwt;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT = "use-gw-service-account";
  @SerializedName(SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT)
  private String useGwServiceAccount;

  public GatewayPartialUpdateK8SAuthConfig() { 
  }

  public GatewayPartialUpdateK8SAuthConfig useDefaultIdentityBool(Boolean useDefaultIdentityBool) {
    
    this.useDefaultIdentityBool = useDefaultIdentityBool;
    return this;
  }

   /**
   * Get useDefaultIdentityBool
   * @return useDefaultIdentityBool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseDefaultIdentityBool() {
    return useDefaultIdentityBool;
  }


  public void setUseDefaultIdentityBool(Boolean useDefaultIdentityBool) {
    this.useDefaultIdentityBool = useDefaultIdentityBool;
  }


  public GatewayPartialUpdateK8SAuthConfig accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * The access ID of the Kubernetes auth method
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access ID of the Kubernetes auth method")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public GatewayPartialUpdateK8SAuthConfig disableIssuerValidation(String disableIssuerValidation) {
    
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


  public GatewayPartialUpdateK8SAuthConfig json(Boolean json) {
    
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


  public GatewayPartialUpdateK8SAuthConfig k8sAuthType(String k8sAuthType) {
    
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


  public GatewayPartialUpdateK8SAuthConfig k8sCaCert(String k8sCaCert) {
    
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


  public GatewayPartialUpdateK8SAuthConfig k8sClientCertificate(String k8sClientCertificate) {
    
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


  public GatewayPartialUpdateK8SAuthConfig k8sClientKey(String k8sClientKey) {
    
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


  public GatewayPartialUpdateK8SAuthConfig k8sHost(String k8sHost) {
    
    this.k8sHost = k8sHost;
    return this;
  }

   /**
   * The URL of the kubernetes API server
   * @return k8sHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the kubernetes API server")

  public String getK8sHost() {
    return k8sHost;
  }


  public void setK8sHost(String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public GatewayPartialUpdateK8SAuthConfig k8sIssuer(String k8sIssuer) {
    
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


  public GatewayPartialUpdateK8SAuthConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * K8S Auth config name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S Auth config name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayPartialUpdateK8SAuthConfig newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * K8S Auth config new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S Auth config new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayPartialUpdateK8SAuthConfig rancherApiKey(String rancherApiKey) {
    
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


  public GatewayPartialUpdateK8SAuthConfig rancherClusterId(String rancherClusterId) {
    
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


  public GatewayPartialUpdateK8SAuthConfig signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The private key (base64 encoded) associated with the public key defined in the Kubernetes auth
   * @return signingKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The private key (base64 encoded) associated with the public key defined in the Kubernetes auth")

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public GatewayPartialUpdateK8SAuthConfig token(String token) {
    
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


  public GatewayPartialUpdateK8SAuthConfig tokenExp(Long tokenExp) {
    
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


  public GatewayPartialUpdateK8SAuthConfig tokenReviewerJwt(String tokenReviewerJwt) {
    
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


  public GatewayPartialUpdateK8SAuthConfig uidToken(String uidToken) {
    
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


  public GatewayPartialUpdateK8SAuthConfig useGwServiceAccount(String useGwServiceAccount) {
    
    this.useGwServiceAccount = useGwServiceAccount;
    return this;
  }

   /**
   * Use the GW&#39;s service account
   * @return useGwServiceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the GW's service account")

  public String getUseGwServiceAccount() {
    return useGwServiceAccount;
  }


  public void setUseGwServiceAccount(String useGwServiceAccount) {
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
    GatewayPartialUpdateK8SAuthConfig gatewayPartialUpdateK8SAuthConfig = (GatewayPartialUpdateK8SAuthConfig) o;
    return Objects.equals(this.useDefaultIdentityBool, gatewayPartialUpdateK8SAuthConfig.useDefaultIdentityBool) &&
        Objects.equals(this.accessId, gatewayPartialUpdateK8SAuthConfig.accessId) &&
        Objects.equals(this.disableIssuerValidation, gatewayPartialUpdateK8SAuthConfig.disableIssuerValidation) &&
        Objects.equals(this.json, gatewayPartialUpdateK8SAuthConfig.json) &&
        Objects.equals(this.k8sAuthType, gatewayPartialUpdateK8SAuthConfig.k8sAuthType) &&
        Objects.equals(this.k8sCaCert, gatewayPartialUpdateK8SAuthConfig.k8sCaCert) &&
        Objects.equals(this.k8sClientCertificate, gatewayPartialUpdateK8SAuthConfig.k8sClientCertificate) &&
        Objects.equals(this.k8sClientKey, gatewayPartialUpdateK8SAuthConfig.k8sClientKey) &&
        Objects.equals(this.k8sHost, gatewayPartialUpdateK8SAuthConfig.k8sHost) &&
        Objects.equals(this.k8sIssuer, gatewayPartialUpdateK8SAuthConfig.k8sIssuer) &&
        Objects.equals(this.name, gatewayPartialUpdateK8SAuthConfig.name) &&
        Objects.equals(this.newName, gatewayPartialUpdateK8SAuthConfig.newName) &&
        Objects.equals(this.rancherApiKey, gatewayPartialUpdateK8SAuthConfig.rancherApiKey) &&
        Objects.equals(this.rancherClusterId, gatewayPartialUpdateK8SAuthConfig.rancherClusterId) &&
        Objects.equals(this.signingKey, gatewayPartialUpdateK8SAuthConfig.signingKey) &&
        Objects.equals(this.token, gatewayPartialUpdateK8SAuthConfig.token) &&
        Objects.equals(this.tokenExp, gatewayPartialUpdateK8SAuthConfig.tokenExp) &&
        Objects.equals(this.tokenReviewerJwt, gatewayPartialUpdateK8SAuthConfig.tokenReviewerJwt) &&
        Objects.equals(this.uidToken, gatewayPartialUpdateK8SAuthConfig.uidToken) &&
        Objects.equals(this.useGwServiceAccount, gatewayPartialUpdateK8SAuthConfig.useGwServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultIdentityBool, accessId, disableIssuerValidation, json, k8sAuthType, k8sCaCert, k8sClientCertificate, k8sClientKey, k8sHost, k8sIssuer, name, newName, rancherApiKey, rancherClusterId, signingKey, token, tokenExp, tokenReviewerJwt, uidToken, useGwServiceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayPartialUpdateK8SAuthConfig {\n");
    sb.append("    useDefaultIdentityBool: ").append(toIndentedString(useDefaultIdentityBool)).append("\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    disableIssuerValidation: ").append(toIndentedString(disableIssuerValidation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sAuthType: ").append(toIndentedString(k8sAuthType)).append("\n");
    sb.append("    k8sCaCert: ").append(toIndentedString(k8sCaCert)).append("\n");
    sb.append("    k8sClientCertificate: ").append(toIndentedString(k8sClientCertificate)).append("\n");
    sb.append("    k8sClientKey: ").append(toIndentedString(k8sClientKey)).append("\n");
    sb.append("    k8sHost: ").append(toIndentedString(k8sHost)).append("\n");
    sb.append("    k8sIssuer: ").append(toIndentedString(k8sIssuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
