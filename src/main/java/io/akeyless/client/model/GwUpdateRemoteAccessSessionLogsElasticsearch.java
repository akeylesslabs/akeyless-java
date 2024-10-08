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
 * gwUpdateRemoteAccessSessionLogsElasticsearch is a command that updates session log forwarding config (elasticsearch target)
 */
@ApiModel(description = "gwUpdateRemoteAccessSessionLogsElasticsearch is a command that updates session log forwarding config (elasticsearch target)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GwUpdateRemoteAccessSessionLogsElasticsearch {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_CLOUD_ID = "cloud-id";
  @SerializedName(SERIALIZED_NAME_CLOUD_ID)
  private String cloudId;

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

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private String nodes;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_SERVER_TYPE = "server-type";
  @SerializedName(SERIALIZED_NAME_SERVER_TYPE)
  private String serverType;

  public static final String SERIALIZED_NAME_TLS_CERTIFICATE = "tls-certificate";
  @SerializedName(SERIALIZED_NAME_TLS_CERTIFICATE)
  private String tlsCertificate = "use-existing";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_NAME = "user-name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public GwUpdateRemoteAccessSessionLogsElasticsearch() { 
  }

  public GwUpdateRemoteAccessSessionLogsElasticsearch apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Elasticsearch api key relevant only for api_key auth-type
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch api key relevant only for api_key auth-type")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Elasticsearch auth type [api_key/password]
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch auth type [api_key/password]")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * Elasticsearch cloud id relevant only for cloud server-type
   * @return cloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch cloud id relevant only for cloud server-type")

  public String getCloudId() {
    return cloudId;
  }


  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch enable(String enable) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch enableTls(Boolean enableTls) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Elasticsearch index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch index")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch json(Boolean json) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch nodes(String nodes) {
    
    this.nodes = nodes;
    return this;
  }

   /**
   * Elasticsearch nodes relevant only for nodes server-type
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch nodes relevant only for nodes server-type")

  public String getNodes() {
    return nodes;
  }


  public void setNodes(String nodes) {
    this.nodes = nodes;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch outputFormat(String outputFormat) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Elasticsearch password relevant only for password auth-type
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch password relevant only for password auth-type")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch pullInterval(String pullInterval) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch serverType(String serverType) {
    
    this.serverType = serverType;
    return this;
  }

   /**
   * Elasticsearch server type [cloud/nodes]
   * @return serverType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch server type [cloud/nodes]")

  public String getServerType() {
    return serverType;
  }


  public void setServerType(String serverType) {
    this.serverType = serverType;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch tlsCertificate(String tlsCertificate) {
    
    this.tlsCertificate = tlsCertificate;
    return this;
  }

   /**
   * Elasticsearch tls certificate
   * @return tlsCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch tls certificate")

  public String getTlsCertificate() {
    return tlsCertificate;
  }


  public void setTlsCertificate(String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
  }


  public GwUpdateRemoteAccessSessionLogsElasticsearch token(String token) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch uidToken(String uidToken) {
    
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


  public GwUpdateRemoteAccessSessionLogsElasticsearch userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Elasticsearch user name relevant only for password auth-type
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elasticsearch user name relevant only for password auth-type")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GwUpdateRemoteAccessSessionLogsElasticsearch gwUpdateRemoteAccessSessionLogsElasticsearch = (GwUpdateRemoteAccessSessionLogsElasticsearch) o;
    return Objects.equals(this.apiKey, gwUpdateRemoteAccessSessionLogsElasticsearch.apiKey) &&
        Objects.equals(this.authType, gwUpdateRemoteAccessSessionLogsElasticsearch.authType) &&
        Objects.equals(this.cloudId, gwUpdateRemoteAccessSessionLogsElasticsearch.cloudId) &&
        Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsElasticsearch.enable) &&
        Objects.equals(this.enableTls, gwUpdateRemoteAccessSessionLogsElasticsearch.enableTls) &&
        Objects.equals(this.index, gwUpdateRemoteAccessSessionLogsElasticsearch.index) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsElasticsearch.json) &&
        Objects.equals(this.nodes, gwUpdateRemoteAccessSessionLogsElasticsearch.nodes) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsElasticsearch.outputFormat) &&
        Objects.equals(this.password, gwUpdateRemoteAccessSessionLogsElasticsearch.password) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsElasticsearch.pullInterval) &&
        Objects.equals(this.serverType, gwUpdateRemoteAccessSessionLogsElasticsearch.serverType) &&
        Objects.equals(this.tlsCertificate, gwUpdateRemoteAccessSessionLogsElasticsearch.tlsCertificate) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsElasticsearch.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsElasticsearch.uidToken) &&
        Objects.equals(this.userName, gwUpdateRemoteAccessSessionLogsElasticsearch.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, authType, cloudId, enable, enableTls, index, json, nodes, outputFormat, password, pullInterval, serverType, tlsCertificate, token, uidToken, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsElasticsearch {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    enableTls: ").append(toIndentedString(enableTls)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    tlsCertificate: ").append(toIndentedString(tlsCertificate)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

