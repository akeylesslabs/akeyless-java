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
 * CreateDockerhubTarget
 */

public class CreateDockerhubTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DOCKERHUB_PASSWORD = "dockerhub-password";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_PASSWORD)
  private String dockerhubPassword;

  public static final String SERIALIZED_NAME_DOCKERHUB_USERNAME = "dockerhub-username";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_USERNAME)
  private String dockerhubUsername;

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


  public CreateDockerhubTarget comment(String comment) {
    
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


  public CreateDockerhubTarget dockerhubPassword(String dockerhubPassword) {
    
    this.dockerhubPassword = dockerhubPassword;
    return this;
  }

   /**
   * DockerhubPassword is either the user&#39;s password to manage the repository
   * @return dockerhubPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DockerhubPassword is either the user's password to manage the repository")

  public String getDockerhubPassword() {
    return dockerhubPassword;
  }


  public void setDockerhubPassword(String dockerhubPassword) {
    this.dockerhubPassword = dockerhubPassword;
  }


  public CreateDockerhubTarget dockerhubUsername(String dockerhubUsername) {
    
    this.dockerhubUsername = dockerhubUsername;
    return this;
  }

   /**
   * DockerhubUsername is the name of the user in dockerhub
   * @return dockerhubUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DockerhubUsername is the name of the user in dockerhub")

  public String getDockerhubUsername() {
    return dockerhubUsername;
  }


  public void setDockerhubUsername(String dockerhubUsername) {
    this.dockerhubUsername = dockerhubUsername;
  }


  public CreateDockerhubTarget key(String key) {
    
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


  public CreateDockerhubTarget name(String name) {
    
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


  public CreateDockerhubTarget token(String token) {
    
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


  public CreateDockerhubTarget uidToken(String uidToken) {
    
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
    CreateDockerhubTarget createDockerhubTarget = (CreateDockerhubTarget) o;
    return Objects.equals(this.comment, createDockerhubTarget.comment) &&
        Objects.equals(this.dockerhubPassword, createDockerhubTarget.dockerhubPassword) &&
        Objects.equals(this.dockerhubUsername, createDockerhubTarget.dockerhubUsername) &&
        Objects.equals(this.key, createDockerhubTarget.key) &&
        Objects.equals(this.name, createDockerhubTarget.name) &&
        Objects.equals(this.token, createDockerhubTarget.token) &&
        Objects.equals(this.uidToken, createDockerhubTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, dockerhubPassword, dockerhubUsername, key, name, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDockerhubTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    dockerhubPassword: ").append(toIndentedString(dockerhubPassword)).append("\n");
    sb.append("    dockerhubUsername: ").append(toIndentedString(dockerhubUsername)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
