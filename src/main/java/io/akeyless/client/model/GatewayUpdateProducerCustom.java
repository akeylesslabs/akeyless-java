/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * gatewayUpdateProducerCustom is a command that updates a custom producer. [Deprecated: Use dynamic-secret-update-custom command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateProducerCustom {
  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin-rotation-interval-days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  @javax.annotation.Nullable
  private Long adminRotationIntervalDays;

  public static final String SERIALIZED_NAME_CREATE_SYNC_URL = "create-sync-url";
  @SerializedName(SERIALIZED_NAME_CREATE_SYNC_URL)
  @javax.annotation.Nonnull
  private String createSyncUrl;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  @javax.annotation.Nullable
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private String payload;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_REVOKE_SYNC_URL = "revoke-sync-url";
  @SerializedName(SERIALIZED_NAME_REVOKE_SYNC_URL)
  @javax.annotation.Nonnull
  private String revokeSyncUrl;

  public static final String SERIALIZED_NAME_ROTATE_SYNC_URL = "rotate-sync-url";
  @SerializedName(SERIALIZED_NAME_ROTATE_SYNC_URL)
  @javax.annotation.Nullable
  private String rotateSyncUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMEOUT_SEC = "timeout-sec";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SEC)
  @javax.annotation.Nullable
  private Long timeoutSec = 60l;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public GatewayUpdateProducerCustom() {
  }

  public GatewayUpdateProducerCustom adminRotationIntervalDays(@javax.annotation.Nullable Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

  /**
   * Define rotation interval in days
   * @return adminRotationIntervalDays
   */
  @javax.annotation.Nullable
  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }

  public void setAdminRotationIntervalDays(@javax.annotation.Nullable Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public GatewayUpdateProducerCustom createSyncUrl(@javax.annotation.Nonnull String createSyncUrl) {
    this.createSyncUrl = createSyncUrl;
    return this;
  }

  /**
   * URL of an endpoint that implements /sync/create method, for example https://webhook.example.com/sync/create
   * @return createSyncUrl
   */
  @javax.annotation.Nonnull
  public String getCreateSyncUrl() {
    return createSyncUrl;
  }

  public void setCreateSyncUrl(@javax.annotation.Nonnull String createSyncUrl) {
    this.createSyncUrl = createSyncUrl;
  }


  public GatewayUpdateProducerCustom deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayUpdateProducerCustom enableAdminRotation(@javax.annotation.Nullable Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

  /**
   * Should admin credentials be rotated
   * @return enableAdminRotation
   */
  @javax.annotation.Nullable
  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }

  public void setEnableAdminRotation(@javax.annotation.Nullable Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public GatewayUpdateProducerCustom json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public GatewayUpdateProducerCustom name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GatewayUpdateProducerCustom newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Dynamic secret name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerCustom payload(@javax.annotation.Nullable String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Secret payload to be sent with each create/revoke webhook request
   * @return payload
   */
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable String payload) {
    this.payload = payload;
  }


  public GatewayUpdateProducerCustom producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayUpdateProducerCustom revokeSyncUrl(@javax.annotation.Nonnull String revokeSyncUrl) {
    this.revokeSyncUrl = revokeSyncUrl;
    return this;
  }

  /**
   * URL of an endpoint that implements /sync/revoke method, for example https://webhook.example.com/sync/revoke
   * @return revokeSyncUrl
   */
  @javax.annotation.Nonnull
  public String getRevokeSyncUrl() {
    return revokeSyncUrl;
  }

  public void setRevokeSyncUrl(@javax.annotation.Nonnull String revokeSyncUrl) {
    this.revokeSyncUrl = revokeSyncUrl;
  }


  public GatewayUpdateProducerCustom rotateSyncUrl(@javax.annotation.Nullable String rotateSyncUrl) {
    this.rotateSyncUrl = rotateSyncUrl;
    return this;
  }

  /**
   * URL of an endpoint that implements /sync/rotate method, for example https://webhook.example.com/sync/rotate
   * @return rotateSyncUrl
   */
  @javax.annotation.Nullable
  public String getRotateSyncUrl() {
    return rotateSyncUrl;
  }

  public void setRotateSyncUrl(@javax.annotation.Nullable String rotateSyncUrl) {
    this.rotateSyncUrl = rotateSyncUrl;
  }


  public GatewayUpdateProducerCustom tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerCustom addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public GatewayUpdateProducerCustom timeoutSec(@javax.annotation.Nullable Long timeoutSec) {
    this.timeoutSec = timeoutSec;
    return this;
  }

  /**
   * Maximum allowed time in seconds for the webhook to return the results
   * @return timeoutSec
   */
  @javax.annotation.Nullable
  public Long getTimeoutSec() {
    return timeoutSec;
  }

  public void setTimeoutSec(@javax.annotation.Nullable Long timeoutSec) {
    this.timeoutSec = timeoutSec;
  }


  public GatewayUpdateProducerCustom token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public GatewayUpdateProducerCustom uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }


  public GatewayUpdateProducerCustom userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
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
    GatewayUpdateProducerCustom gatewayUpdateProducerCustom = (GatewayUpdateProducerCustom) o;
    return Objects.equals(this.adminRotationIntervalDays, gatewayUpdateProducerCustom.adminRotationIntervalDays) &&
        Objects.equals(this.createSyncUrl, gatewayUpdateProducerCustom.createSyncUrl) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerCustom.deleteProtection) &&
        Objects.equals(this.enableAdminRotation, gatewayUpdateProducerCustom.enableAdminRotation) &&
        Objects.equals(this.json, gatewayUpdateProducerCustom.json) &&
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
    return Objects.hash(adminRotationIntervalDays, createSyncUrl, deleteProtection, enableAdminRotation, json, name, newName, payload, producerEncryptionKeyName, revokeSyncUrl, rotateSyncUrl, tags, timeoutSec, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerCustom {\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    createSyncUrl: ").append(toIndentedString(createSyncUrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("admin-rotation-interval-days");
    openapiFields.add("create-sync-url");
    openapiFields.add("delete_protection");
    openapiFields.add("enable-admin-rotation");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("payload");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("revoke-sync-url");
    openapiFields.add("rotate-sync-url");
    openapiFields.add("tags");
    openapiFields.add("timeout-sec");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create-sync-url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("revoke-sync-url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateProducerCustom
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateProducerCustom.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateProducerCustom is not found in the empty JSON string", GatewayUpdateProducerCustom.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateProducerCustom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateProducerCustom` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayUpdateProducerCustom.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("create-sync-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create-sync-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create-sync-url").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if (!jsonObj.get("revoke-sync-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revoke-sync-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revoke-sync-url").toString()));
      }
      if ((jsonObj.get("rotate-sync-url") != null && !jsonObj.get("rotate-sync-url").isJsonNull()) && !jsonObj.get("rotate-sync-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotate-sync-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotate-sync-url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayUpdateProducerCustom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateProducerCustom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateProducerCustom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateProducerCustom.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateProducerCustom>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateProducerCustom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateProducerCustom read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateProducerCustom given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateProducerCustom
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateProducerCustom
   */
  public static GatewayUpdateProducerCustom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateProducerCustom.class);
  }

  /**
   * Convert an instance of GatewayUpdateProducerCustom to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

