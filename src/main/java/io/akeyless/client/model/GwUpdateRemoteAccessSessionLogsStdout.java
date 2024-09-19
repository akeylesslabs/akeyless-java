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
 * gwUpdateRemoteAccessSessionLogsStdout is a command that updates session log forwarding config (stdout target)
 */
@ApiModel(description = "gwUpdateRemoteAccessSessionLogsStdout is a command that updates session log forwarding config (stdout target)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GwUpdateRemoteAccessSessionLogsStdout {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private String enable = "true";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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

  public GwUpdateRemoteAccessSessionLogsStdout() { 
  }

  public GwUpdateRemoteAccessSessionLogsStdout enable(String enable) {
    
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


  public GwUpdateRemoteAccessSessionLogsStdout json(Boolean json) {
    
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


  public GwUpdateRemoteAccessSessionLogsStdout outputFormat(String outputFormat) {
    
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


  public GwUpdateRemoteAccessSessionLogsStdout pullInterval(String pullInterval) {
    
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


  public GwUpdateRemoteAccessSessionLogsStdout token(String token) {
    
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


  public GwUpdateRemoteAccessSessionLogsStdout uidToken(String uidToken) {
    
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
    GwUpdateRemoteAccessSessionLogsStdout gwUpdateRemoteAccessSessionLogsStdout = (GwUpdateRemoteAccessSessionLogsStdout) o;
    return Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsStdout.enable) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsStdout.json) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsStdout.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsStdout.pullInterval) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsStdout.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsStdout.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, json, outputFormat, pullInterval, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsStdout {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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
