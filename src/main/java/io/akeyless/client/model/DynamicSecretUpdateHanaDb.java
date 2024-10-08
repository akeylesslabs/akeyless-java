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
 * dynamicSecretUpdateHanaDb is a command that updates hanadb dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateHanaDb is a command that updates hanadb dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateHanaDb {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HANA_DBNAME = "hana-dbname";
  @SerializedName(SERIALIZED_NAME_HANA_DBNAME)
  private String hanaDbname;

  public static final String SERIALIZED_NAME_HANADB_CREATE_STATEMENTS = "hanadb-create-statements";
  @SerializedName(SERIALIZED_NAME_HANADB_CREATE_STATEMENTS)
  private String hanadbCreateStatements;

  public static final String SERIALIZED_NAME_HANADB_HOST = "hanadb-host";
  @SerializedName(SERIALIZED_NAME_HANADB_HOST)
  private String hanadbHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_HANADB_PASSWORD = "hanadb-password";
  @SerializedName(SERIALIZED_NAME_HANADB_PASSWORD)
  private String hanadbPassword;

  public static final String SERIALIZED_NAME_HANADB_PORT = "hanadb-port";
  @SerializedName(SERIALIZED_NAME_HANADB_PORT)
  private String hanadbPort = "443";

  public static final String SERIALIZED_NAME_HANADB_REVOCATION_STATEMENTS = "hanadb-revocation-statements";
  @SerializedName(SERIALIZED_NAME_HANADB_REVOCATION_STATEMENTS)
  private String hanadbRevocationStatements;

  public static final String SERIALIZED_NAME_HANADB_USERNAME = "hanadb-username";
  @SerializedName(SERIALIZED_NAME_HANADB_USERNAME)
  private String hanadbUsername;

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

  public DynamicSecretUpdateHanaDb() { 
  }

  public DynamicSecretUpdateHanaDb deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretUpdateHanaDb description(String description) {
    
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


  public DynamicSecretUpdateHanaDb hanaDbname(String hanaDbname) {
    
    this.hanaDbname = hanaDbname;
    return this;
  }

   /**
   * HanaDb Name
   * @return hanaDbname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Name")

  public String getHanaDbname() {
    return hanaDbname;
  }


  public void setHanaDbname(String hanaDbname) {
    this.hanaDbname = hanaDbname;
  }


  public DynamicSecretUpdateHanaDb hanadbCreateStatements(String hanadbCreateStatements) {
    
    this.hanadbCreateStatements = hanadbCreateStatements;
    return this;
  }

   /**
   * HanaDb Creation statements
   * @return hanadbCreateStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Creation statements")

  public String getHanadbCreateStatements() {
    return hanadbCreateStatements;
  }


  public void setHanadbCreateStatements(String hanadbCreateStatements) {
    this.hanadbCreateStatements = hanadbCreateStatements;
  }


  public DynamicSecretUpdateHanaDb hanadbHost(String hanadbHost) {
    
    this.hanadbHost = hanadbHost;
    return this;
  }

   /**
   * HanaDb Host
   * @return hanadbHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Host")

  public String getHanadbHost() {
    return hanadbHost;
  }


  public void setHanadbHost(String hanadbHost) {
    this.hanadbHost = hanadbHost;
  }


  public DynamicSecretUpdateHanaDb hanadbPassword(String hanadbPassword) {
    
    this.hanadbPassword = hanadbPassword;
    return this;
  }

   /**
   * HanaDb Password
   * @return hanadbPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Password")

  public String getHanadbPassword() {
    return hanadbPassword;
  }


  public void setHanadbPassword(String hanadbPassword) {
    this.hanadbPassword = hanadbPassword;
  }


  public DynamicSecretUpdateHanaDb hanadbPort(String hanadbPort) {
    
    this.hanadbPort = hanadbPort;
    return this;
  }

   /**
   * HanaDb Port
   * @return hanadbPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Port")

  public String getHanadbPort() {
    return hanadbPort;
  }


  public void setHanadbPort(String hanadbPort) {
    this.hanadbPort = hanadbPort;
  }


  public DynamicSecretUpdateHanaDb hanadbRevocationStatements(String hanadbRevocationStatements) {
    
    this.hanadbRevocationStatements = hanadbRevocationStatements;
    return this;
  }

   /**
   * HanaDb Revocation statements
   * @return hanadbRevocationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Revocation statements")

  public String getHanadbRevocationStatements() {
    return hanadbRevocationStatements;
  }


  public void setHanadbRevocationStatements(String hanadbRevocationStatements) {
    this.hanadbRevocationStatements = hanadbRevocationStatements;
  }


  public DynamicSecretUpdateHanaDb hanadbUsername(String hanadbUsername) {
    
    this.hanadbUsername = hanadbUsername;
    return this;
  }

   /**
   * HanaDb Username
   * @return hanadbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HanaDb Username")

  public String getHanadbUsername() {
    return hanadbUsername;
  }


  public void setHanadbUsername(String hanadbUsername) {
    this.hanadbUsername = hanadbUsername;
  }


  public DynamicSecretUpdateHanaDb json(Boolean json) {
    
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


  public DynamicSecretUpdateHanaDb name(String name) {
    
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


  public DynamicSecretUpdateHanaDb newName(String newName) {
    
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


  public DynamicSecretUpdateHanaDb passwordLength(String passwordLength) {
    
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


  public DynamicSecretUpdateHanaDb producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretUpdateHanaDb secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public DynamicSecretUpdateHanaDb secureAccessDbSchema(String secureAccessDbSchema) {
    
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


  public DynamicSecretUpdateHanaDb secureAccessEnable(String secureAccessEnable) {
    
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


  public DynamicSecretUpdateHanaDb secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public DynamicSecretUpdateHanaDb addSecureAccessHostItem(String secureAccessHostItem) {
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


  public DynamicSecretUpdateHanaDb secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public DynamicSecretUpdateHanaDb tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateHanaDb addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdateHanaDb targetName(String targetName) {
    
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


  public DynamicSecretUpdateHanaDb token(String token) {
    
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


  public DynamicSecretUpdateHanaDb uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateHanaDb userTtl(String userTtl) {
    
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
    DynamicSecretUpdateHanaDb dynamicSecretUpdateHanaDb = (DynamicSecretUpdateHanaDb) o;
    return Objects.equals(this.deleteProtection, dynamicSecretUpdateHanaDb.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateHanaDb.description) &&
        Objects.equals(this.hanaDbname, dynamicSecretUpdateHanaDb.hanaDbname) &&
        Objects.equals(this.hanadbCreateStatements, dynamicSecretUpdateHanaDb.hanadbCreateStatements) &&
        Objects.equals(this.hanadbHost, dynamicSecretUpdateHanaDb.hanadbHost) &&
        Objects.equals(this.hanadbPassword, dynamicSecretUpdateHanaDb.hanadbPassword) &&
        Objects.equals(this.hanadbPort, dynamicSecretUpdateHanaDb.hanadbPort) &&
        Objects.equals(this.hanadbRevocationStatements, dynamicSecretUpdateHanaDb.hanadbRevocationStatements) &&
        Objects.equals(this.hanadbUsername, dynamicSecretUpdateHanaDb.hanadbUsername) &&
        Objects.equals(this.json, dynamicSecretUpdateHanaDb.json) &&
        Objects.equals(this.name, dynamicSecretUpdateHanaDb.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateHanaDb.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateHanaDb.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateHanaDb.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, dynamicSecretUpdateHanaDb.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbSchema, dynamicSecretUpdateHanaDb.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdateHanaDb.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, dynamicSecretUpdateHanaDb.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdateHanaDb.secureAccessWeb) &&
        Objects.equals(this.tags, dynamicSecretUpdateHanaDb.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateHanaDb.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateHanaDb.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateHanaDb.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateHanaDb.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, hanaDbname, hanadbCreateStatements, hanadbHost, hanadbPassword, hanadbPort, hanadbRevocationStatements, hanadbUsername, json, name, newName, passwordLength, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateHanaDb {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hanaDbname: ").append(toIndentedString(hanaDbname)).append("\n");
    sb.append("    hanadbCreateStatements: ").append(toIndentedString(hanadbCreateStatements)).append("\n");
    sb.append("    hanadbHost: ").append(toIndentedString(hanadbHost)).append("\n");
    sb.append("    hanadbPassword: ").append(toIndentedString(hanadbPassword)).append("\n");
    sb.append("    hanadbPort: ").append(toIndentedString(hanadbPort)).append("\n");
    sb.append("    hanadbRevocationStatements: ").append(toIndentedString(hanadbRevocationStatements)).append("\n");
    sb.append("    hanadbUsername: ").append(toIndentedString(hanadbUsername)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessDbSchema: ").append(toIndentedString(secureAccessDbSchema)).append("\n");
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

