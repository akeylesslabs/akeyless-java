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
 * gatewayCreateProducerPostgreSQL is a command that creates postgresql producer
 */
@ApiModel(description = "gatewayCreateProducerPostgreSQL is a command that creates postgresql producer")

public class GatewayCreateProducerPostgreSQL {
  public static final String SERIALIZED_NAME_CREATION_STATEMENTS = "creation-statements";
  @SerializedName(SERIALIZED_NAME_CREATION_STATEMENTS)
  private String creationStatements;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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
  private Boolean secureAccessWeb;

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl;

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


  public GatewayCreateProducerPostgreSQL creationStatements(String creationStatements) {
    
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


  public GatewayCreateProducerPostgreSQL deleteProtection(String deleteProtection) {
    
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


  public GatewayCreateProducerPostgreSQL json(Boolean json) {
    
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


  public GatewayCreateProducerPostgreSQL name(String name) {
    
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


  public GatewayCreateProducerPostgreSQL postgresqlDbName(String postgresqlDbName) {
    
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


  public GatewayCreateProducerPostgreSQL postgresqlHost(String postgresqlHost) {
    
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


  public GatewayCreateProducerPostgreSQL postgresqlPassword(String postgresqlPassword) {
    
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


  public GatewayCreateProducerPostgreSQL postgresqlPort(String postgresqlPort) {
    
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


  public GatewayCreateProducerPostgreSQL postgresqlUsername(String postgresqlUsername) {
    
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


  public GatewayCreateProducerPostgreSQL producerEncryptionKey(String producerEncryptionKey) {
    
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


  public GatewayCreateProducerPostgreSQL revocationStatement(String revocationStatement) {
    
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


  public GatewayCreateProducerPostgreSQL secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Get secureAccessBastionIssuer
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayCreateProducerPostgreSQL secureAccessDbSchema(String secureAccessDbSchema) {
    
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

   /**
   * Get secureAccessDbSchema
   * @return secureAccessDbSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }


  public void setSecureAccessDbSchema(String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public GatewayCreateProducerPostgreSQL secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Get secureAccessEnable
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayCreateProducerPostgreSQL secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayCreateProducerPostgreSQL addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Get secureAccessHost
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public GatewayCreateProducerPostgreSQL secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Get secureAccessWeb
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayCreateProducerPostgreSQL ssl(Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * SSL connection mode
   * @return ssl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL connection mode")

  public Boolean getSsl() {
    return ssl;
  }


  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public GatewayCreateProducerPostgreSQL tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerPostgreSQL addTagsItem(String tagsItem) {
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


  public GatewayCreateProducerPostgreSQL targetName(String targetName) {
    
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


  public GatewayCreateProducerPostgreSQL token(String token) {
    
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


  public GatewayCreateProducerPostgreSQL uidToken(String uidToken) {
    
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


  public GatewayCreateProducerPostgreSQL userTtl(String userTtl) {
    
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
    GatewayCreateProducerPostgreSQL gatewayCreateProducerPostgreSQL = (GatewayCreateProducerPostgreSQL) o;
    return Objects.equals(this.creationStatements, gatewayCreateProducerPostgreSQL.creationStatements) &&
        Objects.equals(this.deleteProtection, gatewayCreateProducerPostgreSQL.deleteProtection) &&
        Objects.equals(this.json, gatewayCreateProducerPostgreSQL.json) &&
        Objects.equals(this.name, gatewayCreateProducerPostgreSQL.name) &&
        Objects.equals(this.postgresqlDbName, gatewayCreateProducerPostgreSQL.postgresqlDbName) &&
        Objects.equals(this.postgresqlHost, gatewayCreateProducerPostgreSQL.postgresqlHost) &&
        Objects.equals(this.postgresqlPassword, gatewayCreateProducerPostgreSQL.postgresqlPassword) &&
        Objects.equals(this.postgresqlPort, gatewayCreateProducerPostgreSQL.postgresqlPort) &&
        Objects.equals(this.postgresqlUsername, gatewayCreateProducerPostgreSQL.postgresqlUsername) &&
        Objects.equals(this.producerEncryptionKey, gatewayCreateProducerPostgreSQL.producerEncryptionKey) &&
        Objects.equals(this.revocationStatement, gatewayCreateProducerPostgreSQL.revocationStatement) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayCreateProducerPostgreSQL.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbSchema, gatewayCreateProducerPostgreSQL.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, gatewayCreateProducerPostgreSQL.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayCreateProducerPostgreSQL.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, gatewayCreateProducerPostgreSQL.secureAccessWeb) &&
        Objects.equals(this.ssl, gatewayCreateProducerPostgreSQL.ssl) &&
        Objects.equals(this.tags, gatewayCreateProducerPostgreSQL.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerPostgreSQL.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerPostgreSQL.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerPostgreSQL.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerPostgreSQL.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationStatements, deleteProtection, json, name, postgresqlDbName, postgresqlHost, postgresqlPassword, postgresqlPort, postgresqlUsername, producerEncryptionKey, revocationStatement, secureAccessBastionIssuer, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessWeb, ssl, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerPostgreSQL {\n");
    sb.append("    creationStatements: ").append(toIndentedString(creationStatements)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

