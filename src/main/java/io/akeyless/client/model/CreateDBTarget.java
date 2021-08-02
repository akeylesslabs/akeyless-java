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
 * CreateDBTarget
 */

public class CreateDBTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DB_NAME = "db-name";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_DB_SERVER_CERTIFICATES = "db-server-certificates";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_CERTIFICATES)
  private String dbServerCertificates;

  public static final String SERIALIZED_NAME_DB_SERVER_NAME = "db-server-name";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_NAME)
  private String dbServerName;

  public static final String SERIALIZED_NAME_DB_TYPE = "db-type";
  @SerializedName(SERIALIZED_NAME_DB_TYPE)
  private String dbType;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS = "mongodb-atlas";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS)
  private Boolean mongodbAtlas;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_API_PRIVATE_KEY = "mongodb-atlas-api-private-key";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_API_PRIVATE_KEY)
  private String mongodbAtlasApiPrivateKey;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_API_PUBLIC_KEY = "mongodb-atlas-api-public-key";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_API_PUBLIC_KEY)
  private String mongodbAtlasApiPublicKey;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_PROJECT_ID = "mongodb-atlas-project-id";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_PROJECT_ID)
  private String mongodbAtlasProjectId;

  public static final String SERIALIZED_NAME_MONGODB_DEFAULT_AUTH_DB = "mongodb-default-auth-db";
  @SerializedName(SERIALIZED_NAME_MONGODB_DEFAULT_AUTH_DB)
  private String mongodbDefaultAuthDb;

  public static final String SERIALIZED_NAME_MONGODB_HOST_PORT = "mongodb-host-port";
  @SerializedName(SERIALIZED_NAME_MONGODB_HOST_PORT)
  private String mongodbHostPort;

  public static final String SERIALIZED_NAME_MONGODB_PASSWORD = "mongodb-password";
  @SerializedName(SERIALIZED_NAME_MONGODB_PASSWORD)
  private String mongodbPassword;

  public static final String SERIALIZED_NAME_MONGODB_SERVER_URI = "mongodb-server-uri";
  @SerializedName(SERIALIZED_NAME_MONGODB_SERVER_URI)
  private String mongodbServerUri;

  public static final String SERIALIZED_NAME_MONGODB_URI_OPTIONS = "mongodb-uri-options";
  @SerializedName(SERIALIZED_NAME_MONGODB_URI_OPTIONS)
  private String mongodbUriOptions;

  public static final String SERIALIZED_NAME_MONGODB_USERNAME = "mongodb-username";
  @SerializedName(SERIALIZED_NAME_MONGODB_USERNAME)
  private String mongodbUsername;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORACLE_SERVICE_NAME = "oracle-service-name";
  @SerializedName(SERIALIZED_NAME_ORACLE_SERVICE_NAME)
  private String oracleServiceName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PWD = "pwd";
  @SerializedName(SERIALIZED_NAME_PWD)
  private String pwd;

  public static final String SERIALIZED_NAME_SNOWFLAKE_ACCOUNT = "snowflake-account";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_ACCOUNT)
  private String snowflakeAccount;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_NAME = "user-name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateDBTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateDBTarget dbName(String dbName) {
    
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDbName() {
    return dbName;
  }


  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public CreateDBTarget dbServerCertificates(String dbServerCertificates) {
    
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


  public CreateDBTarget dbServerName(String dbServerName) {
    
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


  public CreateDBTarget dbType(String dbType) {
    
    this.dbType = dbType;
    return this;
  }

   /**
   * Get dbType
   * @return dbType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDbType() {
    return dbType;
  }


  public void setDbType(String dbType) {
    this.dbType = dbType;
  }


  public CreateDBTarget host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public CreateDBTarget key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CreateDBTarget mongodbAtlas(Boolean mongodbAtlas) {
    
    this.mongodbAtlas = mongodbAtlas;
    return this;
  }

   /**
   * Get mongodbAtlas
   * @return mongodbAtlas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMongodbAtlas() {
    return mongodbAtlas;
  }


  public void setMongodbAtlas(Boolean mongodbAtlas) {
    this.mongodbAtlas = mongodbAtlas;
  }


  public CreateDBTarget mongodbAtlasApiPrivateKey(String mongodbAtlasApiPrivateKey) {
    
    this.mongodbAtlasApiPrivateKey = mongodbAtlasApiPrivateKey;
    return this;
  }

   /**
   * MongoDB Atlas private key
   * @return mongodbAtlasApiPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas private key")

  public String getMongodbAtlasApiPrivateKey() {
    return mongodbAtlasApiPrivateKey;
  }


  public void setMongodbAtlasApiPrivateKey(String mongodbAtlasApiPrivateKey) {
    this.mongodbAtlasApiPrivateKey = mongodbAtlasApiPrivateKey;
  }


  public CreateDBTarget mongodbAtlasApiPublicKey(String mongodbAtlasApiPublicKey) {
    
    this.mongodbAtlasApiPublicKey = mongodbAtlasApiPublicKey;
    return this;
  }

   /**
   * MongoDB Atlas public key
   * @return mongodbAtlasApiPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas public key")

  public String getMongodbAtlasApiPublicKey() {
    return mongodbAtlasApiPublicKey;
  }


  public void setMongodbAtlasApiPublicKey(String mongodbAtlasApiPublicKey) {
    this.mongodbAtlasApiPublicKey = mongodbAtlasApiPublicKey;
  }


  public CreateDBTarget mongodbAtlasProjectId(String mongodbAtlasProjectId) {
    
    this.mongodbAtlasProjectId = mongodbAtlasProjectId;
    return this;
  }

   /**
   * MongoDB Atlas project ID
   * @return mongodbAtlasProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas project ID")

  public String getMongodbAtlasProjectId() {
    return mongodbAtlasProjectId;
  }


  public void setMongodbAtlasProjectId(String mongodbAtlasProjectId) {
    this.mongodbAtlasProjectId = mongodbAtlasProjectId;
  }


  public CreateDBTarget mongodbDefaultAuthDb(String mongodbDefaultAuthDb) {
    
    this.mongodbDefaultAuthDb = mongodbDefaultAuthDb;
    return this;
  }

   /**
   * MongoDB server default authentication database
   * @return mongodbDefaultAuthDb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server default authentication database")

  public String getMongodbDefaultAuthDb() {
    return mongodbDefaultAuthDb;
  }


  public void setMongodbDefaultAuthDb(String mongodbDefaultAuthDb) {
    this.mongodbDefaultAuthDb = mongodbDefaultAuthDb;
  }


  public CreateDBTarget mongodbHostPort(String mongodbHostPort) {
    
    this.mongodbHostPort = mongodbHostPort;
    return this;
  }

   /**
   * MongoDB server host and port
   * @return mongodbHostPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server host and port")

  public String getMongodbHostPort() {
    return mongodbHostPort;
  }


  public void setMongodbHostPort(String mongodbHostPort) {
    this.mongodbHostPort = mongodbHostPort;
  }


  public CreateDBTarget mongodbPassword(String mongodbPassword) {
    
    this.mongodbPassword = mongodbPassword;
    return this;
  }

   /**
   * MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters
   * @return mongodbPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters")

  public String getMongodbPassword() {
    return mongodbPassword;
  }


  public void setMongodbPassword(String mongodbPassword) {
    this.mongodbPassword = mongodbPassword;
  }


  public CreateDBTarget mongodbServerUri(String mongodbServerUri) {
    
    this.mongodbServerUri = mongodbServerUri;
    return this;
  }

   /**
   * MongoDB server URI
   * @return mongodbServerUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server URI")

  public String getMongodbServerUri() {
    return mongodbServerUri;
  }


  public void setMongodbServerUri(String mongodbServerUri) {
    this.mongodbServerUri = mongodbServerUri;
  }


  public CreateDBTarget mongodbUriOptions(String mongodbUriOptions) {
    
    this.mongodbUriOptions = mongodbUriOptions;
    return this;
  }

   /**
   * MongoDB server URI options
   * @return mongodbUriOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server URI options")

  public String getMongodbUriOptions() {
    return mongodbUriOptions;
  }


  public void setMongodbUriOptions(String mongodbUriOptions) {
    this.mongodbUriOptions = mongodbUriOptions;
  }


  public CreateDBTarget mongodbUsername(String mongodbUsername) {
    
    this.mongodbUsername = mongodbUsername;
    return this;
  }

   /**
   * MongoDB server username
   * @return mongodbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server username")

  public String getMongodbUsername() {
    return mongodbUsername;
  }


  public void setMongodbUsername(String mongodbUsername) {
    this.mongodbUsername = mongodbUsername;
  }


  public CreateDBTarget name(String name) {
    
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


  public CreateDBTarget oracleServiceName(String oracleServiceName) {
    
    this.oracleServiceName = oracleServiceName;
    return this;
  }

   /**
   * Get oracleServiceName
   * @return oracleServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOracleServiceName() {
    return oracleServiceName;
  }


  public void setOracleServiceName(String oracleServiceName) {
    this.oracleServiceName = oracleServiceName;
  }


  public CreateDBTarget password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateDBTarget port(String port) {
    
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


  public CreateDBTarget pwd(String pwd) {
    
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


  public CreateDBTarget snowflakeAccount(String snowflakeAccount) {
    
    this.snowflakeAccount = snowflakeAccount;
    return this;
  }

   /**
   * Get snowflakeAccount
   * @return snowflakeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnowflakeAccount() {
    return snowflakeAccount;
  }


  public void setSnowflakeAccount(String snowflakeAccount) {
    this.snowflakeAccount = snowflakeAccount;
  }


  public CreateDBTarget token(String token) {
    
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


  public CreateDBTarget uidToken(String uidToken) {
    
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


  public CreateDBTarget userName(String userName) {
    
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


  public CreateDBTarget username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBTarget createDBTarget = (CreateDBTarget) o;
    return Objects.equals(this.comment, createDBTarget.comment) &&
        Objects.equals(this.dbName, createDBTarget.dbName) &&
        Objects.equals(this.dbServerCertificates, createDBTarget.dbServerCertificates) &&
        Objects.equals(this.dbServerName, createDBTarget.dbServerName) &&
        Objects.equals(this.dbType, createDBTarget.dbType) &&
        Objects.equals(this.host, createDBTarget.host) &&
        Objects.equals(this.key, createDBTarget.key) &&
        Objects.equals(this.mongodbAtlas, createDBTarget.mongodbAtlas) &&
        Objects.equals(this.mongodbAtlasApiPrivateKey, createDBTarget.mongodbAtlasApiPrivateKey) &&
        Objects.equals(this.mongodbAtlasApiPublicKey, createDBTarget.mongodbAtlasApiPublicKey) &&
        Objects.equals(this.mongodbAtlasProjectId, createDBTarget.mongodbAtlasProjectId) &&
        Objects.equals(this.mongodbDefaultAuthDb, createDBTarget.mongodbDefaultAuthDb) &&
        Objects.equals(this.mongodbHostPort, createDBTarget.mongodbHostPort) &&
        Objects.equals(this.mongodbPassword, createDBTarget.mongodbPassword) &&
        Objects.equals(this.mongodbServerUri, createDBTarget.mongodbServerUri) &&
        Objects.equals(this.mongodbUriOptions, createDBTarget.mongodbUriOptions) &&
        Objects.equals(this.mongodbUsername, createDBTarget.mongodbUsername) &&
        Objects.equals(this.name, createDBTarget.name) &&
        Objects.equals(this.oracleServiceName, createDBTarget.oracleServiceName) &&
        Objects.equals(this.password, createDBTarget.password) &&
        Objects.equals(this.port, createDBTarget.port) &&
        Objects.equals(this.pwd, createDBTarget.pwd) &&
        Objects.equals(this.snowflakeAccount, createDBTarget.snowflakeAccount) &&
        Objects.equals(this.token, createDBTarget.token) &&
        Objects.equals(this.uidToken, createDBTarget.uidToken) &&
        Objects.equals(this.userName, createDBTarget.userName) &&
        Objects.equals(this.username, createDBTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, dbName, dbServerCertificates, dbServerName, dbType, host, key, mongodbAtlas, mongodbAtlasApiPrivateKey, mongodbAtlasApiPublicKey, mongodbAtlasProjectId, mongodbDefaultAuthDb, mongodbHostPort, mongodbPassword, mongodbServerUri, mongodbUriOptions, mongodbUsername, name, oracleServiceName, password, port, pwd, snowflakeAccount, token, uidToken, userName, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    dbServerCertificates: ").append(toIndentedString(dbServerCertificates)).append("\n");
    sb.append("    dbServerName: ").append(toIndentedString(dbServerName)).append("\n");
    sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mongodbAtlas: ").append(toIndentedString(mongodbAtlas)).append("\n");
    sb.append("    mongodbAtlasApiPrivateKey: ").append(toIndentedString(mongodbAtlasApiPrivateKey)).append("\n");
    sb.append("    mongodbAtlasApiPublicKey: ").append(toIndentedString(mongodbAtlasApiPublicKey)).append("\n");
    sb.append("    mongodbAtlasProjectId: ").append(toIndentedString(mongodbAtlasProjectId)).append("\n");
    sb.append("    mongodbDefaultAuthDb: ").append(toIndentedString(mongodbDefaultAuthDb)).append("\n");
    sb.append("    mongodbHostPort: ").append(toIndentedString(mongodbHostPort)).append("\n");
    sb.append("    mongodbPassword: ").append(toIndentedString(mongodbPassword)).append("\n");
    sb.append("    mongodbServerUri: ").append(toIndentedString(mongodbServerUri)).append("\n");
    sb.append("    mongodbUriOptions: ").append(toIndentedString(mongodbUriOptions)).append("\n");
    sb.append("    mongodbUsername: ").append(toIndentedString(mongodbUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oracleServiceName: ").append(toIndentedString(oracleServiceName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
    sb.append("    snowflakeAccount: ").append(toIndentedString(snowflakeAccount)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

