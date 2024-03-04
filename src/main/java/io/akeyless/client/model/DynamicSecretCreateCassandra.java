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
 * dynamicSecretCreateCassandra is a command that creates a Cassandra dynamic secret
 */
@ApiModel(description = "dynamicSecretCreateCassandra is a command that creates a Cassandra dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretCreateCassandra {
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

  public DynamicSecretCreateCassandra() { 
  }

  public DynamicSecretCreateCassandra cassandraCreationStatements(String cassandraCreationStatements) {
    
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


  public DynamicSecretCreateCassandra cassandraHosts(String cassandraHosts) {
    
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


  public DynamicSecretCreateCassandra cassandraPassword(String cassandraPassword) {
    
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


  public DynamicSecretCreateCassandra cassandraPort(String cassandraPort) {
    
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


  public DynamicSecretCreateCassandra cassandraUsername(String cassandraUsername) {
    
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


  public DynamicSecretCreateCassandra deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretCreateCassandra description(String description) {
    
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


  public DynamicSecretCreateCassandra json(Boolean json) {
    
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


  public DynamicSecretCreateCassandra name(String name) {
    
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


  public DynamicSecretCreateCassandra passwordLength(String passwordLength) {
    
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


  public DynamicSecretCreateCassandra producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretCreateCassandra ssl(Boolean ssl) {
    
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


  public DynamicSecretCreateCassandra sslCertificate(String sslCertificate) {
    
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


  public DynamicSecretCreateCassandra tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateCassandra addTagsItem(String tagsItem) {
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


  public DynamicSecretCreateCassandra targetName(String targetName) {
    
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


  public DynamicSecretCreateCassandra token(String token) {
    
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


  public DynamicSecretCreateCassandra uidToken(String uidToken) {
    
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


  public DynamicSecretCreateCassandra userTtl(String userTtl) {
    
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
    DynamicSecretCreateCassandra dynamicSecretCreateCassandra = (DynamicSecretCreateCassandra) o;
    return Objects.equals(this.cassandraCreationStatements, dynamicSecretCreateCassandra.cassandraCreationStatements) &&
        Objects.equals(this.cassandraHosts, dynamicSecretCreateCassandra.cassandraHosts) &&
        Objects.equals(this.cassandraPassword, dynamicSecretCreateCassandra.cassandraPassword) &&
        Objects.equals(this.cassandraPort, dynamicSecretCreateCassandra.cassandraPort) &&
        Objects.equals(this.cassandraUsername, dynamicSecretCreateCassandra.cassandraUsername) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateCassandra.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateCassandra.description) &&
        Objects.equals(this.json, dynamicSecretCreateCassandra.json) &&
        Objects.equals(this.name, dynamicSecretCreateCassandra.name) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateCassandra.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretCreateCassandra.producerEncryptionKeyName) &&
        Objects.equals(this.ssl, dynamicSecretCreateCassandra.ssl) &&
        Objects.equals(this.sslCertificate, dynamicSecretCreateCassandra.sslCertificate) &&
        Objects.equals(this.tags, dynamicSecretCreateCassandra.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateCassandra.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateCassandra.token) &&
        Objects.equals(this.uidToken, dynamicSecretCreateCassandra.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretCreateCassandra.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cassandraCreationStatements, cassandraHosts, cassandraPassword, cassandraPort, cassandraUsername, deleteProtection, description, json, name, passwordLength, producerEncryptionKeyName, ssl, sslCertificate, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateCassandra {\n");
    sb.append("    cassandraCreationStatements: ").append(toIndentedString(cassandraCreationStatements)).append("\n");
    sb.append("    cassandraHosts: ").append(toIndentedString(cassandraHosts)).append("\n");
    sb.append("    cassandraPassword: ").append(toIndentedString(cassandraPassword)).append("\n");
    sb.append("    cassandraPort: ").append(toIndentedString(cassandraPort)).append("\n");
    sb.append("    cassandraUsername: ").append(toIndentedString(cassandraUsername)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

