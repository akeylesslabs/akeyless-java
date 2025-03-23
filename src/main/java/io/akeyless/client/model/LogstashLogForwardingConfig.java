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
 * LogstashLogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LogstashLogForwardingConfig {
  public static final String SERIALIZED_NAME_LOGSTASH_DNS = "logstash_dns";
  @SerializedName(SERIALIZED_NAME_LOGSTASH_DNS)
  @javax.annotation.Nullable
  private String logstashDns;

  public static final String SERIALIZED_NAME_LOGSTASH_ENABLE_TLS = "logstash_enable_tls";
  @SerializedName(SERIALIZED_NAME_LOGSTASH_ENABLE_TLS)
  @javax.annotation.Nullable
  private Boolean logstashEnableTls;

  public static final String SERIALIZED_NAME_LOGSTASH_PROTOCOL = "logstash_protocol";
  @SerializedName(SERIALIZED_NAME_LOGSTASH_PROTOCOL)
  @javax.annotation.Nullable
  private String logstashProtocol;

  public static final String SERIALIZED_NAME_LOGSTASH_TLS_CERTIFICATE = "logstash_tls_certificate";
  @SerializedName(SERIALIZED_NAME_LOGSTASH_TLS_CERTIFICATE)
  @javax.annotation.Nullable
  private String logstashTlsCertificate;

  public LogstashLogForwardingConfig() {
  }

  public LogstashLogForwardingConfig logstashDns(@javax.annotation.Nullable String logstashDns) {
    this.logstashDns = logstashDns;
    return this;
  }

  /**
   * Get logstashDns
   * @return logstashDns
   */
  @javax.annotation.Nullable
  public String getLogstashDns() {
    return logstashDns;
  }

  public void setLogstashDns(@javax.annotation.Nullable String logstashDns) {
    this.logstashDns = logstashDns;
  }


  public LogstashLogForwardingConfig logstashEnableTls(@javax.annotation.Nullable Boolean logstashEnableTls) {
    this.logstashEnableTls = logstashEnableTls;
    return this;
  }

  /**
   * Get logstashEnableTls
   * @return logstashEnableTls
   */
  @javax.annotation.Nullable
  public Boolean getLogstashEnableTls() {
    return logstashEnableTls;
  }

  public void setLogstashEnableTls(@javax.annotation.Nullable Boolean logstashEnableTls) {
    this.logstashEnableTls = logstashEnableTls;
  }


  public LogstashLogForwardingConfig logstashProtocol(@javax.annotation.Nullable String logstashProtocol) {
    this.logstashProtocol = logstashProtocol;
    return this;
  }

  /**
   * Get logstashProtocol
   * @return logstashProtocol
   */
  @javax.annotation.Nullable
  public String getLogstashProtocol() {
    return logstashProtocol;
  }

  public void setLogstashProtocol(@javax.annotation.Nullable String logstashProtocol) {
    this.logstashProtocol = logstashProtocol;
  }


  public LogstashLogForwardingConfig logstashTlsCertificate(@javax.annotation.Nullable String logstashTlsCertificate) {
    this.logstashTlsCertificate = logstashTlsCertificate;
    return this;
  }

  /**
   * Get logstashTlsCertificate
   * @return logstashTlsCertificate
   */
  @javax.annotation.Nullable
  public String getLogstashTlsCertificate() {
    return logstashTlsCertificate;
  }

  public void setLogstashTlsCertificate(@javax.annotation.Nullable String logstashTlsCertificate) {
    this.logstashTlsCertificate = logstashTlsCertificate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogstashLogForwardingConfig logstashLogForwardingConfig = (LogstashLogForwardingConfig) o;
    return Objects.equals(this.logstashDns, logstashLogForwardingConfig.logstashDns) &&
        Objects.equals(this.logstashEnableTls, logstashLogForwardingConfig.logstashEnableTls) &&
        Objects.equals(this.logstashProtocol, logstashLogForwardingConfig.logstashProtocol) &&
        Objects.equals(this.logstashTlsCertificate, logstashLogForwardingConfig.logstashTlsCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logstashDns, logstashEnableTls, logstashProtocol, logstashTlsCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogstashLogForwardingConfig {\n");
    sb.append("    logstashDns: ").append(toIndentedString(logstashDns)).append("\n");
    sb.append("    logstashEnableTls: ").append(toIndentedString(logstashEnableTls)).append("\n");
    sb.append("    logstashProtocol: ").append(toIndentedString(logstashProtocol)).append("\n");
    sb.append("    logstashTlsCertificate: ").append(toIndentedString(logstashTlsCertificate)).append("\n");
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
    openapiFields.add("logstash_dns");
    openapiFields.add("logstash_enable_tls");
    openapiFields.add("logstash_protocol");
    openapiFields.add("logstash_tls_certificate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LogstashLogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogstashLogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogstashLogForwardingConfig is not found in the empty JSON string", LogstashLogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LogstashLogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogstashLogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("logstash_dns") != null && !jsonObj.get("logstash_dns").isJsonNull()) && !jsonObj.get("logstash_dns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logstash_dns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logstash_dns").toString()));
      }
      if ((jsonObj.get("logstash_protocol") != null && !jsonObj.get("logstash_protocol").isJsonNull()) && !jsonObj.get("logstash_protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logstash_protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logstash_protocol").toString()));
      }
      if ((jsonObj.get("logstash_tls_certificate") != null && !jsonObj.get("logstash_tls_certificate").isJsonNull()) && !jsonObj.get("logstash_tls_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logstash_tls_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logstash_tls_certificate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogstashLogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogstashLogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogstashLogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogstashLogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<LogstashLogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, LogstashLogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogstashLogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LogstashLogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LogstashLogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to LogstashLogForwardingConfig
   */
  public static LogstashLogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogstashLogForwardingConfig.class);
  }

  /**
   * Convert an instance of LogstashLogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

