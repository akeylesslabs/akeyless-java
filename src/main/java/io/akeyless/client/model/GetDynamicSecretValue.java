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
import java.util.ArrayList;
import java.util.List;

/**
 * GetDynamicSecretValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDynamicSecretValue {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout = 15l;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public GetDynamicSecretValue() { 
  }

  public GetDynamicSecretValue args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public GetDynamicSecretValue addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Optional arguments as key&#x3D;value pairs or JSON strings, e.g - \\\&quot;--args&#x3D;csr&#x3D;base64_encoded_csr --args&#x3D;common_name&#x3D;bar\\\&quot; or args&#x3D;&#39;{\\\&quot;csr\\\&quot;:\\\&quot;base64_encoded_csr\\\&quot;}. It is possible to combine both formats.&#39;
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional arguments as key=value pairs or JSON strings, e.g - \\\"--args=csr=base64_encoded_csr --args=common_name=bar\\\" or args='{\\\"csr\\\":\\\"base64_encoded_csr\\\"}. It is possible to combine both formats.'")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public GetDynamicSecretValue host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public GetDynamicSecretValue json(Boolean json) {
    
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


  public GetDynamicSecretValue name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetDynamicSecretValue target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Target Name
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target Name")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public GetDynamicSecretValue timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout in seconds
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout in seconds")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public GetDynamicSecretValue token(String token) {
    
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


  public GetDynamicSecretValue uidToken(String uidToken) {
    
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
    GetDynamicSecretValue getDynamicSecretValue = (GetDynamicSecretValue) o;
    return Objects.equals(this.args, getDynamicSecretValue.args) &&
        Objects.equals(this.host, getDynamicSecretValue.host) &&
        Objects.equals(this.json, getDynamicSecretValue.json) &&
        Objects.equals(this.name, getDynamicSecretValue.name) &&
        Objects.equals(this.target, getDynamicSecretValue.target) &&
        Objects.equals(this.timeout, getDynamicSecretValue.timeout) &&
        Objects.equals(this.token, getDynamicSecretValue.token) &&
        Objects.equals(this.uidToken, getDynamicSecretValue.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, host, json, name, target, timeout, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDynamicSecretValue {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

