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
 * gatewayUpdateProducerMSSQL is a command that updates mssql producer
 */
@ApiModel(description = "gatewayUpdateProducerMSSQL is a command that updates mssql producer")

public class GatewayUpdateProducerMSSQL {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_MSSQL_CREATE_STATEMENTS = "mssql-create-statements";
  @SerializedName(SERIALIZED_NAME_MSSQL_CREATE_STATEMENTS)
  private String mssqlCreateStatements;

  public static final String SERIALIZED_NAME_MSSQL_DBNAME = "mssql-dbname";
  @SerializedName(SERIALIZED_NAME_MSSQL_DBNAME)
  private String mssqlDbname;

  public static final String SERIALIZED_NAME_MSSQL_HOST = "mssql-host";
  @SerializedName(SERIALIZED_NAME_MSSQL_HOST)
  private String mssqlHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_MSSQL_PASSWORD = "mssql-password";
  @SerializedName(SERIALIZED_NAME_MSSQL_PASSWORD)
  private String mssqlPassword;

  public static final String SERIALIZED_NAME_MSSQL_PORT = "mssql-port";
  @SerializedName(SERIALIZED_NAME_MSSQL_PORT)
  private String mssqlPort = "1433";

  public static final String SERIALIZED_NAME_MSSQL_REVOCATION_STATEMENTS = "mssql-revocation-statements";
  @SerializedName(SERIALIZED_NAME_MSSQL_REVOCATION_STATEMENTS)
  private String mssqlRevocationStatements;

  public static final String SERIALIZED_NAME_MSSQL_USERNAME = "mssql-username";
  @SerializedName(SERIALIZED_NAME_MSSQL_USERNAME)
  private String mssqlUsername;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

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


