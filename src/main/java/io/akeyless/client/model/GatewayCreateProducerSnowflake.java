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
 * gatewayCreateProducerSnowflakeCmd is a command that creates a Snowflake producer
 */
@ApiModel(description = "gatewayCreateProducerSnowflakeCmd is a command that creates a Snowflake producer")

public class GatewayCreateProducerSnowflake {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_DB_NAME = "db-name";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_GATEWAY_URL = "gateway-url";
  @SerializedName(SERIALIZED_NAME_GATEWAY_URL)
  private String gatewayUrl = "http://localhost:8000";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "24h";

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WAREHOUSE = "warehouse";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE)
  private String warehouse;


  public GatewayCreateProducerSnowflake account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Account name
   * @return account
  **/
  @ApiModelProperty(required = true, value = "Account name")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public GatewayCreateProducerSnowflake dbName(String dbName) {
    
    this.dbName = dbName;
    return this;
  }

   /**
   * Database name
   * @return dbName
  **/
  @ApiModelProperty(required = true, value = "Database name")

  public String getDbName() {
    return dbName;
  }


  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public GatewayCreateProducerSnowflake gatewayUrl(String gatewayUrl) {
    
    this.gatewayUrl = gatewayUrl;
    return this;
  }

   /**
   * Gateway url
   * @return gatewayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gateway url")

  public String getGatewayUrl() {
    return gatewayUrl;
  }


  public void setGatewayUrl(String gatewayUrl) {
    this.gatewayUrl = gatewayUrl;
  }


  public GatewayCreateProducerSnowflake name(String name) {
    
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


  public GatewayCreateProducerSnowflake password(String password) {
    
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


  public GatewayCreateProducerSnowflake role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * User role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User role")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public GatewayCreateProducerSnowflake token(String token) {
    
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


  public GatewayCreateProducerSnowflake uidToken(String uidToken) {
    
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


  public GatewayCreateProducerSnowflake userTtl(String userTtl) {
    
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


  public GatewayCreateProducerSnowflake username(String username) {
    
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


  public GatewayCreateProducerSnowflake warehouse(String warehouse) {
    
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Warehouse name
   * @return warehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Warehouse name")

  public String getWarehouse() {
    return warehouse;
  }


  public void setWarehouse(String warehouse) {
    this.warehouse = warehouse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerSnowflake gatewayCreateProducerSnowflake = (GatewayCreateProducerSnowflake) o;
    return Objects.equals(this.account, gatewayCreateProducerSnowflake.account) &&
        Objects.equals(this.dbName, gatewayCreateProducerSnowflake.dbName) &&
        Objects.equals(this.gatewayUrl, gatewayCreateProducerSnowflake.gatewayUrl) &&
        Objects.equals(this.name, gatewayCreateProducerSnowflake.name) &&
        Objects.equals(this.password, gatewayCreateProducerSnowflake.password) &&
        Objects.equals(this.role, gatewayCreateProducerSnowflake.role) &&
        Objects.equals(this.token, gatewayCreateProducerSnowflake.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerSnowflake.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerSnowflake.userTtl) &&
        Objects.equals(this.username, gatewayCreateProducerSnowflake.username) &&
        Objects.equals(this.warehouse, gatewayCreateProducerSnowflake.warehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, dbName, gatewayUrl, name, password, role, token, uidToken, userTtl, username, warehouse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerSnowflake {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    gatewayUrl: ").append(toIndentedString(gatewayUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
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

