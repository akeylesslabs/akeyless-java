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
 * CreateGodaddyTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGodaddyTarget {
  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAP_FQDN = "imap-fqdn";
  @SerializedName(SERIALIZED_NAME_IMAP_FQDN)
  private String imapFqdn;

  public static final String SERIALIZED_NAME_IMAP_PASSWORD = "imap-password";
  @SerializedName(SERIALIZED_NAME_IMAP_PASSWORD)
  private String imapPassword;

  public static final String SERIALIZED_NAME_IMAP_PORT = "imap-port";
  @SerializedName(SERIALIZED_NAME_IMAP_PORT)
  private String imapPort = "993";

  public static final String SERIALIZED_NAME_IMAP_USERNAME = "imap-username";
  @SerializedName(SERIALIZED_NAME_IMAP_USERNAME)
  private String imapUsername;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout = "5m";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateGodaddyTarget() { 
  }

  public CreateGodaddyTarget apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Key of the api credentials to the Godaddy account
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Key of the api credentials to the Godaddy account")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public CreateGodaddyTarget description(String description) {
    
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


  public CreateGodaddyTarget imapFqdn(String imapFqdn) {
    
    this.imapFqdn = imapFqdn;
    return this;
  }

   /**
   * ImapFQDN of the IMAP service, FQDN or IPv4 address. Must be FQDN if the IMAP is using TLS
   * @return imapFqdn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ImapFQDN of the IMAP service, FQDN or IPv4 address. Must be FQDN if the IMAP is using TLS")

  public String getImapFqdn() {
    return imapFqdn;
  }


  public void setImapFqdn(String imapFqdn) {
    this.imapFqdn = imapFqdn;
  }


  public CreateGodaddyTarget imapPassword(String imapPassword) {
    
    this.imapPassword = imapPassword;
    return this;
  }

   /**
   * ImapPassword to access the IMAP service
   * @return imapPassword
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ImapPassword to access the IMAP service")

  public String getImapPassword() {
    return imapPassword;
  }


  public void setImapPassword(String imapPassword) {
    this.imapPassword = imapPassword;
  }


  public CreateGodaddyTarget imapPort(String imapPort) {
    
    this.imapPort = imapPort;
    return this;
  }

   /**
   * ImapPort of the IMAP service
   * @return imapPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ImapPort of the IMAP service")

  public String getImapPort() {
    return imapPort;
  }


  public void setImapPort(String imapPort) {
    this.imapPort = imapPort;
  }


  public CreateGodaddyTarget imapUsername(String imapUsername) {
    
    this.imapUsername = imapUsername;
    return this;
  }

   /**
   * ImapUsername to access the IMAP service
   * @return imapUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ImapUsername to access the IMAP service")

  public String getImapUsername() {
    return imapUsername;
  }


  public void setImapUsername(String imapUsername) {
    this.imapUsername = imapUsername;
  }


  public CreateGodaddyTarget json(Boolean json) {
    
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


  public CreateGodaddyTarget key(String key) {
    
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


  public CreateGodaddyTarget maxVersions(String maxVersions) {
    
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


  public CreateGodaddyTarget name(String name) {
    
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


  public CreateGodaddyTarget secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Secret of the api credentials to the Godaddy account
   * @return secret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret of the api credentials to the Godaddy account")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public CreateGodaddyTarget timeout(String timeout) {
    
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


  public CreateGodaddyTarget token(String token) {
    
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


  public CreateGodaddyTarget uidToken(String uidToken) {
    
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
    CreateGodaddyTarget createGodaddyTarget = (CreateGodaddyTarget) o;
    return Objects.equals(this.apiKey, createGodaddyTarget.apiKey) &&
        Objects.equals(this.description, createGodaddyTarget.description) &&
        Objects.equals(this.imapFqdn, createGodaddyTarget.imapFqdn) &&
        Objects.equals(this.imapPassword, createGodaddyTarget.imapPassword) &&
        Objects.equals(this.imapPort, createGodaddyTarget.imapPort) &&
        Objects.equals(this.imapUsername, createGodaddyTarget.imapUsername) &&
        Objects.equals(this.json, createGodaddyTarget.json) &&
        Objects.equals(this.key, createGodaddyTarget.key) &&
        Objects.equals(this.maxVersions, createGodaddyTarget.maxVersions) &&
        Objects.equals(this.name, createGodaddyTarget.name) &&
        Objects.equals(this.secret, createGodaddyTarget.secret) &&
        Objects.equals(this.timeout, createGodaddyTarget.timeout) &&
        Objects.equals(this.token, createGodaddyTarget.token) &&
        Objects.equals(this.uidToken, createGodaddyTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, description, imapFqdn, imapPassword, imapPort, imapUsername, json, key, maxVersions, name, secret, timeout, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGodaddyTarget {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imapFqdn: ").append(toIndentedString(imapFqdn)).append("\n");
    sb.append("    imapPassword: ").append(toIndentedString(imapPassword)).append("\n");
    sb.append("    imapPort: ").append(toIndentedString(imapPort)).append("\n");
    sb.append("    imapUsername: ").append(toIndentedString(imapUsername)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

