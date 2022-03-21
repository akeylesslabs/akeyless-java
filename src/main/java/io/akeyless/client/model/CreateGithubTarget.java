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
 * CreateGithubTarget
 */

public class CreateGithubTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_GITHUB_APP_ID = "github-app-id";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_ID)
  private Long githubAppId;

  public static final String SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY = "github-app-private-key";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY)
  private String githubAppPrivateKey;

  public static final String SERIALIZED_NAME_GITHUB_BASE_URL = "github-base-url";
  @SerializedName(SERIALIZED_NAME_GITHUB_BASE_URL)
  private String githubBaseUrl;

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


  public CreateGithubTarget comment(String comment) {
    
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


  public CreateGithubTarget githubAppId(Long githubAppId) {
    
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


  public CreateGithubTarget githubAppPrivateKey(String githubAppPrivateKey) {
    
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


  public CreateGithubTarget githubBaseUrl(String githubBaseUrl) {
    
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


  public CreateGithubTarget key(String key) {
    
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


  public CreateGithubTarget name(String name) {
    
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


  public CreateGithubTarget token(String token) {
    
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


  public CreateGithubTarget uidToken(String uidToken) {
    
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
    CreateGithubTarget createGithubTarget = (CreateGithubTarget) o;
    return Objects.equals(this.comment, createGithubTarget.comment) &&
        Objects.equals(this.githubAppId, createGithubTarget.githubAppId) &&
        Objects.equals(this.githubAppPrivateKey, createGithubTarget.githubAppPrivateKey) &&
        Objects.equals(this.githubBaseUrl, createGithubTarget.githubBaseUrl) &&
        Objects.equals(this.key, createGithubTarget.key) &&
        Objects.equals(this.name, createGithubTarget.name) &&
        Objects.equals(this.token, createGithubTarget.token) &&
        Objects.equals(this.uidToken, createGithubTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, githubAppId, githubAppPrivateKey, githubBaseUrl, key, name, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGithubTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    githubAppId: ").append(toIndentedString(githubAppId)).append("\n");
    sb.append("    githubAppPrivateKey: ").append(toIndentedString(githubAppPrivateKey)).append("\n");
    sb.append("    githubBaseUrl: ").append(toIndentedString(githubBaseUrl)).append("\n");
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

