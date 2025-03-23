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
 * RenewCertificateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RenewCertificateOutput {
  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  @javax.annotation.Nullable
  private String cert;

  public static final String SERIALIZED_NAME_CERT_DISPLAY_ID = "cert_display_id";
  @SerializedName(SERIALIZED_NAME_CERT_DISPLAY_ID)
  @javax.annotation.Nullable
  private String certDisplayId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  @javax.annotation.Nullable
  private String itemId;

  public static final String SERIALIZED_NAME_PARENT_CERT = "parent_cert";
  @SerializedName(SERIALIZED_NAME_PARENT_CERT)
  @javax.annotation.Nullable
  private String parentCert;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private_key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  @javax.annotation.Nullable
  private String privateKey;

  public static final String SERIALIZED_NAME_READING_TOKEN = "reading_token";
  @SerializedName(SERIALIZED_NAME_READING_TOKEN)
  @javax.annotation.Nullable
  private String readingToken;

  public RenewCertificateOutput() {
  }

  public RenewCertificateOutput cert(@javax.annotation.Nullable String cert) {
    this.cert = cert;
    return this;
  }

  /**
   * Get cert
   * @return cert
   */
  @javax.annotation.Nullable
  public String getCert() {
    return cert;
  }

  public void setCert(@javax.annotation.Nullable String cert) {
    this.cert = cert;
  }


  public RenewCertificateOutput certDisplayId(@javax.annotation.Nullable String certDisplayId) {
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


  public RenewCertificateOutput itemId(@javax.annotation.Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
   */
  @javax.annotation.Nullable
  public String getItemId() {
    return itemId;
  }

  public void setItemId(@javax.annotation.Nullable String itemId) {
    this.itemId = itemId;
  }


  public RenewCertificateOutput parentCert(@javax.annotation.Nullable String parentCert) {
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


  public RenewCertificateOutput privateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   * @return privateKey
   */
  @javax.annotation.Nullable
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
  }


  public RenewCertificateOutput readingToken(@javax.annotation.Nullable String readingToken) {
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
    RenewCertificateOutput renewCertificateOutput = (RenewCertificateOutput) o;
    return Objects.equals(this.cert, renewCertificateOutput.cert) &&
        Objects.equals(this.certDisplayId, renewCertificateOutput.certDisplayId) &&
        Objects.equals(this.itemId, renewCertificateOutput.itemId) &&
        Objects.equals(this.parentCert, renewCertificateOutput.parentCert) &&
        Objects.equals(this.privateKey, renewCertificateOutput.privateKey) &&
        Objects.equals(this.readingToken, renewCertificateOutput.readingToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cert, certDisplayId, itemId, parentCert, privateKey, readingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewCertificateOutput {\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certDisplayId: ").append(toIndentedString(certDisplayId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    parentCert: ").append(toIndentedString(parentCert)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
    openapiFields.add("cert");
    openapiFields.add("cert_display_id");
    openapiFields.add("item_id");
    openapiFields.add("parent_cert");
    openapiFields.add("private_key");
    openapiFields.add("reading_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewCertificateOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewCertificateOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewCertificateOutput is not found in the empty JSON string", RenewCertificateOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewCertificateOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewCertificateOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cert") != null && !jsonObj.get("cert").isJsonNull()) && !jsonObj.get("cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert").toString()));
      }
      if ((jsonObj.get("cert_display_id") != null && !jsonObj.get("cert_display_id").isJsonNull()) && !jsonObj.get("cert_display_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_display_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_display_id").toString()));
      }
      if ((jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonNull()) && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if ((jsonObj.get("parent_cert") != null && !jsonObj.get("parent_cert").isJsonNull()) && !jsonObj.get("parent_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_cert").toString()));
      }
      if ((jsonObj.get("private_key") != null && !jsonObj.get("private_key").isJsonNull()) && !jsonObj.get("private_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private_key").toString()));
      }
      if ((jsonObj.get("reading_token") != null && !jsonObj.get("reading_token").isJsonNull()) && !jsonObj.get("reading_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reading_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reading_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewCertificateOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewCertificateOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewCertificateOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewCertificateOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewCertificateOutput>() {
           @Override
           public void write(JsonWriter out, RenewCertificateOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewCertificateOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewCertificateOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewCertificateOutput
   * @throws IOException if the JSON string is invalid with respect to RenewCertificateOutput
   */
  public static RenewCertificateOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewCertificateOutput.class);
  }

  /**
   * Convert an instance of RenewCertificateOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

