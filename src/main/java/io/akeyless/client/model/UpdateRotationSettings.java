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
 * updateRotationSettings is a command that updates rotations settings of an existing key
 */
@ApiModel(description = "updateRotationSettings is a command that updates rotations settings of an existing key")

public class UpdateRotationSettings {
  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private Boolean autoRotate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private Long rotationInterval;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public UpdateRotationSettings autoRotate(Boolean autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation
   * @return autoRotate
  **/
  @ApiModelProperty(required = true, value = "Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation")

  public Boolean getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(Boolean autoRotate) {
    this.autoRotate = autoRotate;
  }


  public UpdateRotationSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Key name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Key name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateRotationSettings password(String password) {
    
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


  public UpdateRotationSettings rotationInterval(Long rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * The number of days to wait between every automatic key rotation (7-365)
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days to wait between every automatic key rotation (7-365)")

  public Long getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(Long rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public UpdateRotationSettings token(String token) {
    
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


  public UpdateRotationSettings uidToken(String uidToken) {
    
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


  public UpdateRotationSettings username(String username) {
    
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
    UpdateRotationSettings updateRotationSettings = (UpdateRotationSettings) o;
    return Objects.equals(this.autoRotate, updateRotationSettings.autoRotate) &&
        Objects.equals(this.name, updateRotationSettings.name) &&
        Objects.equals(this.password, updateRotationSettings.password) &&
        Objects.equals(this.rotationInterval, updateRotationSettings.rotationInterval) &&
        Objects.equals(this.token, updateRotationSettings.token) &&
        Objects.equals(this.uidToken, updateRotationSettings.uidToken) &&
        Objects.equals(this.username, updateRotationSettings.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRotate, name, password, rotationInterval, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRotationSettings {\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

