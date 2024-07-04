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
 * K8SAuth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class K8SAuth {
  public static final String SERIALIZED_NAME_AM_TOKEN_EXPIRATION = "am_token_expiration";
  @SerializedName(SERIALIZED_NAME_AM_TOKEN_EXPIRATION)
  private Long amTokenExpiration;

  public static final String SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID = "auth_method_access_id";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID)
  private String authMethodAccessId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_PRV_KEY_PEM = "auth_method_prv_key_pem";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_PRV_KEY_PEM)
  private String authMethodPrvKeyPem;

  public static final String SERIALIZED_NAME_CLUSTER_API_TYPE = "cluster_api_type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_API_TYPE)
  private String clusterApiType;

  public static final String SERIALIZED_NAME_DISABLE_ISS_VALIDATION = "disable_iss_validation";
  @SerializedName(SERIALIZED_NAME_DISABLE_ISS_VALIDATION)
  private Boolean disableIssValidation;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_K8S_AUTH_TYPE = "k8s_auth_type";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_TYPE)
  private String k8sAuthType;

  public static final String SERIALIZED_NAME_K8S_CA_CERT = "k8s_ca_cert";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERT)
  private String k8sCaCert;

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERT_DATA = "k8s_client_cert_data";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERT_DATA)
  private String k8sClientCertData;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY_DATA = "k8s_client_key_data";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY_DATA)
  private String k8sClientKeyData;

  public static final String SERIALIZED_NAME_K8S_HOST = "k8s_host";
  @SerializedName(SERIALIZED_NAME_K8S_HOST)
  private String k8sHost;

  public static final String SERIALIZED_NAME_K8S_ISSUER = "k8s_issuer";
  @SerializedName(SERIALIZED_NAME_K8S_ISSUER)
  private String k8sIssuer;

  public static final String SERIALIZED_NAME_K8S_PUB_KEYS_PEM = "k8s_pub_keys_pem";
  @SerializedName(SERIALIZED_NAME_K8S_PUB_KEYS_PEM)
  private List<String> k8sPubKeysPem = null;

  public static final String SERIALIZED_NAME_K8S_TOKEN_REVIEWER_JWT = "k8s_token_reviewer_jwt";
  @SerializedName(SERIALIZED_NAME_K8S_TOKEN_REVIEWER_JWT)
  private String k8sTokenReviewerJwt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RANCHER_API_KEY = "rancher_api_key";
  @SerializedName(SERIALIZED_NAME_RANCHER_API_KEY)
  private String rancherApiKey;

  public static final String SERIALIZED_NAME_RANCHER_CLUSTER_ID = "rancher_cluster_id";
  @SerializedName(SERIALIZED_NAME_RANCHER_CLUSTER_ID)
  private String rancherClusterId;

  public static final String SERIALIZED_NAME_USE_LOCAL_CA_JWT = "use_local_ca_jwt";
  @SerializedName(SERIALIZED_NAME_USE_LOCAL_CA_JWT)
  private Boolean useLocalCaJwt;

  public K8SAuth() { 
  }

  public K8SAuth amTokenExpiration(Long amTokenExpiration) {
    
    this.amTokenExpiration = amTokenExpiration;
    return this;
  }

   /**
   * AuthMethodTokenExpiration is time in seconds of expiration of the Akeyless Kube Auth Method token
   * @return amTokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AuthMethodTokenExpiration is time in seconds of expiration of the Akeyless Kube Auth Method token")

  public Long getAmTokenExpiration() {
    return amTokenExpiration;
  }


  public void setAmTokenExpiration(Long amTokenExpiration) {
    this.amTokenExpiration = amTokenExpiration;
  }


  public K8SAuth authMethodAccessId(String authMethodAccessId) {
    
    this.authMethodAccessId = authMethodAccessId;
    return this;
  }

   /**
   * AuthMethodAccessId of the Kubernetes auth method
   * @return authMethodAccessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AuthMethodAccessId of the Kubernetes auth method")

  public String getAuthMethodAccessId() {
    return authMethodAccessId;
  }


  public void setAuthMethodAccessId(String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
  }


  public K8SAuth authMethodPrvKeyPem(String authMethodPrvKeyPem) {
    
    this.authMethodPrvKeyPem = authMethodPrvKeyPem;
    return this;
  }

   /**
   * AuthMethodSigningKey is the private key (in base64 of the PEM format) associated with the public key defined in the Kubernetes auth method, that used to sign the internal token for the Akeyless Kubernetes Auth Method
   * @return authMethodPrvKeyPem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AuthMethodSigningKey is the private key (in base64 of the PEM format) associated with the public key defined in the Kubernetes auth method, that used to sign the internal token for the Akeyless Kubernetes Auth Method")

  public String getAuthMethodPrvKeyPem() {
    return authMethodPrvKeyPem;
  }


  public void setAuthMethodPrvKeyPem(String authMethodPrvKeyPem) {
    this.authMethodPrvKeyPem = authMethodPrvKeyPem;
  }


  public K8SAuth clusterApiType(String clusterApiType) {
    
    this.clusterApiType = clusterApiType;
    return this;
  }

   /**
   * ClusterApiType defines types of API access to cluster
   * @return clusterApiType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClusterApiType defines types of API access to cluster")

  public String getClusterApiType() {
    return clusterApiType;
  }


  public void setClusterApiType(String clusterApiType) {
    this.clusterApiType = clusterApiType;
  }


  public K8SAuth disableIssValidation(Boolean disableIssValidation) {
    
    this.disableIssValidation = disableIssValidation;
    return this;
  }

   /**
   * DisableISSValidation is optional parameter to disable ISS validation
   * @return disableIssValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DisableISSValidation is optional parameter to disable ISS validation")

  public Boolean getDisableIssValidation() {
    return disableIssValidation;
  }


  public void setDisableIssValidation(Boolean disableIssValidation) {
    this.disableIssValidation = disableIssValidation;
  }


  public K8SAuth id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public K8SAuth k8sAuthType(String k8sAuthType) {
    
    this.k8sAuthType = k8sAuthType;
    return this;
  }

   /**
   * Get k8sAuthType
   * @return k8sAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getK8sAuthType() {
    return k8sAuthType;
  }


  public void setK8sAuthType(String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
  }


  public K8SAuth k8sCaCert(String k8sCaCert) {
    
    this.k8sCaCert = k8sCaCert;
    return this;
  }

   /**
   * K8SCACert is the CA Cert to use to call into the kubernetes API
   * @return k8sCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8SCACert is the CA Cert to use to call into the kubernetes API")

  public String getK8sCaCert() {
    return k8sCaCert;
  }


  public void setK8sCaCert(String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
  }


  public K8SAuth k8sClientCertData(String k8sClientCertData) {
    
    this.k8sClientCertData = k8sClientCertData;
    return this;
  }

   /**
   * K8sClientCertData is the client certificate for k8s client certificate authentication
   * @return k8sClientCertData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8sClientCertData is the client certificate for k8s client certificate authentication")

  public String getK8sClientCertData() {
    return k8sClientCertData;
  }


  public void setK8sClientCertData(String k8sClientCertData) {
    this.k8sClientCertData = k8sClientCertData;
  }


  public K8SAuth k8sClientKeyData(String k8sClientKeyData) {
    
    this.k8sClientKeyData = k8sClientKeyData;
    return this;
  }

   /**
   * K8sClientKeyData is the client key for k8s client certificate authentication
   * @return k8sClientKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8sClientKeyData is the client key for k8s client certificate authentication")

  public String getK8sClientKeyData() {
    return k8sClientKeyData;
  }


  public void setK8sClientKeyData(String k8sClientKeyData) {
    this.k8sClientKeyData = k8sClientKeyData;
  }


  public K8SAuth k8sHost(String k8sHost) {
    
    this.k8sHost = k8sHost;
    return this;
  }

   /**
   * K8SHost is the url string for the kubernetes API
   * @return k8sHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8SHost is the url string for the kubernetes API")

  public String getK8sHost() {
    return k8sHost;
  }


  public void setK8sHost(String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public K8SAuth k8sIssuer(String k8sIssuer) {
    
    this.k8sIssuer = k8sIssuer;
    return this;
  }

   /**
   * K8SIssuer is the claim that specifies who issued the Kubernetes token
   * @return k8sIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8SIssuer is the claim that specifies who issued the Kubernetes token")

  public String getK8sIssuer() {
    return k8sIssuer;
  }


  public void setK8sIssuer(String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
  }


  public K8SAuth k8sPubKeysPem(List<String> k8sPubKeysPem) {
    
    this.k8sPubKeysPem = k8sPubKeysPem;
    return this;
  }

  public K8SAuth addK8sPubKeysPemItem(String k8sPubKeysPemItem) {
    if (this.k8sPubKeysPem == null) {
      this.k8sPubKeysPem = new ArrayList<String>();
    }
    this.k8sPubKeysPem.add(k8sPubKeysPemItem);
    return this;
  }

   /**
   * K8SPublicKeysPEM is the list of public key in PEM format
   * @return k8sPubKeysPem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8SPublicKeysPEM is the list of public key in PEM format")

  public List<String> getK8sPubKeysPem() {
    return k8sPubKeysPem;
  }


  public void setK8sPubKeysPem(List<String> k8sPubKeysPem) {
    this.k8sPubKeysPem = k8sPubKeysPem;
  }


  public K8SAuth k8sTokenReviewerJwt(String k8sTokenReviewerJwt) {
    
    this.k8sTokenReviewerJwt = k8sTokenReviewerJwt;
    return this;
  }

   /**
   * K8STokenReviewerJWT is the bearer for clusterApiTypeK8s, used during TokenReview API call
   * @return k8sTokenReviewerJwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8STokenReviewerJWT is the bearer for clusterApiTypeK8s, used during TokenReview API call")

  public String getK8sTokenReviewerJwt() {
    return k8sTokenReviewerJwt;
  }


  public void setK8sTokenReviewerJwt(String k8sTokenReviewerJwt) {
    this.k8sTokenReviewerJwt = k8sTokenReviewerJwt;
  }


  public K8SAuth name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public K8SAuth rancherApiKey(String rancherApiKey) {
    
    this.rancherApiKey = rancherApiKey;
    return this;
  }

   /**
   * RancherApiKey the bear token for clusterApiTypeRancher
   * @return rancherApiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RancherApiKey the bear token for clusterApiTypeRancher")

  public String getRancherApiKey() {
    return rancherApiKey;
  }


  public void setRancherApiKey(String rancherApiKey) {
    this.rancherApiKey = rancherApiKey;
  }


  public K8SAuth rancherClusterId(String rancherClusterId) {
    
    this.rancherClusterId = rancherClusterId;
    return this;
  }

   /**
   * RancherClusterId cluster id as define in rancher (in case of clusterApiTypeRancher)
   * @return rancherClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RancherClusterId cluster id as define in rancher (in case of clusterApiTypeRancher)")

  public String getRancherClusterId() {
    return rancherClusterId;
  }


  public void setRancherClusterId(String rancherClusterId) {
    this.rancherClusterId = rancherClusterId;
  }


  public K8SAuth useLocalCaJwt(Boolean useLocalCaJwt) {
    
    this.useLocalCaJwt = useLocalCaJwt;
    return this;
  }

   /**
   * UseLocalCAJwt is an optional parameter to set defaulting to using the local service account when running in a Kubernetes pod
   * @return useLocalCaJwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UseLocalCAJwt is an optional parameter to set defaulting to using the local service account when running in a Kubernetes pod")

  public Boolean getUseLocalCaJwt() {
    return useLocalCaJwt;
  }


  public void setUseLocalCaJwt(Boolean useLocalCaJwt) {
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
    K8SAuth k8SAuth = (K8SAuth) o;
    return Objects.equals(this.amTokenExpiration, k8SAuth.amTokenExpiration) &&
        Objects.equals(this.authMethodAccessId, k8SAuth.authMethodAccessId) &&
        Objects.equals(this.authMethodPrvKeyPem, k8SAuth.authMethodPrvKeyPem) &&
        Objects.equals(this.clusterApiType, k8SAuth.clusterApiType) &&
        Objects.equals(this.disableIssValidation, k8SAuth.disableIssValidation) &&
        Objects.equals(this.id, k8SAuth.id) &&
        Objects.equals(this.k8sAuthType, k8SAuth.k8sAuthType) &&
        Objects.equals(this.k8sCaCert, k8SAuth.k8sCaCert) &&
        Objects.equals(this.k8sClientCertData, k8SAuth.k8sClientCertData) &&
        Objects.equals(this.k8sClientKeyData, k8SAuth.k8sClientKeyData) &&
        Objects.equals(this.k8sHost, k8SAuth.k8sHost) &&
        Objects.equals(this.k8sIssuer, k8SAuth.k8sIssuer) &&
        Objects.equals(this.k8sPubKeysPem, k8SAuth.k8sPubKeysPem) &&
        Objects.equals(this.k8sTokenReviewerJwt, k8SAuth.k8sTokenReviewerJwt) &&
        Objects.equals(this.name, k8SAuth.name) &&
        Objects.equals(this.rancherApiKey, k8SAuth.rancherApiKey) &&
        Objects.equals(this.rancherClusterId, k8SAuth.rancherClusterId) &&
        Objects.equals(this.useLocalCaJwt, k8SAuth.useLocalCaJwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amTokenExpiration, authMethodAccessId, authMethodPrvKeyPem, clusterApiType, disableIssValidation, id, k8sAuthType, k8sCaCert, k8sClientCertData, k8sClientKeyData, k8sHost, k8sIssuer, k8sPubKeysPem, k8sTokenReviewerJwt, name, rancherApiKey, rancherClusterId, useLocalCaJwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SAuth {\n");
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

}

