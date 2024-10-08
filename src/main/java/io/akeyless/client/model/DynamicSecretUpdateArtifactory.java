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
import java.util.ArrayList;
import java.util.List;

/**
 * dynamicSecretUpdateArtifactory is a command that updates artifactory dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateArtifactory is a command that updates artifactory dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateArtifactory {
  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME = "artifactory-admin-name";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME)
  private String artifactoryAdminName;

  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD = "artifactory-admin-pwd";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD)
  private String artifactoryAdminPwd;

  public static final String SERIALIZED_NAME_ARTIFACTORY_TOKEN_AUDIENCE = "artifactory-token-audience";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_TOKEN_AUDIENCE)
  private String artifactoryTokenAudience;

  public static final String SERIALIZED_NAME_ARTIFACTORY_TOKEN_SCOPE = "artifactory-token-scope";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_TOKEN_SCOPE)
  private String artifactoryTokenScope;

  public static final String SERIALIZED_NAME_BASE_URL = "base-url";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public DynamicSecretUpdateArtifactory() { 
  }

  public DynamicSecretUpdateArtifactory artifactoryAdminName(String artifactoryAdminName) {
    
    this.artifactoryAdminName = artifactoryAdminName;
    return this;
  }

   /**
   * Artifactory Admin Name
   * @return artifactoryAdminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Artifactory Admin Name")

  public String getArtifactoryAdminName() {
    return artifactoryAdminName;
  }


  public void setArtifactoryAdminName(String artifactoryAdminName) {
    this.artifactoryAdminName = artifactoryAdminName;
  }


  public DynamicSecretUpdateArtifactory artifactoryAdminPwd(String artifactoryAdminPwd) {
    
    this.artifactoryAdminPwd = artifactoryAdminPwd;
    return this;
  }

   /**
   * Artifactory Admin password
   * @return artifactoryAdminPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Artifactory Admin password")

  public String getArtifactoryAdminPwd() {
    return artifactoryAdminPwd;
  }


  public void setArtifactoryAdminPwd(String artifactoryAdminPwd) {
    this.artifactoryAdminPwd = artifactoryAdminPwd;
  }


  public DynamicSecretUpdateArtifactory artifactoryTokenAudience(String artifactoryTokenAudience) {
    
    this.artifactoryTokenAudience = artifactoryTokenAudience;
    return this;
  }

   /**
   * Token Audience
   * @return artifactoryTokenAudience
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Token Audience")

  public String getArtifactoryTokenAudience() {
    return artifactoryTokenAudience;
  }


  public void setArtifactoryTokenAudience(String artifactoryTokenAudience) {
    this.artifactoryTokenAudience = artifactoryTokenAudience;
  }


  public DynamicSecretUpdateArtifactory artifactoryTokenScope(String artifactoryTokenScope) {
    
    this.artifactoryTokenScope = artifactoryTokenScope;
    return this;
  }

   /**
   * Token Scope
   * @return artifactoryTokenScope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Token Scope")

  public String getArtifactoryTokenScope() {
    return artifactoryTokenScope;
  }


  public void setArtifactoryTokenScope(String artifactoryTokenScope) {
    this.artifactoryTokenScope = artifactoryTokenScope;
  }


  public DynamicSecretUpdateArtifactory baseUrl(String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * Base URL
   * @return baseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base URL")

  public String getBaseUrl() {
    return baseUrl;
  }


  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public DynamicSecretUpdateArtifactory deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this object [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateArtifactory description(String description) {
    
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


  public DynamicSecretUpdateArtifactory json(Boolean json) {
    
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


  public DynamicSecretUpdateArtifactory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DynamicSecretUpdateArtifactory newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateArtifactory producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretUpdateArtifactory tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateArtifactory addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretUpdateArtifactory targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretUpdateArtifactory token(String token) {
    
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


  public DynamicSecretUpdateArtifactory uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateArtifactory userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretUpdateArtifactory dynamicSecretUpdateArtifactory = (DynamicSecretUpdateArtifactory) o;
    return Objects.equals(this.artifactoryAdminName, dynamicSecretUpdateArtifactory.artifactoryAdminName) &&
        Objects.equals(this.artifactoryAdminPwd, dynamicSecretUpdateArtifactory.artifactoryAdminPwd) &&
        Objects.equals(this.artifactoryTokenAudience, dynamicSecretUpdateArtifactory.artifactoryTokenAudience) &&
        Objects.equals(this.artifactoryTokenScope, dynamicSecretUpdateArtifactory.artifactoryTokenScope) &&
        Objects.equals(this.baseUrl, dynamicSecretUpdateArtifactory.baseUrl) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdateArtifactory.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateArtifactory.description) &&
        Objects.equals(this.json, dynamicSecretUpdateArtifactory.json) &&
        Objects.equals(this.name, dynamicSecretUpdateArtifactory.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateArtifactory.newName) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateArtifactory.producerEncryptionKeyName) &&
        Objects.equals(this.tags, dynamicSecretUpdateArtifactory.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateArtifactory.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateArtifactory.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateArtifactory.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateArtifactory.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAdminName, artifactoryAdminPwd, artifactoryTokenAudience, artifactoryTokenScope, baseUrl, deleteProtection, description, json, name, newName, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateArtifactory {\n");
    sb.append("    artifactoryAdminName: ").append(toIndentedString(artifactoryAdminName)).append("\n");
    sb.append("    artifactoryAdminPwd: ").append(toIndentedString(artifactoryAdminPwd)).append("\n");
    sb.append("    artifactoryTokenAudience: ").append(toIndentedString(artifactoryTokenAudience)).append("\n");
    sb.append("    artifactoryTokenScope: ").append(toIndentedString(artifactoryTokenScope)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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

