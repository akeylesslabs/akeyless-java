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
 * SyslogLogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyslogLogForwardingConfig {
  public static final String SERIALIZED_NAME_SYSLOG_ENABLE_TLS = "syslog_enable_tls";
  @SerializedName(SERIALIZED_NAME_SYSLOG_ENABLE_TLS)
  private Boolean syslogEnableTls;

  public static final String SERIALIZED_NAME_SYSLOG_FORMATTER = "syslog_formatter";
  @SerializedName(SERIALIZED_NAME_SYSLOG_FORMATTER)
  private String syslogFormatter;

  public static final String SERIALIZED_NAME_SYSLOG_HOST = "syslog_host";
  @SerializedName(SERIALIZED_NAME_SYSLOG_HOST)
  private String syslogHost;

  public static final String SERIALIZED_NAME_SYSLOG_NETWORK = "syslog_network";
  @SerializedName(SERIALIZED_NAME_SYSLOG_NETWORK)
  private String syslogNetwork;

  public static final String SERIALIZED_NAME_SYSLOG_TARGET_TAG = "syslog_target_tag";
  @SerializedName(SERIALIZED_NAME_SYSLOG_TARGET_TAG)
  private String syslogTargetTag;

  public static final String SERIALIZED_NAME_SYSLOG_TLS_CERTIFICATE = "syslog_tls_certificate";
  @SerializedName(SERIALIZED_NAME_SYSLOG_TLS_CERTIFICATE)
  private String syslogTlsCertificate;

  public SyslogLogForwardingConfig() { 
  }

  public SyslogLogForwardingConfig syslogEnableTls(Boolean syslogEnableTls) {
    
    this.syslogEnableTls = syslogEnableTls;
    return this;
  }

   /**
   * Get syslogEnableTls
   * @return syslogEnableTls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSyslogEnableTls() {
    return syslogEnableTls;
  }


  public void setSyslogEnableTls(Boolean syslogEnableTls) {
    this.syslogEnableTls = syslogEnableTls;
  }


  public SyslogLogForwardingConfig syslogFormatter(String syslogFormatter) {
    
    this.syslogFormatter = syslogFormatter;
    return this;
  }

   /**
   * Get syslogFormatter
   * @return syslogFormatter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSyslogFormatter() {
    return syslogFormatter;
  }


  public void setSyslogFormatter(String syslogFormatter) {
    this.syslogFormatter = syslogFormatter;
  }


  public SyslogLogForwardingConfig syslogHost(String syslogHost) {
    
    this.syslogHost = syslogHost;
    return this;
  }

   /**
   * Get syslogHost
   * @return syslogHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSyslogHost() {
    return syslogHost;
  }


  public void setSyslogHost(String syslogHost) {
    this.syslogHost = syslogHost;
  }


  public SyslogLogForwardingConfig syslogNetwork(String syslogNetwork) {
    
    this.syslogNetwork = syslogNetwork;
    return this;
  }

   /**
   * Get syslogNetwork
   * @return syslogNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSyslogNetwork() {
    return syslogNetwork;
  }


  public void setSyslogNetwork(String syslogNetwork) {
    this.syslogNetwork = syslogNetwork;
  }


  public SyslogLogForwardingConfig syslogTargetTag(String syslogTargetTag) {
    
    this.syslogTargetTag = syslogTargetTag;
    return this;
  }

   /**
   * Get syslogTargetTag
   * @return syslogTargetTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSyslogTargetTag() {
    return syslogTargetTag;
  }


  public void setSyslogTargetTag(String syslogTargetTag) {
    this.syslogTargetTag = syslogTargetTag;
  }


  public SyslogLogForwardingConfig syslogTlsCertificate(String syslogTlsCertificate) {
    
    this.syslogTlsCertificate = syslogTlsCertificate;
    return this;
  }

   /**
   * Get syslogTlsCertificate
   * @return syslogTlsCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSyslogTlsCertificate() {
    return syslogTlsCertificate;
  }


  public void setSyslogTlsCertificate(String syslogTlsCertificate) {
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

}

