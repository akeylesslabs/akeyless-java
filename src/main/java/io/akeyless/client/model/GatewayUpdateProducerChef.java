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
 * gatewayUpdateProducerChef is a command that updates chef producer [Deprecated: Use dynamic-secret-update-chef command]
 */
@ApiModel(description = "gatewayUpdateProducerChef is a command that updates chef producer [Deprecated: Use dynamic-secret-update-chef command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateProducerChef {
  public static final String SERIALIZED_NAME_CHEF_ORGS = "chef-orgs";
  @SerializedName(SERIALIZED_NAME_CHEF_ORGS)
  private String chefOrgs;

  public static final String SERIALIZED_NAME_CHEF_SERVER_KEY = "chef-server-key";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_KEY)
  private String chefServerKey;

  public static final String SERIALIZED_NAME_CHEF_SERVER_URL = "chef-server-url";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_URL)
  private String chefServerUrl;

  public static final String SERIALIZED_NAME_CHEF_SERVER_USERNAME = "chef-server-username";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_USERNAME)
  private String chefServerUsername;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SKIP_SSL = "skip-ssl";
  @SerializedName(SERIALIZED_NAME_SKIP_SSL)
  private Boolean skipSsl = true;

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

  public GatewayUpdateProducerChef() { 
  }

  public GatewayUpdateProducerChef chefOrgs(String chefOrgs) {
    
    this.chefOrgs = chefOrgs;
    return this;
  }

   /**
   * Organizations
   * @return chefOrgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizations")

  public String getChefOrgs() {
    return chefOrgs;
  }


  public void setChefOrgs(String chefOrgs) {
    this.chefOrgs = chefOrgs;
  }


  public GatewayUpdateProducerChef chefServerKey(String chefServerKey) {
    
    this.chefServerKey = chefServerKey;
    return this;
  }

   /**
   * Server key
   * @return chefServerKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Server key")

  public String getChefServerKey() {
    return chefServerKey;
  }


  public void setChefServerKey(String chefServerKey) {
    this.chefServerKey = chefServerKey;
  }


  public GatewayUpdateProducerChef chefServerUrl(String chefServerUrl) {
    
    this.chefServerUrl = chefServerUrl;
    return this;
  }

   /**
   * Server URL
   * @return chefServerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Server URL")

  public String getChefServerUrl() {
    return chefServerUrl;
  }


  public void setChefServerUrl(String chefServerUrl) {
    this.chefServerUrl = chefServerUrl;
  }


  public GatewayUpdateProducerChef chefServerUsername(String chefServerUsername) {
    
    this.chefServerUsername = chefServerUsername;
    return this;
  }

   /**
   * Server username
   * @return chefServerUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Server username")

  public String getChefServerUsername() {
    return chefServerUsername;
  }


  public void setChefServerUsername(String chefServerUsername) {
    this.chefServerUsername = chefServerUsername;
  }


  public GatewayUpdateProducerChef deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerChef json(Boolean json) {
    
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


  public GatewayUpdateProducerChef name(String name) {
    
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


  public GatewayUpdateProducerChef newName(String newName) {
    
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


  public GatewayUpdateProducerChef passwordLength(String passwordLength) {
    
    this.passwordLength = passwordLength;
    return this;
  }

   /**
   * The length of the password to be generated
   * @return passwordLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of the password to be generated")

  public String getPasswordLength() {
    return passwordLength;
  }


  public void setPasswordLength(String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public GatewayUpdateProducerChef producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerChef skipSsl(Boolean skipSsl) {
    
    this.skipSsl = skipSsl;
    return this;
  }

   /**
   * Skip SSL
   * @return skipSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip SSL")

  public Boolean getSkipSsl() {
    return skipSsl;
  }


  public void setSkipSsl(Boolean skipSsl) {
    this.skipSsl = skipSsl;
  }


  public GatewayUpdateProducerChef tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerChef addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerChef targetName(String targetName) {
    
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


  public GatewayUpdateProducerChef token(String token) {
    
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


  public GatewayUpdateProducerChef uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerChef userTtl(String userTtl) {
    
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
    GatewayUpdateProducerChef gatewayUpdateProducerChef = (GatewayUpdateProducerChef) o;
    return Objects.equals(this.chefOrgs, gatewayUpdateProducerChef.chefOrgs) &&
        Objects.equals(this.chefServerKey, gatewayUpdateProducerChef.chefServerKey) &&
        Objects.equals(this.chefServerUrl, gatewayUpdateProducerChef.chefServerUrl) &&
        Objects.equals(this.chefServerUsername, gatewayUpdateProducerChef.chefServerUsername) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerChef.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerChef.json) &&
        Objects.equals(this.name, gatewayUpdateProducerChef.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerChef.newName) &&
        Objects.equals(this.passwordLength, gatewayUpdateProducerChef.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerChef.producerEncryptionKeyName) &&
        Objects.equals(this.skipSsl, gatewayUpdateProducerChef.skipSsl) &&
        Objects.equals(this.tags, gatewayUpdateProducerChef.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerChef.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerChef.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerChef.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerChef.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chefOrgs, chefServerKey, chefServerUrl, chefServerUsername, deleteProtection, json, name, newName, passwordLength, producerEncryptionKeyName, skipSsl, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerChef {\n");
    sb.append("    chefOrgs: ").append(toIndentedString(chefOrgs)).append("\n");
    sb.append("    chefServerKey: ").append(toIndentedString(chefServerKey)).append("\n");
    sb.append("    chefServerUrl: ").append(toIndentedString(chefServerUrl)).append("\n");
    sb.append("    chefServerUsername: ").append(toIndentedString(chefServerUsername)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    skipSsl: ").append(toIndentedString(skipSsl)).append("\n");
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

