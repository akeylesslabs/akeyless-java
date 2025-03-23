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
import io.akeyless.client.model.DSProducerDetails;
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
 * GatewayCreateProducerLdapOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayCreateProducerLdapOutput {
  public static final String SERIALIZED_NAME_PRODUCER_DETAILS = "producer_details";
  @SerializedName(SERIALIZED_NAME_PRODUCER_DETAILS)
  @javax.annotation.Nullable
  private DSProducerDetails producerDetails;

  public GatewayCreateProducerLdapOutput() {
  }

  public GatewayCreateProducerLdapOutput producerDetails(@javax.annotation.Nullable DSProducerDetails producerDetails) {
    this.producerDetails = producerDetails;
    return this;
  }

  /**
   * Get producerDetails
   * @return producerDetails
   */
  @javax.annotation.Nullable
  public DSProducerDetails getProducerDetails() {
    return producerDetails;
  }

  public void setProducerDetails(@javax.annotation.Nullable DSProducerDetails producerDetails) {
    this.producerDetails = producerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerLdapOutput gatewayCreateProducerLdapOutput = (GatewayCreateProducerLdapOutput) o;
    return Objects.equals(this.producerDetails, gatewayCreateProducerLdapOutput.producerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerLdapOutput {\n");
    sb.append("    producerDetails: ").append(toIndentedString(producerDetails)).append("\n");
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
    openapiFields.add("producer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayCreateProducerLdapOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayCreateProducerLdapOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayCreateProducerLdapOutput is not found in the empty JSON string", GatewayCreateProducerLdapOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayCreateProducerLdapOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayCreateProducerLdapOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `producer_details`
      if (jsonObj.get("producer_details") != null && !jsonObj.get("producer_details").isJsonNull()) {
        DSProducerDetails.validateJsonElement(jsonObj.get("producer_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayCreateProducerLdapOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayCreateProducerLdapOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayCreateProducerLdapOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayCreateProducerLdapOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayCreateProducerLdapOutput>() {
           @Override
           public void write(JsonWriter out, GatewayCreateProducerLdapOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayCreateProducerLdapOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayCreateProducerLdapOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayCreateProducerLdapOutput
   * @throws IOException if the JSON string is invalid with respect to GatewayCreateProducerLdapOutput
   */
  public static GatewayCreateProducerLdapOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayCreateProducerLdapOutput.class);
  }

  /**
   * Convert an instance of GatewayCreateProducerLdapOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

