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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * gwUpdateRemoteAccessSessionLogsDatadog is a command that updates session log forwarding config (datadog target)
 */
@ApiModel(description = "gwUpdateRemoteAccessSessionLogsDatadog is a command that updates session log forwarding config (datadog target)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GwUpdateRemoteAccessSessionLogsDatadog {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private String enable = "true";

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LOG_SERVICE = "log-service";
  @SerializedName(SERIALIZED_NAME_LOG_SERVICE)
  private String logService = "use-existing";

  public static final String SERIALIZED_NAME_LOG_SOURCE = "log-source";
  @SerializedName(SERIALIZED_NAME_LOG_SOURCE)
  private String logSource = "use-existing";

  public static final String SERIALIZED_NAME_LOG_TAGS = "log-tags";
  @SerializedName(SERIALIZED_NAME_LOG_TAGS)
  private String logTags = "use-existing";

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public GwUpdateRemoteAccessSessionLogsDatadog() { 
  }

  public GwUpdateRemoteAccessSessionLogsDatadog apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Datadog api key
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datadog api key")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog enable(String enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable Log Forwarding [true/false]
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Log Forwarding [true/false]")

  public String getEnable() {
    return enable;
  }


  public void setEnable(String enable) {
    this.enable = enable;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Datadog host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datadog host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog logService(String logService) {
    
    this.logService = logService;
    return this;
  }

   /**
   * Datadog log service
   * @return logService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datadog log service")

  public String getLogService() {
    return logService;
  }


  public void setLogService(String logService) {
    this.logService = logService;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog logSource(String logSource) {
    
    this.logSource = logSource;
    return this;
  }

   /**
   * Datadog log source
   * @return logSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datadog log source")

  public String getLogSource() {
    return logSource;
  }


  public void setLogSource(String logSource) {
    this.logSource = logSource;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog logTags(String logTags) {
    
    this.logTags = logTags;
    return this;
  }

   /**
   * A comma-separated list of Datadog log tags formatted as \&quot;key:value\&quot; strings
   * @return logTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of Datadog log tags formatted as \"key:value\" strings")

  public String getLogTags() {
    return logTags;
  }


  public void setLogTags(String logTags) {
    this.logTags = logTags;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog outputFormat(String outputFormat) {
    
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * Logs format [text/json]
   * @return outputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logs format [text/json]")

  public String getOutputFormat() {
    return outputFormat;
  }


  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog pullInterval(String pullInterval) {
    
    this.pullInterval = pullInterval;
    return this;
  }

   /**
   * Pull interval in seconds
   * @return pullInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pull interval in seconds")

  public String getPullInterval() {
    return pullInterval;
  }


  public void setPullInterval(String pullInterval) {
    this.pullInterval = pullInterval;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public GwUpdateRemoteAccessSessionLogsDatadog uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
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
    GwUpdateRemoteAccessSessionLogsDatadog gwUpdateRemoteAccessSessionLogsDatadog = (GwUpdateRemoteAccessSessionLogsDatadog) o;
    return Objects.equals(this.apiKey, gwUpdateRemoteAccessSessionLogsDatadog.apiKey) &&
        Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsDatadog.enable) &&
        Objects.equals(this.host, gwUpdateRemoteAccessSessionLogsDatadog.host) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsDatadog.json) &&
        Objects.equals(this.logService, gwUpdateRemoteAccessSessionLogsDatadog.logService) &&
        Objects.equals(this.logSource, gwUpdateRemoteAccessSessionLogsDatadog.logSource) &&
        Objects.equals(this.logTags, gwUpdateRemoteAccessSessionLogsDatadog.logTags) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsDatadog.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsDatadog.pullInterval) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsDatadog.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsDatadog.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, enable, host, json, logService, logSource, logTags, outputFormat, pullInterval, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsDatadog {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    logService: ").append(toIndentedString(logService)).append("\n");
    sb.append("    logSource: ").append(toIndentedString(logSource)).append("\n");
    sb.append("    logTags: ").append(toIndentedString(logTags)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
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

}

