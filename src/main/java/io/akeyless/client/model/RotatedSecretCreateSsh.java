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
 * RotatedSecretCreateSsh
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretCreateSsh {
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

  public static final String SERIALIZED_NAME_ROTATOR_CUSTOM_CMD = "rotator-custom-cmd";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CUSTOM_CMD)
  private String rotatorCustomCmd;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  private String rotatorType;

  public static final String SERIALIZED_NAME_SAME_PASSWORD = "same-password";
  @SerializedName(SERIALIZED_NAME_SAME_PASSWORD)
  private String samePassword;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER = "secure-access-allow-external-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER)
  private Boolean secureAccessAllowExternalUser = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN = "secure-access-rdp-domain";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN)
  private String secureAccessRdpDomain;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_USER = "secure-access-rdp-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_USER)
  private String secureAccessRdpUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_USER = "secure-access-ssh-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_USER)
  private String secureAccessSshUser;

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

  public RotatedSecretCreateSsh() { 
  }

  public RotatedSecretCreateSsh authenticationCredentials(String authenticationCredentials) {
    
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


  public RotatedSecretCreateSsh autoRotate(String autoRotate) {
    
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


  public RotatedSecretCreateSsh deleteProtection(String deleteProtection) {
    
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


  public RotatedSecretCreateSsh description(String description) {
    
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


  public RotatedSecretCreateSsh json(Boolean json) {
    
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


  public RotatedSecretCreateSsh key(String key) {
    
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


  public RotatedSecretCreateSsh name(String name) {
    
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


  public RotatedSecretCreateSsh passwordLength(String passwordLength) {
    
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


  public RotatedSecretCreateSsh rotateAfterDisconnect(String rotateAfterDisconnect) {
    
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


  public RotatedSecretCreateSsh rotatedPassword(String rotatedPassword) {
    
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


  public RotatedSecretCreateSsh rotatedUsername(String rotatedUsername) {
    
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


  public RotatedSecretCreateSsh rotationHour(Integer rotationHour) {
    
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


  public RotatedSecretCreateSsh rotationInterval(String rotationInterval) {
    
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


  public RotatedSecretCreateSsh rotatorCustomCmd(String rotatorCustomCmd) {
    
    this.rotatorCustomCmd = rotatorCustomCmd;
    return this;
  }

   /**
   * Custom rotation command
   * @return rotatorCustomCmd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom rotation command")

  public String getRotatorCustomCmd() {
    return rotatorCustomCmd;
  }


  public void setRotatorCustomCmd(String rotatorCustomCmd) {
    this.rotatorCustomCmd = rotatorCustomCmd;
  }


  public RotatedSecretCreateSsh rotatorType(String rotatorType) {
    
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


  public RotatedSecretCreateSsh samePassword(String samePassword) {
    
    this.samePassword = samePassword;
    return this;
  }

   /**
   * Rotate same password for each host from the Linked Target (relevant only for Linked Target)
   * @return samePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotate same password for each host from the Linked Target (relevant only for Linked Target)")

  public String getSamePassword() {
    return samePassword;
  }


  public void setSamePassword(String samePassword) {
    this.samePassword = samePassword;
  }


  public RotatedSecretCreateSsh secureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Allow providing external user for a domain users
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow providing external user for a domain users")

  public Boolean getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public RotatedSecretCreateSsh secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public RotatedSecretCreateSsh secureAccessEnable(String secureAccessEnable) {
    
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


  public RotatedSecretCreateSsh secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public RotatedSecretCreateSsh addSecureAccessHostItem(String secureAccessHostItem) {
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


  public RotatedSecretCreateSsh secureAccessRdpDomain(String secureAccessRdpDomain) {
    
    this.secureAccessRdpDomain = secureAccessRdpDomain;
    return this;
  }

   /**
   * Required when the Dynamic Secret is used for a domain user
   * @return secureAccessRdpDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required when the Dynamic Secret is used for a domain user")

  public String getSecureAccessRdpDomain() {
    return secureAccessRdpDomain;
  }


  public void setSecureAccessRdpDomain(String secureAccessRdpDomain) {
    this.secureAccessRdpDomain = secureAccessRdpDomain;
  }


  public RotatedSecretCreateSsh secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Override the RDP Domain username
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the RDP Domain username")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public RotatedSecretCreateSsh secureAccessSshUser(String secureAccessSshUser) {
    
    this.secureAccessSshUser = secureAccessSshUser;
    return this;
  }

   /**
   * Override the SSH username as indicated in SSH Certificate Issuer
   * @return secureAccessSshUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the SSH username as indicated in SSH Certificate Issuer")

  public String getSecureAccessSshUser() {
    return secureAccessSshUser;
  }


  public void setSecureAccessSshUser(String secureAccessSshUser) {
    this.secureAccessSshUser = secureAccessSshUser;
  }


  public RotatedSecretCreateSsh tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RotatedSecretCreateSsh addTagsItem(String tagsItem) {
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


  public RotatedSecretCreateSsh targetName(String targetName) {
    
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


  public RotatedSecretCreateSsh token(String token) {
    
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


  public RotatedSecretCreateSsh uidToken(String uidToken) {
    
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
    RotatedSecretCreateSsh rotatedSecretCreateSsh = (RotatedSecretCreateSsh) o;
    return Objects.equals(this.authenticationCredentials, rotatedSecretCreateSsh.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretCreateSsh.autoRotate) &&
        Objects.equals(this.deleteProtection, rotatedSecretCreateSsh.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretCreateSsh.description) &&
        Objects.equals(this.json, rotatedSecretCreateSsh.json) &&
        Objects.equals(this.key, rotatedSecretCreateSsh.key) &&
        Objects.equals(this.name, rotatedSecretCreateSsh.name) &&
        Objects.equals(this.passwordLength, rotatedSecretCreateSsh.passwordLength) &&
        Objects.equals(this.rotateAfterDisconnect, rotatedSecretCreateSsh.rotateAfterDisconnect) &&
        Objects.equals(this.rotatedPassword, rotatedSecretCreateSsh.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, rotatedSecretCreateSsh.rotatedUsername) &&
        Objects.equals(this.rotationHour, rotatedSecretCreateSsh.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretCreateSsh.rotationInterval) &&
        Objects.equals(this.rotatorCustomCmd, rotatedSecretCreateSsh.rotatorCustomCmd) &&
        Objects.equals(this.rotatorType, rotatedSecretCreateSsh.rotatorType) &&
        Objects.equals(this.samePassword, rotatedSecretCreateSsh.samePassword) &&
        Objects.equals(this.secureAccessAllowExternalUser, rotatedSecretCreateSsh.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessBastionIssuer, rotatedSecretCreateSsh.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, rotatedSecretCreateSsh.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, rotatedSecretCreateSsh.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpDomain, rotatedSecretCreateSsh.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, rotatedSecretCreateSsh.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessSshUser, rotatedSecretCreateSsh.secureAccessSshUser) &&
        Objects.equals(this.tags, rotatedSecretCreateSsh.tags) &&
        Objects.equals(this.targetName, rotatedSecretCreateSsh.targetName) &&
        Objects.equals(this.token, rotatedSecretCreateSsh.token) &&
        Objects.equals(this.uidToken, rotatedSecretCreateSsh.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationCredentials, autoRotate, deleteProtection, description, json, key, name, passwordLength, rotateAfterDisconnect, rotatedPassword, rotatedUsername, rotationHour, rotationInterval, rotatorCustomCmd, rotatorType, samePassword, secureAccessAllowExternalUser, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessRdpDomain, secureAccessRdpUser, secureAccessSshUser, tags, targetName, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretCreateSsh {\n");
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
    sb.append("    rotatorCustomCmd: ").append(toIndentedString(rotatorCustomCmd)).append("\n");
    sb.append("    rotatorType: ").append(toIndentedString(rotatorType)).append("\n");
    sb.append("    samePassword: ").append(toIndentedString(samePassword)).append("\n");
    sb.append("    secureAccessAllowExternalUser: ").append(toIndentedString(secureAccessAllowExternalUser)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdpDomain: ").append(toIndentedString(secureAccessRdpDomain)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    secureAccessSshUser: ").append(toIndentedString(secureAccessSshUser)).append("\n");
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

