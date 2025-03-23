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
import java.util.HashMap;
import java.util.Map;

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
 * MigrationStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MigrationStatus {
  public static final String SERIALIZED_NAME_LAST_MESSAGES = "last_messages";
  @SerializedName(SERIALIZED_NAME_LAST_MESSAGES)
  @javax.annotation.Nullable
  private Map<String, String> lastMessages = new HashMap<>();

  public static final String SERIALIZED_NAME_LAST_REPORTS = "last_reports";
  @SerializedName(SERIALIZED_NAME_LAST_REPORTS)
  @javax.annotation.Nullable
  private Map<String, String> lastReports = new HashMap<>();

  public static final String SERIALIZED_NAME_LAST_STATUSES = "last_statuses";
  @SerializedName(SERIALIZED_NAME_LAST_STATUSES)
  @javax.annotation.Nullable
  private Map<String, String> lastStatuses = new HashMap<>();

  public MigrationStatus() {
  }

  public MigrationStatus lastMessages(@javax.annotation.Nullable Map<String, String> lastMessages) {
    this.lastMessages = lastMessages;
    return this;
  }

  public MigrationStatus putLastMessagesItem(String key, String lastMessagesItem) {
    if (this.lastMessages == null) {
      this.lastMessages = new HashMap<>();
    }
    this.lastMessages.put(key, lastMessagesItem);
    return this;
  }

  /**
   * Get lastMessages
   * @return lastMessages
   */
  @javax.annotation.Nullable
  public Map<String, String> getLastMessages() {
    return lastMessages;
  }

  public void setLastMessages(@javax.annotation.Nullable Map<String, String> lastMessages) {
    this.lastMessages = lastMessages;
  }


  public MigrationStatus lastReports(@javax.annotation.Nullable Map<String, String> lastReports) {
    this.lastReports = lastReports;
    return this;
  }

  public MigrationStatus putLastReportsItem(String key, String lastReportsItem) {
    if (this.lastReports == null) {
      this.lastReports = new HashMap<>();
    }
    this.lastReports.put(key, lastReportsItem);
    return this;
  }

  /**
   * Get lastReports
   * @return lastReports
   */
  @javax.annotation.Nullable
  public Map<String, String> getLastReports() {
    return lastReports;
  }

  public void setLastReports(@javax.annotation.Nullable Map<String, String> lastReports) {
    this.lastReports = lastReports;
  }


  public MigrationStatus lastStatuses(@javax.annotation.Nullable Map<String, String> lastStatuses) {
    this.lastStatuses = lastStatuses;
    return this;
  }

  public MigrationStatus putLastStatusesItem(String key, String lastStatusesItem) {
    if (this.lastStatuses == null) {
      this.lastStatuses = new HashMap<>();
    }
    this.lastStatuses.put(key, lastStatusesItem);
    return this;
  }

  /**
   * Get lastStatuses
   * @return lastStatuses
   */
  @javax.annotation.Nullable
  public Map<String, String> getLastStatuses() {
    return lastStatuses;
  }

  public void setLastStatuses(@javax.annotation.Nullable Map<String, String> lastStatuses) {
    this.lastStatuses = lastStatuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationStatus migrationStatus = (MigrationStatus) o;
    return Objects.equals(this.lastMessages, migrationStatus.lastMessages) &&
        Objects.equals(this.lastReports, migrationStatus.lastReports) &&
        Objects.equals(this.lastStatuses, migrationStatus.lastStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastMessages, lastReports, lastStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationStatus {\n");
    sb.append("    lastMessages: ").append(toIndentedString(lastMessages)).append("\n");
    sb.append("    lastReports: ").append(toIndentedString(lastReports)).append("\n");
    sb.append("    lastStatuses: ").append(toIndentedString(lastStatuses)).append("\n");
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
    openapiFields.add("last_messages");
    openapiFields.add("last_reports");
    openapiFields.add("last_statuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MigrationStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrationStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrationStatus is not found in the empty JSON string", MigrationStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MigrationStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrationStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrationStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrationStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrationStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrationStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrationStatus>() {
           @Override
           public void write(JsonWriter out, MigrationStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrationStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MigrationStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MigrationStatus
   * @throws IOException if the JSON string is invalid with respect to MigrationStatus
   */
  public static MigrationStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrationStatus.class);
  }

  /**
   * Convert an instance of MigrationStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

