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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateSecret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSecret {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_CHANGE_EVENT = "change-event";
  @SerializedName(SERIALIZED_NAME_CHANGE_EVENT)
  private String changeEvent;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD = "custom-field";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD)
  private Map<String, String> customField = null;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = "text";

  public static final String SERIALIZED_NAME_INJECT_URL = "inject-url";
  @SerializedName(SERIALIZED_NAME_INJECT_URL)
  private List<String> injectUrl = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_MULTILINE_VALUE = "multiline_value";
  @SerializedName(SERIALIZED_NAME_MULTILINE_VALUE)
  private Boolean multilineValue;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_USER = "secure-access-rdp-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_USER)
  private String secureAccessRdpUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS = "secure-access-ssh-creds";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS)
  private String secureAccessSshCreds;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_USER = "secure-access-ssh-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_USER)
  private String secureAccessSshUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_URL = "secure-access-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_URL)
  private String secureAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "generic";

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CreateSecret() { 
  }

  public CreateSecret accessibility(String accessibility) {
    
    this.accessibility = accessibility;
    return this;
  }

   /**
   * for personal password manager
   * @return accessibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for personal password manager")

  public String getAccessibility() {
    return accessibility;
  }


  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }


  public CreateSecret changeEvent(String changeEvent) {
    
    this.changeEvent = changeEvent;
    return this;
  }

   /**
   * Trigger an event when a secret value changed [true/false] (Relevant only for Static Secret)
   * @return changeEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trigger an event when a secret value changed [true/false] (Relevant only for Static Secret)")

  public String getChangeEvent() {
    return changeEvent;
  }


  public void setChangeEvent(String changeEvent) {
    this.changeEvent = changeEvent;
  }


  public CreateSecret customField(Map<String, String> customField) {
    
    this.customField = customField;
    return this;
  }

  public CreateSecret putCustomFieldItem(String key, String customFieldItem) {
    if (this.customField == null) {
      this.customField = new HashMap<String, String>();
    }
    this.customField.put(key, customFieldItem);
    return this;
  }

   /**
   * For Password Management use, additional fields
   * @return customField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Password Management use, additional fields")

  public Map<String, String> getCustomField() {
    return customField;
  }


  public void setCustomField(Map<String, String> customField) {
    this.customField = customField;
  }


  public CreateSecret deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this object [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateSecret description(String description) {
    
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


  public CreateSecret format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Secret format [text/json/key-value] (relevant only for type &#39;generic&#39;)
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret format [text/json/key-value] (relevant only for type 'generic')")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public CreateSecret injectUrl(List<String> injectUrl) {
    
    this.injectUrl = injectUrl;
    return this;
  }

  public CreateSecret addInjectUrlItem(String injectUrlItem) {
    if (this.injectUrl == null) {
      this.injectUrl = new ArrayList<String>();
    }
    this.injectUrl.add(injectUrlItem);
    return this;
  }

   /**
   * For Password Management use, reflect the website context
   * @return injectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Password Management use, reflect the website context")

  public List<String> getInjectUrl() {
    return injectUrl;
  }


  public void setInjectUrl(List<String> injectUrl) {
    this.injectUrl = injectUrl;
  }


  public CreateSecret json(Boolean json) {
    
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


  public CreateSecret maxVersions(String maxVersions) {
    
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


  public CreateSecret metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Deprecated - use description
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreateSecret multilineValue(Boolean multilineValue) {
    
    this.multilineValue = multilineValue;
    return this;
  }

   /**
   * The provided value is a multiline value (separated by &#39;\\n&#39;)
   * @return multilineValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The provided value is a multiline value (separated by '\\n')")

  public Boolean getMultilineValue() {
    return multilineValue;
  }


  public void setMultilineValue(Boolean multilineValue) {
    this.multilineValue = multilineValue;
  }


  public CreateSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateSecret password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * For Password Management use, additional fields
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Password Management use, additional fields")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateSecret protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public CreateSecret secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Path to the SSH Certificate Issuer for your Akeyless Bastion
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the SSH Certificate Issuer for your Akeyless Bastion")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public CreateSecret secureAccessEnable(String secureAccessEnable) {
    
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


  public CreateSecret secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public CreateSecret addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public CreateSecret secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Remote Desktop Username
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remote Desktop Username")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public CreateSecret secureAccessSshCreds(String secureAccessSshCreds) {
    
    this.secureAccessSshCreds = secureAccessSshCreds;
    return this;
  }

   /**
   * Static-Secret values contains SSH Credentials, either Private Key or Password [password/private-key]
   * @return secureAccessSshCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Static-Secret values contains SSH Credentials, either Private Key or Password [password/private-key]")

  public String getSecureAccessSshCreds() {
    return secureAccessSshCreds;
  }


  public void setSecureAccessSshCreds(String secureAccessSshCreds) {
    this.secureAccessSshCreds = secureAccessSshCreds;
  }


  public CreateSecret secureAccessSshUser(String secureAccessSshUser) {
    
    this.secureAccessSshUser = secureAccessSshUser;
    return this;
  }

   /**
   * Override the SSH username as indicated in SSH Certificate Issuer
   * @return secureAccessSshUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the SSH username as indicated in SSH Certificate Issuer")

  public String getSecureAccessSshUser() {
    return secureAccessSshUser;
  }


  public void setSecureAccessSshUser(String secureAccessSshUser) {
    this.secureAccessSshUser = secureAccessSshUser;
  }


  public CreateSecret secureAccessUrl(String secureAccessUrl) {
    
    this.secureAccessUrl = secureAccessUrl;
    return this;
  }

   /**
   * Destination URL to inject secrets
   * @return secureAccessUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination URL to inject secrets")

  public String getSecureAccessUrl() {
    return secureAccessUrl;
  }


  public void setSecureAccessUrl(String secureAccessUrl) {
    this.secureAccessUrl = secureAccessUrl;
  }


  public CreateSecret secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
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


  public CreateSecret secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
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


  public CreateSecret tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateSecret addTagsItem(String tagsItem) {
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


  public CreateSecret token(String token) {
    
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


  public CreateSecret type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The secret sub type [generic/password]
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secret sub type [generic/password]")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateSecret uidToken(String uidToken) {
    
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


  public CreateSecret username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * For Password Management use
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Password Management use")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreateSecret value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The secret value (relevant only for type &#39;generic&#39;)
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The secret value (relevant only for type 'generic')")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSecret createSecret = (CreateSecret) o;
    return Objects.equals(this.accessibility, createSecret.accessibility) &&
        Objects.equals(this.changeEvent, createSecret.changeEvent) &&
        Objects.equals(this.customField, createSecret.customField) &&
        Objects.equals(this.deleteProtection, createSecret.deleteProtection) &&
        Objects.equals(this.description, createSecret.description) &&
        Objects.equals(this.format, createSecret.format) &&
        Objects.equals(this.injectUrl, createSecret.injectUrl) &&
        Objects.equals(this.json, createSecret.json) &&
        Objects.equals(this.maxVersions, createSecret.maxVersions) &&
        Objects.equals(this.metadata, createSecret.metadata) &&
        Objects.equals(this.multilineValue, createSecret.multilineValue) &&
        Objects.equals(this.name, createSecret.name) &&
        Objects.equals(this.password, createSecret.password) &&
        Objects.equals(this.protectionKey, createSecret.protectionKey) &&
        Objects.equals(this.secureAccessBastionIssuer, createSecret.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, createSecret.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, createSecret.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpUser, createSecret.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessSshCreds, createSecret.secureAccessSshCreds) &&
        Objects.equals(this.secureAccessSshUser, createSecret.secureAccessSshUser) &&
        Objects.equals(this.secureAccessUrl, createSecret.secureAccessUrl) &&
        Objects.equals(this.secureAccessWebBrowsing, createSecret.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, createSecret.secureAccessWebProxy) &&
        Objects.equals(this.tags, createSecret.tags) &&
        Objects.equals(this.token, createSecret.token) &&
        Objects.equals(this.type, createSecret.type) &&
        Objects.equals(this.uidToken, createSecret.uidToken) &&
        Objects.equals(this.username, createSecret.username) &&
        Objects.equals(this.value, createSecret.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, changeEvent, customField, deleteProtection, description, format, injectUrl, json, maxVersions, metadata, multilineValue, name, password, protectionKey, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessRdpUser, secureAccessSshCreds, secureAccessSshUser, secureAccessUrl, secureAccessWebBrowsing, secureAccessWebProxy, tags, token, type, uidToken, username, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSecret {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    changeEvent: ").append(toIndentedString(changeEvent)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    injectUrl: ").append(toIndentedString(injectUrl)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    multilineValue: ").append(toIndentedString(multilineValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    secureAccessSshCreds: ").append(toIndentedString(secureAccessSshCreds)).append("\n");
    sb.append("    secureAccessSshUser: ").append(toIndentedString(secureAccessSshUser)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

