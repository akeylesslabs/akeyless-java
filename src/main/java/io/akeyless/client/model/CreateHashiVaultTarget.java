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
 * createHashiVaultTarget is a command that creates a new hashi-vault target. [Deprecated: Use target-create-hashi-vault command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateHashiVaultTarget {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_HASHI_URL = "hashi-url";
  @SerializedName(SERIALIZED_NAME_HASHI_URL)
  @javax.annotation.Nullable
  private String hashiUrl;

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

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private List<String> namespace = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_VAULT_TOKEN = "vault-token";
  @SerializedName(SERIALIZED_NAME_VAULT_TOKEN)
  @javax.annotation.Nullable
  private String vaultToken;

  public CreateHashiVaultTarget() {
  }

  public CreateHashiVaultTarget description(@javax.annotation.Nullable String description) {
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


  public CreateHashiVaultTarget hashiUrl(@javax.annotation.Nullable String hashiUrl) {
    this.hashiUrl = hashiUrl;
    return this;
  }

  /**
   * HashiCorp Vault API URL, e.g. https://vault-mgr01:8200
   * @return hashiUrl
   */
  @javax.annotation.Nullable
  public String getHashiUrl() {
    return hashiUrl;
  }

  public void setHashiUrl(@javax.annotation.Nullable String hashiUrl) {
    this.hashiUrl = hashiUrl;
  }


  public CreateHashiVaultTarget json(@javax.annotation.Nullable Boolean json) {
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


  public CreateHashiVaultTarget key(@javax.annotation.Nullable String key) {
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


  public CreateHashiVaultTarget maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public CreateHashiVaultTarget name(@javax.annotation.Nonnull String name) {
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


  public CreateHashiVaultTarget namespace(@javax.annotation.Nullable List<String> namespace) {
    this.namespace = namespace;
    return this;
  }

  public CreateHashiVaultTarget addNamespaceItem(String namespaceItem) {
    if (this.namespace == null) {
      this.namespace = new ArrayList<>();
    }
    this.namespace.add(namespaceItem);
    return this;
  }

  /**
   * Comma-separated list of vault namespaces
   * @return namespace
   */
  @javax.annotation.Nullable
  public List<String> getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable List<String> namespace) {
    this.namespace = namespace;
  }


  public CreateHashiVaultTarget token(@javax.annotation.Nullable String token) {
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


  public CreateHashiVaultTarget uidToken(@javax.annotation.Nullable String uidToken) {
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


  public CreateHashiVaultTarget vaultToken(@javax.annotation.Nullable String vaultToken) {
    this.vaultToken = vaultToken;
    return this;
  }

  /**
   * Vault access token with sufficient permissions
   * @return vaultToken
   */
  @javax.annotation.Nullable
  public String getVaultToken() {
    return vaultToken;
  }

  public void setVaultToken(@javax.annotation.Nullable String vaultToken) {
    this.vaultToken = vaultToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHashiVaultTarget createHashiVaultTarget = (CreateHashiVaultTarget) o;
    return Objects.equals(this.description, createHashiVaultTarget.description) &&
        Objects.equals(this.hashiUrl, createHashiVaultTarget.hashiUrl) &&
        Objects.equals(this.json, createHashiVaultTarget.json) &&
        Objects.equals(this.key, createHashiVaultTarget.key) &&
        Objects.equals(this.maxVersions, createHashiVaultTarget.maxVersions) &&
        Objects.equals(this.name, createHashiVaultTarget.name) &&
        Objects.equals(this.namespace, createHashiVaultTarget.namespace) &&
        Objects.equals(this.token, createHashiVaultTarget.token) &&
        Objects.equals(this.uidToken, createHashiVaultTarget.uidToken) &&
        Objects.equals(this.vaultToken, createHashiVaultTarget.vaultToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, hashiUrl, json, key, maxVersions, name, namespace, token, uidToken, vaultToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHashiVaultTarget {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hashiUrl: ").append(toIndentedString(hashiUrl)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    vaultToken: ").append(toIndentedString(vaultToken)).append("\n");
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
    openapiFields.add("hashi-url");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("vault-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateHashiVaultTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateHashiVaultTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateHashiVaultTarget is not found in the empty JSON string", CreateHashiVaultTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateHashiVaultTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateHashiVaultTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateHashiVaultTarget.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("hashi-url") != null && !jsonObj.get("hashi-url").isJsonNull()) && !jsonObj.get("hashi-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashi-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashi-url").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull() && !jsonObj.get("namespace").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be an array in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("vault-token") != null && !jsonObj.get("vault-token").isJsonNull()) && !jsonObj.get("vault-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vault-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vault-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateHashiVaultTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateHashiVaultTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateHashiVaultTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateHashiVaultTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateHashiVaultTarget>() {
           @Override
           public void write(JsonWriter out, CreateHashiVaultTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateHashiVaultTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateHashiVaultTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateHashiVaultTarget
   * @throws IOException if the JSON string is invalid with respect to CreateHashiVaultTarget
   */
  public static CreateHashiVaultTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateHashiVaultTarget.class);
  }

  /**
   * Convert an instance of CreateHashiVaultTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

