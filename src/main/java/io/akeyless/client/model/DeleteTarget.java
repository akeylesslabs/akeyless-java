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
 * deleteTarget is a command that deletes a target. [Deprecated: Use target-delete command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DeleteTarget {
  public static final String SERIALIZED_NAME_FORCE_DELETION = "force-deletion";
  @SerializedName(SERIALIZED_NAME_FORCE_DELETION)
  @javax.annotation.Nullable
  private Boolean forceDeletion = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TARGET_VERSION = "target-version";
  @SerializedName(SERIALIZED_NAME_TARGET_VERSION)
  @javax.annotation.Nullable
  private Integer targetVersion;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public DeleteTarget() {
  }

  public DeleteTarget forceDeletion(@javax.annotation.Nullable Boolean forceDeletion) {
    this.forceDeletion = forceDeletion;
    return this;
  }

  /**
   * Enforce deletion
   * @return forceDeletion
   */
  @javax.annotation.Nullable
  public Boolean getForceDeletion() {
    return forceDeletion;
  }

  public void setForceDeletion(@javax.annotation.Nullable Boolean forceDeletion) {
    this.forceDeletion = forceDeletion;
  }


  public DeleteTarget json(@javax.annotation.Nullable Boolean json) {
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


  public DeleteTarget name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Target name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DeleteTarget targetVersion(@javax.annotation.Nullable Integer targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Target version
   * @return targetVersion
   */
  @javax.annotation.Nullable
  public Integer getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(@javax.annotation.Nullable Integer targetVersion) {
    this.targetVersion = targetVersion;
  }


  public DeleteTarget token(@javax.annotation.Nullable String token) {
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


  public DeleteTarget uidToken(@javax.annotation.Nullable String uidToken) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteTarget deleteTarget = (DeleteTarget) o;
    return Objects.equals(this.forceDeletion, deleteTarget.forceDeletion) &&
        Objects.equals(this.json, deleteTarget.json) &&
        Objects.equals(this.name, deleteTarget.name) &&
        Objects.equals(this.targetVersion, deleteTarget.targetVersion) &&
        Objects.equals(this.token, deleteTarget.token) &&
        Objects.equals(this.uidToken, deleteTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceDeletion, json, name, targetVersion, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTarget {\n");
    sb.append("    forceDeletion: ").append(toIndentedString(forceDeletion)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("force-deletion");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("target-version");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteTarget is not found in the empty JSON string", DeleteTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteTarget.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteTarget>() {
           @Override
           public void write(JsonWriter out, DeleteTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteTarget
   * @throws IOException if the JSON string is invalid with respect to DeleteTarget
   */
  public static DeleteTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteTarget.class);
  }

  /**
   * Convert an instance of DeleteTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

