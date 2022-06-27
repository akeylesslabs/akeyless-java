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
 * gatewayCreateProducerArtifactory is a command that creates artifactory producer
 */
@ApiModel(description = "gatewayCreateProducerArtifactory is a command that creates artifactory producer")

public class GatewayCreateProducerArtifactory {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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


  public GatewayCreateProducerArtifactory artifactoryAdminName(String artifactoryAdminName) {
    
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


  public GatewayCreateProducerArtifactory artifactoryAdminPwd(String artifactoryAdminPwd) {
    
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


  public GatewayCreateProducerArtifactory artifactoryTokenAudience(String artifactoryTokenAudience) {
    
    this.artifactoryTokenAudience = artifactoryTokenAudience;
    return this;
  }

   /**
   * Token Audience
   * @return artifactoryTokenAudience
  **/
  @ApiModelProperty(required = true, value = "Token Audience")

  public String getArtifactoryTokenAudience() {
    return artifactoryTokenAudience;
  }


  public void setArtifactoryTokenAudience(String artifactoryTokenAudience) {
    this.artifactoryTokenAudience = artifactoryTokenAudience;
  }


  public GatewayCreateProducerArtifactory artifactoryTokenScope(String artifactoryTokenScope) {
    
    this.artifactoryTokenScope = artifactoryTokenScope;
    return this;
  }

   /**
   * Token Scope
   * @return artifactoryTokenScope
  **/
  @ApiModelProperty(required = true, value = "Token Scope")

  public String getArtifactoryTokenScope() {
    return artifactoryTokenScope;
  }


  public void setArtifactoryTokenScope(String artifactoryTokenScope) {
    this.artifactoryTokenScope = artifactoryTokenScope;
  }


  public GatewayCreateProducerArtifactory baseUrl(String baseUrl) {
    
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


  public GatewayCreateProducerArtifactory deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayCreateProducerArtifactory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateProducerArtifactory producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerArtifactory tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerArtifactory addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this secret
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this secret")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayCreateProducerArtifactory targetName(String targetName) {
    
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


  public GatewayCreateProducerArtifactory token(String token) {
    
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


  public GatewayCreateProducerArtifactory uidToken(String uidToken) {
    
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


  public GatewayCreateProducerArtifactory userTtl(String userTtl) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerArtifactory gatewayCreateProducerArtifactory = (GatewayCreateProducerArtifactory) o;
    return Objects.equals(this.artifactoryAdminName, gatewayCreateProducerArtifactory.artifactoryAdminName) &&
        Objects.equals(this.artifactoryAdminPwd, gatewayCreateProducerArtifactory.artifactoryAdminPwd) &&
        Objects.equals(this.artifactoryTokenAudience, gatewayCreateProducerArtifactory.artifactoryTokenAudience) &&
        Objects.equals(this.artifactoryTokenScope, gatewayCreateProducerArtifactory.artifactoryTokenScope) &&
        Objects.equals(this.baseUrl, gatewayCreateProducerArtifactory.baseUrl) &&
        Objects.equals(this.deleteProtection, gatewayCreateProducerArtifactory.deleteProtection) &&
        Objects.equals(this.name, gatewayCreateProducerArtifactory.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerArtifactory.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayCreateProducerArtifactory.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerArtifactory.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerArtifactory.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerArtifactory.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerArtifactory.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAdminName, artifactoryAdminPwd, artifactoryTokenAudience, artifactoryTokenScope, baseUrl, deleteProtection, name, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerArtifactory {\n");
    sb.append("    artifactoryAdminName: ").append(toIndentedString(artifactoryAdminName)).append("\n");
    sb.append("    artifactoryAdminPwd: ").append(toIndentedString(artifactoryAdminPwd)).append("\n");
    sb.append("    artifactoryTokenAudience: ").append(toIndentedString(artifactoryTokenAudience)).append("\n");
    sb.append("    artifactoryTokenScope: ").append(toIndentedString(artifactoryTokenScope)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

