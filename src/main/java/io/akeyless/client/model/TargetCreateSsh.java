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
 * targetCreateSsh is a command that creates a new ssh target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetCreateSsh {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

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

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @javax.annotation.Nullable
  private String port = "22";

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private-key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  @javax.annotation.Nullable
  private String privateKey;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_PASSWORD = "private-key-password";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_PASSWORD)
  @javax.annotation.Nullable
  private String privateKeyPassword;

  public static final String SERIALIZED_NAME_SSH_PASSWORD = "ssh-password";
  @SerializedName(SERIALIZED_NAME_SSH_PASSWORD)
  @javax.annotation.Nullable
  private String sshPassword;

  public static final String SERIALIZED_NAME_SSH_USERNAME = "ssh-username";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME)
  @javax.annotation.Nullable
  private String sshUsername;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public TargetCreateSsh() {
  }

  public TargetCreateSsh description(@javax.annotation.Nullable String description) {
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


  public TargetCreateSsh host(@javax.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * SSH host name
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = host;
  }


  public TargetCreateSsh json(@javax.annotation.Nullable Boolean json) {
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


  public TargetCreateSsh key(@javax.annotation.Nullable String key) {
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


  public TargetCreateSsh maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetCreateSsh name(@javax.annotation.Nonnull String name) {
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


  public TargetCreateSsh port(@javax.annotation.Nullable String port) {
    this.port = port;
    return this;
  }

  /**
   * SSH port
   * @return port
   */
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(@javax.annotation.Nullable String port) {
    this.port = port;
  }


  public TargetCreateSsh privateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * SSH private key
   * @return privateKey
   */
  @javax.annotation.Nullable
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
  }


  public TargetCreateSsh privateKeyPassword(@javax.annotation.Nullable String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
    return this;
  }

  /**
   * SSH private key password
   * @return privateKeyPassword
   */
  @javax.annotation.Nullable
  public String getPrivateKeyPassword() {
    return privateKeyPassword;
  }

  public void setPrivateKeyPassword(@javax.annotation.Nullable String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
  }


  public TargetCreateSsh sshPassword(@javax.annotation.Nullable String sshPassword) {
    this.sshPassword = sshPassword;
    return this;
  }

  /**
   * SSH password to rotate
   * @return sshPassword
   */
  @javax.annotation.Nullable
  public String getSshPassword() {
    return sshPassword;
  }

  public void setSshPassword(@javax.annotation.Nullable String sshPassword) {
    this.sshPassword = sshPassword;
  }


  public TargetCreateSsh sshUsername(@javax.annotation.Nullable String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

  /**
   * SSH username
   * @return sshUsername
   */
  @javax.annotation.Nullable
  public String getSshUsername() {
    return sshUsername;
  }

  public void setSshUsername(@javax.annotation.Nullable String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public TargetCreateSsh token(@javax.annotation.Nullable String token) {
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


  public TargetCreateSsh uidToken(@javax.annotation.Nullable String uidToken) {
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
    TargetCreateSsh targetCreateSsh = (TargetCreateSsh) o;
    return Objects.equals(this.description, targetCreateSsh.description) &&
        Objects.equals(this.host, targetCreateSsh.host) &&
        Objects.equals(this.json, targetCreateSsh.json) &&
        Objects.equals(this.key, targetCreateSsh.key) &&
        Objects.equals(this.maxVersions, targetCreateSsh.maxVersions) &&
        Objects.equals(this.name, targetCreateSsh.name) &&
        Objects.equals(this.port, targetCreateSsh.port) &&
        Objects.equals(this.privateKey, targetCreateSsh.privateKey) &&
        Objects.equals(this.privateKeyPassword, targetCreateSsh.privateKeyPassword) &&
        Objects.equals(this.sshPassword, targetCreateSsh.sshPassword) &&
        Objects.equals(this.sshUsername, targetCreateSsh.sshUsername) &&
        Objects.equals(this.token, targetCreateSsh.token) &&
        Objects.equals(this.uidToken, targetCreateSsh.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, host, json, key, maxVersions, name, port, privateKey, privateKeyPassword, sshPassword, sshUsername, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateSsh {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("host");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("private-key");
    openapiFields.add("private-key-password");
    openapiFields.add("ssh-password");
    openapiFields.add("ssh-username");
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
   * @throws IOException if the JSON Element is invalid with respect to TargetCreateSsh
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetCreateSsh.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetCreateSsh is not found in the empty JSON string", TargetCreateSsh.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetCreateSsh.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetCreateSsh` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetCreateSsh.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
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
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("private-key") != null && !jsonObj.get("private-key").isJsonNull()) && !jsonObj.get("private-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private-key").toString()));
      }
      if ((jsonObj.get("private-key-password") != null && !jsonObj.get("private-key-password").isJsonNull()) && !jsonObj.get("private-key-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private-key-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private-key-password").toString()));
      }
      if ((jsonObj.get("ssh-password") != null && !jsonObj.get("ssh-password").isJsonNull()) && !jsonObj.get("ssh-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssh-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssh-password").toString()));
      }
      if ((jsonObj.get("ssh-username") != null && !jsonObj.get("ssh-username").isJsonNull()) && !jsonObj.get("ssh-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssh-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssh-username").toString()));
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
       if (!TargetCreateSsh.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetCreateSsh' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetCreateSsh> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetCreateSsh.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetCreateSsh>() {
           @Override
           public void write(JsonWriter out, TargetCreateSsh value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetCreateSsh read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetCreateSsh given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetCreateSsh
   * @throws IOException if the JSON string is invalid with respect to TargetCreateSsh
   */
  public static TargetCreateSsh fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetCreateSsh.class);
  }

  /**
   * Convert an instance of TargetCreateSsh to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

