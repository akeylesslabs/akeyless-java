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
import io.akeyless.client.model.KMIPClient;
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
 * KMIPClientListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KMIPClientListResponse {
  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  @javax.annotation.Nullable
  private List<KMIPClient> clients = new ArrayList<>();

  public KMIPClientListResponse() {
  }

  public KMIPClientListResponse clients(@javax.annotation.Nullable List<KMIPClient> clients) {
    this.clients = clients;
    return this;
  }

  public KMIPClientListResponse addClientsItem(KMIPClient clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

  /**
   * Get clients
   * @return clients
   */
  @javax.annotation.Nullable
  public List<KMIPClient> getClients() {
    return clients;
  }

  public void setClients(@javax.annotation.Nullable List<KMIPClient> clients) {
    this.clients = clients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KMIPClientListResponse kmIPClientListResponse = (KMIPClientListResponse) o;
    return Objects.equals(this.clients, kmIPClientListResponse.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KMIPClientListResponse {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
    openapiFields.add("clients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KMIPClientListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KMIPClientListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KMIPClientListResponse is not found in the empty JSON string", KMIPClientListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KMIPClientListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KMIPClientListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("clients") != null && !jsonObj.get("clients").isJsonNull()) {
        JsonArray jsonArrayclients = jsonObj.getAsJsonArray("clients");
        if (jsonArrayclients != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clients").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clients` to be an array in the JSON string but got `%s`", jsonObj.get("clients").toString()));
          }

          // validate the optional field `clients` (array)
          for (int i = 0; i < jsonArrayclients.size(); i++) {
            KMIPClient.validateJsonElement(jsonArrayclients.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KMIPClientListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KMIPClientListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KMIPClientListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KMIPClientListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KMIPClientListResponse>() {
           @Override
           public void write(JsonWriter out, KMIPClientListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KMIPClientListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KMIPClientListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KMIPClientListResponse
   * @throws IOException if the JSON string is invalid with respect to KMIPClientListResponse
   */
  public static KMIPClientListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KMIPClientListResponse.class);
  }

  /**
   * Convert an instance of KMIPClientListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

