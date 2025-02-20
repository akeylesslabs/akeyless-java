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
import java.time.OffsetDateTime;
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
 * GenerateAcmeEabOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GenerateAcmeEabOutput {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  @javax.annotation.Nullable
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  @javax.annotation.Nullable
  private String kid;

  public static final String SERIALIZED_NAME_MAC_KEY = "mac_key";
  @SerializedName(SERIALIZED_NAME_MAC_KEY)
  @javax.annotation.Nullable
  private String macKey;

  public GenerateAcmeEabOutput() {
  }

  public GenerateAcmeEabOutput expiresAt(@javax.annotation.Nullable OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(@javax.annotation.Nullable OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public GenerateAcmeEabOutput kid(@javax.annotation.Nullable String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
   */
  @javax.annotation.Nullable
  public String getKid() {
    return kid;
  }

  public void setKid(@javax.annotation.Nullable String kid) {
    this.kid = kid;
  }


  public GenerateAcmeEabOutput macKey(@javax.annotation.Nullable String macKey) {
    this.macKey = macKey;
    return this;
  }

  /**
   * Get macKey
   * @return macKey
   */
  @javax.annotation.Nullable
  public String getMacKey() {
    return macKey;
  }

  public void setMacKey(@javax.annotation.Nullable String macKey) {
    this.macKey = macKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateAcmeEabOutput generateAcmeEabOutput = (GenerateAcmeEabOutput) o;
    return Objects.equals(this.expiresAt, generateAcmeEabOutput.expiresAt) &&
        Objects.equals(this.kid, generateAcmeEabOutput.kid) &&
        Objects.equals(this.macKey, generateAcmeEabOutput.macKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, kid, macKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateAcmeEabOutput {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    macKey: ").append(toIndentedString(macKey)).append("\n");
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
    openapiFields.add("expires_at");
    openapiFields.add("kid");
    openapiFields.add("mac_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GenerateAcmeEabOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateAcmeEabOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateAcmeEabOutput is not found in the empty JSON string", GenerateAcmeEabOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateAcmeEabOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateAcmeEabOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("kid") != null && !jsonObj.get("kid").isJsonNull()) && !jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if ((jsonObj.get("mac_key") != null && !jsonObj.get("mac_key").isJsonNull()) && !jsonObj.get("mac_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateAcmeEabOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateAcmeEabOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateAcmeEabOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateAcmeEabOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateAcmeEabOutput>() {
           @Override
           public void write(JsonWriter out, GenerateAcmeEabOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateAcmeEabOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GenerateAcmeEabOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenerateAcmeEabOutput
   * @throws IOException if the JSON string is invalid with respect to GenerateAcmeEabOutput
   */
  public static GenerateAcmeEabOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateAcmeEabOutput.class);
  }

  /**
   * Convert an instance of GenerateAcmeEabOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

