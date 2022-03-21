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
 * GatewayUpdateProducerCustom
 */

public class GatewayUpdateProducerCustom {
  public static final String SERIALIZED_NAME_CREATE_SYNC_URL = "create-sync-url";
  @SerializedName(SERIALIZED_NAME_CREATE_SYNC_URL)
  private String createSyncUrl;

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


  public GatewayUpdateProducerCustom createSyncUrl(String createSyncUrl) {
    
    this.createSyncUrl = createSyncUrl;
    return this;
  }

   /**
   * URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create
   * @return createSyncUrl
  **/
  @ApiModelProperty(required = true, value = "URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create")

  public String getCreateSyncUrl() {
    return createSyncUrl;
  }


  public void setCreateSyncUrl(String createSyncUrl) {
    this.createSyncUrl = createSyncUrl;
  }


  public GatewayUpdateProducerCustom name(String name) {
    
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


  public GatewayUpdateProducerCustom newName(String newName) {
    
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


  public GatewayUpdateProducerCustom payload(String payload) {
    
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


  public GatewayUpdateProducerCustom producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerCustom revokeSyncUrl(String revokeSyncUrl) {
    
    this.revokeSyncUrl = revokeSyncUrl;
    return this;
  }

   /**
   * URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke
   * @return revokeSyncUrl
  **/
  @ApiModelProperty(required = true, value = "URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke")

  public String getRevokeSyncUrl() {
    return revokeSyncUrl;
  }


  public void setRevokeSyncUrl(String revokeSyncUrl) {
    this.revokeSyncUrl = revokeSyncUrl;
  }


  public GatewayUpdateProducerCustom rotateSyncUrl(String rotateSyncUrl) {
    
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


  public GatewayUpdateProducerCustom tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerCustom addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerCustom timeoutSec(Long timeoutSec) {
    
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


  public GatewayUpdateProducerCustom token(String token) {
    
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


  public GatewayUpdateProducerCustom uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerCustom userTtl(String userTtl) {
    
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
    GatewayUpdateProducerCustom gatewayUpdateProducerCustom = (GatewayUpdateProducerCustom) o;
    return Objects.equals(this.createSyncUrl, gatewayUpdateProducerCustom.createSyncUrl) &&
        Objects.equals(this.name, gatewayUpdateProducerCustom.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerCustom.newName) &&
        Objects.equals(this.payload, gatewayUpdateProducerCustom.payload) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerCustom.producerEncryptionKeyName) &&
        Objects.equals(this.revokeSyncUrl, gatewayUpdateProducerCustom.revokeSyncUrl) &&
        Objects.equals(this.rotateSyncUrl, gatewayUpdateProducerCustom.rotateSyncUrl) &&
        Objects.equals(this.tags, gatewayUpdateProducerCustom.tags) &&
        Objects.equals(this.timeoutSec, gatewayUpdateProducerCustom.timeoutSec) &&
        Objects.equals(this.token, gatewayUpdateProducerCustom.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerCustom.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerCustom.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createSyncUrl, name, newName, payload, producerEncryptionKeyName, revokeSyncUrl, rotateSyncUrl, tags, timeoutSec, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerCustom {\n");
    sb.append("    createSyncUrl: ").append(toIndentedString(createSyncUrl)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

