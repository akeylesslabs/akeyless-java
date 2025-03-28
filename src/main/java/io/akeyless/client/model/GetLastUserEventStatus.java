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
 * GetLastUserEventStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetLastUserEventStatus {
  public static final String SERIALIZED_NAME_EVENT_SOURCE = "event-source";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  @javax.annotation.Nullable
  private String eventSource;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event-type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  @javax.annotation.Nonnull
  private String eventType;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item-name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  @javax.annotation.Nonnull
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item-type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  @javax.annotation.Nonnull
  private String itemType;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_TIME_BACK = "time-back";
  @SerializedName(SERIALIZED_NAME_TIME_BACK)
  @javax.annotation.Nullable
  private String timeBack;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GetLastUserEventStatus() {
  }

  public GetLastUserEventStatus eventSource(@javax.annotation.Nullable String eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * Get eventSource
   * @return eventSource
   */
  @javax.annotation.Nullable
  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(@javax.annotation.Nullable String eventSource) {
    this.eventSource = eventSource;
  }


  public GetLastUserEventStatus eventType(@javax.annotation.Nonnull String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  @javax.annotation.Nonnull
  public String getEventType() {
    return eventType;
  }

  public void setEventType(@javax.annotation.Nonnull String eventType) {
    this.eventType = eventType;
  }


  public GetLastUserEventStatus itemName(@javax.annotation.Nonnull String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Event item name
   * @return itemName
   */
  @javax.annotation.Nonnull
  public String getItemName() {
    return itemName;
  }

  public void setItemName(@javax.annotation.Nonnull String itemName) {
    this.itemName = itemName;
  }


  public GetLastUserEventStatus itemType(@javax.annotation.Nonnull String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Event item type can be either \&quot;target\&quot; or type of item eg \&quot;static_secret\&quot;/\&quot;dynamic_secret\&quot; To get type of some item run &#x60;akeyless describe-item -n {ITEM_NAME} --jq-expression .item_type&#x60;
   * @return itemType
   */
  @javax.annotation.Nonnull
  public String getItemType() {
    return itemType;
  }

  public void setItemType(@javax.annotation.Nonnull String itemType) {
    this.itemType = itemType;
  }


  public GetLastUserEventStatus json(@javax.annotation.Nullable Boolean json) {
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


  public GetLastUserEventStatus timeBack(@javax.annotation.Nullable String timeBack) {
    this.timeBack = timeBack;
    return this;
  }

  /**
   * The time back to search the event, for example if the value is \&quot;5m\&quot; we will return the last user event issued in the last 5 minutes. By default, we will search without any time boundary.
   * @return timeBack
   */
  @javax.annotation.Nullable
  public String getTimeBack() {
    return timeBack;
  }

  public void setTimeBack(@javax.annotation.Nullable String timeBack) {
    this.timeBack = timeBack;
  }


  public GetLastUserEventStatus token(@javax.annotation.Nullable String token) {
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


  public GetLastUserEventStatus uidToken(@javax.annotation.Nullable String uidToken) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLastUserEventStatus getLastUserEventStatus = (GetLastUserEventStatus) o;
    return Objects.equals(this.eventSource, getLastUserEventStatus.eventSource) &&
        Objects.equals(this.eventType, getLastUserEventStatus.eventType) &&
        Objects.equals(this.itemName, getLastUserEventStatus.itemName) &&
        Objects.equals(this.itemType, getLastUserEventStatus.itemType) &&
        Objects.equals(this.json, getLastUserEventStatus.json) &&
        Objects.equals(this.timeBack, getLastUserEventStatus.timeBack) &&
        Objects.equals(this.token, getLastUserEventStatus.token) &&
        Objects.equals(this.uidToken, getLastUserEventStatus.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSource, eventType, itemName, itemType, json, timeBack, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLastUserEventStatus {\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    timeBack: ").append(toIndentedString(timeBack)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("event-source");
    openapiFields.add("event-type");
    openapiFields.add("item-name");
    openapiFields.add("item-type");
    openapiFields.add("json");
    openapiFields.add("time-back");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event-type");
    openapiRequiredFields.add("item-name");
    openapiRequiredFields.add("item-type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLastUserEventStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLastUserEventStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLastUserEventStatus is not found in the empty JSON string", GetLastUserEventStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLastUserEventStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLastUserEventStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetLastUserEventStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("event-source") != null && !jsonObj.get("event-source").isJsonNull()) && !jsonObj.get("event-source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event-source").toString()));
      }
      if (!jsonObj.get("event-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event-type").toString()));
      }
      if (!jsonObj.get("item-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item-name").toString()));
      }
      if (!jsonObj.get("item-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item-type").toString()));
      }
      if ((jsonObj.get("time-back") != null && !jsonObj.get("time-back").isJsonNull()) && !jsonObj.get("time-back").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time-back` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time-back").toString()));
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
       if (!GetLastUserEventStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLastUserEventStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLastUserEventStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLastUserEventStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLastUserEventStatus>() {
           @Override
           public void write(JsonWriter out, GetLastUserEventStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLastUserEventStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLastUserEventStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLastUserEventStatus
   * @throws IOException if the JSON string is invalid with respect to GetLastUserEventStatus
   */
  public static GetLastUserEventStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLastUserEventStatus.class);
  }

  /**
   * Convert an instance of GetLastUserEventStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

