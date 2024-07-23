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
 * authMethodUpdateAzureAD is a command that updates a new auth method that will be able to authenticate using Azure Active Directory credentials.
 */
@ApiModel(description = "authMethodUpdateAzureAD is a command that updates a new auth method that will be able to authenticate using Azure Active Directory credentials.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthMethodUpdateAzureAD {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience = "https://management.azure.com/";

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  private List<String> auditLogsClaims = null;

  public static final String SERIALIZED_NAME_BOUND_GROUP_ID = "bound-group-id";
  @SerializedName(SERIALIZED_NAME_BOUND_GROUP_ID)
  private List<String> boundGroupId = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_PROVIDERS = "bound-providers";
  @SerializedName(SERIALIZED_NAME_BOUND_PROVIDERS)
  private List<String> boundProviders = null;

  public static final String SERIALIZED_NAME_BOUND_RESOURCE_ID = "bound-resource-id";
  @SerializedName(SERIALIZED_NAME_BOUND_RESOURCE_ID)
  private List<String> boundResourceId = null;

  public static final String SERIALIZED_NAME_BOUND_RESOURCE_NAMES = "bound-resource-names";
  @SerializedName(SERIALIZED_NAME_BOUND_RESOURCE_NAMES)
  private List<String> boundResourceNames = null;

  public static final String SERIALIZED_NAME_BOUND_RESOURCE_TYPES = "bound-resource-types";
  @SerializedName(SERIALIZED_NAME_BOUND_RESOURCE_TYPES)
  private List<String> boundResourceTypes = null;

  public static final String SERIALIZED_NAME_BOUND_RG_ID = "bound-rg-id";
  @SerializedName(SERIALIZED_NAME_BOUND_RG_ID)
  private List<String> boundRgId = null;

  public static final String SERIALIZED_NAME_BOUND_SPID = "bound-spid";
  @SerializedName(SERIALIZED_NAME_BOUND_SPID)
  private List<String> boundSpid = null;

  public static final String SERIALIZED_NAME_BOUND_SUB_ID = "bound-sub-id";
  @SerializedName(SERIALIZED_NAME_BOUND_SUB_ID)
  private List<String> boundSubId = null;

  public static final String SERIALIZED_NAME_BOUND_TENANT_ID = "bound-tenant-id";
  @SerializedName(SERIALIZED_NAME_BOUND_TENANT_ID)
  private String boundTenantId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer = "https://sts.windows.net/---bound_tenant_id---";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks-uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri = "https://login.microsoftonline.com/common/discovery/keys";

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product-type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private List<String> productType = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public AuthMethodUpdateAzureAD() { 
  }

  public AuthMethodUpdateAzureAD accessExpires(Long accessExpires) {
    
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


  public AuthMethodUpdateAzureAD audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Deprecated (Deprecated) The audience in the JWT
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated (Deprecated) The audience in the JWT")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public AuthMethodUpdateAzureAD auditLogsClaims(List<String> auditLogsClaims) {
    
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodUpdateAzureAD addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public AuthMethodUpdateAzureAD boundGroupId(List<String> boundGroupId) {
    
    this.boundGroupId = boundGroupId;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundGroupIdItem(String boundGroupIdItem) {
    if (this.boundGroupId == null) {
      this.boundGroupId = new ArrayList<String>();
    }
    this.boundGroupId.add(boundGroupIdItem);
    return this;
  }

   /**
   * A list of group ids that the access is restricted to
   * @return boundGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of group ids that the access is restricted to")

  public List<String> getBoundGroupId() {
    return boundGroupId;
  }


  public void setBoundGroupId(List<String> boundGroupId) {
    this.boundGroupId = boundGroupId;
  }


  public AuthMethodUpdateAzureAD boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundIpsItem(String boundIpsItem) {
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


  public AuthMethodUpdateAzureAD boundProviders(List<String> boundProviders) {
    
    this.boundProviders = boundProviders;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundProvidersItem(String boundProvidersItem) {
    if (this.boundProviders == null) {
      this.boundProviders = new ArrayList<String>();
    }
    this.boundProviders.add(boundProvidersItem);
    return this;
  }

   /**
   * A list of resource providers that the access is restricted to (e.g, Microsoft.Compute, Microsoft.ManagedIdentity, etc)
   * @return boundProviders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of resource providers that the access is restricted to (e.g, Microsoft.Compute, Microsoft.ManagedIdentity, etc)")

  public List<String> getBoundProviders() {
    return boundProviders;
  }


  public void setBoundProviders(List<String> boundProviders) {
    this.boundProviders = boundProviders;
  }


  public AuthMethodUpdateAzureAD boundResourceId(List<String> boundResourceId) {
    
    this.boundResourceId = boundResourceId;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundResourceIdItem(String boundResourceIdItem) {
    if (this.boundResourceId == null) {
      this.boundResourceId = new ArrayList<String>();
    }
    this.boundResourceId.add(boundResourceIdItem);
    return this;
  }

   /**
   * A list of full resource ids that the access is restricted to
   * @return boundResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full resource ids that the access is restricted to")

  public List<String> getBoundResourceId() {
    return boundResourceId;
  }


  public void setBoundResourceId(List<String> boundResourceId) {
    this.boundResourceId = boundResourceId;
  }


  public AuthMethodUpdateAzureAD boundResourceNames(List<String> boundResourceNames) {
    
    this.boundResourceNames = boundResourceNames;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundResourceNamesItem(String boundResourceNamesItem) {
    if (this.boundResourceNames == null) {
      this.boundResourceNames = new ArrayList<String>();
    }
    this.boundResourceNames.add(boundResourceNamesItem);
    return this;
  }

   /**
   * A list of resource names that the access is restricted to (e.g, a virtual machine name, scale set name, etc).
   * @return boundResourceNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of resource names that the access is restricted to (e.g, a virtual machine name, scale set name, etc).")

  public List<String> getBoundResourceNames() {
    return boundResourceNames;
  }


  public void setBoundResourceNames(List<String> boundResourceNames) {
    this.boundResourceNames = boundResourceNames;
  }


  public AuthMethodUpdateAzureAD boundResourceTypes(List<String> boundResourceTypes) {
    
    this.boundResourceTypes = boundResourceTypes;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundResourceTypesItem(String boundResourceTypesItem) {
    if (this.boundResourceTypes == null) {
      this.boundResourceTypes = new ArrayList<String>();
    }
    this.boundResourceTypes.add(boundResourceTypesItem);
    return this;
  }

   /**
   * A list of resource types that the access is restricted to (e.g, virtualMachines, userAssignedIdentities, etc)
   * @return boundResourceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of resource types that the access is restricted to (e.g, virtualMachines, userAssignedIdentities, etc)")

  public List<String> getBoundResourceTypes() {
    return boundResourceTypes;
  }


  public void setBoundResourceTypes(List<String> boundResourceTypes) {
    this.boundResourceTypes = boundResourceTypes;
  }


  public AuthMethodUpdateAzureAD boundRgId(List<String> boundRgId) {
    
    this.boundRgId = boundRgId;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundRgIdItem(String boundRgIdItem) {
    if (this.boundRgId == null) {
      this.boundRgId = new ArrayList<String>();
    }
    this.boundRgId.add(boundRgIdItem);
    return this;
  }

   /**
   * A list of resource groups that the access is restricted to
   * @return boundRgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of resource groups that the access is restricted to")

  public List<String> getBoundRgId() {
    return boundRgId;
  }


  public void setBoundRgId(List<String> boundRgId) {
    this.boundRgId = boundRgId;
  }


  public AuthMethodUpdateAzureAD boundSpid(List<String> boundSpid) {
    
    this.boundSpid = boundSpid;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundSpidItem(String boundSpidItem) {
    if (this.boundSpid == null) {
      this.boundSpid = new ArrayList<String>();
    }
    this.boundSpid.add(boundSpidItem);
    return this;
  }

   /**
   * A list of service principal IDs that the access is restricted to
   * @return boundSpid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of service principal IDs that the access is restricted to")

  public List<String> getBoundSpid() {
    return boundSpid;
  }


  public void setBoundSpid(List<String> boundSpid) {
    this.boundSpid = boundSpid;
  }


  public AuthMethodUpdateAzureAD boundSubId(List<String> boundSubId) {
    
    this.boundSubId = boundSubId;
    return this;
  }

  public AuthMethodUpdateAzureAD addBoundSubIdItem(String boundSubIdItem) {
    if (this.boundSubId == null) {
      this.boundSubId = new ArrayList<String>();
    }
    this.boundSubId.add(boundSubIdItem);
    return this;
  }

   /**
   * A list of subscription ids that the access is restricted to
   * @return boundSubId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of subscription ids that the access is restricted to")

  public List<String> getBoundSubId() {
    return boundSubId;
  }


  public void setBoundSubId(List<String> boundSubId) {
    this.boundSubId = boundSubId;
  }


  public AuthMethodUpdateAzureAD boundTenantId(String boundTenantId) {
    
    this.boundTenantId = boundTenantId;
    return this;
  }

   /**
   * The Azure tenant id that the access is restricted to
   * @return boundTenantId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Azure tenant id that the access is restricted to")

  public String getBoundTenantId() {
    return boundTenantId;
  }


  public void setBoundTenantId(String boundTenantId) {
    this.boundTenantId = boundTenantId;
  }


  public AuthMethodUpdateAzureAD deleteProtection(String deleteProtection) {
    
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


  public AuthMethodUpdateAzureAD description(String description) {
    
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


  public AuthMethodUpdateAzureAD forceSubClaims(Boolean forceSubClaims) {
    
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


  public AuthMethodUpdateAzureAD gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public AuthMethodUpdateAzureAD addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public AuthMethodUpdateAzureAD issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer URL
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuer URL")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public AuthMethodUpdateAzureAD json(Boolean json) {
    
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


  public AuthMethodUpdateAzureAD jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.
   * @return jwksUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public AuthMethodUpdateAzureAD jwtTtl(Long jwtTtl) {
    
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


  public AuthMethodUpdateAzureAD name(String name) {
    
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


  public AuthMethodUpdateAzureAD newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Auth Method new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public AuthMethodUpdateAzureAD productType(List<String> productType) {
    
    this.productType = productType;
    return this;
  }

  public AuthMethodUpdateAzureAD addProductTypeItem(String productTypeItem) {
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


  public AuthMethodUpdateAzureAD token(String token) {
    
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


  public AuthMethodUpdateAzureAD uidToken(String uidToken) {
    
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
    AuthMethodUpdateAzureAD authMethodUpdateAzureAD = (AuthMethodUpdateAzureAD) o;
    return Objects.equals(this.accessExpires, authMethodUpdateAzureAD.accessExpires) &&
        Objects.equals(this.audience, authMethodUpdateAzureAD.audience) &&
        Objects.equals(this.auditLogsClaims, authMethodUpdateAzureAD.auditLogsClaims) &&
        Objects.equals(this.boundGroupId, authMethodUpdateAzureAD.boundGroupId) &&
        Objects.equals(this.boundIps, authMethodUpdateAzureAD.boundIps) &&
        Objects.equals(this.boundProviders, authMethodUpdateAzureAD.boundProviders) &&
        Objects.equals(this.boundResourceId, authMethodUpdateAzureAD.boundResourceId) &&
        Objects.equals(this.boundResourceNames, authMethodUpdateAzureAD.boundResourceNames) &&
        Objects.equals(this.boundResourceTypes, authMethodUpdateAzureAD.boundResourceTypes) &&
        Objects.equals(this.boundRgId, authMethodUpdateAzureAD.boundRgId) &&
        Objects.equals(this.boundSpid, authMethodUpdateAzureAD.boundSpid) &&
        Objects.equals(this.boundSubId, authMethodUpdateAzureAD.boundSubId) &&
        Objects.equals(this.boundTenantId, authMethodUpdateAzureAD.boundTenantId) &&
        Objects.equals(this.deleteProtection, authMethodUpdateAzureAD.deleteProtection) &&
        Objects.equals(this.description, authMethodUpdateAzureAD.description) &&
        Objects.equals(this.forceSubClaims, authMethodUpdateAzureAD.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, authMethodUpdateAzureAD.gwBoundIps) &&
        Objects.equals(this.issuer, authMethodUpdateAzureAD.issuer) &&
        Objects.equals(this.json, authMethodUpdateAzureAD.json) &&
        Objects.equals(this.jwksUri, authMethodUpdateAzureAD.jwksUri) &&
        Objects.equals(this.jwtTtl, authMethodUpdateAzureAD.jwtTtl) &&
        Objects.equals(this.name, authMethodUpdateAzureAD.name) &&
        Objects.equals(this.newName, authMethodUpdateAzureAD.newName) &&
        Objects.equals(this.productType, authMethodUpdateAzureAD.productType) &&
        Objects.equals(this.token, authMethodUpdateAzureAD.token) &&
        Objects.equals(this.uidToken, authMethodUpdateAzureAD.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, auditLogsClaims, boundGroupId, boundIps, boundProviders, boundResourceId, boundResourceNames, boundResourceTypes, boundRgId, boundSpid, boundSubId, boundTenantId, deleteProtection, description, forceSubClaims, gwBoundIps, issuer, json, jwksUri, jwtTtl, name, newName, productType, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodUpdateAzureAD {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundGroupId: ").append(toIndentedString(boundGroupId)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundProviders: ").append(toIndentedString(boundProviders)).append("\n");
    sb.append("    boundResourceId: ").append(toIndentedString(boundResourceId)).append("\n");
    sb.append("    boundResourceNames: ").append(toIndentedString(boundResourceNames)).append("\n");
    sb.append("    boundResourceTypes: ").append(toIndentedString(boundResourceTypes)).append("\n");
    sb.append("    boundRgId: ").append(toIndentedString(boundRgId)).append("\n");
    sb.append("    boundSpid: ").append(toIndentedString(boundSpid)).append("\n");
    sb.append("    boundSubId: ").append(toIndentedString(boundSubId)).append("\n");
    sb.append("    boundTenantId: ").append(toIndentedString(boundTenantId)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

