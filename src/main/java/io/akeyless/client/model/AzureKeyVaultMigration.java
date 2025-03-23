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
import io.akeyless.client.model.AzurePayload;
import io.akeyless.client.model.MigrationGeneral;
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
 * AzureKeyVaultMigration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AzureKeyVaultMigration {
  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  @javax.annotation.Nullable
  private MigrationGeneral general;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private AzurePayload payload;

  public AzureKeyVaultMigration() {
  }

  public AzureKeyVaultMigration general(@javax.annotation.Nullable MigrationGeneral general) {
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


  public AzureKeyVaultMigration payload(@javax.annotation.Nullable AzurePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nullable
  public AzurePayload getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable AzurePayload payload) {
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
    AzureKeyVaultMigration azureKeyVaultMigration = (AzureKeyVaultMigration) o;
    return Objects.equals(this.general, azureKeyVaultMigration.general) &&
        Objects.equals(this.payload, azureKeyVaultMigration.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureKeyVaultMigration {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to AzureKeyVaultMigration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AzureKeyVaultMigration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AzureKeyVaultMigration is not found in the empty JSON string", AzureKeyVaultMigration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AzureKeyVaultMigration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AzureKeyVaultMigration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `general`
      if (jsonObj.get("general") != null && !jsonObj.get("general").isJsonNull()) {
        MigrationGeneral.validateJsonElement(jsonObj.get("general"));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        AzurePayload.validateJsonElement(jsonObj.get("payload"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AzureKeyVaultMigration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AzureKeyVaultMigration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AzureKeyVaultMigration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AzureKeyVaultMigration.class));

       return (TypeAdapter<T>) new TypeAdapter<AzureKeyVaultMigration>() {
           @Override
           public void write(JsonWriter out, AzureKeyVaultMigration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AzureKeyVaultMigration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AzureKeyVaultMigration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AzureKeyVaultMigration
   * @throws IOException if the JSON string is invalid with respect to AzureKeyVaultMigration
   */
  public static AzureKeyVaultMigration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AzureKeyVaultMigration.class);
  }

  /**
   * Convert an instance of AzureKeyVaultMigration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

