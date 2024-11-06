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
 * authMethodUpdateKerberos is a command that updates an auth method that will be able to authenticate using Kerberos
 */
@ApiModel(description = "authMethodUpdateKerberos is a command that updates an auth method that will be able to authenticate using Kerberos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthMethodUpdateKerberos {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  private List<String> auditLogsClaims = null;

  public static final String SERIALIZED_NAME_BIND_DN = "bind-dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  private String bindDn;

  public static final String SERIALIZED_NAME_BIND_DN_PASSWORD = "bind-dn-password";
  @SerializedName(SERIALIZED_NAME_BIND_DN_PASSWORD)
  private String bindDnPassword;

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

  public static final String SERIALIZED_NAME_GROUP_ATTR = "group-attr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private String groupAttr;

  public static final String SERIALIZED_NAME_GROUP_DN = "group-dn";
  @SerializedName(SERIALIZED_NAME_GROUP_DN)
  private String groupDn;

  public static final String SERIALIZED_NAME_GROUP_FILTER = "group-filter";
  @SerializedName(SERIALIZED_NAME_GROUP_FILTER)
  private String groupFilter;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_KEYTAB_FILE_DATA = "keytab-file-data";
  @SerializedName(SERIALIZED_NAME_KEYTAB_FILE_DATA)
  private String keytabFileData;

  public static final String SERIALIZED_NAME_KEYTAB_FILE_PATH = "keytab-file-path";
  @SerializedName(SERIALIZED_NAME_KEYTAB_FILE_PATH)
  private String keytabFilePath;

  public static final String SERIALIZED_NAME_KRB5_CONF_DATA = "krb5-conf-data";
  @SerializedName(SERIALIZED_NAME_KRB5_CONF_DATA)
  private String krb5ConfData;

  public static final String SERIALIZED_NAME_KRB5_CONF_PATH = "krb5-conf-path";
  @SerializedName(SERIALIZED_NAME_KRB5_CONF_PATH)
  private String krb5ConfPath;

  public static final String SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH = "ldap-anonymous-search";
  @SerializedName(SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH)
  private Boolean ldapAnonymousSearch;

  public static final String SERIALIZED_NAME_LDAP_CA_CERT = "ldap-ca-cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CA_CERT)
  private String ldapCaCert;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap-url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product-type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private List<String> productType = null;

  public static final String SERIALIZED_NAME_SUBCLAIMS_DELIMITERS = "subclaims-delimiters";
  @SerializedName(SERIALIZED_NAME_SUBCLAIMS_DELIMITERS)
  private List<String> subclaimsDelimiters = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public static final String SERIALIZED_NAME_USER_ATTRIBUTE = "user-attribute";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTE)
  private String userAttribute;

  public static final String SERIALIZED_NAME_USER_DN = "user-dn";
  @SerializedName(SERIALIZED_NAME_USER_DN)
  private String userDn;

  public AuthMethodUpdateKerberos() { 
  }

  public AuthMethodUpdateKerberos accessExpires(Long accessExpires) {
    
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


  public AuthMethodUpdateKerberos auditLogsClaims(List<String> auditLogsClaims) {
    
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodUpdateKerberos addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public AuthMethodUpdateKerberos bindDn(String bindDn) {
    
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Get bindDn
   * @return bindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBindDn() {
    return bindDn;
  }


  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }


  public AuthMethodUpdateKerberos bindDnPassword(String bindDnPassword) {
    
    this.bindDnPassword = bindDnPassword;
    return this;
  }

   /**
   * Get bindDnPassword
   * @return bindDnPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBindDnPassword() {
    return bindDnPassword;
  }


  public void setBindDnPassword(String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
  }


  public AuthMethodUpdateKerberos boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public AuthMethodUpdateKerberos addBoundIpsItem(String boundIpsItem) {
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


  public AuthMethodUpdateKerberos deleteProtection(String deleteProtection) {
    
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


  public AuthMethodUpdateKerberos description(String description) {
    
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


  public AuthMethodUpdateKerberos forceSubClaims(Boolean forceSubClaims) {
    
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


  public AuthMethodUpdateKerberos groupAttr(String groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

   /**
   * Get groupAttr
   * @return groupAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupAttr() {
    return groupAttr;
  }


  public void setGroupAttr(String groupAttr) {
    this.groupAttr = groupAttr;
  }


  public AuthMethodUpdateKerberos groupDn(String groupDn) {
    
    this.groupDn = groupDn;
    return this;
  }

   /**
   * Get groupDn
   * @return groupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupDn() {
    return groupDn;
  }


  public void setGroupDn(String groupDn) {
    this.groupDn = groupDn;
  }


  public AuthMethodUpdateKerberos groupFilter(String groupFilter) {
    
    this.groupFilter = groupFilter;
    return this;
  }

   /**
   * Get groupFilter
   * @return groupFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupFilter() {
    return groupFilter;
  }


  public void setGroupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
  }


  public AuthMethodUpdateKerberos gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public AuthMethodUpdateKerberos addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public AuthMethodUpdateKerberos json(Boolean json) {
    
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


  public AuthMethodUpdateKerberos jwtTtl(Long jwtTtl) {
    
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


  public AuthMethodUpdateKerberos keytabFileData(String keytabFileData) {
    
    this.keytabFileData = keytabFileData;
    return this;
  }

   /**
   * Get keytabFileData
   * @return keytabFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeytabFileData() {
    return keytabFileData;
  }


  public void setKeytabFileData(String keytabFileData) {
    this.keytabFileData = keytabFileData;
  }


  public AuthMethodUpdateKerberos keytabFilePath(String keytabFilePath) {
    
    this.keytabFilePath = keytabFilePath;
    return this;
  }

   /**
   * Get keytabFilePath
   * @return keytabFilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeytabFilePath() {
    return keytabFilePath;
  }


  public void setKeytabFilePath(String keytabFilePath) {
    this.keytabFilePath = keytabFilePath;
  }


  public AuthMethodUpdateKerberos krb5ConfData(String krb5ConfData) {
    
    this.krb5ConfData = krb5ConfData;
    return this;
  }

   /**
   * Get krb5ConfData
   * @return krb5ConfData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKrb5ConfData() {
    return krb5ConfData;
  }


  public void setKrb5ConfData(String krb5ConfData) {
    this.krb5ConfData = krb5ConfData;
  }


  public AuthMethodUpdateKerberos krb5ConfPath(String krb5ConfPath) {
    
    this.krb5ConfPath = krb5ConfPath;
    return this;
  }

   /**
   * Get krb5ConfPath
   * @return krb5ConfPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKrb5ConfPath() {
    return krb5ConfPath;
  }


  public void setKrb5ConfPath(String krb5ConfPath) {
    this.krb5ConfPath = krb5ConfPath;
  }


  public AuthMethodUpdateKerberos ldapAnonymousSearch(Boolean ldapAnonymousSearch) {
    
    this.ldapAnonymousSearch = ldapAnonymousSearch;
    return this;
  }

   /**
   * Get ldapAnonymousSearch
   * @return ldapAnonymousSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLdapAnonymousSearch() {
    return ldapAnonymousSearch;
  }


  public void setLdapAnonymousSearch(Boolean ldapAnonymousSearch) {
    this.ldapAnonymousSearch = ldapAnonymousSearch;
  }


  public AuthMethodUpdateKerberos ldapCaCert(String ldapCaCert) {
    
    this.ldapCaCert = ldapCaCert;
    return this;
  }

   /**
   * Get ldapCaCert
   * @return ldapCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapCaCert() {
    return ldapCaCert;
  }


  public void setLdapCaCert(String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
  }


  public AuthMethodUpdateKerberos ldapUrl(String ldapUrl) {
    
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * Get ldapUrl
   * @return ldapUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUrl() {
    return ldapUrl;
  }


  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public AuthMethodUpdateKerberos name(String name) {
    
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


  public AuthMethodUpdateKerberos newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public AuthMethodUpdateKerberos productType(List<String> productType) {
    
    this.productType = productType;
    return this;
  }

  public AuthMethodUpdateKerberos addProductTypeItem(String productTypeItem) {
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


  public AuthMethodUpdateKerberos subclaimsDelimiters(List<String> subclaimsDelimiters) {
    
    this.subclaimsDelimiters = subclaimsDelimiters;
    return this;
  }

  public AuthMethodUpdateKerberos addSubclaimsDelimitersItem(String subclaimsDelimitersItem) {
    if (this.subclaimsDelimiters == null) {
      this.subclaimsDelimiters = new ArrayList<String>();
    }
    this.subclaimsDelimiters.add(subclaimsDelimitersItem);
    return this;
  }

   /**
   * A list of additional sub claims delimiters (relevant only for SAML, OIDC, OAuth2/JWT)
   * @return subclaimsDelimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of additional sub claims delimiters (relevant only for SAML, OIDC, OAuth2/JWT)")

  public List<String> getSubclaimsDelimiters() {
    return subclaimsDelimiters;
  }


  public void setSubclaimsDelimiters(List<String> subclaimsDelimiters) {
    this.subclaimsDelimiters = subclaimsDelimiters;
  }


  public AuthMethodUpdateKerberos token(String token) {
    
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


  public AuthMethodUpdateKerberos uidToken(String uidToken) {
    
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


  public AuthMethodUpdateKerberos uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value which is a \&quot;sub claim\&quot; name that contains details uniquely identifying that resource. This \&quot;sub claim\&quot; is used to distinguish between different identities.
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier (ID) value which is a \"sub claim\" name that contains details uniquely identifying that resource. This \"sub claim\" is used to distinguish between different identities.")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  public AuthMethodUpdateKerberos userAttribute(String userAttribute) {
    
    this.userAttribute = userAttribute;
    return this;
  }

   /**
   * Get userAttribute
   * @return userAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserAttribute() {
    return userAttribute;
  }


  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }


  public AuthMethodUpdateKerberos userDn(String userDn) {
    
    this.userDn = userDn;
    return this;
  }

   /**
   * Get userDn
   * @return userDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserDn() {
    return userDn;
  }


  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodUpdateKerberos authMethodUpdateKerberos = (AuthMethodUpdateKerberos) o;
    return Objects.equals(this.accessExpires, authMethodUpdateKerberos.accessExpires) &&
        Objects.equals(this.auditLogsClaims, authMethodUpdateKerberos.auditLogsClaims) &&
        Objects.equals(this.bindDn, authMethodUpdateKerberos.bindDn) &&
        Objects.equals(this.bindDnPassword, authMethodUpdateKerberos.bindDnPassword) &&
        Objects.equals(this.boundIps, authMethodUpdateKerberos.boundIps) &&
        Objects.equals(this.deleteProtection, authMethodUpdateKerberos.deleteProtection) &&
        Objects.equals(this.description, authMethodUpdateKerberos.description) &&
        Objects.equals(this.forceSubClaims, authMethodUpdateKerberos.forceSubClaims) &&
        Objects.equals(this.groupAttr, authMethodUpdateKerberos.groupAttr) &&
        Objects.equals(this.groupDn, authMethodUpdateKerberos.groupDn) &&
        Objects.equals(this.groupFilter, authMethodUpdateKerberos.groupFilter) &&
        Objects.equals(this.gwBoundIps, authMethodUpdateKerberos.gwBoundIps) &&
        Objects.equals(this.json, authMethodUpdateKerberos.json) &&
        Objects.equals(this.jwtTtl, authMethodUpdateKerberos.jwtTtl) &&
        Objects.equals(this.keytabFileData, authMethodUpdateKerberos.keytabFileData) &&
        Objects.equals(this.keytabFilePath, authMethodUpdateKerberos.keytabFilePath) &&
        Objects.equals(this.krb5ConfData, authMethodUpdateKerberos.krb5ConfData) &&
        Objects.equals(this.krb5ConfPath, authMethodUpdateKerberos.krb5ConfPath) &&
        Objects.equals(this.ldapAnonymousSearch, authMethodUpdateKerberos.ldapAnonymousSearch) &&
        Objects.equals(this.ldapCaCert, authMethodUpdateKerberos.ldapCaCert) &&
        Objects.equals(this.ldapUrl, authMethodUpdateKerberos.ldapUrl) &&
        Objects.equals(this.name, authMethodUpdateKerberos.name) &&
        Objects.equals(this.newName, authMethodUpdateKerberos.newName) &&
        Objects.equals(this.productType, authMethodUpdateKerberos.productType) &&
        Objects.equals(this.subclaimsDelimiters, authMethodUpdateKerberos.subclaimsDelimiters) &&
        Objects.equals(this.token, authMethodUpdateKerberos.token) &&
        Objects.equals(this.uidToken, authMethodUpdateKerberos.uidToken) &&
        Objects.equals(this.uniqueIdentifier, authMethodUpdateKerberos.uniqueIdentifier) &&
        Objects.equals(this.userAttribute, authMethodUpdateKerberos.userAttribute) &&
        Objects.equals(this.userDn, authMethodUpdateKerberos.userDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, auditLogsClaims, bindDn, bindDnPassword, boundIps, deleteProtection, description, forceSubClaims, groupAttr, groupDn, groupFilter, gwBoundIps, json, jwtTtl, keytabFileData, keytabFilePath, krb5ConfData, krb5ConfPath, ldapAnonymousSearch, ldapCaCert, ldapUrl, name, newName, productType, subclaimsDelimiters, token, uidToken, uniqueIdentifier, userAttribute, userDn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodUpdateKerberos {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindDnPassword: ").append(toIndentedString(bindDnPassword)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
    sb.append("    groupDn: ").append(toIndentedString(groupDn)).append("\n");
    sb.append("    groupFilter: ").append(toIndentedString(groupFilter)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    keytabFileData: ").append(toIndentedString(keytabFileData)).append("\n");
    sb.append("    keytabFilePath: ").append(toIndentedString(keytabFilePath)).append("\n");
    sb.append("    krb5ConfData: ").append(toIndentedString(krb5ConfData)).append("\n");
    sb.append("    krb5ConfPath: ").append(toIndentedString(krb5ConfPath)).append("\n");
    sb.append("    ldapAnonymousSearch: ").append(toIndentedString(ldapAnonymousSearch)).append("\n");
    sb.append("    ldapCaCert: ").append(toIndentedString(ldapCaCert)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    subclaimsDelimiters: ").append(toIndentedString(subclaimsDelimiters)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
    sb.append("    userAttribute: ").append(toIndentedString(userAttribute)).append("\n");
    sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
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
