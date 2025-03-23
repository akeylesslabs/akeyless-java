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
 * CreateTargetItemAssocOutput defines output of CreateTargetItemAssoc operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateTargetItemAssocOutput {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc_id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  @javax.annotation.Nullable
  private String assocId;

  public CreateTargetItemAssocOutput() {
  }

  public CreateTargetItemAssocOutput assocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
    return this;
  }

  /**
   * Get assocId
   * @return assocId
   */
  @javax.annotation.Nullable
  public String getAssocId() {
    return assocId;
  }

  public void setAssocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTargetItemAssocOutput createTargetItemAssocOutput = (CreateTargetItemAssocOutput) o;
    return Objects.equals(this.assocId, createTargetItemAssocOutput.assocId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTargetItemAssocOutput {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
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
    openapiFields.add("assoc_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTargetItemAssocOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTargetItemAssocOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTargetItemAssocOutput is not found in the empty JSON string", CreateTargetItemAssocOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTargetItemAssocOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTargetItemAssocOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assoc_id") != null && !jsonObj.get("assoc_id").isJsonNull()) && !jsonObj.get("assoc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assoc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assoc_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTargetItemAssocOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTargetItemAssocOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTargetItemAssocOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTargetItemAssocOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTargetItemAssocOutput>() {
           @Override
           public void write(JsonWriter out, CreateTargetItemAssocOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTargetItemAssocOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTargetItemAssocOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTargetItemAssocOutput
   * @throws IOException if the JSON string is invalid with respect to CreateTargetItemAssocOutput
   */
  public static CreateTargetItemAssocOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTargetItemAssocOutput.class);
  }

  /**
   * Convert an instance of CreateTargetItemAssocOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

