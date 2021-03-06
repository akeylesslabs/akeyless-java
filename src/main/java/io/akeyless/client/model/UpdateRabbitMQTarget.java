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
 * UpdateRabbitMQTarget
 */

public class UpdateRabbitMQTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD = "rabbitmq-server-password";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD)
  private String rabbitmqServerPassword;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq-server-uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_USER = "rabbitmq-server-user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_USER)
  private String rabbitmqServerUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion = false;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public UpdateRabbitMQTarget comment(String comment) {
    
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


  public UpdateRabbitMQTarget key(String key) {
    
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


  public UpdateRabbitMQTarget name(String name) {
    
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


  public UpdateRabbitMQTarget newName(String newName) {
    
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


  public UpdateRabbitMQTarget password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateRabbitMQTarget rabbitmqServerPassword(String rabbitmqServerPassword) {
    
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


  public UpdateRabbitMQTarget rabbitmqServerUri(String rabbitmqServerUri) {
    
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


  public UpdateRabbitMQTarget rabbitmqServerUser(String rabbitmqServerUser) {
    
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


  public UpdateRabbitMQTarget token(String token) {
    
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


  public UpdateRabbitMQTarget uidToken(String uidToken) {
    
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


  public UpdateRabbitMQTarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Create new version for the target
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create new version for the target")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  public UpdateRabbitMQTarget username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRabbitMQTarget updateRabbitMQTarget = (UpdateRabbitMQTarget) o;
    return Objects.equals(this.comment, updateRabbitMQTarget.comment) &&
        Objects.equals(this.key, updateRabbitMQTarget.key) &&
        Objects.equals(this.name, updateRabbitMQTarget.name) &&
        Objects.equals(this.newName, updateRabbitMQTarget.newName) &&
        Objects.equals(this.password, updateRabbitMQTarget.password) &&
        Objects.equals(this.rabbitmqServerPassword, updateRabbitMQTarget.rabbitmqServerPassword) &&
        Objects.equals(this.rabbitmqServerUri, updateRabbitMQTarget.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqServerUser, updateRabbitMQTarget.rabbitmqServerUser) &&
        Objects.equals(this.token, updateRabbitMQTarget.token) &&
        Objects.equals(this.uidToken, updateRabbitMQTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateRabbitMQTarget.updateVersion) &&
        Objects.equals(this.username, updateRabbitMQTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, key, name, newName, password, rabbitmqServerPassword, rabbitmqServerUri, rabbitmqServerUser, token, uidToken, updateVersion, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRabbitMQTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rabbitmqServerPassword: ").append(toIndentedString(rabbitmqServerPassword)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqServerUser: ").append(toIndentedString(rabbitmqServerUser)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

