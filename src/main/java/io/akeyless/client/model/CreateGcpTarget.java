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
 * CreateGcpTarget
 */

public class CreateGcpTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

  public static final String SERIALIZED_NAME_GCP_SA_EMAIL = "gcp-sa-email";
  @SerializedName(SERIALIZED_NAME_GCP_SA_EMAIL)
  private String gcpSaEmail;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

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


  public CreateGcpTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateGcpTarget gcpKey(String gcpKey) {
    
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


  public CreateGcpTarget gcpSaEmail(String gcpSaEmail) {
    
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


  public CreateGcpTarget key(String key) {
    
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


  public CreateGcpTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGcpTarget token(String token) {
    
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


  public CreateGcpTarget uidToken(String uidToken) {
    
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


  public CreateGcpTarget useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGcpTarget createGcpTarget = (CreateGcpTarget) o;
    return Objects.equals(this.comment, createGcpTarget.comment) &&
        Objects.equals(this.gcpKey, createGcpTarget.gcpKey) &&
        Objects.equals(this.gcpSaEmail, createGcpTarget.gcpSaEmail) &&
        Objects.equals(this.key, createGcpTarget.key) &&
        Objects.equals(this.name, createGcpTarget.name) &&
        Objects.equals(this.token, createGcpTarget.token) &&
        Objects.equals(this.uidToken, createGcpTarget.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, createGcpTarget.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, gcpKey, gcpSaEmail, key, name, token, uidToken, useGwCloudIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGcpTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    gcpSaEmail: ").append(toIndentedString(gcpSaEmail)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

