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
 * KmipRenewServerCertificateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KmipRenewServerCertificateOutput {
  public static final String SERIALIZED_NAME_CA_CERT = "ca_cert";
  @SerializedName(SERIALIZED_NAME_CA_CERT)
  @javax.annotation.Nullable
  private String caCert;

  public KmipRenewServerCertificateOutput() {
  }

  public KmipRenewServerCertificateOutput caCert(@javax.annotation.Nullable String caCert) {
    this.caCert = caCert;
    return this;
  }

  /**
   * Get caCert
   * @return caCert
   */
  @javax.annotation.Nullable
  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(@javax.annotation.Nullable String caCert) {
    this.caCert = caCert;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmipRenewServerCertificateOutput kmipRenewServerCertificateOutput = (KmipRenewServerCertificateOutput) o;
    return Objects.equals(this.caCert, kmipRenewServerCertificateOutput.caCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmipRenewServerCertificateOutput {\n");
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
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
    openapiFields.add("ca_cert");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KmipRenewServerCertificateOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KmipRenewServerCertificateOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KmipRenewServerCertificateOutput is not found in the empty JSON string", KmipRenewServerCertificateOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KmipRenewServerCertificateOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KmipRenewServerCertificateOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ca_cert") != null && !jsonObj.get("ca_cert").isJsonNull()) && !jsonObj.get("ca_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ca_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ca_cert").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KmipRenewServerCertificateOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KmipRenewServerCertificateOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KmipRenewServerCertificateOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KmipRenewServerCertificateOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<KmipRenewServerCertificateOutput>() {
           @Override
           public void write(JsonWriter out, KmipRenewServerCertificateOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KmipRenewServerCertificateOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KmipRenewServerCertificateOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KmipRenewServerCertificateOutput
   * @throws IOException if the JSON string is invalid with respect to KmipRenewServerCertificateOutput
   */
  public static KmipRenewServerCertificateOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KmipRenewServerCertificateOutput.class);
  }

  /**
   * Convert an instance of KmipRenewServerCertificateOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

