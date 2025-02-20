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
 * targetCreateRabbitMq is a command that creates a new rabbitmq target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetCreateRabbitMq {
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

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD = "rabbitmq-server-password";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_PASSWORD)
  @javax.annotation.Nullable
  private String rabbitmqServerPassword;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq-server-uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  @javax.annotation.Nullable
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_USER = "rabbitmq-server-user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_USER)
  @javax.annotation.Nullable
  private String rabbitmqServerUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public TargetCreateRabbitMq() {
  }

  public TargetCreateRabbitMq description(@javax.annotation.Nullable String description) {
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


  public TargetCreateRabbitMq json(@javax.annotation.Nullable Boolean json) {
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


  public TargetCreateRabbitMq key(@javax.annotation.Nullable String key) {
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


  public TargetCreateRabbitMq maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetCreateRabbitMq name(@javax.annotation.Nonnull String name) {
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


  public TargetCreateRabbitMq rabbitmqServerPassword(@javax.annotation.Nullable String rabbitmqServerPassword) {
    this.rabbitmqServerPassword = rabbitmqServerPassword;
    return this;
  }

  /**
   * Get rabbitmqServerPassword
   * @return rabbitmqServerPassword
   */
  @javax.annotation.Nullable
  public String getRabbitmqServerPassword() {
    return rabbitmqServerPassword;
  }

  public void setRabbitmqServerPassword(@javax.annotation.Nullable String rabbitmqServerPassword) {
    this.rabbitmqServerPassword = rabbitmqServerPassword;
  }


  public TargetCreateRabbitMq rabbitmqServerUri(@javax.annotation.Nullable String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
    return this;
  }

  /**
   * Get rabbitmqServerUri
   * @return rabbitmqServerUri
   */
  @javax.annotation.Nullable
  public String getRabbitmqServerUri() {
    return rabbitmqServerUri;
  }

  public void setRabbitmqServerUri(@javax.annotation.Nullable String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
  }


  public TargetCreateRabbitMq rabbitmqServerUser(@javax.annotation.Nullable String rabbitmqServerUser) {
    this.rabbitmqServerUser = rabbitmqServerUser;
    return this;
  }

  /**
   * Get rabbitmqServerUser
   * @return rabbitmqServerUser
   */
  @javax.annotation.Nullable
  public String getRabbitmqServerUser() {
    return rabbitmqServerUser;
  }

  public void setRabbitmqServerUser(@javax.annotation.Nullable String rabbitmqServerUser) {
    this.rabbitmqServerUser = rabbitmqServerUser;
  }


  public TargetCreateRabbitMq token(@javax.annotation.Nullable String token) {
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


  public TargetCreateRabbitMq uidToken(@javax.annotation.Nullable String uidToken) {
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
    TargetCreateRabbitMq targetCreateRabbitMq = (TargetCreateRabbitMq) o;
    return Objects.equals(this.description, targetCreateRabbitMq.description) &&
        Objects.equals(this.json, targetCreateRabbitMq.json) &&
        Objects.equals(this.key, targetCreateRabbitMq.key) &&
        Objects.equals(this.maxVersions, targetCreateRabbitMq.maxVersions) &&
        Objects.equals(this.name, targetCreateRabbitMq.name) &&
        Objects.equals(this.rabbitmqServerPassword, targetCreateRabbitMq.rabbitmqServerPassword) &&
        Objects.equals(this.rabbitmqServerUri, targetCreateRabbitMq.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqServerUser, targetCreateRabbitMq.rabbitmqServerUser) &&
        Objects.equals(this.token, targetCreateRabbitMq.token) &&
        Objects.equals(this.uidToken, targetCreateRabbitMq.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, json, key, maxVersions, name, rabbitmqServerPassword, rabbitmqServerUri, rabbitmqServerUser, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateRabbitMq {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rabbitmqServerPassword: ").append(toIndentedString(rabbitmqServerPassword)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqServerUser: ").append(toIndentedString(rabbitmqServerUser)).append("\n");
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
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("rabbitmq-server-password");
    openapiFields.add("rabbitmq-server-uri");
    openapiFields.add("rabbitmq-server-user");
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
   * @throws IOException if the JSON Element is invalid with respect to TargetCreateRabbitMq
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetCreateRabbitMq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetCreateRabbitMq is not found in the empty JSON string", TargetCreateRabbitMq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetCreateRabbitMq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetCreateRabbitMq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetCreateRabbitMq.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("rabbitmq-server-password") != null && !jsonObj.get("rabbitmq-server-password").isJsonNull()) && !jsonObj.get("rabbitmq-server-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-server-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-server-password").toString()));
      }
      if ((jsonObj.get("rabbitmq-server-uri") != null && !jsonObj.get("rabbitmq-server-uri").isJsonNull()) && !jsonObj.get("rabbitmq-server-uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-server-uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-server-uri").toString()));
      }
      if ((jsonObj.get("rabbitmq-server-user") != null && !jsonObj.get("rabbitmq-server-user").isJsonNull()) && !jsonObj.get("rabbitmq-server-user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-server-user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-server-user").toString()));
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
       if (!TargetCreateRabbitMq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetCreateRabbitMq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetCreateRabbitMq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetCreateRabbitMq.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetCreateRabbitMq>() {
           @Override
           public void write(JsonWriter out, TargetCreateRabbitMq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetCreateRabbitMq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetCreateRabbitMq given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetCreateRabbitMq
   * @throws IOException if the JSON string is invalid with respect to TargetCreateRabbitMq
   */
  public static TargetCreateRabbitMq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetCreateRabbitMq.class);
  }

  /**
   * Convert an instance of TargetCreateRabbitMq to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

