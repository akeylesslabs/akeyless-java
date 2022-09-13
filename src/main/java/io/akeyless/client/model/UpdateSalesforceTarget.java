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
 * UpdateSalesforceTarget
 */

public class UpdateSalesforceTarget {
  public static final String SERIALIZED_NAME_APP_PRIVATE_KEY_DATA = "app-private-key-data";
  @SerializedName(SERIALIZED_NAME_APP_PRIVATE_KEY_DATA)
  private String appPrivateKeyData;

  public static final String SERIALIZED_NAME_AUTH_FLOW = "auth-flow";
  @SerializedName(SERIALIZED_NAME_AUTH_FLOW)
  private String authFlow;

  public static final String SERIALIZED_NAME_CA_CERT_DATA = "ca-cert-data";
  @SerializedName(SERIALIZED_NAME_CA_CERT_DATA)
  private String caCertData;

  public static final String SERIALIZED_NAME_CA_CERT_NAME = "ca-cert-name";
  @SerializedName(SERIALIZED_NAME_CA_CERT_NAME)
  private String caCertName;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client-secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SECURITY_TOKEN = "security-token";
  @SerializedName(SERIALIZED_NAME_SECURITY_TOKEN)
  private String securityToken;

  public static final String SERIALIZED_NAME_TENANT_URL = "tenant-url";
  @SerializedName(SERIALIZED_NAME_TENANT_URL)
  private String tenantUrl;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion;


  public UpdateSalesforceTarget appPrivateKeyData(String appPrivateKeyData) {
    
    this.appPrivateKeyData = appPrivateKeyData;
    return this;
  }

   /**
   * Base64 encoded PEM of the connected app private key (relevant for JWT auth only)
   * @return appPrivateKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded PEM of the connected app private key (relevant for JWT auth only)")

  public String getAppPrivateKeyData() {
    return appPrivateKeyData;
  }


  public void setAppPrivateKeyData(String appPrivateKeyData) {
    this.appPrivateKeyData = appPrivateKeyData;
  }


  public UpdateSalesforceTarget authFlow(String authFlow) {
    
    this.authFlow = authFlow;
    return this;
  }

   /**
   * type of the auth flow (&#39;jwt&#39; / &#39;user-password&#39;)
   * @return authFlow
  **/
  @ApiModelProperty(required = true, value = "type of the auth flow ('jwt' / 'user-password')")

  public String getAuthFlow() {
    return authFlow;
  }


  public void setAuthFlow(String authFlow) {
    this.authFlow = authFlow;
  }


  public UpdateSalesforceTarget caCertData(String caCertData) {
    
    this.caCertData = caCertData;
    return this;
  }

   /**
   * Base64 encoded PEM cert to use when uploading a new key to Salesforce
   * @return caCertData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded PEM cert to use when uploading a new key to Salesforce")

  public String getCaCertData() {
    return caCertData;
  }


  public void setCaCertData(String caCertData) {
    this.caCertData = caCertData;
  }


  public UpdateSalesforceTarget caCertName(String caCertName) {
    
    this.caCertName = caCertName;
    return this;
  }

   /**
   * name of the certificate in Salesforce tenant to use when uploading new key
   * @return caCertName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the certificate in Salesforce tenant to use when uploading new key")

  public String getCaCertName() {
    return caCertName;
  }


  public void setCaCertName(String caCertName) {
    this.caCertName = caCertName;
  }


  public UpdateSalesforceTarget clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID of the oauth2 app to use for connecting to Salesforce
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Client ID of the oauth2 app to use for connecting to Salesforce")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public UpdateSalesforceTarget clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret of the oauth2 app to use for connecting to Salesforce (required for password flow)
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client secret of the oauth2 app to use for connecting to Salesforce (required for password flow)")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public UpdateSalesforceTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateSalesforceTarget email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the user attached to the oauth2 app used for connecting to Salesforce
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email of the user attached to the oauth2 app used for connecting to Salesforce")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateSalesforceTarget json(Boolean json) {
    
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


  public UpdateSalesforceTarget keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateSalesforceTarget key(String key) {
    
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


  public UpdateSalesforceTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSalesforceTarget newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateSalesforceTarget password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password of the user attached to the oauth2 app used for connecting to Salesforce (required for user-password flow)
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password of the user attached to the oauth2 app used for connecting to Salesforce (required for user-password flow)")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateSalesforceTarget securityToken(String securityToken) {
    
    this.securityToken = securityToken;
    return this;
  }

   /**
   * The security token of the user attached to the oauth2 app used for connecting to Salesforce  (required for user-password flow)
   * @return securityToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The security token of the user attached to the oauth2 app used for connecting to Salesforce  (required for user-password flow)")

  public String getSecurityToken() {
    return securityToken;
  }


  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }


  public UpdateSalesforceTarget tenantUrl(String tenantUrl) {
    
    this.tenantUrl = tenantUrl;
    return this;
  }

   /**
   * Url of the Salesforce tenant
   * @return tenantUrl
  **/
  @ApiModelProperty(required = true, value = "Url of the Salesforce tenant")

  public String getTenantUrl() {
    return tenantUrl;
  }


  public void setTenantUrl(String tenantUrl) {
    this.tenantUrl = tenantUrl;
  }


  public UpdateSalesforceTarget token(String token) {
    
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


  public UpdateSalesforceTarget uidToken(String uidToken) {
    
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


  public UpdateSalesforceTarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Deprecated
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSalesforceTarget updateSalesforceTarget = (UpdateSalesforceTarget) o;
    return Objects.equals(this.appPrivateKeyData, updateSalesforceTarget.appPrivateKeyData) &&
        Objects.equals(this.authFlow, updateSalesforceTarget.authFlow) &&
        Objects.equals(this.caCertData, updateSalesforceTarget.caCertData) &&
        Objects.equals(this.caCertName, updateSalesforceTarget.caCertName) &&
        Objects.equals(this.clientId, updateSalesforceTarget.clientId) &&
        Objects.equals(this.clientSecret, updateSalesforceTarget.clientSecret) &&
        Objects.equals(this.comment, updateSalesforceTarget.comment) &&
        Objects.equals(this.email, updateSalesforceTarget.email) &&
        Objects.equals(this.json, updateSalesforceTarget.json) &&
        Objects.equals(this.keepPrevVersion, updateSalesforceTarget.keepPrevVersion) &&
        Objects.equals(this.key, updateSalesforceTarget.key) &&
        Objects.equals(this.name, updateSalesforceTarget.name) &&
        Objects.equals(this.newName, updateSalesforceTarget.newName) &&
        Objects.equals(this.password, updateSalesforceTarget.password) &&
        Objects.equals(this.securityToken, updateSalesforceTarget.securityToken) &&
        Objects.equals(this.tenantUrl, updateSalesforceTarget.tenantUrl) &&
        Objects.equals(this.token, updateSalesforceTarget.token) &&
        Objects.equals(this.uidToken, updateSalesforceTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateSalesforceTarget.updateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPrivateKeyData, authFlow, caCertData, caCertName, clientId, clientSecret, comment, email, json, keepPrevVersion, key, name, newName, password, securityToken, tenantUrl, token, uidToken, updateVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSalesforceTarget {\n");
    sb.append("    appPrivateKeyData: ").append(toIndentedString(appPrivateKeyData)).append("\n");
    sb.append("    authFlow: ").append(toIndentedString(authFlow)).append("\n");
    sb.append("    caCertData: ").append(toIndentedString(caCertData)).append("\n");
    sb.append("    caCertName: ").append(toIndentedString(caCertName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("    tenantUrl: ").append(toIndentedString(tenantUrl)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

