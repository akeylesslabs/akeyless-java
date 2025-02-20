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
 * TargetUpdateAws
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetUpdateAws {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  @javax.annotation.Nonnull
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access-key-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  @javax.annotation.Nonnull
  private String accessKeyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  @javax.annotation.Nullable
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  @javax.annotation.Nullable
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

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

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  @javax.annotation.Nullable
  private Boolean useGwCloudIdentity;

  public TargetUpdateAws() {
  }

  public TargetUpdateAws accessKey(@javax.annotation.Nonnull String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * AWS secret access key
   * @return accessKey
   */
  @javax.annotation.Nonnull
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(@javax.annotation.Nonnull String accessKey) {
    this.accessKey = accessKey;
  }


  public TargetUpdateAws accessKeyId(@javax.annotation.Nonnull String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * AWS access key ID
   * @return accessKeyId
   */
  @javax.annotation.Nonnull
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(@javax.annotation.Nonnull String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public TargetUpdateAws description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public TargetUpdateAws json(@javax.annotation.Nullable Boolean json) {
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


  public TargetUpdateAws keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public TargetUpdateAws key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public TargetUpdateAws maxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
   */
  @javax.annotation.Nullable
  public String getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public TargetUpdateAws name(@javax.annotation.Nonnull String name) {
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


  public TargetUpdateAws newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * New target name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public TargetUpdateAws region(@javax.annotation.Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(@javax.annotation.Nullable String region) {
    this.region = region;
  }


  public TargetUpdateAws sessionToken(@javax.annotation.Nullable String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * Required only for temporary security credentials retrieved using STS
   * @return sessionToken
   */
  @javax.annotation.Nullable
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(@javax.annotation.Nullable String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public TargetUpdateAws token(@javax.annotation.Nullable String token) {
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


  public TargetUpdateAws uidToken(@javax.annotation.Nullable String uidToken) {
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


  public TargetUpdateAws useGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

  /**
   * Use the GW&#39;s Cloud IAM
   * @return useGwCloudIdentity
   */
  @javax.annotation.Nullable
  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }

  public void setUseGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetUpdateAws targetUpdateAws = (TargetUpdateAws) o;
    return Objects.equals(this.accessKey, targetUpdateAws.accessKey) &&
        Objects.equals(this.accessKeyId, targetUpdateAws.accessKeyId) &&
        Objects.equals(this.description, targetUpdateAws.description) &&
        Objects.equals(this.json, targetUpdateAws.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateAws.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateAws.key) &&
        Objects.equals(this.maxVersions, targetUpdateAws.maxVersions) &&
        Objects.equals(this.name, targetUpdateAws.name) &&
        Objects.equals(this.newName, targetUpdateAws.newName) &&
        Objects.equals(this.region, targetUpdateAws.region) &&
        Objects.equals(this.sessionToken, targetUpdateAws.sessionToken) &&
        Objects.equals(this.token, targetUpdateAws.token) &&
        Objects.equals(this.uidToken, targetUpdateAws.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, targetUpdateAws.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, accessKeyId, description, json, keepPrevVersion, key, maxVersions, name, newName, region, sessionToken, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateAws {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("region");
    openapiFields.add("session-token");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("use-gw-cloud-identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access-key");
    openapiRequiredFields.add("access-key-id");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetUpdateAws
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetUpdateAws.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetUpdateAws is not found in the empty JSON string", TargetUpdateAws.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetUpdateAws.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetUpdateAws` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetUpdateAws.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-key").toString()));
      }
      if (!jsonObj.get("access-key-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-key-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-key-id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("max-versions") != null && !jsonObj.get("max-versions").isJsonNull()) && !jsonObj.get("max-versions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max-versions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max-versions").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
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
       if (!TargetUpdateAws.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetUpdateAws' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetUpdateAws> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetUpdateAws.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetUpdateAws>() {
           @Override
           public void write(JsonWriter out, TargetUpdateAws value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetUpdateAws read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetUpdateAws given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetUpdateAws
   * @throws IOException if the JSON string is invalid with respect to TargetUpdateAws
   */
  public static TargetUpdateAws fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetUpdateAws.class);
  }

  /**
   * Convert an instance of TargetUpdateAws to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

