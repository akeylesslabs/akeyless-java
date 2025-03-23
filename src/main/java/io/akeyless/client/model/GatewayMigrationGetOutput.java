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
import io.akeyless.client.model.MigrationsConfigPart;
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
 * GatewayMigrationGetOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayMigrationGetOutput {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  @javax.annotation.Nullable
  private MigrationsConfigPart body;

  public GatewayMigrationGetOutput() {
  }

  public GatewayMigrationGetOutput body(@javax.annotation.Nullable MigrationsConfigPart body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @javax.annotation.Nullable
  public MigrationsConfigPart getBody() {
    return body;
  }

  public void setBody(@javax.annotation.Nullable MigrationsConfigPart body) {
    this.body = body;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayMigrationGetOutput gatewayMigrationGetOutput = (GatewayMigrationGetOutput) o;
    return Objects.equals(this.body, gatewayMigrationGetOutput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayMigrationGetOutput {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
    openapiFields.add("body");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayMigrationGetOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayMigrationGetOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayMigrationGetOutput is not found in the empty JSON string", GatewayMigrationGetOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayMigrationGetOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayMigrationGetOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `body`
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) {
        MigrationsConfigPart.validateJsonElement(jsonObj.get("body"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayMigrationGetOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayMigrationGetOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayMigrationGetOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayMigrationGetOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayMigrationGetOutput>() {
           @Override
           public void write(JsonWriter out, GatewayMigrationGetOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayMigrationGetOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayMigrationGetOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayMigrationGetOutput
   * @throws IOException if the JSON string is invalid with respect to GatewayMigrationGetOutput
   */
  public static GatewayMigrationGetOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayMigrationGetOutput.class);
  }

  /**
   * Convert an instance of GatewayMigrationGetOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