  public GatewayUpdateProducerMSSQL deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerMSSQL json(Boolean json) {
    
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


  public GatewayUpdateProducerMSSQL mssqlCreateStatements(String mssqlCreateStatements) {
    
    this.mssqlCreateStatements = mssqlCreateStatements;
    return this;
  }

   /**
   * MSSQL Creation statements
   * @return mssqlCreateStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Creation statements")

  public String getMssqlCreateStatements() {
    return mssqlCreateStatements;
  }


  public void setMssqlCreateStatements(String mssqlCreateStatements) {
    this.mssqlCreateStatements = mssqlCreateStatements;
  }


  public GatewayUpdateProducerMSSQL mssqlDbname(String mssqlDbname) {
    
    this.mssqlDbname = mssqlDbname;
    return this;
  }

   /**
   * MSSQL Name
   * @return mssqlDbname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Name")

  public String getMssqlDbname() {
    return mssqlDbname;
  }


  public void setMssqlDbname(String mssqlDbname) {
    this.mssqlDbname = mssqlDbname;
  }


  public GatewayUpdateProducerMSSQL mssqlHost(String mssqlHost) {
    
    this.mssqlHost = mssqlHost;
    return this;
  }

   /**
   * MSSQL Host
   * @return mssqlHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Host")

  public String getMssqlHost() {
    return mssqlHost;
  }


  public void setMssqlHost(String mssqlHost) {
    this.mssqlHost = mssqlHost;
  }


  public GatewayUpdateProducerMSSQL mssqlPassword(String mssqlPassword) {
    
    this.mssqlPassword = mssqlPassword;
    return this;
  }

   /**
   * MSSQL Password
   * @return mssqlPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Password")

  public String getMssqlPassword() {
    return mssqlPassword;
  }


  public void setMssqlPassword(String mssqlPassword) {
    this.mssqlPassword = mssqlPassword;
  }


  public GatewayUpdateProducerMSSQL mssqlPort(String mssqlPort) {
    
    this.mssqlPort = mssqlPort;
    return this;
  }

   /**
   * MSSQL Port
   * @return mssqlPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Port")

  public String getMssqlPort() {
    return mssqlPort;
  }


  public void setMssqlPort(String mssqlPort) {
    this.mssqlPort = mssqlPort;
  }


  public GatewayUpdateProducerMSSQL mssqlRevocationStatements(String mssqlRevocationStatements) {
    
    this.mssqlRevocationStatements = mssqlRevocationStatements;
    return this;
  }

   /**
   * MSSQL Revocation statements
   * @return mssqlRevocationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Revocation statements")

  public String getMssqlRevocationStatements() {
    return mssqlRevocationStatements;
  }


  public void setMssqlRevocationStatements(String mssqlRevocationStatements) {
    this.mssqlRevocationStatements = mssqlRevocationStatements;
  }


  public GatewayUpdateProducerMSSQL mssqlUsername(String mssqlUsername) {
    
    this.mssqlUsername = mssqlUsername;
    return this;
  }

   /**
   * MSSQL Username
   * @return mssqlUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MSSQL Username")

  public String getMssqlUsername() {
    return mssqlUsername;
  }


  public void setMssqlUsername(String mssqlUsername) {
    this.mssqlUsername = mssqlUsername;
  }


  public GatewayUpdateProducerMSSQL name(String name) {
    
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


  public GatewayUpdateProducerMSSQL newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Producer name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Producer name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerMSSQL producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerMSSQL secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public GatewayUpdateProducerMSSQL secureAccessDbSchema(String secureAccessDbSchema) {
    
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


  public GatewayUpdateProducerMSSQL secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayUpdateProducerMSSQL secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerMSSQL addSecureAccessHostItem(String secureAccessHostItem) {
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


  public GatewayUpdateProducerMSSQL secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public GatewayUpdateProducerMSSQL tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerMSSQL addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerMSSQL targetName(String targetName) {
    
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


  public GatewayUpdateProducerMSSQL token(String token) {
    
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


  public GatewayUpdateProducerMSSQL uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerMSSQL userTtl(String userTtl) {
    
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
    GatewayUpdateProducerMSSQL gatewayUpdateProducerMSSQL = (GatewayUpdateProducerMSSQL) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerMSSQL.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerMSSQL.json) &&
        Objects.equals(this.mssqlCreateStatements, gatewayUpdateProducerMSSQL.mssqlCreateStatements) &&
        Objects.equals(this.mssqlDbname, gatewayUpdateProducerMSSQL.mssqlDbname) &&
        Objects.equals(this.mssqlHost, gatewayUpdateProducerMSSQL.mssqlHost) &&
        Objects.equals(this.mssqlPassword, gatewayUpdateProducerMSSQL.mssqlPassword) &&
        Objects.equals(this.mssqlPort, gatewayUpdateProducerMSSQL.mssqlPort) &&
        Objects.equals(this.mssqlRevocationStatements, gatewayUpdateProducerMSSQL.mssqlRevocationStatements) &&
        Objects.equals(this.mssqlUsername, gatewayUpdateProducerMSSQL.mssqlUsername) &&
        Objects.equals(this.name, gatewayUpdateProducerMSSQL.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerMSSQL.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerMSSQL.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerMSSQL.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbSchema, gatewayUpdateProducerMSSQL.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerMSSQL.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerMSSQL.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerMSSQL.secureAccessWeb) &&
        Objects.equals(this.tags, gatewayUpdateProducerMSSQL.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerMSSQL.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerMSSQL.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerMSSQL.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerMSSQL.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, json, mssqlCreateStatements, mssqlDbname, mssqlHost, mssqlPassword, mssqlPort, mssqlRevocationStatements, mssqlUsername, name, newName, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerMSSQL {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    mssqlCreateStatements: ").append(toIndentedString(mssqlCreateStatements)).append("\n");
    sb.append("    mssqlDbname: ").append(toIndentedString(mssqlDbname)).append("\n");
    sb.append("    mssqlHost: ").append(toIndentedString(mssqlHost)).append("\n");
    sb.append("    mssqlPassword: ").append(toIndentedString(mssqlPassword)).append("\n");
    sb.append("    mssqlPort: ").append(toIndentedString(mssqlPort)).append("\n");
    sb.append("    mssqlRevocationStatements: ").append(toIndentedString(mssqlRevocationStatements)).append("\n");
    sb.append("    mssqlUsername: ").append(toIndentedString(mssqlUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

