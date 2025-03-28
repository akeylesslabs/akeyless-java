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
 * SyslogLogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SyslogLogForwardingConfig {
  public static final String SERIALIZED_NAME_SYSLOG_ENABLE_TLS = "syslog_enable_tls";
  @SerializedName(SERIALIZED_NAME_SYSLOG_ENABLE_TLS)
  @javax.annotation.Nullable
  private Boolean syslogEnableTls;

  public static final String SERIALIZED_NAME_SYSLOG_FORMATTER = "syslog_formatter";
  @SerializedName(SERIALIZED_NAME_SYSLOG_FORMATTER)
  @javax.annotation.Nullable
  private String syslogFormatter;

  public static final String SERIALIZED_NAME_SYSLOG_HOST = "syslog_host";
  @SerializedName(SERIALIZED_NAME_SYSLOG_HOST)
  @javax.annotation.Nullable
  private String syslogHost;

  public static final String SERIALIZED_NAME_SYSLOG_NETWORK = "syslog_network";
  @SerializedName(SERIALIZED_NAME_SYSLOG_NETWORK)
  @javax.annotation.Nullable
  private String syslogNetwork;

  public static final String SERIALIZED_NAME_SYSLOG_TARGET_TAG = "syslog_target_tag";
  @SerializedName(SERIALIZED_NAME_SYSLOG_TARGET_TAG)
  @javax.annotation.Nullable
  private String syslogTargetTag;

  public static final String SERIALIZED_NAME_SYSLOG_TLS_CERTIFICATE = "syslog_tls_certificate";
  @SerializedName(SERIALIZED_NAME_SYSLOG_TLS_CERTIFICATE)
  @javax.annotation.Nullable
  private String syslogTlsCertificate;

  public SyslogLogForwardingConfig() {
  }

  public SyslogLogForwardingConfig syslogEnableTls(@javax.annotation.Nullable Boolean syslogEnableTls) {
    this.syslogEnableTls = syslogEnableTls;
    return this;
  }

  /**
   * Get syslogEnableTls
   * @return syslogEnableTls
   */
  @javax.annotation.Nullable
  public Boolean getSyslogEnableTls() {
    return syslogEnableTls;
  }

  public void setSyslogEnableTls(@javax.annotation.Nullable Boolean syslogEnableTls) {
    this.syslogEnableTls = syslogEnableTls;
  }


  public SyslogLogForwardingConfig syslogFormatter(@javax.annotation.Nullable String syslogFormatter) {
    this.syslogFormatter = syslogFormatter;
    return this;
  }

  /**
   * Get syslogFormatter
   * @return syslogFormatter
   */
  @javax.annotation.Nullable
  public String getSyslogFormatter() {
    return syslogFormatter;
  }

  public void setSyslogFormatter(@javax.annotation.Nullable String syslogFormatter) {
    this.syslogFormatter = syslogFormatter;
  }


  public SyslogLogForwardingConfig syslogHost(@javax.annotation.Nullable String syslogHost) {
    this.syslogHost = syslogHost;
    return this;
  }

  /**
   * Get syslogHost
   * @return syslogHost
   */
  @javax.annotation.Nullable
  public String getSyslogHost() {
    return syslogHost;
  }

  public void setSyslogHost(@javax.annotation.Nullable String syslogHost) {
    this.syslogHost = syslogHost;
  }


  public SyslogLogForwardingConfig syslogNetwork(@javax.annotation.Nullable String syslogNetwork) {
    this.syslogNetwork = syslogNetwork;
    return this;
  }

  /**
   * Get syslogNetwork
   * @return syslogNetwork
   */
  @javax.annotation.Nullable
  public String getSyslogNetwork() {
    return syslogNetwork;
  }

  public void setSyslogNetwork(@javax.annotation.Nullable String syslogNetwork) {
    this.syslogNetwork = syslogNetwork;
  }


  public SyslogLogForwardingConfig syslogTargetTag(@javax.annotation.Nullable String syslogTargetTag) {
    this.syslogTargetTag = syslogTargetTag;
    return this;
  }

  /**
   * Get syslogTargetTag
   * @return syslogTargetTag
   */
  @javax.annotation.Nullable
  public String getSyslogTargetTag() {
    return syslogTargetTag;
  }

  public void setSyslogTargetTag(@javax.annotation.Nullable String syslogTargetTag) {
    this.syslogTargetTag = syslogTargetTag;
  }


  public SyslogLogForwardingConfig syslogTlsCertificate(@javax.annotation.Nullable String syslogTlsCertificate) {
    this.syslogTlsCertificate = syslogTlsCertificate;
    return this;
  }

  /**
   * Get syslogTlsCertificate
   * @return syslogTlsCertificate
   */
  @javax.annotation.Nullable
  public String getSyslogTlsCertificate() {
    return syslogTlsCertificate;
  }

  public void setSyslogTlsCertificate(@javax.annotation.Nullable String syslogTlsCertificate) {
    this.syslogTlsCertificate = syslogTlsCertificate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyslogLogForwardingConfig syslogLogForwardingConfig = (SyslogLogForwardingConfig) o;
    return Objects.equals(this.syslogEnableTls, syslogLogForwardingConfig.syslogEnableTls) &&
        Objects.equals(this.syslogFormatter, syslogLogForwardingConfig.syslogFormatter) &&
        Objects.equals(this.syslogHost, syslogLogForwardingConfig.syslogHost) &&
        Objects.equals(this.syslogNetwork, syslogLogForwardingConfig.syslogNetwork) &&
        Objects.equals(this.syslogTargetTag, syslogLogForwardingConfig.syslogTargetTag) &&
        Objects.equals(this.syslogTlsCertificate, syslogLogForwardingConfig.syslogTlsCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syslogEnableTls, syslogFormatter, syslogHost, syslogNetwork, syslogTargetTag, syslogTlsCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyslogLogForwardingConfig {\n");
    sb.append("    syslogEnableTls: ").append(toIndentedString(syslogEnableTls)).append("\n");
    sb.append("    syslogFormatter: ").append(toIndentedString(syslogFormatter)).append("\n");
    sb.append("    syslogHost: ").append(toIndentedString(syslogHost)).append("\n");
    sb.append("    syslogNetwork: ").append(toIndentedString(syslogNetwork)).append("\n");
    sb.append("    syslogTargetTag: ").append(toIndentedString(syslogTargetTag)).append("\n");
    sb.append("    syslogTlsCertificate: ").append(toIndentedString(syslogTlsCertificate)).append("\n");
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
    openapiFields.add("syslog_enable_tls");
    openapiFields.add("syslog_formatter");
    openapiFields.add("syslog_host");
    openapiFields.add("syslog_network");
    openapiFields.add("syslog_target_tag");
    openapiFields.add("syslog_tls_certificate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SyslogLogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SyslogLogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SyslogLogForwardingConfig is not found in the empty JSON string", SyslogLogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SyslogLogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SyslogLogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("syslog_formatter") != null && !jsonObj.get("syslog_formatter").isJsonNull()) && !jsonObj.get("syslog_formatter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslog_formatter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslog_formatter").toString()));
      }
      if ((jsonObj.get("syslog_host") != null && !jsonObj.get("syslog_host").isJsonNull()) && !jsonObj.get("syslog_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslog_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslog_host").toString()));
      }
      if ((jsonObj.get("syslog_network") != null && !jsonObj.get("syslog_network").isJsonNull()) && !jsonObj.get("syslog_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslog_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslog_network").toString()));
      }
      if ((jsonObj.get("syslog_target_tag") != null && !jsonObj.get("syslog_target_tag").isJsonNull()) && !jsonObj.get("syslog_target_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslog_target_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslog_target_tag").toString()));
      }
      if ((jsonObj.get("syslog_tls_certificate") != null && !jsonObj.get("syslog_tls_certificate").isJsonNull()) && !jsonObj.get("syslog_tls_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslog_tls_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslog_tls_certificate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SyslogLogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SyslogLogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SyslogLogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SyslogLogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<SyslogLogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, SyslogLogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SyslogLogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SyslogLogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SyslogLogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to SyslogLogForwardingConfig
   */
  public static SyslogLogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SyslogLogForwardingConfig.class);
  }

  /**
   * Convert an instance of SyslogLogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

