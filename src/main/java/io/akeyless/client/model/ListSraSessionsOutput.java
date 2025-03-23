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
import io.akeyless.client.model.GatewayNameInfo;
import io.akeyless.client.model.SraSessionEntryOut;
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
 * ListSraSessionsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ListSraSessionsOutput {
  public static final String SERIALIZED_NAME_ALLOWED_GATEWAYS = "allowed_gateways";
  @SerializedName(SERIALIZED_NAME_ALLOWED_GATEWAYS)
  @javax.annotation.Nullable
  private List<GatewayNameInfo> allowedGateways = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  @javax.annotation.Nullable
  private String nextPage;

  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  @javax.annotation.Nullable
  private List<SraSessionEntryOut> sessions = new ArrayList<>();

  public ListSraSessionsOutput() {
  }

  public ListSraSessionsOutput allowedGateways(@javax.annotation.Nullable List<GatewayNameInfo> allowedGateways) {
    this.allowedGateways = allowedGateways;
    return this;
  }

  public ListSraSessionsOutput addAllowedGatewaysItem(GatewayNameInfo allowedGatewaysItem) {
    if (this.allowedGateways == null) {
      this.allowedGateways = new ArrayList<>();
    }
    this.allowedGateways.add(allowedGatewaysItem);
    return this;
  }

  /**
   * Get allowedGateways
   * @return allowedGateways
   */
  @javax.annotation.Nullable
  public List<GatewayNameInfo> getAllowedGateways() {
    return allowedGateways;
  }

  public void setAllowedGateways(@javax.annotation.Nullable List<GatewayNameInfo> allowedGateways) {
    this.allowedGateways = allowedGateways;
  }


  public ListSraSessionsOutput nextPage(@javax.annotation.Nullable String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
   */
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(@javax.annotation.Nullable String nextPage) {
    this.nextPage = nextPage;
  }


  public ListSraSessionsOutput sessions(@javax.annotation.Nullable List<SraSessionEntryOut> sessions) {
    this.sessions = sessions;
    return this;
  }

  public ListSraSessionsOutput addSessionsItem(SraSessionEntryOut sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

  /**
   * Get sessions
   * @return sessions
   */
  @javax.annotation.Nullable
  public List<SraSessionEntryOut> getSessions() {
    return sessions;
  }

  public void setSessions(@javax.annotation.Nullable List<SraSessionEntryOut> sessions) {
    this.sessions = sessions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSraSessionsOutput listSraSessionsOutput = (ListSraSessionsOutput) o;
    return Objects.equals(this.allowedGateways, listSraSessionsOutput.allowedGateways) &&
        Objects.equals(this.nextPage, listSraSessionsOutput.nextPage) &&
        Objects.equals(this.sessions, listSraSessionsOutput.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedGateways, nextPage, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSraSessionsOutput {\n");
    sb.append("    allowedGateways: ").append(toIndentedString(allowedGateways)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
    openapiFields.add("allowed_gateways");
    openapiFields.add("next_page");
    openapiFields.add("sessions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListSraSessionsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListSraSessionsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSraSessionsOutput is not found in the empty JSON string", ListSraSessionsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListSraSessionsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSraSessionsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("allowed_gateways") != null && !jsonObj.get("allowed_gateways").isJsonNull()) {
        JsonArray jsonArrayallowedGateways = jsonObj.getAsJsonArray("allowed_gateways");
        if (jsonArrayallowedGateways != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allowed_gateways").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowed_gateways` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_gateways").toString()));
          }

          // validate the optional field `allowed_gateways` (array)
          for (int i = 0; i < jsonArrayallowedGateways.size(); i++) {
            GatewayNameInfo.validateJsonElement(jsonArrayallowedGateways.get(i));
          };
        }
      }
      if ((jsonObj.get("next_page") != null && !jsonObj.get("next_page").isJsonNull()) && !jsonObj.get("next_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page").toString()));
      }
      if (jsonObj.get("sessions") != null && !jsonObj.get("sessions").isJsonNull()) {
        JsonArray jsonArraysessions = jsonObj.getAsJsonArray("sessions");
        if (jsonArraysessions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sessions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sessions` to be an array in the JSON string but got `%s`", jsonObj.get("sessions").toString()));
          }

          // validate the optional field `sessions` (array)
          for (int i = 0; i < jsonArraysessions.size(); i++) {
            SraSessionEntryOut.validateJsonElement(jsonArraysessions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListSraSessionsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSraSessionsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSraSessionsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSraSessionsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSraSessionsOutput>() {
           @Override
           public void write(JsonWriter out, ListSraSessionsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSraSessionsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListSraSessionsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListSraSessionsOutput
   * @throws IOException if the JSON string is invalid with respect to ListSraSessionsOutput
   */
  public static ListSraSessionsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSraSessionsOutput.class);
  }

  /**
   * Convert an instance of ListSraSessionsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

