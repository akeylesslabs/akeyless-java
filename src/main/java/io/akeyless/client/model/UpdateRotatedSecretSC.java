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
 * UpdateRotatedSecretSC
 */

public class UpdateRotatedSecretSC {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_GATEWAY_URL = "gateway-url";
  @SerializedName(SERIALIZED_NAME_GATEWAY_URL)
  private String gatewayUrl = "http://localhost:8000";

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

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation_hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATOR_CREDS_TYPE = "rotator_creds_type";
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


  public UpdateRotatedSecretSC addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateRotatedSecretSC addAddTagItem(String addTagItem) {
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


  public UpdateRotatedSecretSC autoRotate(String autoRotate) {
    
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


  public UpdateRotatedSecretSC gatewayUrl(String gatewayUrl) {
    
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


  public UpdateRotatedSecretSC key(String key) {
    
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


  public UpdateRotatedSecretSC name(String name) {
    
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


  public UpdateRotatedSecretSC newMetadata(String newMetadata) {
    
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


  public UpdateRotatedSecretSC newName(String newName) {
    
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


  public UpdateRotatedSecretSC newVersion(Boolean newVersion) {
    
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


  public UpdateRotatedSecretSC rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateRotatedSecretSC addRmTagItem(String rmTagItem) {
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


  public UpdateRotatedSecretSC rotationInterval(String rotationInterval) {
    
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


  public UpdateRotatedSecretSC rotationHour(Integer rotationHour) {
    
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


  public UpdateRotatedSecretSC rotatorCredsType(String rotatorCredsType) {
    
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


  public UpdateRotatedSecretSC sshPassword(String sshPassword) {
    
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * Get sshPassword
   * @return sshPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshPassword() {
    return sshPassword;
  }


  public void setSshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
  }


  public UpdateRotatedSecretSC sshUsername(String sshUsername) {
    
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Get sshUsername
   * @return sshUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshUsername() {
    return sshUsername;
  }


  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public UpdateRotatedSecretSC token(String token) {
    
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


  public UpdateRotatedSecretSC uidToken(String uidToken) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRotatedSecretSC updateRotatedSecretSC = (UpdateRotatedSecretSC) o;
    return Objects.equals(this.addTag, updateRotatedSecretSC.addTag) &&
        Objects.equals(this.autoRotate, updateRotatedSecretSC.autoRotate) &&
        Objects.equals(this.gatewayUrl, updateRotatedSecretSC.gatewayUrl) &&
        Objects.equals(this.key, updateRotatedSecretSC.key) &&
        Objects.equals(this.name, updateRotatedSecretSC.name) &&
        Objects.equals(this.newMetadata, updateRotatedSecretSC.newMetadata) &&
        Objects.equals(this.newName, updateRotatedSecretSC.newName) &&
        Objects.equals(this.newVersion, updateRotatedSecretSC.newVersion) &&
        Objects.equals(this.rmTag, updateRotatedSecretSC.rmTag) &&
        Objects.equals(this.rotationInterval, updateRotatedSecretSC.rotationInterval) &&
        Objects.equals(this.rotationHour, updateRotatedSecretSC.rotationHour) &&
        Objects.equals(this.rotatorCredsType, updateRotatedSecretSC.rotatorCredsType) &&
        Objects.equals(this.sshPassword, updateRotatedSecretSC.sshPassword) &&
        Objects.equals(this.sshUsername, updateRotatedSecretSC.sshUsername) &&
        Objects.equals(this.token, updateRotatedSecretSC.token) &&
        Objects.equals(this.uidToken, updateRotatedSecretSC.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, autoRotate, gatewayUrl, key, name, newMetadata, newName, newVersion, rmTag, rotationInterval, rotationHour, rotatorCredsType, sshPassword, sshUsername, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRotatedSecretSC {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    gatewayUrl: ").append(toIndentedString(gatewayUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMetadata: ").append(toIndentedString(newMetadata)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotatorCredsType: ").append(toIndentedString(rotatorCredsType)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

