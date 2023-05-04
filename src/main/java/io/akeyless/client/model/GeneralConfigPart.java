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
 * GeneralConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeneralConfigPart {
  public static final String SERIALIZED_NAME_AKEYLESS_URL = "akeyless_url";
  @SerializedName(SERIALIZED_NAME_AKEYLESS_URL)
  private String akeylessUrl;

  public static final String SERIALIZED_NAME_API_TOKEN_TTL = "api_token_ttl";
  @SerializedName(SERIALIZED_NAME_API_TOKEN_TTL)
  private String apiTokenTtl;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENABLE_SNI_PROXY = "enable_sni_proxy";
  @SerializedName(SERIALIZED_NAME_ENABLE_SNI_PROXY)
  private Boolean enableSniProxy;

  public static final String SERIALIZED_NAME_ENABLE_TLS = "enable_tls";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS)
  private Boolean enableTls;

  public static final String SERIALIZED_NAME_ENABLE_TLS_CONFIGURE = "enable_tls_configure";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS_CONFIGURE)
  private Boolean enableTlsConfigure;

  public static final String SERIALIZED_NAME_ENABLE_TLS_CURL = "enable_tls_curl";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS_CURL)
  private Boolean enableTlsCurl;

  public static final String SERIALIZED_NAME_ENABLE_TLS_HVP = "enable_tls_hvp";
  @SerializedName(SERIALIZED_NAME_ENABLE_TLS_HVP)
  private Boolean enableTlsHvp;

  public static final String SERIALIZED_NAME_GW_CLUSTER_URL = "gw_cluster_url";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_URL)
  private String gwClusterUrl;

  public static final String SERIALIZED_NAME_TCP_PORT = "tcp_port";
  @SerializedName(SERIALIZED_NAME_TCP_PORT)
  private String tcpPort;

  public static final String SERIALIZED_NAME_TLS_CERT = "tls_cert";
  @SerializedName(SERIALIZED_NAME_TLS_CERT)
  private String tlsCert;

  public static final String SERIALIZED_NAME_TLS_KEY = "tls_key";
  @SerializedName(SERIALIZED_NAME_TLS_KEY)
  private String tlsKey;

  public GeneralConfigPart() { 
  }

  public GeneralConfigPart akeylessUrl(String akeylessUrl) {
    
    this.akeylessUrl = akeylessUrl;
    return this;
  }

   /**
   * AkeylessUrl is here for BC only. Gator will still return it if it exists in the configuration, but new clients (&gt;&#x3D;2.34.0) will ignore it and override it with what exists in their local file. It will no longer be sent to Gator for update, so new clusters will only have the default value saved in the DB.
   * @return akeylessUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AkeylessUrl is here for BC only. Gator will still return it if it exists in the configuration, but new clients (>=2.34.0) will ignore it and override it with what exists in their local file. It will no longer be sent to Gator for update, so new clusters will only have the default value saved in the DB.")

  public String getAkeylessUrl() {
    return akeylessUrl;
  }


  public void setAkeylessUrl(String akeylessUrl) {
    this.akeylessUrl = akeylessUrl;
  }


  public GeneralConfigPart apiTokenTtl(String apiTokenTtl) {
    
    this.apiTokenTtl = apiTokenTtl;
    return this;
  }

   /**
   * Get apiTokenTtl
   * @return apiTokenTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiTokenTtl() {
    return apiTokenTtl;
  }


  public void setApiTokenTtl(String apiTokenTtl) {
    this.apiTokenTtl = apiTokenTtl;
  }


  public GeneralConfigPart displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GeneralConfigPart enableSniProxy(Boolean enableSniProxy) {
    
    this.enableSniProxy = enableSniProxy;
    return this;
  }

   /**
   * Get enableSniProxy
   * @return enableSniProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableSniProxy() {
    return enableSniProxy;
  }


  public void setEnableSniProxy(Boolean enableSniProxy) {
    this.enableSniProxy = enableSniProxy;
  }


  public GeneralConfigPart enableTls(Boolean enableTls) {
    
    this.enableTls = enableTls;
    return this;
  }

   /**
   * Get enableTls
   * @return enableTls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableTls() {
    return enableTls;
  }


  public void setEnableTls(Boolean enableTls) {
    this.enableTls = enableTls;
  }


  public GeneralConfigPart enableTlsConfigure(Boolean enableTlsConfigure) {
    
    this.enableTlsConfigure = enableTlsConfigure;
    return this;
  }

   /**
   * Get enableTlsConfigure
   * @return enableTlsConfigure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableTlsConfigure() {
    return enableTlsConfigure;
  }


  public void setEnableTlsConfigure(Boolean enableTlsConfigure) {
    this.enableTlsConfigure = enableTlsConfigure;
  }


  public GeneralConfigPart enableTlsCurl(Boolean enableTlsCurl) {
    
    this.enableTlsCurl = enableTlsCurl;
    return this;
  }

   /**
   * Get enableTlsCurl
   * @return enableTlsCurl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableTlsCurl() {
    return enableTlsCurl;
  }


  public void setEnableTlsCurl(Boolean enableTlsCurl) {
    this.enableTlsCurl = enableTlsCurl;
  }


  public GeneralConfigPart enableTlsHvp(Boolean enableTlsHvp) {
    
    this.enableTlsHvp = enableTlsHvp;
    return this;
  }

   /**
   * Get enableTlsHvp
   * @return enableTlsHvp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableTlsHvp() {
    return enableTlsHvp;
  }


  public void setEnableTlsHvp(Boolean enableTlsHvp) {
    this.enableTlsHvp = enableTlsHvp;
  }


  public GeneralConfigPart gwClusterUrl(String gwClusterUrl) {
    
    this.gwClusterUrl = gwClusterUrl;
    return this;
  }

   /**
   * Get gwClusterUrl
   * @return gwClusterUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGwClusterUrl() {
    return gwClusterUrl;
  }


  public void setGwClusterUrl(String gwClusterUrl) {
    this.gwClusterUrl = gwClusterUrl;
  }


  public GeneralConfigPart tcpPort(String tcpPort) {
    
    this.tcpPort = tcpPort;
    return this;
  }

   /**
   * Get tcpPort
   * @return tcpPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTcpPort() {
    return tcpPort;
  }


  public void setTcpPort(String tcpPort) {
    this.tcpPort = tcpPort;
  }


  public GeneralConfigPart tlsCert(String tlsCert) {
    
    this.tlsCert = tlsCert;
    return this;
  }

   /**
   * Get tlsCert
   * @return tlsCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTlsCert() {
    return tlsCert;
  }


  public void setTlsCert(String tlsCert) {
    this.tlsCert = tlsCert;
  }


  public GeneralConfigPart tlsKey(String tlsKey) {
    
    this.tlsKey = tlsKey;
    return this;
  }

   /**
   * Get tlsKey
   * @return tlsKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTlsKey() {
    return tlsKey;
  }


  public void setTlsKey(String tlsKey) {
    this.tlsKey = tlsKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralConfigPart generalConfigPart = (GeneralConfigPart) o;
    return Objects.equals(this.akeylessUrl, generalConfigPart.akeylessUrl) &&
        Objects.equals(this.apiTokenTtl, generalConfigPart.apiTokenTtl) &&
        Objects.equals(this.displayName, generalConfigPart.displayName) &&
        Objects.equals(this.enableSniProxy, generalConfigPart.enableSniProxy) &&
        Objects.equals(this.enableTls, generalConfigPart.enableTls) &&
        Objects.equals(this.enableTlsConfigure, generalConfigPart.enableTlsConfigure) &&
        Objects.equals(this.enableTlsCurl, generalConfigPart.enableTlsCurl) &&
        Objects.equals(this.enableTlsHvp, generalConfigPart.enableTlsHvp) &&
        Objects.equals(this.gwClusterUrl, generalConfigPart.gwClusterUrl) &&
        Objects.equals(this.tcpPort, generalConfigPart.tcpPort) &&
        Objects.equals(this.tlsCert, generalConfigPart.tlsCert) &&
        Objects.equals(this.tlsKey, generalConfigPart.tlsKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(akeylessUrl, apiTokenTtl, displayName, enableSniProxy, enableTls, enableTlsConfigure, enableTlsCurl, enableTlsHvp, gwClusterUrl, tcpPort, tlsCert, tlsKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralConfigPart {\n");
    sb.append("    akeylessUrl: ").append(toIndentedString(akeylessUrl)).append("\n");
    sb.append("    apiTokenTtl: ").append(toIndentedString(apiTokenTtl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enableSniProxy: ").append(toIndentedString(enableSniProxy)).append("\n");
    sb.append("    enableTls: ").append(toIndentedString(enableTls)).append("\n");
    sb.append("    enableTlsConfigure: ").append(toIndentedString(enableTlsConfigure)).append("\n");
    sb.append("    enableTlsCurl: ").append(toIndentedString(enableTlsCurl)).append("\n");
    sb.append("    enableTlsHvp: ").append(toIndentedString(enableTlsHvp)).append("\n");
    sb.append("    gwClusterUrl: ").append(toIndentedString(gwClusterUrl)).append("\n");
    sb.append("    tcpPort: ").append(toIndentedString(tcpPort)).append("\n");
    sb.append("    tlsCert: ").append(toIndentedString(tlsCert)).append("\n");
    sb.append("    tlsKey: ").append(toIndentedString(tlsKey)).append("\n");
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

