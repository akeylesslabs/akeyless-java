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
 * DatadogForwardingConfig
 */

public class DatadogForwardingConfig {
  public static final String SERIALIZED_NAME_DATADOG_API_KEY = "datadog_api_key";
  @SerializedName(SERIALIZED_NAME_DATADOG_API_KEY)
  private String datadogApiKey;

  public static final String SERIALIZED_NAME_DATADOG_HOST = "datadog_host";
  @SerializedName(SERIALIZED_NAME_DATADOG_HOST)
  private String datadogHost;

  public static final String SERIALIZED_NAME_DATADOG_LOG_SERVICE = "datadog_log_service";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_SERVICE)
  private String datadogLogService;

  public static final String SERIALIZED_NAME_DATADOG_LOG_SOURCE = "datadog_log_source";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_SOURCE)
  private String datadogLogSource;

  public static final String SERIALIZED_NAME_DATADOG_LOG_TAGS = "datadog_log_tags";
  @SerializedName(SERIALIZED_NAME_DATADOG_LOG_TAGS)
  private String datadogLogTags;


  public DatadogForwardingConfig datadogApiKey(String datadogApiKey) {
    
    this.datadogApiKey = datadogApiKey;
    return this;
  }

   /**
   * Get datadogApiKey
   * @return datadogApiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogApiKey() {
    return datadogApiKey;
  }


  public void setDatadogApiKey(String datadogApiKey) {
    this.datadogApiKey = datadogApiKey;
  }


  public DatadogForwardingConfig datadogHost(String datadogHost) {
    
    this.datadogHost = datadogHost;
    return this;
  }

   /**
   * Get datadogHost
   * @return datadogHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogHost() {
    return datadogHost;
  }


  public void setDatadogHost(String datadogHost) {
    this.datadogHost = datadogHost;
  }


  public DatadogForwardingConfig datadogLogService(String datadogLogService) {
    
    this.datadogLogService = datadogLogService;
    return this;
  }

   /**
   * Get datadogLogService
   * @return datadogLogService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogLogService() {
    return datadogLogService;
  }


  public void setDatadogLogService(String datadogLogService) {
    this.datadogLogService = datadogLogService;
  }


  public DatadogForwardingConfig datadogLogSource(String datadogLogSource) {
    
    this.datadogLogSource = datadogLogSource;
    return this;
  }

   /**
   * Get datadogLogSource
   * @return datadogLogSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogLogSource() {
    return datadogLogSource;
  }


  public void setDatadogLogSource(String datadogLogSource) {
    this.datadogLogSource = datadogLogSource;
  }


  public DatadogForwardingConfig datadogLogTags(String datadogLogTags) {
    
    this.datadogLogTags = datadogLogTags;
    return this;
  }

   /**
   * Get datadogLogTags
   * @return datadogLogTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogLogTags() {
    return datadogLogTags;
  }


  public void setDatadogLogTags(String datadogLogTags) {
    this.datadogLogTags = datadogLogTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadogForwardingConfig datadogForwardingConfig = (DatadogForwardingConfig) o;
    return Objects.equals(this.datadogApiKey, datadogForwardingConfig.datadogApiKey) &&
        Objects.equals(this.datadogHost, datadogForwardingConfig.datadogHost) &&
        Objects.equals(this.datadogLogService, datadogForwardingConfig.datadogLogService) &&
        Objects.equals(this.datadogLogSource, datadogForwardingConfig.datadogLogSource) &&
        Objects.equals(this.datadogLogTags, datadogForwardingConfig.datadogLogTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datadogApiKey, datadogHost, datadogLogService, datadogLogSource, datadogLogTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadogForwardingConfig {\n");
    sb.append("    datadogApiKey: ").append(toIndentedString(datadogApiKey)).append("\n");
    sb.append("    datadogHost: ").append(toIndentedString(datadogHost)).append("\n");
    sb.append("    datadogLogService: ").append(toIndentedString(datadogLogService)).append("\n");
    sb.append("    datadogLogSource: ").append(toIndentedString(datadogLogSource)).append("\n");
    sb.append("    datadogLogTags: ").append(toIndentedString(datadogLogTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
