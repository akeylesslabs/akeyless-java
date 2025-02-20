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
 * CertificateVersionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CertificateVersionInfo {
  public static final String SERIALIZED_NAME_NOT_AFTER = "not_after";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  @javax.annotation.Nullable
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "not_before";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  @javax.annotation.Nullable
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public CertificateVersionInfo() {
  }

  public CertificateVersionInfo notAfter(@javax.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(@javax.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public CertificateVersionInfo notBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public CertificateVersionInfo status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateVersionInfo certificateVersionInfo = (CertificateVersionInfo) o;
    return Objects.equals(this.notAfter, certificateVersionInfo.notAfter) &&
        Objects.equals(this.notBefore, certificateVersionInfo.notBefore) &&
        Objects.equals(this.status, certificateVersionInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notAfter, notBefore, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateVersionInfo {\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("not_after");
    openapiFields.add("not_before");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateVersionInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateVersionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateVersionInfo is not found in the empty JSON string", CertificateVersionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateVersionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateVersionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateVersionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateVersionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateVersionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateVersionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateVersionInfo>() {
           @Override
           public void write(JsonWriter out, CertificateVersionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateVersionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CertificateVersionInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CertificateVersionInfo
   * @throws IOException if the JSON string is invalid with respect to CertificateVersionInfo
   */
  public static CertificateVersionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateVersionInfo.class);
  }

  /**
   * Convert an instance of CertificateVersionInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

