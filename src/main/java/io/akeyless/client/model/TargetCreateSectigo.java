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
 * targetCreateSectigo is a command that creates a new Sectigo target
 */
@ApiModel(description = "targetCreateSectigo is a command that creates a new Sectigo target")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetCreateSectigo {
  public static final String SERIALIZED_NAME_CERTIFICATE_PROFILE_ID = "certificate-profile-id";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROFILE_ID)
  private Long certificateProfileId;

  public static final String SERIALIZED_NAME_CUSTOMER_URI = "customer-uri";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_URI)
  private String customerUri;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_REQUESTER = "external-requester";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REQUESTER)
  private String externalRequester;

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

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization-id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Long organizationId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout = "5m";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public TargetCreateSectigo() { 
  }

  public TargetCreateSectigo certificateProfileId(Long certificateProfileId) {
    
    this.certificateProfileId = certificateProfileId;
    return this;
  }

   /**
   * Certificate Profile ID in Sectigo account
   * @return certificateProfileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Certificate Profile ID in Sectigo account")

  public Long getCertificateProfileId() {
    return certificateProfileId;
  }


  public void setCertificateProfileId(Long certificateProfileId) {
    this.certificateProfileId = certificateProfileId;
  }


  public TargetCreateSectigo customerUri(String customerUri) {
    
    this.customerUri = customerUri;
    return this;
  }

   /**
   * Customer Uri of the Sectigo account
   * @return customerUri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Customer Uri of the Sectigo account")

  public String getCustomerUri() {
    return customerUri;
  }


  public void setCustomerUri(String customerUri) {
    this.customerUri = customerUri;
  }


  public TargetCreateSectigo description(String description) {
    
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


  public TargetCreateSectigo externalRequester(String externalRequester) {
    
    this.externalRequester = externalRequester;
    return this;
  }

   /**
   * External Requester - a comma separated list of emails
   * @return externalRequester
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "External Requester - a comma separated list of emails")

  public String getExternalRequester() {
    return externalRequester;
  }


  public void setExternalRequester(String externalRequester) {
    this.externalRequester = externalRequester;
  }


  public TargetCreateSectigo json(Boolean json) {
    
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


  public TargetCreateSectigo key(String key) {
    
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


  public TargetCreateSectigo maxVersions(String maxVersions) {
    
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


  public TargetCreateSectigo name(String name) {
    
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


  public TargetCreateSectigo organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization ID in Sectigo account
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Organization ID in Sectigo account")

  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public TargetCreateSectigo password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the Sectigo account user
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password of the Sectigo account user")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public TargetCreateSectigo timeout(String timeout) {
    
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


  public TargetCreateSectigo token(String token) {
    
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


  public TargetCreateSectigo uidToken(String uidToken) {
    
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


  public TargetCreateSectigo username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username of the Sectigo account
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Username of the Sectigo account")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetCreateSectigo targetCreateSectigo = (TargetCreateSectigo) o;
    return Objects.equals(this.certificateProfileId, targetCreateSectigo.certificateProfileId) &&
        Objects.equals(this.customerUri, targetCreateSectigo.customerUri) &&
        Objects.equals(this.description, targetCreateSectigo.description) &&
        Objects.equals(this.externalRequester, targetCreateSectigo.externalRequester) &&
        Objects.equals(this.json, targetCreateSectigo.json) &&
        Objects.equals(this.key, targetCreateSectigo.key) &&
        Objects.equals(this.maxVersions, targetCreateSectigo.maxVersions) &&
        Objects.equals(this.name, targetCreateSectigo.name) &&
        Objects.equals(this.organizationId, targetCreateSectigo.organizationId) &&
        Objects.equals(this.password, targetCreateSectigo.password) &&
        Objects.equals(this.timeout, targetCreateSectigo.timeout) &&
        Objects.equals(this.token, targetCreateSectigo.token) &&
        Objects.equals(this.uidToken, targetCreateSectigo.uidToken) &&
        Objects.equals(this.username, targetCreateSectigo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateProfileId, customerUri, description, externalRequester, json, key, maxVersions, name, organizationId, password, timeout, token, uidToken, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateSectigo {\n");
    sb.append("    certificateProfileId: ").append(toIndentedString(certificateProfileId)).append("\n");
    sb.append("    customerUri: ").append(toIndentedString(customerUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalRequester: ").append(toIndentedString(externalRequester)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

