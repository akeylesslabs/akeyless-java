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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * dynamicSecretUpdateMsSql is a command that updates mssql dynamic secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretUpdateMsSql {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_MSSQL_CREATE_STATEMENTS = "mssql-create-statements";
  @SerializedName(SERIALIZED_NAME_MSSQL_CREATE_STATEMENTS)
  @javax.annotation.Nullable
  private String mssqlCreateStatements;

  public static final String SERIALIZED_NAME_MSSQL_DBNAME = "mssql-dbname";
  @SerializedName(SERIALIZED_NAME_MSSQL_DBNAME)
  @javax.annotation.Nullable
  private String mssqlDbname;

  public static final String SERIALIZED_NAME_MSSQL_HOST = "mssql-host";
  @SerializedName(SERIALIZED_NAME_MSSQL_HOST)
  @javax.annotation.Nullable
  private String mssqlHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_MSSQL_PASSWORD = "mssql-password";
  @SerializedName(SERIALIZED_NAME_MSSQL_PASSWORD)
  @javax.annotation.Nullable
  private String mssqlPassword;

  public static final String SERIALIZED_NAME_MSSQL_PORT = "mssql-port";
  @SerializedName(SERIALIZED_NAME_MSSQL_PORT)
  @javax.annotation.Nullable
  private String mssqlPort = "1433";

  public static final String SERIALIZED_NAME_MSSQL_REVOCATION_STATEMENTS = "mssql-revocation-statements";
  @SerializedName(SERIALIZED_NAME_MSSQL_REVOCATION_STATEMENTS)
  @javax.annotation.Nullable
  private String mssqlRevocationStatements;

  public static final String SERIALIZED_NAME_MSSQL_USERNAME = "mssql-username";
  @SerializedName(SERIALIZED_NAME_MSSQL_USERNAME)
  @javax.annotation.Nullable
  private String mssqlUsername;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  @javax.annotation.Nullable
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CERTIFICATE_ISSUER = "secure-access-certificate-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CERTIFICATE_ISSUER)
  @javax.annotation.Nullable
  private String secureAccessCertificateIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA = "secure-access-db-schema";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA)
  @javax.annotation.Nullable
  private String secureAccessDbSchema;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DELAY = "secure-access-delay";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DELAY)
  @javax.annotation.Nullable
  private Long secureAccessDelay;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  @javax.annotation.Nullable
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  @javax.annotation.Nullable
  private List<String> secureAccessHost = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  @javax.annotation.Nullable
  private Boolean secureAccessWeb = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public DynamicSecretUpdateMsSql() {
  }

  public DynamicSecretUpdateMsSql deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateMsSql description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public DynamicSecretUpdateMsSql json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public DynamicSecretUpdateMsSql mssqlCreateStatements(@javax.annotation.Nullable String mssqlCreateStatements) {
    this.mssqlCreateStatements = mssqlCreateStatements;
    return this;
  }

  /**
   * MSSQL Creation statements
   * @return mssqlCreateStatements
   */
  @javax.annotation.Nullable
  public String getMssqlCreateStatements() {
    return mssqlCreateStatements;
  }

  public void setMssqlCreateStatements(@javax.annotation.Nullable String mssqlCreateStatements) {
    this.mssqlCreateStatements = mssqlCreateStatements;
  }


  public DynamicSecretUpdateMsSql mssqlDbname(@javax.annotation.Nullable String mssqlDbname) {
    this.mssqlDbname = mssqlDbname;
    return this;
  }

  /**
   * MSSQL Name
   * @return mssqlDbname
   */
  @javax.annotation.Nullable
  public String getMssqlDbname() {
    return mssqlDbname;
  }

  public void setMssqlDbname(@javax.annotation.Nullable String mssqlDbname) {
    this.mssqlDbname = mssqlDbname;
  }


  public DynamicSecretUpdateMsSql mssqlHost(@javax.annotation.Nullable String mssqlHost) {
    this.mssqlHost = mssqlHost;
    return this;
  }

  /**
   * MSSQL Host
   * @return mssqlHost
   */
  @javax.annotation.Nullable
  public String getMssqlHost() {
    return mssqlHost;
  }

  public void setMssqlHost(@javax.annotation.Nullable String mssqlHost) {
    this.mssqlHost = mssqlHost;
  }


  public DynamicSecretUpdateMsSql mssqlPassword(@javax.annotation.Nullable String mssqlPassword) {
    this.mssqlPassword = mssqlPassword;
    return this;
  }

  /**
   * MSSQL Password
   * @return mssqlPassword
   */
  @javax.annotation.Nullable
  public String getMssqlPassword() {
    return mssqlPassword;
  }

  public void setMssqlPassword(@javax.annotation.Nullable String mssqlPassword) {
    this.mssqlPassword = mssqlPassword;
  }


  public DynamicSecretUpdateMsSql mssqlPort(@javax.annotation.Nullable String mssqlPort) {
    this.mssqlPort = mssqlPort;
    return this;
  }

  /**
   * MSSQL Port
   * @return mssqlPort
   */
  @javax.annotation.Nullable
  public String getMssqlPort() {
    return mssqlPort;
  }

  public void setMssqlPort(@javax.annotation.Nullable String mssqlPort) {
    this.mssqlPort = mssqlPort;
  }


  public DynamicSecretUpdateMsSql mssqlRevocationStatements(@javax.annotation.Nullable String mssqlRevocationStatements) {
    this.mssqlRevocationStatements = mssqlRevocationStatements;
    return this;
  }

  /**
   * MSSQL Revocation statements
   * @return mssqlRevocationStatements
   */
  @javax.annotation.Nullable
  public String getMssqlRevocationStatements() {
    return mssqlRevocationStatements;
  }

  public void setMssqlRevocationStatements(@javax.annotation.Nullable String mssqlRevocationStatements) {
    this.mssqlRevocationStatements = mssqlRevocationStatements;
  }


  public DynamicSecretUpdateMsSql mssqlUsername(@javax.annotation.Nullable String mssqlUsername) {
    this.mssqlUsername = mssqlUsername;
    return this;
  }

  /**
   * MSSQL Username
   * @return mssqlUsername
   */
  @javax.annotation.Nullable
  public String getMssqlUsername() {
    return mssqlUsername;
  }

  public void setMssqlUsername(@javax.annotation.Nullable String mssqlUsername) {
    this.mssqlUsername = mssqlUsername;
  }


  public DynamicSecretUpdateMsSql name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DynamicSecretUpdateMsSql newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Dynamic secret name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateMsSql passwordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
    return this;
  }

  /**
   * The length of the password to be generated
   * @return passwordLength
   */
  @javax.annotation.Nullable
  public String getPasswordLength() {
    return passwordLength;
  }

  public void setPasswordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretUpdateMsSql producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretUpdateMsSql secureAccessBastionIssuer(@javax.annotation.Nullable String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

  /**
   * Deprecated. use secure-access-certificate-issuer
   * @return secureAccessBastionIssuer
   */
  @javax.annotation.Nullable
  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }

  public void setSecureAccessBastionIssuer(@javax.annotation.Nullable String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public DynamicSecretUpdateMsSql secureAccessCertificateIssuer(@javax.annotation.Nullable String secureAccessCertificateIssuer) {
    this.secureAccessCertificateIssuer = secureAccessCertificateIssuer;
    return this;
  }

  /**
   * Path to the SSH Certificate Issuer for your Akeyless Secure Access
   * @return secureAccessCertificateIssuer
   */
  @javax.annotation.Nullable
  public String getSecureAccessCertificateIssuer() {
    return secureAccessCertificateIssuer;
  }

  public void setSecureAccessCertificateIssuer(@javax.annotation.Nullable String secureAccessCertificateIssuer) {
    this.secureAccessCertificateIssuer = secureAccessCertificateIssuer;
  }


  public DynamicSecretUpdateMsSql secureAccessDbSchema(@javax.annotation.Nullable String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

  /**
   * The DB schema
   * @return secureAccessDbSchema
   */
  @javax.annotation.Nullable
  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }

  public void setSecureAccessDbSchema(@javax.annotation.Nullable String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public DynamicSecretUpdateMsSql secureAccessDelay(@javax.annotation.Nullable Long secureAccessDelay) {
    this.secureAccessDelay = secureAccessDelay;
    return this;
  }

  /**
   * The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds
   * @return secureAccessDelay
   */
  @javax.annotation.Nullable
  public Long getSecureAccessDelay() {
    return secureAccessDelay;
  }

  public void setSecureAccessDelay(@javax.annotation.Nullable Long secureAccessDelay) {
    this.secureAccessDelay = secureAccessDelay;
  }


  public DynamicSecretUpdateMsSql secureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

  /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
   */
  @javax.annotation.Nullable
  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }

  public void setSecureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public DynamicSecretUpdateMsSql secureAccessHost(@javax.annotation.Nullable List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public DynamicSecretUpdateMsSql addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

  /**
   * Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts)
   * @return secureAccessHost
   */
  @javax.annotation.Nullable
  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }

  public void setSecureAccessHost(@javax.annotation.Nullable List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public DynamicSecretUpdateMsSql secureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

  /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }

  public void setSecureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public DynamicSecretUpdateMsSql tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateMsSql addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretUpdateMsSql targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretUpdateMsSql token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public DynamicSecretUpdateMsSql uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }


  public DynamicSecretUpdateMsSql userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
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
    DynamicSecretUpdateMsSql dynamicSecretUpdateMsSql = (DynamicSecretUpdateMsSql) o;
    return Objects.equals(this.deleteProtection, dynamicSecretUpdateMsSql.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateMsSql.description) &&
        Objects.equals(this.json, dynamicSecretUpdateMsSql.json) &&
        Objects.equals(this.mssqlCreateStatements, dynamicSecretUpdateMsSql.mssqlCreateStatements) &&
        Objects.equals(this.mssqlDbname, dynamicSecretUpdateMsSql.mssqlDbname) &&
        Objects.equals(this.mssqlHost, dynamicSecretUpdateMsSql.mssqlHost) &&
        Objects.equals(this.mssqlPassword, dynamicSecretUpdateMsSql.mssqlPassword) &&
        Objects.equals(this.mssqlPort, dynamicSecretUpdateMsSql.mssqlPort) &&
        Objects.equals(this.mssqlRevocationStatements, dynamicSecretUpdateMsSql.mssqlRevocationStatements) &&
        Objects.equals(this.mssqlUsername, dynamicSecretUpdateMsSql.mssqlUsername) &&
        Objects.equals(this.name, dynamicSecretUpdateMsSql.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateMsSql.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateMsSql.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateMsSql.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, dynamicSecretUpdateMsSql.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessCertificateIssuer, dynamicSecretUpdateMsSql.secureAccessCertificateIssuer) &&
        Objects.equals(this.secureAccessDbSchema, dynamicSecretUpdateMsSql.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessDelay, dynamicSecretUpdateMsSql.secureAccessDelay) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdateMsSql.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, dynamicSecretUpdateMsSql.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdateMsSql.secureAccessWeb) &&
        Objects.equals(this.tags, dynamicSecretUpdateMsSql.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateMsSql.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateMsSql.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateMsSql.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateMsSql.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, json, mssqlCreateStatements, mssqlDbname, mssqlHost, mssqlPassword, mssqlPort, mssqlRevocationStatements, mssqlUsername, name, newName, passwordLength, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessCertificateIssuer, secureAccessDbSchema, secureAccessDelay, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateMsSql {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessCertificateIssuer: ").append(toIndentedString(secureAccessCertificateIssuer)).append("\n");
    sb.append("    secureAccessDbSchema: ").append(toIndentedString(secureAccessDbSchema)).append("\n");
    sb.append("    secureAccessDelay: ").append(toIndentedString(secureAccessDelay)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("mssql-create-statements");
    openapiFields.add("mssql-dbname");
    openapiFields.add("mssql-host");
    openapiFields.add("mssql-password");
    openapiFields.add("mssql-port");
    openapiFields.add("mssql-revocation-statements");
    openapiFields.add("mssql-username");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("password-length");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("secure-access-bastion-issuer");
    openapiFields.add("secure-access-certificate-issuer");
    openapiFields.add("secure-access-db-schema");
    openapiFields.add("secure-access-delay");
    openapiFields.add("secure-access-enable");
    openapiFields.add("secure-access-host");
    openapiFields.add("secure-access-web");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretUpdateMsSql
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretUpdateMsSql.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretUpdateMsSql is not found in the empty JSON string", DynamicSecretUpdateMsSql.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretUpdateMsSql.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretUpdateMsSql` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicSecretUpdateMsSql.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mssql-create-statements") != null && !jsonObj.get("mssql-create-statements").isJsonNull()) && !jsonObj.get("mssql-create-statements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-create-statements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-create-statements").toString()));
      }
      if ((jsonObj.get("mssql-dbname") != null && !jsonObj.get("mssql-dbname").isJsonNull()) && !jsonObj.get("mssql-dbname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-dbname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-dbname").toString()));
      }
      if ((jsonObj.get("mssql-host") != null && !jsonObj.get("mssql-host").isJsonNull()) && !jsonObj.get("mssql-host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-host").toString()));
      }
      if ((jsonObj.get("mssql-password") != null && !jsonObj.get("mssql-password").isJsonNull()) && !jsonObj.get("mssql-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-password").toString()));
      }
      if ((jsonObj.get("mssql-port") != null && !jsonObj.get("mssql-port").isJsonNull()) && !jsonObj.get("mssql-port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-port").toString()));
      }
      if ((jsonObj.get("mssql-revocation-statements") != null && !jsonObj.get("mssql-revocation-statements").isJsonNull()) && !jsonObj.get("mssql-revocation-statements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-revocation-statements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-revocation-statements").toString()));
      }
      if ((jsonObj.get("mssql-username") != null && !jsonObj.get("mssql-username").isJsonNull()) && !jsonObj.get("mssql-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql-username").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if ((jsonObj.get("secure-access-bastion-issuer") != null && !jsonObj.get("secure-access-bastion-issuer").isJsonNull()) && !jsonObj.get("secure-access-bastion-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-bastion-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-bastion-issuer").toString()));
      }
      if ((jsonObj.get("secure-access-certificate-issuer") != null && !jsonObj.get("secure-access-certificate-issuer").isJsonNull()) && !jsonObj.get("secure-access-certificate-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-certificate-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-certificate-issuer").toString()));
      }
      if ((jsonObj.get("secure-access-db-schema") != null && !jsonObj.get("secure-access-db-schema").isJsonNull()) && !jsonObj.get("secure-access-db-schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-db-schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-db-schema").toString()));
      }
      if ((jsonObj.get("secure-access-enable") != null && !jsonObj.get("secure-access-enable").isJsonNull()) && !jsonObj.get("secure-access-enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-enable").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("secure-access-host") != null && !jsonObj.get("secure-access-host").isJsonNull() && !jsonObj.get("secure-access-host").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-host` to be an array in the JSON string but got `%s`", jsonObj.get("secure-access-host").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretUpdateMsSql.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretUpdateMsSql' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretUpdateMsSql> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretUpdateMsSql.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretUpdateMsSql>() {
           @Override
           public void write(JsonWriter out, DynamicSecretUpdateMsSql value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretUpdateMsSql read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretUpdateMsSql given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretUpdateMsSql
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretUpdateMsSql
   */
  public static DynamicSecretUpdateMsSql fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretUpdateMsSql.class);
  }

  /**
   * Convert an instance of DynamicSecretUpdateMsSql to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

