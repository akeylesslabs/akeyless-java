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
 * gwUpdateRemoteAccessSessionLogsSplunk is a command that updates session log forwarding config (splunk target)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GwUpdateRemoteAccessSessionLogsSplunk {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_ENABLE_TLS = "enable-tls";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS)
  @javax.annotation.Nullable
  private Boolean enableTls;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  @javax.annotation.Nullable
  private String index;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  @javax.annotation.Nullable
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private String source = "use-existing";

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source-type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  @javax.annotation.Nullable
  private String sourceType = "use-existing";

  public static final String SERIALIZED_NAME_SPLUNK_TOKEN = "splunk-token";
  @SerializedName(SERIALIZED_NAME_SPLUNK_TOKEN)
  @javax.annotation.Nullable
  private String splunkToken;

  public static final String SERIALIZED_NAME_SPLUNK_URL = "splunk-url";
  @SerializedName(SERIALIZED_NAME_SPLUNK_URL)
  @javax.annotation.Nullable
  private String splunkUrl;

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

  public GwUpdateRemoteAccessSessionLogsSplunk() {
  }

  public GwUpdateRemoteAccessSessionLogsSplunk enable(@javax.annotation.Nullable String enable) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk enableTls(@javax.annotation.Nullable Boolean enableTls) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk index(@javax.annotation.Nullable String index) {
    this.index = index;
    return this;
  }

  /**
   * Splunk index
   * @return index
   */
  @javax.annotation.Nullable
  public String getIndex() {
    return index;
  }

  public void setIndex(@javax.annotation.Nullable String index) {
    this.index = index;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk json(@javax.annotation.Nullable Boolean json) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk outputFormat(@javax.annotation.Nullable String outputFormat) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk pullInterval(@javax.annotation.Nullable String pullInterval) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk source(@javax.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * Splunk source
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable String source) {
    this.source = source;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk sourceType(@javax.annotation.Nullable String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Splunk source type
   * @return sourceType
   */
  @javax.annotation.Nullable
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(@javax.annotation.Nullable String sourceType) {
    this.sourceType = sourceType;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk splunkToken(@javax.annotation.Nullable String splunkToken) {
    this.splunkToken = splunkToken;
    return this;
  }

  /**
   * Splunk token
   * @return splunkToken
   */
  @javax.annotation.Nullable
  public String getSplunkToken() {
    return splunkToken;
  }

  public void setSplunkToken(@javax.annotation.Nullable String splunkToken) {
    this.splunkToken = splunkToken;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk splunkUrl(@javax.annotation.Nullable String splunkUrl) {
    this.splunkUrl = splunkUrl;
    return this;
  }

  /**
   * Splunk server URL
   * @return splunkUrl
   */
  @javax.annotation.Nullable
  public String getSplunkUrl() {
    return splunkUrl;
  }

  public void setSplunkUrl(@javax.annotation.Nullable String splunkUrl) {
    this.splunkUrl = splunkUrl;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk tlsCertificate(@javax.annotation.Nullable String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
    return this;
  }

  /**
   * Splunk tls certificate
   * @return tlsCertificate
   */
  @javax.annotation.Nullable
  public String getTlsCertificate() {
    return tlsCertificate;
  }

  public void setTlsCertificate(@javax.annotation.Nullable String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk token(@javax.annotation.Nullable String token) {
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


  public GwUpdateRemoteAccessSessionLogsSplunk uidToken(@javax.annotation.Nullable String uidToken) {
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
    GwUpdateRemoteAccessSessionLogsSplunk gwUpdateRemoteAccessSessionLogsSplunk = (GwUpdateRemoteAccessSessionLogsSplunk) o;
    return Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsSplunk.enable) &&
        Objects.equals(this.enableTls, gwUpdateRemoteAccessSessionLogsSplunk.enableTls) &&
        Objects.equals(this.index, gwUpdateRemoteAccessSessionLogsSplunk.index) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsSplunk.json) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsSplunk.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsSplunk.pullInterval) &&
        Objects.equals(this.source, gwUpdateRemoteAccessSessionLogsSplunk.source) &&
        Objects.equals(this.sourceType, gwUpdateRemoteAccessSessionLogsSplunk.sourceType) &&
        Objects.equals(this.splunkToken, gwUpdateRemoteAccessSessionLogsSplunk.splunkToken) &&
        Objects.equals(this.splunkUrl, gwUpdateRemoteAccessSessionLogsSplunk.splunkUrl) &&
        Objects.equals(this.tlsCertificate, gwUpdateRemoteAccessSessionLogsSplunk.tlsCertificate) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsSplunk.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsSplunk.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, enableTls, index, json, outputFormat, pullInterval, source, sourceType, splunkToken, splunkUrl, tlsCertificate, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsSplunk {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    enableTls: ").append(toIndentedString(enableTls)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    splunkToken: ").append(toIndentedString(splunkToken)).append("\n");
    sb.append("    splunkUrl: ").append(toIndentedString(splunkUrl)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("enable-tls");
    openapiFields.add("index");
    openapiFields.add("json");
    openapiFields.add("output-format");
    openapiFields.add("pull-interval");
    openapiFields.add("source");
    openapiFields.add("source-type");
    openapiFields.add("splunk-token");
    openapiFields.add("splunk-url");
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
   * @throws IOException if the JSON Element is invalid with respect to GwUpdateRemoteAccessSessionLogsSplunk
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GwUpdateRemoteAccessSessionLogsSplunk.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GwUpdateRemoteAccessSessionLogsSplunk is not found in the empty JSON string", GwUpdateRemoteAccessSessionLogsSplunk.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GwUpdateRemoteAccessSessionLogsSplunk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GwUpdateRemoteAccessSessionLogsSplunk` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
      }
      if ((jsonObj.get("index") != null && !jsonObj.get("index").isJsonNull()) && !jsonObj.get("index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("index").toString()));
      }
      if ((jsonObj.get("output-format") != null && !jsonObj.get("output-format").isJsonNull()) && !jsonObj.get("output-format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output-format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output-format").toString()));
      }
      if ((jsonObj.get("pull-interval") != null && !jsonObj.get("pull-interval").isJsonNull()) && !jsonObj.get("pull-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull-interval").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("source-type") != null && !jsonObj.get("source-type").isJsonNull()) && !jsonObj.get("source-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source-type").toString()));
      }
      if ((jsonObj.get("splunk-token") != null && !jsonObj.get("splunk-token").isJsonNull()) && !jsonObj.get("splunk-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `splunk-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("splunk-token").toString()));
      }
      if ((jsonObj.get("splunk-url") != null && !jsonObj.get("splunk-url").isJsonNull()) && !jsonObj.get("splunk-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `splunk-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("splunk-url").toString()));
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
       if (!GwUpdateRemoteAccessSessionLogsSplunk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GwUpdateRemoteAccessSessionLogsSplunk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GwUpdateRemoteAccessSessionLogsSplunk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GwUpdateRemoteAccessSessionLogsSplunk.class));

       return (TypeAdapter<T>) new TypeAdapter<GwUpdateRemoteAccessSessionLogsSplunk>() {
           @Override
           public void write(JsonWriter out, GwUpdateRemoteAccessSessionLogsSplunk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GwUpdateRemoteAccessSessionLogsSplunk read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GwUpdateRemoteAccessSessionLogsSplunk given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GwUpdateRemoteAccessSessionLogsSplunk
   * @throws IOException if the JSON string is invalid with respect to GwUpdateRemoteAccessSessionLogsSplunk
   */
  public static GwUpdateRemoteAccessSessionLogsSplunk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GwUpdateRemoteAccessSessionLogsSplunk.class);
  }

  /**
   * Convert an instance of GwUpdateRemoteAccessSessionLogsSplunk to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

