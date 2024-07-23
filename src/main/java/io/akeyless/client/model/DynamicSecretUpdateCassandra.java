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
 * dynamicSecretUpdateCassandra is a command that updates a Cassandra dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateCassandra is a command that updates a Cassandra dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateCassandra {
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

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl = false;

  public static final String SERIALIZED_NAME_SSL_CERTIFICATE = "ssl-certificate";
  @SerializedName(SERIALIZED_NAME_SSL_CERTIFICATE)
  private String sslCertificate;

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

  public DynamicSecretUpdateCassandra() { 
  }

  public DynamicSecretUpdateCassandra cassandraCreationStatements(String cassandraCreationStatements) {
    
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


  public DynamicSecretUpdateCassandra cassandraHosts(String cassandraHosts) {
    
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


  public DynamicSecretUpdateCassandra cassandraPassword(String cassandraPassword) {
    
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


  public DynamicSecretUpdateCassandra cassandraPort(String cassandraPort) {
    
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


  public DynamicSecretUpdateCassandra cassandraUsername(String cassandraUsername) {
    
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


  public DynamicSecretUpdateCassandra deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretUpdateCassandra description(String description) {
    
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


  public DynamicSecretUpdateCassandra json(Boolean json) {
    
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


  public DynamicSecretUpdateCassandra name(String name) {
    
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


  public DynamicSecretUpdateCassandra newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateCassandra passwordLength(String passwordLength) {
    
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


  public DynamicSecretUpdateCassandra producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretUpdateCassandra ssl(Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * Enable/Disable SSL [true/false]
   * @return ssl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable SSL [true/false]")

  public Boolean getSsl() {
    return ssl;
  }


  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public DynamicSecretUpdateCassandra sslCertificate(String sslCertificate) {
    
    this.sslCertificate = sslCertificate;
    return this;
  }

   /**
   * SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA)
   * @return sslCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA)")

  public String getSslCertificate() {
    return sslCertificate;
  }


  public void setSslCertificate(String sslCertificate) {
    this.sslCertificate = sslCertificate;
  }


  public DynamicSecretUpdateCassandra tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateCassandra addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdateCassandra targetName(String targetName) {
    
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


  public DynamicSecretUpdateCassandra token(String token) {
    
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


  public DynamicSecretUpdateCassandra uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateCassandra userTtl(String userTtl) {
    
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
    DynamicSecretUpdateCassandra dynamicSecretUpdateCassandra = (DynamicSecretUpdateCassandra) o;
    return Objects.equals(this.cassandraCreationStatements, dynamicSecretUpdateCassandra.cassandraCreationStatements) &&
        Objects.equals(this.cassandraHosts, dynamicSecretUpdateCassandra.cassandraHosts) &&
        Objects.equals(this.cassandraPassword, dynamicSecretUpdateCassandra.cassandraPassword) &&
        Objects.equals(this.cassandraPort, dynamicSecretUpdateCassandra.cassandraPort) &&
        Objects.equals(this.cassandraUsername, dynamicSecretUpdateCassandra.cassandraUsername) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdateCassandra.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateCassandra.description) &&
        Objects.equals(this.json, dynamicSecretUpdateCassandra.json) &&
        Objects.equals(this.name, dynamicSecretUpdateCassandra.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateCassandra.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateCassandra.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateCassandra.producerEncryptionKeyName) &&
        Objects.equals(this.ssl, dynamicSecretUpdateCassandra.ssl) &&
        Objects.equals(this.sslCertificate, dynamicSecretUpdateCassandra.sslCertificate) &&
        Objects.equals(this.tags, dynamicSecretUpdateCassandra.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateCassandra.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateCassandra.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateCassandra.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateCassandra.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cassandraCreationStatements, cassandraHosts, cassandraPassword, cassandraPort, cassandraUsername, deleteProtection, description, json, name, newName, passwordLength, producerEncryptionKeyName, ssl, sslCertificate, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateCassandra {\n");
    sb.append("    cassandraCreationStatements: ").append(toIndentedString(cassandraCreationStatements)).append("\n");
    sb.append("    cassandraHosts: ").append(toIndentedString(cassandraHosts)).append("\n");
    sb.append("    cassandraPassword: ").append(toIndentedString(cassandraPassword)).append("\n");
    sb.append("    cassandraPort: ").append(toIndentedString(cassandraPort)).append("\n");
    sb.append("    cassandraUsername: ").append(toIndentedString(cassandraUsername)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
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

