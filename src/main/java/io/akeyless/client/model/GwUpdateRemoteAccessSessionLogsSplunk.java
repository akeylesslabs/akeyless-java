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
 * gwUpdateRemoteAccessSessionLogsSplunk is a command that updates session log forwarding config (splunk target)
 */
@ApiModel(description = "gwUpdateRemoteAccessSessionLogsSplunk is a command that updates session log forwarding config (splunk target)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GwUpdateRemoteAccessSessionLogsSplunk {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private String enable = "true";

  public static final String SERIALIZED_NAME_ENABLE_TLS = "enable-tls";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS)
  private Boolean enableTls;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = "use-existing";

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source-type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType = "use-existing";

  public static final String SERIALIZED_NAME_SPLUNK_TOKEN = "splunk-token";
  @SerializedName(SERIALIZED_NAME_SPLUNK_TOKEN)
  private String splunkToken;

  public static final String SERIALIZED_NAME_SPLUNK_URL = "splunk-url";
  @SerializedName(SERIALIZED_NAME_SPLUNK_URL)
  private String splunkUrl;

  public static final String SERIALIZED_NAME_TLS_CERTIFICATE = "tls-certificate";
  @SerializedName(SERIALIZED_NAME_TLS_CERTIFICATE)
  private String tlsCertificate = "use-existing";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public GwUpdateRemoteAccessSessionLogsSplunk() { 
  }

  public GwUpdateRemoteAccessSessionLogsSplunk enable(String enable) {
    
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


  public GwUpdateRemoteAccessSessionLogsSplunk enableTls(Boolean enableTls) {
    
    this.enableTls = enableTls;
    return this;
  }

   /**
   * Enable tls
   * @return enableTls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable tls")

  public Boolean getEnableTls() {
    return enableTls;
  }


  public void setEnableTls(Boolean enableTls) {
    this.enableTls = enableTls;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Splunk index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk index")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk json(Boolean json) {
    
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


  public GwUpdateRemoteAccessSessionLogsSplunk outputFormat(String outputFormat) {
    
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


  public GwUpdateRemoteAccessSessionLogsSplunk pullInterval(String pullInterval) {
    
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


  public GwUpdateRemoteAccessSessionLogsSplunk source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Splunk source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk source")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Splunk source type
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk source type")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk splunkToken(String splunkToken) {
    
    this.splunkToken = splunkToken;
    return this;
  }

   /**
   * Splunk token
   * @return splunkToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk token")

  public String getSplunkToken() {
    return splunkToken;
  }


  public void setSplunkToken(String splunkToken) {
    this.splunkToken = splunkToken;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk splunkUrl(String splunkUrl) {
    
    this.splunkUrl = splunkUrl;
    return this;
  }

   /**
   * Splunk server URL
   * @return splunkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk server URL")

  public String getSplunkUrl() {
    return splunkUrl;
  }


  public void setSplunkUrl(String splunkUrl) {
    this.splunkUrl = splunkUrl;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk tlsCertificate(String tlsCertificate) {
    
    this.tlsCertificate = tlsCertificate;
    return this;
  }

   /**
   * Splunk tls certificate
   * @return tlsCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Splunk tls certificate")

  public String getTlsCertificate() {
    return tlsCertificate;
  }


  public void setTlsCertificate(String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
  }


  public GwUpdateRemoteAccessSessionLogsSplunk token(String token) {
    
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


  public GwUpdateRemoteAccessSessionLogsSplunk uidToken(String uidToken) {
    
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

}

