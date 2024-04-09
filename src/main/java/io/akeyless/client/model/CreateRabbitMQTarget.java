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
 * CreateRabbitMQTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRabbitMQTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

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

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD = "rabbitmq-server-password";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD)
  private String rabbitmqServerPassword;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq-server-uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_USER = "rabbitmq-server-user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_USER)
  private String rabbitmqServerUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateRabbitMQTarget() { 
  }

  public CreateRabbitMQTarget comment(String comment) {
    
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


  public CreateRabbitMQTarget description(String description) {
    
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


  public CreateRabbitMQTarget json(Boolean json) {
    
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


  public CreateRabbitMQTarget key(String key) {
    
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


  public CreateRabbitMQTarget maxVersions(String maxVersions) {
    
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


  public CreateRabbitMQTarget name(String name) {
    
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


  public CreateRabbitMQTarget rabbitmqServerPassword(String rabbitmqServerPassword) {
    
    this.rabbitmqServerPassword = rabbitmqServerPassword;
    return this;
  }

   /**
   * Get rabbitmqServerPassword
   * @return rabbitmqServerPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerPassword() {
    return rabbitmqServerPassword;
  }


  public void setRabbitmqServerPassword(String rabbitmqServerPassword) {
    this.rabbitmqServerPassword = rabbitmqServerPassword;
  }


  public CreateRabbitMQTarget rabbitmqServerUri(String rabbitmqServerUri) {
    
    this.rabbitmqServerUri = rabbitmqServerUri;
    return this;
  }

   /**
   * Get rabbitmqServerUri
   * @return rabbitmqServerUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerUri() {
    return rabbitmqServerUri;
  }


  public void setRabbitmqServerUri(String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
  }


  public CreateRabbitMQTarget rabbitmqServerUser(String rabbitmqServerUser) {
    
    this.rabbitmqServerUser = rabbitmqServerUser;
    return this;
  }

   /**
   * Get rabbitmqServerUser
   * @return rabbitmqServerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRabbitmqServerUser() {
    return rabbitmqServerUser;
  }


  public void setRabbitmqServerUser(String rabbitmqServerUser) {
    this.rabbitmqServerUser = rabbitmqServerUser;
  }


  public CreateRabbitMQTarget token(String token) {
    
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


  public CreateRabbitMQTarget uidToken(String uidToken) {
    
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
    CreateRabbitMQTarget createRabbitMQTarget = (CreateRabbitMQTarget) o;
    return Objects.equals(this.comment, createRabbitMQTarget.comment) &&
        Objects.equals(this.description, createRabbitMQTarget.description) &&
        Objects.equals(this.json, createRabbitMQTarget.json) &&
        Objects.equals(this.key, createRabbitMQTarget.key) &&
        Objects.equals(this.maxVersions, createRabbitMQTarget.maxVersions) &&
        Objects.equals(this.name, createRabbitMQTarget.name) &&
        Objects.equals(this.rabbitmqServerPassword, createRabbitMQTarget.rabbitmqServerPassword) &&
        Objects.equals(this.rabbitmqServerUri, createRabbitMQTarget.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqServerUser, createRabbitMQTarget.rabbitmqServerUser) &&
        Objects.equals(this.token, createRabbitMQTarget.token) &&
        Objects.equals(this.uidToken, createRabbitMQTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, description, json, key, maxVersions, name, rabbitmqServerPassword, rabbitmqServerUri, rabbitmqServerUser, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRabbitMQTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rabbitmqServerPassword: ").append(toIndentedString(rabbitmqServerPassword)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqServerUser: ").append(toIndentedString(rabbitmqServerUser)).append("\n");
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

