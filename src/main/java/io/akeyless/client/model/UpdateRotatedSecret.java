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
 * updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]
 */
@ApiModel(description = "updateRotatedSecret is a command that updates rotated secret. [Deprecated: Use gateway-update-item command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateRotatedSecret {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_API_ID = "api-id";
  @SerializedName(SERIALIZED_NAME_API_ID)
  private String apiId;

  public static final String SERIALIZED_NAME_API_KEY = "api-key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto-rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private String autoRotate;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws-region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  private String awsRegion = "us-east-2";

  public static final String SERIALIZED_NAME_CUSTOM_PAYLOAD = "custom-payload";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAYLOAD)
  private String customPayload;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "default_metadata";

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

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

  public static final String SERIALIZED_NAME_NEW_METADATA = "new-metadata";
  @SerializedName(SERIALIZED_NAME_NEW_METADATA)
  private String newMetadata = "default_metadata";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  private Boolean newVersion;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

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
  private String rotatorCredsType = "use-self-creds";

  public static final String SERIALIZED_NAME_ROTATOR_CUSTOM_CMD = "rotator-custom-cmd";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CUSTOM_CMD)
  private String rotatorCustomCmd;

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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public UpdateRotatedSecret() { 
  }

  public UpdateRotatedSecret addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateRotatedSecret addAddTagItem(String addTagItem) {
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


  public UpdateRotatedSecret apiId(String apiId) {
    
    this.apiId = apiId;
    return this;
  }

   /**
   * API ID to rotate
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API ID to rotate")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public UpdateRotatedSecret apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API key to rotate
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API key to rotate")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public UpdateRotatedSecret autoRotate(String autoRotate) {
    
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


  public UpdateRotatedSecret awsRegion(String awsRegion) {
    
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


  public UpdateRotatedSecret customPayload(String customPayload) {
    
    this.customPayload = customPayload;
    return this;
  }

   /**
   * Secret payload to be sent with rotation request (relevant only for rotator-type&#x3D;custom)
   * @return customPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret payload to be sent with rotation request (relevant only for rotator-type=custom)")

  public String getCustomPayload() {
    return customPayload;
  }


  public void setCustomPayload(String customPayload) {
    this.customPayload = customPayload;
  }


  public UpdateRotatedSecret description(String description) {
    
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


  public UpdateRotatedSecret gcpKey(String gcpKey) {
    
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


  public UpdateRotatedSecret json(Boolean json) {
    
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


  public UpdateRotatedSecret keepPrevVersion(String keepPrevVersion) {
    
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


  public UpdateRotatedSecret key(String key) {
    
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


  public UpdateRotatedSecret name(String name) {
    
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


  public UpdateRotatedSecret newMetadata(String newMetadata) {
    
    this.newMetadata = newMetadata;
    return this;
  }

   /**
   * Deprecated - use description
   * @return newMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getNewMetadata() {
    return newMetadata;
  }


  public void setNewMetadata(String newMetadata) {
    this.newMetadata = newMetadata;
  }


  public UpdateRotatedSecret newName(String newName) {
    
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


  public UpdateRotatedSecret newVersion(Boolean newVersion) {
    
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Deprecated
   * @return newVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getNewVersion() {
    return newVersion;
  }


  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateRotatedSecret rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateRotatedSecret addRmTagItem(String rmTagItem) {
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


  public UpdateRotatedSecret rotateAfterDisconnect(String rotateAfterDisconnect) {
    
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


  public UpdateRotatedSecret rotatedPassword(String rotatedPassword) {
    
    this.rotatedPassword = rotatedPassword;
    return this;
  }

   /**
   * rotated-username password
   * @return rotatedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "rotated-username password")

  public String getRotatedPassword() {
    return rotatedPassword;
  }


  public void setRotatedPassword(String rotatedPassword) {
    this.rotatedPassword = rotatedPassword;
  }


  public UpdateRotatedSecret rotatedUsername(String rotatedUsername) {
    
    this.rotatedUsername = rotatedUsername;
    return this;
  }

   /**
   * username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it&#39;s own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password
   * @return rotatedUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "username to be rotated, if selected use-self-creds at rotator-creds-type, this username will try to rotate it's own password, if use-target-creds is selected, target credentials will be use to rotate the rotated-password")

  public String getRotatedUsername() {
    return rotatedUsername;
  }


  public void setRotatedUsername(String rotatedUsername) {
    this.rotatedUsername = rotatedUsername;
  }


  public UpdateRotatedSecret rotationHour(Integer rotationHour) {
    
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


  public UpdateRotatedSecret rotationInterval(String rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * The number of days to wait between every automatic key rotation (7-365)
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days to wait between every automatic key rotation (7-365)")

  public String getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(String rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public UpdateRotatedSecret rotatorCredsType(String rotatorCredsType) {
    
    this.rotatorCredsType = rotatorCredsType;
    return this;
  }

   /**
   * The credentials to connect with use-self-creds/use-target-creds
   * @return rotatorCredsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The credentials to connect with use-self-creds/use-target-creds")

  public String getRotatorCredsType() {
    return rotatorCredsType;
  }


  public void setRotatorCredsType(String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
  }


  public UpdateRotatedSecret rotatorCustomCmd(String rotatorCustomCmd) {
    
    this.rotatorCustomCmd = rotatorCustomCmd;
    return this;
  }

   /**
   * \&quot;Custom rotation command (relevant only for ssh target)
   * @return rotatorCustomCmd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"Custom rotation command (relevant only for ssh target)")

  public String getRotatorCustomCmd() {
    return rotatorCustomCmd;
  }


  public void setRotatorCustomCmd(String rotatorCustomCmd) {
    this.rotatorCustomCmd = rotatorCustomCmd;
  }


  public UpdateRotatedSecret secureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Allow providing external user for a domain users (relevant only for rdp)
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow providing external user for a domain users (relevant only for rdp)")

  public Boolean getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public UpdateRotatedSecret secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
    return this;
  }

   /**
   * The AWS account id (relevant only for aws)
   * @return secureAccessAwsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS account id (relevant only for aws)")

  public String getSecureAccessAwsAccountId() {
    return secureAccessAwsAccountId;
  }


  public void setSecureAccessAwsAccountId(String secureAccessAwsAccountId) {
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
  }


  public UpdateRotatedSecret secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
    return this;
  }

   /**
   * The AWS native cli
   * @return secureAccessAwsNativeCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS native cli")

  public Boolean getSecureAccessAwsNativeCli() {
    return secureAccessAwsNativeCli;
  }


  public void setSecureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
  }


  public UpdateRotatedSecret secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public UpdateRotatedSecret secureAccessDbName(String secureAccessDbName) {
    
    this.secureAccessDbName = secureAccessDbName;
    return this;
  }

   /**
   * The DB name (relevant only for DB Dynamic-Secret)
   * @return secureAccessDbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DB name (relevant only for DB Dynamic-Secret)")

  public String getSecureAccessDbName() {
    return secureAccessDbName;
  }


  public void setSecureAccessDbName(String secureAccessDbName) {
    this.secureAccessDbName = secureAccessDbName;
  }


  public UpdateRotatedSecret secureAccessDbSchema(String secureAccessDbSchema) {
    
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

   /**
   * The db schema (relevant only for mssql or postgresql)
   * @return secureAccessDbSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The db schema (relevant only for mssql or postgresql)")

  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }


  public void setSecureAccessDbSchema(String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public UpdateRotatedSecret secureAccessEnable(String secureAccessEnable) {
    
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


  public UpdateRotatedSecret secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public UpdateRotatedSecret addSecureAccessHostItem(String secureAccessHostItem) {
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


  public UpdateRotatedSecret secureAccessRdpDomain(String secureAccessRdpDomain) {
    
    this.secureAccessRdpDomain = secureAccessRdpDomain;
    return this;
  }

   /**
   * Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret)
   * @return secureAccessRdpDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required when the Dynamic Secret is used for a domain user (relevant only for RDP Dynamic-Secret)")

  public String getSecureAccessRdpDomain() {
    return secureAccessRdpDomain;
  }


  public void setSecureAccessRdpDomain(String secureAccessRdpDomain) {
    this.secureAccessRdpDomain = secureAccessRdpDomain;
  }


  public UpdateRotatedSecret secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Override the RDP Domain username (relevant only for rdp)
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the RDP Domain username (relevant only for rdp)")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public UpdateRotatedSecret secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public UpdateRotatedSecret secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Secure browser via Akeyless Web Access Bastion (relevant only for aws or azure)
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secure browser via Akeyless Web Access Bastion (relevant only for aws or azure)")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public UpdateRotatedSecret secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Web-Proxy via Akeyless Web Access Bastion (relevant only for aws or azure)
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Web-Proxy via Akeyless Web Access Bastion (relevant only for aws or azure)")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public UpdateRotatedSecret sshPassword(String sshPassword) {
    
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


  public UpdateRotatedSecret sshUsername(String sshUsername) {
    
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


  public UpdateRotatedSecret storageAccountKeyName(String storageAccountKeyName) {
    
    this.storageAccountKeyName = storageAccountKeyName;
    return this;
  }

   /**
   * The name of the storage account key to rotate [key1/key2/kerb1/kerb2]
   * @return storageAccountKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the storage account key to rotate [key1/key2/kerb1/kerb2]")

  public String getStorageAccountKeyName() {
    return storageAccountKeyName;
  }


  public void setStorageAccountKeyName(String storageAccountKeyName) {
    this.storageAccountKeyName = storageAccountKeyName;
  }


  public UpdateRotatedSecret token(String token) {
    
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


  public UpdateRotatedSecret uidToken(String uidToken) {
    
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
    UpdateRotatedSecret updateRotatedSecret = (UpdateRotatedSecret) o;
    return Objects.equals(this.addTag, updateRotatedSecret.addTag) &&
        Objects.equals(this.apiId, updateRotatedSecret.apiId) &&
        Objects.equals(this.apiKey, updateRotatedSecret.apiKey) &&
        Objects.equals(this.autoRotate, updateRotatedSecret.autoRotate) &&
        Objects.equals(this.awsRegion, updateRotatedSecret.awsRegion) &&
        Objects.equals(this.customPayload, updateRotatedSecret.customPayload) &&
        Objects.equals(this.description, updateRotatedSecret.description) &&
        Objects.equals(this.gcpKey, updateRotatedSecret.gcpKey) &&
        Objects.equals(this.json, updateRotatedSecret.json) &&
        Objects.equals(this.keepPrevVersion, updateRotatedSecret.keepPrevVersion) &&
        Objects.equals(this.key, updateRotatedSecret.key) &&
        Objects.equals(this.name, updateRotatedSecret.name) &&
        Objects.equals(this.newMetadata, updateRotatedSecret.newMetadata) &&
        Objects.equals(this.newName, updateRotatedSecret.newName) &&
        Objects.equals(this.newVersion, updateRotatedSecret.newVersion) &&
        Objects.equals(this.rmTag, updateRotatedSecret.rmTag) &&
        Objects.equals(this.rotateAfterDisconnect, updateRotatedSecret.rotateAfterDisconnect) &&
        Objects.equals(this.rotatedPassword, updateRotatedSecret.rotatedPassword) &&
        Objects.equals(this.rotatedUsername, updateRotatedSecret.rotatedUsername) &&
        Objects.equals(this.rotationHour, updateRotatedSecret.rotationHour) &&
        Objects.equals(this.rotationInterval, updateRotatedSecret.rotationInterval) &&
        Objects.equals(this.rotatorCredsType, updateRotatedSecret.rotatorCredsType) &&
        Objects.equals(this.rotatorCustomCmd, updateRotatedSecret.rotatorCustomCmd) &&
        Objects.equals(this.secureAccessAllowExternalUser, updateRotatedSecret.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessAwsAccountId, updateRotatedSecret.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, updateRotatedSecret.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessBastionIssuer, updateRotatedSecret.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessDbName, updateRotatedSecret.secureAccessDbName) &&
        Objects.equals(this.secureAccessDbSchema, updateRotatedSecret.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, updateRotatedSecret.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, updateRotatedSecret.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpDomain, updateRotatedSecret.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, updateRotatedSecret.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessWeb, updateRotatedSecret.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, updateRotatedSecret.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, updateRotatedSecret.secureAccessWebProxy) &&
        Objects.equals(this.sshPassword, updateRotatedSecret.sshPassword) &&
        Objects.equals(this.sshUsername, updateRotatedSecret.sshUsername) &&
        Objects.equals(this.storageAccountKeyName, updateRotatedSecret.storageAccountKeyName) &&
        Objects.equals(this.token, updateRotatedSecret.token) &&
        Objects.equals(this.uidToken, updateRotatedSecret.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, apiId, apiKey, autoRotate, awsRegion, customPayload, description, gcpKey, json, keepPrevVersion, key, name, newMetadata, newName, newVersion, rmTag, rotateAfterDisconnect, rotatedPassword, rotatedUsername, rotationHour, rotationInterval, rotatorCredsType, rotatorCustomCmd, secureAccessAllowExternalUser, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessBastionIssuer, secureAccessDbName, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessRdpDomain, secureAccessRdpUser, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, sshPassword, sshUsername, storageAccountKeyName, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRotatedSecret {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    customPayload: ").append(toIndentedString(customPayload)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMetadata: ").append(toIndentedString(newMetadata)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    rotatedPassword: ").append(toIndentedString(rotatedPassword)).append("\n");
    sb.append("    rotatedUsername: ").append(toIndentedString(rotatedUsername)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    rotatorCredsType: ").append(toIndentedString(rotatorCredsType)).append("\n");
    sb.append("    rotatorCustomCmd: ").append(toIndentedString(rotatorCustomCmd)).append("\n");
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

