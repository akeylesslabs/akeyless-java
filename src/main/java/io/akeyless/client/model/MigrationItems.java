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
 * MigrationItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MigrationItems {
  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  @javax.annotation.Nullable
  private Long failed;

  public static final String SERIALIZED_NAME_MIGRATED = "migrated";
  @SerializedName(SERIALIZED_NAME_MIGRATED)
  @javax.annotation.Nullable
  private Long migrated;

  public static final String SERIALIZED_NAME_SKIPPED = "skipped";
  @SerializedName(SERIALIZED_NAME_SKIPPED)
  @javax.annotation.Nullable
  private Long skipped;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Long total;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  @javax.annotation.Nullable
  private Long updated;

  public MigrationItems() {
  }

  public MigrationItems failed(@javax.annotation.Nullable Long failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Get failed
   * @return failed
   */
  @javax.annotation.Nullable
  public Long getFailed() {
    return failed;
  }

  public void setFailed(@javax.annotation.Nullable Long failed) {
    this.failed = failed;
  }


  public MigrationItems migrated(@javax.annotation.Nullable Long migrated) {
    this.migrated = migrated;
    return this;
  }

  /**
   * Get migrated
   * @return migrated
   */
  @javax.annotation.Nullable
  public Long getMigrated() {
    return migrated;
  }

  public void setMigrated(@javax.annotation.Nullable Long migrated) {
    this.migrated = migrated;
  }


  public MigrationItems skipped(@javax.annotation.Nullable Long skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Get skipped
   * @return skipped
   */
  @javax.annotation.Nullable
  public Long getSkipped() {
    return skipped;
  }

  public void setSkipped(@javax.annotation.Nullable Long skipped) {
    this.skipped = skipped;
  }


  public MigrationItems total(@javax.annotation.Nullable Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Long total) {
    this.total = total;
  }


  public MigrationItems updated(@javax.annotation.Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(@javax.annotation.Nullable Long updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationItems migrationItems = (MigrationItems) o;
    return Objects.equals(this.failed, migrationItems.failed) &&
        Objects.equals(this.migrated, migrationItems.migrated) &&
        Objects.equals(this.skipped, migrationItems.skipped) &&
        Objects.equals(this.total, migrationItems.total) &&
        Objects.equals(this.updated, migrationItems.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, migrated, skipped, total, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationItems {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    migrated: ").append(toIndentedString(migrated)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("failed");
    openapiFields.add("migrated");
    openapiFields.add("skipped");
    openapiFields.add("total");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MigrationItems
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrationItems.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrationItems is not found in the empty JSON string", MigrationItems.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MigrationItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrationItems` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrationItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrationItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrationItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrationItems.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrationItems>() {
           @Override
           public void write(JsonWriter out, MigrationItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrationItems read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MigrationItems given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MigrationItems
   * @throws IOException if the JSON string is invalid with respect to MigrationItems
   */
  public static MigrationItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrationItems.class);
  }

  /**
   * Convert an instance of MigrationItems to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

