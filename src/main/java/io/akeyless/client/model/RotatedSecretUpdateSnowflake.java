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
 * RotatedSecretUpdateSnowflake
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RotatedSecretUpdateSnowflake {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  @javax.annotation.Nullable
  private List<String> addTag = new ArrayList<>();

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
  private String description = "default_metadata";

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

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  @javax.annotation.Nullable
  private List<String> rmTag = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROTATED_PASSWORD = "rotated-password";
  @SerializedName(SERIALIZED_NAME_ROTATED_PASSWORD)
  @javax.annotation.Nullable
  private String rotatedPassword;

  public static final String SERIALIZED_NAME_ROTATED_USERNAME = "rotated-username";
  @SerializedName(SERIALIZED_NAME_ROTATED_USERNAME)
  @javax.annotation.Nullable
  private String rotatedUsername;

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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public RotatedSecretUpdateSnowflake() {
  }

  public RotatedSecretUpdateSnowflake addTag(@javax.annotation.Nullable List<String> addTag) {
    this.addTag = addTag;
    return this;
  }

  public RotatedSecretUpdateSnowflake addAddTagItem(String addTagItem) {
    if (this.addTag == null) {
      this.addTag = new ArrayList<>();
    }
    this.addTag.add(addTagItem);
    return this;
  }

  /**
   * List of the new tags that will be attached to this item
   * @return addTag
   */
  @javax.annotation.Nullable
  public List<String> getAddTag() {
    return addTag;
  }

  public void setAddTag(@javax.annotation.Nullable List<String> addTag) {
    this.addTag = addTag;
  }


  public RotatedSecretUpdateSnowflake authenticationCredentials(@javax.annotation.Nullable String authenticationCredentials) {
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


  public RotatedSecretUpdateSnowflake autoRotate(@javax.annotation.Nullable String autoRotate) {
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


  public RotatedSecretUpdateSnowflake deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public RotatedSecretUpdateSnowflake description(@javax.annotation.Nullable String description) {
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


  public RotatedSecretUpdateSnowflake json(@javax.annotation.Nullable Boolean json) {
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


  public RotatedSecretUpdateSnowflake keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public RotatedSecretUpdateSnowflake key(@javax.annotation.Nullable String key) {
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


  public RotatedSecretUpdateSnowflake maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public RotatedSecretUpdateSnowflake name(@javax.annotation.Nonnull String name) {
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


  public RotatedSecretUpdateSnowflake newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * New item name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public RotatedSecretUpdateSnowflake passwordLength(@javax.annotation.Nullable String passwordLength) {
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


  public RotatedSecretUpdateSnowflake rmTag(@javax.annotation.Nullable List<String> rmTag) {
    this.rmTag = rmTag;
    return this;
  }

  public RotatedSecretUpdateSnowflake addRmTagItem(String rmTagItem) {
    if (this.rmTag == null) {
      this.rmTag = new ArrayList<>();
    }
    this.rmTag.add(rmTagItem);
    return this;
  }

  /**
   * List of the existent tags that will be removed from this item
   * @return rmTag
   */
  @javax.annotation.Nullable
  public List<String> getRmTag() {
    return rmTag;
  }

  public void setRmTag(@javax.annotation.Nullable List<String> rmTag) {
    this.rmTag = rmTag;
  }


  public RotatedSecretUpdateSnowflake rotatedPassword(@javax.annotation.Nullable String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
    return this;
  }

  /**
   * rotated-username password (relevant only for rotator-type&#x3D;password)
   * @return rotatedPassword
   */
  @javax.annotation.Nullable
  public String getRotatedPassword() {
    return rotatedPassword;
  }

  public void setRotatedPassword(@javax.annotation.Nullable String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
  }


  public RotatedSecretUpdateSnowflake rotatedUsername(@javax.annotation.Nullable String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
    return this;
  }

  /**
   * username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password (relevant only for rotator-type&#x3D;password)
   * @return rotatedUsername
   */
  @javax.annotation.Nullable
  public String getRotatedUsername() {
    return rotatedUsername;
  }

  public void setRotatedUsername(@javax.annotation.Nullable String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
  }


  public RotatedSecretUpdateSnowflake rotationEventIn(@javax.annotation.Nullable List<String> rotationEventIn) {
    this.rotationEventIn = rotationEventIn;
    return this;
  }

  public RotatedSecretUpdateSnowflake addRotationEventInItem(String rotationEventInItem) {
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


  public RotatedSecretUpdateSnowflake rotationHour(@javax.annotation.Nullable Integer rotationHour) {
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


  public RotatedSecretUpdateSnowflake rotationInterval(@javax.annotation.Nullable String rotationInterval) {
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


  public RotatedSecretUpdateSnowflake token(@javax.annotation.Nullable String token) {
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


  public RotatedSecretUpdateSnowflake uidToken(@javax.annotation.Nullable String uidToken) {
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
    RotatedSecretUpdateSnowflake rotatedSecretUpdateSnowflake = (RotatedSecretUpdateSnowflake) o;
    return Objects.equals(this.addTag, rotatedSecretUpdateSnowflake.addTag) &&
        Objects.equals(this.authenticationCredentials, rotatedSecretUpdateSnowflake.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretUpdateSnowflake.autoRotate) &&
        Objects.equals(this.deleteProtection, rotatedSecretUpdateSnowflake.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretUpdateSnowflake.description) &&
        Objects.equals(this.json, rotatedSecretUpdateSnowflake.json) &&
        Objects.equals(this.keepPrevVersion, rotatedSecretUpdateSnowflake.keepPrevVersion) &&
        Objects.equals(this.key, rotatedSecretUpdateSnowflake.key) &&
        Objects.equals(this.maxVersions, rotatedSecretUpdateSnowflake.maxVersions) &&
        Objects.equals(this.name, rotatedSecretUpdateSnowflake.name) &&
        Objects.equals(this.newName, rotatedSecretUpdateSnowflake.newName) &&
        Objects.equals(this.passwordLength, rotatedSecretUpdateSnowflake.passwordLength) &&
        Objects.equals(this.rmTag, rotatedSecretUpdateSnowflake.rmTag) &&
        Objects.equals(this.rotatedPassword, rotatedSecretUpdateSnowflake.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, rotatedSecretUpdateSnowflake.rotatedUsername) &&
        Objects.equals(this.rotationEventIn, rotatedSecretUpdateSnowflake.rotationEventIn) &&
        Objects.equals(this.rotationHour, rotatedSecretUpdateSnowflake.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretUpdateSnowflake.rotationInterval) &&
        Objects.equals(this.token, rotatedSecretUpdateSnowflake.token) &&
        Objects.equals(this.uidToken, rotatedSecretUpdateSnowflake.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, authenticationCredentials, autoRotate, deleteProtection, description, json, keepPrevVersion, key, maxVersions, name, newName, passwordLength, rmTag, rotatedPassword, rotatedUsername, rotationEventIn, rotationHour, rotationInterval, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretUpdateSnowflake {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotatedPassword: ").append(toIndentedString(rotatedPassword)).append("\n");
    sb.append("    rotatedUsername: ").append(toIndentedString(rotatedUsername)).append("\n");
    sb.append("    rotationEventIn: ").append(toIndentedString(rotationEventIn)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
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
    openapiFields.add("add-tag");
    openapiFields.add("authentication-credentials");
    openapiFields.add("auto-rotate");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("password-length");
    openapiFields.add("rm-tag");
    openapiFields.add("rotated-password");
    openapiFields.add("rotated-username");
    openapiFields.add("rotation-event-in");
    openapiFields.add("rotation-hour");
    openapiFields.add("rotation-interval");
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
   * @throws IOException if the JSON Element is invalid with respect to RotatedSecretUpdateSnowflake
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RotatedSecretUpdateSnowflake.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RotatedSecretUpdateSnowflake is not found in the empty JSON string", RotatedSecretUpdateSnowflake.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RotatedSecretUpdateSnowflake.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RotatedSecretUpdateSnowflake` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RotatedSecretUpdateSnowflake.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("add-tag") != null && !jsonObj.get("add-tag").isJsonNull() && !jsonObj.get("add-tag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add-tag` to be an array in the JSON string but got `%s`", jsonObj.get("add-tag").toString()));
      }
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
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rm-tag") != null && !jsonObj.get("rm-tag").isJsonNull() && !jsonObj.get("rm-tag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rm-tag` to be an array in the JSON string but got `%s`", jsonObj.get("rm-tag").toString()));
      }
      if ((jsonObj.get("rotated-password") != null && !jsonObj.get("rotated-password").isJsonNull()) && !jsonObj.get("rotated-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotated-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotated-password").toString()));
      }
      if ((jsonObj.get("rotated-username") != null && !jsonObj.get("rotated-username").isJsonNull()) && !jsonObj.get("rotated-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotated-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotated-username").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rotation-event-in") != null && !jsonObj.get("rotation-event-in").isJsonNull() && !jsonObj.get("rotation-event-in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation-event-in` to be an array in the JSON string but got `%s`", jsonObj.get("rotation-event-in").toString()));
      }
      if ((jsonObj.get("rotation-interval") != null && !jsonObj.get("rotation-interval").isJsonNull()) && !jsonObj.get("rotation-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotation-interval").toString()));
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
       if (!RotatedSecretUpdateSnowflake.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RotatedSecretUpdateSnowflake' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RotatedSecretUpdateSnowflake> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RotatedSecretUpdateSnowflake.class));

       return (TypeAdapter<T>) new TypeAdapter<RotatedSecretUpdateSnowflake>() {
           @Override
           public void write(JsonWriter out, RotatedSecretUpdateSnowflake value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RotatedSecretUpdateSnowflake read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RotatedSecretUpdateSnowflake given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RotatedSecretUpdateSnowflake
   * @throws IOException if the JSON string is invalid with respect to RotatedSecretUpdateSnowflake
   */
  public static RotatedSecretUpdateSnowflake fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RotatedSecretUpdateSnowflake.class);
  }

  /**
   * Convert an instance of RotatedSecretUpdateSnowflake to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

