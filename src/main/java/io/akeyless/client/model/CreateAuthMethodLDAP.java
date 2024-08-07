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
 * createAuthMethodLDAP is a command that creates a new auth method that will be able to authenticate using LDAP. [Deprecated: Use auth-method-create-ldap command]
 */
@ApiModel(description = "createAuthMethodLDAP is a command that creates a new auth method that will be able to authenticate using LDAP. [Deprecated: Use auth-method-create-ldap command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAuthMethodLDAP {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  private List<String> auditLogsClaims = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GEN_KEY = "gen-key";
  @SerializedName(SERIALIZED_NAME_GEN_KEY)
  private String genKey = "true";

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

  public static final String SERIALIZED_NAME_PUBLIC_KEY_DATA = "public-key-data";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_DATA)
  private String publicKeyData;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier = "users";

  public CreateAuthMethodLDAP() { 
  }

  public CreateAuthMethodLDAP accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodLDAP auditLogsClaims(List<String> auditLogsClaims) {
    
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public CreateAuthMethodLDAP addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public CreateAuthMethodLDAP boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodLDAP addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodLDAP deleteProtection(String deleteProtection) {
    
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


  public CreateAuthMethodLDAP description(String description) {
    
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


  public CreateAuthMethodLDAP forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodLDAP genKey(String genKey) {
    
    this.genKey = genKey;
    return this;
  }

   /**
   * Automatically generate key-pair for LDAP configuration. If set to false, a public key needs to be provided [true/false]
   * @return genKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatically generate key-pair for LDAP configuration. If set to false, a public key needs to be provided [true/false]")

  public String getGenKey() {
    return genKey;
  }


  public void setGenKey(String genKey) {
    this.genKey = genKey;
  }


  public CreateAuthMethodLDAP gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodLDAP addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public CreateAuthMethodLDAP json(Boolean json) {
    
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


  public CreateAuthMethodLDAP jwtTtl(Long jwtTtl) {
    
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


  public CreateAuthMethodLDAP name(String name) {
    
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


  public CreateAuthMethodLDAP productType(List<String> productType) {
    
    this.productType = productType;
    return this;
  }

  public CreateAuthMethodLDAP addProductTypeItem(String productTypeItem) {
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


  public CreateAuthMethodLDAP publicKeyData(String publicKeyData) {
    
    this.publicKeyData = publicKeyData;
    return this;
  }

   /**
   * A public key generated for LDAP authentication method on Akeyless in base64 or PEM format [RSA2048]
   * @return publicKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A public key generated for LDAP authentication method on Akeyless in base64 or PEM format [RSA2048]")

  public String getPublicKeyData() {
    return publicKeyData;
  }


  public void setPublicKeyData(String publicKeyData) {
    this.publicKeyData = publicKeyData;
  }


  public CreateAuthMethodLDAP token(String token) {
    
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


  public CreateAuthMethodLDAP uidToken(String uidToken) {
    
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


  public CreateAuthMethodLDAP uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthMethodLDAP createAuthMethodLDAP = (CreateAuthMethodLDAP) o;
    return Objects.equals(this.accessExpires, createAuthMethodLDAP.accessExpires) &&
        Objects.equals(this.auditLogsClaims, createAuthMethodLDAP.auditLogsClaims) &&
        Objects.equals(this.boundIps, createAuthMethodLDAP.boundIps) &&
        Objects.equals(this.deleteProtection, createAuthMethodLDAP.deleteProtection) &&
        Objects.equals(this.description, createAuthMethodLDAP.description) &&
        Objects.equals(this.forceSubClaims, createAuthMethodLDAP.forceSubClaims) &&
        Objects.equals(this.genKey, createAuthMethodLDAP.genKey) &&
        Objects.equals(this.gwBoundIps, createAuthMethodLDAP.gwBoundIps) &&
        Objects.equals(this.json, createAuthMethodLDAP.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodLDAP.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodLDAP.name) &&
        Objects.equals(this.productType, createAuthMethodLDAP.productType) &&
        Objects.equals(this.publicKeyData, createAuthMethodLDAP.publicKeyData) &&
        Objects.equals(this.token, createAuthMethodLDAP.token) &&
        Objects.equals(this.uidToken, createAuthMethodLDAP.uidToken) &&
        Objects.equals(this.uniqueIdentifier, createAuthMethodLDAP.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, auditLogsClaims, boundIps, deleteProtection, description, forceSubClaims, genKey, gwBoundIps, json, jwtTtl, name, productType, publicKeyData, token, uidToken, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodLDAP {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    genKey: ").append(toIndentedString(genKey)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    publicKeyData: ").append(toIndentedString(publicKeyData)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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

