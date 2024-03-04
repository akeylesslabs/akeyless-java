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
 * gatewayUpdateProducerAws is a command that Updates aws producer [Deprecated: Use dynamic-secret-update-aws command]
 */
@ApiModel(description = "gatewayUpdateProducerAws is a command that Updates aws producer [Deprecated: Use dynamic-secret-update-aws command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateProducerAws {
  public static final String SERIALIZED_NAME_ACCESS_MODE = "access-mode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private String accessMode;

  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin-rotation-interval-days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  private Long adminRotationIntervalDays = 0l;

  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_ID = "aws-access-key-id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_ID)
  private String awsAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_ACCESS_SECRET_KEY = "aws-access-secret-key";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_SECRET_KEY)
  private String awsAccessSecretKey;

  public static final String SERIALIZED_NAME_AWS_ROLE_ARNS = "aws-role-arns";
  @SerializedName(SERIALIZED_NAME_AWS_ROLE_ARNS)
  private String awsRoleArns;

  public static final String SERIALIZED_NAME_AWS_USER_CONSOLE_ACCESS = "aws-user-console-access";
  @SerializedName(SERIALIZED_NAME_AWS_USER_CONSOLE_ACCESS)
  private Boolean awsUserConsoleAccess = false;

  public static final String SERIALIZED_NAME_AWS_USER_GROUPS = "aws-user-groups";
  @SerializedName(SERIALIZED_NAME_AWS_USER_GROUPS)
  private String awsUserGroups;

  public static final String SERIALIZED_NAME_AWS_USER_POLICIES = "aws-user-policies";
  @SerializedName(SERIALIZED_NAME_AWS_USER_POLICIES)
  private String awsUserPolicies;

  public static final String SERIALIZED_NAME_AWS_USER_PROGRAMMATIC_ACCESS = "aws-user-programmatic-access";
  @SerializedName(SERIALIZED_NAME_AWS_USER_PROGRAMMATIC_ACCESS)
  private Boolean awsUserProgrammaticAccess = true;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region = "us-east-2";

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID = "secure-access-aws-account-id";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID)
  private String secureAccessAwsAccountId;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI = "secure-access-aws-native-cli";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI)
  private Boolean secureAccessAwsNativeCli;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

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

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public GatewayUpdateProducerAws() { 
  }

  public GatewayUpdateProducerAws accessMode(String accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public GatewayUpdateProducerAws adminRotationIntervalDays(Long adminRotationIntervalDays) {
    
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

   /**
   * Admin credentials rotation interval (days)
   * @return adminRotationIntervalDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin credentials rotation interval (days)")

  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }


  public void setAdminRotationIntervalDays(Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public GatewayUpdateProducerAws awsAccessKeyId(String awsAccessKeyId) {
    
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

   /**
   * Access Key ID
   * @return awsAccessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Key ID")

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }


  public void setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }


  public GatewayUpdateProducerAws awsAccessSecretKey(String awsAccessSecretKey) {
    
    this.awsAccessSecretKey = awsAccessSecretKey;
    return this;
  }

   /**
   * Secret Access Key
   * @return awsAccessSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret Access Key")

  public String getAwsAccessSecretKey() {
    return awsAccessSecretKey;
  }


  public void setAwsAccessSecretKey(String awsAccessSecretKey) {
    this.awsAccessSecretKey = awsAccessSecretKey;
  }


  public GatewayUpdateProducerAws awsRoleArns(String awsRoleArns) {
    
    this.awsRoleArns = awsRoleArns;
    return this;
  }

   /**
   * AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode)
   * @return awsRoleArns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode)")

  public String getAwsRoleArns() {
    return awsRoleArns;
  }


  public void setAwsRoleArns(String awsRoleArns) {
    this.awsRoleArns = awsRoleArns;
  }


  public GatewayUpdateProducerAws awsUserConsoleAccess(Boolean awsUserConsoleAccess) {
    
    this.awsUserConsoleAccess = awsUserConsoleAccess;
    return this;
  }

   /**
   * AWS User console access
   * @return awsUserConsoleAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User console access")

  public Boolean getAwsUserConsoleAccess() {
    return awsUserConsoleAccess;
  }


  public void setAwsUserConsoleAccess(Boolean awsUserConsoleAccess) {
    this.awsUserConsoleAccess = awsUserConsoleAccess;
  }


  public GatewayUpdateProducerAws awsUserGroups(String awsUserGroups) {
    
    this.awsUserGroups = awsUserGroups;
    return this;
  }

   /**
   * AWS User groups
   * @return awsUserGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User groups")

  public String getAwsUserGroups() {
    return awsUserGroups;
  }


  public void setAwsUserGroups(String awsUserGroups) {
    this.awsUserGroups = awsUserGroups;
  }


  public GatewayUpdateProducerAws awsUserPolicies(String awsUserPolicies) {
    
    this.awsUserPolicies = awsUserPolicies;
    return this;
  }

   /**
   * AWS User policies
   * @return awsUserPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User policies")

  public String getAwsUserPolicies() {
    return awsUserPolicies;
  }


  public void setAwsUserPolicies(String awsUserPolicies) {
    this.awsUserPolicies = awsUserPolicies;
  }


  public GatewayUpdateProducerAws awsUserProgrammaticAccess(Boolean awsUserProgrammaticAccess) {
    
    this.awsUserProgrammaticAccess = awsUserProgrammaticAccess;
    return this;
  }

   /**
   * Enable AWS User programmatic access
   * @return awsUserProgrammaticAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable AWS User programmatic access")

  public Boolean getAwsUserProgrammaticAccess() {
    return awsUserProgrammaticAccess;
  }


  public void setAwsUserProgrammaticAccess(Boolean awsUserProgrammaticAccess) {
    this.awsUserProgrammaticAccess = awsUserProgrammaticAccess;
  }


  public GatewayUpdateProducerAws deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerAws enableAdminRotation(Boolean enableAdminRotation) {
    
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

   /**
   * Automatic admin credentials rotation
   * @return enableAdminRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatic admin credentials rotation")

  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }


  public void setEnableAdminRotation(Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public GatewayUpdateProducerAws json(Boolean json) {
    
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


  public GatewayUpdateProducerAws name(String name) {
    
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


  public GatewayUpdateProducerAws newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerAws producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerAws region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public GatewayUpdateProducerAws secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
    return this;
  }

   /**
   * The AWS account id
   * @return secureAccessAwsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS account id")

  public String getSecureAccessAwsAccountId() {
    return secureAccessAwsAccountId;
  }


  public void setSecureAccessAwsAccountId(String secureAccessAwsAccountId) {
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
  }


  public GatewayUpdateProducerAws secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
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


  public GatewayUpdateProducerAws secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public GatewayUpdateProducerAws secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayUpdateProducerAws secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public GatewayUpdateProducerAws secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
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


  public GatewayUpdateProducerAws secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
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


  public GatewayUpdateProducerAws tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerAws addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerAws targetName(String targetName) {
    
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


  public GatewayUpdateProducerAws token(String token) {
    
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


  public GatewayUpdateProducerAws uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerAws userTtl(String userTtl) {
    
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
    GatewayUpdateProducerAws gatewayUpdateProducerAws = (GatewayUpdateProducerAws) o;
    return Objects.equals(this.accessMode, gatewayUpdateProducerAws.accessMode) &&
        Objects.equals(this.adminRotationIntervalDays, gatewayUpdateProducerAws.adminRotationIntervalDays) &&
        Objects.equals(this.awsAccessKeyId, gatewayUpdateProducerAws.awsAccessKeyId) &&
        Objects.equals(this.awsAccessSecretKey, gatewayUpdateProducerAws.awsAccessSecretKey) &&
        Objects.equals(this.awsRoleArns, gatewayUpdateProducerAws.awsRoleArns) &&
        Objects.equals(this.awsUserConsoleAccess, gatewayUpdateProducerAws.awsUserConsoleAccess) &&
        Objects.equals(this.awsUserGroups, gatewayUpdateProducerAws.awsUserGroups) &&
        Objects.equals(this.awsUserPolicies, gatewayUpdateProducerAws.awsUserPolicies) &&
        Objects.equals(this.awsUserProgrammaticAccess, gatewayUpdateProducerAws.awsUserProgrammaticAccess) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerAws.deleteProtection) &&
        Objects.equals(this.enableAdminRotation, gatewayUpdateProducerAws.enableAdminRotation) &&
        Objects.equals(this.json, gatewayUpdateProducerAws.json) &&
        Objects.equals(this.name, gatewayUpdateProducerAws.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerAws.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerAws.producerEncryptionKeyName) &&
        Objects.equals(this.region, gatewayUpdateProducerAws.region) &&
        Objects.equals(this.secureAccessAwsAccountId, gatewayUpdateProducerAws.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, gatewayUpdateProducerAws.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerAws.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerAws.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerAws.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, gatewayUpdateProducerAws.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, gatewayUpdateProducerAws.secureAccessWebProxy) &&
        Objects.equals(this.tags, gatewayUpdateProducerAws.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerAws.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerAws.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerAws.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerAws.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, adminRotationIntervalDays, awsAccessKeyId, awsAccessSecretKey, awsRoleArns, awsUserConsoleAccess, awsUserGroups, awsUserPolicies, awsUserProgrammaticAccess, deleteProtection, enableAdminRotation, json, name, newName, producerEncryptionKeyName, region, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessBastionIssuer, secureAccessEnable, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerAws {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    awsAccessKeyId: ").append(toIndentedString(awsAccessKeyId)).append("\n");
    sb.append("    awsAccessSecretKey: ").append(toIndentedString(awsAccessSecretKey)).append("\n");
    sb.append("    awsRoleArns: ").append(toIndentedString(awsRoleArns)).append("\n");
    sb.append("    awsUserConsoleAccess: ").append(toIndentedString(awsUserConsoleAccess)).append("\n");
    sb.append("    awsUserGroups: ").append(toIndentedString(awsUserGroups)).append("\n");
    sb.append("    awsUserPolicies: ").append(toIndentedString(awsUserPolicies)).append("\n");
    sb.append("    awsUserProgrammaticAccess: ").append(toIndentedString(awsUserProgrammaticAccess)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secureAccessAwsAccountId: ").append(toIndentedString(secureAccessAwsAccountId)).append("\n");
    sb.append("    secureAccessAwsNativeCli: ").append(toIndentedString(secureAccessAwsNativeCli)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

