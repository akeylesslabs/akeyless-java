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
 * GetPKICertificateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetPKICertificateOutput {
  public static final String SERIALIZED_NAME_CERT_DISPLAY_ID = "cert_display_id";
  @SerializedName(SERIALIZED_NAME_CERT_DISPLAY_ID)
  @javax.annotation.Nullable
  private String certDisplayId;

  public static final String SERIALIZED_NAME_CERT_ITEM_ID = "cert_item_id";
  @SerializedName(SERIALIZED_NAME_CERT_ITEM_ID)
  @javax.annotation.Nullable
  private Long certItemId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private String data;

  public static final String SERIALIZED_NAME_PARENT_CERT = "parent_cert";
  @SerializedName(SERIALIZED_NAME_PARENT_CERT)
  @javax.annotation.Nullable
  private String parentCert;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @javax.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_READING_TOKEN = "reading_token";
  @SerializedName(SERIALIZED_NAME_READING_TOKEN)
  @javax.annotation.Nullable
  private String readingToken;

  public GetPKICertificateOutput() {
  }

  public GetPKICertificateOutput certDisplayId(@javax.annotation.Nullable String certDisplayId) {
    this.certDisplayId = certDisplayId;
    return this;
  }

  /**
   * Get certDisplayId
   * @return certDisplayId
   */
  @javax.annotation.Nullable
  public String getCertDisplayId() {
    return certDisplayId;
  }

  public void setCertDisplayId(@javax.annotation.Nullable String certDisplayId) {
    this.certDisplayId = certDisplayId;
  }


  public GetPKICertificateOutput certItemId(@javax.annotation.Nullable Long certItemId) {
    this.certItemId = certItemId;
    return this;
  }

  /**
   * Get certItemId
   * @return certItemId
   */
  @javax.annotation.Nullable
  public Long getCertItemId() {
    return certItemId;
  }

  public void setCertItemId(@javax.annotation.Nullable Long certItemId) {
    this.certItemId = certItemId;
  }


  public GetPKICertificateOutput data(@javax.annotation.Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable String data) {
    this.data = data;
  }


  public GetPKICertificateOutput parentCert(@javax.annotation.Nullable String parentCert) {
    this.parentCert = parentCert;
    return this;
  }

  /**
   * Get parentCert
   * @return parentCert
   */
  @javax.annotation.Nullable
  public String getParentCert() {
    return parentCert;
  }

  public void setParentCert(@javax.annotation.Nullable String parentCert) {
    this.parentCert = parentCert;
  }


  public GetPKICertificateOutput path(@javax.annotation.Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(@javax.annotation.Nullable String path) {
    this.path = path;
  }


  public GetPKICertificateOutput readingToken(@javax.annotation.Nullable String readingToken) {
    this.readingToken = readingToken;
    return this;
  }

  /**
   * Get readingToken
   * @return readingToken
   */
  @javax.annotation.Nullable
  public String getReadingToken() {
    return readingToken;
  }

  public void setReadingToken(@javax.annotation.Nullable String readingToken) {
    this.readingToken = readingToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPKICertificateOutput getPKICertificateOutput = (GetPKICertificateOutput) o;
    return Objects.equals(this.certDisplayId, getPKICertificateOutput.certDisplayId) &&
        Objects.equals(this.certItemId, getPKICertificateOutput.certItemId) &&
        Objects.equals(this.data, getPKICertificateOutput.data) &&
        Objects.equals(this.parentCert, getPKICertificateOutput.parentCert) &&
        Objects.equals(this.path, getPKICertificateOutput.path) &&
        Objects.equals(this.readingToken, getPKICertificateOutput.readingToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certDisplayId, certItemId, data, parentCert, path, readingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPKICertificateOutput {\n");
    sb.append("    certDisplayId: ").append(toIndentedString(certDisplayId)).append("\n");
    sb.append("    certItemId: ").append(toIndentedString(certItemId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    parentCert: ").append(toIndentedString(parentCert)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readingToken: ").append(toIndentedString(readingToken)).append("\n");
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
    openapiFields.add("cert_display_id");
    openapiFields.add("cert_item_id");
    openapiFields.add("data");
    openapiFields.add("parent_cert");
    openapiFields.add("path");
    openapiFields.add("reading_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPKICertificateOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPKICertificateOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPKICertificateOutput is not found in the empty JSON string", GetPKICertificateOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPKICertificateOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPKICertificateOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cert_display_id") != null && !jsonObj.get("cert_display_id").isJsonNull()) && !jsonObj.get("cert_display_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_display_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_display_id").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("parent_cert") != null && !jsonObj.get("parent_cert").isJsonNull()) && !jsonObj.get("parent_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_cert").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("reading_token") != null && !jsonObj.get("reading_token").isJsonNull()) && !jsonObj.get("reading_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reading_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reading_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPKICertificateOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPKICertificateOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPKICertificateOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPKICertificateOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPKICertificateOutput>() {
           @Override
           public void write(JsonWriter out, GetPKICertificateOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPKICertificateOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPKICertificateOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPKICertificateOutput
   * @throws IOException if the JSON string is invalid with respect to GetPKICertificateOutput
   */
  public static GetPKICertificateOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPKICertificateOutput.class);
  }

  /**
   * Convert an instance of GetPKICertificateOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

