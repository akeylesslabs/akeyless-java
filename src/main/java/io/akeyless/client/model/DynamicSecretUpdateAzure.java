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
 * dynamicSecretUpdateAzure is a command that updates azure dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateAzure is a command that updates azure dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateAzure {
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

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FIXED_USER_CLAIM_KEYNAME = "fixed-user-claim-keyname";
  @SerializedName(SERIALIZED_NAME_FIXED_USER_CLAIM_KEYNAME)
  private String fixedUserClaimKeyname = "false";

  public static final String SERIALIZED_NAME_FIXED_USER_ONLY = "fixed-user-only";
  @SerializedName(SERIALIZED_NAME_FIXED_USER_ONLY)
  private Boolean fixedUserOnly = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = true;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

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
  private Boolean userProgrammaticAccess = false;

  public static final String SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID = "user-role-template-id";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID)
  private String userRoleTemplateId;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public DynamicSecretUpdateAzure() { 
  }

  public DynamicSecretUpdateAzure appObjId(String appObjId) {
    
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


  public DynamicSecretUpdateAzure azureClientId(String azureClientId) {
    
    this.azureClientId = azureClientId;
    return this;
  }

   /**
   * Azure Client ID
   * @return azureClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Client ID")

  public String getAzureClientId() {
    return azureClientId;
  }


  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }


  public DynamicSecretUpdateAzure azureClientSecret(String azureClientSecret) {
    
    this.azureClientSecret = azureClientSecret;
    return this;
  }

   /**
   * Azure Client Secret
   * @return azureClientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Client Secret")

  public String getAzureClientSecret() {
    return azureClientSecret;
  }


  public void setAzureClientSecret(String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
  }


  public DynamicSecretUpdateAzure azureTenantId(String azureTenantId) {
    
    this.azureTenantId = azureTenantId;
    return this;
  }

   /**
   * Azure Tenant ID
   * @return azureTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Tenant ID")

  public String getAzureTenantId() {
    return azureTenantId;
  }


  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }


  public DynamicSecretUpdateAzure deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateAzure description(String description) {
    
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


  public DynamicSecretUpdateAzure fixedUserClaimKeyname(String fixedUserClaimKeyname) {
    
    this.fixedUserClaimKeyname = fixedUserClaimKeyname;
    return this;
  }

   /**
   * FixedUserClaimKeyname
   * @return fixedUserClaimKeyname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FixedUserClaimKeyname")

  public String getFixedUserClaimKeyname() {
    return fixedUserClaimKeyname;
  }


  public void setFixedUserClaimKeyname(String fixedUserClaimKeyname) {
    this.fixedUserClaimKeyname = fixedUserClaimKeyname;
  }


  public DynamicSecretUpdateAzure fixedUserOnly(Boolean fixedUserOnly) {
    
    this.fixedUserOnly = fixedUserOnly;
    return this;
  }

   /**
   * Fixed user
   * @return fixedUserOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed user")

  public Boolean getFixedUserOnly() {
    return fixedUserOnly;
  }


  public void setFixedUserOnly(Boolean fixedUserOnly) {
    this.fixedUserOnly = fixedUserOnly;
  }


  public DynamicSecretUpdateAzure json(Boolean json) {
    
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


  public DynamicSecretUpdateAzure name(String name) {
    
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


  public DynamicSecretUpdateAzure newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateAzure passwordLength(String passwordLength) {
    
    this.passwordLength = passwordLength;
    return this;
  }

   /**
   * The length of the password to be generated
   * @return passwordLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of the password to be generated")

  public String getPasswordLength() {
    return passwordLength;
  }


  public void setPasswordLength(String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretUpdateAzure producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public DynamicSecretUpdateAzure secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable secure remote access [true/false]")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public DynamicSecretUpdateAzure secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Web Secure Remote Access")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public DynamicSecretUpdateAzure secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Secure browser via Akeyless Web Access Bastion
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure browser via Akeyless Web Access Bastion")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public DynamicSecretUpdateAzure secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Web-Proxy via Akeyless Web Access Bastion
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Web-Proxy via Akeyless Web Access Bastion")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public DynamicSecretUpdateAzure tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateAzure addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretUpdateAzure targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretUpdateAzure token(String token) {
    
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


  public DynamicSecretUpdateAzure uidToken(String uidToken) {
    
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


  public DynamicSecretUpdateAzure userGroupObjId(String userGroupObjId) {
    
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


  public DynamicSecretUpdateAzure userPortalAccess(Boolean userPortalAccess) {
    
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


  public DynamicSecretUpdateAzure userPrincipalName(String userPrincipalName) {
    
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


  public DynamicSecretUpdateAzure userProgrammaticAccess(Boolean userProgrammaticAccess) {
    
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


  public DynamicSecretUpdateAzure userRoleTemplateId(String userRoleTemplateId) {
    
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


  public DynamicSecretUpdateAzure userTtl(String userTtl) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretUpdateAzure dynamicSecretUpdateAzure = (DynamicSecretUpdateAzure) o;
    return Objects.equals(this.appObjId, dynamicSecretUpdateAzure.appObjId) &&
        Objects.equals(this.azureClientId, dynamicSecretUpdateAzure.azureClientId) &&
        Objects.equals(this.azureClientSecret, dynamicSecretUpdateAzure.azureClientSecret) &&
        Objects.equals(this.azureTenantId, dynamicSecretUpdateAzure.azureTenantId) &&
        Objects.equals(this.deleteProtection, dynamicSecretUpdateAzure.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateAzure.description) &&
        Objects.equals(this.fixedUserClaimKeyname, dynamicSecretUpdateAzure.fixedUserClaimKeyname) &&
        Objects.equals(this.fixedUserOnly, dynamicSecretUpdateAzure.fixedUserOnly) &&
        Objects.equals(this.json, dynamicSecretUpdateAzure.json) &&
        Objects.equals(this.name, dynamicSecretUpdateAzure.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateAzure.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateAzure.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateAzure.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdateAzure.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdateAzure.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, dynamicSecretUpdateAzure.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, dynamicSecretUpdateAzure.secureAccessWebProxy) &&
        Objects.equals(this.tags, dynamicSecretUpdateAzure.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateAzure.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateAzure.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateAzure.uidToken) &&
        Objects.equals(this.userGroupObjId, dynamicSecretUpdateAzure.userGroupObjId) &&
        Objects.equals(this.userPortalAccess, dynamicSecretUpdateAzure.userPortalAccess) &&
        Objects.equals(this.userPrincipalName, dynamicSecretUpdateAzure.userPrincipalName) &&
        Objects.equals(this.userProgrammaticAccess, dynamicSecretUpdateAzure.userProgrammaticAccess) &&
        Objects.equals(this.userRoleTemplateId, dynamicSecretUpdateAzure.userRoleTemplateId) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateAzure.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appObjId, azureClientId, azureClientSecret, azureTenantId, deleteProtection, description, fixedUserClaimKeyname, fixedUserOnly, json, name, newName, passwordLength, producerEncryptionKeyName, secureAccessEnable, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userGroupObjId, userPortalAccess, userPrincipalName, userProgrammaticAccess, userRoleTemplateId, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateAzure {\n");
    sb.append("    appObjId: ").append(toIndentedString(appObjId)).append("\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureClientSecret: ").append(toIndentedString(azureClientSecret)).append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fixedUserClaimKeyname: ").append(toIndentedString(fixedUserClaimKeyname)).append("\n");
    sb.append("    fixedUserOnly: ").append(toIndentedString(fixedUserOnly)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userGroupObjId: ").append(toIndentedString(userGroupObjId)).append("\n");
    sb.append("    userPortalAccess: ").append(toIndentedString(userPortalAccess)).append("\n");
    sb.append("    userPrincipalName: ").append(toIndentedString(userPrincipalName)).append("\n");
    sb.append("    userProgrammaticAccess: ").append(toIndentedString(userProgrammaticAccess)).append("\n");
    sb.append("    userRoleTemplateId: ").append(toIndentedString(userRoleTemplateId)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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

