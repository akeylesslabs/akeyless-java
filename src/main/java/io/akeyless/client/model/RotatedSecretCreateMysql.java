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
 * RotatedSecretCreateMysql
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretCreateMysql {
  public static final String SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS = "authentication-credentials";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS)
  private String authenticationCredentials = "use-user-creds";

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

  public static final String SERIALIZED_NAME_ROTATED_PASSWORD = "rotated-password";
  @SerializedName(SERIALIZED_NAME_ROTATED_PASSWORD)
  private String rotatedPassword;

  public static final String SERIALIZED_NAME_ROTATED_USERNAME = "rotated-username";
  @SerializedName(SERIALIZED_NAME_ROTATED_USERNAME)
  private String rotatedUsername;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  private String rotatorType;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DB_NAME = "secure-access-db-name";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DB_NAME)
  private String secureAccessDbName;

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

  public RotatedSecretCreateMysql() { 
  }

  public RotatedSecretCreateMysql authenticationCredentials(String authenticationCredentials) {
    
    this.authenticationCredentials = authenticationCredentials;
    return this;
  }

   /**
   * The credentials to connect with use-user-creds/use-target-creds
   * @return authenticationCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The credentials to connect with use-user-creds/use-target-creds")

  public String getAuthenticationCredentials() {
    return authenticationCredentials;
  }


  public void setAuthenticationCredentials(String authenticationCredentials) {
    this.authenticationCredentials = authenticationCredentials;
  }


  public RotatedSecretCreateMysql autoRotate(String autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false]
   * @return autoRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false]")

  public String getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(String autoRotate) {
    this.autoRotate = autoRotate;
  }


  public RotatedSecretCreateMysql deleteProtection(String deleteProtection) {
    
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


  public RotatedSecretCreateMysql description(String description) {
    
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


  public RotatedSecretCreateMysql json(Boolean json) {
    
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


  public RotatedSecretCreateMysql key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public RotatedSecretCreateMysql name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Rotated secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Rotated secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RotatedSecretCreateMysql passwordLength(String passwordLength) {
    
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


  public RotatedSecretCreateMysql rotateAfterDisconnect(String rotateAfterDisconnect) {
    
    this.rotateAfterDisconnect = rotateAfterDisconnect;
    return this;
  }

   /**
   * Rotate the value of the secret after SRA session ends [true/false]
   * @return rotateAfterDisconnect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotate the value of the secret after SRA session ends [true/false]")

  public String getRotateAfterDisconnect() {
    return rotateAfterDisconnect;
  }


  public void setRotateAfterDisconnect(String rotateAfterDisconnect) {
    this.rotateAfterDisconnect = rotateAfterDisconnect;
  }


  public RotatedSecretCreateMysql rotatedPassword(String rotatedPassword) {
    
    this.rotatedPassword = rotatedPassword;
    return this;
  }

   /**
   * rotated-username password (relevant only for rotator-type&#x3D;password)
   * @return rotatedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "rotated-username password (relevant only for rotator-type=password)")

  public String getRotatedPassword() {
    return rotatedPassword;
  }


  public void setRotatedPassword(String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
  }


  public RotatedSecretCreateMysql rotatedUsername(String rotatedUsername) {
    
    this.rotatedUsername = rotatedUsername;
    return this;
  }

   /**
   * username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;password)
   * @return rotatedUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it's own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type=password)")

  public String getRotatedUsername() {
    return rotatedUsername;
  }


  public void setRotatedUsername(String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
  }


  public RotatedSecretCreateMysql rotationHour(Integer rotationHour) {
    
    this.rotationHour = rotationHour;
    return this;
  }

   /**
   * The Hour of the rotation in UTC
   * @return rotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Hour of the rotation in UTC")

  public Integer getRotationHour() {
    return rotationHour;
  }


  public void setRotationHour(Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public RotatedSecretCreateMysql rotationInterval(String rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * The number of days to wait between every automatic key rotation (1-365)
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days to wait between every automatic key rotation (1-365)")

  public String getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(String rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public RotatedSecretCreateMysql rotatorType(String rotatorType) {
    
    this.rotatorType = rotatorType;
    return this;
  }

   /**
   * The rotator type. options: [target/password]
   * @return rotatorType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rotator type. options: [target/password]")

  public String getRotatorType() {
    return rotatorType;
  }


  public void setRotatorType(String rotatorType) {
    this.rotatorType = rotatorType;
  }


  public RotatedSecretCreateMysql secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public RotatedSecretCreateMysql secureAccessDbName(String secureAccessDbName) {
    
    this.secureAccessDbName = secureAccessDbName;
    return this;
  }

   /**
   * The DB name (relevant only for DB Dynamic-Secret)
   * @return secureAccessDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DB name (relevant only for DB Dynamic-Secret)")

  public String getSecureAccessDbName() {
    return secureAccessDbName;
  }


  public void setSecureAccessDbName(String secureAccessDbName) {
    this.secureAccessDbName = secureAccessDbName;
  }


  public RotatedSecretCreateMysql secureAccessEnable(String secureAccessEnable) {
    
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


  public RotatedSecretCreateMysql secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public RotatedSecretCreateMysql addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public RotatedSecretCreateMysql secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public RotatedSecretCreateMysql tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RotatedSecretCreateMysql addTagsItem(String tagsItem) {
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


  public RotatedSecretCreateMysql targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public RotatedSecretCreateMysql token(String token) {
    
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


  public RotatedSecretCreateMysql uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotatedSecretCreateMysql rotatedSecretCreateMysql = (RotatedSecretCreateMysql) o;
    return Objects.equals(this.authenticationCredentials, rotatedSecretCreateMysql.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretCreateMysql.autoRotate) &&
        Objects.equals(this.deleteProtection, rotatedSecretCreateMysql.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretCreateMysql.description) &&
        Objects.equals(this.json, rotatedSecretCreateMysql.json) &&
        Objects.equals(this.key, rotatedSecretCreateMysql.key) &&
        Objects.equals(this.name, rotatedSecretCreateMysql.name) &&
        Objects.equals(this.passwordLength, rotatedSecretCreateMysql.passwordLength) &&
        Objects.equals(this.rotateAfterDisconnect, rotatedSecretCreateMysql.rotateAfterDisconnect) &&
        Objects.equals(this.rotatedPassword, rotatedSecretCreateMysql.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, rotatedSecretCreateMysql.rotatedUsername) &&
        Objects.equals(this.rotationHour, rotatedSecretCreateMysql.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretCreateMysql.rotationInterval) &&
        Objects.equals(this.rotatorType, rotatedSecretCreateMysql.rotatorType) &&
        Objects.equals(this.secureAccessBastionIssuer, rotatedSecretCreateMysql.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbName, rotatedSecretCreateMysql.secureAccessDbName) &&
        Objects.equals(this.secureAccessEnable, rotatedSecretCreateMysql.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, rotatedSecretCreateMysql.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, rotatedSecretCreateMysql.secureAccessWeb) &&
        Objects.equals(this.tags, rotatedSecretCreateMysql.tags) &&
        Objects.equals(this.targetName, rotatedSecretCreateMysql.targetName) &&
        Objects.equals(this.token, rotatedSecretCreateMysql.token) &&
        Objects.equals(this.uidToken, rotatedSecretCreateMysql.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationCredentials, autoRotate, deleteProtection, description, json, key, name, passwordLength, rotateAfterDisconnect, rotatedPassword, rotatedUsername, rotationHour, rotationInterval, rotatorType, secureAccessBastionIssuer, secureAccessDbName, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretCreateMysql {\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    rotatedPassword: ").append(toIndentedString(rotatedPassword)).append("\n");
    sb.append("    rotatedUsername: ").append(toIndentedString(rotatedUsername)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotatorType: ").append(toIndentedString(rotatorType)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessDbName: ").append(toIndentedString(secureAccessDbName)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
