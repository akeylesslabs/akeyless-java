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
 * RotatedSecretCreateAzure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretCreateAzure {
  public static final String SERIALIZED_NAME_API_ID = "api-id";
  @SerializedName(SERIALIZED_NAME_API_ID)
  private String apiId;

  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application-id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS = "authentication-credentials";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CREDENTIALS)
  private String authenticationCredentials = "use-user-creds";

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

  public static final String SERIALIZED_NAME_ROTATION_EVENT_IN = "rotation-event-in";
  @SerializedName(SERIALIZED_NAME_ROTATION_EVENT_IN)
  private List<String> rotationEventIn = null;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  private String rotatorType;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DISABLE_CONCURRENT_CONNECTIONS = "secure-access-disable-concurrent-connections";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DISABLE_CONCURRENT_CONNECTIONS)
  private Boolean secureAccessDisableConcurrentConnections;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

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

  public static final String SERIALIZED_NAME_STORAGE_ACCOUNT_KEY_NAME = "storage-account-key-name";
  @SerializedName(SERIALIZED_NAME_STORAGE_ACCOUNT_KEY_NAME)
  private String storageAccountKeyName;

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

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public RotatedSecretCreateAzure() { 
  }

  public RotatedSecretCreateAzure apiId(String apiId) {
    
    this.apiId = apiId;
    return this;
  }

   /**
   * API ID to rotate (relevant only for rotator-type&#x3D;api-key)
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API ID to rotate (relevant only for rotator-type=api-key)")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public RotatedSecretCreateAzure apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API key to rotate (relevant only for rotator-type&#x3D;api-key)
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API key to rotate (relevant only for rotator-type=api-key)")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public RotatedSecretCreateAzure applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Id of the azure app that hold the serect to be rotated (relevant only for rotator-type&#x3D;api-key &amp; authentication-credentials&#x3D;use-target-creds)
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the azure app that hold the serect to be rotated (relevant only for rotator-type=api-key & authentication-credentials=use-target-creds)")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public RotatedSecretCreateAzure authenticationCredentials(String authenticationCredentials) {
    
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


  public RotatedSecretCreateAzure autoRotate(String autoRotate) {
    
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


  public RotatedSecretCreateAzure deleteProtection(String deleteProtection) {
    
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


  public RotatedSecretCreateAzure description(String description) {
    
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


  public RotatedSecretCreateAzure json(Boolean json) {
    
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


  public RotatedSecretCreateAzure key(String key) {
    
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


  public RotatedSecretCreateAzure maxVersions(String maxVersions) {
    
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


  public RotatedSecretCreateAzure name(String name) {
    
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


  public RotatedSecretCreateAzure passwordLength(String passwordLength) {
    
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


  public RotatedSecretCreateAzure rotateAfterDisconnect(String rotateAfterDisconnect) {
    
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


  public RotatedSecretCreateAzure rotationEventIn(List<String> rotationEventIn) {
    
    this.rotationEventIn = rotationEventIn;
    return this;
  }

  public RotatedSecretCreateAzure addRotationEventInItem(String rotationEventInItem) {
    if (this.rotationEventIn == null) {
      this.rotationEventIn = new ArrayList<String>();
    }
    this.rotationEventIn.add(rotationEventInItem);
    return this;
  }

   /**
   * How many days before the rotation of the item would you like to be notified
   * @return rotationEventIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many days before the rotation of the item would you like to be notified")

  public List<String> getRotationEventIn() {
    return rotationEventIn;
  }


  public void setRotationEventIn(List<String> rotationEventIn) {
    this.rotationEventIn = rotationEventIn;
  }


  public RotatedSecretCreateAzure rotationHour(Integer rotationHour) {
    
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


  public RotatedSecretCreateAzure rotationInterval(String rotationInterval) {
    
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


  public RotatedSecretCreateAzure rotatorType(String rotatorType) {
    
    this.rotatorType = rotatorType;
    return this;
  }

   /**
   * The rotator type. options: [target/password/api-key/azure-storage-account]
   * @return rotatorType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rotator type. options: [target/password/api-key/azure-storage-account]")

  public String getRotatorType() {
    return rotatorType;
  }


  public void setRotatorType(String rotatorType) {
    this.rotatorType = rotatorType;
  }


  public RotatedSecretCreateAzure secureAccessDisableConcurrentConnections(Boolean secureAccessDisableConcurrentConnections) {
    
    this.secureAccessDisableConcurrentConnections = secureAccessDisableConcurrentConnections;
    return this;
  }

   /**
   * Enable this flag to prevent simultaneous use of the same secret
   * @return secureAccessDisableConcurrentConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable this flag to prevent simultaneous use of the same secret")

  public Boolean getSecureAccessDisableConcurrentConnections() {
    return secureAccessDisableConcurrentConnections;
  }


  public void setSecureAccessDisableConcurrentConnections(Boolean secureAccessDisableConcurrentConnections) {
    this.secureAccessDisableConcurrentConnections = secureAccessDisableConcurrentConnections;
  }


  public RotatedSecretCreateAzure secureAccessEnable(String secureAccessEnable) {
    
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


  public RotatedSecretCreateAzure secureAccessUrl(String secureAccessUrl) {
    
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


  public RotatedSecretCreateAzure secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public RotatedSecretCreateAzure secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
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


  public RotatedSecretCreateAzure secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
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


  public RotatedSecretCreateAzure storageAccountKeyName(String storageAccountKeyName) {
    
    this.storageAccountKeyName = storageAccountKeyName;
    return this;
  }

   /**
   * The name of the storage account key to rotate [key1/key2/kerb1/kerb2] (relevat to azure-storage-account)
   * @return storageAccountKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the storage account key to rotate [key1/key2/kerb1/kerb2] (relevat to azure-storage-account)")

  public String getStorageAccountKeyName() {
    return storageAccountKeyName;
  }


  public void setStorageAccountKeyName(String storageAccountKeyName) {
    this.storageAccountKeyName = storageAccountKeyName;
  }


  public RotatedSecretCreateAzure tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RotatedSecretCreateAzure addTagsItem(String tagsItem) {
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


  public RotatedSecretCreateAzure targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public RotatedSecretCreateAzure token(String token) {
    
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


  public RotatedSecretCreateAzure uidToken(String uidToken) {
    
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


  public RotatedSecretCreateAzure username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The user principal name to rotate his password (relevant only for rotator-type&#x3D;password)
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user principal name to rotate his password (relevant only for rotator-type=password)")

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
    RotatedSecretCreateAzure rotatedSecretCreateAzure = (RotatedSecretCreateAzure) o;
    return Objects.equals(this.apiId, rotatedSecretCreateAzure.apiId) &&
        Objects.equals(this.apiKey, rotatedSecretCreateAzure.apiKey) &&
        Objects.equals(this.applicationId, rotatedSecretCreateAzure.applicationId) &&
        Objects.equals(this.authenticationCredentials, rotatedSecretCreateAzure.authenticationCredentials) &&
        Objects.equals(this.autoRotate, rotatedSecretCreateAzure.autoRotate) &&
        Objects.equals(this.deleteProtection, rotatedSecretCreateAzure.deleteProtection) &&
        Objects.equals(this.description, rotatedSecretCreateAzure.description) &&
        Objects.equals(this.json, rotatedSecretCreateAzure.json) &&
        Objects.equals(this.key, rotatedSecretCreateAzure.key) &&
        Objects.equals(this.maxVersions, rotatedSecretCreateAzure.maxVersions) &&
        Objects.equals(this.name, rotatedSecretCreateAzure.name) &&
        Objects.equals(this.passwordLength, rotatedSecretCreateAzure.passwordLength) &&
        Objects.equals(this.rotateAfterDisconnect, rotatedSecretCreateAzure.rotateAfterDisconnect) &&
        Objects.equals(this.rotationEventIn, rotatedSecretCreateAzure.rotationEventIn) &&
        Objects.equals(this.rotationHour, rotatedSecretCreateAzure.rotationHour) &&
        Objects.equals(this.rotationInterval, rotatedSecretCreateAzure.rotationInterval) &&
        Objects.equals(this.rotatorType, rotatedSecretCreateAzure.rotatorType) &&
        Objects.equals(this.secureAccessDisableConcurrentConnections, rotatedSecretCreateAzure.secureAccessDisableConcurrentConnections) &&
        Objects.equals(this.secureAccessEnable, rotatedSecretCreateAzure.secureAccessEnable) &&
        Objects.equals(this.secureAccessUrl, rotatedSecretCreateAzure.secureAccessUrl) &&
        Objects.equals(this.secureAccessWeb, rotatedSecretCreateAzure.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, rotatedSecretCreateAzure.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, rotatedSecretCreateAzure.secureAccessWebProxy) &&
        Objects.equals(this.storageAccountKeyName, rotatedSecretCreateAzure.storageAccountKeyName) &&
        Objects.equals(this.tags, rotatedSecretCreateAzure.tags) &&
        Objects.equals(this.targetName, rotatedSecretCreateAzure.targetName) &&
        Objects.equals(this.token, rotatedSecretCreateAzure.token) &&
        Objects.equals(this.uidToken, rotatedSecretCreateAzure.uidToken) &&
        Objects.equals(this.username, rotatedSecretCreateAzure.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, apiKey, applicationId, authenticationCredentials, autoRotate, deleteProtection, description, json, key, maxVersions, name, passwordLength, rotateAfterDisconnect, rotationEventIn, rotationHour, rotationInterval, rotatorType, secureAccessDisableConcurrentConnections, secureAccessEnable, secureAccessUrl, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, storageAccountKeyName, tags, targetName, token, uidToken, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretCreateAzure {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    rotationEventIn: ").append(toIndentedString(rotationEventIn)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotatorType: ").append(toIndentedString(rotatorType)).append("\n");
    sb.append("    secureAccessDisableConcurrentConnections: ").append(toIndentedString(secureAccessDisableConcurrentConnections)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    storageAccountKeyName: ").append(toIndentedString(storageAccountKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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

