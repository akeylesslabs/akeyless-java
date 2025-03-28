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
import io.akeyless.client.model.ConfigHash;
import io.akeyless.client.model.LastConfigChange;
import io.akeyless.client.model.LastStatusInfo;
import io.akeyless.client.model.RequiredActivity;
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
 * ConfigChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ConfigChange {
  public static final String SERIALIZED_NAME_CONFIG_HASH = "config_hash";
  @SerializedName(SERIALIZED_NAME_CONFIG_HASH)
  @javax.annotation.Nullable
  private ConfigHash configHash;

  public static final String SERIALIZED_NAME_LAST_CHANGE = "last_change";
  @SerializedName(SERIALIZED_NAME_LAST_CHANGE)
  @javax.annotation.Nullable
  private LastConfigChange lastChange;

  public static final String SERIALIZED_NAME_LAST_STATUS = "last_status";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS)
  @javax.annotation.Nullable
  private LastStatusInfo lastStatus;

  public static final String SERIALIZED_NAME_REQUIRED_ACTIVITY = "required_activity";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACTIVITY)
  @javax.annotation.Nullable
  private RequiredActivity requiredActivity;

  public static final String SERIALIZED_NAME_UPDATE_STAMP = "update_stamp";
  @SerializedName(SERIALIZED_NAME_UPDATE_STAMP)
  @javax.annotation.Nullable
  private Long updateStamp;

  public ConfigChange() {
  }

  public ConfigChange configHash(@javax.annotation.Nullable ConfigHash configHash) {
    this.configHash = configHash;
    return this;
  }

  /**
   * Get configHash
   * @return configHash
   */
  @javax.annotation.Nullable
  public ConfigHash getConfigHash() {
    return configHash;
  }

  public void setConfigHash(@javax.annotation.Nullable ConfigHash configHash) {
    this.configHash = configHash;
  }


  public ConfigChange lastChange(@javax.annotation.Nullable LastConfigChange lastChange) {
    this.lastChange = lastChange;
    return this;
  }

  /**
   * Get lastChange
   * @return lastChange
   */
  @javax.annotation.Nullable
  public LastConfigChange getLastChange() {
    return lastChange;
  }

  public void setLastChange(@javax.annotation.Nullable LastConfigChange lastChange) {
    this.lastChange = lastChange;
  }


  public ConfigChange lastStatus(@javax.annotation.Nullable LastStatusInfo lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

  /**
   * Get lastStatus
   * @return lastStatus
   */
  @javax.annotation.Nullable
  public LastStatusInfo getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(@javax.annotation.Nullable LastStatusInfo lastStatus) {
    this.lastStatus = lastStatus;
  }


  public ConfigChange requiredActivity(@javax.annotation.Nullable RequiredActivity requiredActivity) {
    this.requiredActivity = requiredActivity;
    return this;
  }

  /**
   * Get requiredActivity
   * @return requiredActivity
   */
  @javax.annotation.Nullable
  public RequiredActivity getRequiredActivity() {
    return requiredActivity;
  }

  public void setRequiredActivity(@javax.annotation.Nullable RequiredActivity requiredActivity) {
    this.requiredActivity = requiredActivity;
  }


  public ConfigChange updateStamp(@javax.annotation.Nullable Long updateStamp) {
    this.updateStamp = updateStamp;
    return this;
  }

  /**
   * Get updateStamp
   * @return updateStamp
   */
  @javax.annotation.Nullable
  public Long getUpdateStamp() {
    return updateStamp;
  }

  public void setUpdateStamp(@javax.annotation.Nullable Long updateStamp) {
    this.updateStamp = updateStamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigChange configChange = (ConfigChange) o;
    return Objects.equals(this.configHash, configChange.configHash) &&
        Objects.equals(this.lastChange, configChange.lastChange) &&
        Objects.equals(this.lastStatus, configChange.lastStatus) &&
        Objects.equals(this.requiredActivity, configChange.requiredActivity) &&
        Objects.equals(this.updateStamp, configChange.updateStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configHash, lastChange, lastStatus, requiredActivity, updateStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigChange {\n");
    sb.append("    configHash: ").append(toIndentedString(configHash)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    requiredActivity: ").append(toIndentedString(requiredActivity)).append("\n");
    sb.append("    updateStamp: ").append(toIndentedString(updateStamp)).append("\n");
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
    openapiFields.add("config_hash");
    openapiFields.add("last_change");
    openapiFields.add("last_status");
    openapiFields.add("required_activity");
    openapiFields.add("update_stamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigChange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigChange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigChange is not found in the empty JSON string", ConfigChange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigChange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigChange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config_hash`
      if (jsonObj.get("config_hash") != null && !jsonObj.get("config_hash").isJsonNull()) {
        ConfigHash.validateJsonElement(jsonObj.get("config_hash"));
      }
      // validate the optional field `last_change`
      if (jsonObj.get("last_change") != null && !jsonObj.get("last_change").isJsonNull()) {
        LastConfigChange.validateJsonElement(jsonObj.get("last_change"));
      }
      // validate the optional field `last_status`
      if (jsonObj.get("last_status") != null && !jsonObj.get("last_status").isJsonNull()) {
        LastStatusInfo.validateJsonElement(jsonObj.get("last_status"));
      }
      // validate the optional field `required_activity`
      if (jsonObj.get("required_activity") != null && !jsonObj.get("required_activity").isJsonNull()) {
        RequiredActivity.validateJsonElement(jsonObj.get("required_activity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigChange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigChange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigChange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigChange.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigChange>() {
           @Override
           public void write(JsonWriter out, ConfigChange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigChange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigChange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigChange
   * @throws IOException if the JSON string is invalid with respect to ConfigChange
   */
  public static ConfigChange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigChange.class);
  }

  /**
   * Convert an instance of ConfigChange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

