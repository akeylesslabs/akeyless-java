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
 * ImportPasswordsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ImportPasswordsOutput {
  public static final String SERIALIZED_NAME_IMPORTED = "imported";
  @SerializedName(SERIALIZED_NAME_IMPORTED)
  @javax.annotation.Nullable
  private Integer imported;

  public static final String SERIALIZED_NAME_PASSWORDS_IN_FILE = "passwords_in_file";
  @SerializedName(SERIALIZED_NAME_PASSWORDS_IN_FILE)
  @javax.annotation.Nullable
  private Long passwordsInFile;

  public static final String SERIALIZED_NAME_SUCCESSFULLY_PARSED = "successfully_parsed";
  @SerializedName(SERIALIZED_NAME_SUCCESSFULLY_PARSED)
  @javax.annotation.Nullable
  private Long successfullyParsed;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  @javax.annotation.Nullable
  private Integer updated;

  public ImportPasswordsOutput() {
  }

  public ImportPasswordsOutput imported(@javax.annotation.Nullable Integer imported) {
    this.imported = imported;
    return this;
  }

  /**
   * Get imported
   * @return imported
   */
  @javax.annotation.Nullable
  public Integer getImported() {
    return imported;
  }

  public void setImported(@javax.annotation.Nullable Integer imported) {
    this.imported = imported;
  }


  public ImportPasswordsOutput passwordsInFile(@javax.annotation.Nullable Long passwordsInFile) {
    this.passwordsInFile = passwordsInFile;
    return this;
  }

  /**
   * Get passwordsInFile
   * @return passwordsInFile
   */
  @javax.annotation.Nullable
  public Long getPasswordsInFile() {
    return passwordsInFile;
  }

  public void setPasswordsInFile(@javax.annotation.Nullable Long passwordsInFile) {
    this.passwordsInFile = passwordsInFile;
  }


  public ImportPasswordsOutput successfullyParsed(@javax.annotation.Nullable Long successfullyParsed) {
    this.successfullyParsed = successfullyParsed;
    return this;
  }

  /**
   * Get successfullyParsed
   * @return successfullyParsed
   */
  @javax.annotation.Nullable
  public Long getSuccessfullyParsed() {
    return successfullyParsed;
  }

  public void setSuccessfullyParsed(@javax.annotation.Nullable Long successfullyParsed) {
    this.successfullyParsed = successfullyParsed;
  }


  public ImportPasswordsOutput updated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  public Integer getUpdated() {
    return updated;
  }

  public void setUpdated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportPasswordsOutput importPasswordsOutput = (ImportPasswordsOutput) o;
    return Objects.equals(this.imported, importPasswordsOutput.imported) &&
        Objects.equals(this.passwordsInFile, importPasswordsOutput.passwordsInFile) &&
        Objects.equals(this.successfullyParsed, importPasswordsOutput.successfullyParsed) &&
        Objects.equals(this.updated, importPasswordsOutput.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imported, passwordsInFile, successfullyParsed, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportPasswordsOutput {\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    passwordsInFile: ").append(toIndentedString(passwordsInFile)).append("\n");
    sb.append("    successfullyParsed: ").append(toIndentedString(successfullyParsed)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("imported");
    openapiFields.add("passwords_in_file");
    openapiFields.add("successfully_parsed");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportPasswordsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportPasswordsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportPasswordsOutput is not found in the empty JSON string", ImportPasswordsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImportPasswordsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportPasswordsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportPasswordsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportPasswordsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportPasswordsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportPasswordsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportPasswordsOutput>() {
           @Override
           public void write(JsonWriter out, ImportPasswordsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportPasswordsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImportPasswordsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportPasswordsOutput
   * @throws IOException if the JSON string is invalid with respect to ImportPasswordsOutput
   */
  public static ImportPasswordsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportPasswordsOutput.class);
  }

  /**
   * Convert an instance of ImportPasswordsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

