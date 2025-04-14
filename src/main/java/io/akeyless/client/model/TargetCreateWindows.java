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
 * GatewayCreateProducerWindowsCmd is a command that creates a new windows target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetCreateWindows {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  @javax.annotation.Nullable
  private String certificate;

  public static final String SERIALIZED_NAME_CONNECTION_TYPE = "connection-type";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TYPE)
  @javax.annotation.Nullable
  private String connectionType = "credentials";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  @javax.annotation.Nullable
  private String domain;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  @javax.annotation.Nonnull
  private String hostname;

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

  public static final String SERIALIZED_NAME_PARENT_TARGET_NAME = "parent-target-name";
  @SerializedName(SERIALIZED_NAME_PARENT_TARGET_NAME)
  @javax.annotation.Nullable
  private String parentTargetName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nonnull
  private String password = "dummy_value";

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @javax.annotation.Nullable
  private String port = "5986";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_TLS = "use-tls";
  @SerializedName(SERIALIZED_NAME_USE_TLS)
  @javax.annotation.Nullable
  private String useTls = "true";

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nonnull
  private String username = "dummy_value";

  public TargetCreateWindows() {
  }

  public TargetCreateWindows certificate(@javax.annotation.Nullable String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * SSL CA certificate in base64 encoding generated from a trusted Certificate Authority (CA)
   * @return certificate
   */
  @javax.annotation.Nullable
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(@javax.annotation.Nullable String certificate) {
    this.certificate = certificate;
  }


  public TargetCreateWindows connectionType(@javax.annotation.Nullable String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Type of connection to Windows Server [credentials/parent-target]
   * @return connectionType
   */
  @javax.annotation.Nullable
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(@javax.annotation.Nullable String connectionType) {
    this.connectionType = connectionType;
  }


  public TargetCreateWindows description(@javax.annotation.Nullable String description) {
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


  public TargetCreateWindows domain(@javax.annotation.Nullable String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * User domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(@javax.annotation.Nullable String domain) {
    this.domain = domain;
  }


  public TargetCreateWindows hostname(@javax.annotation.Nonnull String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Server hostname
   * @return hostname
   */
  @javax.annotation.Nonnull
  public String getHostname() {
    return hostname;
  }

  public void setHostname(@javax.annotation.Nonnull String hostname) {
    this.hostname = hostname;
  }


  public TargetCreateWindows json(@javax.annotation.Nullable Boolean json) {
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


  public TargetCreateWindows key(@javax.annotation.Nullable String key) {
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


  public TargetCreateWindows maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetCreateWindows name(@javax.annotation.Nonnull String name) {
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


  public TargetCreateWindows parentTargetName(@javax.annotation.Nullable String parentTargetName) {
    this.parentTargetName = parentTargetName;
    return this;
  }

  /**
   * Name of the parent target, relevant only when connection-type is parent-target
   * @return parentTargetName
   */
  @javax.annotation.Nullable
  public String getParentTargetName() {
    return parentTargetName;
  }

  public void setParentTargetName(@javax.annotation.Nullable String parentTargetName) {
    this.parentTargetName = parentTargetName;
  }


  public TargetCreateWindows password(@javax.annotation.Nonnull String password) {
    this.password = password;
    return this;
  }

  /**
   * Privileged user password
   * @return password
   */
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nonnull String password) {
    this.password = password;
  }


  public TargetCreateWindows port(@javax.annotation.Nullable String port) {
    this.port = port;
    return this;
  }

  /**
   * Server WinRM port
   * @return port
   */
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(@javax.annotation.Nullable String port) {
    this.port = port;
  }


  public TargetCreateWindows token(@javax.annotation.Nullable String token) {
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


  public TargetCreateWindows uidToken(@javax.annotation.Nullable String uidToken) {
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


  public TargetCreateWindows useTls(@javax.annotation.Nullable String useTls) {
    this.useTls = useTls;
    return this;
  }

  /**
   * Enable/Disable TLS for WinRM over HTTPS [true/false]
   * @return useTls
   */
  @javax.annotation.Nullable
  public String getUseTls() {
    return useTls;
  }

  public void setUseTls(@javax.annotation.Nullable String useTls) {
    this.useTls = useTls;
  }


  public TargetCreateWindows username(@javax.annotation.Nonnull String username) {
    this.username = username;
    return this;
  }

  /**
   * Privileged username
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
    TargetCreateWindows targetCreateWindows = (TargetCreateWindows) o;
    return Objects.equals(this.certificate, targetCreateWindows.certificate) &&
        Objects.equals(this.connectionType, targetCreateWindows.connectionType) &&
        Objects.equals(this.description, targetCreateWindows.description) &&
        Objects.equals(this.domain, targetCreateWindows.domain) &&
        Objects.equals(this.hostname, targetCreateWindows.hostname) &&
        Objects.equals(this.json, targetCreateWindows.json) &&
        Objects.equals(this.key, targetCreateWindows.key) &&
        Objects.equals(this.maxVersions, targetCreateWindows.maxVersions) &&
        Objects.equals(this.name, targetCreateWindows.name) &&
        Objects.equals(this.parentTargetName, targetCreateWindows.parentTargetName) &&
        Objects.equals(this.password, targetCreateWindows.password) &&
        Objects.equals(this.port, targetCreateWindows.port) &&
        Objects.equals(this.token, targetCreateWindows.token) &&
        Objects.equals(this.uidToken, targetCreateWindows.uidToken) &&
        Objects.equals(this.useTls, targetCreateWindows.useTls) &&
        Objects.equals(this.username, targetCreateWindows.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, connectionType, description, domain, hostname, json, key, maxVersions, name, parentTargetName, password, port, token, uidToken, useTls, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateWindows {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTargetName: ").append(toIndentedString(parentTargetName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
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
    openapiFields.add("certificate");
    openapiFields.add("connection-type");
    openapiFields.add("description");
    openapiFields.add("domain");
    openapiFields.add("hostname");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("parent-target-name");
    openapiFields.add("password");
    openapiFields.add("port");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("use-tls");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hostname");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetCreateWindows
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetCreateWindows.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetCreateWindows is not found in the empty JSON string", TargetCreateWindows.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetCreateWindows.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetCreateWindows` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetCreateWindows.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) && !jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if ((jsonObj.get("connection-type") != null && !jsonObj.get("connection-type").isJsonNull()) && !jsonObj.get("connection-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection-type").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if (!jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
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
      if ((jsonObj.get("parent-target-name") != null && !jsonObj.get("parent-target-name").isJsonNull()) && !jsonObj.get("parent-target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent-target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent-target-name").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("use-tls") != null && !jsonObj.get("use-tls").isJsonNull()) && !jsonObj.get("use-tls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use-tls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use-tls").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetCreateWindows.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetCreateWindows' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetCreateWindows> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetCreateWindows.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetCreateWindows>() {
           @Override
           public void write(JsonWriter out, TargetCreateWindows value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetCreateWindows read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetCreateWindows given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetCreateWindows
   * @throws IOException if the JSON string is invalid with respect to TargetCreateWindows
   */
  public static TargetCreateWindows fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetCreateWindows.class);
  }

  /**
   * Convert an instance of TargetCreateWindows to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

