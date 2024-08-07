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
 * TargetCreateGlobalSignAtlas
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetCreateGlobalSignAtlas {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_API_SECRET = "api-secret";
  @SerializedName(SERIALIZED_NAME_API_SECRET)
  private String apiSecret;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_MTLS_CERT_DATA_BASE64 = "mtls-cert-data-base64";
  @SerializedName(SERIALIZED_NAME_MTLS_CERT_DATA_BASE64)
  private String mtlsCertDataBase64;

  public static final String SERIALIZED_NAME_MTLS_KEY_DATA_BASE64 = "mtls-key-data-base64";
  @SerializedName(SERIALIZED_NAME_MTLS_KEY_DATA_BASE64)
  private String mtlsKeyDataBase64;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout = "5m";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public TargetCreateGlobalSignAtlas() { 
  }

  public TargetCreateGlobalSignAtlas apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API Key of the GlobalSign Atlas account
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "API Key of the GlobalSign Atlas account")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public TargetCreateGlobalSignAtlas apiSecret(String apiSecret) {
    
    this.apiSecret = apiSecret;
    return this;
  }

   /**
   * API Secret of the GlobalSign Atlas account
   * @return apiSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "API Secret of the GlobalSign Atlas account")

  public String getApiSecret() {
    return apiSecret;
  }


  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }


  public TargetCreateGlobalSignAtlas description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TargetCreateGlobalSignAtlas json(Boolean json) {
    
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


  public TargetCreateGlobalSignAtlas key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TargetCreateGlobalSignAtlas maxVersions(String maxVersions) {
    
    this.maxVersions = maxVersions;
    return this;
  }

   /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the maximum number of versions, limited by the account settings defaults.")

  public String getMaxVersions() {
    return maxVersions;
  }


  public void setMaxVersions(String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public TargetCreateGlobalSignAtlas mtlsCertDataBase64(String mtlsCertDataBase64) {
    
    this.mtlsCertDataBase64 = mtlsCertDataBase64;
    return this;
  }

   /**
   * Mutual TLS Certificate contents of the GlobalSign Atlas account encoded in base64, either mtls-cert-file-path or mtls-cert-data-base64 must be supplied
   * @return mtlsCertDataBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mutual TLS Certificate contents of the GlobalSign Atlas account encoded in base64, either mtls-cert-file-path or mtls-cert-data-base64 must be supplied")

  public String getMtlsCertDataBase64() {
    return mtlsCertDataBase64;
  }


  public void setMtlsCertDataBase64(String mtlsCertDataBase64) {
    this.mtlsCertDataBase64 = mtlsCertDataBase64;
  }


  public TargetCreateGlobalSignAtlas mtlsKeyDataBase64(String mtlsKeyDataBase64) {
    
    this.mtlsKeyDataBase64 = mtlsKeyDataBase64;
    return this;
  }

   /**
   * Mutual TLS Key contents of the GlobalSign Atlas account encoded in base64, either mtls-key-file-path or mtls-data-base64 must be supplied
   * @return mtlsKeyDataBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mutual TLS Key contents of the GlobalSign Atlas account encoded in base64, either mtls-key-file-path or mtls-data-base64 must be supplied")

  public String getMtlsKeyDataBase64() {
    return mtlsKeyDataBase64;
  }


  public void setMtlsKeyDataBase64(String mtlsKeyDataBase64) {
    this.mtlsKeyDataBase64 = mtlsKeyDataBase64;
  }


  public TargetCreateGlobalSignAtlas name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TargetCreateGlobalSignAtlas timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h.")

  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public TargetCreateGlobalSignAtlas token(String token) {
    
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


  public TargetCreateGlobalSignAtlas uidToken(String uidToken) {
    
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
    TargetCreateGlobalSignAtlas targetCreateGlobalSignAtlas = (TargetCreateGlobalSignAtlas) o;
    return Objects.equals(this.apiKey, targetCreateGlobalSignAtlas.apiKey) &&
        Objects.equals(this.apiSecret, targetCreateGlobalSignAtlas.apiSecret) &&
        Objects.equals(this.description, targetCreateGlobalSignAtlas.description) &&
        Objects.equals(this.json, targetCreateGlobalSignAtlas.json) &&
        Objects.equals(this.key, targetCreateGlobalSignAtlas.key) &&
        Objects.equals(this.maxVersions, targetCreateGlobalSignAtlas.maxVersions) &&
        Objects.equals(this.mtlsCertDataBase64, targetCreateGlobalSignAtlas.mtlsCertDataBase64) &&
        Objects.equals(this.mtlsKeyDataBase64, targetCreateGlobalSignAtlas.mtlsKeyDataBase64) &&
        Objects.equals(this.name, targetCreateGlobalSignAtlas.name) &&
        Objects.equals(this.timeout, targetCreateGlobalSignAtlas.timeout) &&
        Objects.equals(this.token, targetCreateGlobalSignAtlas.token) &&
        Objects.equals(this.uidToken, targetCreateGlobalSignAtlas.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, apiSecret, description, json, key, maxVersions, mtlsCertDataBase64, mtlsKeyDataBase64, name, timeout, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateGlobalSignAtlas {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    mtlsCertDataBase64: ").append(toIndentedString(mtlsCertDataBase64)).append("\n");
    sb.append("    mtlsKeyDataBase64: ").append(toIndentedString(mtlsKeyDataBase64)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

