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
 * DeleteTarget
 */

public class DeleteTarget {
  public static final String SERIALIZED_NAME_FORCE_DELETION = "force-deletion";
  @SerializedName(SERIALIZED_NAME_FORCE_DELETION)
  private Boolean forceDeletion = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_VERSION = "target-version";
  @SerializedName(SERIALIZED_NAME_TARGET_VERSION)
  private Integer targetVersion;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public DeleteTarget forceDeletion(Boolean forceDeletion) {
    
    this.forceDeletion = forceDeletion;
    return this;
  }

   /**
   * Enforce deletion
   * @return forceDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enforce deletion")

  public Boolean getForceDeletion() {
    return forceDeletion;
  }


  public void setForceDeletion(Boolean forceDeletion) {
    this.forceDeletion = forceDeletion;
  }


  public DeleteTarget name(String name) {
    
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


  public DeleteTarget targetVersion(Integer targetVersion) {
    
    this.targetVersion = targetVersion;
    return this;
  }

   /**
   * Target version
   * @return targetVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target version")

  public Integer getTargetVersion() {
    return targetVersion;
  }


  public void setTargetVersion(Integer targetVersion) {
    this.targetVersion = targetVersion;
  }


  public DeleteTarget token(String token) {
    
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


  public DeleteTarget uidToken(String uidToken) {
    
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
    DeleteTarget deleteTarget = (DeleteTarget) o;
    return Objects.equals(this.forceDeletion, deleteTarget.forceDeletion) &&
        Objects.equals(this.name, deleteTarget.name) &&
        Objects.equals(this.targetVersion, deleteTarget.targetVersion) &&
        Objects.equals(this.token, deleteTarget.token) &&
        Objects.equals(this.uidToken, deleteTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceDeletion, name, targetVersion, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTarget {\n");
    sb.append("    forceDeletion: ").append(toIndentedString(forceDeletion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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

