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
 * VerifyDataWithClassicKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VerifyDataWithClassicKey {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private String data;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  @javax.annotation.Nullable
  private String displayId;

  public static final String SERIALIZED_NAME_HASHED = "hashed";
  @SerializedName(SERIALIZED_NAME_HASHED)
  @javax.annotation.Nullable
  private Boolean hashed = false;

  public static final String SERIALIZED_NAME_HASHING_METHOD = "hashing-method";
  @SerializedName(SERIALIZED_NAME_HASHING_METHOD)
  @javax.annotation.Nullable
  private String hashingMethod = "SHA256";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  @javax.annotation.Nonnull
  private String signature;

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
  @javax.annotation.Nonnull
  private Integer version;

  public VerifyDataWithClassicKey() {
  }

  public VerifyDataWithClassicKey data(@javax.annotation.Nonnull String data) {
    this.data = data;
    return this;
  }

  /**
   * Data
   * @return data
   */
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull String data) {
    this.data = data;
  }


  public VerifyDataWithClassicKey displayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
    return this;
  }

  /**
   * The display id of the key to use in the verification process
   * @return displayId
   */
  @javax.annotation.Nullable
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
  }


  public VerifyDataWithClassicKey hashed(@javax.annotation.Nullable Boolean hashed) {
    this.hashed = hashed;
    return this;
  }

  /**
   * Defines whether the data should be hashed as part of the signing. If true, the data will not be hashed
   * @return hashed
   */
  @javax.annotation.Nullable
  public Boolean getHashed() {
    return hashed;
  }

  public void setHashed(@javax.annotation.Nullable Boolean hashed) {
    this.hashed = hashed;
  }


  public VerifyDataWithClassicKey hashingMethod(@javax.annotation.Nullable String hashingMethod) {
    this.hashingMethod = hashingMethod;
    return this;
  }

  /**
   * HashingMethod
   * @return hashingMethod
   */
  @javax.annotation.Nullable
  public String getHashingMethod() {
    return hashingMethod;
  }

  public void setHashingMethod(@javax.annotation.Nullable String hashingMethod) {
    this.hashingMethod = hashingMethod;
  }


  public VerifyDataWithClassicKey json(@javax.annotation.Nullable Boolean json) {
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


  public VerifyDataWithClassicKey name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the key to use in the verification process
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public VerifyDataWithClassicKey signature(@javax.annotation.Nonnull String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The data&#39;s signature in a Base64 format.
   * @return signature
   */
  @javax.annotation.Nonnull
  public String getSignature() {
    return signature;
  }

  public void setSignature(@javax.annotation.Nonnull String signature) {
    this.signature = signature;
  }


  public VerifyDataWithClassicKey token(@javax.annotation.Nullable String token) {
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


  public VerifyDataWithClassicKey uidToken(@javax.annotation.Nullable String uidToken) {
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


  public VerifyDataWithClassicKey version(@javax.annotation.Nonnull Integer version) {
    this.version = version;
    return this;
  }

  /**
   * classic key version
   * @return version
   */
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull Integer version) {
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
    VerifyDataWithClassicKey verifyDataWithClassicKey = (VerifyDataWithClassicKey) o;
    return Objects.equals(this.data, verifyDataWithClassicKey.data) &&
        Objects.equals(this.displayId, verifyDataWithClassicKey.displayId) &&
        Objects.equals(this.hashed, verifyDataWithClassicKey.hashed) &&
        Objects.equals(this.hashingMethod, verifyDataWithClassicKey.hashingMethod) &&
        Objects.equals(this.json, verifyDataWithClassicKey.json) &&
        Objects.equals(this.name, verifyDataWithClassicKey.name) &&
        Objects.equals(this.signature, verifyDataWithClassicKey.signature) &&
        Objects.equals(this.token, verifyDataWithClassicKey.token) &&
        Objects.equals(this.uidToken, verifyDataWithClassicKey.uidToken) &&
        Objects.equals(this.version, verifyDataWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, displayId, hashed, hashingMethod, json, name, signature, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyDataWithClassicKey {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashed: ").append(toIndentedString(hashed)).append("\n");
    sb.append("    hashingMethod: ").append(toIndentedString(hashingMethod)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("display-id");
    openapiFields.add("hashed");
    openapiFields.add("hashing-method");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("signature");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VerifyDataWithClassicKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerifyDataWithClassicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyDataWithClassicKey is not found in the empty JSON string", VerifyDataWithClassicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VerifyDataWithClassicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyDataWithClassicKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifyDataWithClassicKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("display-id") != null && !jsonObj.get("display-id").isJsonNull()) && !jsonObj.get("display-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display-id").toString()));
      }
      if ((jsonObj.get("hashing-method") != null && !jsonObj.get("hashing-method").isJsonNull()) && !jsonObj.get("hashing-method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashing-method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashing-method").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
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
       if (!VerifyDataWithClassicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyDataWithClassicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyDataWithClassicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyDataWithClassicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyDataWithClassicKey>() {
           @Override
           public void write(JsonWriter out, VerifyDataWithClassicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyDataWithClassicKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyDataWithClassicKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyDataWithClassicKey
   * @throws IOException if the JSON string is invalid with respect to VerifyDataWithClassicKey
   */
  public static VerifyDataWithClassicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyDataWithClassicKey.class);
  }

  /**
   * Convert an instance of VerifyDataWithClassicKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

