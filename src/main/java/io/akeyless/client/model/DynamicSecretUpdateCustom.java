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
 * DynamicSecretUpdateCustom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateCustom {
  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin_rotation_interval_days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  private Long adminRotationIntervalDays;

  public static final String SERIALIZED_NAME_CREATE_SYNC_URL = "create-sync-url";
  @SerializedName(SERIALIZED_NAME_CREATE_SYNC_URL)
  private String createSyncUrl;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable_admin_rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_REVOKE_SYNC_URL = "revoke-sync-url";
  @SerializedName(SERIALIZED_NAME_REVOKE_SYNC_URL)
  private String revokeSyncUrl;

  public static final String SERIALIZED_NAME_ROTATE_SYNC_URL = "rotate-sync-url";
  @SerializedName(SERIALIZED_NAME_ROTATE_SYNC_URL)
  private String rotateSyncUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TIMEOUT_SEC = "timeout-sec";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SEC)
  private Long timeoutSec = 60l;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public DynamicSecretUpdateCustom() { 
  }

  public DynamicSecretUpdateCustom adminRotationIntervalDays(Long adminRotationIntervalDays) {
    
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

   /**
   * Define rotation interval in days
   * @return adminRotationIntervalDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define rotation interval in days")

  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }


  public void setAdminRotationIntervalDays(Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public DynamicSecretUpdateCustom createSyncUrl(String createSyncUrl) {
    
    this.createSyncUrl = createSyncUrl;
    return this;
  }

   /**
   * URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create
   * @return createSyncUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create")

  public String getCreateSyncUrl() {
    return createSyncUrl;
  }


  public void setCreateSyncUrl(String createSyncUrl) {
    this.createSyncUrl = createSyncUrl;
  }


  public DynamicSecretUpdateCustom deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this object [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateCustom description(String description) {
    
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


  public DynamicSecretUpdateCustom enableAdminRotation(Boolean enableAdminRotation) {
    
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

   /**
   * Should admin credentials be rotated
   * @return enableAdminRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should admin credentials be rotated")

  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }


  public void setEnableAdminRotation(Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public DynamicSecretUpdateCustom json(Boolean json) {
    
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


  public DynamicSecretUpdateCustom name(String name) {
    
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


  public DynamicSecretUpdateCustom newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateCustom payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Secret payload to be sent with each create/revoke webhook request
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret payload to be sent with each create/revoke webhook request")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public DynamicSecretUpdateCustom producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretUpdateCustom revokeSyncUrl(String revokeSyncUrl) {
    
    this.revokeSyncUrl = revokeSyncUrl;
    return this;
  }

   /**
   * URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke
   * @return revokeSyncUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke")

  public String getRevokeSyncUrl() {
    return revokeSyncUrl;
  }


  public void setRevokeSyncUrl(String revokeSyncUrl) {
    this.revokeSyncUrl = revokeSyncUrl;
  }


  public DynamicSecretUpdateCustom rotateSyncUrl(String rotateSyncUrl) {
    
    this.rotateSyncUrl = rotateSyncUrl;
    return this;
  }

   /**
   * URL of an endpoint that implements /sync/rotate method, for example https://webhook.example.com/sync/rotate
   * @return rotateSyncUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of an endpoint that implements /sync/rotate method, for example https://webhook.example.com/sync/rotate")

  public String getRotateSyncUrl() {
    return rotateSyncUrl;
  }


  public void setRotateSyncUrl(String rotateSyncUrl) {
    this.rotateSyncUrl = rotateSyncUrl;
  }


  public DynamicSecretUpdateCustom tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateCustom addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdateCustom timeoutSec(Long timeoutSec) {
    
    this.timeoutSec = timeoutSec;
    return this;
  }

   /**
   * Maximum allowed time in seconds for the webhook to return the results
   * @return timeoutSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum allowed time in seconds for the webhook to return the results")

  public Long getTimeoutSec() {
    return timeoutSec;
  }


  public void setTimeoutSec(Long timeoutSec) {
    this.timeoutSec = timeoutSec;
  }


  public DynamicSecretUpdateCustom token(String token) {
    
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


  public DynamicSecretUpdateCustom uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateCustom userTtl(String userTtl) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretUpdateCustom dynamicSecretUpdateCustom = (DynamicSecretUpdateCustom) o;
    return Objects.equals(this.adminRotationIntervalDays, dynamicSecretUpdateCustom.adminRotationIntervalDays) &&
        Objects.equals(this.createSyncUrl, dynamicSecretUpdateCustom.createSyncUrl) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdateCustom.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateCustom.description) &&
        Objects.equals(this.enableAdminRotation, dynamicSecretUpdateCustom.enableAdminRotation) &&
        Objects.equals(this.json, dynamicSecretUpdateCustom.json) &&
        Objects.equals(this.name, dynamicSecretUpdateCustom.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateCustom.newName) &&
        Objects.equals(this.payload, dynamicSecretUpdateCustom.payload) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateCustom.producerEncryptionKeyName) &&
        Objects.equals(this.revokeSyncUrl, dynamicSecretUpdateCustom.revokeSyncUrl) &&
        Objects.equals(this.rotateSyncUrl, dynamicSecretUpdateCustom.rotateSyncUrl) &&
        Objects.equals(this.tags, dynamicSecretUpdateCustom.tags) &&
        Objects.equals(this.timeoutSec, dynamicSecretUpdateCustom.timeoutSec) &&
        Objects.equals(this.token, dynamicSecretUpdateCustom.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateCustom.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateCustom.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminRotationIntervalDays, createSyncUrl, deleteProtection, description, enableAdminRotation, json, name, newName, payload, producerEncryptionKeyName, revokeSyncUrl, rotateSyncUrl, tags, timeoutSec, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateCustom {\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    createSyncUrl: ").append(toIndentedString(createSyncUrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    revokeSyncUrl: ").append(toIndentedString(revokeSyncUrl)).append("\n");
    sb.append("    rotateSyncUrl: ").append(toIndentedString(rotateSyncUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timeoutSec: ").append(toIndentedString(timeoutSec)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

