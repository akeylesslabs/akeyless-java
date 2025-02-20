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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RotatedSecretCreateDockerhub
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RotatedSecretCreateDockerhub {
  public static final String SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS = "authentication-credentials";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS)
  @javax.annotation.Nullable
  private String authenticationCredentials = "use-user-creds";

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  @javax.annotation.Nullable
  private String autoRotate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_ROTATION_EVENT_IN = "rotation-event-in";
  @SerializedName(SERIALIZED_NAME_ROTATION_EVENT_IN)
  @javax.annotation.Nullable
  private List<String> rotationEventIn = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  @javax.annotation.Nullable
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  @javax.annotation.Nullable
  private String rotationInterval;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nonnull
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public RotatedSecretCreateDockerhub() {
  }

  public RotatedSecretCreateDockerhub authenticationCredentials(@javax.annotation.Nullable String authenticationCredentials) {
    this.authenticationCredentials = authenticationCredentials;
    return this;
  }

  /**
   * The credentials to connect with use-user-creds/use-target-creds
   * @return authenticationCredentials
   */
  @javax.annotation.Nullable
  public String getAuthenticationCredentials() {
    return authenticationCredentials;
  }

  public void setAuthenticationCredentials(@javax.annotation.Nullable String authenticationCredentials) {
    this.authenticationCredentials = authenticationCredentials;
  }


  public RotatedSecretCreateDockerhub autoRotate(@javax.annotation.Nullable String autoRotate) {
    this.autoRotate = autoRotate;
    return this;
  }

  /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false]
   * @return autoRotate
   */
  @javax.annotation.Nullable
  public String getAutoRotate() {
    return autoRotate;
  }

  public void setAutoRotate(@javax.annotation.Nullable String autoRotate) {
    this.autoRotate = autoRotate;
  }


  public RotatedSecretCreateDockerhub deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public RotatedSecretCreateDockerhub description(@javax.annotation.Nullable String description) {
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


  public RotatedSecretCreateDockerhub json(@javax.annotation.Nullable Boolean json) {
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


  public RotatedSecretCreateDockerhub key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public RotatedSecretCreateDockerhub maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public RotatedSecretCreateDockerhub name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Rotated secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public RotatedSecretCreateDockerhub passwordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
    return this;
  }

  /**
   * The length of the password to be generated
   * @return passwordLength
   */
  @javax.annotation.Nullable
  public String getPasswordLength() {
    return passwordLength;
  }

  public void setPasswordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public RotatedSecretCreateDockerhub rotationEventIn(@javax.annotation.Nullable List<String> rotationEventIn) {
    this.rotationEventIn = rotationEventIn;
    return this;
  }

  public RotatedSecretCreateDockerhub addRotationEventInItem(String rotationEventInItem) {
    if (this.rotationEventIn == null) {
      this.rotationEventIn = new ArrayList<>();
    }
    this.rotationEventIn.add(rotationEventInItem);
    return this;
  }

  /**
   * How many days before the rotation of the item would you like to be notified
   * @return rotationEventIn
   */
  @javax.annotation.Nullable
  public List<String> getRotationEventIn() {
    return rotationEventIn;
  }

  public void setRotationEventIn(@javax.annotation.Nullable List<String> rotationEventIn) {
    this.rotationEventIn = rotationEventIn;
  }


  public RotatedSecretCreateDockerhub rotationHour(@javax.annotation.Nullable Integer rotationHour) {
    this.rotationHour = rotationHour;
    return this;
  }

  /**
   * The Hour of the rotation in UTC
   * @return rotationHour
   */
  @javax.annotation.Nullable
  public Integer getRotationHour() {
    return rotationHour;
  }

  public void setRotationHour(@javax.annotation.Nullable Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public RotatedSecretCreateDockerhub rotationInterval(@javax.annotation.Nullable String rotationInterval) {
    this.rotationInterval = rotationInterval;
    return this;
  }

  /**
   * The number of days to wait between every automatic key rotation (1-365)
   * @return rotationInterval
   */
  @javax.annotation.Nullable
  public String getRotationInterval() {
    return rotationInterval;
  }

  public void setRotationInterval(@javax.annotation.Nullable String rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public RotatedSecretCreateDockerhub tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RotatedSecretCreateDockerhub addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public RotatedSecretCreateDockerhub targetName(@javax.annotation.Nonnull String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nonnull
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nonnull String targetName) {
    this.targetName = targetName;
  }


  public RotatedSecretCreateDockerhub token(@javax.annotation.Nullable String token) {
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


  public RotatedSecretCreateDockerhub uidToken(@javax.annotation.Nullable String uidToken) {
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
    RotatedSecretCreateDockerhub rotatedSecretCreateDockerhub = (RotatedSecretCreateDockerhub) o;
    return Objects.equals(this.authenticationCredentials, rotatedSecretCreateDockerhub.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretCreateDockerhub.autoRotate) &&
        Objects.equals(this.deleteProtection, rotatedSecretCreateDockerhub.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretCreateDockerhub.description) &&
        Objects.equals(this.json, rotatedSecretCreateDockerhub.json) &&
        Objects.equals(this.key, rotatedSecretCreateDockerhub.key) &&
        Objects.equals(this.maxVersions, rotatedSecretCreateDockerhub.maxVersions) &&
        Objects.equals(this.name, rotatedSecretCreateDockerhub.name) &&
        Objects.equals(this.passwordLength, rotatedSecretCreateDockerhub.passwordLength) &&
        Objects.equals(this.rotationEventIn, rotatedSecretCreateDockerhub.rotationEventIn) &&
        Objects.equals(this.rotationHour, rotatedSecretCreateDockerhub.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretCreateDockerhub.rotationInterval) &&
        Objects.equals(this.tags, rotatedSecretCreateDockerhub.tags) &&
        Objects.equals(this.targetName, rotatedSecretCreateDockerhub.targetName) &&
        Objects.equals(this.token, rotatedSecretCreateDockerhub.token) &&
        Objects.equals(this.uidToken, rotatedSecretCreateDockerhub.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationCredentials, autoRotate, deleteProtection, description, json, key, maxVersions, name, passwordLength, rotationEventIn, rotationHour, rotationInterval, tags, targetName, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretCreateDockerhub {\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rotationEventIn: ").append(toIndentedString(rotationEventIn)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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
    openapiFields.add("authentication-credentials");
    openapiFields.add("auto-rotate");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("password-length");
    openapiFields.add("rotation-event-in");
    openapiFields.add("rotation-hour");
    openapiFields.add("rotation-interval");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("target-name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RotatedSecretCreateDockerhub
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RotatedSecretCreateDockerhub.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RotatedSecretCreateDockerhub is not found in the empty JSON string", RotatedSecretCreateDockerhub.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RotatedSecretCreateDockerhub.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RotatedSecretCreateDockerhub` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RotatedSecretCreateDockerhub.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authentication-credentials") != null && !jsonObj.get("authentication-credentials").isJsonNull()) && !jsonObj.get("authentication-credentials").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication-credentials` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentication-credentials").toString()));
      }
      if ((jsonObj.get("auto-rotate") != null && !jsonObj.get("auto-rotate").isJsonNull()) && !jsonObj.get("auto-rotate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto-rotate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auto-rotate").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rotation-event-in") != null && !jsonObj.get("rotation-event-in").isJsonNull() && !jsonObj.get("rotation-event-in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation-event-in` to be an array in the JSON string but got `%s`", jsonObj.get("rotation-event-in").toString()));
      }
      if ((jsonObj.get("rotation-interval") != null && !jsonObj.get("rotation-interval").isJsonNull()) && !jsonObj.get("rotation-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotation-interval").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
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
       if (!RotatedSecretCreateDockerhub.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RotatedSecretCreateDockerhub' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RotatedSecretCreateDockerhub> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RotatedSecretCreateDockerhub.class));

       return (TypeAdapter<T>) new TypeAdapter<RotatedSecretCreateDockerhub>() {
           @Override
           public void write(JsonWriter out, RotatedSecretCreateDockerhub value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RotatedSecretCreateDockerhub read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RotatedSecretCreateDockerhub given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RotatedSecretCreateDockerhub
   * @throws IOException if the JSON string is invalid with respect to RotatedSecretCreateDockerhub
   */
  public static RotatedSecretCreateDockerhub fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RotatedSecretCreateDockerhub.class);
  }

  /**
   * Convert an instance of RotatedSecretCreateDockerhub to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

