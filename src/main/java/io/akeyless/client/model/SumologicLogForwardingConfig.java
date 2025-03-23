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
 * SumologicLogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SumologicLogForwardingConfig {
  public static final String SERIALIZED_NAME_SUMO_LOGIC_ENDPOINT = "sumo_logic_endpoint";
  @SerializedName(SERIALIZED_NAME_SUMO_LOGIC_ENDPOINT)
  @javax.annotation.Nullable
  private String sumoLogicEndpoint;

  public static final String SERIALIZED_NAME_SUMO_LOGIC_HOST = "sumo_logic_host";
  @SerializedName(SERIALIZED_NAME_SUMO_LOGIC_HOST)
  @javax.annotation.Nullable
  private String sumoLogicHost;

  public static final String SERIALIZED_NAME_SUMO_LOGIC_TAGS = "sumo_logic_tags";
  @SerializedName(SERIALIZED_NAME_SUMO_LOGIC_TAGS)
  @javax.annotation.Nullable
  private String sumoLogicTags;

  public SumologicLogForwardingConfig() {
  }

  public SumologicLogForwardingConfig sumoLogicEndpoint(@javax.annotation.Nullable String sumoLogicEndpoint) {
    this.sumoLogicEndpoint = sumoLogicEndpoint;
    return this;
  }

  /**
   * Get sumoLogicEndpoint
   * @return sumoLogicEndpoint
   */
  @javax.annotation.Nullable
  public String getSumoLogicEndpoint() {
    return sumoLogicEndpoint;
  }

  public void setSumoLogicEndpoint(@javax.annotation.Nullable String sumoLogicEndpoint) {
    this.sumoLogicEndpoint = sumoLogicEndpoint;
  }


  public SumologicLogForwardingConfig sumoLogicHost(@javax.annotation.Nullable String sumoLogicHost) {
    this.sumoLogicHost = sumoLogicHost;
    return this;
  }

  /**
   * Get sumoLogicHost
   * @return sumoLogicHost
   */
  @javax.annotation.Nullable
  public String getSumoLogicHost() {
    return sumoLogicHost;
  }

  public void setSumoLogicHost(@javax.annotation.Nullable String sumoLogicHost) {
    this.sumoLogicHost = sumoLogicHost;
  }


  public SumologicLogForwardingConfig sumoLogicTags(@javax.annotation.Nullable String sumoLogicTags) {
    this.sumoLogicTags = sumoLogicTags;
    return this;
  }

  /**
   * Get sumoLogicTags
   * @return sumoLogicTags
   */
  @javax.annotation.Nullable
  public String getSumoLogicTags() {
    return sumoLogicTags;
  }

  public void setSumoLogicTags(@javax.annotation.Nullable String sumoLogicTags) {
    this.sumoLogicTags = sumoLogicTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SumologicLogForwardingConfig sumologicLogForwardingConfig = (SumologicLogForwardingConfig) o;
    return Objects.equals(this.sumoLogicEndpoint, sumologicLogForwardingConfig.sumoLogicEndpoint) &&
        Objects.equals(this.sumoLogicHost, sumologicLogForwardingConfig.sumoLogicHost) &&
        Objects.equals(this.sumoLogicTags, sumologicLogForwardingConfig.sumoLogicTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumoLogicEndpoint, sumoLogicHost, sumoLogicTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumologicLogForwardingConfig {\n");
    sb.append("    sumoLogicEndpoint: ").append(toIndentedString(sumoLogicEndpoint)).append("\n");
    sb.append("    sumoLogicHost: ").append(toIndentedString(sumoLogicHost)).append("\n");
    sb.append("    sumoLogicTags: ").append(toIndentedString(sumoLogicTags)).append("\n");
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
    openapiFields.add("sumo_logic_endpoint");
    openapiFields.add("sumo_logic_host");
    openapiFields.add("sumo_logic_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SumologicLogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SumologicLogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SumologicLogForwardingConfig is not found in the empty JSON string", SumologicLogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SumologicLogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SumologicLogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sumo_logic_endpoint") != null && !jsonObj.get("sumo_logic_endpoint").isJsonNull()) && !jsonObj.get("sumo_logic_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sumo_logic_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sumo_logic_endpoint").toString()));
      }
      if ((jsonObj.get("sumo_logic_host") != null && !jsonObj.get("sumo_logic_host").isJsonNull()) && !jsonObj.get("sumo_logic_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sumo_logic_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sumo_logic_host").toString()));
      }
      if ((jsonObj.get("sumo_logic_tags") != null && !jsonObj.get("sumo_logic_tags").isJsonNull()) && !jsonObj.get("sumo_logic_tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sumo_logic_tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sumo_logic_tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SumologicLogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SumologicLogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SumologicLogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SumologicLogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<SumologicLogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, SumologicLogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SumologicLogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SumologicLogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SumologicLogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to SumologicLogForwardingConfig
   */
  public static SumologicLogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SumologicLogForwardingConfig.class);
  }

  /**
   * Convert an instance of SumologicLogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

