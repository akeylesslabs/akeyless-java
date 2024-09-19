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
 * targetCreateK8s is a command that creates a new k8s target
 */
@ApiModel(description = "targetCreateK8s is a command that creates a new k8s target")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetCreateK8s {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_AUTH_TYPE = "k8s-auth-type";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_TYPE)
  private String k8sAuthType = "token";

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE = "k8s-client-certificate";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE)
  private String k8sClientCertificate;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY = "k8s-client-key";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY)
  private String k8sClientKey;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_CA_CERT = "k8s-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_CA_CERT)
  private String k8sClusterCaCert = "dummy_val";

  public static final String SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT = "k8s-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_ENDPOINT)
  private String k8sClusterEndpoint = "dummy_val";

  public static final String SERIALIZED_NAME_K8S_CLUSTER_NAME = "k8s-cluster-name";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_NAME)
  private String k8sClusterName;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_TOKEN = "k8s-cluster-token";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_TOKEN)
  private String k8sClusterToken = "dummy_val";

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT = "use-gw-service-account";
  @SerializedName(SERIALIZED_NAME_USE_GW_SERVICE_ACCOUNT)
  private Boolean useGwServiceAccount;

  public TargetCreateK8s() { 
  }

  public TargetCreateK8s description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TargetCreateK8s json(Boolean json) {
    
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


  public TargetCreateK8s k8sAuthType(String k8sAuthType) {
    
    this.k8sAuthType = k8sAuthType;
    return this;
  }

   /**
   * K8S auth type [token/certificate]
   * @return k8sAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8S auth type [token/certificate]")

  public String getK8sAuthType() {
    return k8sAuthType;
  }


  public void setK8sAuthType(String k8sAuthType) {
    this.k8sAuthType = k8sAuthType;
  }


  public TargetCreateK8s k8sClientCertificate(String k8sClientCertificate) {
    
    this.k8sClientCertificate = k8sClientCertificate;
    return this;
  }

   /**
   * Content of the k8 client certificate (PEM format) in a Base64 format
   * @return k8sClientCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of the k8 client certificate (PEM format) in a Base64 format")

  public String getK8sClientCertificate() {
    return k8sClientCertificate;
  }


  public void setK8sClientCertificate(String k8sClientCertificate) {
    this.k8sClientCertificate = k8sClientCertificate;
  }


  public TargetCreateK8s k8sClientKey(String k8sClientKey) {
    
    this.k8sClientKey = k8sClientKey;
    return this;
  }

   /**
   * Content of the k8 client private key (PEM format) in a Base64 format
   * @return k8sClientKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of the k8 client private key (PEM format) in a Base64 format")

  public String getK8sClientKey() {
    return k8sClientKey;
  }


  public void setK8sClientKey(String k8sClientKey) {
    this.k8sClientKey = k8sClientKey;
  }


  public TargetCreateK8s k8sClusterCaCert(String k8sClusterCaCert) {
    
    this.k8sClusterCaCert = k8sClusterCaCert;
    return this;
  }

   /**
   * K8S cluster CA certificate
   * @return k8sClusterCaCert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "K8S cluster CA certificate")

  public String getK8sClusterCaCert() {
    return k8sClusterCaCert;
  }


  public void setK8sClusterCaCert(String k8sClusterCaCert) {
    this.k8sClusterCaCert = k8sClusterCaCert;
  }


  public TargetCreateK8s k8sClusterEndpoint(String k8sClusterEndpoint) {
    
    this.k8sClusterEndpoint = k8sClusterEndpoint;
    return this;
  }

   /**
   * K8S cluster URL endpoint
   * @return k8sClusterEndpoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "K8S cluster URL endpoint")

  public String getK8sClusterEndpoint() {
    return k8sClusterEndpoint;
  }


  public void setK8sClusterEndpoint(String k8sClusterEndpoint) {
    this.k8sClusterEndpoint = k8sClusterEndpoint;
  }


  public TargetCreateK8s k8sClusterName(String k8sClusterName) {
    
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


  public TargetCreateK8s k8sClusterToken(String k8sClusterToken) {
    
    this.k8sClusterToken = k8sClusterToken;
    return this;
  }

   /**
   * K8S cluster Bearer token
   * @return k8sClusterToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "K8S cluster Bearer token")

  public String getK8sClusterToken() {
    return k8sClusterToken;
  }


  public void setK8sClusterToken(String k8sClusterToken) {
    this.k8sClusterToken = k8sClusterToken;
  }


  public TargetCreateK8s key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TargetCreateK8s maxVersions(String maxVersions) {
    
    this.maxVersions = maxVersions;
    return this;
  }

   /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the maximum number of versions, limited by the account settings defaults.")

  public String getMaxVersions() {
    return maxVersions;
  }


  public void setMaxVersions(String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public TargetCreateK8s name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TargetCreateK8s token(String token) {
    
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


  public TargetCreateK8s uidToken(String uidToken) {
    
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


  public TargetCreateK8s useGwServiceAccount(Boolean useGwServiceAccount) {
    
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
    TargetCreateK8s targetCreateK8s = (TargetCreateK8s) o;
    return Objects.equals(this.description, targetCreateK8s.description) &&
        Objects.equals(this.json, targetCreateK8s.json) &&
        Objects.equals(this.k8sAuthType, targetCreateK8s.k8sAuthType) &&
        Objects.equals(this.k8sClientCertificate, targetCreateK8s.k8sClientCertificate) &&
        Objects.equals(this.k8sClientKey, targetCreateK8s.k8sClientKey) &&
        Objects.equals(this.k8sClusterCaCert, targetCreateK8s.k8sClusterCaCert) &&
        Objects.equals(this.k8sClusterEndpoint, targetCreateK8s.k8sClusterEndpoint) &&
        Objects.equals(this.k8sClusterName, targetCreateK8s.k8sClusterName) &&
        Objects.equals(this.k8sClusterToken, targetCreateK8s.k8sClusterToken) &&
        Objects.equals(this.key, targetCreateK8s.key) &&
        Objects.equals(this.maxVersions, targetCreateK8s.maxVersions) &&
        Objects.equals(this.name, targetCreateK8s.name) &&
        Objects.equals(this.token, targetCreateK8s.token) &&
        Objects.equals(this.uidToken, targetCreateK8s.uidToken) &&
        Objects.equals(this.useGwServiceAccount, targetCreateK8s.useGwServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, json, k8sAuthType, k8sClientCertificate, k8sClientKey, k8sClusterCaCert, k8sClusterEndpoint, k8sClusterName, k8sClusterToken, key, maxVersions, name, token, uidToken, useGwServiceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateK8s {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sAuthType: ").append(toIndentedString(k8sAuthType)).append("\n");
    sb.append("    k8sClientCertificate: ").append(toIndentedString(k8sClientCertificate)).append("\n");
    sb.append("    k8sClientKey: ").append(toIndentedString(k8sClientKey)).append("\n");
    sb.append("    k8sClusterCaCert: ").append(toIndentedString(k8sClusterCaCert)).append("\n");
    sb.append("    k8sClusterEndpoint: ").append(toIndentedString(k8sClusterEndpoint)).append("\n");
    sb.append("    k8sClusterName: ").append(toIndentedString(k8sClusterName)).append("\n");
    sb.append("    k8sClusterToken: ").append(toIndentedString(k8sClusterToken)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
