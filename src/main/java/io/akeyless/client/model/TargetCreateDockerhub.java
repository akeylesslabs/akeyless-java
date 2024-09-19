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
 * TargetCreateDockerhub
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetCreateDockerhub {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCKERHUB_PASSWORD = "dockerhub-password";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_PASSWORD)
  private String dockerhubPassword;

  public static final String SERIALIZED_NAME_DOCKERHUB_USERNAME = "dockerhub-username";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_USERNAME)
  private String dockerhubUsername;

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

  public TargetCreateDockerhub() { 
  }

  public TargetCreateDockerhub description(String description) {
    
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


  public TargetCreateDockerhub dockerhubPassword(String dockerhubPassword) {
    
    this.dockerhubPassword = dockerhubPassword;
    return this;
  }

   /**
   * Password for docker repository
   * @return dockerhubPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password for docker repository")

  public String getDockerhubPassword() {
    return dockerhubPassword;
  }


  public void setDockerhubPassword(String dockerhubPassword) {
    this.dockerhubPassword = dockerhubPassword;
  }


  public TargetCreateDockerhub dockerhubUsername(String dockerhubUsername) {
    
    this.dockerhubUsername = dockerhubUsername;
    return this;
  }

   /**
   * Username for docker repository
   * @return dockerhubUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username for docker repository")

  public String getDockerhubUsername() {
    return dockerhubUsername;
  }


  public void setDockerhubUsername(String dockerhubUsername) {
    this.dockerhubUsername = dockerhubUsername;
  }


  public TargetCreateDockerhub json(Boolean json) {
    
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


  public TargetCreateDockerhub key(String key) {
    
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


  public TargetCreateDockerhub maxVersions(String maxVersions) {
    
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


  public TargetCreateDockerhub name(String name) {
    
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


  public TargetCreateDockerhub token(String token) {
    
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


  public TargetCreateDockerhub uidToken(String uidToken) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetCreateDockerhub targetCreateDockerhub = (TargetCreateDockerhub) o;
    return Objects.equals(this.description, targetCreateDockerhub.description) &&
        Objects.equals(this.dockerhubPassword, targetCreateDockerhub.dockerhubPassword) &&
        Objects.equals(this.dockerhubUsername, targetCreateDockerhub.dockerhubUsername) &&
        Objects.equals(this.json, targetCreateDockerhub.json) &&
        Objects.equals(this.key, targetCreateDockerhub.key) &&
        Objects.equals(this.maxVersions, targetCreateDockerhub.maxVersions) &&
        Objects.equals(this.name, targetCreateDockerhub.name) &&
        Objects.equals(this.token, targetCreateDockerhub.token) &&
        Objects.equals(this.uidToken, targetCreateDockerhub.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dockerhubPassword, dockerhubUsername, json, key, maxVersions, name, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateDockerhub {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dockerhubPassword: ").append(toIndentedString(dockerhubPassword)).append("\n");
    sb.append("    dockerhubUsername: ").append(toIndentedString(dockerhubUsername)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
