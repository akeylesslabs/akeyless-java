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
import java.util.Arrays;

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
 * gatewayUpdateCache is a command that updates cache settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateCache {
  public static final String SERIALIZED_NAME_BACKUP_INTERVAL = "backup-interval";
  @SerializedName(SERIALIZED_NAME_BACKUP_INTERVAL)
  @javax.annotation.Nullable
  private String backupInterval = "1";

  public static final String SERIALIZED_NAME_ENABLE_CACHE = "enable-cache";
  @SerializedName(SERIALIZED_NAME_ENABLE_CACHE)
  @javax.annotation.Nullable
  private String enableCache;

  public static final String SERIALIZED_NAME_ENABLE_PROACTIVE = "enable-proactive";
  @SerializedName(SERIALIZED_NAME_ENABLE_PROACTIVE)
  @javax.annotation.Nullable
  private String enableProactive;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_MINIMUM_FETCH_INTERVAL = "minimum-fetch-interval";
  @SerializedName(SERIALIZED_NAME_MINIMUM_FETCH_INTERVAL)
  @javax.annotation.Nullable
  private String minimumFetchInterval = "5";

  public static final String SERIALIZED_NAME_STALE_TIMEOUT = "stale-timeout";
  @SerializedName(SERIALIZED_NAME_STALE_TIMEOUT)
  @javax.annotation.Nullable
  private String staleTimeout = "60";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GatewayUpdateCache() {
  }

  public GatewayUpdateCache backupInterval(@javax.annotation.Nullable String backupInterval) {
    this.backupInterval = backupInterval;
    return this;
  }

  /**
   * Secure backup interval in minutes. To ensure service continuity in case of power cycle and network outage secrets will be backed up periodically per backup interval
   * @return backupInterval
   */
  @javax.annotation.Nullable
  public String getBackupInterval() {
    return backupInterval;
  }

  public void setBackupInterval(@javax.annotation.Nullable String backupInterval) {
    this.backupInterval = backupInterval;
  }


  public GatewayUpdateCache enableCache(@javax.annotation.Nullable String enableCache) {
    this.enableCache = enableCache;
    return this;
  }

  /**
   * Enable cache [true/false]
   * @return enableCache
   */
  @javax.annotation.Nullable
  public String getEnableCache() {
    return enableCache;
  }

  public void setEnableCache(@javax.annotation.Nullable String enableCache) {
    this.enableCache = enableCache;
  }


  public GatewayUpdateCache enableProactive(@javax.annotation.Nullable String enableProactive) {
    this.enableProactive = enableProactive;
    return this;
  }

  /**
   * Enable proactive caching [true/false]
   * @return enableProactive
   */
  @javax.annotation.Nullable
  public String getEnableProactive() {
    return enableProactive;
  }

  public void setEnableProactive(@javax.annotation.Nullable String enableProactive) {
    this.enableProactive = enableProactive;
  }


  public GatewayUpdateCache json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayUpdateCache minimumFetchInterval(@javax.annotation.Nullable String minimumFetchInterval) {
    this.minimumFetchInterval = minimumFetchInterval;
    return this;
  }

  /**
   * When using Cache or/and Proactive Cache, additional secrets will be fetched upon requesting a secret, based on the requestor&#39;s access policy. Define minimum fetching interval to avoid over fetching in a given time frame
   * @return minimumFetchInterval
   */
  @javax.annotation.Nullable
  public String getMinimumFetchInterval() {
    return minimumFetchInterval;
  }

  public void setMinimumFetchInterval(@javax.annotation.Nullable String minimumFetchInterval) {
    this.minimumFetchInterval = minimumFetchInterval;
  }


  public GatewayUpdateCache staleTimeout(@javax.annotation.Nullable String staleTimeout) {
    this.staleTimeout = staleTimeout;
    return this;
  }

  /**
   * Stale timeout in minutes, cache entries which are not accessed within timeout will be removed from cache
   * @return staleTimeout
   */
  @javax.annotation.Nullable
  public String getStaleTimeout() {
    return staleTimeout;
  }

  public void setStaleTimeout(@javax.annotation.Nullable String staleTimeout) {
    this.staleTimeout = staleTimeout;
  }


  public GatewayUpdateCache token(@javax.annotation.Nullable String token) {
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


  public GatewayUpdateCache uidToken(@javax.annotation.Nullable String uidToken) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateCache gatewayUpdateCache = (GatewayUpdateCache) o;
    return Objects.equals(this.backupInterval, gatewayUpdateCache.backupInterval) &&
        Objects.equals(this.enableCache, gatewayUpdateCache.enableCache) &&
        Objects.equals(this.enableProactive, gatewayUpdateCache.enableProactive) &&
        Objects.equals(this.json, gatewayUpdateCache.json) &&
        Objects.equals(this.minimumFetchInterval, gatewayUpdateCache.minimumFetchInterval) &&
        Objects.equals(this.staleTimeout, gatewayUpdateCache.staleTimeout) &&
        Objects.equals(this.token, gatewayUpdateCache.token) &&
        Objects.equals(this.uidToken, gatewayUpdateCache.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupInterval, enableCache, enableProactive, json, minimumFetchInterval, staleTimeout, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateCache {\n");
    sb.append("    backupInterval: ").append(toIndentedString(backupInterval)).append("\n");
    sb.append("    enableCache: ").append(toIndentedString(enableCache)).append("\n");
    sb.append("    enableProactive: ").append(toIndentedString(enableProactive)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    minimumFetchInterval: ").append(toIndentedString(minimumFetchInterval)).append("\n");
    sb.append("    staleTimeout: ").append(toIndentedString(staleTimeout)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("backup-interval");
    openapiFields.add("enable-cache");
    openapiFields.add("enable-proactive");
    openapiFields.add("json");
    openapiFields.add("minimum-fetch-interval");
    openapiFields.add("stale-timeout");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateCache
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateCache.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateCache is not found in the empty JSON string", GatewayUpdateCache.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateCache.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateCache` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("backup-interval") != null && !jsonObj.get("backup-interval").isJsonNull()) && !jsonObj.get("backup-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backup-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backup-interval").toString()));
      }
      if ((jsonObj.get("enable-cache") != null && !jsonObj.get("enable-cache").isJsonNull()) && !jsonObj.get("enable-cache").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable-cache` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable-cache").toString()));
      }
      if ((jsonObj.get("enable-proactive") != null && !jsonObj.get("enable-proactive").isJsonNull()) && !jsonObj.get("enable-proactive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable-proactive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable-proactive").toString()));
      }
      if ((jsonObj.get("minimum-fetch-interval") != null && !jsonObj.get("minimum-fetch-interval").isJsonNull()) && !jsonObj.get("minimum-fetch-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum-fetch-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum-fetch-interval").toString()));
      }
      if ((jsonObj.get("stale-timeout") != null && !jsonObj.get("stale-timeout").isJsonNull()) && !jsonObj.get("stale-timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stale-timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stale-timeout").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayUpdateCache.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateCache' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateCache> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateCache.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateCache>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateCache value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateCache read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateCache given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateCache
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateCache
   */
  public static GatewayUpdateCache fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateCache.class);
  }

  /**
   * Convert an instance of GatewayUpdateCache to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

