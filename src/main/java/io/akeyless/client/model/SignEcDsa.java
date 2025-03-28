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
 * signEcDsa Calculates the signature of a given message using ECDSA and a sha hash algorithm matching the key size
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SignEcDsa {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  @javax.annotation.Nullable
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  @javax.annotation.Nullable
  private String displayId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  @javax.annotation.Nullable
  private Long itemId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  @javax.annotation.Nullable
  private String keyName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private String message;

  public static final String SERIALIZED_NAME_PREHASHED = "prehashed";
  @SerializedName(SERIALIZED_NAME_PREHASHED)
  @javax.annotation.Nullable
  private Boolean prehashed;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private Integer version;

  public SignEcDsa() {
  }

  public SignEcDsa accessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  /**
   * for personal password manager
   * @return accessibility
   */
  @javax.annotation.Nullable
  public String getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
  }


  public SignEcDsa displayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
    return this;
  }

  /**
   * The display id of the EC key to use for the signing process
   * @return displayId
   */
  @javax.annotation.Nullable
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
  }


  public SignEcDsa itemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The item id of the EC key to use for the signing process
   * @return itemId
   */
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
  }


  public SignEcDsa json(@javax.annotation.Nullable Boolean json) {
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


  public SignEcDsa keyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * The name of the EC key to use for the signing process
   * @return keyName
   */
  @javax.annotation.Nullable
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
  }


  public SignEcDsa message(@javax.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * The input message to sign in a base64 format
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }


  public SignEcDsa prehashed(@javax.annotation.Nullable Boolean prehashed) {
    this.prehashed = prehashed;
    return this;
  }

  /**
   * Markes that the message is already hashed
   * @return prehashed
   */
  @javax.annotation.Nullable
  public Boolean getPrehashed() {
    return prehashed;
  }

  public void setPrehashed(@javax.annotation.Nullable Boolean prehashed) {
    this.prehashed = prehashed;
  }


  public SignEcDsa token(@javax.annotation.Nullable String token) {
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


  public SignEcDsa uidToken(@javax.annotation.Nullable String uidToken) {
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


  public SignEcDsa version(@javax.annotation.Nullable Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the key to use for signing
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignEcDsa signEcDsa = (SignEcDsa) o;
    return Objects.equals(this.accessibility, signEcDsa.accessibility) &&
        Objects.equals(this.displayId, signEcDsa.displayId) &&
        Objects.equals(this.itemId, signEcDsa.itemId) &&
        Objects.equals(this.json, signEcDsa.json) &&
        Objects.equals(this.keyName, signEcDsa.keyName) &&
        Objects.equals(this.message, signEcDsa.message) &&
        Objects.equals(this.prehashed, signEcDsa.prehashed) &&
        Objects.equals(this.token, signEcDsa.token) &&
        Objects.equals(this.uidToken, signEcDsa.uidToken) &&
        Objects.equals(this.version, signEcDsa.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, displayId, itemId, json, keyName, message, prehashed, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignEcDsa {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    prehashed: ").append(toIndentedString(prehashed)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("accessibility");
    openapiFields.add("display-id");
    openapiFields.add("item-id");
    openapiFields.add("json");
    openapiFields.add("key-name");
    openapiFields.add("message");
    openapiFields.add("prehashed");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SignEcDsa
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SignEcDsa.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignEcDsa is not found in the empty JSON string", SignEcDsa.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SignEcDsa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignEcDsa` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignEcDsa.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accessibility") != null && !jsonObj.get("accessibility").isJsonNull()) && !jsonObj.get("accessibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessibility").toString()));
      }
      if ((jsonObj.get("display-id") != null && !jsonObj.get("display-id").isJsonNull()) && !jsonObj.get("display-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display-id").toString()));
      }
      if ((jsonObj.get("key-name") != null && !jsonObj.get("key-name").isJsonNull()) && !jsonObj.get("key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key-name").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
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
       if (!SignEcDsa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignEcDsa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignEcDsa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignEcDsa.class));

       return (TypeAdapter<T>) new TypeAdapter<SignEcDsa>() {
           @Override
           public void write(JsonWriter out, SignEcDsa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignEcDsa read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SignEcDsa given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SignEcDsa
   * @throws IOException if the JSON string is invalid with respect to SignEcDsa
   */
  public static SignEcDsa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignEcDsa.class);
  }

  /**
   * Convert an instance of SignEcDsa to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

