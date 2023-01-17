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
 * CreateRotatedSecret
 */

public class CreateRotatedSecret {
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
  private String authenticationCredentials;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws-region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  private String awsRegion = "us-east-2";

  public static final String SERIALIZED_NAME_CUSTOM_PAYLOAD = "custom-payload";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAYLOAD)
  private String customPayload;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROTATED_PASSWORD = "rotated-password";
  @SerializedName(SERIALIZED_NAME_ROTATED_PASSWORD)
  private String rotatedPassword;

  public static final String SERIALIZED_NAME_ROTATED_USERNAME = "rotated-username";
  @SerializedName(SERIALIZED_NAME_ROTATED_USERNAME)
  private String rotatedUsername;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation-hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation-interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private String rotationInterval;

  public static final String SERIALIZED_NAME_ROTATOR_CREDS_TYPE = "rotator-creds-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CREDS_TYPE)
  private String rotatorCredsType;

  public static final String SERIALIZED_NAME_ROTATOR_CUSTOM_CMD = "rotator-custom-cmd";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CUSTOM_CMD)
  private String rotatorCustomCmd;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator-type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  private String rotatorType;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER = "secure-access-allow-external-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER)
  private Boolean secureAccessAllowExternalUser = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID = "secure-access-aws-account-id";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID)
  private String secureAccessAwsAccountId;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI = "secure-access-aws-native-cli";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI)
  private Boolean secureAccessAwsNativeCli;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DB_NAME = "secure-access-db-name";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DB_NAME)
  private String secureAccessDbName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA = "secure-access-db-schema";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DB_SCHEMA)
  private String secureAccessDbSchema;

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

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_SSH_PASSWORD = "ssh-password";
  @SerializedName(SERIALIZED_NAME_SSH_PASSWORD)
  private String sshPassword;

  public static final String SERIALIZED_NAME_SSH_USERNAME = "ssh-username";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME)
  private String sshUsername;

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

  public static final String SERIALIZED_NAME_USER_ATTRIBUTE = "user-attribute";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTE)
  private String userAttribute;

  public static final String SERIALIZED_NAME_USER_DN = "user-dn";
  @SerializedName(SERIALIZED_NAME_USER_DN)
  private String userDn;


  public CreateRotatedSecret apiId(String apiId) {
    
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public CreateRotatedSecret apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public CreateRotatedSecret applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ApplicationId (used in azure)
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ApplicationId (used in azure)")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CreateRotatedSecret authenticationCredentials(String authenticationCredentials) {
    
    this.authenticationCredentials = authenticationCredentials;
    return this;
  }

   /**
   * Get authenticationCredentials
   * @return authenticationCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthenticationCredentials() {
    return authenticationCredentials;
  }


  public void setAuthenticationCredentials(String authenticationCredentials) {
    this.authenticationCredentials = authenticationCredentials;
  }


  public CreateRotatedSecret autoRotate(String autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation
   * @return autoRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to automatically rotate every --rotation-interval days, or disable existing automatic rotation")

  public String getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(String autoRotate) {
    this.autoRotate = autoRotate;
  }


  public CreateRotatedSecret awsRegion(String awsRegion) {
    
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * Region (used in aws)
   * @return awsRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region (used in aws)")

  public String getAwsRegion() {
    return awsRegion;
  }


  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }


  public CreateRotatedSecret customPayload(String customPayload) {
    
    this.customPayload = customPayload;
    return this;
  }

   /**
   * Get customPayload
   * @return customPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomPayload() {
    return customPayload;
  }


  public void setCustomPayload(String customPayload) {
    this.customPayload = customPayload;
  }


  public CreateRotatedSecret deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateRotatedSecret description(String description) {
    
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


  public CreateRotatedSecret gcpKey(String gcpKey) {
    
    this.gcpKey = gcpKey;
    return this;
  }

   /**
   * Base64-encoded service account private key text
   * @return gcpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded service account private key text")

  public String getGcpKey() {
    return gcpKey;
  }


  public void setGcpKey(String gcpKey) {
    this.gcpKey = gcpKey;
  }


  public CreateRotatedSecret json(Boolean json) {
    
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


  public CreateRotatedSecret key(String key) {
    
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


  public CreateRotatedSecret metadata(String metadata) {
    
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


  public CreateRotatedSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Secret name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateRotatedSecret rotatedPassword(String rotatedPassword) {
    
    this.rotatedPassword = rotatedPassword;
    return this;
  }

   /**
   * Get rotatedPassword
   * @return rotatedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatedPassword() {
    return rotatedPassword;
  }


  public void setRotatedPassword(String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
  }


  public CreateRotatedSecret rotatedUsername(String rotatedUsername) {
    
    this.rotatedUsername = rotatedUsername;
    return this;
  }

   /**
   * Get rotatedUsername
   * @return rotatedUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatedUsername() {
    return rotatedUsername;
  }


  public void setRotatedUsername(String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
  }


  public CreateRotatedSecret rotationHour(Integer rotationHour) {
    
    this.rotationHour = rotationHour;
    return this;
  }

   /**
   * Get rotationHour
   * @return rotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRotationHour() {
    return rotationHour;
  }


  public void setRotationHour(Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public CreateRotatedSecret rotationInterval(String rotationInterval) {
    
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


  public CreateRotatedSecret rotatorCredsType(String rotatorCredsType) {
    
    this.rotatorCredsType = rotatorCredsType;
    return this;
  }

   /**
   * Get rotatorCredsType
   * @return rotatorCredsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatorCredsType() {
    return rotatorCredsType;
  }


  public void setRotatorCredsType(String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
  }


  public CreateRotatedSecret rotatorCustomCmd(String rotatorCustomCmd) {
    
    this.rotatorCustomCmd = rotatorCustomCmd;
    return this;
  }

   /**
   * Get rotatorCustomCmd
   * @return rotatorCustomCmd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatorCustomCmd() {
    return rotatorCustomCmd;
  }


  public void setRotatorCustomCmd(String rotatorCustomCmd) {
    this.rotatorCustomCmd = rotatorCustomCmd;
  }


  public CreateRotatedSecret rotatorType(String rotatorType) {
    
    this.rotatorType = rotatorType;
    return this;
  }

   /**
   * Rotator Type
   * @return rotatorType
  **/
  @ApiModelProperty(required = true, value = "Rotator Type")

  public String getRotatorType() {
    return rotatorType;
  }


  public void setRotatorType(String rotatorType) {
    this.rotatorType = rotatorType;
  }


  public CreateRotatedSecret secureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Secure Access Allow Providing External User (used in ssh)
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Allow Providing External User (used in ssh)")

  public Boolean getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public CreateRotatedSecret secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
    return this;
  }

   /**
   * Secure Access Account Id (used in aws)
   * @return secureAccessAwsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Account Id (used in aws)")

  public String getSecureAccessAwsAccountId() {
    return secureAccessAwsAccountId;
  }


  public void setSecureAccessAwsAccountId(String secureAccessAwsAccountId) {
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
  }


  public CreateRotatedSecret secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
    return this;
  }

   /**
   * Secure Access Aws Native Cli (used in aws)
   * @return secureAccessAwsNativeCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Aws Native Cli (used in aws)")

  public Boolean getSecureAccessAwsNativeCli() {
    return secureAccessAwsNativeCli;
  }


  public void setSecureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
  }


  public CreateRotatedSecret secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Secure Access Bastion Issuer
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Bastion Issuer")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public CreateRotatedSecret secureAccessDbName(String secureAccessDbName) {
    
    this.secureAccessDbName = secureAccessDbName;
    return this;
  }

   /**
   * Secure Access DB Name (used in data bases)
   * @return secureAccessDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access DB Name (used in data bases)")

  public String getSecureAccessDbName() {
    return secureAccessDbName;
  }


  public void setSecureAccessDbName(String secureAccessDbName) {
    this.secureAccessDbName = secureAccessDbName;
  }


  public CreateRotatedSecret secureAccessDbSchema(String secureAccessDbSchema) {
    
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

   /**
   * Secure Access Schema (used in mssql, postgresql)
   * @return secureAccessDbSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Schema (used in mssql, postgresql)")

  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }


  public void setSecureAccessDbSchema(String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public CreateRotatedSecret secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Secure Access Enabled
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Enabled")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public CreateRotatedSecret secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public CreateRotatedSecret addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Secure Access Host
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Host")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public CreateRotatedSecret secureAccessRdpDomain(String secureAccessRdpDomain) {
    
    this.secureAccessRdpDomain = secureAccessRdpDomain;
    return this;
  }

   /**
   * Secure Access Domain (used in ssh)
   * @return secureAccessRdpDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Domain (used in ssh)")

  public String getSecureAccessRdpDomain() {
    return secureAccessRdpDomain;
  }


  public void setSecureAccessRdpDomain(String secureAccessRdpDomain) {
    this.secureAccessRdpDomain = secureAccessRdpDomain;
  }


  public CreateRotatedSecret secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Secure Access Override User (used in ssh)
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Override User (used in ssh)")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public CreateRotatedSecret secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Secure Access Web
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Web")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public CreateRotatedSecret secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Secure Access Isolated (used in aws, azure)
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Isolated (used in aws, azure)")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public CreateRotatedSecret secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Secure Access Web Proxy (used in aws, azure)
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure Access Web Proxy (used in aws, azure)")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public CreateRotatedSecret sshPassword(String sshPassword) {
    
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * Deprecated: use RotatedPassword
   * @return sshPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: use RotatedPassword")

  public String getSshPassword() {
    return sshPassword;
  }


  public void setSshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
  }


  public CreateRotatedSecret sshUsername(String sshUsername) {
    
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Deprecated: use RotatedUser
   * @return sshUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: use RotatedUser")

  public String getSshUsername() {
    return sshUsername;
  }


  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public CreateRotatedSecret storageAccountKeyName(String storageAccountKeyName) {
    
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


  public CreateRotatedSecret tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateRotatedSecret addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this secret
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this secret")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateRotatedSecret targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public CreateRotatedSecret token(String token) {
    
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


  public CreateRotatedSecret uidToken(String uidToken) {
    
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


  public CreateRotatedSecret userAttribute(String userAttribute) {
    
    this.userAttribute = userAttribute;
    return this;
  }

   /**
   * LDAP User Attribute, Default value \&quot;cn\&quot;
   * @return userAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP User Attribute, Default value \"cn\"")

  public String getUserAttribute() {
    return userAttribute;
  }


  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }


  public CreateRotatedSecret userDn(String userDn) {
    
    this.userDn = userDn;
    return this;
  }

   /**
   * LDAP User Base DN
   * @return userDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP User Base DN")

  public String getUserDn() {
    return userDn;
  }


  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRotatedSecret createRotatedSecret = (CreateRotatedSecret) o;
    return Objects.equals(this.apiId, createRotatedSecret.apiId) &&
        Objects.equals(this.apiKey, createRotatedSecret.apiKey) &&
        Objects.equals(this.applicationId, createRotatedSecret.applicationId) &&
        Objects.equals(this.authenticationCredentials, createRotatedSecret.authenticationCredentials) &&
        Objects.equals(this.autoRotate, createRotatedSecret.autoRotate) &&
        Objects.equals(this.awsRegion, createRotatedSecret.awsRegion) &&
        Objects.equals(this.customPayload, createRotatedSecret.customPayload) &&
        Objects.equals(this.deleteProtection, createRotatedSecret.deleteProtection) &&
        Objects.equals(this.description, createRotatedSecret.description) &&
        Objects.equals(this.gcpKey, createRotatedSecret.gcpKey) &&
        Objects.equals(this.json, createRotatedSecret.json) &&
        Objects.equals(this.key, createRotatedSecret.key) &&
        Objects.equals(this.metadata, createRotatedSecret.metadata) &&
        Objects.equals(this.name, createRotatedSecret.name) &&
        Objects.equals(this.rotatedPassword, createRotatedSecret.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, createRotatedSecret.rotatedUsername) &&
        Objects.equals(this.rotationHour, createRotatedSecret.rotationHour) &&
        Objects.equals(this.rotationInterval, createRotatedSecret.rotationInterval) &&
        Objects.equals(this.rotatorCredsType, createRotatedSecret.rotatorCredsType) &&
        Objects.equals(this.rotatorCustomCmd, createRotatedSecret.rotatorCustomCmd) &&
        Objects.equals(this.rotatorType, createRotatedSecret.rotatorType) &&
        Objects.equals(this.secureAccessAllowExternalUser, createRotatedSecret.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessAwsAccountId, createRotatedSecret.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, createRotatedSecret.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessBastionIssuer, createRotatedSecret.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbName, createRotatedSecret.secureAccessDbName) &&
        Objects.equals(this.secureAccessDbSchema, createRotatedSecret.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, createRotatedSecret.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, createRotatedSecret.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpDomain, createRotatedSecret.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, createRotatedSecret.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessWeb, createRotatedSecret.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, createRotatedSecret.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, createRotatedSecret.secureAccessWebProxy) &&
        Objects.equals(this.sshPassword, createRotatedSecret.sshPassword) &&
        Objects.equals(this.sshUsername, createRotatedSecret.sshUsername) &&
        Objects.equals(this.storageAccountKeyName, createRotatedSecret.storageAccountKeyName) &&
        Objects.equals(this.tags, createRotatedSecret.tags) &&
        Objects.equals(this.targetName, createRotatedSecret.targetName) &&
        Objects.equals(this.token, createRotatedSecret.token) &&
        Objects.equals(this.uidToken, createRotatedSecret.uidToken) &&
        Objects.equals(this.userAttribute, createRotatedSecret.userAttribute) &&
        Objects.equals(this.userDn, createRotatedSecret.userDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, apiKey, applicationId, authenticationCredentials, autoRotate, awsRegion, customPayload, deleteProtection, description, gcpKey, json, key, metadata, name, rotatedPassword, rotatedUsername, rotationHour, rotationInterval, rotatorCredsType, rotatorCustomCmd, rotatorType, secureAccessAllowExternalUser, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessBastionIssuer, secureAccessDbName, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessRdpDomain, secureAccessRdpUser, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, sshPassword, sshUsername, storageAccountKeyName, tags, targetName, token, uidToken, userAttribute, userDn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRotatedSecret {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    authenticationCredentials: ").append(toIndentedString(authenticationCredentials)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    customPayload: ").append(toIndentedString(customPayload)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rotatedPassword: ").append(toIndentedString(rotatedPassword)).append("\n");
    sb.append("    rotatedUsername: ").append(toIndentedString(rotatedUsername)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotatorCredsType: ").append(toIndentedString(rotatorCredsType)).append("\n");
    sb.append("    rotatorCustomCmd: ").append(toIndentedString(rotatorCustomCmd)).append("\n");
    sb.append("    rotatorType: ").append(toIndentedString(rotatorType)).append("\n");
    sb.append("    secureAccessAllowExternalUser: ").append(toIndentedString(secureAccessAllowExternalUser)).append("\n");
    sb.append("    secureAccessAwsAccountId: ").append(toIndentedString(secureAccessAwsAccountId)).append("\n");
    sb.append("    secureAccessAwsNativeCli: ").append(toIndentedString(secureAccessAwsNativeCli)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessDbName: ").append(toIndentedString(secureAccessDbName)).append("\n");
    sb.append("    secureAccessDbSchema: ").append(toIndentedString(secureAccessDbSchema)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdpDomain: ").append(toIndentedString(secureAccessRdpDomain)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    storageAccountKeyName: ").append(toIndentedString(storageAccountKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userAttribute: ").append(toIndentedString(userAttribute)).append("\n");
    sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
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

