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
import io.akeyless.client.model.TargetNameWithHosts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecureRemoteAccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecureRemoteAccess {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ALLOW_PORT_FORWARDING = "allow_port_forwarding";
  @SerializedName(SERIALIZED_NAME_ALLOW_PORT_FORWARDING)
  private Boolean allowPortForwarding;

  public static final String SERIALIZED_NAME_ALLOW_PROVIDING_EXTERNAL_USERNAME = "allow_providing_external_username";
  @SerializedName(SERIALIZED_NAME_ALLOW_PROVIDING_EXTERNAL_USERNAME)
  private Boolean allowProvidingExternalUsername;

  public static final String SERIALIZED_NAME_BASTION_API = "bastion_api";
  @SerializedName(SERIALIZED_NAME_BASTION_API)
  private String bastionApi;

  public static final String SERIALIZED_NAME_BASTION_ISSUER = "bastion_issuer";
  @SerializedName(SERIALIZED_NAME_BASTION_ISSUER)
  private String bastionIssuer;

  public static final String SERIALIZED_NAME_BASTION_ISSUER_ID = "bastion_issuer_id";
  @SerializedName(SERIALIZED_NAME_BASTION_ISSUER_ID)
  private Long bastionIssuerId;

  public static final String SERIALIZED_NAME_BASTION_SSH = "bastion_ssh";
  @SerializedName(SERIALIZED_NAME_BASTION_SSH)
  private String bastionSsh;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DASHBOARD_URL = "dashboard_url";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_URL)
  private String dashboardUrl;

  public static final String SERIALIZED_NAME_DB_NAME = "db_name";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private List<String> host = null;

  public static final String SERIALIZED_NAME_HOST_PROVIDER_TYPE = "host_provider_type";
  @SerializedName(SERIALIZED_NAME_HOST_PROVIDER_TYPE)
  private String hostProviderType;

  public static final String SERIALIZED_NAME_IS_CLI = "is_cli";
  @SerializedName(SERIALIZED_NAME_IS_CLI)
  private Boolean isCli;

  public static final String SERIALIZED_NAME_IS_WEB = "is_web";
  @SerializedName(SERIALIZED_NAME_IS_WEB)
  private Boolean isWeb;

  public static final String SERIALIZED_NAME_ISOLATED = "isolated";
  @SerializedName(SERIALIZED_NAME_ISOLATED)
  private Boolean isolated;

  public static final String SERIALIZED_NAME_NATIVE = "native";
  @SerializedName(SERIALIZED_NAME_NATIVE)
  private Boolean _native;

  public static final String SERIALIZED_NAME_RD_GATEWAY_SERVER = "rd_gateway_server";
  @SerializedName(SERIALIZED_NAME_RD_GATEWAY_SERVER)
  private String rdGatewayServer;

  public static final String SERIALIZED_NAME_RDP_USER = "rdp_user";
  @SerializedName(SERIALIZED_NAME_RDP_USER)
  private String rdpUser;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT = "rotate_after_disconnect";
  @SerializedName(SERIALIZED_NAME_ROTATE_AFTER_DISCONNECT)
  private Boolean rotateAfterDisconnect;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private String schema;

  public static final String SERIALIZED_NAME_SSH_PASSWORD = "ssh_password";
  @SerializedName(SERIALIZED_NAME_SSH_PASSWORD)
  private Boolean sshPassword;

  public static final String SERIALIZED_NAME_SSH_PRIVATE_KEY = "ssh_private_key";
  @SerializedName(SERIALIZED_NAME_SSH_PRIVATE_KEY)
  private Boolean sshPrivateKey;

  public static final String SERIALIZED_NAME_SSH_USER = "ssh_user";
  @SerializedName(SERIALIZED_NAME_SSH_USER)
  private String sshUser;

  public static final String SERIALIZED_NAME_TARGET_HOSTS = "target_hosts";
  @SerializedName(SERIALIZED_NAME_TARGET_HOSTS)
  private List<TargetNameWithHosts> targetHosts = null;

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<String> targets = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USE_INTERNAL_BASTION = "use_internal_bastion";
  @SerializedName(SERIALIZED_NAME_USE_INTERNAL_BASTION)
  private Boolean useInternalBastion;

  public static final String SERIALIZED_NAME_WEB_PROXY = "web_proxy";
  @SerializedName(SERIALIZED_NAME_WEB_PROXY)
  private Boolean webProxy;

  public SecureRemoteAccess() { 
  }

  public SecureRemoteAccess accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SecureRemoteAccess allowPortForwarding(Boolean allowPortForwarding) {
    
    this.allowPortForwarding = allowPortForwarding;
    return this;
  }

   /**
   * Get allowPortForwarding
   * @return allowPortForwarding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowPortForwarding() {
    return allowPortForwarding;
  }


  public void setAllowPortForwarding(Boolean allowPortForwarding) {
    this.allowPortForwarding = allowPortForwarding;
  }


  public SecureRemoteAccess allowProvidingExternalUsername(Boolean allowProvidingExternalUsername) {
    
    this.allowProvidingExternalUsername = allowProvidingExternalUsername;
    return this;
  }

   /**
   * Get allowProvidingExternalUsername
   * @return allowProvidingExternalUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowProvidingExternalUsername() {
    return allowProvidingExternalUsername;
  }


  public void setAllowProvidingExternalUsername(Boolean allowProvidingExternalUsername) {
    this.allowProvidingExternalUsername = allowProvidingExternalUsername;
  }


  public SecureRemoteAccess bastionApi(String bastionApi) {
    
    this.bastionApi = bastionApi;
    return this;
  }

   /**
   * Get bastionApi
   * @return bastionApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBastionApi() {
    return bastionApi;
  }


  public void setBastionApi(String bastionApi) {
    this.bastionApi = bastionApi;
  }


  public SecureRemoteAccess bastionIssuer(String bastionIssuer) {
    
    this.bastionIssuer = bastionIssuer;
    return this;
  }

   /**
   * Get bastionIssuer
   * @return bastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBastionIssuer() {
    return bastionIssuer;
  }


  public void setBastionIssuer(String bastionIssuer) {
    this.bastionIssuer = bastionIssuer;
  }


  public SecureRemoteAccess bastionIssuerId(Long bastionIssuerId) {
    
    this.bastionIssuerId = bastionIssuerId;
    return this;
  }

   /**
   * Get bastionIssuerId
   * @return bastionIssuerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBastionIssuerId() {
    return bastionIssuerId;
  }


  public void setBastionIssuerId(Long bastionIssuerId) {
    this.bastionIssuerId = bastionIssuerId;
  }


  public SecureRemoteAccess bastionSsh(String bastionSsh) {
    
    this.bastionSsh = bastionSsh;
    return this;
  }

   /**
   * Get bastionSsh
   * @return bastionSsh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBastionSsh() {
    return bastionSsh;
  }


  public void setBastionSsh(String bastionSsh) {
    this.bastionSsh = bastionSsh;
  }


  public SecureRemoteAccess category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public SecureRemoteAccess dashboardUrl(String dashboardUrl) {
    
    this.dashboardUrl = dashboardUrl;
    return this;
  }

   /**
   * Get dashboardUrl
   * @return dashboardUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDashboardUrl() {
    return dashboardUrl;
  }


  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }


  public SecureRemoteAccess dbName(String dbName) {
    
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDbName() {
    return dbName;
  }


  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public SecureRemoteAccess domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public SecureRemoteAccess enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public SecureRemoteAccess endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public SecureRemoteAccess host(List<String> host) {
    
    this.host = host;
    return this;
  }

  public SecureRemoteAccess addHostItem(String hostItem) {
    if (this.host == null) {
      this.host = new ArrayList<String>();
    }
    this.host.add(hostItem);
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHost() {
    return host;
  }


  public void setHost(List<String> host) {
    this.host = host;
  }


  public SecureRemoteAccess hostProviderType(String hostProviderType) {
    
    this.hostProviderType = hostProviderType;
    return this;
  }

   /**
   * Get hostProviderType
   * @return hostProviderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostProviderType() {
    return hostProviderType;
  }


  public void setHostProviderType(String hostProviderType) {
    this.hostProviderType = hostProviderType;
  }


  public SecureRemoteAccess isCli(Boolean isCli) {
    
    this.isCli = isCli;
    return this;
  }

   /**
   * Get isCli
   * @return isCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCli() {
    return isCli;
  }


  public void setIsCli(Boolean isCli) {
    this.isCli = isCli;
  }


  public SecureRemoteAccess isWeb(Boolean isWeb) {
    
    this.isWeb = isWeb;
    return this;
  }

   /**
   * Get isWeb
   * @return isWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsWeb() {
    return isWeb;
  }


  public void setIsWeb(Boolean isWeb) {
    this.isWeb = isWeb;
  }


  public SecureRemoteAccess isolated(Boolean isolated) {
    
    this.isolated = isolated;
    return this;
  }

   /**
   * Get isolated
   * @return isolated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsolated() {
    return isolated;
  }


  public void setIsolated(Boolean isolated) {
    this.isolated = isolated;
  }


  public SecureRemoteAccess _native(Boolean _native) {
    
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNative() {
    return _native;
  }


  public void setNative(Boolean _native) {
    this._native = _native;
  }


  public SecureRemoteAccess rdGatewayServer(String rdGatewayServer) {
    
    this.rdGatewayServer = rdGatewayServer;
    return this;
  }

   /**
   * Get rdGatewayServer
   * @return rdGatewayServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRdGatewayServer() {
    return rdGatewayServer;
  }


  public void setRdGatewayServer(String rdGatewayServer) {
    this.rdGatewayServer = rdGatewayServer;
  }


  public SecureRemoteAccess rdpUser(String rdpUser) {
    
    this.rdpUser = rdpUser;
    return this;
  }

   /**
   * Get rdpUser
   * @return rdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRdpUser() {
    return rdpUser;
  }


  public void setRdpUser(String rdpUser) {
    this.rdpUser = rdpUser;
  }


  public SecureRemoteAccess region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public SecureRemoteAccess rotateAfterDisconnect(Boolean rotateAfterDisconnect) {
    
    this.rotateAfterDisconnect = rotateAfterDisconnect;
    return this;
  }

   /**
   * Get rotateAfterDisconnect
   * @return rotateAfterDisconnect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRotateAfterDisconnect() {
    return rotateAfterDisconnect;
  }


  public void setRotateAfterDisconnect(Boolean rotateAfterDisconnect) {
    this.rotateAfterDisconnect = rotateAfterDisconnect;
  }


  public SecureRemoteAccess schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchema() {
    return schema;
  }


  public void setSchema(String schema) {
    this.schema = schema;
  }


  public SecureRemoteAccess sshPassword(Boolean sshPassword) {
    
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * Get sshPassword
   * @return sshPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSshPassword() {
    return sshPassword;
  }


  public void setSshPassword(Boolean sshPassword) {
    this.sshPassword = sshPassword;
  }


  public SecureRemoteAccess sshPrivateKey(Boolean sshPrivateKey) {
    
    this.sshPrivateKey = sshPrivateKey;
    return this;
  }

   /**
   * Get sshPrivateKey
   * @return sshPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSshPrivateKey() {
    return sshPrivateKey;
  }


  public void setSshPrivateKey(Boolean sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }


  public SecureRemoteAccess sshUser(String sshUser) {
    
    this.sshUser = sshUser;
    return this;
  }

   /**
   * Get sshUser
   * @return sshUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshUser() {
    return sshUser;
  }


  public void setSshUser(String sshUser) {
    this.sshUser = sshUser;
  }


  public SecureRemoteAccess targetHosts(List<TargetNameWithHosts> targetHosts) {
    
    this.targetHosts = targetHosts;
    return this;
  }

  public SecureRemoteAccess addTargetHostsItem(TargetNameWithHosts targetHostsItem) {
    if (this.targetHosts == null) {
      this.targetHosts = new ArrayList<TargetNameWithHosts>();
    }
    this.targetHosts.add(targetHostsItem);
    return this;
  }

   /**
   * Get targetHosts
   * @return targetHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TargetNameWithHosts> getTargetHosts() {
    return targetHosts;
  }


  public void setTargetHosts(List<TargetNameWithHosts> targetHosts) {
    this.targetHosts = targetHosts;
  }


  public SecureRemoteAccess targets(List<String> targets) {
    
    this.targets = targets;
    return this;
  }

  public SecureRemoteAccess addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<String>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTargets() {
    return targets;
  }


  public void setTargets(List<String> targets) {
    this.targets = targets;
  }


  public SecureRemoteAccess url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public SecureRemoteAccess useInternalBastion(Boolean useInternalBastion) {
    
    this.useInternalBastion = useInternalBastion;
    return this;
  }

   /**
   * Get useInternalBastion
   * @return useInternalBastion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseInternalBastion() {
    return useInternalBastion;
  }


  public void setUseInternalBastion(Boolean useInternalBastion) {
    this.useInternalBastion = useInternalBastion;
  }


  public SecureRemoteAccess webProxy(Boolean webProxy) {
    
    this.webProxy = webProxy;
    return this;
  }

   /**
   * Get webProxy
   * @return webProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWebProxy() {
    return webProxy;
  }


  public void setWebProxy(Boolean webProxy) {
    this.webProxy = webProxy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureRemoteAccess secureRemoteAccess = (SecureRemoteAccess) o;
    return Objects.equals(this.accountId, secureRemoteAccess.accountId) &&
        Objects.equals(this.allowPortForwarding, secureRemoteAccess.allowPortForwarding) &&
        Objects.equals(this.allowProvidingExternalUsername, secureRemoteAccess.allowProvidingExternalUsername) &&
        Objects.equals(this.bastionApi, secureRemoteAccess.bastionApi) &&
        Objects.equals(this.bastionIssuer, secureRemoteAccess.bastionIssuer) &&
        Objects.equals(this.bastionIssuerId, secureRemoteAccess.bastionIssuerId) &&
        Objects.equals(this.bastionSsh, secureRemoteAccess.bastionSsh) &&
        Objects.equals(this.category, secureRemoteAccess.category) &&
        Objects.equals(this.dashboardUrl, secureRemoteAccess.dashboardUrl) &&
        Objects.equals(this.dbName, secureRemoteAccess.dbName) &&
        Objects.equals(this.domain, secureRemoteAccess.domain) &&
        Objects.equals(this.enable, secureRemoteAccess.enable) &&
        Objects.equals(this.endpoint, secureRemoteAccess.endpoint) &&
        Objects.equals(this.host, secureRemoteAccess.host) &&
        Objects.equals(this.hostProviderType, secureRemoteAccess.hostProviderType) &&
        Objects.equals(this.isCli, secureRemoteAccess.isCli) &&
        Objects.equals(this.isWeb, secureRemoteAccess.isWeb) &&
        Objects.equals(this.isolated, secureRemoteAccess.isolated) &&
        Objects.equals(this._native, secureRemoteAccess._native) &&
        Objects.equals(this.rdGatewayServer, secureRemoteAccess.rdGatewayServer) &&
        Objects.equals(this.rdpUser, secureRemoteAccess.rdpUser) &&
        Objects.equals(this.region, secureRemoteAccess.region) &&
        Objects.equals(this.rotateAfterDisconnect, secureRemoteAccess.rotateAfterDisconnect) &&
        Objects.equals(this.schema, secureRemoteAccess.schema) &&
        Objects.equals(this.sshPassword, secureRemoteAccess.sshPassword) &&
        Objects.equals(this.sshPrivateKey, secureRemoteAccess.sshPrivateKey) &&
        Objects.equals(this.sshUser, secureRemoteAccess.sshUser) &&
        Objects.equals(this.targetHosts, secureRemoteAccess.targetHosts) &&
        Objects.equals(this.targets, secureRemoteAccess.targets) &&
        Objects.equals(this.url, secureRemoteAccess.url) &&
        Objects.equals(this.useInternalBastion, secureRemoteAccess.useInternalBastion) &&
        Objects.equals(this.webProxy, secureRemoteAccess.webProxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allowPortForwarding, allowProvidingExternalUsername, bastionApi, bastionIssuer, bastionIssuerId, bastionSsh, category, dashboardUrl, dbName, domain, enable, endpoint, host, hostProviderType, isCli, isWeb, isolated, _native, rdGatewayServer, rdpUser, region, rotateAfterDisconnect, schema, sshPassword, sshPrivateKey, sshUser, targetHosts, targets, url, useInternalBastion, webProxy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureRemoteAccess {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allowPortForwarding: ").append(toIndentedString(allowPortForwarding)).append("\n");
    sb.append("    allowProvidingExternalUsername: ").append(toIndentedString(allowProvidingExternalUsername)).append("\n");
    sb.append("    bastionApi: ").append(toIndentedString(bastionApi)).append("\n");
    sb.append("    bastionIssuer: ").append(toIndentedString(bastionIssuer)).append("\n");
    sb.append("    bastionIssuerId: ").append(toIndentedString(bastionIssuerId)).append("\n");
    sb.append("    bastionSsh: ").append(toIndentedString(bastionSsh)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostProviderType: ").append(toIndentedString(hostProviderType)).append("\n");
    sb.append("    isCli: ").append(toIndentedString(isCli)).append("\n");
    sb.append("    isWeb: ").append(toIndentedString(isWeb)).append("\n");
    sb.append("    isolated: ").append(toIndentedString(isolated)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
    sb.append("    rdGatewayServer: ").append(toIndentedString(rdGatewayServer)).append("\n");
    sb.append("    rdpUser: ").append(toIndentedString(rdpUser)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    rotateAfterDisconnect: ").append(toIndentedString(rotateAfterDisconnect)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    sshUser: ").append(toIndentedString(sshUser)).append("\n");
    sb.append("    targetHosts: ").append(toIndentedString(targetHosts)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useInternalBastion: ").append(toIndentedString(useInternalBastion)).append("\n");
    sb.append("    webProxy: ").append(toIndentedString(webProxy)).append("\n");
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

