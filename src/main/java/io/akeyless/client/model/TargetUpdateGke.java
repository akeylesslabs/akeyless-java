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
 * TargetUpdateGke
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetUpdateGke {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GKE_ACCOUNT_KEY = "gke-account-key";
  @SerializedName(SERIALIZED_NAME_GKE_ACCOUNT_KEY)
  private String gkeAccountKey;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_CERT = "gke-cluster-cert";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_CERT)
  private String gkeClusterCert;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT = "gke-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT)
  private String gkeClusterEndpoint;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_NAME = "gke-cluster-name";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_NAME)
  private String gkeClusterName;

  public static final String SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL = "gke-service-account-email";
  @SerializedName(SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL)
  private String gkeServiceAccountEmail;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;

  public TargetUpdateGke() { 
  }

  public TargetUpdateGke description(String description) {
    
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


  public TargetUpdateGke gkeAccountKey(String gkeAccountKey) {
    
    this.gkeAccountKey = gkeAccountKey;
    return this;
  }

   /**
   * GKE Service Account key file path
   * @return gkeAccountKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE Service Account key file path")

  public String getGkeAccountKey() {
    return gkeAccountKey;
  }


  public void setGkeAccountKey(String gkeAccountKey) {
    this.gkeAccountKey = gkeAccountKey;
  }


  public TargetUpdateGke gkeClusterCert(String gkeClusterCert) {
    
    this.gkeClusterCert = gkeClusterCert;
    return this;
  }

   /**
   * GKE cluster CA certificate
   * @return gkeClusterCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster CA certificate")

  public String getGkeClusterCert() {
    return gkeClusterCert;
  }


  public void setGkeClusterCert(String gkeClusterCert) {
    this.gkeClusterCert = gkeClusterCert;
  }


  public TargetUpdateGke gkeClusterEndpoint(String gkeClusterEndpoint) {
    
    this.gkeClusterEndpoint = gkeClusterEndpoint;
    return this;
  }

   /**
   * GKE cluster URL endpoint
   * @return gkeClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster URL endpoint")

  public String getGkeClusterEndpoint() {
    return gkeClusterEndpoint;
  }


  public void setGkeClusterEndpoint(String gkeClusterEndpoint) {
    this.gkeClusterEndpoint = gkeClusterEndpoint;
  }


  public TargetUpdateGke gkeClusterName(String gkeClusterName) {
    
    this.gkeClusterName = gkeClusterName;
    return this;
  }

   /**
   * GKE cluster name
   * @return gkeClusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster name")

  public String getGkeClusterName() {
    return gkeClusterName;
  }


  public void setGkeClusterName(String gkeClusterName) {
    this.gkeClusterName = gkeClusterName;
  }


  public TargetUpdateGke gkeServiceAccountEmail(String gkeServiceAccountEmail) {
    
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
    return this;
  }

   /**
   * GKE service account email
   * @return gkeServiceAccountEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE service account email")

  public String getGkeServiceAccountEmail() {
    return gkeServiceAccountEmail;
  }


  public void setGkeServiceAccountEmail(String gkeServiceAccountEmail) {
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
  }


  public TargetUpdateGke json(Boolean json) {
    
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


  public TargetUpdateGke keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to keep previous version [true/false]. If not set, use default according to account settings")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public TargetUpdateGke key(String key) {
    
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


  public TargetUpdateGke maxVersions(String maxVersions) {
    
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


  public TargetUpdateGke name(String name) {
    
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


  public TargetUpdateGke newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public TargetUpdateGke token(String token) {
    
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


  public TargetUpdateGke uidToken(String uidToken) {
    
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


  public TargetUpdateGke useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
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
    TargetUpdateGke targetUpdateGke = (TargetUpdateGke) o;
    return Objects.equals(this.description, targetUpdateGke.description) &&
        Objects.equals(this.gkeAccountKey, targetUpdateGke.gkeAccountKey) &&
        Objects.equals(this.gkeClusterCert, targetUpdateGke.gkeClusterCert) &&
        Objects.equals(this.gkeClusterEndpoint, targetUpdateGke.gkeClusterEndpoint) &&
        Objects.equals(this.gkeClusterName, targetUpdateGke.gkeClusterName) &&
        Objects.equals(this.gkeServiceAccountEmail, targetUpdateGke.gkeServiceAccountEmail) &&
        Objects.equals(this.json, targetUpdateGke.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateGke.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateGke.key) &&
        Objects.equals(this.maxVersions, targetUpdateGke.maxVersions) &&
        Objects.equals(this.name, targetUpdateGke.name) &&
        Objects.equals(this.newName, targetUpdateGke.newName) &&
        Objects.equals(this.token, targetUpdateGke.token) &&
        Objects.equals(this.uidToken, targetUpdateGke.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, targetUpdateGke.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gkeAccountKey, gkeClusterCert, gkeClusterEndpoint, gkeClusterName, gkeServiceAccountEmail, json, keepPrevVersion, key, maxVersions, name, newName, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateGke {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gkeAccountKey: ").append(toIndentedString(gkeAccountKey)).append("\n");
    sb.append("    gkeClusterCert: ").append(toIndentedString(gkeClusterCert)).append("\n");
    sb.append("    gkeClusterEndpoint: ").append(toIndentedString(gkeClusterEndpoint)).append("\n");
    sb.append("    gkeClusterName: ").append(toIndentedString(gkeClusterName)).append("\n");
    sb.append("    gkeServiceAccountEmail: ").append(toIndentedString(gkeServiceAccountEmail)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

