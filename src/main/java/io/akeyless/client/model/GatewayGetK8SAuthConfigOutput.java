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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * GatewayGetK8SAuthConfigOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayGetK8SAuthConfigOutput {
  public static final String SERIALIZED_NAME_AM_TOKEN_EXPIRATION = "am_token_expiration";
  @SerializedName(SERIALIZED_NAME_AM_TOKEN_EXPIRATION)
  @javax.annotation.Nullable
  private Long amTokenExpiration;

  public static final String SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID = "auth_method_access_id";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID)
  @javax.annotation.Nullable
  private String authMethodAccessId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_PRV_KEY_PEM = "auth_method_prv_key_pem";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_PRV_KEY_PEM)
  @javax.annotation.Nullable
  private String authMethodPrvKeyPem;

  public static final String SERIALIZED_NAME_CLUSTER_API_TYPE = "cluster_api_type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_API_TYPE)
  @javax.annotation.Nullable
  private String clusterApiType;

  public static final String SERIALIZED_NAME_DISABLE_ISS_VALIDATION = "disable_iss_validation";
  @SerializedName(SERIALIZED_NAME_DISABLE_ISS_VALIDATION)
  @javax.annotation.Nullable
  private Boolean disableIssValidation;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_K8S_AUTH_TYPE = "k8s_auth_type";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_TYPE)
  @javax.annotation.Nullable
  private String k8sAuthType;

  public static final String SERIALIZED_NAME_K8S_CA_CERT = "k8s_ca_cert";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERT)
  @javax.annotation.Nullable
  private String k8sCaCert;

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERT_DATA = "k8s_client_cert_data";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERT_DATA)
  @javax.annotation.Nullable
  private String k8sClientCertData;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY_DATA = "k8s_client_key_data";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY_DATA)
  @javax.annotation.Nullable
  private String k8sClientKeyData;

  public static final String SERIALIZED_NAME_K8S_HOST = "k8s_host";
  @SerializedName(SERIALIZED_NAME_K8S_HOST)
  @javax.annotation.Nullable
  private String k8sHost;

  public static final String SERIALIZED_NAME_K8S_ISSUER = "k8s_issuer";
  @SerializedName(SERIALIZED_NAME_K8S_ISSUER)
  @javax.annotation.Nullable
  private String k8sIssuer;

  public static final String SERIALIZED_NAME_K8S_PUB_KEYS_PEM = "k8s_pub_keys_pem";
  @SerializedName(SERIALIZED_NAME_K8S_PUB_KEYS_PEM)
  @javax.annotation.Nullable
  private List<String> k8sPubKeysPem = new ArrayList<>();

  public static final String SERIALIZED_NAME_K8S_TOKEN_REVIEWER_JWT = "k8s_token_reviewer_jwt";
  @SerializedName(SERIALIZED_NAME_K8S_TOKEN_REVIEWER_JWT)
  @javax.annotation.Nullable
  private String k8sTokenReviewerJwt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  @javax.annotation.Nullable
  private String protectionKey;

  public static final String SERIALIZED_NAME_RANCHER_API_KEY = "rancher_api_key";
  @SerializedName(SERIALIZED_NAME_RANCHER_API_KEY)
  @javax.annotation.Nullable
  private String rancherApiKey;

  public static final String SERIALIZED_NAME_RANCHER_CLUSTER_ID = "rancher_cluster_id";
  @SerializedName(SERIALIZED_NAME_RANCHER_CLUSTER_ID)
  @javax.annotation.Nullable
  private String rancherClusterId;

  public static final String SERIALIZED_NAME_USE_LOCAL_CA_JWT = "use_local_ca_jwt";
  @SerializedName(SERIALIZED_NAME_USE_LOCAL_CA_JWT)
  @javax.annotation.Nullable
  private Boolean useLocalCaJwt;

  public GatewayGetK8SAuthConfigOutput() {
  }

  public GatewayGetK8SAuthConfigOutput amTokenExpiration(@javax.annotation.Nullable Long amTokenExpiration) {
    this.amTokenExpiration = amTokenExpiration;
    return this;
  }

  /**
   * AuthMethodTokenExpiration is time in seconds of expiration of the Akeyless Kube Auth Method token
   * @return amTokenExpiration
   */
  @javax.annotation.Nullable
  public Long getAmTokenExpiration() {
    return amTokenExpiration;
  }

  public void setAmTokenExpiration(@javax.annotation.Nullable Long amTokenExpiration) {
    this.amTokenExpiration = amTokenExpiration;
  }


  public GatewayGetK8SAuthConfigOutput authMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
    return this;
  }

  /**
   * AuthMethodAccessId of the Kubernetes auth method
   * @return authMethodAccessId
   */
  @javax.annotation.Nullable
  public String getAuthMethodAccessId() {
    return authMethodAccessId;
  }

  public void setAuthMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
  }


  public GatewayGetK8SAuthConfigOutput authMethodPrvKeyPem(@javax.annotation.Nullable String authMethodPrvKeyPem) {
    this.authMethodPrvKeyPem = authMethodPrvKeyPem;
    return this;
  }

  /**
   * AuthMethodSigningKey is the private key (in base64 of the PEM format) associated with the public key defined in the Kubernetes auth method, that used to sign the internal token for the Akeyless Kubernetes Auth Method
   * @return authMethodPrvKeyPem
   */
  @javax.annotation.Nullable
  public String getAuthMethodPrvKeyPem() {
    return authMethodPrvKeyPem;
  }

  public void setAuthMethodPrvKeyPem(@javax.annotation.Nullable String authMethodPrvKeyPem) {
    this.authMethodPrvKeyPem = authMethodPrvKeyPem;
  }


  public GatewayGetK8SAuthConfigOutput clusterApiType(@javax.annotation.Nullable String clusterApiType) {
    this.clusterApiType = clusterApiType;
    return this;
  }

  /**
   * ClusterApiType defines types of API access to cluster
   * @return clusterApiType
   */
  @javax.annotation.Nullable
  public String getClusterApiType() {
    return clusterApiType;
  }

  public void setClusterApiType(@javax.annotation.Nullable String clusterApiType) {
    this.clusterApiType = clusterApiType;
  }


  public GatewayGetK8SAuthConfigOutput disableIssValidation(@javax.annotation.Nullable Boolean disableIssValidation) {
    this.disableIssValidation = disableIssValidation;
    return this;
  }

  /**
   * DisableISSValidation is optional parameter to disable ISS validation
   * @return disableIssValidation
   */
  @javax.annotation.Nullable
  public Boolean getDisableIssValidation() {
    return disableIssValidation;
  }

  public void setDisableIssValidation(@javax.annotation.Nullable Boolean disableIssValidation) {
    this.disableIssValidation = disableIssValidation;
  }


  public GatewayGetK8SAuthConfigOutput id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GatewayGetK8SAuthConfigOutput k8sAuthType(@javax.annotation.Nullable String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
    return this;
  }

  /**
   * Get k8sAuthType
   * @return k8sAuthType
   */
  @javax.annotation.Nullable
  public String getK8sAuthType() {
    return k8sAuthType;
  }

  public void setK8sAuthType(@javax.annotation.Nullable String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
  }


  public GatewayGetK8SAuthConfigOutput k8sCaCert(@javax.annotation.Nullable String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
    return this;
  }

  /**
   * K8SCACert is the CA Cert to use to call into the kubernetes API
   * @return k8sCaCert
   */
  @javax.annotation.Nullable
  public String getK8sCaCert() {
    return k8sCaCert;
  }

  public void setK8sCaCert(@javax.annotation.Nullable String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
  }


  public GatewayGetK8SAuthConfigOutput k8sClientCertData(@javax.annotation.Nullable String k8sClientCertData) {
    this.k8sClientCertData = k8sClientCertData;
    return this;
  }

  /**
   * K8sClientCertData is the client certificate for k8s client certificate authentication
   * @return k8sClientCertData
   */
  @javax.annotation.Nullable
  public String getK8sClientCertData() {
    return k8sClientCertData;
  }

  public void setK8sClientCertData(@javax.annotation.Nullable String k8sClientCertData) {
    this.k8sClientCertData = k8sClientCertData;
  }


  public GatewayGetK8SAuthConfigOutput k8sClientKeyData(@javax.annotation.Nullable String k8sClientKeyData) {
    this.k8sClientKeyData = k8sClientKeyData;
    return this;
  }

  /**
   * K8sClientKeyData is the client key for k8s client certificate authentication
   * @return k8sClientKeyData
   */
  @javax.annotation.Nullable
  public String getK8sClientKeyData() {
    return k8sClientKeyData;
  }

  public void setK8sClientKeyData(@javax.annotation.Nullable String k8sClientKeyData) {
    this.k8sClientKeyData = k8sClientKeyData;
  }


  public GatewayGetK8SAuthConfigOutput k8sHost(@javax.annotation.Nullable String k8sHost) {
    this.k8sHost = k8sHost;
    return this;
  }

  /**
   * K8SHost is the url string for the kubernetes API
   * @return k8sHost
   */
  @javax.annotation.Nullable
  public String getK8sHost() {
    return k8sHost;
  }

  public void setK8sHost(@javax.annotation.Nullable String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public GatewayGetK8SAuthConfigOutput k8sIssuer(@javax.annotation.Nullable String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
    return this;
  }

  /**
   * K8SIssuer is the claim that specifies who issued the Kubernetes token
   * @return k8sIssuer
   */
  @javax.annotation.Nullable
  public String getK8sIssuer() {
    return k8sIssuer;
  }

  public void setK8sIssuer(@javax.annotation.Nullable String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
  }


  public GatewayGetK8SAuthConfigOutput k8sPubKeysPem(@javax.annotation.Nullable List<String> k8sPubKeysPem) {
    this.k8sPubKeysPem = k8sPubKeysPem;
    return this;
  }

  public GatewayGetK8SAuthConfigOutput addK8sPubKeysPemItem(String k8sPubKeysPemItem) {
    if (this.k8sPubKeysPem == null) {
      this.k8sPubKeysPem = new ArrayList<>();
    }
    this.k8sPubKeysPem.add(k8sPubKeysPemItem);
    return this;
  }

  /**
   * K8SPublicKeysPEM is the list of public key in PEM format
   * @return k8sPubKeysPem
   */
  @javax.annotation.Nullable
  public List<String> getK8sPubKeysPem() {
    return k8sPubKeysPem;
  }

  public void setK8sPubKeysPem(@javax.annotation.Nullable List<String> k8sPubKeysPem) {
    this.k8sPubKeysPem = k8sPubKeysPem;
  }


  public GatewayGetK8SAuthConfigOutput k8sTokenReviewerJwt(@javax.annotation.Nullable String k8sTokenReviewerJwt) {
    this.k8sTokenReviewerJwt = k8sTokenReviewerJwt;
    return this;
  }

  /**
   * K8STokenReviewerJWT is the bearer for clusterApiTypeK8s, used during TokenReview API call
   * @return k8sTokenReviewerJwt
   */
  @javax.annotation.Nullable
  public String getK8sTokenReviewerJwt() {
    return k8sTokenReviewerJwt;
  }

  public void setK8sTokenReviewerJwt(@javax.annotation.Nullable String k8sTokenReviewerJwt) {
    this.k8sTokenReviewerJwt = k8sTokenReviewerJwt;
  }


  public GatewayGetK8SAuthConfigOutput name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GatewayGetK8SAuthConfigOutput protectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
    return this;
  }

  /**
   * Get protectionKey
   * @return protectionKey
   */
  @javax.annotation.Nullable
  public String getProtectionKey() {
    return protectionKey;
  }

  public void setProtectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public GatewayGetK8SAuthConfigOutput rancherApiKey(@javax.annotation.Nullable String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
    return this;
  }

  /**
   * RancherApiKey the bear token for clusterApiTypeRancher
   * @return rancherApiKey
   */
  @javax.annotation.Nullable
  public String getRancherApiKey() {
    return rancherApiKey;
  }

  public void setRancherApiKey(@javax.annotation.Nullable String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
  }


  public GatewayGetK8SAuthConfigOutput rancherClusterId(@javax.annotation.Nullable String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
    return this;
  }

  /**
   * RancherClusterId cluster id as define in rancher (in case of clusterApiTypeRancher)
   * @return rancherClusterId
   */
  @javax.annotation.Nullable
  public String getRancherClusterId() {
    return rancherClusterId;
  }

  public void setRancherClusterId(@javax.annotation.Nullable String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
  }


  public GatewayGetK8SAuthConfigOutput useLocalCaJwt(@javax.annotation.Nullable Boolean useLocalCaJwt) {
    this.useLocalCaJwt = useLocalCaJwt;
    return this;
  }

  /**
   * UseLocalCAJwt is an optional parameter to set defaulting to using the local service account when running in a Kubernetes pod
   * @return useLocalCaJwt
   */
  @javax.annotation.Nullable
  public Boolean getUseLocalCaJwt() {
    return useLocalCaJwt;
  }

  public void setUseLocalCaJwt(@javax.annotation.Nullable Boolean useLocalCaJwt) {
    this.useLocalCaJwt = useLocalCaJwt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayGetK8SAuthConfigOutput gatewayGetK8SAuthConfigOutput = (GatewayGetK8SAuthConfigOutput) o;
    return Objects.equals(this.amTokenExpiration, gatewayGetK8SAuthConfigOutput.amTokenExpiration) &&
        Objects.equals(this.authMethodAccessId, gatewayGetK8SAuthConfigOutput.authMethodAccessId) &&
        Objects.equals(this.authMethodPrvKeyPem, gatewayGetK8SAuthConfigOutput.authMethodPrvKeyPem) &&
        Objects.equals(this.clusterApiType, gatewayGetK8SAuthConfigOutput.clusterApiType) &&
        Objects.equals(this.disableIssValidation, gatewayGetK8SAuthConfigOutput.disableIssValidation) &&
        Objects.equals(this.id, gatewayGetK8SAuthConfigOutput.id) &&
        Objects.equals(this.k8sAuthType, gatewayGetK8SAuthConfigOutput.k8sAuthType) &&
        Objects.equals(this.k8sCaCert, gatewayGetK8SAuthConfigOutput.k8sCaCert) &&
        Objects.equals(this.k8sClientCertData, gatewayGetK8SAuthConfigOutput.k8sClientCertData) &&
        Objects.equals(this.k8sClientKeyData, gatewayGetK8SAuthConfigOutput.k8sClientKeyData) &&
        Objects.equals(this.k8sHost, gatewayGetK8SAuthConfigOutput.k8sHost) &&
        Objects.equals(this.k8sIssuer, gatewayGetK8SAuthConfigOutput.k8sIssuer) &&
        Objects.equals(this.k8sPubKeysPem, gatewayGetK8SAuthConfigOutput.k8sPubKeysPem) &&
        Objects.equals(this.k8sTokenReviewerJwt, gatewayGetK8SAuthConfigOutput.k8sTokenReviewerJwt) &&
        Objects.equals(this.name, gatewayGetK8SAuthConfigOutput.name) &&
        Objects.equals(this.protectionKey, gatewayGetK8SAuthConfigOutput.protectionKey) &&
        Objects.equals(this.rancherApiKey, gatewayGetK8SAuthConfigOutput.rancherApiKey) &&
        Objects.equals(this.rancherClusterId, gatewayGetK8SAuthConfigOutput.rancherClusterId) &&
        Objects.equals(this.useLocalCaJwt, gatewayGetK8SAuthConfigOutput.useLocalCaJwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amTokenExpiration, authMethodAccessId, authMethodPrvKeyPem, clusterApiType, disableIssValidation, id, k8sAuthType, k8sCaCert, k8sClientCertData, k8sClientKeyData, k8sHost, k8sIssuer, k8sPubKeysPem, k8sTokenReviewerJwt, name, protectionKey, rancherApiKey, rancherClusterId, useLocalCaJwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayGetK8SAuthConfigOutput {\n");
    sb.append("    amTokenExpiration: ").append(toIndentedString(amTokenExpiration)).append("\n");
    sb.append("    authMethodAccessId: ").append(toIndentedString(authMethodAccessId)).append("\n");
    sb.append("    authMethodPrvKeyPem: ").append(toIndentedString(authMethodPrvKeyPem)).append("\n");
    sb.append("    clusterApiType: ").append(toIndentedString(clusterApiType)).append("\n");
    sb.append("    disableIssValidation: ").append(toIndentedString(disableIssValidation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    k8sAuthType: ").append(toIndentedString(k8sAuthType)).append("\n");
    sb.append("    k8sCaCert: ").append(toIndentedString(k8sCaCert)).append("\n");
    sb.append("    k8sClientCertData: ").append(toIndentedString(k8sClientCertData)).append("\n");
    sb.append("    k8sClientKeyData: ").append(toIndentedString(k8sClientKeyData)).append("\n");
    sb.append("    k8sHost: ").append(toIndentedString(k8sHost)).append("\n");
    sb.append("    k8sIssuer: ").append(toIndentedString(k8sIssuer)).append("\n");
    sb.append("    k8sPubKeysPem: ").append(toIndentedString(k8sPubKeysPem)).append("\n");
    sb.append("    k8sTokenReviewerJwt: ").append(toIndentedString(k8sTokenReviewerJwt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    rancherApiKey: ").append(toIndentedString(rancherApiKey)).append("\n");
    sb.append("    rancherClusterId: ").append(toIndentedString(rancherClusterId)).append("\n");
    sb.append("    useLocalCaJwt: ").append(toIndentedString(useLocalCaJwt)).append("\n");
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
    openapiFields.add("am_token_expiration");
    openapiFields.add("auth_method_access_id");
    openapiFields.add("auth_method_prv_key_pem");
    openapiFields.add("cluster_api_type");
    openapiFields.add("disable_iss_validation");
    openapiFields.add("id");
    openapiFields.add("k8s_auth_type");
    openapiFields.add("k8s_ca_cert");
    openapiFields.add("k8s_client_cert_data");
    openapiFields.add("k8s_client_key_data");
    openapiFields.add("k8s_host");
    openapiFields.add("k8s_issuer");
    openapiFields.add("k8s_pub_keys_pem");
    openapiFields.add("k8s_token_reviewer_jwt");
    openapiFields.add("name");
    openapiFields.add("protection_key");
    openapiFields.add("rancher_api_key");
    openapiFields.add("rancher_cluster_id");
    openapiFields.add("use_local_ca_jwt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayGetK8SAuthConfigOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayGetK8SAuthConfigOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayGetK8SAuthConfigOutput is not found in the empty JSON string", GatewayGetK8SAuthConfigOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayGetK8SAuthConfigOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayGetK8SAuthConfigOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth_method_access_id") != null && !jsonObj.get("auth_method_access_id").isJsonNull()) && !jsonObj.get("auth_method_access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_access_id").toString()));
      }
      if ((jsonObj.get("auth_method_prv_key_pem") != null && !jsonObj.get("auth_method_prv_key_pem").isJsonNull()) && !jsonObj.get("auth_method_prv_key_pem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_prv_key_pem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_prv_key_pem").toString()));
      }
      if ((jsonObj.get("cluster_api_type") != null && !jsonObj.get("cluster_api_type").isJsonNull()) && !jsonObj.get("cluster_api_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_api_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_api_type").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("k8s_auth_type") != null && !jsonObj.get("k8s_auth_type").isJsonNull()) && !jsonObj.get("k8s_auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_auth_type").toString()));
      }
      if ((jsonObj.get("k8s_ca_cert") != null && !jsonObj.get("k8s_ca_cert").isJsonNull()) && !jsonObj.get("k8s_ca_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_ca_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_ca_cert").toString()));
      }
      if ((jsonObj.get("k8s_client_cert_data") != null && !jsonObj.get("k8s_client_cert_data").isJsonNull()) && !jsonObj.get("k8s_client_cert_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_client_cert_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_client_cert_data").toString()));
      }
      if ((jsonObj.get("k8s_client_key_data") != null && !jsonObj.get("k8s_client_key_data").isJsonNull()) && !jsonObj.get("k8s_client_key_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_client_key_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_client_key_data").toString()));
      }
      if ((jsonObj.get("k8s_host") != null && !jsonObj.get("k8s_host").isJsonNull()) && !jsonObj.get("k8s_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_host").toString()));
      }
      if ((jsonObj.get("k8s_issuer") != null && !jsonObj.get("k8s_issuer").isJsonNull()) && !jsonObj.get("k8s_issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_issuer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("k8s_pub_keys_pem") != null && !jsonObj.get("k8s_pub_keys_pem").isJsonNull() && !jsonObj.get("k8s_pub_keys_pem").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_pub_keys_pem` to be an array in the JSON string but got `%s`", jsonObj.get("k8s_pub_keys_pem").toString()));
      }
      if ((jsonObj.get("k8s_token_reviewer_jwt") != null && !jsonObj.get("k8s_token_reviewer_jwt").isJsonNull()) && !jsonObj.get("k8s_token_reviewer_jwt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `k8s_token_reviewer_jwt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("k8s_token_reviewer_jwt").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protection_key") != null && !jsonObj.get("protection_key").isJsonNull()) && !jsonObj.get("protection_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection_key").toString()));
      }
      if ((jsonObj.get("rancher_api_key") != null && !jsonObj.get("rancher_api_key").isJsonNull()) && !jsonObj.get("rancher_api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rancher_api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rancher_api_key").toString()));
      }
      if ((jsonObj.get("rancher_cluster_id") != null && !jsonObj.get("rancher_cluster_id").isJsonNull()) && !jsonObj.get("rancher_cluster_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rancher_cluster_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rancher_cluster_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayGetK8SAuthConfigOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayGetK8SAuthConfigOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayGetK8SAuthConfigOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayGetK8SAuthConfigOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayGetK8SAuthConfigOutput>() {
           @Override
           public void write(JsonWriter out, GatewayGetK8SAuthConfigOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayGetK8SAuthConfigOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayGetK8SAuthConfigOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayGetK8SAuthConfigOutput
   * @throws IOException if the JSON string is invalid with respect to GatewayGetK8SAuthConfigOutput
   */
  public static GatewayGetK8SAuthConfigOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayGetK8SAuthConfigOutput.class);
  }

  /**
   * Convert an instance of GatewayGetK8SAuthConfigOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

