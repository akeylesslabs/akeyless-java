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
 * VerifyPKICertWithClassicKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VerifyPKICertWithClassicKey {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  @javax.annotation.Nonnull
  private String displayId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_PKI_CERT = "pki-cert";
  @SerializedName(SERIALIZED_NAME_PKI_CERT)
  @javax.annotation.Nonnull
  private String pkiCert;

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

  public VerifyPKICertWithClassicKey() {
  }

  public VerifyPKICertWithClassicKey displayId(@javax.annotation.Nonnull String displayId) {
    this.displayId = displayId;
    return this;
  }

  /**
   * The name of the key to use in the verify PKICert process
   * @return displayId
   */
  @javax.annotation.Nonnull
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(@javax.annotation.Nonnull String displayId) {
    this.displayId = displayId;
  }


  public VerifyPKICertWithClassicKey json(@javax.annotation.Nullable Boolean json) {
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


  public VerifyPKICertWithClassicKey pkiCert(@javax.annotation.Nonnull String pkiCert) {
    this.pkiCert = pkiCert;
    return this;
  }

  /**
   * PkiCert
   * @return pkiCert
   */
  @javax.annotation.Nonnull
  public String getPkiCert() {
    return pkiCert;
  }

  public void setPkiCert(@javax.annotation.Nonnull String pkiCert) {
    this.pkiCert = pkiCert;
  }


  public VerifyPKICertWithClassicKey token(@javax.annotation.Nullable String token) {
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


  public VerifyPKICertWithClassicKey uidToken(@javax.annotation.Nullable String uidToken) {
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


  public VerifyPKICertWithClassicKey version(@javax.annotation.Nonnull Integer version) {
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
    VerifyPKICertWithClassicKey verifyPKICertWithClassicKey = (VerifyPKICertWithClassicKey) o;
    return Objects.equals(this.displayId, verifyPKICertWithClassicKey.displayId) &&
        Objects.equals(this.json, verifyPKICertWithClassicKey.json) &&
        Objects.equals(this.pkiCert, verifyPKICertWithClassicKey.pkiCert) &&
        Objects.equals(this.token, verifyPKICertWithClassicKey.token) &&
        Objects.equals(this.uidToken, verifyPKICertWithClassicKey.uidToken) &&
        Objects.equals(this.version, verifyPKICertWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, json, pkiCert, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPKICertWithClassicKey {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    pkiCert: ").append(toIndentedString(pkiCert)).append("\n");
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
    openapiFields.add("display-id");
    openapiFields.add("json");
    openapiFields.add("pki-cert");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("display-id");
    openapiRequiredFields.add("pki-cert");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VerifyPKICertWithClassicKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerifyPKICertWithClassicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyPKICertWithClassicKey is not found in the empty JSON string", VerifyPKICertWithClassicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VerifyPKICertWithClassicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyPKICertWithClassicKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifyPKICertWithClassicKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("display-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display-id").toString()));
      }
      if (!jsonObj.get("pki-cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pki-cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pki-cert").toString()));
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
       if (!VerifyPKICertWithClassicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyPKICertWithClassicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyPKICertWithClassicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyPKICertWithClassicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyPKICertWithClassicKey>() {
           @Override
           public void write(JsonWriter out, VerifyPKICertWithClassicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyPKICertWithClassicKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyPKICertWithClassicKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyPKICertWithClassicKey
   * @throws IOException if the JSON string is invalid with respect to VerifyPKICertWithClassicKey
   */
  public static VerifyPKICertWithClassicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyPKICertWithClassicKey.class);
  }

  /**
   * Convert an instance of VerifyPKICertWithClassicKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

