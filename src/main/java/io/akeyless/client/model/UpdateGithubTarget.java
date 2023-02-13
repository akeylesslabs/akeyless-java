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
 * UpdateGithubTarget
 */

public class UpdateGithubTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GITHUB_APP_ID = "github-app-id";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_ID)
  private Long githubAppId;

  public static final String SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY = "github-app-private-key";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY)
  private String githubAppPrivateKey;

  public static final String SERIALIZED_NAME_GITHUB_BASE_URL = "github-base-url";
  @SerializedName(SERIALIZED_NAME_GITHUB_BASE_URL)
  private String githubBaseUrl = "https://api.github.com/";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion;


  public UpdateGithubTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Deprecated - use description
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateGithubTarget description(String description) {
    
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


  public UpdateGithubTarget githubAppId(Long githubAppId) {
    
    this.githubAppId = githubAppId;
    return this;
  }

   /**
   * Github app id
   * @return githubAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Github app id")

  public Long getGithubAppId() {
    return githubAppId;
  }


  public void setGithubAppId(Long githubAppId) {
    this.githubAppId = githubAppId;
  }


  public UpdateGithubTarget githubAppPrivateKey(String githubAppPrivateKey) {
    
    this.githubAppPrivateKey = githubAppPrivateKey;
    return this;
  }

   /**
   * App private key
   * @return githubAppPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App private key")

  public String getGithubAppPrivateKey() {
    return githubAppPrivateKey;
  }


  public void setGithubAppPrivateKey(String githubAppPrivateKey) {
    this.githubAppPrivateKey = githubAppPrivateKey;
  }


  public UpdateGithubTarget githubBaseUrl(String githubBaseUrl) {
    
    this.githubBaseUrl = githubBaseUrl;
    return this;
  }

   /**
   * Base URL
   * @return githubBaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base URL")

  public String getGithubBaseUrl() {
    return githubBaseUrl;
  }


  public void setGithubBaseUrl(String githubBaseUrl) {
    this.githubBaseUrl = githubBaseUrl;
  }


  public UpdateGithubTarget json(Boolean json) {
    
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


  public UpdateGithubTarget keepPrevVersion(String keepPrevVersion) {
    
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


  public UpdateGithubTarget key(String key) {
    
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


  public UpdateGithubTarget name(String name) {
    
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


  public UpdateGithubTarget newName(String newName) {
    
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


  public UpdateGithubTarget token(String token) {
    
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


  public UpdateGithubTarget uidToken(String uidToken) {
    
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


  public UpdateGithubTarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Deprecated
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGithubTarget updateGithubTarget = (UpdateGithubTarget) o;
    return Objects.equals(this.comment, updateGithubTarget.comment) &&
        Objects.equals(this.description, updateGithubTarget.description) &&
        Objects.equals(this.githubAppId, updateGithubTarget.githubAppId) &&
        Objects.equals(this.githubAppPrivateKey, updateGithubTarget.githubAppPrivateKey) &&
        Objects.equals(this.githubBaseUrl, updateGithubTarget.githubBaseUrl) &&
        Objects.equals(this.json, updateGithubTarget.json) &&
        Objects.equals(this.keepPrevVersion, updateGithubTarget.keepPrevVersion) &&
        Objects.equals(this.key, updateGithubTarget.key) &&
        Objects.equals(this.name, updateGithubTarget.name) &&
        Objects.equals(this.newName, updateGithubTarget.newName) &&
        Objects.equals(this.token, updateGithubTarget.token) &&
        Objects.equals(this.uidToken, updateGithubTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateGithubTarget.updateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, description, githubAppId, githubAppPrivateKey, githubBaseUrl, json, keepPrevVersion, key, name, newName, token, uidToken, updateVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGithubTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    githubAppId: ").append(toIndentedString(githubAppId)).append("\n");
    sb.append("    githubAppPrivateKey: ").append(toIndentedString(githubAppPrivateKey)).append("\n");
    sb.append("    githubBaseUrl: ").append(toIndentedString(githubBaseUrl)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
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

