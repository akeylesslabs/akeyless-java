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
 * dynamicSecretCreateOracleDb is a command that creates oracle db dynamic secret
 */
@ApiModel(description = "dynamicSecretCreateOracleDb is a command that creates oracle db dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretCreateOracleDb {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORACLE_HOST = "oracle-host";
  @SerializedName(SERIALIZED_NAME_ORACLE_HOST)
  private String oracleHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_ORACLE_PASSWORD = "oracle-password";
  @SerializedName(SERIALIZED_NAME_ORACLE_PASSWORD)
  private String oraclePassword;

  public static final String SERIALIZED_NAME_ORACLE_PORT = "oracle-port";
  @SerializedName(SERIALIZED_NAME_ORACLE_PORT)
  private String oraclePort = "1521";

  public static final String SERIALIZED_NAME_ORACLE_REVOCATION_STATEMENTS = "oracle-revocation-statements";
  @SerializedName(SERIALIZED_NAME_ORACLE_REVOCATION_STATEMENTS)
  private String oracleRevocationStatements;

  public static final String SERIALIZED_NAME_ORACLE_SCREATION_STATEMENTS = "oracle-screation-statements";
  @SerializedName(SERIALIZED_NAME_ORACLE_SCREATION_STATEMENTS)
  private String oracleScreationStatements;

  public static final String SERIALIZED_NAME_ORACLE_SERVICE_NAME = "oracle-service-name";
  @SerializedName(SERIALIZED_NAME_ORACLE_SERVICE_NAME)
  private String oracleServiceName;

  public static final String SERIALIZED_NAME_ORACLE_USERNAME = "oracle-username";
  @SerializedName(SERIALIZED_NAME_ORACLE_USERNAME)
  private String oracleUsername;

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
  private String secureAccessEnable = "false";

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = false;

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

  public DynamicSecretCreateOracleDb() { 
  }

  public DynamicSecretCreateOracleDb dbServerCertificates(String dbServerCertificates) {
    
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


  public DynamicSecretCreateOracleDb dbServerName(String dbServerName) {
    
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


  public DynamicSecretCreateOracleDb deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretCreateOracleDb description(String description) {
    
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


  public DynamicSecretCreateOracleDb json(Boolean json) {
    
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


  public DynamicSecretCreateOracleDb name(String name) {
    
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


  public DynamicSecretCreateOracleDb oracleHost(String oracleHost) {
    
    this.oracleHost = oracleHost;
    return this;
  }

   /**
   * Oracle Host
   * @return oracleHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Host")

  public String getOracleHost() {
    return oracleHost;
  }


  public void setOracleHost(String oracleHost) {
    this.oracleHost = oracleHost;
  }


  public DynamicSecretCreateOracleDb oraclePassword(String oraclePassword) {
    
    this.oraclePassword = oraclePassword;
    return this;
  }

   /**
   * Oracle Password
   * @return oraclePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Password")

  public String getOraclePassword() {
    return oraclePassword;
  }


  public void setOraclePassword(String oraclePassword) {
    this.oraclePassword = oraclePassword;
  }


  public DynamicSecretCreateOracleDb oraclePort(String oraclePort) {
    
    this.oraclePort = oraclePort;
    return this;
  }

   /**
   * Oracle Port
   * @return oraclePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Port")

  public String getOraclePort() {
    return oraclePort;
  }


  public void setOraclePort(String oraclePort) {
    this.oraclePort = oraclePort;
  }


  public DynamicSecretCreateOracleDb oracleRevocationStatements(String oracleRevocationStatements) {
    
    this.oracleRevocationStatements = oracleRevocationStatements;
    return this;
  }

   /**
   * Oracle Revocation statements
   * @return oracleRevocationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Revocation statements")

  public String getOracleRevocationStatements() {
    return oracleRevocationStatements;
  }


  public void setOracleRevocationStatements(String oracleRevocationStatements) {
    this.oracleRevocationStatements = oracleRevocationStatements;
  }


  public DynamicSecretCreateOracleDb oracleScreationStatements(String oracleScreationStatements) {
    
    this.oracleScreationStatements = oracleScreationStatements;
    return this;
  }

   /**
   * Oracle Creation statements
   * @return oracleScreationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Creation statements")

  public String getOracleScreationStatements() {
    return oracleScreationStatements;
  }


  public void setOracleScreationStatements(String oracleScreationStatements) {
    this.oracleScreationStatements = oracleScreationStatements;
  }


  public DynamicSecretCreateOracleDb oracleServiceName(String oracleServiceName) {
    
    this.oracleServiceName = oracleServiceName;
    return this;
  }

   /**
   * Oracle DB Name
   * @return oracleServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle DB Name")

  public String getOracleServiceName() {
    return oracleServiceName;
  }


  public void setOracleServiceName(String oracleServiceName) {
    this.oracleServiceName = oracleServiceName;
  }


  public DynamicSecretCreateOracleDb oracleUsername(String oracleUsername) {
    
    this.oracleUsername = oracleUsername;
    return this;
  }

   /**
   * Oracle Username
   * @return oracleUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle Username")

  public String getOracleUsername() {
    return oracleUsername;
  }


  public void setOracleUsername(String oracleUsername) {
    this.oracleUsername = oracleUsername;
  }


  public DynamicSecretCreateOracleDb passwordLength(String passwordLength) {
    
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


  public DynamicSecretCreateOracleDb producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretCreateOracleDb secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public DynamicSecretCreateOracleDb secureAccessEnable(String secureAccessEnable) {
    
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


  public DynamicSecretCreateOracleDb secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public DynamicSecretCreateOracleDb addSecureAccessHostItem(String secureAccessHostItem) {
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


  public DynamicSecretCreateOracleDb secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public DynamicSecretCreateOracleDb tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateOracleDb addTagsItem(String tagsItem) {
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


  public DynamicSecretCreateOracleDb targetName(String targetName) {
    
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


  public DynamicSecretCreateOracleDb token(String token) {
    
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


  public DynamicSecretCreateOracleDb uidToken(String uidToken) {
    
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


  public DynamicSecretCreateOracleDb userTtl(String userTtl) {
    
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
    DynamicSecretCreateOracleDb dynamicSecretCreateOracleDb = (DynamicSecretCreateOracleDb) o;
    return Objects.equals(this.dbServerCertificates, dynamicSecretCreateOracleDb.dbServerCertificates) &&
        Objects.equals(this.dbServerName, dynamicSecretCreateOracleDb.dbServerName) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateOracleDb.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateOracleDb.description) &&
        Objects.equals(this.json, dynamicSecretCreateOracleDb.json) &&
        Objects.equals(this.name, dynamicSecretCreateOracleDb.name) &&
        Objects.equals(this.oracleHost, dynamicSecretCreateOracleDb.oracleHost) &&
        Objects.equals(this.oraclePassword, dynamicSecretCreateOracleDb.oraclePassword) &&
        Objects.equals(this.oraclePort, dynamicSecretCreateOracleDb.oraclePort) &&
        Objects.equals(this.oracleRevocationStatements, dynamicSecretCreateOracleDb.oracleRevocationStatements) &&
        Objects.equals(this.oracleScreationStatements, dynamicSecretCreateOracleDb.oracleScreationStatements) &&
        Objects.equals(this.oracleServiceName, dynamicSecretCreateOracleDb.oracleServiceName) &&
        Objects.equals(this.oracleUsername, dynamicSecretCreateOracleDb.oracleUsername) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateOracleDb.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretCreateOracleDb.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, dynamicSecretCreateOracleDb.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretCreateOracleDb.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, dynamicSecretCreateOracleDb.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretCreateOracleDb.secureAccessWeb) &&
        Objects.equals(this.tags, dynamicSecretCreateOracleDb.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateOracleDb.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateOracleDb.token) &&
        Objects.equals(this.uidToken, dynamicSecretCreateOracleDb.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretCreateOracleDb.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServerCertificates, dbServerName, deleteProtection, description, json, name, oracleHost, oraclePassword, oraclePort, oracleRevocationStatements, oracleScreationStatements, oracleServiceName, oracleUsername, passwordLength, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateOracleDb {\n");
    sb.append("    dbServerCertificates: ").append(toIndentedString(dbServerCertificates)).append("\n");
    sb.append("    dbServerName: ").append(toIndentedString(dbServerName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oracleHost: ").append(toIndentedString(oracleHost)).append("\n");
    sb.append("    oraclePassword: ").append(toIndentedString(oraclePassword)).append("\n");
    sb.append("    oraclePort: ").append(toIndentedString(oraclePort)).append("\n");
    sb.append("    oracleRevocationStatements: ").append(toIndentedString(oracleRevocationStatements)).append("\n");
    sb.append("    oracleScreationStatements: ").append(toIndentedString(oracleScreationStatements)).append("\n");
    sb.append("    oracleServiceName: ").append(toIndentedString(oracleServiceName)).append("\n");
    sb.append("    oracleUsername: ").append(toIndentedString(oracleUsername)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
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

