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
 * updateGlobalSignTarget is a command that updates an existing target. [Deprecated: Use target-update-globalsign command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateGlobalSignTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contact-email";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  @javax.annotation.Nonnull
  private String contactEmail;

  public static final String SERIALIZED_NAME_CONTACT_FIRST_NAME = "contact-first-name";
  @SerializedName(SERIALIZED_NAME_CONTACT_FIRST_NAME)
  @javax.annotation.Nonnull
  private String contactFirstName;

  public static final String SERIALIZED_NAME_CONTACT_LAST_NAME = "contact-last-name";
  @SerializedName(SERIALIZED_NAME_CONTACT_LAST_NAME)
  @javax.annotation.Nonnull
  private String contactLastName;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact-phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  @javax.annotation.Nonnull
  private String contactPhone;

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

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nonnull
  private String password;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile-id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nonnull
  private String profileId;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  @javax.annotation.Nullable
  private String timeout = "5m";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  @javax.annotation.Nullable
  private Boolean updateVersion;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nonnull
  private String username;

  public UpdateGlobalSignTarget() {
  }

  public UpdateGlobalSignTarget comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Deprecated - use description
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public UpdateGlobalSignTarget contactEmail(@javax.annotation.Nonnull String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Email of the GlobalSign GCC account contact
   * @return contactEmail
   */
  @javax.annotation.Nonnull
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(@javax.annotation.Nonnull String contactEmail) {
    this.contactEmail = contactEmail;
  }


  public UpdateGlobalSignTarget contactFirstName(@javax.annotation.Nonnull String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

  /**
   * First name of the GlobalSign GCC account contact
   * @return contactFirstName
   */
  @javax.annotation.Nonnull
  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(@javax.annotation.Nonnull String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }


  public UpdateGlobalSignTarget contactLastName(@javax.annotation.Nonnull String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

  /**
   * Last name of the GlobalSign GCC account contact
   * @return contactLastName
   */
  @javax.annotation.Nonnull
  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(@javax.annotation.Nonnull String contactLastName) {
    this.contactLastName = contactLastName;
  }


  public UpdateGlobalSignTarget contactPhone(@javax.annotation.Nonnull String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Telephone of the GlobalSign GCC account contact
   * @return contactPhone
   */
  @javax.annotation.Nonnull
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(@javax.annotation.Nonnull String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public UpdateGlobalSignTarget description(@javax.annotation.Nullable String description) {
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


  public UpdateGlobalSignTarget json(@javax.annotation.Nullable Boolean json) {
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


  public UpdateGlobalSignTarget keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public UpdateGlobalSignTarget key(@javax.annotation.Nullable String key) {
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


  public UpdateGlobalSignTarget maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public UpdateGlobalSignTarget name(@javax.annotation.Nonnull String name) {
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


  public UpdateGlobalSignTarget newName(@javax.annotation.Nullable String newName) {
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


  public UpdateGlobalSignTarget password(@javax.annotation.Nonnull String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the GlobalSign GCC account
   * @return password
   */
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nonnull String password) {
    this.password = password;
  }


  public UpdateGlobalSignTarget profileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Profile ID of the GlobalSign GCC account
   * @return profileId
   */
  @javax.annotation.Nonnull
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }


  public UpdateGlobalSignTarget timeout(@javax.annotation.Nullable String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h.
   * @return timeout
   */
  @javax.annotation.Nullable
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(@javax.annotation.Nullable String timeout) {
    this.timeout = timeout;
  }


  public UpdateGlobalSignTarget token(@javax.annotation.Nullable String token) {
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


  public UpdateGlobalSignTarget uidToken(@javax.annotation.Nullable String uidToken) {
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


  public UpdateGlobalSignTarget updateVersion(@javax.annotation.Nullable Boolean updateVersion) {
    this.updateVersion = updateVersion;
    return this;
  }

  /**
   * Deprecated
   * @return updateVersion
   */
  @javax.annotation.Nullable
  public Boolean getUpdateVersion() {
    return updateVersion;
  }

  public void setUpdateVersion(@javax.annotation.Nullable Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  public UpdateGlobalSignTarget username(@javax.annotation.Nonnull String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the GlobalSign GCC account
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nonnull String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGlobalSignTarget updateGlobalSignTarget = (UpdateGlobalSignTarget) o;
    return Objects.equals(this.comment, updateGlobalSignTarget.comment) &&
        Objects.equals(this.contactEmail, updateGlobalSignTarget.contactEmail) &&
        Objects.equals(this.contactFirstName, updateGlobalSignTarget.contactFirstName) &&
        Objects.equals(this.contactLastName, updateGlobalSignTarget.contactLastName) &&
        Objects.equals(this.contactPhone, updateGlobalSignTarget.contactPhone) &&
        Objects.equals(this.description, updateGlobalSignTarget.description) &&
        Objects.equals(this.json, updateGlobalSignTarget.json) &&
        Objects.equals(this.keepPrevVersion, updateGlobalSignTarget.keepPrevVersion) &&
        Objects.equals(this.key, updateGlobalSignTarget.key) &&
        Objects.equals(this.maxVersions, updateGlobalSignTarget.maxVersions) &&
        Objects.equals(this.name, updateGlobalSignTarget.name) &&
        Objects.equals(this.newName, updateGlobalSignTarget.newName) &&
        Objects.equals(this.password, updateGlobalSignTarget.password) &&
        Objects.equals(this.profileId, updateGlobalSignTarget.profileId) &&
        Objects.equals(this.timeout, updateGlobalSignTarget.timeout) &&
        Objects.equals(this.token, updateGlobalSignTarget.token) &&
        Objects.equals(this.uidToken, updateGlobalSignTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateGlobalSignTarget.updateVersion) &&
        Objects.equals(this.username, updateGlobalSignTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, contactEmail, contactFirstName, contactLastName, contactPhone, description, json, keepPrevVersion, key, maxVersions, name, newName, password, profileId, timeout, token, uidToken, updateVersion, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGlobalSignTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("contact-email");
    openapiFields.add("contact-first-name");
    openapiFields.add("contact-last-name");
    openapiFields.add("contact-phone");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("password");
    openapiFields.add("profile-id");
    openapiFields.add("timeout");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("update-version");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contact-email");
    openapiRequiredFields.add("contact-first-name");
    openapiRequiredFields.add("contact-last-name");
    openapiRequiredFields.add("contact-phone");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("profile-id");
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGlobalSignTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGlobalSignTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGlobalSignTarget is not found in the empty JSON string", UpdateGlobalSignTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGlobalSignTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGlobalSignTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGlobalSignTarget.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("contact-email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact-email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact-email").toString()));
      }
      if (!jsonObj.get("contact-first-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact-first-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact-first-name").toString()));
      }
      if (!jsonObj.get("contact-last-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact-last-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact-last-name").toString()));
      }
      if (!jsonObj.get("contact-phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact-phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact-phone").toString()));
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
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("profile-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile-id").toString()));
      }
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGlobalSignTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGlobalSignTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGlobalSignTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGlobalSignTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGlobalSignTarget>() {
           @Override
           public void write(JsonWriter out, UpdateGlobalSignTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGlobalSignTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGlobalSignTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGlobalSignTarget
   * @throws IOException if the JSON string is invalid with respect to UpdateGlobalSignTarget
   */
  public static UpdateGlobalSignTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGlobalSignTarget.class);
  }

  /**
   * Convert an instance of UpdateGlobalSignTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

