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
 * CreateDockerhubTargetOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateDockerhubTargetOutput {
  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  @javax.annotation.Nullable
  private Long targetId;

  public CreateDockerhubTargetOutput() {
  }

  public CreateDockerhubTargetOutput targetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   */
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDockerhubTargetOutput createDockerhubTargetOutput = (CreateDockerhubTargetOutput) o;
    return Objects.equals(this.targetId, createDockerhubTargetOutput.targetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDockerhubTargetOutput {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
    openapiFields.add("target_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDockerhubTargetOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDockerhubTargetOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDockerhubTargetOutput is not found in the empty JSON string", CreateDockerhubTargetOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDockerhubTargetOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDockerhubTargetOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDockerhubTargetOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDockerhubTargetOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDockerhubTargetOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDockerhubTargetOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDockerhubTargetOutput>() {
           @Override
           public void write(JsonWriter out, CreateDockerhubTargetOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDockerhubTargetOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDockerhubTargetOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDockerhubTargetOutput
   * @throws IOException if the JSON string is invalid with respect to CreateDockerhubTargetOutput
   */
  public static CreateDockerhubTargetOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDockerhubTargetOutput.class);
  }

  /**
   * Convert an instance of CreateDockerhubTargetOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

