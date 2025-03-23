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
 * ExportClassicKey is a command that returns the classic key material
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ExportClassicKey {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  @javax.annotation.Nullable
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_EXPORT_PUBLIC_KEY = "export-public-key";
  @SerializedName(SERIALIZED_NAME_EXPORT_PUBLIC_KEY)
  @javax.annotation.Nullable
  private Boolean exportPublicKey = false;

  public static final String SERIALIZED_NAME_IGNORE_CACHE = "ignore-cache";
  @SerializedName(SERIALIZED_NAME_IGNORE_CACHE)
  @javax.annotation.Nullable
  private String ignoreCache = "false";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private Integer version;

  public static final String SERIALIZED_NAME_WRAPPING_KEY_NAME = "wrapping-key-name";
  @SerializedName(SERIALIZED_NAME_WRAPPING_KEY_NAME)
  @javax.annotation.Nullable
  private String wrappingKeyName;

  public ExportClassicKey() {
  }

  public ExportClassicKey accessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  /**
   * for personal password manager
   * @return accessibility
   */
  @javax.annotation.Nullable
  public String getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
  }


  public ExportClassicKey exportPublicKey(@javax.annotation.Nullable Boolean exportPublicKey) {
    this.exportPublicKey = exportPublicKey;
    return this;
  }

  /**
   * Use this option to output only public key
   * @return exportPublicKey
   */
  @javax.annotation.Nullable
  public Boolean getExportPublicKey() {
    return exportPublicKey;
  }

  public void setExportPublicKey(@javax.annotation.Nullable Boolean exportPublicKey) {
    this.exportPublicKey = exportPublicKey;
  }


  public ExportClassicKey ignoreCache(@javax.annotation.Nullable String ignoreCache) {
    this.ignoreCache = ignoreCache;
    return this;
  }

  /**
   * Retrieve the Secret value without checking the Gateway&#39;s cache [true/false]. This flag is only relevant when using the RestAPI
   * @return ignoreCache
   */
  @javax.annotation.Nullable
  public String getIgnoreCache() {
    return ignoreCache;
  }

  public void setIgnoreCache(@javax.annotation.Nullable String ignoreCache) {
    this.ignoreCache = ignoreCache;
  }


  public ExportClassicKey json(@javax.annotation.Nullable Boolean json) {
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


  public ExportClassicKey name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * ClassicKey name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ExportClassicKey token(@javax.annotation.Nullable String token) {
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


  public ExportClassicKey uidToken(@javax.annotation.Nullable String uidToken) {
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


  public ExportClassicKey version(@javax.annotation.Nullable Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Classic key version
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }


  public ExportClassicKey wrappingKeyName(@javax.annotation.Nullable String wrappingKeyName) {
    this.wrappingKeyName = wrappingKeyName;
    return this;
  }

  /**
   * Classic key name to wrap the key material with
   * @return wrappingKeyName
   */
  @javax.annotation.Nullable
  public String getWrappingKeyName() {
    return wrappingKeyName;
  }

  public void setWrappingKeyName(@javax.annotation.Nullable String wrappingKeyName) {
    this.wrappingKeyName = wrappingKeyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportClassicKey exportClassicKey = (ExportClassicKey) o;
    return Objects.equals(this.accessibility, exportClassicKey.accessibility) &&
        Objects.equals(this.exportPublicKey, exportClassicKey.exportPublicKey) &&
        Objects.equals(this.ignoreCache, exportClassicKey.ignoreCache) &&
        Objects.equals(this.json, exportClassicKey.json) &&
        Objects.equals(this.name, exportClassicKey.name) &&
        Objects.equals(this.token, exportClassicKey.token) &&
        Objects.equals(this.uidToken, exportClassicKey.uidToken) &&
        Objects.equals(this.version, exportClassicKey.version) &&
        Objects.equals(this.wrappingKeyName, exportClassicKey.wrappingKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, exportPublicKey, ignoreCache, json, name, token, uidToken, version, wrappingKeyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportClassicKey {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    exportPublicKey: ").append(toIndentedString(exportPublicKey)).append("\n");
    sb.append("    ignoreCache: ").append(toIndentedString(ignoreCache)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    wrappingKeyName: ").append(toIndentedString(wrappingKeyName)).append("\n");
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
    openapiFields.add("accessibility");
    openapiFields.add("export-public-key");
    openapiFields.add("ignore-cache");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("version");
    openapiFields.add("wrapping-key-name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportClassicKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportClassicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportClassicKey is not found in the empty JSON string", ExportClassicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportClassicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportClassicKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportClassicKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accessibility") != null && !jsonObj.get("accessibility").isJsonNull()) && !jsonObj.get("accessibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessibility").toString()));
      }
      if ((jsonObj.get("ignore-cache") != null && !jsonObj.get("ignore-cache").isJsonNull()) && !jsonObj.get("ignore-cache").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignore-cache` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ignore-cache").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("wrapping-key-name") != null && !jsonObj.get("wrapping-key-name").isJsonNull()) && !jsonObj.get("wrapping-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wrapping-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wrapping-key-name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportClassicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportClassicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportClassicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportClassicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportClassicKey>() {
           @Override
           public void write(JsonWriter out, ExportClassicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportClassicKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportClassicKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportClassicKey
   * @throws IOException if the JSON string is invalid with respect to ExportClassicKey
   */
  public static ExportClassicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportClassicKey.class);
  }

  /**
   * Convert an instance of ExportClassicKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

