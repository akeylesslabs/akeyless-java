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
import io.akeyless.client.model.MigrationStatus;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * LastStatusInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LastStatusInfo {
  public static final String SERIALIZED_NAME_MIGRATIONS_STATUS = "migrations_status";
  @SerializedName(SERIALIZED_NAME_MIGRATIONS_STATUS)
  @javax.annotation.Nullable
  private MigrationStatus migrationsStatus;

  public static final String SERIALIZED_NAME_PRODUCERS_ERRORS = "producers_errors";
  @SerializedName(SERIALIZED_NAME_PRODUCERS_ERRORS)
  @javax.annotation.Nullable
  private Object producersErrors = null;

  public static final String SERIALIZED_NAME_WAS_MIGRATIONS_COPIED_TO_NEW_TABLE = "was_migrations_copied_to_new_table";
  @SerializedName(SERIALIZED_NAME_WAS_MIGRATIONS_COPIED_TO_NEW_TABLE)
  @javax.annotation.Nullable
  private Boolean wasMigrationsCopiedToNewTable;

  public LastStatusInfo() {
  }

  public LastStatusInfo migrationsStatus(@javax.annotation.Nullable MigrationStatus migrationsStatus) {
    this.migrationsStatus = migrationsStatus;
    return this;
  }

  /**
   * Get migrationsStatus
   * @return migrationsStatus
   */
  @javax.annotation.Nullable
  public MigrationStatus getMigrationsStatus() {
    return migrationsStatus;
  }

  public void setMigrationsStatus(@javax.annotation.Nullable MigrationStatus migrationsStatus) {
    this.migrationsStatus = migrationsStatus;
  }


  public LastStatusInfo producersErrors(@javax.annotation.Nullable Object producersErrors) {
    this.producersErrors = producersErrors;
    return this;
  }

  /**
   * Get producersErrors
   * @return producersErrors
   */
  @javax.annotation.Nullable
  public Object getProducersErrors() {
    return producersErrors;
  }

  public void setProducersErrors(@javax.annotation.Nullable Object producersErrors) {
    this.producersErrors = producersErrors;
  }


  public LastStatusInfo wasMigrationsCopiedToNewTable(@javax.annotation.Nullable Boolean wasMigrationsCopiedToNewTable) {
    this.wasMigrationsCopiedToNewTable = wasMigrationsCopiedToNewTable;
    return this;
  }

  /**
   * flag to indicate migrationStatus copied to new table
   * @return wasMigrationsCopiedToNewTable
   */
  @javax.annotation.Nullable
  public Boolean getWasMigrationsCopiedToNewTable() {
    return wasMigrationsCopiedToNewTable;
  }

  public void setWasMigrationsCopiedToNewTable(@javax.annotation.Nullable Boolean wasMigrationsCopiedToNewTable) {
    this.wasMigrationsCopiedToNewTable = wasMigrationsCopiedToNewTable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastStatusInfo lastStatusInfo = (LastStatusInfo) o;
    return Objects.equals(this.migrationsStatus, lastStatusInfo.migrationsStatus) &&
        Objects.equals(this.producersErrors, lastStatusInfo.producersErrors) &&
        Objects.equals(this.wasMigrationsCopiedToNewTable, lastStatusInfo.wasMigrationsCopiedToNewTable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationsStatus, producersErrors, wasMigrationsCopiedToNewTable);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastStatusInfo {\n");
    sb.append("    migrationsStatus: ").append(toIndentedString(migrationsStatus)).append("\n");
    sb.append("    producersErrors: ").append(toIndentedString(producersErrors)).append("\n");
    sb.append("    wasMigrationsCopiedToNewTable: ").append(toIndentedString(wasMigrationsCopiedToNewTable)).append("\n");
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
    openapiFields.add("migrations_status");
    openapiFields.add("producers_errors");
    openapiFields.add("was_migrations_copied_to_new_table");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LastStatusInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LastStatusInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LastStatusInfo is not found in the empty JSON string", LastStatusInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LastStatusInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LastStatusInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `migrations_status`
      if (jsonObj.get("migrations_status") != null && !jsonObj.get("migrations_status").isJsonNull()) {
        MigrationStatus.validateJsonElement(jsonObj.get("migrations_status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LastStatusInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LastStatusInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LastStatusInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LastStatusInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LastStatusInfo>() {
           @Override
           public void write(JsonWriter out, LastStatusInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LastStatusInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LastStatusInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LastStatusInfo
   * @throws IOException if the JSON string is invalid with respect to LastStatusInfo
   */
  public static LastStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LastStatusInfo.class);
  }

  /**
   * Convert an instance of LastStatusInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

