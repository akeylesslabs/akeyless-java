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
 * UpdateItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateItem {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_CERT_FILE_DATA = "cert-file-data";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_DATA)
  private String certFileData;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "default_metadata";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_METADATA = "new-metadata";
  @SerializedName(SERIALIZED_NAME_NEW_METADATA)
  private String newMetadata = "default_metadata";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate-after-disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private String rotateAfterDisconnect = "false";

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ADD_HOST = "secure-access-add-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ADD_HOST)
  private List<String> secureAccessAddHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER = "secure-access-allow-external-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER)
  private String secureAccessAllowExternalUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING = "secure-access-allow-port-forwading";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING)
  private Boolean secureAccessAllowPortForwading;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID = "secure-access-aws-account-id";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID)
  private String secureAccessAwsAccountId;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI = "secure-access-aws-native-cli";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI)
  private Boolean secureAccessAwsNativeCli;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_REGION = "secure-access-aws-region";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_REGION)
  private String secureAccessAwsRegion;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_API = "secure-access-bastion-api";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_API)
  private String secureAccessBastionApi;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_SSH = "secure-access-bastion-ssh";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_SSH)
  private String secureAccessBastionSsh;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT = "secure-access-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT)
  private String secureAccessClusterEndpoint;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DASHBOARD_URL = "secure-access-dashboard-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DASHBOARD_URL)
  private String secureAccessDashboardUrl;

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

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RD_GATEWAY_SERVER = "secure-access-rd-gateway-server";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RD_GATEWAY_SERVER)
  private String secureAccessRdGatewayServer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN = "secure-access-rdp-domain";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN)
  private String secureAccessRdpDomain;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_USER = "secure-access-rdp-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_USER)
  private String secureAccessRdpUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RM_HOST = "secure-access-rm-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RM_HOST)
  private List<String> secureAccessRmHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS = "secure-access-ssh-creds";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS)
  private String secureAccessSshCreds;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS_USER = "secure-access-ssh-creds-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS_USER)
  private String secureAccessSshCredsUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_URL = "secure-access-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_URL)
  private String secureAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_USE_INTERNAL_BASTION = "secure-access-use-internal-bastion";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_USE_INTERNAL_BASTION)
  private Boolean secureAccessUseInternalBastion;

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

  public UpdateItem() { 
  }

  public UpdateItem accessibility(String accessibility) {
    
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


  public UpdateItem addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateItem addAddTagItem(String addTagItem) {
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


  public UpdateItem certFileData(String certFileData) {
    
    this.certFileData = certFileData;
    return this;
  }

   /**
   * PEM Certificate in a Base64 format. Used for updating RSA keys&#39; certificates.
   * @return certFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PEM Certificate in a Base64 format. Used for updating RSA keys' certificates.")

  public String getCertFileData() {
    return certFileData;
  }


  public void setCertFileData(String certFileData) {
    this.certFileData = certFileData;
  }


  public UpdateItem deleteProtection(String deleteProtection) {
    
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


  public UpdateItem description(String description) {
    
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


  public UpdateItem json(Boolean json) {
    
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


  public UpdateItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Current item name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Current item name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateItem newMetadata(String newMetadata) {
    
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


  public UpdateItem newName(String newName) {
    
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


  public UpdateItem rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateItem addRmTagItem(String rmTagItem) {
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


  public UpdateItem rotateAfterDisconnect(String rotateAfterDisconnect) {
    
    this.rotateAfterDisconnect = rotateAfterDisconnect;
    return this;
  }

   /**
   * Rotate the value of the secret after SRA session ends [true/false] (relevant only for Rotated-secret)
   * @return rotateAfterDisconnect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotate the value of the secret after SRA session ends [true/false] (relevant only for Rotated-secret)")

  public String getRotateAfterDisconnect() {
    return rotateAfterDisconnect;
  }


  public void setRotateAfterDisconnect(String rotateAfterDisconnect) {
    this.rotateAfterDisconnect = rotateAfterDisconnect;
  }


  public UpdateItem secureAccessAddHost(List<String> secureAccessAddHost) {
    
    this.secureAccessAddHost = secureAccessAddHost;
    return this;
  }

  public UpdateItem addSecureAccessAddHostItem(String secureAccessAddHostItem) {
    if (this.secureAccessAddHost == null) {
      this.secureAccessAddHost = new ArrayList<String>();
    }
    this.secureAccessAddHost.add(secureAccessAddHostItem);
    return this;
  }

   /**
   * List of the new hosts that will be attached to SRA servers host
   * @return secureAccessAddHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the new hosts that will be attached to SRA servers host")

  public List<String> getSecureAccessAddHost() {
    return secureAccessAddHost;
  }


  public void setSecureAccessAddHost(List<String> secureAccessAddHost) {
    this.secureAccessAddHost = secureAccessAddHost;
  }


  public UpdateItem secureAccessAllowExternalUser(String secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Allow providing external user for a domain users [true/false]
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow providing external user for a domain users [true/false]")

  public String getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(String secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public UpdateItem secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Enable Port forwarding while using CLI access (relevant only for EKS/GKE/K8s Dynamic-Secret)
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Port forwarding while using CLI access (relevant only for EKS/GKE/K8s Dynamic-Secret)")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public UpdateItem secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
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


  public UpdateItem secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
    return this;
  }

   /**
   * The AWS native cli (relevant only for aws)
   * @return secureAccessAwsNativeCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS native cli (relevant only for aws)")

  public Boolean getSecureAccessAwsNativeCli() {
    return secureAccessAwsNativeCli;
  }


  public void setSecureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
  }


  public UpdateItem secureAccessAwsRegion(String secureAccessAwsRegion) {
    
    this.secureAccessAwsRegion = secureAccessAwsRegion;
    return this;
  }

   /**
   * The AWS region (relevant only for aws)
   * @return secureAccessAwsRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS region (relevant only for aws)")

  public String getSecureAccessAwsRegion() {
    return secureAccessAwsRegion;
  }


  public void setSecureAccessAwsRegion(String secureAccessAwsRegion) {
    this.secureAccessAwsRegion = secureAccessAwsRegion;
  }


  public UpdateItem secureAccessBastionApi(String secureAccessBastionApi) {
    
    this.secureAccessBastionApi = secureAccessBastionApi;
    return this;
  }

   /**
   * Bastion&#39;s SSH control API endpoint. E.g. https://my.bastion:9900 (relevant only for ssh cert issuer)
   * @return secureAccessBastionApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bastion's SSH control API endpoint. E.g. https://my.bastion:9900 (relevant only for ssh cert issuer)")

  public String getSecureAccessBastionApi() {
    return secureAccessBastionApi;
  }


  public void setSecureAccessBastionApi(String secureAccessBastionApi) {
    this.secureAccessBastionApi = secureAccessBastionApi;
  }


  public UpdateItem secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public UpdateItem secureAccessBastionSsh(String secureAccessBastionSsh) {
    
    this.secureAccessBastionSsh = secureAccessBastionSsh;
    return this;
  }

   /**
   * Bastion&#39;s SSH server. E.g. my.bastion:22 (relevant only for ssh cert issuer)
   * @return secureAccessBastionSsh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bastion's SSH server. E.g. my.bastion:22 (relevant only for ssh cert issuer)")

  public String getSecureAccessBastionSsh() {
    return secureAccessBastionSsh;
  }


  public void setSecureAccessBastionSsh(String secureAccessBastionSsh) {
    this.secureAccessBastionSsh = secureAccessBastionSsh;
  }


  public UpdateItem secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * The K8s cluster endpoint URL (relevant only for EKS/GKE/K8s Dynamic-Secret)
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8s cluster endpoint URL (relevant only for EKS/GKE/K8s Dynamic-Secret)")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public UpdateItem secureAccessDashboardUrl(String secureAccessDashboardUrl) {
    
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
    return this;
  }

   /**
   * The K8s dashboard url (relevant only for k8s)
   * @return secureAccessDashboardUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8s dashboard url (relevant only for k8s)")

  public String getSecureAccessDashboardUrl() {
    return secureAccessDashboardUrl;
  }


  public void setSecureAccessDashboardUrl(String secureAccessDashboardUrl) {
    this.secureAccessDashboardUrl = secureAccessDashboardUrl;
  }


  public UpdateItem secureAccessDbName(String secureAccessDbName) {
    
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


  public UpdateItem secureAccessDbSchema(String secureAccessDbSchema) {
    
    this.secureAccessDbSchema = secureAccessDbSchema;
    return this;
  }

   /**
   * The DB schema (relevant only for DB Dynamic-Secret)
   * @return secureAccessDbSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DB schema (relevant only for DB Dynamic-Secret)")

  public String getSecureAccessDbSchema() {
    return secureAccessDbSchema;
  }


  public void setSecureAccessDbSchema(String secureAccessDbSchema) {
    this.secureAccessDbSchema = secureAccessDbSchema;
  }


  public UpdateItem secureAccessEnable(String secureAccessEnable) {
    
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


  public UpdateItem secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public UpdateItem addSecureAccessHostItem(String secureAccessHostItem) {
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


  public UpdateItem secureAccessRdGatewayServer(String secureAccessRdGatewayServer) {
    
    this.secureAccessRdGatewayServer = secureAccessRdGatewayServer;
    return this;
  }

   /**
   * RD Gateway server (relevant only for rdp)
   * @return secureAccessRdGatewayServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RD Gateway server (relevant only for rdp)")

  public String getSecureAccessRdGatewayServer() {
    return secureAccessRdGatewayServer;
  }


  public void setSecureAccessRdGatewayServer(String secureAccessRdGatewayServer) {
    this.secureAccessRdGatewayServer = secureAccessRdGatewayServer;
  }


  public UpdateItem secureAccessRdpDomain(String secureAccessRdpDomain) {
    
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


  public UpdateItem secureAccessRdpUser(String secureAccessRdpUser) {
    
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


  public UpdateItem secureAccessRmHost(List<String> secureAccessRmHost) {
    
    this.secureAccessRmHost = secureAccessRmHost;
    return this;
  }

  public UpdateItem addSecureAccessRmHostItem(String secureAccessRmHostItem) {
    if (this.secureAccessRmHost == null) {
      this.secureAccessRmHost = new ArrayList<String>();
    }
    this.secureAccessRmHost.add(secureAccessRmHostItem);
    return this;
  }

   /**
   * List of the existent hosts that will be removed from SRA servers host
   * @return secureAccessRmHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the existent hosts that will be removed from SRA servers host")

  public List<String> getSecureAccessRmHost() {
    return secureAccessRmHost;
  }


  public void setSecureAccessRmHost(List<String> secureAccessRmHost) {
    this.secureAccessRmHost = secureAccessRmHost;
  }


  public UpdateItem secureAccessSshCreds(String secureAccessSshCreds) {
    
    this.secureAccessSshCreds = secureAccessSshCreds;
    return this;
  }

   /**
   * Secret values contains SSH Credentials, either Private Key or Password [password/private-key] (relevant only for Static-Secret or Rotated-secret)
   * @return secureAccessSshCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret values contains SSH Credentials, either Private Key or Password [password/private-key] (relevant only for Static-Secret or Rotated-secret)")

  public String getSecureAccessSshCreds() {
    return secureAccessSshCreds;
  }


  public void setSecureAccessSshCreds(String secureAccessSshCreds) {
    this.secureAccessSshCreds = secureAccessSshCreds;
  }


  public UpdateItem secureAccessSshCredsUser(String secureAccessSshCredsUser) {
    
    this.secureAccessSshCredsUser = secureAccessSshCredsUser;
    return this;
  }

   /**
   * SSH username to connect to target server, must be in &#39;Allowed Users&#39; list (relevant only for ssh cert issuer)
   * @return secureAccessSshCredsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSH username to connect to target server, must be in 'Allowed Users' list (relevant only for ssh cert issuer)")

  public String getSecureAccessSshCredsUser() {
    return secureAccessSshCredsUser;
  }


  public void setSecureAccessSshCredsUser(String secureAccessSshCredsUser) {
    this.secureAccessSshCredsUser = secureAccessSshCredsUser;
  }


  public UpdateItem secureAccessUrl(String secureAccessUrl) {
    
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


  public UpdateItem secureAccessUseInternalBastion(Boolean secureAccessUseInternalBastion) {
    
    this.secureAccessUseInternalBastion = secureAccessUseInternalBastion;
    return this;
  }

   /**
   * Use internal SSH Bastion
   * @return secureAccessUseInternalBastion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use internal SSH Bastion")

  public Boolean getSecureAccessUseInternalBastion() {
    return secureAccessUseInternalBastion;
  }


  public void setSecureAccessUseInternalBastion(Boolean secureAccessUseInternalBastion) {
    this.secureAccessUseInternalBastion = secureAccessUseInternalBastion;
  }


  public UpdateItem secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
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


  public UpdateItem secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
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


  public UpdateItem token(String token) {
    
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


  public UpdateItem uidToken(String uidToken) {
    
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
    UpdateItem updateItem = (UpdateItem) o;
    return Objects.equals(this.accessibility, updateItem.accessibility) &&
        Objects.equals(this.addTag, updateItem.addTag) &&
        Objects.equals(this.certFileData, updateItem.certFileData) &&
        Objects.equals(this.deleteProtection, updateItem.deleteProtection) &&
        Objects.equals(this.description, updateItem.description) &&
        Objects.equals(this.json, updateItem.json) &&
        Objects.equals(this.name, updateItem.name) &&
        Objects.equals(this.newMetadata, updateItem.newMetadata) &&
        Objects.equals(this.newName, updateItem.newName) &&
        Objects.equals(this.rmTag, updateItem.rmTag) &&
        Objects.equals(this.rotateAfterDisconnect, updateItem.rotateAfterDisconnect) &&
        Objects.equals(this.secureAccessAddHost, updateItem.secureAccessAddHost) &&
        Objects.equals(this.secureAccessAllowExternalUser, updateItem.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessAllowPortForwading, updateItem.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessAwsAccountId, updateItem.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, updateItem.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessAwsRegion, updateItem.secureAccessAwsRegion) &&
        Objects.equals(this.secureAccessBastionApi, updateItem.secureAccessBastionApi) &&
        Objects.equals(this.secureAccessBastionIssuer, updateItem.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessBastionSsh, updateItem.secureAccessBastionSsh) &&
        Objects.equals(this.secureAccessClusterEndpoint, updateItem.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessDashboardUrl, updateItem.secureAccessDashboardUrl) &&
        Objects.equals(this.secureAccessDbName, updateItem.secureAccessDbName) &&
        Objects.equals(this.secureAccessDbSchema, updateItem.secureAccessDbSchema) &&
        Objects.equals(this.secureAccessEnable, updateItem.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, updateItem.secureAccessHost) &&
        Objects.equals(this.secureAccessRdGatewayServer, updateItem.secureAccessRdGatewayServer) &&
        Objects.equals(this.secureAccessRdpDomain, updateItem.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, updateItem.secureAccessRdpUser) &&
        Objects.equals(this.secureAccessRmHost, updateItem.secureAccessRmHost) &&
        Objects.equals(this.secureAccessSshCreds, updateItem.secureAccessSshCreds) &&
        Objects.equals(this.secureAccessSshCredsUser, updateItem.secureAccessSshCredsUser) &&
        Objects.equals(this.secureAccessUrl, updateItem.secureAccessUrl) &&
        Objects.equals(this.secureAccessUseInternalBastion, updateItem.secureAccessUseInternalBastion) &&
        Objects.equals(this.secureAccessWebBrowsing, updateItem.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, updateItem.secureAccessWebProxy) &&
        Objects.equals(this.token, updateItem.token) &&
        Objects.equals(this.uidToken, updateItem.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, addTag, certFileData, deleteProtection, description, json, name, newMetadata, newName, rmTag, rotateAfterDisconnect, secureAccessAddHost, secureAccessAllowExternalUser, secureAccessAllowPortForwading, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessAwsRegion, secureAccessBastionApi, secureAccessBastionIssuer, secureAccessBastionSsh, secureAccessClusterEndpoint, secureAccessDashboardUrl, secureAccessDbName, secureAccessDbSchema, secureAccessEnable, secureAccessHost, secureAccessRdGatewayServer, secureAccessRdpDomain, secureAccessRdpUser, secureAccessRmHost, secureAccessSshCreds, secureAccessSshCredsUser, secureAccessUrl, secureAccessUseInternalBastion, secureAccessWebBrowsing, secureAccessWebProxy, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateItem {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    certFileData: ").append(toIndentedString(certFileData)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMetadata: ").append(toIndentedString(newMetadata)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    secureAccessAddHost: ").append(toIndentedString(secureAccessAddHost)).append("\n");
    sb.append("    secureAccessAllowExternalUser: ").append(toIndentedString(secureAccessAllowExternalUser)).append("\n");
    sb.append("    secureAccessAllowPortForwading: ").append(toIndentedString(secureAccessAllowPortForwading)).append("\n");
    sb.append("    secureAccessAwsAccountId: ").append(toIndentedString(secureAccessAwsAccountId)).append("\n");
    sb.append("    secureAccessAwsNativeCli: ").append(toIndentedString(secureAccessAwsNativeCli)).append("\n");
    sb.append("    secureAccessAwsRegion: ").append(toIndentedString(secureAccessAwsRegion)).append("\n");
    sb.append("    secureAccessBastionApi: ").append(toIndentedString(secureAccessBastionApi)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessBastionSsh: ").append(toIndentedString(secureAccessBastionSsh)).append("\n");
    sb.append("    secureAccessClusterEndpoint: ").append(toIndentedString(secureAccessClusterEndpoint)).append("\n");
    sb.append("    secureAccessDashboardUrl: ").append(toIndentedString(secureAccessDashboardUrl)).append("\n");
    sb.append("    secureAccessDbName: ").append(toIndentedString(secureAccessDbName)).append("\n");
    sb.append("    secureAccessDbSchema: ").append(toIndentedString(secureAccessDbSchema)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdGatewayServer: ").append(toIndentedString(secureAccessRdGatewayServer)).append("\n");
    sb.append("    secureAccessRdpDomain: ").append(toIndentedString(secureAccessRdpDomain)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    secureAccessRmHost: ").append(toIndentedString(secureAccessRmHost)).append("\n");
    sb.append("    secureAccessSshCreds: ").append(toIndentedString(secureAccessSshCreds)).append("\n");
    sb.append("    secureAccessSshCredsUser: ").append(toIndentedString(secureAccessSshCredsUser)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
    sb.append("    secureAccessUseInternalBastion: ").append(toIndentedString(secureAccessUseInternalBastion)).append("\n");
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

