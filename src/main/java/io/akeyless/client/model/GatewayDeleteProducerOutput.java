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
 * GatewayDeleteProducerOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayDeleteProducerOutput {
  public static final String SERIALIZED_NAME_PRODUCER_NAME = "producer_name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_NAME)
  @javax.annotation.Nullable
  private String producerName;

  public GatewayDeleteProducerOutput() {
  }

  public GatewayDeleteProducerOutput producerName(@javax.annotation.Nullable String producerName) {
    this.producerName = producerName;
    return this;
  }

  /**
   * Get producerName
   * @return producerName
   */
  @javax.annotation.Nullable
  public String getProducerName() {
    return producerName;
  }

  public void setProducerName(@javax.annotation.Nullable String producerName) {
    this.producerName = producerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayDeleteProducerOutput gatewayDeleteProducerOutput = (GatewayDeleteProducerOutput) o;
    return Objects.equals(this.producerName, gatewayDeleteProducerOutput.producerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayDeleteProducerOutput {\n");
    sb.append("    producerName: ").append(toIndentedString(producerName)).append("\n");
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
    openapiFields.add("producer_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayDeleteProducerOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayDeleteProducerOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayDeleteProducerOutput is not found in the empty JSON string", GatewayDeleteProducerOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayDeleteProducerOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayDeleteProducerOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("producer_name") != null && !jsonObj.get("producer_name").isJsonNull()) && !jsonObj.get("producer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayDeleteProducerOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayDeleteProducerOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayDeleteProducerOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayDeleteProducerOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayDeleteProducerOutput>() {
           @Override
           public void write(JsonWriter out, GatewayDeleteProducerOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayDeleteProducerOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayDeleteProducerOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayDeleteProducerOutput
   * @throws IOException if the JSON string is invalid with respect to GatewayDeleteProducerOutput
   */
  public static GatewayDeleteProducerOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayDeleteProducerOutput.class);
  }

  /**
   * Convert an instance of GatewayDeleteProducerOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

