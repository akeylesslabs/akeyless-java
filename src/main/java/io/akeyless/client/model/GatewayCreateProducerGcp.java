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
 * gatewayCreateProducerGcp is a command that creates a GCP producer
 */
@ApiModel(description = "gatewayCreateProducerGcp is a command that creates a GCP producer")

public class GatewayCreateProducerGcp {
  public static final String SERIALIZED_NAME_GCP_CRED_TYPE = "gcp-cred-type";
  @SerializedName(SERIALIZED_NAME_GCP_CRED_TYPE)
  private String gcpCredType;

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

  public static final String SERIALIZED_NAME_GCP_KEY_ALGO = "gcp-key-algo";
  @SerializedName(SERIALIZED_NAME_GCP_KEY_ALGO)
  private String gcpKeyAlgo;

  public static final String SERIALIZED_NAME_GCP_SA_EMAIL = "gcp-sa-email";
  @SerializedName(SERIALIZED_NAME_GCP_SA_EMAIL)
  private String gcpSaEmail;

  public static final String SERIALIZED_NAME_GCP_TOKEN_SCOPES = "gcp-token-scopes";
  @SerializedName(SERIALIZED_NAME_GCP_TOKEN_SCOPES)
  private String gcpTokenScopes;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

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


  public GatewayCreateProducerGcp gcpCredType(String gcpCredType) {
    
    this.gcpCredType = gcpCredType;
    return this;
  }

   /**
   * Get gcpCredType
   * @return gcpCredType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGcpCredType() {
    return gcpCredType;
  }


  public void setGcpCredType(String gcpCredType) {
    this.gcpCredType = gcpCredType;
  }


  public GatewayCreateProducerGcp gcpKey(String gcpKey) {
    
    this.gcpKey = gcpKey;
    return this;
  }

   /**
   * Base64-encoded service account private key text
   * @return gcpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded service account private key text")

  public String getGcpKey() {
    return gcpKey;
  }


  public void setGcpKey(String gcpKey) {
    this.gcpKey = gcpKey;
  }


  public GatewayCreateProducerGcp gcpKeyAlgo(String gcpKeyAlgo) {
    
    this.gcpKeyAlgo = gcpKeyAlgo;
    return this;
  }

   /**
   * Service account key algorithm, e.g. KEY_ALG_RSA_1024
   * @return gcpKeyAlgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service account key algorithm, e.g. KEY_ALG_RSA_1024")

  public String getGcpKeyAlgo() {
    return gcpKeyAlgo;
  }


  public void setGcpKeyAlgo(String gcpKeyAlgo) {
    this.gcpKeyAlgo = gcpKeyAlgo;
  }


  public GatewayCreateProducerGcp gcpSaEmail(String gcpSaEmail) {
    
    this.gcpSaEmail = gcpSaEmail;
    return this;
  }

   /**
   * GCP service account email
   * @return gcpSaEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GCP service account email")

  public String getGcpSaEmail() {
    return gcpSaEmail;
  }


  public void setGcpSaEmail(String gcpSaEmail) {
    this.gcpSaEmail = gcpSaEmail;
  }


  public GatewayCreateProducerGcp gcpTokenScopes(String gcpTokenScopes) {
    
    this.gcpTokenScopes = gcpTokenScopes;
    return this;
  }

   /**
   * Access token scopes list, e.g. scope1,scope2
   * @return gcpTokenScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access token scopes list, e.g. scope1,scope2")

  public String getGcpTokenScopes() {
    return gcpTokenScopes;
  }


  public void setGcpTokenScopes(String gcpTokenScopes) {
    this.gcpTokenScopes = gcpTokenScopes;
  }


  public GatewayCreateProducerGcp name(String name) {
    
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


  public GatewayCreateProducerGcp producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerGcp tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerGcp addTagsItem(String tagsItem) {
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


  public GatewayCreateProducerGcp targetName(String targetName) {
    
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


  public GatewayCreateProducerGcp token(String token) {
    
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


  public GatewayCreateProducerGcp uidToken(String uidToken) {
    
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


  public GatewayCreateProducerGcp userTtl(String userTtl) {
    
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
    GatewayCreateProducerGcp gatewayCreateProducerGcp = (GatewayCreateProducerGcp) o;
    return Objects.equals(this.gcpCredType, gatewayCreateProducerGcp.gcpCredType) &&
        Objects.equals(this.gcpKey, gatewayCreateProducerGcp.gcpKey) &&
        Objects.equals(this.gcpKeyAlgo, gatewayCreateProducerGcp.gcpKeyAlgo) &&
        Objects.equals(this.gcpSaEmail, gatewayCreateProducerGcp.gcpSaEmail) &&
        Objects.equals(this.gcpTokenScopes, gatewayCreateProducerGcp.gcpTokenScopes) &&
        Objects.equals(this.name, gatewayCreateProducerGcp.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerGcp.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayCreateProducerGcp.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerGcp.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerGcp.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerGcp.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerGcp.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpCredType, gcpKey, gcpKeyAlgo, gcpSaEmail, gcpTokenScopes, name, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerGcp {\n");
    sb.append("    gcpCredType: ").append(toIndentedString(gcpCredType)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    gcpKeyAlgo: ").append(toIndentedString(gcpKeyAlgo)).append("\n");
    sb.append("    gcpSaEmail: ").append(toIndentedString(gcpSaEmail)).append("\n");
    sb.append("    gcpTokenScopes: ").append(toIndentedString(gcpTokenScopes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
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

