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
 * KerberosAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KerberosAccessRules {
  public static final String SERIALIZED_NAME_SIGN_PUBLIC_KEY = "sign_public_key";
  @SerializedName(SERIALIZED_NAME_SIGN_PUBLIC_KEY)
  @javax.annotation.Nullable
  private String signPublicKey;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  @javax.annotation.Nullable
  private String uniqueIdentifier;

  public KerberosAccessRules() {
  }

  public KerberosAccessRules signPublicKey(@javax.annotation.Nullable String signPublicKey) {
    this.signPublicKey = signPublicKey;
    return this;
  }

  /**
   * Get signPublicKey
   * @return signPublicKey
   */
  @javax.annotation.Nullable
  public String getSignPublicKey() {
    return signPublicKey;
  }

  public void setSignPublicKey(@javax.annotation.Nullable String signPublicKey) {
    this.signPublicKey = signPublicKey;
  }


  public KerberosAccessRules uniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * Get uniqueIdentifier
   * @return uniqueIdentifier
   */
  @javax.annotation.Nullable
  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosAccessRules kerberosAccessRules = (KerberosAccessRules) o;
    return Objects.equals(this.signPublicKey, kerberosAccessRules.signPublicKey) &&
        Objects.equals(this.uniqueIdentifier, kerberosAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signPublicKey, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosAccessRules {\n");
    sb.append("    signPublicKey: ").append(toIndentedString(signPublicKey)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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
    openapiFields.add("sign_public_key");
    openapiFields.add("unique_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KerberosAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KerberosAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KerberosAccessRules is not found in the empty JSON string", KerberosAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KerberosAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KerberosAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sign_public_key") != null && !jsonObj.get("sign_public_key").isJsonNull()) && !jsonObj.get("sign_public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_public_key").toString()));
      }
      if ((jsonObj.get("unique_identifier") != null && !jsonObj.get("unique_identifier").isJsonNull()) && !jsonObj.get("unique_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KerberosAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KerberosAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KerberosAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KerberosAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<KerberosAccessRules>() {
           @Override
           public void write(JsonWriter out, KerberosAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KerberosAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KerberosAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KerberosAccessRules
   * @throws IOException if the JSON string is invalid with respect to KerberosAccessRules
   */
  public static KerberosAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KerberosAccessRules.class);
  }

  /**
   * Convert an instance of KerberosAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

