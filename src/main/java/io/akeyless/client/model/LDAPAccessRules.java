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
 * LDAPAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LDAPAccessRules {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  @javax.annotation.Nullable
  private String alg;

  public static final String SERIALIZED_NAME_GEN_KEY_PAIR = "gen_key_pair";
  @SerializedName(SERIALIZED_NAME_GEN_KEY_PAIR)
  @javax.annotation.Nullable
  private String genKeyPair;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  @javax.annotation.Nullable
  private String uniqueIdentifier;

  public LDAPAccessRules() {
  }

  public LDAPAccessRules alg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   */
  @javax.annotation.Nullable
  public String getAlg() {
    return alg;
  }

  public void setAlg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
  }


  public LDAPAccessRules genKeyPair(@javax.annotation.Nullable String genKeyPair) {
    this.genKeyPair = genKeyPair;
    return this;
  }

  /**
   * Generate public/private key (the private key is required for the LDAP Auth Config in the Akeyless Gateway)
   * @return genKeyPair
   */
  @javax.annotation.Nullable
  public String getGenKeyPair() {
    return genKeyPair;
  }

  public void setGenKeyPair(@javax.annotation.Nullable String genKeyPair) {
    this.genKeyPair = genKeyPair;
  }


  public LDAPAccessRules key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The public key value of LDAP.
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public LDAPAccessRules uniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * A unique identifier to distinguish different users
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
    LDAPAccessRules ldAPAccessRules = (LDAPAccessRules) o;
    return Objects.equals(this.alg, ldAPAccessRules.alg) &&
        Objects.equals(this.genKeyPair, ldAPAccessRules.genKeyPair) &&
        Objects.equals(this.key, ldAPAccessRules.key) &&
        Objects.equals(this.uniqueIdentifier, ldAPAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, genKeyPair, key, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPAccessRules {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    genKeyPair: ").append(toIndentedString(genKeyPair)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("alg");
    openapiFields.add("gen_key_pair");
    openapiFields.add("key");
    openapiFields.add("unique_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LDAPAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LDAPAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LDAPAccessRules is not found in the empty JSON string", LDAPAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LDAPAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LDAPAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alg") != null && !jsonObj.get("alg").isJsonNull()) && !jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if ((jsonObj.get("gen_key_pair") != null && !jsonObj.get("gen_key_pair").isJsonNull()) && !jsonObj.get("gen_key_pair").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gen_key_pair` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gen_key_pair").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("unique_identifier") != null && !jsonObj.get("unique_identifier").isJsonNull()) && !jsonObj.get("unique_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LDAPAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LDAPAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LDAPAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LDAPAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<LDAPAccessRules>() {
           @Override
           public void write(JsonWriter out, LDAPAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LDAPAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LDAPAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LDAPAccessRules
   * @throws IOException if the JSON string is invalid with respect to LDAPAccessRules
   */
  public static LDAPAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LDAPAccessRules.class);
  }

  /**
   * Convert an instance of LDAPAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

