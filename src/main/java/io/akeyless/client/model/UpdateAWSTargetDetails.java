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
 * UpdateAWSTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateAWSTargetDetails {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  @javax.annotation.Nullable
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access-key-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  @javax.annotation.Nullable
  private String accessKeyId;

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

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  @javax.annotation.Nullable
  private String region = "us-east-2";

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session-token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  @javax.annotation.Nullable
  private String sessionToken;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public UpdateAWSTargetDetails() {
  }

  public UpdateAWSTargetDetails accessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * The aws secret access key
   * @return accessKey
   */
  @javax.annotation.Nullable
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
  }


  public UpdateAWSTargetDetails accessKeyId(@javax.annotation.Nullable String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * The aws access key id
   * @return accessKeyId
   */
  @javax.annotation.Nullable
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(@javax.annotation.Nullable String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public UpdateAWSTargetDetails json(@javax.annotation.Nullable Boolean json) {
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


  public UpdateAWSTargetDetails keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public UpdateAWSTargetDetails name(@javax.annotation.Nonnull String name) {
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


  public UpdateAWSTargetDetails newVersion(@javax.annotation.Nullable Boolean newVersion) {
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


  public UpdateAWSTargetDetails protectionKey(@javax.annotation.Nullable String protectionKey) {
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


  public UpdateAWSTargetDetails region(@javax.annotation.Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * The aws region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(@javax.annotation.Nullable String region) {
    this.region = region;
  }


  public UpdateAWSTargetDetails sessionToken(@javax.annotation.Nullable String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * Required only for temporary security credentials retrieved via STS, otherwise it can be an empty string
   * @return sessionToken
   */
  @javax.annotation.Nullable
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(@javax.annotation.Nullable String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public UpdateAWSTargetDetails token(@javax.annotation.Nullable String token) {
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


  public UpdateAWSTargetDetails uidToken(@javax.annotation.Nullable String uidToken) {
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
    UpdateAWSTargetDetails updateAWSTargetDetails = (UpdateAWSTargetDetails) o;
    return Objects.equals(this.accessKey, updateAWSTargetDetails.accessKey) &&
        Objects.equals(this.accessKeyId, updateAWSTargetDetails.accessKeyId) &&
        Objects.equals(this.json, updateAWSTargetDetails.json) &&
        Objects.equals(this.keepPrevVersion, updateAWSTargetDetails.keepPrevVersion) &&
        Objects.equals(this.name, updateAWSTargetDetails.name) &&
        Objects.equals(this.newVersion, updateAWSTargetDetails.newVersion) &&
        Objects.equals(this.protectionKey, updateAWSTargetDetails.protectionKey) &&
        Objects.equals(this.region, updateAWSTargetDetails.region) &&
        Objects.equals(this.sessionToken, updateAWSTargetDetails.sessionToken) &&
        Objects.equals(this.token, updateAWSTargetDetails.token) &&
        Objects.equals(this.uidToken, updateAWSTargetDetails.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, accessKeyId, json, keepPrevVersion, name, newVersion, protectionKey, region, sessionToken, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAWSTargetDetails {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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
    openapiFields.add("access-key");
    openapiFields.add("access-key-id");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("name");
    openapiFields.add("new-version");
    openapiFields.add("protection_key");
    openapiFields.add("region");
    openapiFields.add("session-token");
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
   * @throws IOException if the JSON Element is invalid with respect to UpdateAWSTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAWSTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAWSTargetDetails is not found in the empty JSON string", UpdateAWSTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAWSTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAWSTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateAWSTargetDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access-key") != null && !jsonObj.get("access-key").isJsonNull()) && !jsonObj.get("access-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-key").toString()));
      }
      if ((jsonObj.get("access-key-id") != null && !jsonObj.get("access-key-id").isJsonNull()) && !jsonObj.get("access-key-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-key-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-key-id").toString()));
      }
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protection_key") != null && !jsonObj.get("protection_key").isJsonNull()) && !jsonObj.get("protection_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection_key").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("session-token") != null && !jsonObj.get("session-token").isJsonNull()) && !jsonObj.get("session-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session-token").toString()));
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
       if (!UpdateAWSTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAWSTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAWSTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAWSTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAWSTargetDetails>() {
           @Override
           public void write(JsonWriter out, UpdateAWSTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAWSTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAWSTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAWSTargetDetails
   * @throws IOException if the JSON string is invalid with respect to UpdateAWSTargetDetails
   */
  public static UpdateAWSTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAWSTargetDetails.class);
  }

  /**
   * Convert an instance of UpdateAWSTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

