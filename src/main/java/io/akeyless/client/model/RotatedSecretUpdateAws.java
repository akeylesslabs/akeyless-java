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
 * RotatedSecretUpdateAws
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretUpdateAws {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_API_ID = "api-id";
  @SerializedName(SERIALIZED_NAME_API_ID)
  private String apiId;

  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS = "authentication-credentials";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS)
  private String authenticationCredentials = "use-user-creds";

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws-region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  private String awsRegion = "us-east-2";

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "default_metadata";

  public static final String SERIALIZED_NAME_GRACE_ROTATION = "grace-rotation";
  @SerializedName(SERIALIZED_NAME_GRACE_ROTATION)
  private String graceRotation;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID = "secure-access-aws-account-id";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID)
  private String secureAccessAwsAccountId;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI = "secure-access-aws-native-cli";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI)
  private Boolean secureAccessAwsNativeCli;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public RotatedSecretUpdateAws() { 
  }

  public RotatedSecretUpdateAws addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public RotatedSecretUpdateAws addAddTagItem(String addTagItem) {
    if (this.addTag == null) {
      this.addTag = new ArrayList<String>();
    }
    this.addTag.add(addTagItem);
    return this;
  }

   /**
   * List of the new tags that will be attached to this item
   * @return addTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the new tags that will be attached to this item")

  public List<String> getAddTag() {
    return addTag;
  }


  public void setAddTag(List<String> addTag) {
    this.addTag = addTag;
  }


  public RotatedSecretUpdateAws apiId(String apiId) {
    
    this.apiId = apiId;
    return this;
  }

   /**
   * API ID to rotate (relevant only for rotator-type&#x3D;api-key)
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API ID to rotate (relevant only for rotator-type=api-key)")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public RotatedSecretUpdateAws apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API key to rotate (relevant only for rotator-type&#x3D;api-key)
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API key to rotate (relevant only for rotator-type=api-key)")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public RotatedSecretUpdateAws authenticationCredentials(String authenticationCredentials) {
    
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


  public RotatedSecretUpdateAws autoRotate(String autoRotate) {
    
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


  public RotatedSecretUpdateAws awsRegion(String awsRegion) {
    
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * Aws Region
   * @return awsRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aws Region")

  public String getAwsRegion() {
    return awsRegion;
  }


  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }


  public RotatedSecretUpdateAws deleteProtection(String deleteProtection) {
    
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


  public RotatedSecretUpdateAws description(String description) {
    
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


  public RotatedSecretUpdateAws graceRotation(String graceRotation) {
    
    this.graceRotation = graceRotation;
    return this;
  }

   /**
   * Create a new access key without deleting the old key from AWS for backup (relevant only for AWS) [true/false]
   * @return graceRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create a new access key without deleting the old key from AWS for backup (relevant only for AWS) [true/false]")

  public String getGraceRotation() {
    return graceRotation;
  }


  public void setGraceRotation(String graceRotation) {
    this.graceRotation = graceRotation;
  }


  public RotatedSecretUpdateAws json(Boolean json) {
    
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


  public RotatedSecretUpdateAws keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to keep previous version [true/false]. If not set, use default according to account settings")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public RotatedSecretUpdateAws key(String key) {
    
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


  public RotatedSecretUpdateAws name(String name) {
    
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


  public RotatedSecretUpdateAws newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New item name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public RotatedSecretUpdateAws passwordLength(String passwordLength) {
    
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


  public RotatedSecretUpdateAws rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public RotatedSecretUpdateAws addRmTagItem(String rmTagItem) {
    if (this.rmTag == null) {
      this.rmTag = new ArrayList<String>();
    }
    this.rmTag.add(rmTagItem);
    return this;
  }

   /**
   * List of the existent tags that will be removed from this item
   * @return rmTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the existent tags that will be removed from this item")

  public List<String> getRmTag() {
    return rmTag;
  }


  public void setRmTag(List<String> rmTag) {
    this.rmTag = rmTag;
  }


  public RotatedSecretUpdateAws rotateAfterDisconnect(String rotateAfterDisconnect) {
    
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


  public RotatedSecretUpdateAws rotationHour(Integer rotationHour) {
    
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


  public RotatedSecretUpdateAws rotationInterval(String rotationInterval) {
    
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


  public RotatedSecretUpdateAws secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
    return this;
  }

   /**
   * The AWS account id
   * @return secureAccessAwsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS account id")

  public String getSecureAccessAwsAccountId() {
    return secureAccessAwsAccountId;
  }


  public void setSecureAccessAwsAccountId(String secureAccessAwsAccountId) {
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
  }


  public RotatedSecretUpdateAws secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
    return this;
  }

   /**
   * The AWS native cli
   * @return secureAccessAwsNativeCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS native cli")

  public Boolean getSecureAccessAwsNativeCli() {
    return secureAccessAwsNativeCli;
  }


  public void setSecureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
  }


  public RotatedSecretUpdateAws secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public RotatedSecretUpdateAws secureAccessEnable(String secureAccessEnable) {
    
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


  public RotatedSecretUpdateAws token(String token) {
    
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


  public RotatedSecretUpdateAws uidToken(String uidToken) {
    
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
    RotatedSecretUpdateAws rotatedSecretUpdateAws = (RotatedSecretUpdateAws) o;
    return Objects.equals(this.addTag, rotatedSecretUpdateAws.addTag) &&
        Objects.equals(this.apiId, rotatedSecretUpdateAws.apiId) &&
        Objects.equals(this.apiKey, rotatedSecretUpdateAws.apiKey) &&
        Objects.equals(this.authenticationCredentials, rotatedSecretUpdateAws.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretUpdateAws.autoRotate) &&
        Objects.equals(this.awsRegion, rotatedSecretUpdateAws.awsRegion) &&
        Objects.equals(this.deleteProtection, rotatedSecretUpdateAws.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretUpdateAws.description) &&
        Objects.equals(this.graceRotation, rotatedSecretUpdateAws.graceRotation) &&
        Objects.equals(this.json, rotatedSecretUpdateAws.json) &&
        Objects.equals(this.keepPrevVersion, rotatedSecretUpdateAws.keepPrevVersion) &&
        Objects.equals(this.key, rotatedSecretUpdateAws.key) &&
        Objects.equals(this.name, rotatedSecretUpdateAws.name) &&
        Objects.equals(this.newName, rotatedSecretUpdateAws.newName) &&
        Objects.equals(this.passwordLength, rotatedSecretUpdateAws.passwordLength) &&
        Objects.equals(this.rmTag, rotatedSecretUpdateAws.rmTag) &&
        Objects.equals(this.rotateAfterDisconnect, rotatedSecretUpdateAws.rotateAfterDisconnect) &&
        Objects.equals(this.rotationHour, rotatedSecretUpdateAws.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretUpdateAws.rotationInterval) &&
        Objects.equals(this.secureAccessAwsAccountId, rotatedSecretUpdateAws.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, rotatedSecretUpdateAws.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessBastionIssuer, rotatedSecretUpdateAws.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, rotatedSecretUpdateAws.secureAccessEnable) &&
        Objects.equals(this.token, rotatedSecretUpdateAws.token) &&
        Objects.equals(this.uidToken, rotatedSecretUpdateAws.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, apiId, apiKey, authenticationCredentials, autoRotate, awsRegion, deleteProtection, description, graceRotation, json, keepPrevVersion, key, name, newName, passwordLength, rmTag, rotateAfterDisconnect, rotationHour, rotationInterval, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessBastionIssuer, secureAccessEnable, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretUpdateAws {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    graceRotation: ").append(toIndentedString(graceRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    secureAccessAwsAccountId: ").append(toIndentedString(secureAccessAwsAccountId)).append("\n");
    sb.append("    secureAccessAwsNativeCli: ").append(toIndentedString(secureAccessAwsNativeCli)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
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
