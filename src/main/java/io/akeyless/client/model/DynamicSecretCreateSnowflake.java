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
 * GatewayCreateProducerSnowflakeCmd is a command that creates a Snowflake dynamic secret
 */
@ApiModel(description = "GatewayCreateProducerSnowflakeCmd is a command that creates a Snowflake dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretCreateSnowflake {
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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private-key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_PASSPHRASE = "private-key-passphrase";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_PASSPHRASE)
  private String privateKeyPassphrase;

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

  public DynamicSecretCreateSnowflake() { 
  }

  public DynamicSecretCreateSnowflake account(String account) {
    
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


  public DynamicSecretCreateSnowflake accountPassword(String accountPassword) {
    
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


  public DynamicSecretCreateSnowflake accountUsername(String accountUsername) {
    
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


  public DynamicSecretCreateSnowflake dbName(String dbName) {
    
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


  public DynamicSecretCreateSnowflake deleteProtection(String deleteProtection) {
    
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


  public DynamicSecretCreateSnowflake description(String description) {
    
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


  public DynamicSecretCreateSnowflake json(Boolean json) {
    
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


  public DynamicSecretCreateSnowflake name(String name) {
    
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


  public DynamicSecretCreateSnowflake passwordLength(String passwordLength) {
    
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


  public DynamicSecretCreateSnowflake privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * RSA Private key (base64 encoded)
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RSA Private key (base64 encoded)")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public DynamicSecretCreateSnowflake privateKeyPassphrase(String privateKeyPassphrase) {
    
    this.privateKeyPassphrase = privateKeyPassphrase;
    return this;
  }

   /**
   * The Private key passphrase
   * @return privateKeyPassphrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Private key passphrase")

  public String getPrivateKeyPassphrase() {
    return privateKeyPassphrase;
  }


  public void setPrivateKeyPassphrase(String privateKeyPassphrase) {
    this.privateKeyPassphrase = privateKeyPassphrase;
  }


  public DynamicSecretCreateSnowflake role(String role) {
    
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


  public DynamicSecretCreateSnowflake tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateSnowflake addTagsItem(String tagsItem) {
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


  public DynamicSecretCreateSnowflake targetName(String targetName) {
    
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


  public DynamicSecretCreateSnowflake token(String token) {
    
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


  public DynamicSecretCreateSnowflake uidToken(String uidToken) {
    
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


  public DynamicSecretCreateSnowflake userTtl(String userTtl) {
    
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


  public DynamicSecretCreateSnowflake warehouse(String warehouse) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretCreateSnowflake dynamicSecretCreateSnowflake = (DynamicSecretCreateSnowflake) o;
    return Objects.equals(this.account, dynamicSecretCreateSnowflake.account) &&
        Objects.equals(this.accountPassword, dynamicSecretCreateSnowflake.accountPassword) &&
        Objects.equals(this.accountUsername, dynamicSecretCreateSnowflake.accountUsername) &&
        Objects.equals(this.dbName, dynamicSecretCreateSnowflake.dbName) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateSnowflake.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateSnowflake.description) &&
        Objects.equals(this.json, dynamicSecretCreateSnowflake.json) &&
        Objects.equals(this.name, dynamicSecretCreateSnowflake.name) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateSnowflake.passwordLength) &&
        Objects.equals(this.privateKey, dynamicSecretCreateSnowflake.privateKey) &&
        Objects.equals(this.privateKeyPassphrase, dynamicSecretCreateSnowflake.privateKeyPassphrase) &&
        Objects.equals(this.role, dynamicSecretCreateSnowflake.role) &&
        Objects.equals(this.tags, dynamicSecretCreateSnowflake.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateSnowflake.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateSnowflake.token) &&
        Objects.equals(this.uidToken, dynamicSecretCreateSnowflake.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretCreateSnowflake.userTtl) &&
        Objects.equals(this.warehouse, dynamicSecretCreateSnowflake.warehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountPassword, accountUsername, dbName, deleteProtection, description, json, name, passwordLength, privateKey, privateKeyPassphrase, role, tags, targetName, token, uidToken, userTtl, warehouse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateSnowflake {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountPassword: ").append(toIndentedString(accountPassword)).append("\n");
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyPassphrase: ").append(toIndentedString(privateKeyPassphrase)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

