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

/**
 * gatewayUpdateLdapAuth is a command that updates ldap auth config
 */
@ApiModel(description = "gatewayUpdateLdapAuth is a command that updates ldap auth config")

public class GatewayUpdateLdapAuthConfig {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_BIND_DN = "bind-dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  private String bindDn;

  public static final String SERIALIZED_NAME_BIND_DN_PASSWORD = "bind-dn-password";
  @SerializedName(SERIALIZED_NAME_BIND_DN_PASSWORD)
  private String bindDnPassword;

  public static final String SERIALIZED_NAME_GROUP_ATTR = "group-attr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private String groupAttr;

  public static final String SERIALIZED_NAME_GROUP_DN = "group-dn";
  @SerializedName(SERIALIZED_NAME_GROUP_DN)
  private String groupDn;

  public static final String SERIALIZED_NAME_GROUP_FILTER = "group-filter";
  @SerializedName(SERIALIZED_NAME_GROUP_FILTER)
  private String groupFilter;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LDAP_CA_CERT = "ldap-ca-cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CA_CERT)
  private String ldapCaCert;

  public static final String SERIALIZED_NAME_LDAP_ENABLE = "ldap-enable";
  @SerializedName(SERIALIZED_NAME_LDAP_ENABLE)
  private String ldapEnable;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap-url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH = "ldap_anonymous_search";
  @SerializedName(SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH)
  private Boolean ldapAnonymousSearch;

