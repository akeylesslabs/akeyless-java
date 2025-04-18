/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * gatewayUpdateK8SAuth is a command that updates k8s auth config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateK8SAuthConfig {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nonnull
  private String accessId;

  public static final String SERIALIZED_NAME_CLUSTER_API_TYPE = "cluster-api-type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_API_TYPE)
  @javax.annotation.Nullable
  private String clusterApiType = "native_k8s";

  public static final String SERIALIZED_NAME_DISABLE_ISSUER_VALIDATION = "disable-issuer-validation";
  @SerializedName(SERIALIZED_NAME_DISABLE_ISSUER_VALIDATION)
  @javax.annotation.Nullable
  private String disableIssuerValidation;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_AUTH_TYPE = "k8s-auth-type";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_TYPE)
  @javax.annotation.Nullable
  private String k8sAuthType = "token";

  public static final String SERIALIZED_NAME_K8S_CA_CERT = "k8s-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERT)
  @javax.annotation.Nullable
  private String k8sCaCert;

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE = "k8s-client-certificate";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE)
  @javax.annotation.Nullable
  private String k8sClientCertificate;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY = "k8s-client-key";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY)
  @javax.annotation.Nullable
  private String k8sClientKey;

  public static final String SERIALIZED_NAME_K8S_HOST = "k8s-host";
  @SerializedName(SERIALIZED_NAME_K8S_HOST)
  @javax.annotation.Nonnull
  private String k8sHost;

  public static final String SERIALIZED_NAME_K8S_ISSUER = "k8s-issuer";
  @SerializedName(SERIALIZED_NAME_K8S_ISSUER)
  @javax.annotation.Nullable
  private String k8sIssuer = "kubernetes/serviceaccount";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nonnull
  private String newName;

  public static final String SERIALIZED_NAME_RANCHER_API_KEY = "rancher-api-key";
  @SerializedName(SERIALIZED_NAME_RANCHER_API_KEY)
  @javax.annotation.Nullable
  private String rancherApiKey;

  public static final String SERIALIZED_NAME_RANCHER_CLUSTER_ID = "rancher-cluster-id";
  @SerializedName(SERIALIZED_NAME_RANCHER_CLUSTER_ID)
  @javax.annotation.Nullable
  private String rancherClusterId;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signing-key";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  @javax.annotation.Nonnull
  private String signingKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXP = "token-exp";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXP)
  @javax.annotation.Nullable
  private Long tokenExp = 300l;

  public static final String SERIALIZED_NAME_TOKEN_REVIEWER_JWT = "token-reviewer-jwt";
  @SerializedName(SERIALIZED_NAME_TOKEN_REVIEWER_JWT)
  @javax.annotation.Nullable
  private String tokenReviewerJwt;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT = "use-gw-service-account";
  @SerializedName(SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT)
  @javax.annotation.Nullable
  private Boolean useGwServiceAccount;

  public GatewayUpdateK8SAuthConfig() {
  }

  public GatewayUpdateK8SAuthConfig accessId(@javax.annotation.Nonnull String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * The access ID of the Kubernetes auth method
   * @return accessId
   */
  @javax.annotation.Nonnull
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nonnull String accessId) {
    this.accessId = accessId;
  }


  public GatewayUpdateK8SAuthConfig clusterApiType(@javax.annotation.Nullable String clusterApiType) {
    this.clusterApiType = clusterApiType;
    return this;
  }

  /**
   * Cluster access type. options: [native_k8s, rancher]
   * @return clusterApiType
   */
  @javax.annotation.Nullable
  public String getClusterApiType() {
    return clusterApiType;
  }

  public void setClusterApiType(@javax.annotation.Nullable String clusterApiType) {
    this.clusterApiType = clusterApiType;
  }


  public GatewayUpdateK8SAuthConfig disableIssuerValidation(@javax.annotation.Nullable String disableIssuerValidation) {
    this.disableIssuerValidation = disableIssuerValidation;
    return this;
  }

  /**
   * Disable issuer validation [true/false]
   * @return disableIssuerValidation
   */
  @javax.annotation.Nullable
  public String getDisableIssuerValidation() {
    return disableIssuerValidation;
  }

  public void setDisableIssuerValidation(@javax.annotation.Nullable String disableIssuerValidation) {
    this.disableIssuerValidation = disableIssuerValidation;
  }


  public GatewayUpdateK8SAuthConfig json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public GatewayUpdateK8SAuthConfig k8sAuthType(@javax.annotation.Nullable String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
    return this;
  }

  /**
   * K8S auth type [token/certificate]. (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sAuthType
   */
  @javax.annotation.Nullable
  public String getK8sAuthType() {
    return k8sAuthType;
  }

  public void setK8sAuthType(@javax.annotation.Nullable String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
  }


  public GatewayUpdateK8SAuthConfig k8sCaCert(@javax.annotation.Nullable String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
    return this;
  }

  /**
   * The CA Certificate (base64 encoded) to use to call into the kubernetes API server
   * @return k8sCaCert
   */
  @javax.annotation.Nullable
  public String getK8sCaCert() {
    return k8sCaCert;
  }

  public void setK8sCaCert(@javax.annotation.Nullable String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
  }


  public GatewayUpdateK8SAuthConfig k8sClientCertificate(@javax.annotation.Nullable String k8sClientCertificate) {
    this.k8sClientCertificate = k8sClientCertificate;
    return this;
  }

  /**
   * Content of the k8 client certificate (PEM format) in a Base64 format (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sClientCertificate
   */
  @javax.annotation.Nullable
  public String getK8sClientCertificate() {
    return k8sClientCertificate;
  }

  public void setK8sClientCertificate(@javax.annotation.Nullable String k8sClientCertificate) {
    this.k8sClientCertificate = k8sClientCertificate;
  }


  public GatewayUpdateK8SAuthConfig k8sClientKey(@javax.annotation.Nullable String k8sClientKey) {
    this.k8sClientKey = k8sClientKey;
    return this;
  }

  /**
   * Content of the k8 client private key (PEM format) in a Base64 format (relevant for \&quot;native_k8s\&quot; only)
   * @return k8sClientKey
   */
  @javax.annotation.Nullable
  public String getK8sClientKey() {
    return k8sClientKey;
  }

  public void setK8sClientKey(@javax.annotation.Nullable String k8sClientKey) {
    this.k8sClientKey = k8sClientKey;
  }


  public GatewayUpdateK8SAuthConfig k8sHost(@javax.annotation.Nonnull String k8sHost) {
    this.k8sHost = k8sHost;
    return this;
  }

  /**
   * The URL of the kubernetes API server
   * @return k8sHost
   */
  @javax.annotation.Nonnull
  public String getK8sHost() {
    return k8sHost;
  }

  public void setK8sHost(@javax.annotation.Nonnull String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public GatewayUpdateK8SAuthConfig k8sIssuer(@javax.annotation.Nullable String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
    return this;
  }

  /**
   * The Kubernetes JWT issuer name. K8SIssuer is the claim that specifies who issued the Kubernetes token
   * @return k8sIssuer
   */
  @javax.annotation.Nullable
  public String getK8sIssuer() {
    return k8sIssuer;
  }

  public void setK8sIssuer(@javax.annotation.Nullable String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
  }


  public GatewayUpdateK8SAuthConfig name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * K8S Auth config name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GatewayUpdateK8SAuthConfig newName(@javax.annotation.Nonnull String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * K8S Auth config new name
   * @return newName
   */
  @javax.annotation.Nonnull
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nonnull String newName) {
    this.newName = newName;
  }


  public GatewayUpdateK8SAuthConfig rancherApiKey(@javax.annotation.Nullable String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
    return this;
  }

  /**
   * The api key used to access the TokenReview API to validate other JWTs (relevant for \&quot;rancher\&quot; only)
   * @return rancherApiKey
   */
  @javax.annotation.Nullable
  public String getRancherApiKey() {
    return rancherApiKey;
  }

  public void setRancherApiKey(@javax.annotation.Nullable String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
  }


  public GatewayUpdateK8SAuthConfig rancherClusterId(@javax.annotation.Nullable String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
    return this;
  }

  /**
   * The cluster id as define in rancher (relevant for \&quot;rancher\&quot; only)
   * @return rancherClusterId
   */
  @javax.annotation.Nullable
  public String getRancherClusterId() {
    return rancherClusterId;
  }

  public void setRancherClusterId(@javax.annotation.Nullable String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
  }


  public GatewayUpdateK8SAuthConfig signingKey(@javax.annotation.Nonnull String signingKey) {
    this.signingKey = signingKey;
    return this;
  }

  /**
   * The private key (base64 encoded) associated with the public key defined in the Kubernetes auth
   * @return signingKey
   */
  @javax.annotation.Nonnull
  public String getSigningKey() {
    return signingKey;
  }

  public void setSigningKey(@javax.annotation.Nonnull String signingKey) {
    this.signingKey = signingKey;
  }


  public GatewayUpdateK8SAuthConfig token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public GatewayUpdateK8SAuthConfig tokenExp(@javax.annotation.Nullable Long tokenExp) {
    this.tokenExp = tokenExp;
    return this;
  }

  /**
   * Time in seconds of expiration of the Akeyless Kube Auth Method token
   * @return tokenExp
   */
  @javax.annotation.Nullable
  public Long getTokenExp() {
    return tokenExp;
  }

  public void setTokenExp(@javax.annotation.Nullable Long tokenExp) {
    this.tokenExp = tokenExp;
  }


  public GatewayUpdateK8SAuthConfig tokenReviewerJwt(@javax.annotation.Nullable String tokenReviewerJwt) {
    this.tokenReviewerJwt = tokenReviewerJwt;
    return this;
  }

  /**
   * A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs (relevant for \&quot;native_k8s\&quot; only). If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API.
   * @return tokenReviewerJwt
   */
  @javax.annotation.Nullable
  public String getTokenReviewerJwt() {
    return tokenReviewerJwt;
  }

  public void setTokenReviewerJwt(@javax.annotation.Nullable String tokenReviewerJwt) {
    this.tokenReviewerJwt = tokenReviewerJwt;
  }


  public GatewayUpdateK8SAuthConfig uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }


  public GatewayUpdateK8SAuthConfig useGwServiceAccount(@javax.annotation.Nullable Boolean useGwServiceAccount) {
    this.useGwServiceAccount = useGwServiceAccount;
    return this;
  }

  /**
   * Use the GW&#39;s service account
   * @return useGwServiceAccount
   */
  @javax.annotation.Nullable
  public Boolean getUseGwServiceAccount() {
    return useGwServiceAccount;
  }

  public void setUseGwServiceAccount(@javax.annotation.Nullable Boolean useGwServiceAccount) {
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
    GatewayUpdateK8SAuthConfig gatewayUpdateK8SAuthConfig = (GatewayUpdateK8SAuthConfig) o;
    return Objects.equals(this.accessId, gatewayUpdateK8SAuthConfig.accessId) &&
        Objects.equals(this.clusterApiType, gatewayUpdateK8SAuthConfig.clusterApiType) &&
        Objects.equals(this.disableIssuerValidation, gatewayUpdateK8SAuthConfig.disableIssuerValidation) &&
        Objects.equals(this.json, gatewayUpdateK8SAuthConfig.json) &&
        Objects.equals(this.k8sAuthType, gatewayUpdateK8SAuthConfig.k8sAuthType) &&
        Objects.equals(this.k8sCaCert, gatewayUpdateK8SAuthConfig.k8sCaCert) &&
        Objects.equals(this.k8sClientCertificate, gatewayUpdateK8SAuthConfig.k8sClientCertificate) &&
        Objects.equals(this.k8sClientKey, gatewayUpdateK8SAuthConfig.k8sClientKey) &&
        Objects.equals(this.k8sHost, gatewayUpdateK8SAuthConfig.k8sHost) &&
        Objects.equals(this.k8sIssuer, gatewayUpdateK8SAuthConfig.k8sIssuer) &&
        Objects.equals(this.name, gatewayUpdateK8SAuthConfig.name) &&
        Objects.equals(this.newName, gatewayUpdateK8SAuthConfig.newName) &&
        Objects.equals(this.rancherApiKey, gatewayUpdateK8SAuthConfig.rancherApiKey) &&
        Objects.equals(this.rancherClusterId, gatewayUpdateK8SAuthConfig.rancherClusterId) &&
        Objects.equals(this.signingKey, gatewayUpdateK8SAuthConfig.signingKey) &&
        Objects.equals(this.token, gatewayUpdateK8SAuthConfig.token) &&
        Objects.equals(this.tokenExp, gatewayUpdateK8SAuthConfig.tokenExp) &&
        Objects.equals(this.tokenReviewerJwt, gatewayUpdateK8SAuthConfig.tokenReviewerJwt) &&
        Objects.equals(this.uidToken, gatewayUpdateK8SAuthConfig.uidToken) &&
        Objects.equals(this.useGwServiceAccount, gatewayUpdateK8SAuthConfig.useGwServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, clusterApiType, disableIssuerValidation, json, k8sAuthType, k8sCaCert, k8sClientCertificate, k8sClientKey, k8sHost, k8sIssuer, name, newName, rancherApiKey, rancherClusterId, signingKey, token, tokenExp, tokenReviewerJwt, uidToken, useGwServiceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateK8SAuthConfig {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access-id");
    openapiFields.add("cluster-api-type");
    openapiFields.add("disable-issuer-validation");
    openapiFields.add("json");
    openapiFields.add("k8s-auth-type");
    openapiFields.add("k8s-ca-cert");
    openapiFields.add("k8s-client-certificate");
    openapiFields.add("k8s-client-key");
    openapiFields.add("k8s-host");
    openapiFields.add("k8s-issuer");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("rancher-api-key");
    openapiFields.add("rancher-cluster-id");
    openapiFields.add("signing-key");
    openapiFields.add("token");
    openapiFields.add("token-exp");
    openapiFields.add("token-reviewer-jwt");
    openapiFields.add("uid-token");
    openapiFields.add("use-gw-service-account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access-id");
    openapiRequiredFields.add("k8s-host");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("new-name");
    openapiRequiredFields.add("signing-key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateK8SAuthConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateK8SAuthConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateK8SAuthConfig is not found in the empty JSON string", GatewayUpdateK8SAuthConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateK8SAuthConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateK8SAuthConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayUpdateK8SAuthConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-id").toString()));
      }
      if ((jsonObj.get("cluster-api-type") != null && !jsonObj.get("cluster-api-type").isJsonNull()) && !jsonObj.get("cluster-api-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster-api-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster-api-type").toString()));
      }
      if ((jsonObj.get("disable-issuer-validation") != null && !jsonObj.get("disable-issuer-validation").isJsonNull()) && !jsonObj.get("disable-issuer-validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disable-issuer-validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disable-issuer-validation").toString()));
      }
      if ((jsonObj.get("k8s-auth-type") != null && !jsonObj.get("k8s-auth-type").isJsonNull()) && !jsonObj.get("k8s-auth-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-auth-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-auth-type").toString()));
      }
      if ((jsonObj.get("k8s-ca-cert") != null && !jsonObj.get("k8s-ca-cert").isJsonNull()) && !jsonObj.get("k8s-ca-cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-ca-cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-ca-cert").toString()));
      }
      if ((jsonObj.get("k8s-client-certificate") != null && !jsonObj.get("k8s-client-certificate").isJsonNull()) && !jsonObj.get("k8s-client-certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-client-certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-client-certificate").toString()));
      }
      if ((jsonObj.get("k8s-client-key") != null && !jsonObj.get("k8s-client-key").isJsonNull()) && !jsonObj.get("k8s-client-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-client-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-client-key").toString()));
      }
      if (!jsonObj.get("k8s-host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-host").toString()));
      }
      if ((jsonObj.get("k8s-issuer") != null && !jsonObj.get("k8s-issuer").isJsonNull()) && !jsonObj.get("k8s-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s-issuer").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("rancher-api-key") != null && !jsonObj.get("rancher-api-key").isJsonNull()) && !jsonObj.get("rancher-api-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rancher-api-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rancher-api-key").toString()));
      }
      if ((jsonObj.get("rancher-cluster-id") != null && !jsonObj.get("rancher-cluster-id").isJsonNull()) && !jsonObj.get("rancher-cluster-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rancher-cluster-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rancher-cluster-id").toString()));
      }
      if (!jsonObj.get("signing-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signing-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signing-key").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("token-reviewer-jwt") != null && !jsonObj.get("token-reviewer-jwt").isJsonNull()) && !jsonObj.get("token-reviewer-jwt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token-reviewer-jwt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token-reviewer-jwt").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayUpdateK8SAuthConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateK8SAuthConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateK8SAuthConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateK8SAuthConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateK8SAuthConfig>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateK8SAuthConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateK8SAuthConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateK8SAuthConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateK8SAuthConfig
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateK8SAuthConfig
   */
  public static GatewayUpdateK8SAuthConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateK8SAuthConfig.class);
  }

  /**
   * Convert an instance of GatewayUpdateK8SAuthConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

