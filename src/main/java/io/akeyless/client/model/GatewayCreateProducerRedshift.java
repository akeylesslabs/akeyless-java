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
 * gatewayCreateProducerRedshift is a command that creates redshift producer
 */
@ApiModel(description = "gatewayCreateProducerRedshift is a command that creates redshift producer")

public class GatewayCreateProducerRedshift {
  public static final String SERIALIZED_NAME_CREATION_STATEMENTS = "creation-statements";
  @SerializedName(SERIALIZED_NAME_CREATION_STATEMENTS)
  private String creationStatements;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl;

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


  public GatewayCreateProducerRedshift creationStatements(String creationStatements) {
    
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


  public GatewayCreateProducerRedshift name(String name) {
    
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


  public GatewayCreateProducerRedshift producerEncryptionKey(String producerEncryptionKey) {
    
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


  public GatewayCreateProducerRedshift redshiftDbName(String redshiftDbName) {
    
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


  public GatewayCreateProducerRedshift redshiftHost(String redshiftHost) {
    
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


  public GatewayCreateProducerRedshift redshiftPassword(String redshiftPassword) {
    
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


  public GatewayCreateProducerRedshift redshiftPort(String redshiftPort) {
    
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


  public GatewayCreateProducerRedshift redshiftUsername(String redshiftUsername) {
    
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


  public GatewayCreateProducerRedshift secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayCreateProducerRedshift secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayCreateProducerRedshift addSecureAccessHostItem(String secureAccessHostItem) {
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


  public GatewayCreateProducerRedshift ssl(Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * SSL connection mode
   * @return ssl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL connection mode")

  public Boolean getSsl() {
    return ssl;
  }


  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public GatewayCreateProducerRedshift tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerRedshift addTagsItem(String tagsItem) {
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


  public GatewayCreateProducerRedshift targetName(String targetName) {
    
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


  public GatewayCreateProducerRedshift token(String token) {
    
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


  public GatewayCreateProducerRedshift uidToken(String uidToken) {
    
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


  public GatewayCreateProducerRedshift userTtl(String userTtl) {
    
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
    GatewayCreateProducerRedshift gatewayCreateProducerRedshift = (GatewayCreateProducerRedshift) o;
    return Objects.equals(this.creationStatements, gatewayCreateProducerRedshift.creationStatements) &&
        Objects.equals(this.name, gatewayCreateProducerRedshift.name) &&
        Objects.equals(this.producerEncryptionKey, gatewayCreateProducerRedshift.producerEncryptionKey) &&
        Objects.equals(this.redshiftDbName, gatewayCreateProducerRedshift.redshiftDbName) &&
        Objects.equals(this.redshiftHost, gatewayCreateProducerRedshift.redshiftHost) &&
        Objects.equals(this.redshiftPassword, gatewayCreateProducerRedshift.redshiftPassword) &&
        Objects.equals(this.redshiftPort, gatewayCreateProducerRedshift.redshiftPort) &&
        Objects.equals(this.redshiftUsername, gatewayCreateProducerRedshift.redshiftUsername) &&
        Objects.equals(this.secureAccessEnable, gatewayCreateProducerRedshift.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayCreateProducerRedshift.secureAccessHost) &&
        Objects.equals(this.ssl, gatewayCreateProducerRedshift.ssl) &&
        Objects.equals(this.tags, gatewayCreateProducerRedshift.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerRedshift.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerRedshift.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerRedshift.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerRedshift.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationStatements, name, producerEncryptionKey, redshiftDbName, redshiftHost, redshiftPassword, redshiftPort, redshiftUsername, secureAccessEnable, secureAccessHost, ssl, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerRedshift {\n");
    sb.append("    creationStatements: ").append(toIndentedString(creationStatements)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    producerEncryptionKey: ").append(toIndentedString(producerEncryptionKey)).append("\n");
    sb.append("    redshiftDbName: ").append(toIndentedString(redshiftDbName)).append("\n");
    sb.append("    redshiftHost: ").append(toIndentedString(redshiftHost)).append("\n");
    sb.append("    redshiftPassword: ").append(toIndentedString(redshiftPassword)).append("\n");
    sb.append("    redshiftPort: ").append(toIndentedString(redshiftPort)).append("\n");
    sb.append("    redshiftUsername: ").append(toIndentedString(redshiftUsername)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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

