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
 * gatewayUpdateProducerRedshift is a command that updates redshift producer
 */
@ApiModel(description = "gatewayUpdateProducerRedshift is a command that updates redshift producer")

public class GatewayUpdateProducerRedshift {
  public static final String SERIALIZED_NAME_CREATION_STATEMENTS = "creation-statements";
  @SerializedName(SERIALIZED_NAME_CREATION_STATEMENTS)
  private String creationStatements;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY = "producer-encryption-key";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY)
  private String producerEncryptionKey;

  public static final String SERIALIZED_NAME_REDSHIFT_DB_NAME = "redshift-db-name";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_DB_NAME)
  private String redshiftDbName;

  public static final String SERIALIZED_NAME_REDSHIFT_HOST = "redshift-host";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_HOST)
  private String redshiftHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_REDSHIFT_PASSWORD = "redshift-password";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_PASSWORD)
  private String redshiftPassword;

  public static final String SERIALIZED_NAME_REDSHIFT_PORT = "redshift-port";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_PORT)
  private String redshiftPort = "5439";

  public static final String SERIALIZED_NAME_REDSHIFT_USERNAME = "redshift-username";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_USERNAME)
  private String redshiftUsername;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

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


  public GatewayUpdateProducerRedshift creationStatements(String creationStatements) {
    
    this.creationStatements = creationStatements;
    return this;
  }

   /**
   * Redshift Creation statements
   * @return creationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift Creation statements")

  public String getCreationStatements() {
    return creationStatements;
  }


  public void setCreationStatements(String creationStatements) {
    this.creationStatements = creationStatements;
  }


  public GatewayUpdateProducerRedshift name(String name) {
    
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


  public GatewayUpdateProducerRedshift newName(String newName) {
    
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


  public GatewayUpdateProducerRedshift producerEncryptionKey(String producerEncryptionKey) {
    
    this.producerEncryptionKey = producerEncryptionKey;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKey() {
    return producerEncryptionKey;
  }


  public void setProducerEncryptionKey(String producerEncryptionKey) {
    this.producerEncryptionKey = producerEncryptionKey;
  }


  public GatewayUpdateProducerRedshift redshiftDbName(String redshiftDbName) {
    
    this.redshiftDbName = redshiftDbName;
    return this;
  }

   /**
   * Redshift DB Name
   * @return redshiftDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift DB Name")

  public String getRedshiftDbName() {
    return redshiftDbName;
  }


  public void setRedshiftDbName(String redshiftDbName) {
    this.redshiftDbName = redshiftDbName;
  }


  public GatewayUpdateProducerRedshift redshiftHost(String redshiftHost) {
    
    this.redshiftHost = redshiftHost;
    return this;
  }

   /**
   * Redshift Host
   * @return redshiftHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift Host")

  public String getRedshiftHost() {
    return redshiftHost;
  }


  public void setRedshiftHost(String redshiftHost) {
    this.redshiftHost = redshiftHost;
  }


  public GatewayUpdateProducerRedshift redshiftPassword(String redshiftPassword) {
    
    this.redshiftPassword = redshiftPassword;
    return this;
  }

   /**
   * Redshift Password
   * @return redshiftPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift Password")

  public String getRedshiftPassword() {
    return redshiftPassword;
  }


  public void setRedshiftPassword(String redshiftPassword) {
    this.redshiftPassword = redshiftPassword;
  }


  public GatewayUpdateProducerRedshift redshiftPort(String redshiftPort) {
    
    this.redshiftPort = redshiftPort;
    return this;
  }

   /**
   * Redshift Port
   * @return redshiftPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift Port")

  public String getRedshiftPort() {
    return redshiftPort;
  }


  public void setRedshiftPort(String redshiftPort) {
    this.redshiftPort = redshiftPort;
  }


  public GatewayUpdateProducerRedshift redshiftUsername(String redshiftUsername) {
    
    this.redshiftUsername = redshiftUsername;
    return this;
  }

   /**
   * Redshift Username
   * @return redshiftUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redshift Username")

  public String getRedshiftUsername() {
    return redshiftUsername;
  }


  public void setRedshiftUsername(String redshiftUsername) {
    this.redshiftUsername = redshiftUsername;
  }


  public GatewayUpdateProducerRedshift secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Get secureAccessEnable
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayUpdateProducerRedshift secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerRedshift addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Get secureAccessHost
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public GatewayUpdateProducerRedshift tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerRedshift addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerRedshift targetName(String targetName) {
    
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


  public GatewayUpdateProducerRedshift token(String token) {
    
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


  public GatewayUpdateProducerRedshift uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerRedshift userTtl(String userTtl) {
    
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
    GatewayUpdateProducerRedshift gatewayUpdateProducerRedshift = (GatewayUpdateProducerRedshift) o;
    return Objects.equals(this.creationStatements, gatewayUpdateProducerRedshift.creationStatements) &&
        Objects.equals(this.name, gatewayUpdateProducerRedshift.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerRedshift.newName) &&
        Objects.equals(this.producerEncryptionKey, gatewayUpdateProducerRedshift.producerEncryptionKey) &&
        Objects.equals(this.redshiftDbName, gatewayUpdateProducerRedshift.redshiftDbName) &&
        Objects.equals(this.redshiftHost, gatewayUpdateProducerRedshift.redshiftHost) &&
        Objects.equals(this.redshiftPassword, gatewayUpdateProducerRedshift.redshiftPassword) &&
        Objects.equals(this.redshiftPort, gatewayUpdateProducerRedshift.redshiftPort) &&
        Objects.equals(this.redshiftUsername, gatewayUpdateProducerRedshift.redshiftUsername) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerRedshift.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerRedshift.secureAccessHost) &&
        Objects.equals(this.tags, gatewayUpdateProducerRedshift.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerRedshift.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerRedshift.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerRedshift.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerRedshift.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationStatements, name, newName, producerEncryptionKey, redshiftDbName, redshiftHost, redshiftPassword, redshiftPort, redshiftUsername, secureAccessEnable, secureAccessHost, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerRedshift {\n");
    sb.append("    creationStatements: ").append(toIndentedString(creationStatements)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKey: ").append(toIndentedString(producerEncryptionKey)).append("\n");
    sb.append("    redshiftDbName: ").append(toIndentedString(redshiftDbName)).append("\n");
    sb.append("    redshiftHost: ").append(toIndentedString(redshiftHost)).append("\n");
    sb.append("    redshiftPassword: ").append(toIndentedString(redshiftPassword)).append("\n");
    sb.append("    redshiftPort: ").append(toIndentedString(redshiftPort)).append("\n");
    sb.append("    redshiftUsername: ").append(toIndentedString(redshiftUsername)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
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

