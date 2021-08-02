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
 * updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]
 */
@ApiModel(description = "updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]")

public class UpdateRotatedSecret {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_API_ID = "api-id";
  @SerializedName(SERIALIZED_NAME_API_ID)
  private String apiId;

  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_METADATA = "new-metadata";
  @SerializedName(SERIALIZED_NAME_NEW_METADATA)
  private String newMetadata = "default_metadata";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  private Boolean newVersion = false;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

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

  public static final String SERIALIZED_NAME_ROTATOR_CREDS_TYPE = "rotator-creds-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CREDS_TYPE)
  private String rotatorCredsType;

  public static final String SERIALIZED_NAME_SSH_PASSWORD = "ssh-password";
  @SerializedName(SERIALIZED_NAME_SSH_PASSWORD)
  private String sshPassword;

  public static final String SERIALIZED_NAME_SSH_USERNAME = "ssh-username";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME)
  private String sshUsername;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public UpdateRotatedSecret addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateRotatedSecret addAddTagItem(String addTagItem) {
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


  public UpdateRotatedSecret apiId(String apiId) {
    
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public UpdateRotatedSecret apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public UpdateRotatedSecret autoRotate(String autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation
   * @return autoRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation")

  public String getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(String autoRotate) {
    this.autoRotate = autoRotate;
  }


  public UpdateRotatedSecret key(String key) {
    
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


  public UpdateRotatedSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Secret name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateRotatedSecret newMetadata(String newMetadata) {
    
    this.newMetadata = newMetadata;
    return this;
  }

   /**
   * New item metadata
   * @return newMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item metadata")

  public String getNewMetadata() {
    return newMetadata;
  }


  public void setNewMetadata(String newMetadata) {
    this.newMetadata = newMetadata;
  }


  public UpdateRotatedSecret newName(String newName) {
    
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


  public UpdateRotatedSecret newVersion(Boolean newVersion) {
    
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Whether to create a new version of not
   * @return newVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to create a new version of not")

  public Boolean getNewVersion() {
    return newVersion;
  }


  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateRotatedSecret password(String password) {
    
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


  public UpdateRotatedSecret rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateRotatedSecret addRmTagItem(String rmTagItem) {
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


  public UpdateRotatedSecret rotatedPassword(String rotatedPassword) {
    
    this.rotatedPassword = rotatedPassword;
    return this;
  }

   /**
   * Get rotatedPassword
   * @return rotatedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatedPassword() {
    return rotatedPassword;
  }


  public void setRotatedPassword(String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
  }


  public UpdateRotatedSecret rotatedUsername(String rotatedUsername) {
    
    this.rotatedUsername = rotatedUsername;
    return this;
  }

   /**
   * Get rotatedUsername
   * @return rotatedUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatedUsername() {
    return rotatedUsername;
  }


  public void setRotatedUsername(String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
  }


  public UpdateRotatedSecret rotationHour(Integer rotationHour) {
    
    this.rotationHour = rotationHour;
    return this;
  }

   /**
   * Get rotationHour
   * @return rotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRotationHour() {
    return rotationHour;
  }


  public void setRotationHour(Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public UpdateRotatedSecret rotationInterval(String rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * The number of days to wait between every automatic key rotation (7-365)
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days to wait between every automatic key rotation (7-365)")

  public String getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(String rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public UpdateRotatedSecret rotatorCredsType(String rotatorCredsType) {
    
    this.rotatorCredsType = rotatorCredsType;
    return this;
  }

   /**
   * Get rotatorCredsType
   * @return rotatorCredsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatorCredsType() {
    return rotatorCredsType;
  }


  public void setRotatorCredsType(String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
  }


  public UpdateRotatedSecret sshPassword(String sshPassword) {
    
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * Deprecated: use RotatedPassword
   * @return sshPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: use RotatedPassword")

  public String getSshPassword() {
    return sshPassword;
  }


  public void setSshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
  }


  public UpdateRotatedSecret sshUsername(String sshUsername) {
    
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Deprecated: use RotatedUser
   * @return sshUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: use RotatedUser")

  public String getSshUsername() {
    return sshUsername;
  }


  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public UpdateRotatedSecret token(String token) {
    
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


  public UpdateRotatedSecret uidToken(String uidToken) {
    
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


  public UpdateRotatedSecret username(String username) {
    
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
    UpdateRotatedSecret updateRotatedSecret = (UpdateRotatedSecret) o;
    return Objects.equals(this.addTag, updateRotatedSecret.addTag) &&
        Objects.equals(this.apiId, updateRotatedSecret.apiId) &&
        Objects.equals(this.apiKey, updateRotatedSecret.apiKey) &&
        Objects.equals(this.autoRotate, updateRotatedSecret.autoRotate) &&
        Objects.equals(this.key, updateRotatedSecret.key) &&
        Objects.equals(this.name, updateRotatedSecret.name) &&
        Objects.equals(this.newMetadata, updateRotatedSecret.newMetadata) &&
        Objects.equals(this.newName, updateRotatedSecret.newName) &&
        Objects.equals(this.newVersion, updateRotatedSecret.newVersion) &&
        Objects.equals(this.password, updateRotatedSecret.password) &&
        Objects.equals(this.rmTag, updateRotatedSecret.rmTag) &&
        Objects.equals(this.rotatedPassword, updateRotatedSecret.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, updateRotatedSecret.rotatedUsername) &&
        Objects.equals(this.rotationHour, updateRotatedSecret.rotationHour) &&
        Objects.equals(this.rotationInterval, updateRotatedSecret.rotationInterval) &&
        Objects.equals(this.rotatorCredsType, updateRotatedSecret.rotatorCredsType) &&
        Objects.equals(this.sshPassword, updateRotatedSecret.sshPassword) &&
        Objects.equals(this.sshUsername, updateRotatedSecret.sshUsername) &&
        Objects.equals(this.token, updateRotatedSecret.token) &&
        Objects.equals(this.uidToken, updateRotatedSecret.uidToken) &&
        Objects.equals(this.username, updateRotatedSecret.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, apiId, apiKey, autoRotate, key, name, newMetadata, newName, newVersion, password, rmTag, rotatedPassword, rotatedUsername, rotationHour, rotationInterval, rotatorCredsType, sshPassword, sshUsername, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRotatedSecret {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMetadata: ").append(toIndentedString(newMetadata)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotatedPassword: ").append(toIndentedString(rotatedPassword)).append("\n");
    sb.append("    rotatedUsername: ").append(toIndentedString(rotatedUsername)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotatorCredsType: ").append(toIndentedString(rotatorCredsType)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

