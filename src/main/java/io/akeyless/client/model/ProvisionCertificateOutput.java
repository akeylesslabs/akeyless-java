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
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ProvisionCertificateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ProvisionCertificateOutput {
  public static final String SERIALIZED_NAME_FAIL_MESSAGE = "FailMessage";
  @SerializedName(SERIALIZED_NAME_FAIL_MESSAGE)
  @javax.annotation.Nullable
  private String failMessage;

  public static final String SERIALIZED_NAME_SUCCESS_MESSAGE = "SuccessMessage";
  @SerializedName(SERIALIZED_NAME_SUCCESS_MESSAGE)
  @javax.annotation.Nullable
  private String successMessage;

  public static final String SERIALIZED_NAME_HOST_NAMES = "host_names";
  @SerializedName(SERIALIZED_NAME_HOST_NAMES)
  @javax.annotation.Nullable
  private List<String> hostNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROVISIONED_AT = "provisioned_at";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime provisionedAt;

  public ProvisionCertificateOutput() {
  }

  public ProvisionCertificateOutput failMessage(@javax.annotation.Nullable String failMessage) {
    this.failMessage = failMessage;
    return this;
  }

  /**
   * Get failMessage
   * @return failMessage
   */
  @javax.annotation.Nullable
  public String getFailMessage() {
    return failMessage;
  }

  public void setFailMessage(@javax.annotation.Nullable String failMessage) {
    this.failMessage = failMessage;
  }


  public ProvisionCertificateOutput successMessage(@javax.annotation.Nullable String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

  /**
   * Get successMessage
   * @return successMessage
   */
  @javax.annotation.Nullable
  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(@javax.annotation.Nullable String successMessage) {
    this.successMessage = successMessage;
  }


  public ProvisionCertificateOutput hostNames(@javax.annotation.Nullable List<String> hostNames) {
    this.hostNames = hostNames;
    return this;
  }

  public ProvisionCertificateOutput addHostNamesItem(String hostNamesItem) {
    if (this.hostNames == null) {
      this.hostNames = new ArrayList<>();
    }
    this.hostNames.add(hostNamesItem);
    return this;
  }

  /**
   * Get hostNames
   * @return hostNames
   */
  @javax.annotation.Nullable
  public List<String> getHostNames() {
    return hostNames;
  }

  public void setHostNames(@javax.annotation.Nullable List<String> hostNames) {
    this.hostNames = hostNames;
  }


  public ProvisionCertificateOutput provisionedAt(@javax.annotation.Nullable OffsetDateTime provisionedAt) {
    this.provisionedAt = provisionedAt;
    return this;
  }

  /**
   * Get provisionedAt
   * @return provisionedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProvisionedAt() {
    return provisionedAt;
  }

  public void setProvisionedAt(@javax.annotation.Nullable OffsetDateTime provisionedAt) {
    this.provisionedAt = provisionedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionCertificateOutput provisionCertificateOutput = (ProvisionCertificateOutput) o;
    return Objects.equals(this.failMessage, provisionCertificateOutput.failMessage) &&
        Objects.equals(this.successMessage, provisionCertificateOutput.successMessage) &&
        Objects.equals(this.hostNames, provisionCertificateOutput.hostNames) &&
        Objects.equals(this.provisionedAt, provisionCertificateOutput.provisionedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMessage, successMessage, hostNames, provisionedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionCertificateOutput {\n");
    sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    hostNames: ").append(toIndentedString(hostNames)).append("\n");
    sb.append("    provisionedAt: ").append(toIndentedString(provisionedAt)).append("\n");
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
    openapiFields.add("FailMessage");
    openapiFields.add("SuccessMessage");
    openapiFields.add("host_names");
    openapiFields.add("provisioned_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisionCertificateOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisionCertificateOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionCertificateOutput is not found in the empty JSON string", ProvisionCertificateOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisionCertificateOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionCertificateOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("FailMessage") != null && !jsonObj.get("FailMessage").isJsonNull()) && !jsonObj.get("FailMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FailMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FailMessage").toString()));
      }
      if ((jsonObj.get("SuccessMessage") != null && !jsonObj.get("SuccessMessage").isJsonNull()) && !jsonObj.get("SuccessMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SuccessMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SuccessMessage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("host_names") != null && !jsonObj.get("host_names").isJsonNull() && !jsonObj.get("host_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_names` to be an array in the JSON string but got `%s`", jsonObj.get("host_names").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionCertificateOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionCertificateOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionCertificateOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionCertificateOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionCertificateOutput>() {
           @Override
           public void write(JsonWriter out, ProvisionCertificateOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionCertificateOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisionCertificateOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisionCertificateOutput
   * @throws IOException if the JSON string is invalid with respect to ProvisionCertificateOutput
   */
  public static ProvisionCertificateOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionCertificateOutput.class);
  }

  /**
   * Convert an instance of ProvisionCertificateOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

