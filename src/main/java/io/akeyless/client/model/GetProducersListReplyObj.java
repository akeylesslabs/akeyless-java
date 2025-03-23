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
import io.akeyless.client.model.Producer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * GetProducersListReplyObj
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetProducersListReplyObj {
  public static final String SERIALIZED_NAME_PRODUCERS = "producers";
  @SerializedName(SERIALIZED_NAME_PRODUCERS)
  @javax.annotation.Nullable
  private List<Producer> producers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCERS_ERRORS = "producers_errors";
  @SerializedName(SERIALIZED_NAME_PRODUCERS_ERRORS)
  @javax.annotation.Nullable
  private Object producersErrors = null;

  public GetProducersListReplyObj() {
  }

  public GetProducersListReplyObj producers(@javax.annotation.Nullable List<Producer> producers) {
    this.producers = producers;
    return this;
  }

  public GetProducersListReplyObj addProducersItem(Producer producersItem) {
    if (this.producers == null) {
      this.producers = new ArrayList<>();
    }
    this.producers.add(producersItem);
    return this;
  }

  /**
   * Get producers
   * @return producers
   */
  @javax.annotation.Nullable
  public List<Producer> getProducers() {
    return producers;
  }

  public void setProducers(@javax.annotation.Nullable List<Producer> producers) {
    this.producers = producers;
  }


  public GetProducersListReplyObj producersErrors(@javax.annotation.Nullable Object producersErrors) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProducersListReplyObj getProducersListReplyObj = (GetProducersListReplyObj) o;
    return Objects.equals(this.producers, getProducersListReplyObj.producers) &&
        Objects.equals(this.producersErrors, getProducersListReplyObj.producersErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(producers, producersErrors);
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
    sb.append("class GetProducersListReplyObj {\n");
    sb.append("    producers: ").append(toIndentedString(producers)).append("\n");
    sb.append("    producersErrors: ").append(toIndentedString(producersErrors)).append("\n");
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
    openapiFields.add("producers");
    openapiFields.add("producers_errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProducersListReplyObj
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProducersListReplyObj.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProducersListReplyObj is not found in the empty JSON string", GetProducersListReplyObj.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProducersListReplyObj.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProducersListReplyObj` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("producers") != null && !jsonObj.get("producers").isJsonNull()) {
        JsonArray jsonArrayproducers = jsonObj.getAsJsonArray("producers");
        if (jsonArrayproducers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("producers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `producers` to be an array in the JSON string but got `%s`", jsonObj.get("producers").toString()));
          }

          // validate the optional field `producers` (array)
          for (int i = 0; i < jsonArrayproducers.size(); i++) {
            Producer.validateJsonElement(jsonArrayproducers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProducersListReplyObj.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProducersListReplyObj' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProducersListReplyObj> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProducersListReplyObj.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProducersListReplyObj>() {
           @Override
           public void write(JsonWriter out, GetProducersListReplyObj value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProducersListReplyObj read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProducersListReplyObj given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProducersListReplyObj
   * @throws IOException if the JSON string is invalid with respect to GetProducersListReplyObj
   */
  public static GetProducersListReplyObj fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProducersListReplyObj.class);
  }

  /**
   * Convert an instance of GetProducersListReplyObj to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

