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

/**
 * UpdateDBTargetDetails
 */

public class UpdateDBTargetDetails {
  public static final String SERIALIZED_NAME_DB_TYPE = "db_type";
  @SerializedName(SERIALIZED_NAME_DB_TYPE)
  private String dbType;

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_MONGO_DB_NAME = "mongo_db_name";
  @SerializedName(SERIALIZED_NAME_MONGO_DB_NAME)
  private String mongoDbName;

  public static final String SERIALIZED_NAME_MONGO_URI = "mongo_uri";
  @SerializedName(SERIALIZED_NAME_MONGO_URI)
  private String mongoUri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  private Boolean newVersion;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_PWD = "pwd";
  @SerializedName(SERIALIZED_NAME_PWD)
  private String pwd;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;


  public UpdateDBTargetDetails dbType(String dbType) {
    
    this.dbType = dbType;
    return this;
  }

   /**
   * Get dbType
   * @return dbType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDbType() {
    return dbType;
  }


  public void setDbType(String dbType) {
    this.dbType = dbType;
  }


  public UpdateDBTargetDetails hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public UpdateDBTargetDetails keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateDBTargetDetails mongoDbName(String mongoDbName) {
    
    this.mongoDbName = mongoDbName;
    return this;
  }

   /**
   * Get mongoDbName
   * @return mongoDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMongoDbName() {
    return mongoDbName;
  }


  public void setMongoDbName(String mongoDbName) {
    this.mongoDbName = mongoDbName;
  }


  public UpdateDBTargetDetails mongoUri(String mongoUri) {
    
    this.mongoUri = mongoUri;
    return this;
  }

   /**
   * Get mongoUri
   * @return mongoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMongoUri() {
    return mongoUri;
  }


  public void setMongoUri(String mongoUri) {
    this.mongoUri = mongoUri;
  }


  public UpdateDBTargetDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateDBTargetDetails newVersion(Boolean newVersion) {
    
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Deprecated
   * @return newVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getNewVersion() {
    return newVersion;
  }


  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateDBTargetDetails port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public UpdateDBTargetDetails protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public UpdateDBTargetDetails pwd(String pwd) {
    
    this.pwd = pwd;
    return this;
  }

   /**
   * Get pwd
   * @return pwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPwd() {
    return pwd;
  }


  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public UpdateDBTargetDetails token(String token) {
    
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


  public UpdateDBTargetDetails uidToken(String uidToken) {
    
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


  public UpdateDBTargetDetails userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDBTargetDetails updateDBTargetDetails = (UpdateDBTargetDetails) o;
    return Objects.equals(this.dbType, updateDBTargetDetails.dbType) &&
        Objects.equals(this.hostName, updateDBTargetDetails.hostName) &&
        Objects.equals(this.keepPrevVersion, updateDBTargetDetails.keepPrevVersion) &&
        Objects.equals(this.mongoDbName, updateDBTargetDetails.mongoDbName) &&
        Objects.equals(this.mongoUri, updateDBTargetDetails.mongoUri) &&
        Objects.equals(this.name, updateDBTargetDetails.name) &&
        Objects.equals(this.newVersion, updateDBTargetDetails.newVersion) &&
        Objects.equals(this.port, updateDBTargetDetails.port) &&
        Objects.equals(this.protectionKey, updateDBTargetDetails.protectionKey) &&
        Objects.equals(this.pwd, updateDBTargetDetails.pwd) &&
        Objects.equals(this.token, updateDBTargetDetails.token) &&
        Objects.equals(this.uidToken, updateDBTargetDetails.uidToken) &&
        Objects.equals(this.userName, updateDBTargetDetails.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbType, hostName, keepPrevVersion, mongoDbName, mongoUri, name, newVersion, port, protectionKey, pwd, token, uidToken, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDBTargetDetails {\n");
    sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    mongoDbName: ").append(toIndentedString(mongoDbName)).append("\n");
    sb.append("    mongoUri: ").append(toIndentedString(mongoUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

