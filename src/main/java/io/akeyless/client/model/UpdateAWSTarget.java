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
 * UpdateAWSTarget
 */

public class UpdateAWSTarget {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access-key-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

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

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session-token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private String sessionToken;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;


  public UpdateAWSTarget accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public UpdateAWSTarget accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public UpdateAWSTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateAWSTarget keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateAWSTarget key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public UpdateAWSTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAWSTarget newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateAWSTarget region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public UpdateAWSTarget sessionToken(String sessionToken) {
    
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSessionToken() {
    return sessionToken;
  }


  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public UpdateAWSTarget token(String token) {
    
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


  public UpdateAWSTarget uidToken(String uidToken) {
    
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


  public UpdateAWSTarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Deprecated
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  public UpdateAWSTarget useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAWSTarget updateAWSTarget = (UpdateAWSTarget) o;
    return Objects.equals(this.accessKey, updateAWSTarget.accessKey) &&
        Objects.equals(this.accessKeyId, updateAWSTarget.accessKeyId) &&
        Objects.equals(this.comment, updateAWSTarget.comment) &&
        Objects.equals(this.keepPrevVersion, updateAWSTarget.keepPrevVersion) &&
        Objects.equals(this.key, updateAWSTarget.key) &&
        Objects.equals(this.name, updateAWSTarget.name) &&
        Objects.equals(this.newName, updateAWSTarget.newName) &&
        Objects.equals(this.region, updateAWSTarget.region) &&
        Objects.equals(this.sessionToken, updateAWSTarget.sessionToken) &&
        Objects.equals(this.token, updateAWSTarget.token) &&
        Objects.equals(this.uidToken, updateAWSTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateAWSTarget.updateVersion) &&
        Objects.equals(this.useGwCloudIdentity, updateAWSTarget.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, accessKeyId, comment, keepPrevVersion, key, name, newName, region, sessionToken, token, uidToken, updateVersion, useGwCloudIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAWSTarget {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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

