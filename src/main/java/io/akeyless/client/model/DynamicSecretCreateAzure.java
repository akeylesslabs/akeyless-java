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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * dynamicSecretCreateAzure is a command that creates azure dynamic secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretCreateAzure {
  public static final String SERIALIZED_NAME_APP_OBJ_ID = "app-obj-id";
  @SerializedName(SERIALIZED_NAME_APP_OBJ_ID)
  @javax.annotation.Nullable
  private String appObjId;

  public static final String SERIALIZED_NAME_AZURE_CLIENT_ID = "azure-client-id";
  @SerializedName(SERIALIZED_NAME_AZURE_CLIENT_ID)
  @javax.annotation.Nullable
  private String azureClientId;

  public static final String SERIALIZED_NAME_AZURE_CLIENT_SECRET = "azure-client-secret";
  @SerializedName(SERIALIZED_NAME_AZURE_CLIENT_SECRET)
  @javax.annotation.Nullable
  private String azureClientSecret;

  public static final String SERIALIZED_NAME_AZURE_TENANT_ID = "azure-tenant-id";
  @SerializedName(SERIALIZED_NAME_AZURE_TENANT_ID)
  @javax.annotation.Nullable
  private String azureTenantId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_FIXED_USER_CLAIM_KEYNAME = "fixed-user-claim-keyname";
  @SerializedName(SERIALIZED_NAME_FIXED_USER_CLAIM_KEYNAME)
  @javax.annotation.Nullable
  private String fixedUserClaimKeyname = "false";

  public static final String SERIALIZED_NAME_FIXED_USER_ONLY = "fixed-user-only";
  @SerializedName(SERIALIZED_NAME_FIXED_USER_ONLY)
  @javax.annotation.Nullable
  private Boolean fixedUserOnly = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  @javax.annotation.Nullable
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_URL = "secure-access-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_URL)
  @javax.annotation.Nullable
  private String secureAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  @javax.annotation.Nullable
  private Boolean secureAccessWeb = true;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  @javax.annotation.Nullable
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  @javax.annotation.Nullable
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_GROUP_OBJ_ID = "user-group-obj-id";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_OBJ_ID)
  @javax.annotation.Nullable
  private String userGroupObjId;

  public static final String SERIALIZED_NAME_USER_PORTAL_ACCESS = "user-portal-access";
  @SerializedName(SERIALIZED_NAME_USER_PORTAL_ACCESS)
  @javax.annotation.Nullable
  private Boolean userPortalAccess = false;

  public static final String SERIALIZED_NAME_USER_PRINCIPAL_NAME = "user-principal-name";
  @SerializedName(SERIALIZED_NAME_USER_PRINCIPAL_NAME)
  @javax.annotation.Nullable
  private String userPrincipalName;

  public static final String SERIALIZED_NAME_USER_PROGRAMMATIC_ACCESS = "user-programmatic-access";
  @SerializedName(SERIALIZED_NAME_USER_PROGRAMMATIC_ACCESS)
  @javax.annotation.Nullable
  private Boolean userProgrammaticAccess = false;

  public static final String SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID = "user-role-template-id";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_TEMPLATE_ID)
  @javax.annotation.Nullable
  private String userRoleTemplateId;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public DynamicSecretCreateAzure() {
  }

  public DynamicSecretCreateAzure appObjId(@javax.annotation.Nullable String appObjId) {
    this.appObjId = appObjId;
    return this;
  }

  /**
   * Azure App Object Id
   * @return appObjId
   */
  @javax.annotation.Nullable
  public String getAppObjId() {
    return appObjId;
  }

  public void setAppObjId(@javax.annotation.Nullable String appObjId) {
    this.appObjId = appObjId;
  }


  public DynamicSecretCreateAzure azureClientId(@javax.annotation.Nullable String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  /**
   * Azure Client ID
   * @return azureClientId
   */
  @javax.annotation.Nullable
  public String getAzureClientId() {
    return azureClientId;
  }

  public void setAzureClientId(@javax.annotation.Nullable String azureClientId) {
    this.azureClientId = azureClientId;
  }


  public DynamicSecretCreateAzure azureClientSecret(@javax.annotation.Nullable String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
    return this;
  }

  /**
   * Azure Client Secret
   * @return azureClientSecret
   */
  @javax.annotation.Nullable
  public String getAzureClientSecret() {
    return azureClientSecret;
  }

  public void setAzureClientSecret(@javax.annotation.Nullable String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
  }


  public DynamicSecretCreateAzure azureTenantId(@javax.annotation.Nullable String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * Azure Tenant ID
   * @return azureTenantId
   */
  @javax.annotation.Nullable
  public String getAzureTenantId() {
    return azureTenantId;
  }

  public void setAzureTenantId(@javax.annotation.Nullable String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }


  public DynamicSecretCreateAzure deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretCreateAzure description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public DynamicSecretCreateAzure fixedUserClaimKeyname(@javax.annotation.Nullable String fixedUserClaimKeyname) {
    this.fixedUserClaimKeyname = fixedUserClaimKeyname;
    return this;
  }

  /**
   * FixedUserClaimKeyname
   * @return fixedUserClaimKeyname
   */
  @javax.annotation.Nullable
  public String getFixedUserClaimKeyname() {
    return fixedUserClaimKeyname;
  }

  public void setFixedUserClaimKeyname(@javax.annotation.Nullable String fixedUserClaimKeyname) {
    this.fixedUserClaimKeyname = fixedUserClaimKeyname;
  }


  public DynamicSecretCreateAzure fixedUserOnly(@javax.annotation.Nullable Boolean fixedUserOnly) {
    this.fixedUserOnly = fixedUserOnly;
    return this;
  }

  /**
   * Fixed user
   * @return fixedUserOnly
   */
  @javax.annotation.Nullable
  public Boolean getFixedUserOnly() {
    return fixedUserOnly;
  }

  public void setFixedUserOnly(@javax.annotation.Nullable Boolean fixedUserOnly) {
    this.fixedUserOnly = fixedUserOnly;
  }


  public DynamicSecretCreateAzure json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public DynamicSecretCreateAzure name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DynamicSecretCreateAzure passwordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
    return this;
  }

  /**
   * The length of the password to be generated
   * @return passwordLength
   */
  @javax.annotation.Nullable
  public String getPasswordLength() {
    return passwordLength;
  }

  public void setPasswordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretCreateAzure producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic secret encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretCreateAzure secureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

  /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
   */
  @javax.annotation.Nullable
  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }

  public void setSecureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public DynamicSecretCreateAzure secureAccessUrl(@javax.annotation.Nullable String secureAccessUrl) {
    this.secureAccessUrl = secureAccessUrl;
    return this;
  }

  /**
   * Destination URL to inject secrets
   * @return secureAccessUrl
   */
  @javax.annotation.Nullable
  public String getSecureAccessUrl() {
    return secureAccessUrl;
  }

  public void setSecureAccessUrl(@javax.annotation.Nullable String secureAccessUrl) {
    this.secureAccessUrl = secureAccessUrl;
  }


  public DynamicSecretCreateAzure secureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

  /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }

  public void setSecureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public DynamicSecretCreateAzure secureAccessWebBrowsing(@javax.annotation.Nullable Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

  /**
   * Secure browser via Akeyless&#39;s Secure Remote Access (SRA)
   * @return secureAccessWebBrowsing
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }

  public void setSecureAccessWebBrowsing(@javax.annotation.Nullable Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public DynamicSecretCreateAzure secureAccessWebProxy(@javax.annotation.Nullable Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

  /**
   * Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA)
   * @return secureAccessWebProxy
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }

  public void setSecureAccessWebProxy(@javax.annotation.Nullable Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public DynamicSecretCreateAzure tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateAzure addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretCreateAzure targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretCreateAzure token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public DynamicSecretCreateAzure uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }


  public DynamicSecretCreateAzure userGroupObjId(@javax.annotation.Nullable String userGroupObjId) {
    this.userGroupObjId = userGroupObjId;
    return this;
  }

  /**
   * User Group Object Id
   * @return userGroupObjId
   */
  @javax.annotation.Nullable
  public String getUserGroupObjId() {
    return userGroupObjId;
  }

  public void setUserGroupObjId(@javax.annotation.Nullable String userGroupObjId) {
    this.userGroupObjId = userGroupObjId;
  }


  public DynamicSecretCreateAzure userPortalAccess(@javax.annotation.Nullable Boolean userPortalAccess) {
    this.userPortalAccess = userPortalAccess;
    return this;
  }

  /**
   * Azure User portal access
   * @return userPortalAccess
   */
  @javax.annotation.Nullable
  public Boolean getUserPortalAccess() {
    return userPortalAccess;
  }

  public void setUserPortalAccess(@javax.annotation.Nullable Boolean userPortalAccess) {
    this.userPortalAccess = userPortalAccess;
  }


  public DynamicSecretCreateAzure userPrincipalName(@javax.annotation.Nullable String userPrincipalName) {
    this.userPrincipalName = userPrincipalName;
    return this;
  }

  /**
   * User Principal Name
   * @return userPrincipalName
   */
  @javax.annotation.Nullable
  public String getUserPrincipalName() {
    return userPrincipalName;
  }

  public void setUserPrincipalName(@javax.annotation.Nullable String userPrincipalName) {
    this.userPrincipalName = userPrincipalName;
  }


  public DynamicSecretCreateAzure userProgrammaticAccess(@javax.annotation.Nullable Boolean userProgrammaticAccess) {
    this.userProgrammaticAccess = userProgrammaticAccess;
    return this;
  }

  /**
   * Azure User programmatic access
   * @return userProgrammaticAccess
   */
  @javax.annotation.Nullable
  public Boolean getUserProgrammaticAccess() {
    return userProgrammaticAccess;
  }

  public void setUserProgrammaticAccess(@javax.annotation.Nullable Boolean userProgrammaticAccess) {
    this.userProgrammaticAccess = userProgrammaticAccess;
  }


  public DynamicSecretCreateAzure userRoleTemplateId(@javax.annotation.Nullable String userRoleTemplateId) {
    this.userRoleTemplateId = userRoleTemplateId;
    return this;
  }

  /**
   * User Role Template Id
   * @return userRoleTemplateId
   */
  @javax.annotation.Nullable
  public String getUserRoleTemplateId() {
    return userRoleTemplateId;
  }

  public void setUserRoleTemplateId(@javax.annotation.Nullable String userRoleTemplateId) {
    this.userRoleTemplateId = userRoleTemplateId;
  }


  public DynamicSecretCreateAzure userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
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
    DynamicSecretCreateAzure dynamicSecretCreateAzure = (DynamicSecretCreateAzure) o;
    return Objects.equals(this.appObjId, dynamicSecretCreateAzure.appObjId) &&
        Objects.equals(this.azureClientId, dynamicSecretCreateAzure.azureClientId) &&
        Objects.equals(this.azureClientSecret, dynamicSecretCreateAzure.azureClientSecret) &&
        Objects.equals(this.azureTenantId, dynamicSecretCreateAzure.azureTenantId) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateAzure.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateAzure.description) &&
        Objects.equals(this.fixedUserClaimKeyname, dynamicSecretCreateAzure.fixedUserClaimKeyname) &&
        Objects.equals(this.fixedUserOnly, dynamicSecretCreateAzure.fixedUserOnly) &&
        Objects.equals(this.json, dynamicSecretCreateAzure.json) &&
        Objects.equals(this.name, dynamicSecretCreateAzure.name) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateAzure.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretCreateAzure.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretCreateAzure.secureAccessEnable) &&
        Objects.equals(this.secureAccessUrl, dynamicSecretCreateAzure.secureAccessUrl) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretCreateAzure.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, dynamicSecretCreateAzure.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, dynamicSecretCreateAzure.secureAccessWebProxy) &&
        Objects.equals(this.tags, dynamicSecretCreateAzure.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateAzure.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateAzure.token) &&
        Objects.equals(this.uidToken, dynamicSecretCreateAzure.uidToken) &&
        Objects.equals(this.userGroupObjId, dynamicSecretCreateAzure.userGroupObjId) &&
        Objects.equals(this.userPortalAccess, dynamicSecretCreateAzure.userPortalAccess) &&
        Objects.equals(this.userPrincipalName, dynamicSecretCreateAzure.userPrincipalName) &&
        Objects.equals(this.userProgrammaticAccess, dynamicSecretCreateAzure.userProgrammaticAccess) &&
        Objects.equals(this.userRoleTemplateId, dynamicSecretCreateAzure.userRoleTemplateId) &&
        Objects.equals(this.userTtl, dynamicSecretCreateAzure.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appObjId, azureClientId, azureClientSecret, azureTenantId, deleteProtection, description, fixedUserClaimKeyname, fixedUserOnly, json, name, passwordLength, producerEncryptionKeyName, secureAccessEnable, secureAccessUrl, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userGroupObjId, userPortalAccess, userPrincipalName, userProgrammaticAccess, userRoleTemplateId, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateAzure {\n");
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
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("app-obj-id");
    openapiFields.add("azure-client-id");
    openapiFields.add("azure-client-secret");
    openapiFields.add("azure-tenant-id");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("fixed-user-claim-keyname");
    openapiFields.add("fixed-user-only");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("password-length");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("secure-access-enable");
    openapiFields.add("secure-access-url");
    openapiFields.add("secure-access-web");
    openapiFields.add("secure-access-web-browsing");
    openapiFields.add("secure-access-web-proxy");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-group-obj-id");
    openapiFields.add("user-portal-access");
    openapiFields.add("user-principal-name");
    openapiFields.add("user-programmatic-access");
    openapiFields.add("user-role-template-id");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretCreateAzure
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretCreateAzure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretCreateAzure is not found in the empty JSON string", DynamicSecretCreateAzure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretCreateAzure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretCreateAzure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicSecretCreateAzure.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("app-obj-id") != null && !jsonObj.get("app-obj-id").isJsonNull()) && !jsonObj.get("app-obj-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app-obj-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app-obj-id").toString()));
      }
      if ((jsonObj.get("azure-client-id") != null && !jsonObj.get("azure-client-id").isJsonNull()) && !jsonObj.get("azure-client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure-client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure-client-id").toString()));
      }
      if ((jsonObj.get("azure-client-secret") != null && !jsonObj.get("azure-client-secret").isJsonNull()) && !jsonObj.get("azure-client-secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure-client-secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure-client-secret").toString()));
      }
      if ((jsonObj.get("azure-tenant-id") != null && !jsonObj.get("azure-tenant-id").isJsonNull()) && !jsonObj.get("azure-tenant-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure-tenant-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure-tenant-id").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("fixed-user-claim-keyname") != null && !jsonObj.get("fixed-user-claim-keyname").isJsonNull()) && !jsonObj.get("fixed-user-claim-keyname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fixed-user-claim-keyname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fixed-user-claim-keyname").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if ((jsonObj.get("secure-access-enable") != null && !jsonObj.get("secure-access-enable").isJsonNull()) && !jsonObj.get("secure-access-enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-enable").toString()));
      }
      if ((jsonObj.get("secure-access-url") != null && !jsonObj.get("secure-access-url").isJsonNull()) && !jsonObj.get("secure-access-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-group-obj-id") != null && !jsonObj.get("user-group-obj-id").isJsonNull()) && !jsonObj.get("user-group-obj-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-group-obj-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-group-obj-id").toString()));
      }
      if ((jsonObj.get("user-principal-name") != null && !jsonObj.get("user-principal-name").isJsonNull()) && !jsonObj.get("user-principal-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-principal-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-principal-name").toString()));
      }
      if ((jsonObj.get("user-role-template-id") != null && !jsonObj.get("user-role-template-id").isJsonNull()) && !jsonObj.get("user-role-template-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-role-template-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-role-template-id").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretCreateAzure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretCreateAzure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretCreateAzure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretCreateAzure.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretCreateAzure>() {
           @Override
           public void write(JsonWriter out, DynamicSecretCreateAzure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretCreateAzure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretCreateAzure given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretCreateAzure
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretCreateAzure
   */
  public static DynamicSecretCreateAzure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretCreateAzure.class);
  }

  /**
   * Convert an instance of DynamicSecretCreateAzure to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

