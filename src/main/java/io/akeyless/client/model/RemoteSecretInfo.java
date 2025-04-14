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
 * RemoteSecretInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RemoteSecretInfo {
  public static final String SERIALIZED_NAME_LAST_ERROR = "last_error";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  @javax.annotation.Nullable
  private String lastError;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_SECRET_ID = "secret_id";
  @SerializedName(SERIALIZED_NAME_SECRET_ID)
  @javax.annotation.Nullable
  private String secretId;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secret_name";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  @javax.annotation.Nullable
  private String secretName;

  public RemoteSecretInfo() {
  }

  public RemoteSecretInfo lastError(@javax.annotation.Nullable String lastError) {
    this.lastError = lastError;
    return this;
  }

  /**
   * Get lastError
   * @return lastError
   */
  @javax.annotation.Nullable
  public String getLastError() {
    return lastError;
  }

  public void setLastError(@javax.annotation.Nullable String lastError) {
    this.lastError = lastError;
  }


  public RemoteSecretInfo namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public RemoteSecretInfo secretId(@javax.annotation.Nullable String secretId) {
    this.secretId = secretId;
    return this;
  }

  /**
   * Get secretId
   * @return secretId
   */
  @javax.annotation.Nullable
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(@javax.annotation.Nullable String secretId) {
    this.secretId = secretId;
  }


  public RemoteSecretInfo secretName(@javax.annotation.Nullable String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * Get secretName
   * @return secretName
   */
  @javax.annotation.Nullable
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(@javax.annotation.Nullable String secretName) {
    this.secretName = secretName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSecretInfo remoteSecretInfo = (RemoteSecretInfo) o;
    return Objects.equals(this.lastError, remoteSecretInfo.lastError) &&
        Objects.equals(this.namespace, remoteSecretInfo.namespace) &&
        Objects.equals(this.secretId, remoteSecretInfo.secretId) &&
        Objects.equals(this.secretName, remoteSecretInfo.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastError, namespace, secretId, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSecretInfo {\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
    openapiFields.add("last_error");
    openapiFields.add("namespace");
    openapiFields.add("secret_id");
    openapiFields.add("secret_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RemoteSecretInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RemoteSecretInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoteSecretInfo is not found in the empty JSON string", RemoteSecretInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RemoteSecretInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoteSecretInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("last_error") != null && !jsonObj.get("last_error").isJsonNull()) && !jsonObj.get("last_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_error").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("secret_id") != null && !jsonObj.get("secret_id").isJsonNull()) && !jsonObj.get("secret_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_id").toString()));
      }
      if ((jsonObj.get("secret_name") != null && !jsonObj.get("secret_name").isJsonNull()) && !jsonObj.get("secret_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoteSecretInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoteSecretInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoteSecretInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoteSecretInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoteSecretInfo>() {
           @Override
           public void write(JsonWriter out, RemoteSecretInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoteSecretInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RemoteSecretInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RemoteSecretInfo
   * @throws IOException if the JSON string is invalid with respect to RemoteSecretInfo
   */
  public static RemoteSecretInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoteSecretInfo.class);
  }

  /**
   * Convert an instance of RemoteSecretInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

