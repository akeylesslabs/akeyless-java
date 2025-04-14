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
 * DynamicSecretDeleteOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretDeleteOutput {
  public static final String SERIALIZED_NAME_DYNAMIC_SECRET_NAME = "dynamic_secret_name";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_SECRET_NAME)
  @javax.annotation.Nullable
  private String dynamicSecretName;

  public DynamicSecretDeleteOutput() {
  }

  public DynamicSecretDeleteOutput dynamicSecretName(@javax.annotation.Nullable String dynamicSecretName) {
    this.dynamicSecretName = dynamicSecretName;
    return this;
  }

  /**
   * Get dynamicSecretName
   * @return dynamicSecretName
   */
  @javax.annotation.Nullable
  public String getDynamicSecretName() {
    return dynamicSecretName;
  }

  public void setDynamicSecretName(@javax.annotation.Nullable String dynamicSecretName) {
    this.dynamicSecretName = dynamicSecretName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretDeleteOutput dynamicSecretDeleteOutput = (DynamicSecretDeleteOutput) o;
    return Objects.equals(this.dynamicSecretName, dynamicSecretDeleteOutput.dynamicSecretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicSecretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretDeleteOutput {\n");
    sb.append("    dynamicSecretName: ").append(toIndentedString(dynamicSecretName)).append("\n");
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
    openapiFields.add("dynamic_secret_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretDeleteOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretDeleteOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretDeleteOutput is not found in the empty JSON string", DynamicSecretDeleteOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretDeleteOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretDeleteOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dynamic_secret_name") != null && !jsonObj.get("dynamic_secret_name").isJsonNull()) && !jsonObj.get("dynamic_secret_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamic_secret_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dynamic_secret_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretDeleteOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretDeleteOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretDeleteOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretDeleteOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretDeleteOutput>() {
           @Override
           public void write(JsonWriter out, DynamicSecretDeleteOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretDeleteOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretDeleteOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretDeleteOutput
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretDeleteOutput
   */
  public static DynamicSecretDeleteOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretDeleteOutput.class);
  }

  /**
   * Convert an instance of DynamicSecretDeleteOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

