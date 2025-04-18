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
 * DynamicSecretMaxTtl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretMaxTtl {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private Boolean enable;

  public static final String SERIALIZED_NAME_MAX_TTL_BY_MINUTES = "max_ttl_by_minutes";
  @SerializedName(SERIALIZED_NAME_MAX_TTL_BY_MINUTES)
  @javax.annotation.Nullable
  private Long maxTtlByMinutes;

  public DynamicSecretMaxTtl() {
  }

  public DynamicSecretMaxTtl enable(@javax.annotation.Nullable Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * @return enable
   */
  @javax.annotation.Nullable
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(@javax.annotation.Nullable Boolean enable) {
    this.enable = enable;
  }


  public DynamicSecretMaxTtl maxTtlByMinutes(@javax.annotation.Nullable Long maxTtlByMinutes) {
    this.maxTtlByMinutes = maxTtlByMinutes;
    return this;
  }

  /**
   * Get maxTtlByMinutes
   * @return maxTtlByMinutes
   */
  @javax.annotation.Nullable
  public Long getMaxTtlByMinutes() {
    return maxTtlByMinutes;
  }

  public void setMaxTtlByMinutes(@javax.annotation.Nullable Long maxTtlByMinutes) {
    this.maxTtlByMinutes = maxTtlByMinutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretMaxTtl dynamicSecretMaxTtl = (DynamicSecretMaxTtl) o;
    return Objects.equals(this.enable, dynamicSecretMaxTtl.enable) &&
        Objects.equals(this.maxTtlByMinutes, dynamicSecretMaxTtl.maxTtlByMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, maxTtlByMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretMaxTtl {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    maxTtlByMinutes: ").append(toIndentedString(maxTtlByMinutes)).append("\n");
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
    openapiFields.add("max_ttl_by_minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretMaxTtl
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretMaxTtl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretMaxTtl is not found in the empty JSON string", DynamicSecretMaxTtl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretMaxTtl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretMaxTtl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretMaxTtl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretMaxTtl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretMaxTtl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretMaxTtl.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretMaxTtl>() {
           @Override
           public void write(JsonWriter out, DynamicSecretMaxTtl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretMaxTtl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretMaxTtl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretMaxTtl
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretMaxTtl
   */
  public static DynamicSecretMaxTtl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretMaxTtl.class);
  }

  /**
   * Convert an instance of DynamicSecretMaxTtl to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

