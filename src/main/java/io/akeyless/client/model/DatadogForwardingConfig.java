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
 * DatadogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DatadogForwardingConfig {
  public static final String SERIALIZED_NAME_DATADOG_API_KEY = "datadog_api_key";
  @SerializedName(SERIALIZED_NAME_DATADOG_API_KEY)
  @javax.annotation.Nullable
  private String datadogApiKey;

  public static final String SERIALIZED_NAME_DATADOG_HOST = "datadog_host";
  @SerializedName(SERIALIZED_NAME_DATADOG_HOST)
  @javax.annotation.Nullable
  private String datadogHost;

  public static final String SERIALIZED_NAME_DATADOG_LOG_SERVICE = "datadog_log_service";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_SERVICE)
  @javax.annotation.Nullable
  private String datadogLogService;

  public static final String SERIALIZED_NAME_DATADOG_LOG_SOURCE = "datadog_log_source";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_SOURCE)
  @javax.annotation.Nullable
  private String datadogLogSource;

  public static final String SERIALIZED_NAME_DATADOG_LOG_TAGS = "datadog_log_tags";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_TAGS)
  @javax.annotation.Nullable
  private String datadogLogTags;

  public DatadogForwardingConfig() {
  }

  public DatadogForwardingConfig datadogApiKey(@javax.annotation.Nullable String datadogApiKey) {
    this.datadogApiKey = datadogApiKey;
    return this;
  }

  /**
   * Get datadogApiKey
   * @return datadogApiKey
   */
  @javax.annotation.Nullable
  public String getDatadogApiKey() {
    return datadogApiKey;
  }

  public void setDatadogApiKey(@javax.annotation.Nullable String datadogApiKey) {
    this.datadogApiKey = datadogApiKey;
  }


  public DatadogForwardingConfig datadogHost(@javax.annotation.Nullable String datadogHost) {
    this.datadogHost = datadogHost;
    return this;
  }

  /**
   * Get datadogHost
   * @return datadogHost
   */
  @javax.annotation.Nullable
  public String getDatadogHost() {
    return datadogHost;
  }

  public void setDatadogHost(@javax.annotation.Nullable String datadogHost) {
    this.datadogHost = datadogHost;
  }


  public DatadogForwardingConfig datadogLogService(@javax.annotation.Nullable String datadogLogService) {
    this.datadogLogService = datadogLogService;
    return this;
  }

  /**
   * Get datadogLogService
   * @return datadogLogService
   */
  @javax.annotation.Nullable
  public String getDatadogLogService() {
    return datadogLogService;
  }

  public void setDatadogLogService(@javax.annotation.Nullable String datadogLogService) {
    this.datadogLogService = datadogLogService;
  }


  public DatadogForwardingConfig datadogLogSource(@javax.annotation.Nullable String datadogLogSource) {
    this.datadogLogSource = datadogLogSource;
    return this;
  }

  /**
   * Get datadogLogSource
   * @return datadogLogSource
   */
  @javax.annotation.Nullable
  public String getDatadogLogSource() {
    return datadogLogSource;
  }

  public void setDatadogLogSource(@javax.annotation.Nullable String datadogLogSource) {
    this.datadogLogSource = datadogLogSource;
  }


  public DatadogForwardingConfig datadogLogTags(@javax.annotation.Nullable String datadogLogTags) {
    this.datadogLogTags = datadogLogTags;
    return this;
  }

  /**
   * Get datadogLogTags
   * @return datadogLogTags
   */
  @javax.annotation.Nullable
  public String getDatadogLogTags() {
    return datadogLogTags;
  }

  public void setDatadogLogTags(@javax.annotation.Nullable String datadogLogTags) {
    this.datadogLogTags = datadogLogTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadogForwardingConfig datadogForwardingConfig = (DatadogForwardingConfig) o;
    return Objects.equals(this.datadogApiKey, datadogForwardingConfig.datadogApiKey) &&
        Objects.equals(this.datadogHost, datadogForwardingConfig.datadogHost) &&
        Objects.equals(this.datadogLogService, datadogForwardingConfig.datadogLogService) &&
        Objects.equals(this.datadogLogSource, datadogForwardingConfig.datadogLogSource) &&
        Objects.equals(this.datadogLogTags, datadogForwardingConfig.datadogLogTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datadogApiKey, datadogHost, datadogLogService, datadogLogSource, datadogLogTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadogForwardingConfig {\n");
    sb.append("    datadogApiKey: ").append(toIndentedString(datadogApiKey)).append("\n");
    sb.append("    datadogHost: ").append(toIndentedString(datadogHost)).append("\n");
    sb.append("    datadogLogService: ").append(toIndentedString(datadogLogService)).append("\n");
    sb.append("    datadogLogSource: ").append(toIndentedString(datadogLogSource)).append("\n");
    sb.append("    datadogLogTags: ").append(toIndentedString(datadogLogTags)).append("\n");
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
    openapiFields.add("datadog_api_key");
    openapiFields.add("datadog_host");
    openapiFields.add("datadog_log_service");
    openapiFields.add("datadog_log_source");
    openapiFields.add("datadog_log_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatadogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatadogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadogForwardingConfig is not found in the empty JSON string", DatadogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatadogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datadog_api_key") != null && !jsonObj.get("datadog_api_key").isJsonNull()) && !jsonObj.get("datadog_api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_api_key").toString()));
      }
      if ((jsonObj.get("datadog_host") != null && !jsonObj.get("datadog_host").isJsonNull()) && !jsonObj.get("datadog_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_host").toString()));
      }
      if ((jsonObj.get("datadog_log_service") != null && !jsonObj.get("datadog_log_service").isJsonNull()) && !jsonObj.get("datadog_log_service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_log_service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_log_service").toString()));
      }
      if ((jsonObj.get("datadog_log_source") != null && !jsonObj.get("datadog_log_source").isJsonNull()) && !jsonObj.get("datadog_log_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_log_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_log_source").toString()));
      }
      if ((jsonObj.get("datadog_log_tags") != null && !jsonObj.get("datadog_log_tags").isJsonNull()) && !jsonObj.get("datadog_log_tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_log_tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_log_tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, DatadogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatadogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatadogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to DatadogForwardingConfig
   */
  public static DatadogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadogForwardingConfig.class);
  }

  /**
   * Convert an instance of DatadogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

