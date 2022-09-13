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
 * UpdateRabbitMQTargetDetails
 */

public class UpdateRabbitMQTargetDetails {
  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  private Boolean newVersion;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD = "rabbitmq_server_password";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD)
  private String rabbitmqServerPassword;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq_server_uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_USER = "rabbitmq_server_user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_USER)
  private String rabbitmqServerUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateRabbitMQTargetDetails json(Boolean json) {
    
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


  public UpdateRabbitMQTargetDetails keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateRabbitMQTargetDetails name(String name) {
    
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


  public UpdateRabbitMQTargetDetails newVersion(Boolean newVersion) {
    
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Deprecated
   * @return newVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getNewVersion() {
    return newVersion;
  }


  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateRabbitMQTargetDetails protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public UpdateRabbitMQTargetDetails rabbitmqServerPassword(String rabbitmqServerPassword) {
    
    this.rabbitmqServerPassword = rabbitmqServerPassword;
    return this;
  }

   /**
   * Get rabbitmqServerPassword
   * @return rabbitmqServerPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerPassword() {
    return rabbitmqServerPassword;
  }


  public void setRabbitmqServerPassword(String rabbitmqServerPassword) {
    this.rabbitmqServerPassword = rabbitmqServerPassword;
  }


  public UpdateRabbitMQTargetDetails rabbitmqServerUri(String rabbitmqServerUri) {
    
    this.rabbitmqServerUri = rabbitmqServerUri;
    return this;
  }

   /**
   * Get rabbitmqServerUri
   * @return rabbitmqServerUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerUri() {
    return rabbitmqServerUri;
  }


  public void setRabbitmqServerUri(String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
  }


  public UpdateRabbitMQTargetDetails rabbitmqServerUser(String rabbitmqServerUser) {
    
    this.rabbitmqServerUser = rabbitmqServerUser;
    return this;
  }

   /**
   * Get rabbitmqServerUser
   * @return rabbitmqServerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerUser() {
    return rabbitmqServerUser;
  }


  public void setRabbitmqServerUser(String rabbitmqServerUser) {
    this.rabbitmqServerUser = rabbitmqServerUser;
  }


  public UpdateRabbitMQTargetDetails token(String token) {
    
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


  public UpdateRabbitMQTargetDetails uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRabbitMQTargetDetails updateRabbitMQTargetDetails = (UpdateRabbitMQTargetDetails) o;
    return Objects.equals(this.json, updateRabbitMQTargetDetails.json) &&
        Objects.equals(this.keepPrevVersion, updateRabbitMQTargetDetails.keepPrevVersion) &&
        Objects.equals(this.name, updateRabbitMQTargetDetails.name) &&
        Objects.equals(this.newVersion, updateRabbitMQTargetDetails.newVersion) &&
        Objects.equals(this.protectionKey, updateRabbitMQTargetDetails.protectionKey) &&
        Objects.equals(this.rabbitmqServerPassword, updateRabbitMQTargetDetails.rabbitmqServerPassword) &&
        Objects.equals(this.rabbitmqServerUri, updateRabbitMQTargetDetails.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqServerUser, updateRabbitMQTargetDetails.rabbitmqServerUser) &&
        Objects.equals(this.token, updateRabbitMQTargetDetails.token) &&
        Objects.equals(this.uidToken, updateRabbitMQTargetDetails.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, keepPrevVersion, name, newVersion, protectionKey, rabbitmqServerPassword, rabbitmqServerUri, rabbitmqServerUser, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRabbitMQTargetDetails {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    rabbitmqServerPassword: ").append(toIndentedString(rabbitmqServerPassword)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqServerUser: ").append(toIndentedString(rabbitmqServerUser)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

