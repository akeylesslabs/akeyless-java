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
 * CreatePasskeyOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreatePasskeyOutput {
  public static final String SERIALIZED_NAME_CLASSIC_KEY_ID = "classic_key_id";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_ID)
  @javax.annotation.Nullable
  private String classicKeyId;

  public static final String SERIALIZED_NAME_CLASSIC_KEY_NAME = "classic_key_name";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_NAME)
  @javax.annotation.Nullable
  private String classicKeyName;

  public static final String SERIALIZED_NAME_CLASSIC_KEY_TYPE = "classic_key_type";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_TYPE)
  @javax.annotation.Nullable
  private String classicKeyType;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  @javax.annotation.Nullable
  private String publicKey;

  public CreatePasskeyOutput() {
  }

  public CreatePasskeyOutput classicKeyId(@javax.annotation.Nullable String classicKeyId) {
    this.classicKeyId = classicKeyId;
    return this;
  }

  /**
   * Get classicKeyId
   * @return classicKeyId
   */
  @javax.annotation.Nullable
  public String getClassicKeyId() {
    return classicKeyId;
  }

  public void setClassicKeyId(@javax.annotation.Nullable String classicKeyId) {
    this.classicKeyId = classicKeyId;
  }


  public CreatePasskeyOutput classicKeyName(@javax.annotation.Nullable String classicKeyName) {
    this.classicKeyName = classicKeyName;
    return this;
  }

  /**
   * Get classicKeyName
   * @return classicKeyName
   */
  @javax.annotation.Nullable
  public String getClassicKeyName() {
    return classicKeyName;
  }

  public void setClassicKeyName(@javax.annotation.Nullable String classicKeyName) {
    this.classicKeyName = classicKeyName;
  }


  public CreatePasskeyOutput classicKeyType(@javax.annotation.Nullable String classicKeyType) {
    this.classicKeyType = classicKeyType;
    return this;
  }

  /**
   * Get classicKeyType
   * @return classicKeyType
   */
  @javax.annotation.Nullable
  public String getClassicKeyType() {
    return classicKeyType;
  }

  public void setClassicKeyType(@javax.annotation.Nullable String classicKeyType) {
    this.classicKeyType = classicKeyType;
  }


  public CreatePasskeyOutput publicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   */
  @javax.annotation.Nullable
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = publicKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePasskeyOutput createPasskeyOutput = (CreatePasskeyOutput) o;
    return Objects.equals(this.classicKeyId, createPasskeyOutput.classicKeyId) &&
        Objects.equals(this.classicKeyName, createPasskeyOutput.classicKeyName) &&
        Objects.equals(this.classicKeyType, createPasskeyOutput.classicKeyType) &&
        Objects.equals(this.publicKey, createPasskeyOutput.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classicKeyId, classicKeyName, classicKeyType, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePasskeyOutput {\n");
    sb.append("    classicKeyId: ").append(toIndentedString(classicKeyId)).append("\n");
    sb.append("    classicKeyName: ").append(toIndentedString(classicKeyName)).append("\n");
    sb.append("    classicKeyType: ").append(toIndentedString(classicKeyType)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
    openapiFields.add("classic_key_id");
    openapiFields.add("classic_key_name");
    openapiFields.add("classic_key_type");
    openapiFields.add("public_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePasskeyOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePasskeyOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePasskeyOutput is not found in the empty JSON string", CreatePasskeyOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePasskeyOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePasskeyOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("classic_key_id") != null && !jsonObj.get("classic_key_id").isJsonNull()) && !jsonObj.get("classic_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classic_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classic_key_id").toString()));
      }
      if ((jsonObj.get("classic_key_name") != null && !jsonObj.get("classic_key_name").isJsonNull()) && !jsonObj.get("classic_key_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classic_key_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classic_key_name").toString()));
      }
      if ((jsonObj.get("classic_key_type") != null && !jsonObj.get("classic_key_type").isJsonNull()) && !jsonObj.get("classic_key_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classic_key_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classic_key_type").toString()));
      }
      if ((jsonObj.get("public_key") != null && !jsonObj.get("public_key").isJsonNull()) && !jsonObj.get("public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePasskeyOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePasskeyOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePasskeyOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePasskeyOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePasskeyOutput>() {
           @Override
           public void write(JsonWriter out, CreatePasskeyOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePasskeyOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePasskeyOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePasskeyOutput
   * @throws IOException if the JSON string is invalid with respect to CreatePasskeyOutput
   */
  public static CreatePasskeyOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePasskeyOutput.class);
  }

  /**
   * Convert an instance of CreatePasskeyOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

