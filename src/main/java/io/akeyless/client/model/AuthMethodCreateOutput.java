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
 * AuthMethodCreateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethodCreateOutput {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "access_key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  @javax.annotation.Nullable
  private String accessKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PRV_KEY = "prv_key";
  @SerializedName(SERIALIZED_NAME_PRV_KEY)
  @javax.annotation.Nullable
  private String prvKey;

  public AuthMethodCreateOutput() {
  }

  public AuthMethodCreateOutput accessId(@javax.annotation.Nullable String accessId) {
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


  public AuthMethodCreateOutput accessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * Get accessKey
   * @return accessKey
   */
  @javax.annotation.Nullable
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
  }


  public AuthMethodCreateOutput name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public AuthMethodCreateOutput prvKey(@javax.annotation.Nullable String prvKey) {
    this.prvKey = prvKey;
    return this;
  }

  /**
   * Get prvKey
   * @return prvKey
   */
  @javax.annotation.Nullable
  public String getPrvKey() {
    return prvKey;
  }

  public void setPrvKey(@javax.annotation.Nullable String prvKey) {
    this.prvKey = prvKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodCreateOutput authMethodCreateOutput = (AuthMethodCreateOutput) o;
    return Objects.equals(this.accessId, authMethodCreateOutput.accessId) &&
        Objects.equals(this.accessKey, authMethodCreateOutput.accessKey) &&
        Objects.equals(this.name, authMethodCreateOutput.name) &&
        Objects.equals(this.prvKey, authMethodCreateOutput.prvKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessKey, name, prvKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodCreateOutput {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prvKey: ").append(toIndentedString(prvKey)).append("\n");
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
    openapiFields.add("access_key");
    openapiFields.add("name");
    openapiFields.add("prv_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthMethodCreateOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethodCreateOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethodCreateOutput is not found in the empty JSON string", AuthMethodCreateOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethodCreateOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethodCreateOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
      if ((jsonObj.get("access_key") != null && !jsonObj.get("access_key").isJsonNull()) && !jsonObj.get("access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("prv_key") != null && !jsonObj.get("prv_key").isJsonNull()) && !jsonObj.get("prv_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prv_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prv_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthMethodCreateOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethodCreateOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethodCreateOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethodCreateOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethodCreateOutput>() {
           @Override
           public void write(JsonWriter out, AuthMethodCreateOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethodCreateOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethodCreateOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethodCreateOutput
   * @throws IOException if the JSON string is invalid with respect to AuthMethodCreateOutput
   */
  public static AuthMethodCreateOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethodCreateOutput.class);
  }

  /**
   * Convert an instance of AuthMethodCreateOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

