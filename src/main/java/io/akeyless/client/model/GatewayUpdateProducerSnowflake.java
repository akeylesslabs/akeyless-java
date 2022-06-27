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
 * gatewayUpdateProducerSnowflakeCmd is a command that updates a Snowflake producer
 */
@ApiModel(description = "gatewayUpdateProducerSnowflakeCmd is a command that updates a Snowflake producer")

public class GatewayUpdateProducerSnowflake {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ACCOUNT_PASSWORD = "account-password";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PASSWORD)
  private String accountPassword;

  public static final String SERIALIZED_NAME_ACCOUNT_USERNAME = "account-username";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_USERNAME)
  private String accountUsername;

  public static final String SERIALIZED_NAME_DB_NAME = "db-name";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

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
  private String userTtl = "24h";

  public static final String SERIALIZED_NAME_WAREHOUSE = "warehouse";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE)
  private String warehouse;


  public GatewayUpdateProducerSnowflake account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Account name
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account name")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public GatewayUpdateProducerSnowflake accountPassword(String accountPassword) {
    
    this.accountPassword = accountPassword;
    return this;
  }

   /**
   * Database Password
   * @return accountPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Password")

  public String getAccountPassword() {
    return accountPassword;
  }


  public void setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
  }


  public GatewayUpdateProducerSnowflake accountUsername(String accountUsername) {
    
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * Database Username
   * @return accountUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Username")

  public String getAccountUsername() {
    return accountUsername;
  }


  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }


  public GatewayUpdateProducerSnowflake dbName(String dbName) {
    
    this.dbName = dbName;
    return this;
  }

   /**
   * Database name
   * @return dbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database name")

  public String getDbName() {
    return dbName;
  }


  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public GatewayUpdateProducerSnowflake deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerSnowflake name(String name) {
    
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


  public GatewayUpdateProducerSnowflake newName(String newName) {
    
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


  public GatewayUpdateProducerSnowflake role(String role) {
    
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


  public GatewayUpdateProducerSnowflake tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerSnowflake addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerSnowflake targetName(String targetName) {
    
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


  public GatewayUpdateProducerSnowflake token(String token) {
    
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


  public GatewayUpdateProducerSnowflake uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerSnowflake userTtl(String userTtl) {
    
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


  public GatewayUpdateProducerSnowflake warehouse(String warehouse) {
    
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
    GatewayUpdateProducerSnowflake gatewayUpdateProducerSnowflake = (GatewayUpdateProducerSnowflake) o;
    return Objects.equals(this.account, gatewayUpdateProducerSnowflake.account) &&
        Objects.equals(this.accountPassword, gatewayUpdateProducerSnowflake.accountPassword) &&
        Objects.equals(this.accountUsername, gatewayUpdateProducerSnowflake.accountUsername) &&
        Objects.equals(this.dbName, gatewayUpdateProducerSnowflake.dbName) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerSnowflake.deleteProtection) &&
        Objects.equals(this.name, gatewayUpdateProducerSnowflake.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerSnowflake.newName) &&
        Objects.equals(this.role, gatewayUpdateProducerSnowflake.role) &&
        Objects.equals(this.tags, gatewayUpdateProducerSnowflake.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerSnowflake.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerSnowflake.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerSnowflake.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerSnowflake.userTtl) &&
        Objects.equals(this.warehouse, gatewayUpdateProducerSnowflake.warehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountPassword, accountUsername, dbName, deleteProtection, name, newName, role, tags, targetName, token, uidToken, userTtl, warehouse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerSnowflake {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountPassword: ").append(toIndentedString(accountPassword)).append("\n");
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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

