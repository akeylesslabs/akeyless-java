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
 * LeadershipConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LeadershipConfigPart {
  public static final String SERIALIZED_NAME_OPEN_LEADERSHIP = "open_leadership";
  @SerializedName(SERIALIZED_NAME_OPEN_LEADERSHIP)
  @javax.annotation.Nullable
  private List<Integer> openLeadership = new ArrayList<>();

  public LeadershipConfigPart() {
  }

  public LeadershipConfigPart openLeadership(@javax.annotation.Nullable List<Integer> openLeadership) {
    this.openLeadership = openLeadership;
    return this;
  }

  public LeadershipConfigPart addOpenLeadershipItem(Integer openLeadershipItem) {
    if (this.openLeadership == null) {
      this.openLeadership = new ArrayList<>();
    }
    this.openLeadership.add(openLeadershipItem);
    return this;
  }

  /**
   * Get openLeadership
   * @return openLeadership
   */
  @javax.annotation.Nullable
  public List<Integer> getOpenLeadership() {
    return openLeadership;
  }

  public void setOpenLeadership(@javax.annotation.Nullable List<Integer> openLeadership) {
    this.openLeadership = openLeadership;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadershipConfigPart leadershipConfigPart = (LeadershipConfigPart) o;
    return Objects.equals(this.openLeadership, leadershipConfigPart.openLeadership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openLeadership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadershipConfigPart {\n");
    sb.append("    openLeadership: ").append(toIndentedString(openLeadership)).append("\n");
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
    openapiFields.add("open_leadership");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LeadershipConfigPart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LeadershipConfigPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeadershipConfigPart is not found in the empty JSON string", LeadershipConfigPart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LeadershipConfigPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LeadershipConfigPart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("open_leadership") != null && !jsonObj.get("open_leadership").isJsonNull() && !jsonObj.get("open_leadership").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_leadership` to be an array in the JSON string but got `%s`", jsonObj.get("open_leadership").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeadershipConfigPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeadershipConfigPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeadershipConfigPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeadershipConfigPart.class));

       return (TypeAdapter<T>) new TypeAdapter<LeadershipConfigPart>() {
           @Override
           public void write(JsonWriter out, LeadershipConfigPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LeadershipConfigPart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LeadershipConfigPart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LeadershipConfigPart
   * @throws IOException if the JSON string is invalid with respect to LeadershipConfigPart
   */
  public static LeadershipConfigPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeadershipConfigPart.class);
  }

  /**
   * Convert an instance of LeadershipConfigPart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

