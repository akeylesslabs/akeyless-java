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
 * gwUpdateRemoteAccessSessionLogsLogstash is a command that updates session log forwarding config (logstash target)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GwUpdateRemoteAccessSessionLogsLogstash {
  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  @javax.annotation.Nullable
  private String dns;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_ENABLE_TLS = "enable-tls";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS)
  @javax.annotation.Nullable
  private Boolean enableTls;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  @javax.annotation.Nullable
  private String protocol;

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  @javax.annotation.Nullable
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_TLS_CERTIFICATE = "tls-certificate";
  @SerializedName(SERIALIZED_NAME_TLS_CERTIFICATE)
  @javax.annotation.Nullable
  private String tlsCertificate = "use-existing";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GwUpdateRemoteAccessSessionLogsLogstash() {
  }

  public GwUpdateRemoteAccessSessionLogsLogstash dns(@javax.annotation.Nullable String dns) {
    this.dns = dns;
    return this;
  }

  /**
   * Logstash dns
   * @return dns
   */
  @javax.annotation.Nullable
  public String getDns() {
    return dns;
  }

  public void setDns(@javax.annotation.Nullable String dns) {
    this.dns = dns;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash enable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Enable Log Forwarding [true/false]
   * @return enable
   */
  @javax.annotation.Nullable
  public String getEnable() {
    return enable;
  }

  public void setEnable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash enableTls(@javax.annotation.Nullable Boolean enableTls) {
    this.enableTls = enableTls;
    return this;
  }

  /**
   * Enable tls
   * @return enableTls
   */
  @javax.annotation.Nullable
  public Boolean getEnableTls() {
    return enableTls;
  }

  public void setEnableTls(@javax.annotation.Nullable Boolean enableTls) {
    this.enableTls = enableTls;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash outputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Logs format [text/json]
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash protocol(@javax.annotation.Nullable String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Logstash protocol [tcp/udp]
   * @return protocol
   */
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(@javax.annotation.Nullable String protocol) {
    this.protocol = protocol;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash pullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
    return this;
  }

  /**
   * Pull interval in seconds
   * @return pullInterval
   */
  @javax.annotation.Nullable
  public String getPullInterval() {
    return pullInterval;
  }

  public void setPullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash tlsCertificate(@javax.annotation.Nullable String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
    return this;
  }

  /**
   * Logstash tls certificate
   * @return tlsCertificate
   */
  @javax.annotation.Nullable
  public String getTlsCertificate() {
    return tlsCertificate;
  }

  public void setTlsCertificate(@javax.annotation.Nullable String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public GwUpdateRemoteAccessSessionLogsLogstash uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GwUpdateRemoteAccessSessionLogsLogstash gwUpdateRemoteAccessSessionLogsLogstash = (GwUpdateRemoteAccessSessionLogsLogstash) o;
    return Objects.equals(this.dns, gwUpdateRemoteAccessSessionLogsLogstash.dns) &&
        Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsLogstash.enable) &&
        Objects.equals(this.enableTls, gwUpdateRemoteAccessSessionLogsLogstash.enableTls) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsLogstash.json) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsLogstash.outputFormat) &&
        Objects.equals(this.protocol, gwUpdateRemoteAccessSessionLogsLogstash.protocol) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsLogstash.pullInterval) &&
        Objects.equals(this.tlsCertificate, gwUpdateRemoteAccessSessionLogsLogstash.tlsCertificate) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsLogstash.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsLogstash.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns, enable, enableTls, json, outputFormat, protocol, pullInterval, tlsCertificate, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsLogstash {\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    enableTls: ").append(toIndentedString(enableTls)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
    sb.append("    tlsCertificate: ").append(toIndentedString(tlsCertificate)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("dns");
    openapiFields.add("enable");
    openapiFields.add("enable-tls");
    openapiFields.add("json");
    openapiFields.add("output-format");
    openapiFields.add("protocol");
    openapiFields.add("pull-interval");
    openapiFields.add("tls-certificate");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GwUpdateRemoteAccessSessionLogsLogstash
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GwUpdateRemoteAccessSessionLogsLogstash.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GwUpdateRemoteAccessSessionLogsLogstash is not found in the empty JSON string", GwUpdateRemoteAccessSessionLogsLogstash.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GwUpdateRemoteAccessSessionLogsLogstash.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GwUpdateRemoteAccessSessionLogsLogstash` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dns") != null && !jsonObj.get("dns").isJsonNull()) && !jsonObj.get("dns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dns").toString()));
      }
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
      }
      if ((jsonObj.get("output-format") != null && !jsonObj.get("output-format").isJsonNull()) && !jsonObj.get("output-format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output-format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output-format").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("pull-interval") != null && !jsonObj.get("pull-interval").isJsonNull()) && !jsonObj.get("pull-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull-interval").toString()));
      }
      if ((jsonObj.get("tls-certificate") != null && !jsonObj.get("tls-certificate").isJsonNull()) && !jsonObj.get("tls-certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tls-certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tls-certificate").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GwUpdateRemoteAccessSessionLogsLogstash.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GwUpdateRemoteAccessSessionLogsLogstash' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GwUpdateRemoteAccessSessionLogsLogstash> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GwUpdateRemoteAccessSessionLogsLogstash.class));

       return (TypeAdapter<T>) new TypeAdapter<GwUpdateRemoteAccessSessionLogsLogstash>() {
           @Override
           public void write(JsonWriter out, GwUpdateRemoteAccessSessionLogsLogstash value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GwUpdateRemoteAccessSessionLogsLogstash read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GwUpdateRemoteAccessSessionLogsLogstash given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GwUpdateRemoteAccessSessionLogsLogstash
   * @throws IOException if the JSON string is invalid with respect to GwUpdateRemoteAccessSessionLogsLogstash
   */
  public static GwUpdateRemoteAccessSessionLogsLogstash fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GwUpdateRemoteAccessSessionLogsLogstash.class);
  }

  /**
   * Convert an instance of GwUpdateRemoteAccessSessionLogsLogstash to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

