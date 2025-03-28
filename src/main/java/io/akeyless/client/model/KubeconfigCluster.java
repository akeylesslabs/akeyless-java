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
 * KubeconfigCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KubeconfigCluster {
  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY = "certificate-authority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY)
  @javax.annotation.Nullable
  private String certificateAuthority;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_DATA = "certificate-authority-data";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_DATA)
  @javax.annotation.Nullable
  private String certificateAuthorityData;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  @javax.annotation.Nullable
  private String server;

  public KubeconfigCluster() {
  }

  public KubeconfigCluster certificateAuthority(@javax.annotation.Nullable String certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
    return this;
  }

  /**
   * CertificateAuthority is optional and can be omitted if not used.
   * @return certificateAuthority
   */
  @javax.annotation.Nullable
  public String getCertificateAuthority() {
    return certificateAuthority;
  }

  public void setCertificateAuthority(@javax.annotation.Nullable String certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
  }


  public KubeconfigCluster certificateAuthorityData(@javax.annotation.Nullable String certificateAuthorityData) {
    this.certificateAuthorityData = certificateAuthorityData;
    return this;
  }

  /**
   * Get certificateAuthorityData
   * @return certificateAuthorityData
   */
  @javax.annotation.Nullable
  public String getCertificateAuthorityData() {
    return certificateAuthorityData;
  }

  public void setCertificateAuthorityData(@javax.annotation.Nullable String certificateAuthorityData) {
    this.certificateAuthorityData = certificateAuthorityData;
  }


  public KubeconfigCluster server(@javax.annotation.Nullable String server) {
    this.server = server;
    return this;
  }

  /**
   * Get server
   * @return server
   */
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(@javax.annotation.Nullable String server) {
    this.server = server;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubeconfigCluster kubeconfigCluster = (KubeconfigCluster) o;
    return Objects.equals(this.certificateAuthority, kubeconfigCluster.certificateAuthority) &&
        Objects.equals(this.certificateAuthorityData, kubeconfigCluster.certificateAuthorityData) &&
        Objects.equals(this.server, kubeconfigCluster.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateAuthority, certificateAuthorityData, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubeconfigCluster {\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    certificateAuthorityData: ").append(toIndentedString(certificateAuthorityData)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
    openapiFields.add("certificate-authority");
    openapiFields.add("certificate-authority-data");
    openapiFields.add("server");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KubeconfigCluster
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KubeconfigCluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KubeconfigCluster is not found in the empty JSON string", KubeconfigCluster.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KubeconfigCluster.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KubeconfigCluster` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("certificate-authority") != null && !jsonObj.get("certificate-authority").isJsonNull()) && !jsonObj.get("certificate-authority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-authority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-authority").toString()));
      }
      if ((jsonObj.get("certificate-authority-data") != null && !jsonObj.get("certificate-authority-data").isJsonNull()) && !jsonObj.get("certificate-authority-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-authority-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-authority-data").toString()));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KubeconfigCluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KubeconfigCluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KubeconfigCluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KubeconfigCluster.class));

       return (TypeAdapter<T>) new TypeAdapter<KubeconfigCluster>() {
           @Override
           public void write(JsonWriter out, KubeconfigCluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KubeconfigCluster read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KubeconfigCluster given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KubeconfigCluster
   * @throws IOException if the JSON string is invalid with respect to KubeconfigCluster
   */
  public static KubeconfigCluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KubeconfigCluster.class);
  }

  /**
   * Convert an instance of KubeconfigCluster to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

