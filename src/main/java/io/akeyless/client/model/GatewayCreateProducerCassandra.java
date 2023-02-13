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
 * gatewayCreateProducerCassandra is a command that creates a Cassandra producer
 */
@ApiModel(description = "gatewayCreateProducerCassandra is a command that creates a Cassandra producer")

public class GatewayCreateProducerCassandra {
  public static final String SERIALIZED_NAME_CASSANDRA_CREATION_STATEMENTS = "cassandra-creation-statements";
  @SerializedName(SERIALIZED_NAME_CASSANDRA_CREATION_STATEMENTS)
  private String cassandraCreationStatements;

  public static final String SERIALIZED_NAME_CASSANDRA_HOSTS = "cassandra-hosts";
  @SerializedName(SERIALIZED_NAME_CASSANDRA_HOSTS)
  private String cassandraHosts;

  public static final String SERIALIZED_NAME_CASSANDRA_PASSWORD = "cassandra-password";
  @SerializedName(SERIALIZED_NAME_CASSANDRA_PASSWORD)
  private String cassandraPassword;

  public static final String SERIALIZED_NAME_CASSANDRA_PORT = "cassandra-port";
  @SerializedName(SERIALIZED_NAME_CASSANDRA_PORT)
  private String cassandraPort = "9042";

  public static final String SERIALIZED_NAME_CASSANDRA_USERNAME = "cassandra-username";
  @SerializedName(SERIALIZED_NAME_CASSANDRA_USERNAME)
  private String cassandraUsername;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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


  public GatewayCreateProducerCassandra cassandraCreationStatements(String cassandraCreationStatements) {
    
    this.cassandraCreationStatements = cassandraCreationStatements;
    return this;
  }

   /**
   * Cassandra creation statements
   * @return cassandraCreationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cassandra creation statements")

  public String getCassandraCreationStatements() {
    return cassandraCreationStatements;
  }


  public void setCassandraCreationStatements(String cassandraCreationStatements) {
    this.cassandraCreationStatements = cassandraCreationStatements;
  }


  public GatewayCreateProducerCassandra cassandraHosts(String cassandraHosts) {
    
    this.cassandraHosts = cassandraHosts;
    return this;
  }

   /**
   * Cassandra hosts IP or addresses, comma separated
   * @return cassandraHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cassandra hosts IP or addresses, comma separated")

  public String getCassandraHosts() {
    return cassandraHosts;
  }


  public void setCassandraHosts(String cassandraHosts) {
    this.cassandraHosts = cassandraHosts;
  }


  public GatewayCreateProducerCassandra cassandraPassword(String cassandraPassword) {
    
    this.cassandraPassword = cassandraPassword;
    return this;
  }

   /**
   * Cassandra superuser password
   * @return cassandraPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cassandra superuser password")

  public String getCassandraPassword() {
    return cassandraPassword;
  }


  public void setCassandraPassword(String cassandraPassword) {
    this.cassandraPassword = cassandraPassword;
  }


  public GatewayCreateProducerCassandra cassandraPort(String cassandraPort) {
    
    this.cassandraPort = cassandraPort;
    return this;
  }

   /**
   * Cassandra port
   * @return cassandraPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cassandra port")

  public String getCassandraPort() {
    return cassandraPort;
  }


  public void setCassandraPort(String cassandraPort) {
    this.cassandraPort = cassandraPort;
  }


  public GatewayCreateProducerCassandra cassandraUsername(String cassandraUsername) {
    
    this.cassandraUsername = cassandraUsername;
    return this;
  }

   /**
   * Cassandra superuser username
   * @return cassandraUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cassandra superuser username")

  public String getCassandraUsername() {
    return cassandraUsername;
  }


  public void setCassandraUsername(String cassandraUsername) {
    this.cassandraUsername = cassandraUsername;
  }


  public GatewayCreateProducerCassandra deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayCreateProducerCassandra json(Boolean json) {
    
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


  public GatewayCreateProducerCassandra name(String name) {
    
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


  public GatewayCreateProducerCassandra producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerCassandra tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerCassandra addTagsItem(String tagsItem) {
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


  public GatewayCreateProducerCassandra targetName(String targetName) {
    
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


  public GatewayCreateProducerCassandra token(String token) {
    
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


  public GatewayCreateProducerCassandra uidToken(String uidToken) {
    
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


  public GatewayCreateProducerCassandra userTtl(String userTtl) {
    
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
    GatewayCreateProducerCassandra gatewayCreateProducerCassandra = (GatewayCreateProducerCassandra) o;
    return Objects.equals(this.cassandraCreationStatements, gatewayCreateProducerCassandra.cassandraCreationStatements) &&
        Objects.equals(this.cassandraHosts, gatewayCreateProducerCassandra.cassandraHosts) &&
        Objects.equals(this.cassandraPassword, gatewayCreateProducerCassandra.cassandraPassword) &&
        Objects.equals(this.cassandraPort, gatewayCreateProducerCassandra.cassandraPort) &&
        Objects.equals(this.cassandraUsername, gatewayCreateProducerCassandra.cassandraUsername) &&
        Objects.equals(this.deleteProtection, gatewayCreateProducerCassandra.deleteProtection) &&
        Objects.equals(this.json, gatewayCreateProducerCassandra.json) &&
        Objects.equals(this.name, gatewayCreateProducerCassandra.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerCassandra.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayCreateProducerCassandra.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerCassandra.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerCassandra.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerCassandra.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerCassandra.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cassandraCreationStatements, cassandraHosts, cassandraPassword, cassandraPort, cassandraUsername, deleteProtection, json, name, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerCassandra {\n");
    sb.append("    cassandraCreationStatements: ").append(toIndentedString(cassandraCreationStatements)).append("\n");
    sb.append("    cassandraHosts: ").append(toIndentedString(cassandraHosts)).append("\n");
    sb.append("    cassandraPassword: ").append(toIndentedString(cassandraPassword)).append("\n");
    sb.append("    cassandraPort: ").append(toIndentedString(cassandraPort)).append("\n");
    sb.append("    cassandraUsername: ").append(toIndentedString(cassandraUsername)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

