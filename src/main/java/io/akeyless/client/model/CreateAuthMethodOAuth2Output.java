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
 * CreateAuthMethodOAuth2Output
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateAuthMethodOAuth2Output {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public CreateAuthMethodOAuth2Output() {
  }

  public CreateAuthMethodOAuth2Output accessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * Get accessId
   * @return accessId
   */
  @javax.annotation.Nullable
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthMethodOAuth2Output createAuthMethodOAuth2Output = (CreateAuthMethodOAuth2Output) o;
    return Objects.equals(this.accessId, createAuthMethodOAuth2Output.accessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodOAuth2Output {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
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
    openapiFields.add("access_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAuthMethodOAuth2Output
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAuthMethodOAuth2Output.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAuthMethodOAuth2Output is not found in the empty JSON string", CreateAuthMethodOAuth2Output.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAuthMethodOAuth2Output.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAuthMethodOAuth2Output` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAuthMethodOAuth2Output.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAuthMethodOAuth2Output' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAuthMethodOAuth2Output> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAuthMethodOAuth2Output.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAuthMethodOAuth2Output>() {
           @Override
           public void write(JsonWriter out, CreateAuthMethodOAuth2Output value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAuthMethodOAuth2Output read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAuthMethodOAuth2Output given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAuthMethodOAuth2Output
   * @throws IOException if the JSON string is invalid with respect to CreateAuthMethodOAuth2Output
   */
  public static CreateAuthMethodOAuth2Output fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAuthMethodOAuth2Output.class);
  }

  /**
   * Convert an instance of CreateAuthMethodOAuth2Output to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

