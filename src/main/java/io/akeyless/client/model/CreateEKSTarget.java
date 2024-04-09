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
 * CreateEKSTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateEKSTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EKS_ACCESS_KEY_ID = "eks-access-key-id";
  @SerializedName(SERIALIZED_NAME_EKS_ACCESS_KEY_ID)
  private String eksAccessKeyId;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_CA_CERT = "eks-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_CA_CERT)
  private String eksClusterCaCert;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT = "eks-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT)
  private String eksClusterEndpoint;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_NAME = "eks-cluster-name";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_NAME)
  private String eksClusterName;

  public static final String SERIALIZED_NAME_EKS_REGION = "eks-region";
  @SerializedName(SERIALIZED_NAME_EKS_REGION)
  private String eksRegion = "us-east-2";

  public static final String SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY = "eks-secret-access-key";
  @SerializedName(SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY)
  private String eksSecretAccessKey;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;

  public CreateEKSTarget() { 
  }

  public CreateEKSTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Deprecated - use description
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateEKSTarget description(String description) {
    
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


  public CreateEKSTarget eksAccessKeyId(String eksAccessKeyId) {
    
    this.eksAccessKeyId = eksAccessKeyId;
    return this;
  }

   /**
   * Access Key ID
   * @return eksAccessKeyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Access Key ID")

  public String getEksAccessKeyId() {
    return eksAccessKeyId;
  }


  public void setEksAccessKeyId(String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
  }


  public CreateEKSTarget eksClusterCaCert(String eksClusterCaCert) {
    
    this.eksClusterCaCert = eksClusterCaCert;
    return this;
  }

   /**
   * EKS cluster CA certificate
   * @return eksClusterCaCert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "EKS cluster CA certificate")

  public String getEksClusterCaCert() {
    return eksClusterCaCert;
  }


  public void setEksClusterCaCert(String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
  }


  public CreateEKSTarget eksClusterEndpoint(String eksClusterEndpoint) {
    
    this.eksClusterEndpoint = eksClusterEndpoint;
    return this;
  }

   /**
   * EKS cluster URL endpoint
   * @return eksClusterEndpoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "EKS cluster URL endpoint")

  public String getEksClusterEndpoint() {
    return eksClusterEndpoint;
  }


  public void setEksClusterEndpoint(String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
  }


  public CreateEKSTarget eksClusterName(String eksClusterName) {
    
    this.eksClusterName = eksClusterName;
    return this;
  }

   /**
   * EKS cluster name
   * @return eksClusterName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "EKS cluster name")

  public String getEksClusterName() {
    return eksClusterName;
  }


  public void setEksClusterName(String eksClusterName) {
    this.eksClusterName = eksClusterName;
  }


  public CreateEKSTarget eksRegion(String eksRegion) {
    
    this.eksRegion = eksRegion;
    return this;
  }

   /**
   * Region
   * @return eksRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region")

  public String getEksRegion() {
    return eksRegion;
  }


  public void setEksRegion(String eksRegion) {
    this.eksRegion = eksRegion;
  }


  public CreateEKSTarget eksSecretAccessKey(String eksSecretAccessKey) {
    
    this.eksSecretAccessKey = eksSecretAccessKey;
    return this;
  }

   /**
   * Secret Access Key
   * @return eksSecretAccessKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret Access Key")

  public String getEksSecretAccessKey() {
    return eksSecretAccessKey;
  }


  public void setEksSecretAccessKey(String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
  }


  public CreateEKSTarget json(Boolean json) {
    
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


  public CreateEKSTarget key(String key) {
    
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


  public CreateEKSTarget maxVersions(String maxVersions) {
    
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


  public CreateEKSTarget name(String name) {
    
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


  public CreateEKSTarget token(String token) {
    
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


  public CreateEKSTarget uidToken(String uidToken) {
    
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


  public CreateEKSTarget useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEKSTarget createEKSTarget = (CreateEKSTarget) o;
    return Objects.equals(this.comment, createEKSTarget.comment) &&
        Objects.equals(this.description, createEKSTarget.description) &&
        Objects.equals(this.eksAccessKeyId, createEKSTarget.eksAccessKeyId) &&
        Objects.equals(this.eksClusterCaCert, createEKSTarget.eksClusterCaCert) &&
        Objects.equals(this.eksClusterEndpoint, createEKSTarget.eksClusterEndpoint) &&
        Objects.equals(this.eksClusterName, createEKSTarget.eksClusterName) &&
        Objects.equals(this.eksRegion, createEKSTarget.eksRegion) &&
        Objects.equals(this.eksSecretAccessKey, createEKSTarget.eksSecretAccessKey) &&
        Objects.equals(this.json, createEKSTarget.json) &&
        Objects.equals(this.key, createEKSTarget.key) &&
        Objects.equals(this.maxVersions, createEKSTarget.maxVersions) &&
        Objects.equals(this.name, createEKSTarget.name) &&
        Objects.equals(this.token, createEKSTarget.token) &&
        Objects.equals(this.uidToken, createEKSTarget.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, createEKSTarget.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, description, eksAccessKeyId, eksClusterCaCert, eksClusterEndpoint, eksClusterName, eksRegion, eksSecretAccessKey, json, key, maxVersions, name, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEKSTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eksAccessKeyId: ").append(toIndentedString(eksAccessKeyId)).append("\n");
    sb.append("    eksClusterCaCert: ").append(toIndentedString(eksClusterCaCert)).append("\n");
    sb.append("    eksClusterEndpoint: ").append(toIndentedString(eksClusterEndpoint)).append("\n");
    sb.append("    eksClusterName: ").append(toIndentedString(eksClusterName)).append("\n");
    sb.append("    eksRegion: ").append(toIndentedString(eksRegion)).append("\n");
    sb.append("    eksSecretAccessKey: ").append(toIndentedString(eksSecretAccessKey)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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

