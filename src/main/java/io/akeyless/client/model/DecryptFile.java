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
 * DecryptFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DecryptFile {
  public static final String SERIALIZED_NAME_CYPHERTEXT_HEADER = "cyphertext-header";
  @SerializedName(SERIALIZED_NAME_CYPHERTEXT_HEADER)
  @javax.annotation.Nullable
  private String cyphertextHeader;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  @javax.annotation.Nullable
  private String displayId;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  @javax.annotation.Nonnull
  private String in;

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
  @javax.annotation.Nonnull
  private String keyName;

  public static final String SERIALIZED_NAME_OUT = "out";
  @SerializedName(SERIALIZED_NAME_OUT)
  @javax.annotation.Nullable
  private String out;

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

  public DecryptFile() {
  }

  public DecryptFile cyphertextHeader(@javax.annotation.Nullable String cyphertextHeader) {
    this.cyphertextHeader = cyphertextHeader;
    return this;
  }

  /**
   * Get cyphertextHeader
   * @return cyphertextHeader
   */
  @javax.annotation.Nullable
  public String getCyphertextHeader() {
    return cyphertextHeader;
  }

  public void setCyphertextHeader(@javax.annotation.Nullable String cyphertextHeader) {
    this.cyphertextHeader = cyphertextHeader;
  }


  public DecryptFile displayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
    return this;
  }

  /**
   * The display id of the key to use in the decryption process
   * @return displayId
   */
  @javax.annotation.Nullable
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(@javax.annotation.Nullable String displayId) {
    this.displayId = displayId;
  }


  public DecryptFile in(@javax.annotation.Nonnull String in) {
    this.in = in;
    return this;
  }

  /**
   * Path to the file to be decrypted. If not provided, the content will be taken from stdin
   * @return in
   */
  @javax.annotation.Nonnull
  public String getIn() {
    return in;
  }

  public void setIn(@javax.annotation.Nonnull String in) {
    this.in = in;
  }


  public DecryptFile itemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The item id of the key to use in the decryption process
   * @return itemId
   */
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
  }


  public DecryptFile json(@javax.annotation.Nullable Boolean json) {
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


  public DecryptFile keyName(@javax.annotation.Nonnull String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * The name of the key to use in the decryption process
   * @return keyName
   */
  @javax.annotation.Nonnull
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(@javax.annotation.Nonnull String keyName) {
    this.keyName = keyName;
  }


  public DecryptFile out(@javax.annotation.Nullable String out) {
    this.out = out;
    return this;
  }

  /**
   * Path to the output file. If not provided, the output will be sent to stdout
   * @return out
   */
  @javax.annotation.Nullable
  public String getOut() {
    return out;
  }

  public void setOut(@javax.annotation.Nullable String out) {
    this.out = out;
  }


  public DecryptFile token(@javax.annotation.Nullable String token) {
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


  public DecryptFile uidToken(@javax.annotation.Nullable String uidToken) {
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


  public DecryptFile version(@javax.annotation.Nullable Integer version) {
    this.version = version;
    return this;
  }

  /**
   * key version (relevant only for classic key)
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
    DecryptFile decryptFile = (DecryptFile) o;
    return Objects.equals(this.cyphertextHeader, decryptFile.cyphertextHeader) &&
        Objects.equals(this.displayId, decryptFile.displayId) &&
        Objects.equals(this.in, decryptFile.in) &&
        Objects.equals(this.itemId, decryptFile.itemId) &&
        Objects.equals(this.json, decryptFile.json) &&
        Objects.equals(this.keyName, decryptFile.keyName) &&
        Objects.equals(this.out, decryptFile.out) &&
        Objects.equals(this.token, decryptFile.token) &&
        Objects.equals(this.uidToken, decryptFile.uidToken) &&
        Objects.equals(this.version, decryptFile.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cyphertextHeader, displayId, in, itemId, json, keyName, out, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptFile {\n");
    sb.append("    cyphertextHeader: ").append(toIndentedString(cyphertextHeader)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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
    openapiFields.add("cyphertext-header");
    openapiFields.add("display-id");
    openapiFields.add("in");
    openapiFields.add("item-id");
    openapiFields.add("json");
    openapiFields.add("key-name");
    openapiFields.add("out");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("in");
    openapiRequiredFields.add("key-name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DecryptFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DecryptFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecryptFile is not found in the empty JSON string", DecryptFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DecryptFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecryptFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecryptFile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cyphertext-header") != null && !jsonObj.get("cyphertext-header").isJsonNull()) && !jsonObj.get("cyphertext-header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cyphertext-header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cyphertext-header").toString()));
      }
      if ((jsonObj.get("display-id") != null && !jsonObj.get("display-id").isJsonNull()) && !jsonObj.get("display-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display-id").toString()));
      }
      if (!jsonObj.get("in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in").toString()));
      }
      if (!jsonObj.get("key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key-name").toString()));
      }
      if ((jsonObj.get("out") != null && !jsonObj.get("out").isJsonNull()) && !jsonObj.get("out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out").toString()));
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
       if (!DecryptFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecryptFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecryptFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecryptFile.class));

       return (TypeAdapter<T>) new TypeAdapter<DecryptFile>() {
           @Override
           public void write(JsonWriter out, DecryptFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecryptFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DecryptFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DecryptFile
   * @throws IOException if the JSON string is invalid with respect to DecryptFile
   */
  public static DecryptFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecryptFile.class);
  }

  /**
   * Convert an instance of DecryptFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

