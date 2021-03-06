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
 * gatewayCreateProducerAzure is a command that creates azure producer
 */
@ApiModel(description = "gatewayCreateProducerAzure is a command that creates azure producer")

public class GatewayCreateProducerAzure {
  public static final String SERIALIZED_NAME_APP_OBJ_ID = "app-obj-id";
  @SerializedName(SERIALIZED_NAME_APP_OBJ_ID)
  private String appObjId;

  public static final String SERIALIZED_NAME_AZURE_CLIENT_ID = "azure-client-id";
  @SerializedName(SERIALIZED_NAME_AZURE_CLIENT_ID)
  private String azureClientId;

  public static final String SERIALIZED_NAME_AZURE_CLIENT_SECRET = "azure-client-secret";
  @SerializedName(SERIALIZED_NAME_AZURE_CLIENT_SECRET)
  private String azureClientSecret;

  public static final String SERIALIZED_NAME_AZURE_TENANT_ID = "azure-tenant-id";
  @SerializedName(SERIALIZED_NAME_AZURE_TENANT_ID)
  private String azureTenantId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_GROUP_OBJ_ID = "user-group-obj-id";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_OBJ_ID)
  private String userGroupObjId;

  public static final String SERIALIZED_NAME_USER_PORTAL_ACCESS = "user-portal-access";
  @SerializedName(SERIALIZED_NAME_USER_PORTAL_ACCESS)
  private Boolean userPortalAccess = false;

  public static final String SERIALIZED_NAME_USER_PRINCIPAL_NAME = "user-principal-name";
  @SerializedName(SERIALIZED_NAME_USER_PRINCIPAL_NAME)
  private String userPrincipalName;

  public static final String SERIALIZED_NAME_USER_PROGRAMMATIC_ACCESS = "user-programmatic-access";
  @SerializedName(SERIALIZED_NAME_USER_PROGRAMMATIC_ACCESS)
  private Boolean userProgrammaticAccess = true;

  public static final String SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID = "user-role-template-id";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID)
  private String userRoleTemplateId;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public GatewayCreateProducerAzure appObjId(String appObjId) {
    
    this.appObjId = appObjId;
    return this;
  }

   /**
   * Azure App Object Id
   * @return appObjId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure App Object Id")

  public String getAppObjId() {
    return appObjId;
  }


  public void setAppObjId(String appObjId) {
    this.appObjId = appObjId;
  }


  public GatewayCreateProducerAzure azureClientId(String azureClientId) {
    
    this.azureClientId = azureClientId;
    return this;
  }

   /**
   * Azure Client ID
   * @return azureClientId
  **/
  @ApiModelProperty(required = true, value = "Azure Client ID")

  public String getAzureClientId() {
    return azureClientId;
  }


  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }


  public GatewayCreateProducerAzure azureClientSecret(String azureClientSecret) {
    
    this.azureClientSecret = azureClientSecret;
    return this;
  }

   /**
   * Azure Client Secret
   * @return azureClientSecret
  **/
  @ApiModelProperty(required = true, value = "Azure Client Secret")

  public String getAzureClientSecret() {
    return azureClientSecret;
  }


  public void setAzureClientSecret(String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
  }


  public GatewayCreateProducerAzure azureTenantId(String azureTenantId) {
    
    this.azureTenantId = azureTenantId;
    return this;
  }

   /**
   * Azure Tenant ID
   * @return azureTenantId
  **/
  @ApiModelProperty(required = true, value = "Azure Tenant ID")

  public String getAzureTenantId() {
    return azureTenantId;
  }


  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }


  public GatewayCreateProducerAzure name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateProducerAzure password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public GatewayCreateProducerAzure producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayCreateProducerAzure token(String token) {
    
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


  public GatewayCreateProducerAzure uidToken(String uidToken) {
    
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


  public GatewayCreateProducerAzure userGroupObjId(String userGroupObjId) {
    
    this.userGroupObjId = userGroupObjId;
    return this;
  }

   /**
   * User Group Object Id
   * @return userGroupObjId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Group Object Id")

  public String getUserGroupObjId() {
    return userGroupObjId;
  }


  public void setUserGroupObjId(String userGroupObjId) {
    this.userGroupObjId = userGroupObjId;
  }


  public GatewayCreateProducerAzure userPortalAccess(Boolean userPortalAccess) {
    
    this.userPortalAccess = userPortalAccess;
    return this;
  }

   /**
   * Azure User portal access
   * @return userPortalAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure User portal access")

  public Boolean getUserPortalAccess() {
    return userPortalAccess;
  }


  public void setUserPortalAccess(Boolean userPortalAccess) {
    this.userPortalAccess = userPortalAccess;
  }


  public GatewayCreateProducerAzure userPrincipalName(String userPrincipalName) {
    
    this.userPrincipalName = userPrincipalName;
    return this;
  }

   /**
   * User Principal Name
   * @return userPrincipalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Principal Name")

  public String getUserPrincipalName() {
    return userPrincipalName;
  }


  public void setUserPrincipalName(String userPrincipalName) {
    this.userPrincipalName = userPrincipalName;
  }


  public GatewayCreateProducerAzure userProgrammaticAccess(Boolean userProgrammaticAccess) {
    
    this.userProgrammaticAccess = userProgrammaticAccess;
    return this;
  }

   /**
   * Azure User programmatic access
   * @return userProgrammaticAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure User programmatic access")

  public Boolean getUserProgrammaticAccess() {
    return userProgrammaticAccess;
  }


  public void setUserProgrammaticAccess(Boolean userProgrammaticAccess) {
    this.userProgrammaticAccess = userProgrammaticAccess;
  }


  public GatewayCreateProducerAzure userRoleTemplateId(String userRoleTemplateId) {
    
    this.userRoleTemplateId = userRoleTemplateId;
    return this;
  }

   /**
   * User Role Template Id
   * @return userRoleTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Role Template Id")

  public String getUserRoleTemplateId() {
    return userRoleTemplateId;
  }


  public void setUserRoleTemplateId(String userRoleTemplateId) {
    this.userRoleTemplateId = userRoleTemplateId;
  }


  public GatewayCreateProducerAzure userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  public GatewayCreateProducerAzure username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerAzure gatewayCreateProducerAzure = (GatewayCreateProducerAzure) o;
    return Objects.equals(this.appObjId, gatewayCreateProducerAzure.appObjId) &&
        Objects.equals(this.azureClientId, gatewayCreateProducerAzure.azureClientId) &&
        Objects.equals(this.azureClientSecret, gatewayCreateProducerAzure.azureClientSecret) &&
        Objects.equals(this.azureTenantId, gatewayCreateProducerAzure.azureTenantId) &&
        Objects.equals(this.name, gatewayCreateProducerAzure.name) &&
        Objects.equals(this.password, gatewayCreateProducerAzure.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerAzure.producerEncryptionKeyName) &&
        Objects.equals(this.token, gatewayCreateProducerAzure.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerAzure.uidToken) &&
        Objects.equals(this.userGroupObjId, gatewayCreateProducerAzure.userGroupObjId) &&
        Objects.equals(this.userPortalAccess, gatewayCreateProducerAzure.userPortalAccess) &&
        Objects.equals(this.userPrincipalName, gatewayCreateProducerAzure.userPrincipalName) &&
        Objects.equals(this.userProgrammaticAccess, gatewayCreateProducerAzure.userProgrammaticAccess) &&
        Objects.equals(this.userRoleTemplateId, gatewayCreateProducerAzure.userRoleTemplateId) &&
        Objects.equals(this.userTtl, gatewayCreateProducerAzure.userTtl) &&
        Objects.equals(this.username, gatewayCreateProducerAzure.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appObjId, azureClientId, azureClientSecret, azureTenantId, name, password, producerEncryptionKeyName, token, uidToken, userGroupObjId, userPortalAccess, userPrincipalName, userProgrammaticAccess, userRoleTemplateId, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerAzure {\n");
    sb.append("    appObjId: ").append(toIndentedString(appObjId)).append("\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureClientSecret: ").append(toIndentedString(azureClientSecret)).append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userGroupObjId: ").append(toIndentedString(userGroupObjId)).append("\n");
    sb.append("    userPortalAccess: ").append(toIndentedString(userPortalAccess)).append("\n");
    sb.append("    userPrincipalName: ").append(toIndentedString(userPrincipalName)).append("\n");
    sb.append("    userProgrammaticAccess: ").append(toIndentedString(userProgrammaticAccess)).append("\n");
    sb.append("    userRoleTemplateId: ").append(toIndentedString(userRoleTemplateId)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

