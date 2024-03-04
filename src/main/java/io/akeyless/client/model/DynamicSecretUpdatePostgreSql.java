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
 * dynamicSecretUpdatePostgreSql is a command that updates postgresql dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdatePostgreSql is a command that updates postgresql dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdatePostgreSql {
  public static final String SERIALIZED_NAME_CREATION_STATEMENTS = "creation-statements";
  @SerializedName(SERIALIZED_NAME_CREATION_STATEMENTS)
  private String creationStatements;

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

  public static final String SERIALIZED_NAME_POSTGRESQL_DB_NAME = "postgresql-db-name";
  @SerializedName(SERIALIZED_NAME_POSTGRESQL_DB_NAME)
  private String postgresqlDbName;

  public static final String SERIALIZED_NAME_POSTGRESQL_HOST = "postgresql-host";
  @SerializedName(SERIALIZED_NAME_POSTGRESQL_HOST)
  private String postgresqlHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_POSTGRESQL_PASSWORD = "postgresql-password";
  @SerializedName(SERIALIZED_NAME_POSTGRESQL_PASSWORD)
  private String postgresqlPassword;

  public static final String SERIALIZED_NAME_POSTGRESQL_PORT = "postgresql-port";
  @SerializedName(SERIALIZED_NAME_POSTGRESQL_PORT)
  private String postgresqlPort = "5432";

  public static final String SERIALIZED_NAME_POSTGRESQL_USERNAME = "postgresql-username";
  @SerializedName(SERIALIZED_NAME_POSTGRESQL_USERNAME)
  private String postgresqlUsername;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY = "producer-encryption-key";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY)
  private String producerEncryptionKey;

  public static final String SERIALIZED_NAME_REVOCATION_STATEMENT = "revocation-statement";
  @SerializedName(SERIALIZED_NAME_REVOCATION_STATEMENT)
  private String revocationStatement;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA = "secure-access-db-schema";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA)
  private String secureAccessDbSchema;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = false;

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl = false;

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

  public DynamicSecretUpdatePostgreSql() { 
  }

  public DynamicSecretUpdatePostgreSql creationStatements(String creationStatements) {
    
    this.creationStatements = creationStatements;
    return this;
  }

   /**
   * PostgreSQL Creation statements
   * @return creationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Creation statements")

  public String getCreationStatements() {
    return creationStatements;
  }


  public void setCreationStatements(String creationStatements) {
    this.creationStatements = creationStatements;
  }


  public DynamicSecretUpdatePostgreSql deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretUpdatePostgreSql description(String description) {
    
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


  public DynamicSecretUpdatePostgreSql json(Boolean json) {
    
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


  public DynamicSecretUpdatePostgreSql name(String name) {
    
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


  public DynamicSecretUpdatePostgreSql newName(String newName) {
    
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


  public DynamicSecretUpdatePostgreSql passwordLength(String passwordLength) {
    
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


  public DynamicSecretUpdatePostgreSql postgresqlDbName(String postgresqlDbName) {
    
    this.postgresqlDbName = postgresqlDbName;
    return this;
  }

   /**
   * PostgreSQL DB Name
   * @return postgresqlDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL DB Name")

  public String getPostgresqlDbName() {
    return postgresqlDbName;
  }


  public void setPostgresqlDbName(String postgresqlDbName) {
    this.postgresqlDbName = postgresqlDbName;
  }


  public DynamicSecretUpdatePostgreSql postgresqlHost(String postgresqlHost) {
    
    this.postgresqlHost = postgresqlHost;
    return this;
  }

   /**
   * PostgreSQL Host
   * @return postgresqlHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Host")

  public String getPostgresqlHost() {
    return postgresqlHost;
  }


  public void setPostgresqlHost(String postgresqlHost) {
    this.postgresqlHost = postgresqlHost;
  }


  public DynamicSecretUpdatePostgreSql postgresqlPassword(String postgresqlPassword) {
    
    this.postgresqlPassword = postgresqlPassword;
    return this;
  }

   /**
   * PostgreSQL Password
   * @return postgresqlPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Password")

  public String getPostgresqlPassword() {
    return postgresqlPassword;
  }


  public void setPostgresqlPassword(String postgresqlPassword) {
    this.postgresqlPassword = postgresqlPassword;
  }


  public DynamicSecretUpdatePostgreSql postgresqlPort(String postgresqlPort) {
    
    this.postgresqlPort = postgresqlPort;
    return this;
  }

   /**
   * PostgreSQL Port
   * @return postgresqlPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Port")

  public String getPostgresqlPort() {
    return postgresqlPort;
  }


  public void setPostgresqlPort(String postgresqlPort) {
    this.postgresqlPort = postgresqlPort;
  }


  public DynamicSecretUpdatePostgreSql postgresqlUsername(String postgresqlUsername) {
    
    this.postgresqlUsername = postgresqlUsername;
    return this;
  }

   /**
   * PostgreSQL Username
   * @return postgresqlUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Username")

  public String getPostgresqlUsername() {
    return postgresqlUsername;
  }


  public void setPostgresqlUsername(String postgresqlUsername) {
    this.postgresqlUsername = postgresqlUsername;
  }


  public DynamicSecretUpdatePostgreSql producerEncryptionKey(String producerEncryptionKey) {
    
    this.producerEncryptionKey = producerEncryptionKey;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKey() {
    return producerEncryptionKey;
  }


  public void setProducerEncryptionKey(String producerEncryptionKey) {
    this.producerEncryptionKey = producerEncryptionKey;
  }


  public DynamicSecretUpdatePostgreSql revocationStatement(String revocationStatement) {
    
    this.revocationStatement = revocationStatement;
    return this;
  }

   /**
   * PostgreSQL Revocation statements
   * @return revocationStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PostgreSQL Revocation statements")

  public String getRevocationStatement() {
    return revocationStatement;
  }


  public void setRevocationStatement(String revocationStatement) {
    this.revocationStatement = revocationStatement;
  }


  public DynamicSecretUpdatePostgreSql secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Path to the SSH Certificate Issuer for your Akeyless Bastion
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the SSH Certificate Issuer for your Akeyless Bastion")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public DynamicSecretUpdatePostgreSql secureAccessDbSchema(String secureAccessDbSchema) {
    
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

   /**
   * The DB schema
   * @return secureAccessDbSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DB schema")

  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }


  public void setSecureAccessDbSchema(String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public DynamicSecretUpdatePostgreSql secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable secure remote access [true/false]")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public DynamicSecretUpdatePostgreSql secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public DynamicSecretUpdatePostgreSql addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts)
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts)")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public DynamicSecretUpdatePostgreSql secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Web Secure Remote Access")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public DynamicSecretUpdatePostgreSql ssl(Boolean ssl) {
    
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


  public DynamicSecretUpdatePostgreSql tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdatePostgreSql addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdatePostgreSql targetName(String targetName) {
    
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


  public DynamicSecretUpdatePostgreSql token(String token) {
    
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


  public DynamicSecretUpdatePostgreSql uidToken(String uidToken) {
    
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


  public DynamicSecretUpdatePostgreSql userTtl(String userTtl) {
    
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
    DynamicSecretUpdatePostgreSql dynamicSecretUpdatePostgreSql = (DynamicSecretUpdatePostgreSql) o;
    return Objects.equals(this.creationStatements, dynamicSecretUpdatePostgreSql.creationStatements) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdatePostgreSql.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdatePostgreSql.description) &&
        Objects.equals(this.json, dynamicSecretUpdatePostgreSql.json) &&
        Objects.equals(this.name, dynamicSecretUpdatePostgreSql.name) &&
        Objects.equals(this.newName, dynamicSecretUpdatePostgreSql.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdatePostgreSql.passwordLength) &&
        Objects.equals(this.postgresqlDbName, dynamicSecretUpdatePostgreSql.postgresqlDbName) &&
        Objects.equals(this.postgresqlHost, dynamicSecretUpdatePostgreSql.postgresqlHost) &&
        Objects.equals(this.postgresqlPassword, dynamicSecretUpdatePostgreSql.postgresqlPassword) &&
        Objects.equals(this.postgresqlPort, dynamicSecretUpdatePostgreSql.postgresqlPort) &&
        Objects.equals(this.postgresqlUsername, dynamicSecretUpdatePostgreSql.postgresqlUsername) &&
        Objects.equals(this.producerEncryptionKey, dynamicSecretUpdatePostgreSql.producerEncryptionKey) &&
        Objects.equals(this.revocationStatement, dynamicSecretUpdatePostgreSql.revocationStatement) &&
        Objects.equals(this.secureAccessBastionIssuer, dynamicSecretUpdatePostgreSql.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbSchema, dynamicSecretUpdatePostgreSql.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdatePostgreSql.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, dynamicSecretUpdatePostgreSql.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdatePostgreSql.secureAccessWeb) &&
        Objects.equals(this.ssl, dynamicSecretUpdatePostgreSql.ssl) &&
        Objects.equals(this.tags, dynamicSecretUpdatePostgreSql.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdatePostgreSql.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdatePostgreSql.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdatePostgreSql.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdatePostgreSql.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationStatements, deleteProtection, description, json, name, newName, passwordLength, postgresqlDbName, postgresqlHost, postgresqlPassword, postgresqlPort, postgresqlUsername, producerEncryptionKey, revocationStatement, secureAccessBastionIssuer, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessWeb, ssl, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdatePostgreSql {\n");
    sb.append("    creationStatements: ").append(toIndentedString(creationStatements)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    postgresqlDbName: ").append(toIndentedString(postgresqlDbName)).append("\n");
    sb.append("    postgresqlHost: ").append(toIndentedString(postgresqlHost)).append("\n");
    sb.append("    postgresqlPassword: ").append(toIndentedString(postgresqlPassword)).append("\n");
    sb.append("    postgresqlPort: ").append(toIndentedString(postgresqlPort)).append("\n");
    sb.append("    postgresqlUsername: ").append(toIndentedString(postgresqlUsername)).append("\n");
    sb.append("    producerEncryptionKey: ").append(toIndentedString(producerEncryptionKey)).append("\n");
    sb.append("    revocationStatement: ").append(toIndentedString(revocationStatement)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessDbSchema: ").append(toIndentedString(secureAccessDbSchema)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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
