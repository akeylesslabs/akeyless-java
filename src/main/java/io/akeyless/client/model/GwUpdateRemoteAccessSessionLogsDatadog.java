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
 * gwUpdateRemoteAccessSessionLogsDatadog is a command that updates session log forwarding config (datadog target)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GwUpdateRemoteAccessSessionLogsDatadog {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  @javax.annotation.Nullable
  private String apiKey;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LOG_SERVICE = "log-service";
  @SerializedName(SERIALIZED_NAME_LOG_SERVICE)
  @javax.annotation.Nullable
  private String logService = "use-existing";

  public static final String SERIALIZED_NAME_LOG_SOURCE = "log-source";
  @SerializedName(SERIALIZED_NAME_LOG_SOURCE)
  @javax.annotation.Nullable
  private String logSource = "use-existing";

  public static final String SERIALIZED_NAME_LOG_TAGS = "log-tags";
  @SerializedName(SERIALIZED_NAME_LOG_TAGS)
  @javax.annotation.Nullable
  private String logTags = "use-existing";

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  @javax.annotation.Nullable
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GwUpdateRemoteAccessSessionLogsDatadog() {
  }

  public GwUpdateRemoteAccessSessionLogsDatadog apiKey(@javax.annotation.Nullable String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Datadog api key
   * @return apiKey
   */
  @javax.annotation.Nullable
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(@javax.annotation.Nullable String apiKey) {
    this.apiKey = apiKey;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog enable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Enable Log Forwarding [true/false]
   * @return enable
   */
  @javax.annotation.Nullable
  public String getEnable() {
    return enable;
  }

  public void setEnable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog host(@javax.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Datadog host
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = host;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog json(@javax.annotation.Nullable Boolean json) {
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


  public GwUpdateRemoteAccessSessionLogsDatadog logService(@javax.annotation.Nullable String logService) {
    this.logService = logService;
    return this;
  }

  /**
   * Datadog log service
   * @return logService
   */
  @javax.annotation.Nullable
  public String getLogService() {
    return logService;
  }

  public void setLogService(@javax.annotation.Nullable String logService) {
    this.logService = logService;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog logSource(@javax.annotation.Nullable String logSource) {
    this.logSource = logSource;
    return this;
  }

  /**
   * Datadog log source
   * @return logSource
   */
  @javax.annotation.Nullable
  public String getLogSource() {
    return logSource;
  }

  public void setLogSource(@javax.annotation.Nullable String logSource) {
    this.logSource = logSource;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog logTags(@javax.annotation.Nullable String logTags) {
    this.logTags = logTags;
    return this;
  }

  /**
   * A comma-separated list of Datadog log tags formatted as \&quot;key:value\&quot; strings
   * @return logTags
   */
  @javax.annotation.Nullable
  public String getLogTags() {
    return logTags;
  }

  public void setLogTags(@javax.annotation.Nullable String logTags) {
    this.logTags = logTags;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog outputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Logs format [text/json]
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog pullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
    return this;
  }

  /**
   * Pull interval in seconds
   * @return pullInterval
   */
  @javax.annotation.Nullable
  public String getPullInterval() {
    return pullInterval;
  }

  public void setPullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog token(@javax.annotation.Nullable String token) {
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


  public GwUpdateRemoteAccessSessionLogsDatadog uidToken(@javax.annotation.Nullable String uidToken) {
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
    GwUpdateRemoteAccessSessionLogsDatadog gwUpdateRemoteAccessSessionLogsDatadog = (GwUpdateRemoteAccessSessionLogsDatadog) o;
    return Objects.equals(this.apiKey, gwUpdateRemoteAccessSessionLogsDatadog.apiKey) &&
        Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsDatadog.enable) &&
        Objects.equals(this.host, gwUpdateRemoteAccessSessionLogsDatadog.host) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsDatadog.json) &&
        Objects.equals(this.logService, gwUpdateRemoteAccessSessionLogsDatadog.logService) &&
        Objects.equals(this.logSource, gwUpdateRemoteAccessSessionLogsDatadog.logSource) &&
        Objects.equals(this.logTags, gwUpdateRemoteAccessSessionLogsDatadog.logTags) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsDatadog.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsDatadog.pullInterval) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsDatadog.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsDatadog.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, enable, host, json, logService, logSource, logTags, outputFormat, pullInterval, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsDatadog {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    logService: ").append(toIndentedString(logService)).append("\n");
    sb.append("    logSource: ").append(toIndentedString(logSource)).append("\n");
    sb.append("    logTags: ").append(toIndentedString(logTags)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
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
    openapiFields.add("api-key");
    openapiFields.add("enable");
    openapiFields.add("host");
    openapiFields.add("json");
    openapiFields.add("log-service");
    openapiFields.add("log-source");
    openapiFields.add("log-tags");
    openapiFields.add("output-format");
    openapiFields.add("pull-interval");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GwUpdateRemoteAccessSessionLogsDatadog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GwUpdateRemoteAccessSessionLogsDatadog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GwUpdateRemoteAccessSessionLogsDatadog is not found in the empty JSON string", GwUpdateRemoteAccessSessionLogsDatadog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GwUpdateRemoteAccessSessionLogsDatadog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GwUpdateRemoteAccessSessionLogsDatadog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api-key") != null && !jsonObj.get("api-key").isJsonNull()) && !jsonObj.get("api-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api-key").toString()));
      }
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("log-service") != null && !jsonObj.get("log-service").isJsonNull()) && !jsonObj.get("log-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log-service").toString()));
      }
      if ((jsonObj.get("log-source") != null && !jsonObj.get("log-source").isJsonNull()) && !jsonObj.get("log-source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log-source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log-source").toString()));
      }
      if ((jsonObj.get("log-tags") != null && !jsonObj.get("log-tags").isJsonNull()) && !jsonObj.get("log-tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log-tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log-tags").toString()));
      }
      if ((jsonObj.get("output-format") != null && !jsonObj.get("output-format").isJsonNull()) && !jsonObj.get("output-format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output-format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output-format").toString()));
      }
      if ((jsonObj.get("pull-interval") != null && !jsonObj.get("pull-interval").isJsonNull()) && !jsonObj.get("pull-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull-interval").toString()));
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
       if (!GwUpdateRemoteAccessSessionLogsDatadog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GwUpdateRemoteAccessSessionLogsDatadog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GwUpdateRemoteAccessSessionLogsDatadog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GwUpdateRemoteAccessSessionLogsDatadog.class));

       return (TypeAdapter<T>) new TypeAdapter<GwUpdateRemoteAccessSessionLogsDatadog>() {
           @Override
           public void write(JsonWriter out, GwUpdateRemoteAccessSessionLogsDatadog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GwUpdateRemoteAccessSessionLogsDatadog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GwUpdateRemoteAccessSessionLogsDatadog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GwUpdateRemoteAccessSessionLogsDatadog
   * @throws IOException if the JSON string is invalid with respect to GwUpdateRemoteAccessSessionLogsDatadog
   */
  public static GwUpdateRemoteAccessSessionLogsDatadog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GwUpdateRemoteAccessSessionLogsDatadog.class);
  }

  /**
   * Convert an instance of GwUpdateRemoteAccessSessionLogsDatadog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

