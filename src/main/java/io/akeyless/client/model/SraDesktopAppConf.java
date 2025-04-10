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
 * SraDesktopAppConf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SraDesktopAppConf {
  public static final String SERIALIZED_NAME_DEFAULT_CERT_ISSUER_ID = "default_cert_issuer_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CERT_ISSUER_ID)
  @javax.annotation.Nullable
  private Long defaultCertIssuerId;

  public static final String SERIALIZED_NAME_SECURE_WEB_ACCESS_URL = "secure_web_access_url";
  @SerializedName(SERIALIZED_NAME_SECURE_WEB_ACCESS_URL)
  @javax.annotation.Nullable
  private String secureWebAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_WEB_PROXY_URL = "secure_web_proxy_url";
  @SerializedName(SERIALIZED_NAME_SECURE_WEB_PROXY_URL)
  @javax.annotation.Nullable
  private String secureWebProxyUrl;

  public SraDesktopAppConf() {
  }

  public SraDesktopAppConf defaultCertIssuerId(@javax.annotation.Nullable Long defaultCertIssuerId) {
    this.defaultCertIssuerId = defaultCertIssuerId;
    return this;
  }

  /**
   * Get defaultCertIssuerId
   * @return defaultCertIssuerId
   */
  @javax.annotation.Nullable
  public Long getDefaultCertIssuerId() {
    return defaultCertIssuerId;
  }

  public void setDefaultCertIssuerId(@javax.annotation.Nullable Long defaultCertIssuerId) {
    this.defaultCertIssuerId = defaultCertIssuerId;
  }


  public SraDesktopAppConf secureWebAccessUrl(@javax.annotation.Nullable String secureWebAccessUrl) {
    this.secureWebAccessUrl = secureWebAccessUrl;
    return this;
  }

  /**
   * Get secureWebAccessUrl
   * @return secureWebAccessUrl
   */
  @javax.annotation.Nullable
  public String getSecureWebAccessUrl() {
    return secureWebAccessUrl;
  }

  public void setSecureWebAccessUrl(@javax.annotation.Nullable String secureWebAccessUrl) {
    this.secureWebAccessUrl = secureWebAccessUrl;
  }


  public SraDesktopAppConf secureWebProxyUrl(@javax.annotation.Nullable String secureWebProxyUrl) {
    this.secureWebProxyUrl = secureWebProxyUrl;
    return this;
  }

  /**
   * Get secureWebProxyUrl
   * @return secureWebProxyUrl
   */
  @javax.annotation.Nullable
  public String getSecureWebProxyUrl() {
    return secureWebProxyUrl;
  }

  public void setSecureWebProxyUrl(@javax.annotation.Nullable String secureWebProxyUrl) {
    this.secureWebProxyUrl = secureWebProxyUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SraDesktopAppConf sraDesktopAppConf = (SraDesktopAppConf) o;
    return Objects.equals(this.defaultCertIssuerId, sraDesktopAppConf.defaultCertIssuerId) &&
        Objects.equals(this.secureWebAccessUrl, sraDesktopAppConf.secureWebAccessUrl) &&
        Objects.equals(this.secureWebProxyUrl, sraDesktopAppConf.secureWebProxyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCertIssuerId, secureWebAccessUrl, secureWebProxyUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SraDesktopAppConf {\n");
    sb.append("    defaultCertIssuerId: ").append(toIndentedString(defaultCertIssuerId)).append("\n");
    sb.append("    secureWebAccessUrl: ").append(toIndentedString(secureWebAccessUrl)).append("\n");
    sb.append("    secureWebProxyUrl: ").append(toIndentedString(secureWebProxyUrl)).append("\n");
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
    openapiFields.add("default_cert_issuer_id");
    openapiFields.add("secure_web_access_url");
    openapiFields.add("secure_web_proxy_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SraDesktopAppConf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SraDesktopAppConf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SraDesktopAppConf is not found in the empty JSON string", SraDesktopAppConf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SraDesktopAppConf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SraDesktopAppConf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("secure_web_access_url") != null && !jsonObj.get("secure_web_access_url").isJsonNull()) && !jsonObj.get("secure_web_access_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure_web_access_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure_web_access_url").toString()));
      }
      if ((jsonObj.get("secure_web_proxy_url") != null && !jsonObj.get("secure_web_proxy_url").isJsonNull()) && !jsonObj.get("secure_web_proxy_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure_web_proxy_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure_web_proxy_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SraDesktopAppConf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SraDesktopAppConf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SraDesktopAppConf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SraDesktopAppConf.class));

       return (TypeAdapter<T>) new TypeAdapter<SraDesktopAppConf>() {
           @Override
           public void write(JsonWriter out, SraDesktopAppConf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SraDesktopAppConf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SraDesktopAppConf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SraDesktopAppConf
   * @throws IOException if the JSON string is invalid with respect to SraDesktopAppConf
   */
  public static SraDesktopAppConf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SraDesktopAppConf.class);
  }

  /**
   * Convert an instance of SraDesktopAppConf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

