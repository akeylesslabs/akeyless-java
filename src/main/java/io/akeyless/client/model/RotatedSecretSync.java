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
 * RotatedSecretSync
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RotatedSecretSync {
  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_REMOTE_SECRET_NAME = "remote-secret-name";
  @SerializedName(SERIALIZED_NAME_REMOTE_SECRET_NAME)
  @javax.annotation.Nullable
  private String remoteSecretName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USC_NAME = "usc-name";
  @SerializedName(SERIALIZED_NAME_USC_NAME)
  @javax.annotation.Nullable
  private String uscName;

  public RotatedSecretSync() {
  }

  public RotatedSecretSync json(@javax.annotation.Nullable Boolean json) {
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


  public RotatedSecretSync name(@javax.annotation.Nonnull String name) {
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


  public RotatedSecretSync namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Vault namespace, releavnt only for Hashicorp Vault Target
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public RotatedSecretSync remoteSecretName(@javax.annotation.Nullable String remoteSecretName) {
    this.remoteSecretName = remoteSecretName;
    return this;
  }

  /**
   * Remote Secret Name that will be synced on the remote endpoint
   * @return remoteSecretName
   */
  @javax.annotation.Nullable
  public String getRemoteSecretName() {
    return remoteSecretName;
  }

  public void setRemoteSecretName(@javax.annotation.Nullable String remoteSecretName) {
    this.remoteSecretName = remoteSecretName;
  }


  public RotatedSecretSync token(@javax.annotation.Nullable String token) {
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


  public RotatedSecretSync uidToken(@javax.annotation.Nullable String uidToken) {
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


  public RotatedSecretSync uscName(@javax.annotation.Nullable String uscName) {
    this.uscName = uscName;
    return this;
  }

  /**
   * Universal Secret Connector name, If not provided all attached USC&#39;s will be synced
   * @return uscName
   */
  @javax.annotation.Nullable
  public String getUscName() {
    return uscName;
  }

  public void setUscName(@javax.annotation.Nullable String uscName) {
    this.uscName = uscName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotatedSecretSync rotatedSecretSync = (RotatedSecretSync) o;
    return Objects.equals(this.json, rotatedSecretSync.json) &&
        Objects.equals(this.name, rotatedSecretSync.name) &&
        Objects.equals(this.namespace, rotatedSecretSync.namespace) &&
        Objects.equals(this.remoteSecretName, rotatedSecretSync.remoteSecretName) &&
        Objects.equals(this.token, rotatedSecretSync.token) &&
        Objects.equals(this.uidToken, rotatedSecretSync.uidToken) &&
        Objects.equals(this.uscName, rotatedSecretSync.uscName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, name, namespace, remoteSecretName, token, uidToken, uscName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretSync {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    remoteSecretName: ").append(toIndentedString(remoteSecretName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uscName: ").append(toIndentedString(uscName)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("remote-secret-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("usc-name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RotatedSecretSync
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RotatedSecretSync.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RotatedSecretSync is not found in the empty JSON string", RotatedSecretSync.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RotatedSecretSync.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RotatedSecretSync` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RotatedSecretSync.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("remote-secret-name") != null && !jsonObj.get("remote-secret-name").isJsonNull()) && !jsonObj.get("remote-secret-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote-secret-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote-secret-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("usc-name") != null && !jsonObj.get("usc-name").isJsonNull()) && !jsonObj.get("usc-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usc-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usc-name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RotatedSecretSync.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RotatedSecretSync' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RotatedSecretSync> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RotatedSecretSync.class));

       return (TypeAdapter<T>) new TypeAdapter<RotatedSecretSync>() {
           @Override
           public void write(JsonWriter out, RotatedSecretSync value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RotatedSecretSync read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RotatedSecretSync given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RotatedSecretSync
   * @throws IOException if the JSON string is invalid with respect to RotatedSecretSync
   */
  public static RotatedSecretSync fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RotatedSecretSync.class);
  }

  /**
   * Convert an instance of RotatedSecretSync to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

