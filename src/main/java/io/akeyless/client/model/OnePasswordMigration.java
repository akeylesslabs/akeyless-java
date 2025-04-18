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
import io.akeyless.client.model.MigrationGeneral;
import io.akeyless.client.model.OnePasswordPayload;
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
 * OnePasswordMigration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class OnePasswordMigration {
  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  @javax.annotation.Nullable
  private MigrationGeneral general;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private OnePasswordPayload payload;

  public OnePasswordMigration() {
  }

  public OnePasswordMigration general(@javax.annotation.Nullable MigrationGeneral general) {
    this.general = general;
    return this;
  }

  /**
   * Get general
   * @return general
   */
  @javax.annotation.Nullable
  public MigrationGeneral getGeneral() {
    return general;
  }

  public void setGeneral(@javax.annotation.Nullable MigrationGeneral general) {
    this.general = general;
  }


  public OnePasswordMigration payload(@javax.annotation.Nullable OnePasswordPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nullable
  public OnePasswordPayload getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable OnePasswordPayload payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnePasswordMigration onePasswordMigration = (OnePasswordMigration) o;
    return Objects.equals(this.general, onePasswordMigration.general) &&
        Objects.equals(this.payload, onePasswordMigration.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnePasswordMigration {\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("general");
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnePasswordMigration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnePasswordMigration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnePasswordMigration is not found in the empty JSON string", OnePasswordMigration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnePasswordMigration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnePasswordMigration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `general`
      if (jsonObj.get("general") != null && !jsonObj.get("general").isJsonNull()) {
        MigrationGeneral.validateJsonElement(jsonObj.get("general"));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        OnePasswordPayload.validateJsonElement(jsonObj.get("payload"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnePasswordMigration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnePasswordMigration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnePasswordMigration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnePasswordMigration.class));

       return (TypeAdapter<T>) new TypeAdapter<OnePasswordMigration>() {
           @Override
           public void write(JsonWriter out, OnePasswordMigration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnePasswordMigration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnePasswordMigration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnePasswordMigration
   * @throws IOException if the JSON string is invalid with respect to OnePasswordMigration
   */
  public static OnePasswordMigration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnePasswordMigration.class);
  }

  /**
   * Convert an instance of OnePasswordMigration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

