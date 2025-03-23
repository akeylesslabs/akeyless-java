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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * TargetNameWithHosts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetNameWithHosts {
  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  @javax.annotation.Nullable
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public TargetNameWithHosts() {
  }

  public TargetNameWithHosts hosts(@javax.annotation.Nullable List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public TargetNameWithHosts addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Get hosts
   * @return hosts
   */
  @javax.annotation.Nullable
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(@javax.annotation.Nullable List<String> hosts) {
    this.hosts = hosts;
  }


  public TargetNameWithHosts targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetNameWithHosts targetNameWithHosts = (TargetNameWithHosts) o;
    return Objects.equals(this.hosts, targetNameWithHosts.hosts) &&
        Objects.equals(this.targetName, targetNameWithHosts.targetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, targetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetNameWithHosts {\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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
    openapiFields.add("hosts");
    openapiFields.add("target_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetNameWithHosts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetNameWithHosts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetNameWithHosts is not found in the empty JSON string", TargetNameWithHosts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetNameWithHosts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetNameWithHosts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("hosts") != null && !jsonObj.get("hosts").isJsonNull() && !jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      if ((jsonObj.get("target_name") != null && !jsonObj.get("target_name").isJsonNull()) && !jsonObj.get("target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetNameWithHosts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetNameWithHosts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetNameWithHosts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetNameWithHosts.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetNameWithHosts>() {
           @Override
           public void write(JsonWriter out, TargetNameWithHosts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetNameWithHosts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetNameWithHosts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetNameWithHosts
   * @throws IOException if the JSON string is invalid with respect to TargetNameWithHosts
   */
  public static TargetNameWithHosts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetNameWithHosts.class);
  }

  /**
   * Convert an instance of TargetNameWithHosts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

