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
 * UpdateWebTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateWebTargetDetails {
  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  @javax.annotation.Nullable
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  @javax.annotation.Nullable
  private Boolean newVersion;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  @javax.annotation.Nullable
  private String protectionKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public UpdateWebTargetDetails() {
  }

  public UpdateWebTargetDetails json(@javax.annotation.Nullable Boolean json) {
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


  public UpdateWebTargetDetails keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

  /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
   */
  @javax.annotation.Nullable
  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }

  public void setKeepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateWebTargetDetails name(@javax.annotation.Nonnull String name) {
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


  public UpdateWebTargetDetails newVersion(@javax.annotation.Nullable Boolean newVersion) {
    this.newVersion = newVersion;
    return this;
  }

  /**
   * Deprecated
   * @return newVersion
   */
  @javax.annotation.Nullable
  public Boolean getNewVersion() {
    return newVersion;
  }

  public void setNewVersion(@javax.annotation.Nullable Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateWebTargetDetails protectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
    return this;
  }

  /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
   */
  @javax.annotation.Nullable
  public String getProtectionKey() {
    return protectionKey;
  }

  public void setProtectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public UpdateWebTargetDetails token(@javax.annotation.Nullable String token) {
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


  public UpdateWebTargetDetails uidToken(@javax.annotation.Nullable String uidToken) {
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


  public UpdateWebTargetDetails url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWebTargetDetails updateWebTargetDetails = (UpdateWebTargetDetails) o;
    return Objects.equals(this.json, updateWebTargetDetails.json) &&
        Objects.equals(this.keepPrevVersion, updateWebTargetDetails.keepPrevVersion) &&
        Objects.equals(this.name, updateWebTargetDetails.name) &&
        Objects.equals(this.newVersion, updateWebTargetDetails.newVersion) &&
        Objects.equals(this.protectionKey, updateWebTargetDetails.protectionKey) &&
        Objects.equals(this.token, updateWebTargetDetails.token) &&
        Objects.equals(this.uidToken, updateWebTargetDetails.uidToken) &&
        Objects.equals(this.url, updateWebTargetDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, keepPrevVersion, name, newVersion, protectionKey, token, uidToken, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWebTargetDetails {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("name");
    openapiFields.add("new-version");
    openapiFields.add("protection_key");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateWebTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateWebTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWebTargetDetails is not found in the empty JSON string", UpdateWebTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateWebTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWebTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateWebTargetDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protection_key") != null && !jsonObj.get("protection_key").isJsonNull()) && !jsonObj.get("protection_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection_key").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWebTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWebTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWebTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWebTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWebTargetDetails>() {
           @Override
           public void write(JsonWriter out, UpdateWebTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWebTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateWebTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateWebTargetDetails
   * @throws IOException if the JSON string is invalid with respect to UpdateWebTargetDetails
   */
  public static UpdateWebTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWebTargetDetails.class);
  }

  /**
   * Convert an instance of UpdateWebTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

