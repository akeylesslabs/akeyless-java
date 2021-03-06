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
 * reverseRBAC is a command that shows which auth methods have access to a particular object.
 */
@ApiModel(description = "reverseRBAC is a command that shows which auth methods have access to a particular object.")

public class ReverseRBAC {
  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public ReverseRBAC password(String password) {
    
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


  public ReverseRBAC path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to an object
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path to an object")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ReverseRBAC token(String token) {
    
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


  public ReverseRBAC type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of object (item, am, role)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of object (item, am, role)")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ReverseRBAC uidToken(String uidToken) {
    
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


  public ReverseRBAC username(String username) {
    
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
    ReverseRBAC reverseRBAC = (ReverseRBAC) o;
    return Objects.equals(this.password, reverseRBAC.password) &&
        Objects.equals(this.path, reverseRBAC.path) &&
        Objects.equals(this.token, reverseRBAC.token) &&
        Objects.equals(this.type, reverseRBAC.type) &&
        Objects.equals(this.uidToken, reverseRBAC.uidToken) &&
        Objects.equals(this.username, reverseRBAC.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, path, token, type, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseRBAC {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

