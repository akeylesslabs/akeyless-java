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
 * createAuthMethodHuawei is a command that creates a new auth method that will be able to authenticate using Huawei credentials.
 */
@ApiModel(description = "createAuthMethodHuawei is a command that creates a new auth method that will be able to authenticate using Huawei credentials.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAuthMethodHuawei {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  private List<String> auditLogsClaims = null;

  public static final String SERIALIZED_NAME_AUTH_URL = "auth-url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl = "https://iam.myhwclouds.com:443/v3";

  public static final String SERIALIZED_NAME_BOUND_DOMAIN_ID = "bound-domain-id";
  @SerializedName(SERIALIZED_NAME_BOUND_DOMAIN_ID)
  private List<String> boundDomainId = null;

  public static final String SERIALIZED_NAME_BOUND_DOMAIN_NAME = "bound-domain-name";
  @SerializedName(SERIALIZED_NAME_BOUND_DOMAIN_NAME)
  private List<String> boundDomainName = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_TENANT_ID = "bound-tenant-id";
  @SerializedName(SERIALIZED_NAME_BOUND_TENANT_ID)
  private List<String> boundTenantId = null;

  public static final String SERIALIZED_NAME_BOUND_TENANT_NAME = "bound-tenant-name";
  @SerializedName(SERIALIZED_NAME_BOUND_TENANT_NAME)
  private List<String> boundTenantName = null;

  public static final String SERIALIZED_NAME_BOUND_USER_ID = "bound-user-id";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_ID)
  private List<String> boundUserId = null;

  public static final String SERIALIZED_NAME_BOUND_USER_NAME = "bound-user-name";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_NAME)
  private List<String> boundUserName = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product-type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private List<String> productType = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateAuthMethodHuawei() { 
  }

  public CreateAuthMethodHuawei accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access expiration date in Unix timestamp (select 0 for access without expiry date)")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public CreateAuthMethodHuawei auditLogsClaims(List<String> auditLogsClaims) {
    
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public CreateAuthMethodHuawei addAuditLogsClaimsItem(String auditLogsClaimsItem) {
    if (this.auditLogsClaims == null) {
      this.auditLogsClaims = new ArrayList<String>();
    }
    this.auditLogsClaims.add(auditLogsClaimsItem);
    return this;
  }

   /**
   * Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot;
   * @return auditLogsClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subclaims to include in audit logs, e.g \"--audit-logs-claims email --audit-logs-claims username\"")

  public List<String> getAuditLogsClaims() {
    return auditLogsClaims;
  }


  public void setAuditLogsClaims(List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
  }


  public CreateAuthMethodHuawei authUrl(String authUrl) {
    
    this.authUrl = authUrl;
    return this;
  }

   /**
   * sts URL
   * @return authUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sts URL")

  public String getAuthUrl() {
    return authUrl;
  }


  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public CreateAuthMethodHuawei boundDomainId(List<String> boundDomainId) {
    
    this.boundDomainId = boundDomainId;
    return this;
  }

  public CreateAuthMethodHuawei addBoundDomainIdItem(String boundDomainIdItem) {
    if (this.boundDomainId == null) {
      this.boundDomainId = new ArrayList<String>();
    }
    this.boundDomainId.add(boundDomainIdItem);
    return this;
  }

   /**
   * A list of domain IDs that the access is restricted to
   * @return boundDomainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of domain IDs that the access is restricted to")

  public List<String> getBoundDomainId() {
    return boundDomainId;
  }


  public void setBoundDomainId(List<String> boundDomainId) {
    this.boundDomainId = boundDomainId;
  }


  public CreateAuthMethodHuawei boundDomainName(List<String> boundDomainName) {
    
    this.boundDomainName = boundDomainName;
    return this;
  }

  public CreateAuthMethodHuawei addBoundDomainNameItem(String boundDomainNameItem) {
    if (this.boundDomainName == null) {
      this.boundDomainName = new ArrayList<String>();
    }
    this.boundDomainName.add(boundDomainNameItem);
    return this;
  }

   /**
   * A list of domain names that the access is restricted to
   * @return boundDomainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of domain names that the access is restricted to")

  public List<String> getBoundDomainName() {
    return boundDomainName;
  }


  public void setBoundDomainName(List<String> boundDomainName) {
    this.boundDomainName = boundDomainName;
  }


  public CreateAuthMethodHuawei boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodHuawei addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public CreateAuthMethodHuawei boundTenantId(List<String> boundTenantId) {
    
    this.boundTenantId = boundTenantId;
    return this;
  }

  public CreateAuthMethodHuawei addBoundTenantIdItem(String boundTenantIdItem) {
    if (this.boundTenantId == null) {
      this.boundTenantId = new ArrayList<String>();
    }
    this.boundTenantId.add(boundTenantIdItem);
    return this;
  }

   /**
   * A list of full tenant ids that the access is restricted to
   * @return boundTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full tenant ids that the access is restricted to")

  public List<String> getBoundTenantId() {
    return boundTenantId;
  }


  public void setBoundTenantId(List<String> boundTenantId) {
    this.boundTenantId = boundTenantId;
  }


  public CreateAuthMethodHuawei boundTenantName(List<String> boundTenantName) {
    
    this.boundTenantName = boundTenantName;
    return this;
  }

  public CreateAuthMethodHuawei addBoundTenantNameItem(String boundTenantNameItem) {
    if (this.boundTenantName == null) {
      this.boundTenantName = new ArrayList<String>();
    }
    this.boundTenantName.add(boundTenantNameItem);
    return this;
  }

   /**
   * A list of full tenant names that the access is restricted to
   * @return boundTenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full tenant names that the access is restricted to")

  public List<String> getBoundTenantName() {
    return boundTenantName;
  }


  public void setBoundTenantName(List<String> boundTenantName) {
    this.boundTenantName = boundTenantName;
  }


  public CreateAuthMethodHuawei boundUserId(List<String> boundUserId) {
    
    this.boundUserId = boundUserId;
    return this;
  }

  public CreateAuthMethodHuawei addBoundUserIdItem(String boundUserIdItem) {
    if (this.boundUserId == null) {
      this.boundUserId = new ArrayList<String>();
    }
    this.boundUserId.add(boundUserIdItem);
    return this;
  }

   /**
   * A list of full user ids that the access is restricted to
   * @return boundUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user ids that the access is restricted to")

  public List<String> getBoundUserId() {
    return boundUserId;
  }


  public void setBoundUserId(List<String> boundUserId) {
    this.boundUserId = boundUserId;
  }


  public CreateAuthMethodHuawei boundUserName(List<String> boundUserName) {
    
    this.boundUserName = boundUserName;
    return this;
  }

  public CreateAuthMethodHuawei addBoundUserNameItem(String boundUserNameItem) {
    if (this.boundUserName == null) {
      this.boundUserName = new ArrayList<String>();
    }
    this.boundUserName.add(boundUserNameItem);
    return this;
  }

   /**
   * A list of full user-name that the access is restricted to
   * @return boundUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user-name that the access is restricted to")

  public List<String> getBoundUserName() {
    return boundUserName;
  }


  public void setBoundUserName(List<String> boundUserName) {
    this.boundUserName = boundUserName;
  }


  public CreateAuthMethodHuawei description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Auth Method description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateAuthMethodHuawei forceSubClaims(Boolean forceSubClaims) {
    
    this.forceSubClaims = forceSubClaims;
    return this;
  }

   /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if true: enforce role-association must include sub claims")

  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }


  public void setForceSubClaims(Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public CreateAuthMethodHuawei gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodHuawei addGwBoundIpsItem(String gwBoundIpsItem) {
    if (this.gwBoundIps == null) {
      this.gwBoundIps = new ArrayList<String>();
    }
    this.gwBoundIps.add(gwBoundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the GW IPs that the access is restricted to
   * @return gwBoundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the GW IPs that the access is restricted to")

  public List<String> getGwBoundIps() {
    return gwBoundIps;
  }


  public void setGwBoundIps(List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
  }


  public CreateAuthMethodHuawei json(Boolean json) {
    
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


  public CreateAuthMethodHuawei jwtTtl(Long jwtTtl) {
    
    this.jwtTtl = jwtTtl;
    return this;
  }

   /**
   * Jwt TTL
   * @return jwtTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jwt TTL")

  public Long getJwtTtl() {
    return jwtTtl;
  }


  public void setJwtTtl(Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public CreateAuthMethodHuawei name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAuthMethodHuawei productType(List<String> productType) {
    
    this.productType = productType;
    return this;
  }

  public CreateAuthMethodHuawei addProductTypeItem(String productTypeItem) {
    if (this.productType == null) {
      this.productType = new ArrayList<String>();
    }
    this.productType.add(productTypeItem);
    return this;
  }

   /**
   * Choose the relevant product type for the auth method [sm, sra, pm, dp, ca]
   * @return productType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose the relevant product type for the auth method [sm, sra, pm, dp, ca]")

  public List<String> getProductType() {
    return productType;
  }


  public void setProductType(List<String> productType) {
    this.productType = productType;
  }


  public CreateAuthMethodHuawei token(String token) {
    
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


  public CreateAuthMethodHuawei uidToken(String uidToken) {
    
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
    CreateAuthMethodHuawei createAuthMethodHuawei = (CreateAuthMethodHuawei) o;
    return Objects.equals(this.accessExpires, createAuthMethodHuawei.accessExpires) &&
        Objects.equals(this.auditLogsClaims, createAuthMethodHuawei.auditLogsClaims) &&
        Objects.equals(this.authUrl, createAuthMethodHuawei.authUrl) &&
        Objects.equals(this.boundDomainId, createAuthMethodHuawei.boundDomainId) &&
        Objects.equals(this.boundDomainName, createAuthMethodHuawei.boundDomainName) &&
        Objects.equals(this.boundIps, createAuthMethodHuawei.boundIps) &&
        Objects.equals(this.boundTenantId, createAuthMethodHuawei.boundTenantId) &&
        Objects.equals(this.boundTenantName, createAuthMethodHuawei.boundTenantName) &&
        Objects.equals(this.boundUserId, createAuthMethodHuawei.boundUserId) &&
        Objects.equals(this.boundUserName, createAuthMethodHuawei.boundUserName) &&
        Objects.equals(this.description, createAuthMethodHuawei.description) &&
        Objects.equals(this.forceSubClaims, createAuthMethodHuawei.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, createAuthMethodHuawei.gwBoundIps) &&
        Objects.equals(this.json, createAuthMethodHuawei.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodHuawei.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodHuawei.name) &&
        Objects.equals(this.productType, createAuthMethodHuawei.productType) &&
        Objects.equals(this.token, createAuthMethodHuawei.token) &&
        Objects.equals(this.uidToken, createAuthMethodHuawei.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, auditLogsClaims, authUrl, boundDomainId, boundDomainName, boundIps, boundTenantId, boundTenantName, boundUserId, boundUserName, description, forceSubClaims, gwBoundIps, json, jwtTtl, name, productType, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodHuawei {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    boundDomainId: ").append(toIndentedString(boundDomainId)).append("\n");
    sb.append("    boundDomainName: ").append(toIndentedString(boundDomainName)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundTenantId: ").append(toIndentedString(boundTenantId)).append("\n");
    sb.append("    boundTenantName: ").append(toIndentedString(boundTenantName)).append("\n");
    sb.append("    boundUserId: ").append(toIndentedString(boundUserId)).append("\n");
    sb.append("    boundUserName: ").append(toIndentedString(boundUserName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

