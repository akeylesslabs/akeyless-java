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
 * targetUpdateZeroSSL is a command that updates an existing ZeroSSL target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetUpdateZeroSSL {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  @javax.annotation.Nonnull
  private String apiKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_IMAP_FQDN = "imap-fqdn";
  @SerializedName(SERIALIZED_NAME_IMAP_FQDN)
  @javax.annotation.Nonnull
  private String imapFqdn;

  public static final String SERIALIZED_NAME_IMAP_PASSWORD = "imap-password";
  @SerializedName(SERIALIZED_NAME_IMAP_PASSWORD)
  @javax.annotation.Nonnull
  private String imapPassword;

  public static final String SERIALIZED_NAME_IMAP_PORT = "imap-port";
  @SerializedName(SERIALIZED_NAME_IMAP_PORT)
  @javax.annotation.Nullable
  private String imapPort = "993";

  public static final String SERIALIZED_NAME_IMAP_TARGET_EMAIL = "imap-target-email";
  @SerializedName(SERIALIZED_NAME_IMAP_TARGET_EMAIL)
  @javax.annotation.Nullable
  private String imapTargetEmail;

  public static final String SERIALIZED_NAME_IMAP_USERNAME = "imap-username";
  @SerializedName(SERIALIZED_NAME_IMAP_USERNAME)
  @javax.annotation.Nonnull
  private String imapUsername;

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

  public TargetUpdateZeroSSL() {
  }

  public TargetUpdateZeroSSL apiKey(@javax.annotation.Nonnull String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * API Key of the ZeroSSLTarget account
   * @return apiKey
   */
  @javax.annotation.Nonnull
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(@javax.annotation.Nonnull String apiKey) {
    this.apiKey = apiKey;
  }


  public TargetUpdateZeroSSL description(@javax.annotation.Nullable String description) {
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


  public TargetUpdateZeroSSL imapFqdn(@javax.annotation.Nonnull String imapFqdn) {
    this.imapFqdn = imapFqdn;
    return this;
  }

  /**
   * ImapFQDN of the IMAP service, FQDN or IPv4 address. Must be FQDN if the IMAP is using TLS
   * @return imapFqdn
   */
  @javax.annotation.Nonnull
  public String getImapFqdn() {
    return imapFqdn;
  }

  public void setImapFqdn(@javax.annotation.Nonnull String imapFqdn) {
    this.imapFqdn = imapFqdn;
  }


  public TargetUpdateZeroSSL imapPassword(@javax.annotation.Nonnull String imapPassword) {
    this.imapPassword = imapPassword;
    return this;
  }

  /**
   * ImapPassword to access the IMAP service
   * @return imapPassword
   */
  @javax.annotation.Nonnull
  public String getImapPassword() {
    return imapPassword;
  }

  public void setImapPassword(@javax.annotation.Nonnull String imapPassword) {
    this.imapPassword = imapPassword;
  }


  public TargetUpdateZeroSSL imapPort(@javax.annotation.Nullable String imapPort) {
    this.imapPort = imapPort;
    return this;
  }

  /**
   * ImapPort of the IMAP service
   * @return imapPort
   */
  @javax.annotation.Nullable
  public String getImapPort() {
    return imapPort;
  }

  public void setImapPort(@javax.annotation.Nullable String imapPort) {
    this.imapPort = imapPort;
  }


  public TargetUpdateZeroSSL imapTargetEmail(@javax.annotation.Nullable String imapTargetEmail) {
    this.imapTargetEmail = imapTargetEmail;
    return this;
  }

  /**
   * ImapValidationEmail to use when asking ZeroSSL to send a validation email, if empty will user imap-username
   * @return imapTargetEmail
   */
  @javax.annotation.Nullable
  public String getImapTargetEmail() {
    return imapTargetEmail;
  }

  public void setImapTargetEmail(@javax.annotation.Nullable String imapTargetEmail) {
    this.imapTargetEmail = imapTargetEmail;
  }


  public TargetUpdateZeroSSL imapUsername(@javax.annotation.Nonnull String imapUsername) {
    this.imapUsername = imapUsername;
    return this;
  }

  /**
   * ImapUsername to access the IMAP service
   * @return imapUsername
   */
  @javax.annotation.Nonnull
  public String getImapUsername() {
    return imapUsername;
  }

  public void setImapUsername(@javax.annotation.Nonnull String imapUsername) {
    this.imapUsername = imapUsername;
  }


  public TargetUpdateZeroSSL json(@javax.annotation.Nullable Boolean json) {
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


  public TargetUpdateZeroSSL keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public TargetUpdateZeroSSL key(@javax.annotation.Nullable String key) {
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


  public TargetUpdateZeroSSL maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetUpdateZeroSSL name(@javax.annotation.Nonnull String name) {
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


  public TargetUpdateZeroSSL newName(@javax.annotation.Nullable String newName) {
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


  public TargetUpdateZeroSSL timeout(@javax.annotation.Nullable String timeout) {
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


  public TargetUpdateZeroSSL token(@javax.annotation.Nullable String token) {
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


  public TargetUpdateZeroSSL uidToken(@javax.annotation.Nullable String uidToken) {
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
    TargetUpdateZeroSSL targetUpdateZeroSSL = (TargetUpdateZeroSSL) o;
    return Objects.equals(this.apiKey, targetUpdateZeroSSL.apiKey) &&
        Objects.equals(this.description, targetUpdateZeroSSL.description) &&
        Objects.equals(this.imapFqdn, targetUpdateZeroSSL.imapFqdn) &&
        Objects.equals(this.imapPassword, targetUpdateZeroSSL.imapPassword) &&
        Objects.equals(this.imapPort, targetUpdateZeroSSL.imapPort) &&
        Objects.equals(this.imapTargetEmail, targetUpdateZeroSSL.imapTargetEmail) &&
        Objects.equals(this.imapUsername, targetUpdateZeroSSL.imapUsername) &&
        Objects.equals(this.json, targetUpdateZeroSSL.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateZeroSSL.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateZeroSSL.key) &&
        Objects.equals(this.maxVersions, targetUpdateZeroSSL.maxVersions) &&
        Objects.equals(this.name, targetUpdateZeroSSL.name) &&
        Objects.equals(this.newName, targetUpdateZeroSSL.newName) &&
        Objects.equals(this.timeout, targetUpdateZeroSSL.timeout) &&
        Objects.equals(this.token, targetUpdateZeroSSL.token) &&
        Objects.equals(this.uidToken, targetUpdateZeroSSL.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, description, imapFqdn, imapPassword, imapPort, imapTargetEmail, imapUsername, json, keepPrevVersion, key, maxVersions, name, newName, timeout, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateZeroSSL {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imapFqdn: ").append(toIndentedString(imapFqdn)).append("\n");
    sb.append("    imapPassword: ").append(toIndentedString(imapPassword)).append("\n");
    sb.append("    imapPort: ").append(toIndentedString(imapPort)).append("\n");
    sb.append("    imapTargetEmail: ").append(toIndentedString(imapTargetEmail)).append("\n");
    sb.append("    imapUsername: ").append(toIndentedString(imapUsername)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
    openapiFields.add("api-key");
    openapiFields.add("description");
    openapiFields.add("imap-fqdn");
    openapiFields.add("imap-password");
    openapiFields.add("imap-port");
    openapiFields.add("imap-target-email");
    openapiFields.add("imap-username");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("timeout");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("api-key");
    openapiRequiredFields.add("imap-fqdn");
    openapiRequiredFields.add("imap-password");
    openapiRequiredFields.add("imap-username");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetUpdateZeroSSL
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetUpdateZeroSSL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetUpdateZeroSSL is not found in the empty JSON string", TargetUpdateZeroSSL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetUpdateZeroSSL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetUpdateZeroSSL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetUpdateZeroSSL.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("api-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api-key").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("imap-fqdn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imap-fqdn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imap-fqdn").toString()));
      }
      if (!jsonObj.get("imap-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imap-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imap-password").toString()));
      }
      if ((jsonObj.get("imap-port") != null && !jsonObj.get("imap-port").isJsonNull()) && !jsonObj.get("imap-port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imap-port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imap-port").toString()));
      }
      if ((jsonObj.get("imap-target-email") != null && !jsonObj.get("imap-target-email").isJsonNull()) && !jsonObj.get("imap-target-email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imap-target-email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imap-target-email").toString()));
      }
      if (!jsonObj.get("imap-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imap-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imap-username").toString()));
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
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
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
       if (!TargetUpdateZeroSSL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetUpdateZeroSSL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetUpdateZeroSSL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetUpdateZeroSSL.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetUpdateZeroSSL>() {
           @Override
           public void write(JsonWriter out, TargetUpdateZeroSSL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetUpdateZeroSSL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetUpdateZeroSSL given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetUpdateZeroSSL
   * @throws IOException if the JSON string is invalid with respect to TargetUpdateZeroSSL
   */
  public static TargetUpdateZeroSSL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetUpdateZeroSSL.class);
  }

  /**
   * Convert an instance of TargetUpdateZeroSSL to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