  public static final String SERIALIZED_NAME_SIGNING_KEY_DATA = "signing-key-data";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY_DATA)
  private String signingKeyData;

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


  public GatewayUpdateLdapAuthConfig accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * The access ID of the Ldap auth method
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access ID of the Ldap auth method")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public GatewayUpdateLdapAuthConfig bindDn(String bindDn) {
    
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Bind DN
   * @return bindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN")

  public String getBindDn() {
    return bindDn;
  }


  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }


  public GatewayUpdateLdapAuthConfig bindDnPassword(String bindDnPassword) {
    
    this.bindDnPassword = bindDnPassword;
    return this;
  }

   /**
   * Bind DN Password
   * @return bindDnPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN Password")

  public String getBindDnPassword() {
    return bindDnPassword;
  }


  public void setBindDnPassword(String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
  }


  public GatewayUpdateLdapAuthConfig groupAttr(String groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

   /**
   * Group Attr
   * @return groupAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group Attr")

  public String getGroupAttr() {
    return groupAttr;
  }


  public void setGroupAttr(String groupAttr) {
    this.groupAttr = groupAttr;
  }


  public GatewayUpdateLdapAuthConfig groupDn(String groupDn) {
    
    this.groupDn = groupDn;
    return this;
  }

   /**
   * Group Dn
   * @return groupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group Dn")

  public String getGroupDn() {
    return groupDn;
  }


  public void setGroupDn(String groupDn) {
    this.groupDn = groupDn;
  }


  public GatewayUpdateLdapAuthConfig groupFilter(String groupFilter) {
    
    this.groupFilter = groupFilter;
    return this;
  }

   /**
   * Group Filter
   * @return groupFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group Filter")

  public String getGroupFilter() {
    return groupFilter;
  }


  public void setGroupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
  }


  public GatewayUpdateLdapAuthConfig json(Boolean json) {
    
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


  public GatewayUpdateLdapAuthConfig ldapCaCert(String ldapCaCert) {
    
    this.ldapCaCert = ldapCaCert;
    return this;
  }

   /**
   * LDAP CA Certificate (base64 encoded)
   * @return ldapCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP CA Certificate (base64 encoded)")

  public String getLdapCaCert() {
    return ldapCaCert;
  }


  public void setLdapCaCert(String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
  }


  public GatewayUpdateLdapAuthConfig ldapEnable(String ldapEnable) {
    
    this.ldapEnable = ldapEnable;
    return this;
  }

   /**
   * Enable Ldap [true/false]
   * @return ldapEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Ldap [true/false]")

  public String getLdapEnable() {
    return ldapEnable;
  }


  public void setLdapEnable(String ldapEnable) {
    this.ldapEnable = ldapEnable;
  }


  public GatewayUpdateLdapAuthConfig ldapUrl(String ldapUrl) {
    
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * LDAP Server URL, e.g. ldap://planetexpress.com:389
   * @return ldapUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP Server URL, e.g. ldap://planetexpress.com:389")

  public String getLdapUrl() {
    return ldapUrl;
  }


  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public GatewayUpdateLdapAuthConfig ldapAnonymousSearch(Boolean ldapAnonymousSearch) {
    
    this.ldapAnonymousSearch = ldapAnonymousSearch;
    return this;
  }

   /**
   * Ldap Anonymous Search
   * @return ldapAnonymousSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ldap Anonymous Search")

  public Boolean getLdapAnonymousSearch() {
    return ldapAnonymousSearch;
  }


  public void setLdapAnonymousSearch(Boolean ldapAnonymousSearch) {
    this.ldapAnonymousSearch = ldapAnonymousSearch;
  }


  public GatewayUpdateLdapAuthConfig signingKeyData(String signingKeyData) {
    
    this.signingKeyData = signingKeyData;
    return this;
  }

   /**
   * The private key (base64 encoded), associated with the public key defined in the Ldap auth
   * @return signingKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The private key (base64 encoded), associated with the public key defined in the Ldap auth")

  public String getSigningKeyData() {
    return signingKeyData;
  }


  public void setSigningKeyData(String signingKeyData) {
    this.signingKeyData = signingKeyData;
  }


  public GatewayUpdateLdapAuthConfig token(String token) {
    
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


  public GatewayUpdateLdapAuthConfig uidToken(String uidToken) {
    
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


  public GatewayUpdateLdapAuthConfig userAttribute(String userAttribute) {
    
    this.userAttribute = userAttribute;
    return this;
  }

   /**
   * User Attribute
   * @return userAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Attribute")

  public String getUserAttribute() {
    return userAttribute;
  }


  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }


  public GatewayUpdateLdapAuthConfig userDn(String userDn) {
    
    this.userDn = userDn;
    return this;
  }

   /**
   * User DN
   * @return userDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User DN")

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
    GatewayUpdateLdapAuthConfig gatewayUpdateLdapAuthConfig = (GatewayUpdateLdapAuthConfig) o;
    return Objects.equals(this.accessId, gatewayUpdateLdapAuthConfig.accessId) &&
        Objects.equals(this.bindDn, gatewayUpdateLdapAuthConfig.bindDn) &&
        Objects.equals(this.bindDnPassword, gatewayUpdateLdapAuthConfig.bindDnPassword) &&
        Objects.equals(this.groupAttr, gatewayUpdateLdapAuthConfig.groupAttr) &&
        Objects.equals(this.groupDn, gatewayUpdateLdapAuthConfig.groupDn) &&
        Objects.equals(this.groupFilter, gatewayUpdateLdapAuthConfig.groupFilter) &&
        Objects.equals(this.json, gatewayUpdateLdapAuthConfig.json) &&
        Objects.equals(this.ldapCaCert, gatewayUpdateLdapAuthConfig.ldapCaCert) &&
        Objects.equals(this.ldapEnable, gatewayUpdateLdapAuthConfig.ldapEnable) &&
        Objects.equals(this.ldapUrl, gatewayUpdateLdapAuthConfig.ldapUrl) &&
        Objects.equals(this.ldapAnonymousSearch, gatewayUpdateLdapAuthConfig.ldapAnonymousSearch) &&
        Objects.equals(this.signingKeyData, gatewayUpdateLdapAuthConfig.signingKeyData) &&
        Objects.equals(this.token, gatewayUpdateLdapAuthConfig.token) &&
        Objects.equals(this.uidToken, gatewayUpdateLdapAuthConfig.uidToken) &&
        Objects.equals(this.userAttribute, gatewayUpdateLdapAuthConfig.userAttribute) &&
        Objects.equals(this.userDn, gatewayUpdateLdapAuthConfig.userDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, bindDn, bindDnPassword, groupAttr, groupDn, groupFilter, json, ldapCaCert, ldapEnable, ldapUrl, ldapAnonymousSearch, signingKeyData, token, uidToken, userAttribute, userDn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateLdapAuthConfig {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindDnPassword: ").append(toIndentedString(bindDnPassword)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
    sb.append("    groupDn: ").append(toIndentedString(groupDn)).append("\n");
    sb.append("    groupFilter: ").append(toIndentedString(groupFilter)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    ldapCaCert: ").append(toIndentedString(ldapCaCert)).append("\n");
    sb.append("    ldapEnable: ").append(toIndentedString(ldapEnable)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    ldapAnonymousSearch: ").append(toIndentedString(ldapAnonymousSearch)).append("\n");
    sb.append("    signingKeyData: ").append(toIndentedString(signingKeyData)).append("\n");
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

