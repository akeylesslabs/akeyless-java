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
 * gatewayUpdateProducerDockerhub is a command that updates a DOCKERHUB producer [Deprecated: Use dynamic-secret-update-dockerhub command]
 */
@ApiModel(description = "gatewayUpdateProducerDockerhub is a command that updates a DOCKERHUB producer [Deprecated: Use dynamic-secret-update-dockerhub command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateProducerDockerhub {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DOCKERHUB_PASSWORD = "dockerhub-password";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_PASSWORD)
  private String dockerhubPassword;

  public static final String SERIALIZED_NAME_DOCKERHUB_TOKEN_SCOPES = "dockerhub-token-scopes";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_TOKEN_SCOPES)
  private String dockerhubTokenScopes;

  public static final String SERIALIZED_NAME_DOCKERHUB_USERNAME = "dockerhub-username";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_USERNAME)
  private String dockerhubUsername;

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

  public GatewayUpdateProducerDockerhub() { 
  }

  public GatewayUpdateProducerDockerhub deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerDockerhub dockerhubPassword(String dockerhubPassword) {
    
    this.dockerhubPassword = dockerhubPassword;
    return this;
  }

   /**
   * DockerhubPassword is either the user&#39;s password access token to manage the repository
   * @return dockerhubPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DockerhubPassword is either the user's password access token to manage the repository")

  public String getDockerhubPassword() {
    return dockerhubPassword;
  }


  public void setDockerhubPassword(String dockerhubPassword) {
    this.dockerhubPassword = dockerhubPassword;
  }


  public GatewayUpdateProducerDockerhub dockerhubTokenScopes(String dockerhubTokenScopes) {
    
    this.dockerhubTokenScopes = dockerhubTokenScopes;
    return this;
  }

   /**
   * Access token scopes list (comma-separated) to give the dynamic secret valid options are in \&quot;repo:admin\&quot;, \&quot;repo:write\&quot;, \&quot;repo:read\&quot;, \&quot;repo:public_read\&quot;
   * @return dockerhubTokenScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access token scopes list (comma-separated) to give the dynamic secret valid options are in \"repo:admin\", \"repo:write\", \"repo:read\", \"repo:public_read\"")

  public String getDockerhubTokenScopes() {
    return dockerhubTokenScopes;
  }


  public void setDockerhubTokenScopes(String dockerhubTokenScopes) {
    this.dockerhubTokenScopes = dockerhubTokenScopes;
  }


  public GatewayUpdateProducerDockerhub dockerhubUsername(String dockerhubUsername) {
    
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


  public GatewayUpdateProducerDockerhub json(Boolean json) {
    
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


  public GatewayUpdateProducerDockerhub name(String name) {
    
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


  public GatewayUpdateProducerDockerhub newName(String newName) {
    
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


  public GatewayUpdateProducerDockerhub producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerDockerhub tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerDockerhub addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerDockerhub targetName(String targetName) {
    
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


  public GatewayUpdateProducerDockerhub token(String token) {
    
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


  public GatewayUpdateProducerDockerhub uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerDockerhub userTtl(String userTtl) {
    
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
    GatewayUpdateProducerDockerhub gatewayUpdateProducerDockerhub = (GatewayUpdateProducerDockerhub) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerDockerhub.deleteProtection) &&
        Objects.equals(this.dockerhubPassword, gatewayUpdateProducerDockerhub.dockerhubPassword) &&
        Objects.equals(this.dockerhubTokenScopes, gatewayUpdateProducerDockerhub.dockerhubTokenScopes) &&
        Objects.equals(this.dockerhubUsername, gatewayUpdateProducerDockerhub.dockerhubUsername) &&
        Objects.equals(this.json, gatewayUpdateProducerDockerhub.json) &&
        Objects.equals(this.name, gatewayUpdateProducerDockerhub.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerDockerhub.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerDockerhub.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayUpdateProducerDockerhub.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerDockerhub.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerDockerhub.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerDockerhub.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerDockerhub.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, dockerhubPassword, dockerhubTokenScopes, dockerhubUsername, json, name, newName, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerDockerhub {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    dockerhubPassword: ").append(toIndentedString(dockerhubPassword)).append("\n");
    sb.append("    dockerhubTokenScopes: ").append(toIndentedString(dockerhubTokenScopes)).append("\n");
    sb.append("    dockerhubUsername: ").append(toIndentedString(dockerhubUsername)).append("\n");
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

