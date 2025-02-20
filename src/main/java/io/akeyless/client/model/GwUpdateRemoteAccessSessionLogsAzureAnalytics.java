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
 * gwUpdateRemoteAccessSessionLogsAzureAnalytics is a command that updates session log forwarding config (azure-analytics target)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GwUpdateRemoteAccessSessionLogsAzureAnalytics {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspace-id";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  @javax.annotation.Nullable
  private String workspaceId;

  public static final String SERIALIZED_NAME_WORKSPACE_KEY = "workspace-key";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_KEY)
  @javax.annotation.Nullable
  private String workspaceKey;

  public GwUpdateRemoteAccessSessionLogsAzureAnalytics() {
  }

  public GwUpdateRemoteAccessSessionLogsAzureAnalytics enable(@javax.annotation.Nullable String enable) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics json(@javax.annotation.Nullable Boolean json) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics outputFormat(@javax.annotation.Nullable String outputFormat) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics pullInterval(@javax.annotation.Nullable String pullInterval) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics token(@javax.annotation.Nullable String token) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics workspaceId(@javax.annotation.Nullable String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Azure workspace id
   * @return workspaceId
   */
  @javax.annotation.Nullable
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(@javax.annotation.Nullable String workspaceId) {
    this.workspaceId = workspaceId;
  }


  public GwUpdateRemoteAccessSessionLogsAzureAnalytics workspaceKey(@javax.annotation.Nullable String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
  }

  /**
   * Azure workspace key
   * @return workspaceKey
   */
  @javax.annotation.Nullable
  public String getWorkspaceKey() {
    return workspaceKey;
  }

  public void setWorkspaceKey(@javax.annotation.Nullable String workspaceKey) {
    this.workspaceKey = workspaceKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GwUpdateRemoteAccessSessionLogsAzureAnalytics gwUpdateRemoteAccessSessionLogsAzureAnalytics = (GwUpdateRemoteAccessSessionLogsAzureAnalytics) o;
    return Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsAzureAnalytics.enable) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsAzureAnalytics.json) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsAzureAnalytics.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsAzureAnalytics.pullInterval) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsAzureAnalytics.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsAzureAnalytics.uidToken) &&
        Objects.equals(this.workspaceId, gwUpdateRemoteAccessSessionLogsAzureAnalytics.workspaceId) &&
        Objects.equals(this.workspaceKey, gwUpdateRemoteAccessSessionLogsAzureAnalytics.workspaceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, json, outputFormat, pullInterval, token, uidToken, workspaceId, workspaceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsAzureAnalytics {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceKey: ").append(toIndentedString(workspaceKey)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("json");
    openapiFields.add("output-format");
    openapiFields.add("pull-interval");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("workspace-id");
    openapiFields.add("workspace-key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GwUpdateRemoteAccessSessionLogsAzureAnalytics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GwUpdateRemoteAccessSessionLogsAzureAnalytics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GwUpdateRemoteAccessSessionLogsAzureAnalytics is not found in the empty JSON string", GwUpdateRemoteAccessSessionLogsAzureAnalytics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GwUpdateRemoteAccessSessionLogsAzureAnalytics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GwUpdateRemoteAccessSessionLogsAzureAnalytics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
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
      if ((jsonObj.get("workspace-id") != null && !jsonObj.get("workspace-id").isJsonNull()) && !jsonObj.get("workspace-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace-id").toString()));
      }
      if ((jsonObj.get("workspace-key") != null && !jsonObj.get("workspace-key").isJsonNull()) && !jsonObj.get("workspace-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace-key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GwUpdateRemoteAccessSessionLogsAzureAnalytics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GwUpdateRemoteAccessSessionLogsAzureAnalytics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GwUpdateRemoteAccessSessionLogsAzureAnalytics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GwUpdateRemoteAccessSessionLogsAzureAnalytics.class));

       return (TypeAdapter<T>) new TypeAdapter<GwUpdateRemoteAccessSessionLogsAzureAnalytics>() {
           @Override
           public void write(JsonWriter out, GwUpdateRemoteAccessSessionLogsAzureAnalytics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GwUpdateRemoteAccessSessionLogsAzureAnalytics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GwUpdateRemoteAccessSessionLogsAzureAnalytics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GwUpdateRemoteAccessSessionLogsAzureAnalytics
   * @throws IOException if the JSON string is invalid with respect to GwUpdateRemoteAccessSessionLogsAzureAnalytics
   */
  public static GwUpdateRemoteAccessSessionLogsAzureAnalytics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GwUpdateRemoteAccessSessionLogsAzureAnalytics.class);
  }

  /**
   * Convert an instance of GwUpdateRemoteAccessSessionLogsAzureAnalytics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

