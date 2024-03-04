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
 * dynamicSecretUpdateMySql is a command that updates mysql dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateMySql is a command that updates mysql dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateMySql {
  public static final String SERIALIZED_NAME_DB_SERVER_CERTIFICATES = "db-server-certificates";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_CERTIFICATES)
  private String dbServerCertificates;

  public static final String SERIALIZED_NAME_DB_SERVER_NAME = "db-server-name";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_NAME)
  private String dbServerName;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_MYSQL_DBNAME = "mysql-dbname";
  @SerializedName(SERIALIZED_NAME_MYSQL_DBNAME)
  private String mysqlDbname;

  public static final String SERIALIZED_NAME_MYSQL_HOST = "mysql-host";
  @SerializedName(SERIALIZED_NAME_MYSQL_HOST)
  private String mysqlHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_MYSQL_PASSWORD = "mysql-password";
  @SerializedName(SERIALIZED_NAME_MYSQL_PASSWORD)
  private String mysqlPassword;

  public static final String SERIALIZED_NAME_MYSQL_PORT = "mysql-port";
  @SerializedName(SERIALIZED_NAME_MYSQL_PORT)
  private String mysqlPort = "3306";

  public static final String SERIALIZED_NAME_MYSQL_REVOCATION_STATEMENTS = "mysql-revocation-statements";
  @SerializedName(SERIALIZED_NAME_MYSQL_REVOCATION_STATEMENTS)
  private String mysqlRevocationStatements;

  public static final String SERIALIZED_NAME_MYSQL_SCREATION_STATEMENTS = "mysql-screation-statements";
  @SerializedName(SERIALIZED_NAME_MYSQL_SCREATION_STATEMENTS)
  private String mysqlScreationStatements;

  public static final String SERIALIZED_NAME_MYSQL_USERNAME = "mysql-username";
  @SerializedName(SERIALIZED_NAME_MYSQL_USERNAME)
  private String mysqlUsername;

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

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

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

  public DynamicSecretUpdateMySql() { 
  }

  public DynamicSecretUpdateMySql dbServerCertificates(String dbServerCertificates) {
    
    this.dbServerCertificates = dbServerCertificates;
    return this;
  }

   /**
   * (Optional) DB server certificates
   * @return dbServerCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) DB server certificates")

  public String getDbServerCertificates() {
    return dbServerCertificates;
  }


  public void setDbServerCertificates(String dbServerCertificates) {
    this.dbServerCertificates = dbServerCertificates;
  }


  public DynamicSecretUpdateMySql dbServerName(String dbServerName) {
    
    this.dbServerName = dbServerName;
    return this;
  }

   /**
   * (Optional) Server name for certificate verification
   * @return dbServerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) Server name for certificate verification")

  public String getDbServerName() {
    return dbServerName;
  }


  public void setDbServerName(String dbServerName) {
    this.dbServerName = dbServerName;
  }


  public DynamicSecretUpdateMySql deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretUpdateMySql description(String description) {
    
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


  public DynamicSecretUpdateMySql json(Boolean json) {
    
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


  public DynamicSecretUpdateMySql mysqlDbname(String mysqlDbname) {
    
    this.mysqlDbname = mysqlDbname;
    return this;
  }

   /**
   * MySQL DB Name
   * @return mysqlDbname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL DB Name")

  public String getMysqlDbname() {
    return mysqlDbname;
  }


  public void setMysqlDbname(String mysqlDbname) {
    this.mysqlDbname = mysqlDbname;
  }


  public DynamicSecretUpdateMySql mysqlHost(String mysqlHost) {
    
    this.mysqlHost = mysqlHost;
    return this;
  }

   /**
   * MySQL Host
   * @return mysqlHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Host")

  public String getMysqlHost() {
    return mysqlHost;
  }


  public void setMysqlHost(String mysqlHost) {
    this.mysqlHost = mysqlHost;
  }


  public DynamicSecretUpdateMySql mysqlPassword(String mysqlPassword) {
    
    this.mysqlPassword = mysqlPassword;
    return this;
  }

   /**
   * MySQL Password
   * @return mysqlPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Password")

  public String getMysqlPassword() {
    return mysqlPassword;
  }


  public void setMysqlPassword(String mysqlPassword) {
    this.mysqlPassword = mysqlPassword;
  }


  public DynamicSecretUpdateMySql mysqlPort(String mysqlPort) {
    
    this.mysqlPort = mysqlPort;
    return this;
  }

   /**
   * MySQL Port
   * @return mysqlPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Port")

  public String getMysqlPort() {
    return mysqlPort;
  }


  public void setMysqlPort(String mysqlPort) {
    this.mysqlPort = mysqlPort;
  }


  public DynamicSecretUpdateMySql mysqlRevocationStatements(String mysqlRevocationStatements) {
    
    this.mysqlRevocationStatements = mysqlRevocationStatements;
    return this;
  }

   /**
   * MySQL Revocation statements
   * @return mysqlRevocationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Revocation statements")

  public String getMysqlRevocationStatements() {
    return mysqlRevocationStatements;
  }


  public void setMysqlRevocationStatements(String mysqlRevocationStatements) {
    this.mysqlRevocationStatements = mysqlRevocationStatements;
  }


  public DynamicSecretUpdateMySql mysqlScreationStatements(String mysqlScreationStatements) {
    
    this.mysqlScreationStatements = mysqlScreationStatements;
    return this;
  }

   /**
   * MySQL Creation statements
   * @return mysqlScreationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Creation statements")

  public String getMysqlScreationStatements() {
    return mysqlScreationStatements;
  }


  public void setMysqlScreationStatements(String mysqlScreationStatements) {
    this.mysqlScreationStatements = mysqlScreationStatements;
  }


  public DynamicSecretUpdateMySql mysqlUsername(String mysqlUsername) {
    
    this.mysqlUsername = mysqlUsername;
    return this;
  }

   /**
   * MySQL Username
   * @return mysqlUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Username")

  public String getMysqlUsername() {
    return mysqlUsername;
  }


  public void setMysqlUsername(String mysqlUsername) {
    this.mysqlUsername = mysqlUsername;
  }


  public DynamicSecretUpdateMySql name(String name) {
    
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


  public DynamicSecretUpdateMySql newName(String newName) {
    
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


  public DynamicSecretUpdateMySql passwordLength(String passwordLength) {
    
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


  public DynamicSecretUpdateMySql producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretUpdateMySql secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public DynamicSecretUpdateMySql secureAccessEnable(String secureAccessEnable) {
    
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


  public DynamicSecretUpdateMySql secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public DynamicSecretUpdateMySql addSecureAccessHostItem(String secureAccessHostItem) {
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


  public DynamicSecretUpdateMySql secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public DynamicSecretUpdateMySql ssl(Boolean ssl) {
    
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


  public DynamicSecretUpdateMySql sslCertificate(String sslCertificate) {
    
    this.sslCertificate = sslCertificate;
    return this;
  }

   /**
   * SSL connection certificate
   * @return sslCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL connection certificate")

  public String getSslCertificate() {
    return sslCertificate;
  }


  public void setSslCertificate(String sslCertificate) {
    this.sslCertificate = sslCertificate;
  }


  public DynamicSecretUpdateMySql tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateMySql addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdateMySql targetName(String targetName) {
    
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


  public DynamicSecretUpdateMySql token(String token) {
    
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


  public DynamicSecretUpdateMySql uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateMySql userTtl(String userTtl) {
    
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
    DynamicSecretUpdateMySql dynamicSecretUpdateMySql = (DynamicSecretUpdateMySql) o;
    return Objects.equals(this.dbServerCertificates, dynamicSecretUpdateMySql.dbServerCertificates) &&
        Objects.equals(this.dbServerName, dynamicSecretUpdateMySql.dbServerName) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdateMySql.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateMySql.description) &&
        Objects.equals(this.json, dynamicSecretUpdateMySql.json) &&
        Objects.equals(this.mysqlDbname, dynamicSecretUpdateMySql.mysqlDbname) &&
        Objects.equals(this.mysqlHost, dynamicSecretUpdateMySql.mysqlHost) &&
        Objects.equals(this.mysqlPassword, dynamicSecretUpdateMySql.mysqlPassword) &&
        Objects.equals(this.mysqlPort, dynamicSecretUpdateMySql.mysqlPort) &&
        Objects.equals(this.mysqlRevocationStatements, dynamicSecretUpdateMySql.mysqlRevocationStatements) &&
        Objects.equals(this.mysqlScreationStatements, dynamicSecretUpdateMySql.mysqlScreationStatements) &&
        Objects.equals(this.mysqlUsername, dynamicSecretUpdateMySql.mysqlUsername) &&
        Objects.equals(this.name, dynamicSecretUpdateMySql.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateMySql.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateMySql.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateMySql.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, dynamicSecretUpdateMySql.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdateMySql.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, dynamicSecretUpdateMySql.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdateMySql.secureAccessWeb) &&
        Objects.equals(this.ssl, dynamicSecretUpdateMySql.ssl) &&
        Objects.equals(this.sslCertificate, dynamicSecretUpdateMySql.sslCertificate) &&
        Objects.equals(this.tags, dynamicSecretUpdateMySql.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateMySql.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateMySql.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateMySql.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateMySql.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServerCertificates, dbServerName, deleteProtection, description, json, mysqlDbname, mysqlHost, mysqlPassword, mysqlPort, mysqlRevocationStatements, mysqlScreationStatements, mysqlUsername, name, newName, passwordLength, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessWeb, ssl, sslCertificate, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateMySql {\n");
    sb.append("    dbServerCertificates: ").append(toIndentedString(dbServerCertificates)).append("\n");
    sb.append("    dbServerName: ").append(toIndentedString(dbServerName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    mysqlDbname: ").append(toIndentedString(mysqlDbname)).append("\n");
    sb.append("    mysqlHost: ").append(toIndentedString(mysqlHost)).append("\n");
    sb.append("    mysqlPassword: ").append(toIndentedString(mysqlPassword)).append("\n");
    sb.append("    mysqlPort: ").append(toIndentedString(mysqlPort)).append("\n");
    sb.append("    mysqlRevocationStatements: ").append(toIndentedString(mysqlRevocationStatements)).append("\n");
    sb.append("    mysqlScreationStatements: ").append(toIndentedString(mysqlScreationStatements)).append("\n");
    sb.append("    mysqlUsername: ").append(toIndentedString(mysqlUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
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

