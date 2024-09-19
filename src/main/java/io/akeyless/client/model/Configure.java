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
 * Configure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configure {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access-type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType = "access_key";

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account-id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADMIN_EMAIL = "admin-email";
  @SerializedName(SERIALIZED_NAME_ADMIN_EMAIL)
  private String adminEmail;

  public static final String SERIALIZED_NAME_ADMIN_PASSWORD = "admin-password";
  @SerializedName(SERIALIZED_NAME_ADMIN_PASSWORD)
  private String adminPassword;

  public static final String SERIALIZED_NAME_AZURE_AD_OBJECT_ID = "azure_ad_object_id";
  @SerializedName(SERIALIZED_NAME_AZURE_AD_OBJECT_ID)
  private String azureAdObjectId;

  public static final String SERIALIZED_NAME_CERT_DATA = "cert-data";
  @SerializedName(SERIALIZED_NAME_CERT_DATA)
  private String certData;

  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  private String certIssuerName;

  public static final String SERIALIZED_NAME_CERT_USERNAME = "cert-username";
  @SerializedName(SERIALIZED_NAME_CERT_USERNAME)
  private String certUsername;

  public static final String SERIALIZED_NAME_DEFAULT_LOCATION_PREFIX = "default-location-prefix";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCATION_PREFIX)
  private String defaultLocationPrefix;

  public static final String SERIALIZED_NAME_GCP_AUDIENCE = "gcp-audience";
  @SerializedName(SERIALIZED_NAME_GCP_AUDIENCE)
  private String gcpAudience = "akeyless.io";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_AUTH_CONFIG_NAME = "k8s-auth-config-name";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_CONFIG_NAME)
  private String k8sAuthConfigName;

  public static final String SERIALIZED_NAME_KEY_DATA = "key-data";
  @SerializedName(SERIALIZED_NAME_KEY_DATA)
  private String keyData;

  public static final String SERIALIZED_NAME_LEGACY_SIGNING_ALG_NAME = "legacy-signing-alg-name";
  @SerializedName(SERIALIZED_NAME_LEGACY_SIGNING_ALG_NAME)
  private Boolean legacySigningAlgName;

  public static final String SERIALIZED_NAME_OCI_AUTH_TYPE = "oci-auth-type";
  @SerializedName(SERIALIZED_NAME_OCI_AUTH_TYPE)
  private String ociAuthType = "apikey";

  public static final String SERIALIZED_NAME_OCI_GROUP_OCID = "oci-group-ocid";
  @SerializedName(SERIALIZED_NAME_OCI_GROUP_OCID)
  private List<String> ociGroupOcid = null;

  public Configure() { 
  }

  public Configure accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Access ID
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access ID")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public Configure accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Access Key
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Key")

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public Configure accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * Access Type (access_key/password/azure_ad/saml/oidc/aws_iam/gcp/k8s/cert)
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Type (access_key/password/azure_ad/saml/oidc/aws_iam/gcp/k8s/cert)")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public Configure accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account id (relevant only for access-type&#x3D;password where the email address is associated with more than one account)
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account id (relevant only for access-type=password where the email address is associated with more than one account)")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Configure adminEmail(String adminEmail) {
    
    this.adminEmail = adminEmail;
    return this;
  }

   /**
   * Email (relevant only for access-type&#x3D;password)
   * @return adminEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email (relevant only for access-type=password)")

  public String getAdminEmail() {
    return adminEmail;
  }


  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }


  public Configure adminPassword(String adminPassword) {
    
    this.adminPassword = adminPassword;
    return this;
  }

   /**
   * Password (relevant only for access-type&#x3D;password)
   * @return adminPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password (relevant only for access-type=password)")

  public String getAdminPassword() {
    return adminPassword;
  }


  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }


  public Configure azureAdObjectId(String azureAdObjectId) {
    
    this.azureAdObjectId = azureAdObjectId;
    return this;
  }

   /**
   * Azure Active Directory ObjectId (relevant only for access-type&#x3D;azure_ad)
   * @return azureAdObjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Active Directory ObjectId (relevant only for access-type=azure_ad)")

  public String getAzureAdObjectId() {
    return azureAdObjectId;
  }


  public void setAzureAdObjectId(String azureAdObjectId) {
    this.azureAdObjectId = azureAdObjectId;
  }


  public Configure certData(String certData) {
    
    this.certData = certData;
    return this;
  }

   /**
   * Certificate data encoded in base64. Used if file was not provided. (relevant only for access-type&#x3D;cert in Curl Context)
   * @return certData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate data encoded in base64. Used if file was not provided. (relevant only for access-type=cert in Curl Context)")

  public String getCertData() {
    return certData;
  }


  public void setCertData(String certData) {
    this.certData = certData;
  }


  public Configure certIssuerName(String certIssuerName) {
    
    this.certIssuerName = certIssuerName;
    return this;
  }

   /**
   * Certificate Issuer Name
   * @return certIssuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate Issuer Name")

  public String getCertIssuerName() {
    return certIssuerName;
  }


  public void setCertIssuerName(String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public Configure certUsername(String certUsername) {
    
    this.certUsername = certUsername;
    return this;
  }

   /**
   * The username to sign in the SSH certificate (use a comma-separated list for more than one username)
   * @return certUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username to sign in the SSH certificate (use a comma-separated list for more than one username)")

  public String getCertUsername() {
    return certUsername;
  }


  public void setCertUsername(String certUsername) {
    this.certUsername = certUsername;
  }


  public Configure defaultLocationPrefix(String defaultLocationPrefix) {
    
    this.defaultLocationPrefix = defaultLocationPrefix;
    return this;
  }

   /**
   * Default path prefix for name of items, targets and auth methods
   * @return defaultLocationPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default path prefix for name of items, targets and auth methods")

  public String getDefaultLocationPrefix() {
    return defaultLocationPrefix;
  }


  public void setDefaultLocationPrefix(String defaultLocationPrefix) {
    this.defaultLocationPrefix = defaultLocationPrefix;
  }


  public Configure gcpAudience(String gcpAudience) {
    
    this.gcpAudience = gcpAudience;
    return this;
  }

   /**
   * GCP JWT audience
   * @return gcpAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GCP JWT audience")

  public String getGcpAudience() {
    return gcpAudience;
  }


  public void setGcpAudience(String gcpAudience) {
    this.gcpAudience = gcpAudience;
  }


  public Configure json(Boolean json) {
    
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


  public Configure k8sAuthConfigName(String k8sAuthConfigName) {
    
    this.k8sAuthConfigName = k8sAuthConfigName;
    return this;
  }

   /**
   * The K8S Auth config name (relevant only for access-type&#x3D;k8s)
   * @return k8sAuthConfigName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8S Auth config name (relevant only for access-type=k8s)")

  public String getK8sAuthConfigName() {
    return k8sAuthConfigName;
  }


  public void setK8sAuthConfigName(String k8sAuthConfigName) {
    this.k8sAuthConfigName = k8sAuthConfigName;
  }


  public Configure keyData(String keyData) {
    
    this.keyData = keyData;
    return this;
  }

   /**
   * Private key data encoded in base64. Used if file was not provided.(relevant only for access-type&#x3D;cert in Curl Context)
   * @return keyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private key data encoded in base64. Used if file was not provided.(relevant only for access-type=cert in Curl Context)")

  public String getKeyData() {
    return keyData;
  }


  public void setKeyData(String keyData) {
    this.keyData = keyData;
  }


  public Configure legacySigningAlgName(Boolean legacySigningAlgName) {
    
    this.legacySigningAlgName = legacySigningAlgName;
    return this;
  }

   /**
   * Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the certificate.
   * @return legacySigningAlgName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this option to output legacy ('ssh-rsa-cert-v01@openssh.com') signing algorithm name in the certificate.")

  public Boolean getLegacySigningAlgName() {
    return legacySigningAlgName;
  }


  public void setLegacySigningAlgName(Boolean legacySigningAlgName) {
    this.legacySigningAlgName = legacySigningAlgName;
  }


  public Configure ociAuthType(String ociAuthType) {
    
    this.ociAuthType = ociAuthType;
    return this;
  }

   /**
   * The type of the OCI configuration to use [instance/apikey/resource] (relevant only for access-type&#x3D;oci)
   * @return ociAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the OCI configuration to use [instance/apikey/resource] (relevant only for access-type=oci)")

  public String getOciAuthType() {
    return ociAuthType;
  }


  public void setOciAuthType(String ociAuthType) {
    this.ociAuthType = ociAuthType;
  }


  public Configure ociGroupOcid(List<String> ociGroupOcid) {
    
    this.ociGroupOcid = ociGroupOcid;
    return this;
  }

  public Configure addOciGroupOcidItem(String ociGroupOcidItem) {
    if (this.ociGroupOcid == null) {
      this.ociGroupOcid = new ArrayList<String>();
    }
    this.ociGroupOcid.add(ociGroupOcidItem);
    return this;
  }

   /**
   * A list of Oracle Cloud IDs groups (relevant only for access-type&#x3D;oci)
   * @return ociGroupOcid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Oracle Cloud IDs groups (relevant only for access-type=oci)")

  public List<String> getOciGroupOcid() {
    return ociGroupOcid;
  }


  public void setOciGroupOcid(List<String> ociGroupOcid) {
    this.ociGroupOcid = ociGroupOcid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configure configure = (Configure) o;
    return Objects.equals(this.accessId, configure.accessId) &&
        Objects.equals(this.accessKey, configure.accessKey) &&
        Objects.equals(this.accessType, configure.accessType) &&
        Objects.equals(this.accountId, configure.accountId) &&
        Objects.equals(this.adminEmail, configure.adminEmail) &&
        Objects.equals(this.adminPassword, configure.adminPassword) &&
        Objects.equals(this.azureAdObjectId, configure.azureAdObjectId) &&
        Objects.equals(this.certData, configure.certData) &&
        Objects.equals(this.certIssuerName, configure.certIssuerName) &&
        Objects.equals(this.certUsername, configure.certUsername) &&
        Objects.equals(this.defaultLocationPrefix, configure.defaultLocationPrefix) &&
        Objects.equals(this.gcpAudience, configure.gcpAudience) &&
        Objects.equals(this.json, configure.json) &&
        Objects.equals(this.k8sAuthConfigName, configure.k8sAuthConfigName) &&
        Objects.equals(this.keyData, configure.keyData) &&
        Objects.equals(this.legacySigningAlgName, configure.legacySigningAlgName) &&
        Objects.equals(this.ociAuthType, configure.ociAuthType) &&
        Objects.equals(this.ociGroupOcid, configure.ociGroupOcid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessKey, accessType, accountId, adminEmail, adminPassword, azureAdObjectId, certData, certIssuerName, certUsername, defaultLocationPrefix, gcpAudience, json, k8sAuthConfigName, keyData, legacySigningAlgName, ociAuthType, ociGroupOcid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configure {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    azureAdObjectId: ").append(toIndentedString(azureAdObjectId)).append("\n");
    sb.append("    certData: ").append(toIndentedString(certData)).append("\n");
    sb.append("    certIssuerName: ").append(toIndentedString(certIssuerName)).append("\n");
    sb.append("    certUsername: ").append(toIndentedString(certUsername)).append("\n");
    sb.append("    defaultLocationPrefix: ").append(toIndentedString(defaultLocationPrefix)).append("\n");
    sb.append("    gcpAudience: ").append(toIndentedString(gcpAudience)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sAuthConfigName: ").append(toIndentedString(k8sAuthConfigName)).append("\n");
    sb.append("    keyData: ").append(toIndentedString(keyData)).append("\n");
    sb.append("    legacySigningAlgName: ").append(toIndentedString(legacySigningAlgName)).append("\n");
    sb.append("    ociAuthType: ").append(toIndentedString(ociAuthType)).append("\n");
    sb.append("    ociGroupOcid: ").append(toIndentedString(ociGroupOcid)).append("\n");
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

