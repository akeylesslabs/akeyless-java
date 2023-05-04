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
import io.akeyless.client.model.AwsS3LogForwardingConfig;
import io.akeyless.client.model.AzureLogAnalyticsForwardingConfig;
import io.akeyless.client.model.DatadogForwardingConfig;
import io.akeyless.client.model.ElasticsearchLogForwardingConfig;
import io.akeyless.client.model.LogstashLogForwardingConfig;
import io.akeyless.client.model.LogzIoLogForwardingConfig;
import io.akeyless.client.model.SplunkLogForwardingConfig;
import io.akeyless.client.model.SyslogLogForwardingConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LogForwardingConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogForwardingConfigPart {
  public static final String SERIALIZED_NAME_AWS_S3_CONFIG = "aws_s3_config";
  @SerializedName(SERIALIZED_NAME_AWS_S3_CONFIG)
  private AwsS3LogForwardingConfig awsS3Config;

  public static final String SERIALIZED_NAME_AZURE_ANALYTICS_CONFIG = "azure_analytics_config";
  @SerializedName(SERIALIZED_NAME_AZURE_ANALYTICS_CONFIG)
  private AzureLogAnalyticsForwardingConfig azureAnalyticsConfig;

  public static final String SERIALIZED_NAME_DATADOG_CONFIG = "datadog_config";
  @SerializedName(SERIALIZED_NAME_DATADOG_CONFIG)
  private DatadogForwardingConfig datadogConfig;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_CONFIG = "elasticsearch_config";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_CONFIG)
  private ElasticsearchLogForwardingConfig elasticsearchConfig;

  public static final String SERIALIZED_NAME_JSON_OUTPUT = "json_output";
  @SerializedName(SERIALIZED_NAME_JSON_OUTPUT)
  private Boolean jsonOutput;

  public static final String SERIALIZED_NAME_LOGAN_ENABLE = "logan_enable";
  @SerializedName(SERIALIZED_NAME_LOGAN_ENABLE)
  private Boolean loganEnable;

  public static final String SERIALIZED_NAME_LOGAN_URL = "logan_url";
  @SerializedName(SERIALIZED_NAME_LOGAN_URL)
  private String loganUrl;

  public static final String SERIALIZED_NAME_LOGSTASH_CONFIG = "logstash_config";
  @SerializedName(SERIALIZED_NAME_LOGSTASH_CONFIG)
  private LogstashLogForwardingConfig logstashConfig;

  public static final String SERIALIZED_NAME_LOGZ_IO_CONFIG = "logz_io_config";
  @SerializedName(SERIALIZED_NAME_LOGZ_IO_CONFIG)
  private LogzIoLogForwardingConfig logzIoConfig;

  public static final String SERIALIZED_NAME_PULL_INTERVAL_SEC = "pull_interval_sec";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL_SEC)
  private String pullIntervalSec;

  public static final String SERIALIZED_NAME_SPLUNK_CONFIG = "splunk_config";
  @SerializedName(SERIALIZED_NAME_SPLUNK_CONFIG)
  private SplunkLogForwardingConfig splunkConfig;

  public static final String SERIALIZED_NAME_SYSLOG_CONFIG = "syslog_config";
  @SerializedName(SERIALIZED_NAME_SYSLOG_CONFIG)
  private SyslogLogForwardingConfig syslogConfig;

  public static final String SERIALIZED_NAME_TARGET_LOG_TYPE = "target_log_type";
  @SerializedName(SERIALIZED_NAME_TARGET_LOG_TYPE)
  private String targetLogType;

  public LogForwardingConfigPart() { 
  }

  public LogForwardingConfigPart awsS3Config(AwsS3LogForwardingConfig awsS3Config) {
    
    this.awsS3Config = awsS3Config;
    return this;
  }

   /**
   * Get awsS3Config
   * @return awsS3Config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AwsS3LogForwardingConfig getAwsS3Config() {
    return awsS3Config;
  }


  public void setAwsS3Config(AwsS3LogForwardingConfig awsS3Config) {
    this.awsS3Config = awsS3Config;
  }


  public LogForwardingConfigPart azureAnalyticsConfig(AzureLogAnalyticsForwardingConfig azureAnalyticsConfig) {
    
    this.azureAnalyticsConfig = azureAnalyticsConfig;
    return this;
  }

   /**
   * Get azureAnalyticsConfig
   * @return azureAnalyticsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureLogAnalyticsForwardingConfig getAzureAnalyticsConfig() {
    return azureAnalyticsConfig;
  }


  public void setAzureAnalyticsConfig(AzureLogAnalyticsForwardingConfig azureAnalyticsConfig) {
    this.azureAnalyticsConfig = azureAnalyticsConfig;
  }


  public LogForwardingConfigPart datadogConfig(DatadogForwardingConfig datadogConfig) {
    
    this.datadogConfig = datadogConfig;
    return this;
  }

   /**
   * Get datadogConfig
   * @return datadogConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatadogForwardingConfig getDatadogConfig() {
    return datadogConfig;
  }


  public void setDatadogConfig(DatadogForwardingConfig datadogConfig) {
    this.datadogConfig = datadogConfig;
  }


  public LogForwardingConfigPart elasticsearchConfig(ElasticsearchLogForwardingConfig elasticsearchConfig) {
    
    this.elasticsearchConfig = elasticsearchConfig;
    return this;
  }

   /**
   * Get elasticsearchConfig
   * @return elasticsearchConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElasticsearchLogForwardingConfig getElasticsearchConfig() {
    return elasticsearchConfig;
  }


  public void setElasticsearchConfig(ElasticsearchLogForwardingConfig elasticsearchConfig) {
    this.elasticsearchConfig = elasticsearchConfig;
  }


  public LogForwardingConfigPart jsonOutput(Boolean jsonOutput) {
    
    this.jsonOutput = jsonOutput;
    return this;
  }

   /**
   * Get jsonOutput
   * @return jsonOutput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJsonOutput() {
    return jsonOutput;
  }


  public void setJsonOutput(Boolean jsonOutput) {
    this.jsonOutput = jsonOutput;
  }


  public LogForwardingConfigPart loganEnable(Boolean loganEnable) {
    
    this.loganEnable = loganEnable;
    return this;
  }

   /**
   * Get loganEnable
   * @return loganEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLoganEnable() {
    return loganEnable;
  }


  public void setLoganEnable(Boolean loganEnable) {
    this.loganEnable = loganEnable;
  }


  public LogForwardingConfigPart loganUrl(String loganUrl) {
    
    this.loganUrl = loganUrl;
    return this;
  }

   /**
   * Get loganUrl
   * @return loganUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLoganUrl() {
    return loganUrl;
  }


  public void setLoganUrl(String loganUrl) {
    this.loganUrl = loganUrl;
  }


  public LogForwardingConfigPart logstashConfig(LogstashLogForwardingConfig logstashConfig) {
    
    this.logstashConfig = logstashConfig;
    return this;
  }

   /**
   * Get logstashConfig
   * @return logstashConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogstashLogForwardingConfig getLogstashConfig() {
    return logstashConfig;
  }


  public void setLogstashConfig(LogstashLogForwardingConfig logstashConfig) {
    this.logstashConfig = logstashConfig;
  }


  public LogForwardingConfigPart logzIoConfig(LogzIoLogForwardingConfig logzIoConfig) {
    
    this.logzIoConfig = logzIoConfig;
    return this;
  }

   /**
   * Get logzIoConfig
   * @return logzIoConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogzIoLogForwardingConfig getLogzIoConfig() {
    return logzIoConfig;
  }


  public void setLogzIoConfig(LogzIoLogForwardingConfig logzIoConfig) {
    this.logzIoConfig = logzIoConfig;
  }


  public LogForwardingConfigPart pullIntervalSec(String pullIntervalSec) {
    
    this.pullIntervalSec = pullIntervalSec;
    return this;
  }

   /**
   * Get pullIntervalSec
   * @return pullIntervalSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPullIntervalSec() {
    return pullIntervalSec;
  }


  public void setPullIntervalSec(String pullIntervalSec) {
    this.pullIntervalSec = pullIntervalSec;
  }


  public LogForwardingConfigPart splunkConfig(SplunkLogForwardingConfig splunkConfig) {
    
    this.splunkConfig = splunkConfig;
    return this;
  }

   /**
   * Get splunkConfig
   * @return splunkConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SplunkLogForwardingConfig getSplunkConfig() {
    return splunkConfig;
  }


  public void setSplunkConfig(SplunkLogForwardingConfig splunkConfig) {
    this.splunkConfig = splunkConfig;
  }


  public LogForwardingConfigPart syslogConfig(SyslogLogForwardingConfig syslogConfig) {
    
    this.syslogConfig = syslogConfig;
    return this;
  }

   /**
   * Get syslogConfig
   * @return syslogConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyslogLogForwardingConfig getSyslogConfig() {
    return syslogConfig;
  }


  public void setSyslogConfig(SyslogLogForwardingConfig syslogConfig) {
    this.syslogConfig = syslogConfig;
  }


  public LogForwardingConfigPart targetLogType(String targetLogType) {
    
    this.targetLogType = targetLogType;
    return this;
  }

   /**
   * Get targetLogType
   * @return targetLogType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetLogType() {
    return targetLogType;
  }


  public void setTargetLogType(String targetLogType) {
    this.targetLogType = targetLogType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogForwardingConfigPart logForwardingConfigPart = (LogForwardingConfigPart) o;
    return Objects.equals(this.awsS3Config, logForwardingConfigPart.awsS3Config) &&
        Objects.equals(this.azureAnalyticsConfig, logForwardingConfigPart.azureAnalyticsConfig) &&
        Objects.equals(this.datadogConfig, logForwardingConfigPart.datadogConfig) &&
        Objects.equals(this.elasticsearchConfig, logForwardingConfigPart.elasticsearchConfig) &&
        Objects.equals(this.jsonOutput, logForwardingConfigPart.jsonOutput) &&
        Objects.equals(this.loganEnable, logForwardingConfigPart.loganEnable) &&
        Objects.equals(this.loganUrl, logForwardingConfigPart.loganUrl) &&
        Objects.equals(this.logstashConfig, logForwardingConfigPart.logstashConfig) &&
        Objects.equals(this.logzIoConfig, logForwardingConfigPart.logzIoConfig) &&
        Objects.equals(this.pullIntervalSec, logForwardingConfigPart.pullIntervalSec) &&
        Objects.equals(this.splunkConfig, logForwardingConfigPart.splunkConfig) &&
        Objects.equals(this.syslogConfig, logForwardingConfigPart.syslogConfig) &&
        Objects.equals(this.targetLogType, logForwardingConfigPart.targetLogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsS3Config, azureAnalyticsConfig, datadogConfig, elasticsearchConfig, jsonOutput, loganEnable, loganUrl, logstashConfig, logzIoConfig, pullIntervalSec, splunkConfig, syslogConfig, targetLogType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogForwardingConfigPart {\n");
    sb.append("    awsS3Config: ").append(toIndentedString(awsS3Config)).append("\n");
    sb.append("    azureAnalyticsConfig: ").append(toIndentedString(azureAnalyticsConfig)).append("\n");
    sb.append("    datadogConfig: ").append(toIndentedString(datadogConfig)).append("\n");
    sb.append("    elasticsearchConfig: ").append(toIndentedString(elasticsearchConfig)).append("\n");
    sb.append("    jsonOutput: ").append(toIndentedString(jsonOutput)).append("\n");
    sb.append("    loganEnable: ").append(toIndentedString(loganEnable)).append("\n");
    sb.append("    loganUrl: ").append(toIndentedString(loganUrl)).append("\n");
    sb.append("    logstashConfig: ").append(toIndentedString(logstashConfig)).append("\n");
    sb.append("    logzIoConfig: ").append(toIndentedString(logzIoConfig)).append("\n");
    sb.append("    pullIntervalSec: ").append(toIndentedString(pullIntervalSec)).append("\n");
    sb.append("    splunkConfig: ").append(toIndentedString(splunkConfig)).append("\n");
    sb.append("    syslogConfig: ").append(toIndentedString(syslogConfig)).append("\n");
    sb.append("    targetLogType: ").append(toIndentedString(targetLogType)).append("\n");
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

