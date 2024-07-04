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
 * targetUpdatePing is a command that updates an existing ping target
 */
@ApiModel(description = "targetUpdatePing is a command that updates an existing ping target")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetUpdatePing {
  public static final String SERIALIZED_NAME_ADMINISTRATIVE_PORT = "administrative-port";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_PORT)
  private String administrativePort = "9999";

  public static final String SERIALIZED_NAME_AUTHORIZATION_PORT = "authorization-port";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_PORT)
  private String authorizationPort = "9031";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

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

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PING_URL = "ping-url";
  @SerializedName(SERIALIZED_NAME_PING_URL)
  private String pingUrl;

  public static final String SERIALIZED_NAME_PRIVILEGED_USER = "privileged-user";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED_USER)
  private String privilegedUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public TargetUpdatePing() { 
  }

  public TargetUpdatePing administrativePort(String administrativePort) {
    
    this.administrativePort = administrativePort;
    return this;
  }

   /**
   * Ping Federate administrative port
   * @return administrativePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate administrative port")

  public String getAdministrativePort() {
    return administrativePort;
  }


  public void setAdministrativePort(String administrativePort) {
    this.administrativePort = administrativePort;
  }


  public TargetUpdatePing authorizationPort(String authorizationPort) {
    
    this.authorizationPort = authorizationPort;
    return this;
  }

   /**
   * Ping Federate authorization port
   * @return authorizationPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate authorization port")

  public String getAuthorizationPort() {
    return authorizationPort;
  }


  public void setAuthorizationPort(String authorizationPort) {
    this.authorizationPort = authorizationPort;
  }


  public TargetUpdatePing description(String description) {
    
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


  public TargetUpdatePing json(Boolean json) {
    
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


  public TargetUpdatePing keepPrevVersion(String keepPrevVersion) {
    
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


  public TargetUpdatePing key(String key) {
    
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


  public TargetUpdatePing maxVersions(String maxVersions) {
    
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


  public TargetUpdatePing name(String name) {
    
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


  public TargetUpdatePing newName(String newName) {
    
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


  public TargetUpdatePing password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Ping Federate privileged user password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate privileged user password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public TargetUpdatePing pingUrl(String pingUrl) {
    
    this.pingUrl = pingUrl;
    return this;
  }

   /**
   * Ping URL
   * @return pingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping URL")

  public String getPingUrl() {
    return pingUrl;
  }


  public void setPingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
  }


  public TargetUpdatePing privilegedUser(String privilegedUser) {
    
    this.privilegedUser = privilegedUser;
    return this;
  }

   /**
   * Ping Federate privileged user
   * @return privilegedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate privileged user")

  public String getPrivilegedUser() {
    return privilegedUser;
  }


  public void setPrivilegedUser(String privilegedUser) {
    this.privilegedUser = privilegedUser;
  }


  public TargetUpdatePing token(String token) {
    
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


  public TargetUpdatePing uidToken(String uidToken) {
    
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
    TargetUpdatePing targetUpdatePing = (TargetUpdatePing) o;
    return Objects.equals(this.administrativePort, targetUpdatePing.administrativePort) &&
        Objects.equals(this.authorizationPort, targetUpdatePing.authorizationPort) &&
        Objects.equals(this.description, targetUpdatePing.description) &&
        Objects.equals(this.json, targetUpdatePing.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdatePing.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdatePing.key) &&
        Objects.equals(this.maxVersions, targetUpdatePing.maxVersions) &&
        Objects.equals(this.name, targetUpdatePing.name) &&
        Objects.equals(this.newName, targetUpdatePing.newName) &&
        Objects.equals(this.password, targetUpdatePing.password) &&
        Objects.equals(this.pingUrl, targetUpdatePing.pingUrl) &&
        Objects.equals(this.privilegedUser, targetUpdatePing.privilegedUser) &&
        Objects.equals(this.token, targetUpdatePing.token) &&
        Objects.equals(this.uidToken, targetUpdatePing.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativePort, authorizationPort, description, json, keepPrevVersion, key, maxVersions, name, newName, password, pingUrl, privilegedUser, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdatePing {\n");
    sb.append("    administrativePort: ").append(toIndentedString(administrativePort)).append("\n");
    sb.append("    authorizationPort: ").append(toIndentedString(authorizationPort)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    privilegedUser: ").append(toIndentedString(privilegedUser)).append("\n");
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

