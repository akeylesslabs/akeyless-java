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
 * AzureLogAnalyticsForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AzureLogAnalyticsForwardingConfig {
  public static final String SERIALIZED_NAME_AZURE_WORKSPACE_ID = "azure_workspace_id";
  @SerializedName(SERIALIZED_NAME_AZURE_WORKSPACE_ID)
  @javax.annotation.Nullable
  private String azureWorkspaceId;

  public static final String SERIALIZED_NAME_AZURE_WORKSPACE_KEY = "azure_workspace_key";
  @SerializedName(SERIALIZED_NAME_AZURE_WORKSPACE_KEY)
  @javax.annotation.Nullable
  private String azureWorkspaceKey;

  public AzureLogAnalyticsForwardingConfig() {
  }

  public AzureLogAnalyticsForwardingConfig azureWorkspaceId(@javax.annotation.Nullable String azureWorkspaceId) {
    this.azureWorkspaceId = azureWorkspaceId;
    return this;
  }

  /**
   * Get azureWorkspaceId
   * @return azureWorkspaceId
   */
  @javax.annotation.Nullable
  public String getAzureWorkspaceId() {
    return azureWorkspaceId;
  }

  public void setAzureWorkspaceId(@javax.annotation.Nullable String azureWorkspaceId) {
    this.azureWorkspaceId = azureWorkspaceId;
  }


  public AzureLogAnalyticsForwardingConfig azureWorkspaceKey(@javax.annotation.Nullable String azureWorkspaceKey) {
    this.azureWorkspaceKey = azureWorkspaceKey;
    return this;
  }

  /**
   * Get azureWorkspaceKey
   * @return azureWorkspaceKey
   */
  @javax.annotation.Nullable
  public String getAzureWorkspaceKey() {
    return azureWorkspaceKey;
  }

  public void setAzureWorkspaceKey(@javax.annotation.Nullable String azureWorkspaceKey) {
    this.azureWorkspaceKey = azureWorkspaceKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureLogAnalyticsForwardingConfig azureLogAnalyticsForwardingConfig = (AzureLogAnalyticsForwardingConfig) o;
    return Objects.equals(this.azureWorkspaceId, azureLogAnalyticsForwardingConfig.azureWorkspaceId) &&
        Objects.equals(this.azureWorkspaceKey, azureLogAnalyticsForwardingConfig.azureWorkspaceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureWorkspaceId, azureWorkspaceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureLogAnalyticsForwardingConfig {\n");
    sb.append("    azureWorkspaceId: ").append(toIndentedString(azureWorkspaceId)).append("\n");
    sb.append("    azureWorkspaceKey: ").append(toIndentedString(azureWorkspaceKey)).append("\n");
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
    openapiFields.add("azure_workspace_id");
    openapiFields.add("azure_workspace_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AzureLogAnalyticsForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AzureLogAnalyticsForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AzureLogAnalyticsForwardingConfig is not found in the empty JSON string", AzureLogAnalyticsForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AzureLogAnalyticsForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AzureLogAnalyticsForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("azure_workspace_id") != null && !jsonObj.get("azure_workspace_id").isJsonNull()) && !jsonObj.get("azure_workspace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure_workspace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure_workspace_id").toString()));
      }
      if ((jsonObj.get("azure_workspace_key") != null && !jsonObj.get("azure_workspace_key").isJsonNull()) && !jsonObj.get("azure_workspace_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure_workspace_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure_workspace_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AzureLogAnalyticsForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AzureLogAnalyticsForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AzureLogAnalyticsForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AzureLogAnalyticsForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AzureLogAnalyticsForwardingConfig>() {
           @Override
           public void write(JsonWriter out, AzureLogAnalyticsForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AzureLogAnalyticsForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AzureLogAnalyticsForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AzureLogAnalyticsForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to AzureLogAnalyticsForwardingConfig
   */
  public static AzureLogAnalyticsForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AzureLogAnalyticsForwardingConfig.class);
  }

  /**
   * Convert an instance of AzureLogAnalyticsForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

