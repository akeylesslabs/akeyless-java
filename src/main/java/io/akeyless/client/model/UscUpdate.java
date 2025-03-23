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
import java.util.HashMap;
import java.util.Map;

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
 * uscUpdate is a command that updates a secret in a Universal Secrets Connector
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UscUpdate {
  public static final String SERIALIZED_NAME_BINARY_VALUE = "binary-value";
  @SerializedName(SERIALIZED_NAME_BINARY_VALUE)
  @javax.annotation.Nullable
  private Boolean binaryValue;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_SECRET_ID = "secret-id";
  @SerializedName(SERIALIZED_NAME_SECRET_ID)
  @javax.annotation.Nonnull
  private String secretId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private Map<String, String> tags = new HashMap<>();

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
  @javax.annotation.Nonnull
  private String uscName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nonnull
  private String value;

  public UscUpdate() {
  }

  public UscUpdate binaryValue(@javax.annotation.Nullable Boolean binaryValue) {
    this.binaryValue = binaryValue;
    return this;
  }

  /**
   * Use this option if the universal secrets value is a base64 encoded binary
   * @return binaryValue
   */
  @javax.annotation.Nullable
  public Boolean getBinaryValue() {
    return binaryValue;
  }

  public void setBinaryValue(@javax.annotation.Nullable Boolean binaryValue) {
    this.binaryValue = binaryValue;
  }


  public UscUpdate description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the universal secrets
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UscUpdate json(@javax.annotation.Nullable Boolean json) {
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


  public UscUpdate namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace (relevant for Hashi vault target)
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public UscUpdate secretId(@javax.annotation.Nonnull String secretId) {
    this.secretId = secretId;
    return this;
  }

  /**
   * The universal secrets id (or name, for AWS, Azure, K8s or Hashi vault targets) to update
   * @return secretId
   */
  @javax.annotation.Nonnull
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(@javax.annotation.Nonnull String secretId) {
    this.secretId = secretId;
  }


  public UscUpdate tags(@javax.annotation.Nullable Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public UscUpdate putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Tags for the universal secrets
   * @return tags
   */
  @javax.annotation.Nullable
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable Map<String, String> tags) {
    this.tags = tags;
  }


  public UscUpdate token(@javax.annotation.Nullable String token) {
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


  public UscUpdate uidToken(@javax.annotation.Nullable String uidToken) {
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


  public UscUpdate uscName(@javax.annotation.Nonnull String uscName) {
    this.uscName = uscName;
    return this;
  }

  /**
   * Name of the Universal Secrets Connector item
   * @return uscName
   */
  @javax.annotation.Nonnull
  public String getUscName() {
    return uscName;
  }

  public void setUscName(@javax.annotation.Nonnull String uscName) {
    this.uscName = uscName;
  }


  public UscUpdate value(@javax.annotation.Nonnull String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the universal secrets item, either text or base64 encoded binary
   * @return value
   */
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nonnull String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UscUpdate uscUpdate = (UscUpdate) o;
    return Objects.equals(this.binaryValue, uscUpdate.binaryValue) &&
        Objects.equals(this.description, uscUpdate.description) &&
        Objects.equals(this.json, uscUpdate.json) &&
        Objects.equals(this.namespace, uscUpdate.namespace) &&
        Objects.equals(this.secretId, uscUpdate.secretId) &&
        Objects.equals(this.tags, uscUpdate.tags) &&
        Objects.equals(this.token, uscUpdate.token) &&
        Objects.equals(this.uidToken, uscUpdate.uidToken) &&
        Objects.equals(this.uscName, uscUpdate.uscName) &&
        Objects.equals(this.value, uscUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryValue, description, json, namespace, secretId, tags, token, uidToken, uscName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UscUpdate {\n");
    sb.append("    binaryValue: ").append(toIndentedString(binaryValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uscName: ").append(toIndentedString(uscName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("binary-value");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("namespace");
    openapiFields.add("secret-id");
    openapiFields.add("tags");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("usc-name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secret-id");
    openapiRequiredFields.add("usc-name");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UscUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UscUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UscUpdate is not found in the empty JSON string", UscUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UscUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UscUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UscUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("secret-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret-id").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if (!jsonObj.get("usc-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usc-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usc-name").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UscUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UscUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UscUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UscUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<UscUpdate>() {
           @Override
           public void write(JsonWriter out, UscUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UscUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UscUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UscUpdate
   * @throws IOException if the JSON string is invalid with respect to UscUpdate
   */
  public static UscUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UscUpdate.class);
  }

  /**
   * Convert an instance of UscUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

