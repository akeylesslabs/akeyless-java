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
 * RotatedSecretUpdateCustom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretUpdateCustom {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS = "authentication-credentials";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS)
  private String authenticationCredentials = "use-user-creds";

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_CUSTOM_PAYLOAD = "custom-payload";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAYLOAD)
  private String customPayload;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "default_metadata";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER = "secure-access-allow-external-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER)
  private Boolean secureAccessAllowExternalUser = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN = "secure-access-rdp-domain";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN)
  private String secureAccessRdpDomain;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_USER = "secure-access-rdp-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_USER)
  private String secureAccessRdpUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_USER = "secure-access-ssh-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_USER)
  private String secureAccessSshUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_URL = "secure-access-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_URL)
  private String secureAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public RotatedSecretUpdateCustom() { 
  }

  public RotatedSecretUpdateCustom addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public RotatedSecretUpdateCustom addAddTagItem(String addTagItem) {
    if (this.addTag == null) {
      this.addTag = new ArrayList<String>();
    }
    this.addTag.add(addTagItem);
    return this;
  }

   /**
   * List of the new tags that will be attached to this item
   * @return addTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the new tags that will be attached to this item")

  public List<String> getAddTag() {
    return addTag;
  }


  public void setAddTag(List<String> addTag) {
    this.addTag = addTag;
  }


  public RotatedSecretUpdateCustom authenticationCredentials(String authenticationCredentials) {
    
    this.authenticationCredentials = authenticationCredentials;
    return this;
  }

   /**
   * The credentials to connect with use-user-creds/use-target-creds
   * @return authenticationCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The credentials to connect with use-user-creds/use-target-creds")

  public String getAuthenticationCredentials() {
    return authenticationCredentials;
  }


  public void setAuthenticationCredentials(String authenticationCredentials) {
    this.authenticationCredentials = authenticationCredentials;
  }


  public RotatedSecretUpdateCustom autoRotate(String autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false]
   * @return autoRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation [true/false]")

  public String getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(String autoRotate) {
    this.autoRotate = autoRotate;
  }


  public RotatedSecretUpdateCustom customPayload(String customPayload) {
    
    this.customPayload = customPayload;
    return this;
  }

   /**
   * Secret payload to be sent with rotation request
   * @return customPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret payload to be sent with rotation request")

  public String getCustomPayload() {
    return customPayload;
  }


  public void setCustomPayload(String customPayload) {
    this.customPayload = customPayload;
  }


  public RotatedSecretUpdateCustom deleteProtection(String deleteProtection) {
    
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


  public RotatedSecretUpdateCustom description(String description) {
    
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


  public RotatedSecretUpdateCustom json(Boolean json) {
    
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


  public RotatedSecretUpdateCustom keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to keep previous version [true/false]. If not set, use default according to account settings")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public RotatedSecretUpdateCustom key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public RotatedSecretUpdateCustom name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Rotated secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Rotated secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RotatedSecretUpdateCustom newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New item name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public RotatedSecretUpdateCustom passwordLength(String passwordLength) {
    
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


  public RotatedSecretUpdateCustom rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public RotatedSecretUpdateCustom addRmTagItem(String rmTagItem) {
    if (this.rmTag == null) {
      this.rmTag = new ArrayList<String>();
    }
    this.rmTag.add(rmTagItem);
    return this;
  }

   /**
   * List of the existent tags that will be removed from this item
   * @return rmTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the existent tags that will be removed from this item")

  public List<String> getRmTag() {
    return rmTag;
  }


  public void setRmTag(List<String> rmTag) {
    this.rmTag = rmTag;
  }


  public RotatedSecretUpdateCustom rotateAfterDisconnect(String rotateAfterDisconnect) {
    
    this.rotateAfterDisconnect = rotateAfterDisconnect;
    return this;
  }

   /**
   * Rotate the value of the secret after SRA session ends [true/false]
   * @return rotateAfterDisconnect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotate the value of the secret after SRA session ends [true/false]")

  public String getRotateAfterDisconnect() {
    return rotateAfterDisconnect;
  }


  public void setRotateAfterDisconnect(String rotateAfterDisconnect) {
    this.rotateAfterDisconnect = rotateAfterDisconnect;
  }


  public RotatedSecretUpdateCustom rotationHour(Integer rotationHour) {
    
    this.rotationHour = rotationHour;
    return this;
  }

   /**
   * The Hour of the rotation in UTC
   * @return rotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Hour of the rotation in UTC")

  public Integer getRotationHour() {
    return rotationHour;
  }


  public void setRotationHour(Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public RotatedSecretUpdateCustom rotationInterval(String rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * The number of days to wait between every automatic key rotation (1-365)
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days to wait between every automatic key rotation (1-365)")

  public String getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(String rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public RotatedSecretUpdateCustom secureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Allow providing external user for a domain users
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow providing external user for a domain users")

  public Boolean getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public RotatedSecretUpdateCustom secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public RotatedSecretUpdateCustom secureAccessEnable(String secureAccessEnable) {
    
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


  public RotatedSecretUpdateCustom secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public RotatedSecretUpdateCustom addSecureAccessHostItem(String secureAccessHostItem) {
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


  public RotatedSecretUpdateCustom secureAccessRdpDomain(String secureAccessRdpDomain) {
    
    this.secureAccessRdpDomain = secureAccessRdpDomain;
    return this;
  }

   /**
   * Required when the Dynamic Secret is used for a domain user
   * @return secureAccessRdpDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required when the Dynamic Secret is used for a domain user")

  public String getSecureAccessRdpDomain() {
    return secureAccessRdpDomain;
  }


  public void setSecureAccessRdpDomain(String secureAccessRdpDomain) {
    this.secureAccessRdpDomain = secureAccessRdpDomain;
  }


  public RotatedSecretUpdateCustom secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Override the RDP Domain username
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the RDP Domain username")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public RotatedSecretUpdateCustom secureAccessSshUser(String secureAccessSshUser) {
    
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


  public RotatedSecretUpdateCustom secureAccessUrl(String secureAccessUrl) {
    
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


  public RotatedSecretUpdateCustom secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public RotatedSecretUpdateCustom secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
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


  public RotatedSecretUpdateCustom secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
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


  public RotatedSecretUpdateCustom token(String token) {
    
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


  public RotatedSecretUpdateCustom uidToken(String uidToken) {
    
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
    RotatedSecretUpdateCustom rotatedSecretUpdateCustom = (RotatedSecretUpdateCustom) o;
    return Objects.equals(this.addTag, rotatedSecretUpdateCustom.addTag) &&
        Objects.equals(this.authenticationCredentials, rotatedSecretUpdateCustom.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretUpdateCustom.autoRotate) &&
        Objects.equals(this.customPayload, rotatedSecretUpdateCustom.customPayload) &&
        Objects.equals(this.deleteProtection, rotatedSecretUpdateCustom.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretUpdateCustom.description) &&
        Objects.equals(this.json, rotatedSecretUpdateCustom.json) &&
        Objects.equals(this.keepPrevVersion, rotatedSecretUpdateCustom.keepPrevVersion) &&
        Objects.equals(this.key, rotatedSecretUpdateCustom.key) &&
        Objects.equals(this.name, rotatedSecretUpdateCustom.name) &&
        Objects.equals(this.newName, rotatedSecretUpdateCustom.newName) &&
        Objects.equals(this.passwordLength, rotatedSecretUpdateCustom.passwordLength) &&
        Objects.equals(this.rmTag, rotatedSecretUpdateCustom.rmTag) &&
        Objects.equals(this.rotateAfterDisconnect, rotatedSecretUpdateCustom.rotateAfterDisconnect) &&
        Objects.equals(this.rotationHour, rotatedSecretUpdateCustom.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretUpdateCustom.rotationInterval) &&
        Objects.equals(this.secureAccessAllowExternalUser, rotatedSecretUpdateCustom.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessBastionIssuer, rotatedSecretUpdateCustom.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, rotatedSecretUpdateCustom.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, rotatedSecretUpdateCustom.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpDomain, rotatedSecretUpdateCustom.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, rotatedSecretUpdateCustom.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessSshUser, rotatedSecretUpdateCustom.secureAccessSshUser) &&
        Objects.equals(this.secureAccessUrl, rotatedSecretUpdateCustom.secureAccessUrl) &&
        Objects.equals(this.secureAccessWeb, rotatedSecretUpdateCustom.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, rotatedSecretUpdateCustom.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, rotatedSecretUpdateCustom.secureAccessWebProxy) &&
        Objects.equals(this.token, rotatedSecretUpdateCustom.token) &&
        Objects.equals(this.uidToken, rotatedSecretUpdateCustom.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, authenticationCredentials, autoRotate, customPayload, deleteProtection, description, json, keepPrevVersion, key, name, newName, passwordLength, rmTag, rotateAfterDisconnect, rotationHour, rotationInterval, secureAccessAllowExternalUser, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessRdpDomain, secureAccessRdpUser, secureAccessSshUser, secureAccessUrl, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretUpdateCustom {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    customPayload: ").append(toIndentedString(customPayload)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    secureAccessAllowExternalUser: ").append(toIndentedString(secureAccessAllowExternalUser)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdpDomain: ").append(toIndentedString(secureAccessRdpDomain)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    secureAccessSshUser: ").append(toIndentedString(secureAccessSshUser)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
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
