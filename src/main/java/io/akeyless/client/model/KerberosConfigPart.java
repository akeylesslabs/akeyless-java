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
 * KerberosConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KerberosConfigPart {
  public static final String SERIALIZED_NAME_KERBEROS_ACCESS_ID = "kerberos_access_id";
  @SerializedName(SERIALIZED_NAME_KERBEROS_ACCESS_ID)
  private String kerberosAccessId;

  public static final String SERIALIZED_NAME_KERBEROS_KEYTAB = "kerberos_keytab";
  @SerializedName(SERIALIZED_NAME_KERBEROS_KEYTAB)
  private String kerberosKeytab;

  public static final String SERIALIZED_NAME_KERBEROS_KRB5_CONF = "kerberos_krb_5_conf";
  @SerializedName(SERIALIZED_NAME_KERBEROS_KRB5_CONF)
  private String kerberosKrb5Conf;

  public static final String SERIALIZED_NAME_KERBEROS_PRIVATE_KEY = "kerberos_private_key";
  @SerializedName(SERIALIZED_NAME_KERBEROS_PRIVATE_KEY)
  private String kerberosPrivateKey;

  public static final String SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH = "ldap_anonymous_search";
  @SerializedName(SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH)
  private Boolean ldapAnonymousSearch;

  public static final String SERIALIZED_NAME_LDAP_BIND_DN = "ldap_bind_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_DN)
  private String ldapBindDn;

  public static final String SERIALIZED_NAME_LDAP_BIND_PASSWORD = "ldap_bind_password";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_PASSWORD)
  private String ldapBindPassword;

  public static final String SERIALIZED_NAME_LDAP_CERT = "ldap_cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CERT)
  private String ldapCert;

  public static final String SERIALIZED_NAME_LDAP_GROUP_ATTR = "ldap_group_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_ATTR)
  private String ldapGroupAttr;

  public static final String SERIALIZED_NAME_LDAP_GROUP_DN = "ldap_group_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_DN)
  private String ldapGroupDn;

  public static final String SERIALIZED_NAME_LDAP_GROUP_FILTER = "ldap_group_filter";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_FILTER)
  private String ldapGroupFilter;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap_url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_LDAP_USER_ATTR = "ldap_user_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_ATTR)
  private String ldapUserAttr;

  public static final String SERIALIZED_NAME_LDAP_USER_DN = "ldap_user_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_DN)
  private String ldapUserDn;

  public KerberosConfigPart() { 
  }

  public KerberosConfigPart kerberosAccessId(String kerberosAccessId) {
    
    this.kerberosAccessId = kerberosAccessId;
    return this;
  }

   /**
   * Get kerberosAccessId
   * @return kerberosAccessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKerberosAccessId() {
    return kerberosAccessId;
  }


  public void setKerberosAccessId(String kerberosAccessId) {
    this.kerberosAccessId = kerberosAccessId;
  }


  public KerberosConfigPart kerberosKeytab(String kerberosKeytab) {
    
    this.kerberosKeytab = kerberosKeytab;
    return this;
  }

   /**
   * Get kerberosKeytab
   * @return kerberosKeytab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKerberosKeytab() {
    return kerberosKeytab;
  }


  public void setKerberosKeytab(String kerberosKeytab) {
    this.kerberosKeytab = kerberosKeytab;
  }


  public KerberosConfigPart kerberosKrb5Conf(String kerberosKrb5Conf) {
    
    this.kerberosKrb5Conf = kerberosKrb5Conf;
    return this;
  }

   /**
   * Get kerberosKrb5Conf
   * @return kerberosKrb5Conf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKerberosKrb5Conf() {
    return kerberosKrb5Conf;
  }


  public void setKerberosKrb5Conf(String kerberosKrb5Conf) {
    this.kerberosKrb5Conf = kerberosKrb5Conf;
  }


  public KerberosConfigPart kerberosPrivateKey(String kerberosPrivateKey) {
    
    this.kerberosPrivateKey = kerberosPrivateKey;
    return this;
  }

   /**
   * Get kerberosPrivateKey
   * @return kerberosPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKerberosPrivateKey() {
    return kerberosPrivateKey;
  }


  public void setKerberosPrivateKey(String kerberosPrivateKey) {
    this.kerberosPrivateKey = kerberosPrivateKey;
  }


  public KerberosConfigPart ldapAnonymousSearch(Boolean ldapAnonymousSearch) {
    
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


  public KerberosConfigPart ldapBindDn(String ldapBindDn) {
    
    this.ldapBindDn = ldapBindDn;
    return this;
  }

   /**
   * Get ldapBindDn
   * @return ldapBindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapBindDn() {
    return ldapBindDn;
  }


  public void setLdapBindDn(String ldapBindDn) {
    this.ldapBindDn = ldapBindDn;
  }


  public KerberosConfigPart ldapBindPassword(String ldapBindPassword) {
    
    this.ldapBindPassword = ldapBindPassword;
    return this;
  }

   /**
   * Get ldapBindPassword
   * @return ldapBindPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapBindPassword() {
    return ldapBindPassword;
  }


  public void setLdapBindPassword(String ldapBindPassword) {
    this.ldapBindPassword = ldapBindPassword;
  }


  public KerberosConfigPart ldapCert(String ldapCert) {
    
    this.ldapCert = ldapCert;
    return this;
  }

   /**
   * Get ldapCert
   * @return ldapCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapCert() {
    return ldapCert;
  }


  public void setLdapCert(String ldapCert) {
    this.ldapCert = ldapCert;
  }


  public KerberosConfigPart ldapGroupAttr(String ldapGroupAttr) {
    
    this.ldapGroupAttr = ldapGroupAttr;
    return this;
  }

   /**
   * Get ldapGroupAttr
   * @return ldapGroupAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupAttr() {
    return ldapGroupAttr;
  }


  public void setLdapGroupAttr(String ldapGroupAttr) {
    this.ldapGroupAttr = ldapGroupAttr;
  }


  public KerberosConfigPart ldapGroupDn(String ldapGroupDn) {
    
    this.ldapGroupDn = ldapGroupDn;
    return this;
  }

   /**
   * Get ldapGroupDn
   * @return ldapGroupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupDn() {
    return ldapGroupDn;
  }


  public void setLdapGroupDn(String ldapGroupDn) {
    this.ldapGroupDn = ldapGroupDn;
  }


  public KerberosConfigPart ldapGroupFilter(String ldapGroupFilter) {
    
    this.ldapGroupFilter = ldapGroupFilter;
    return this;
  }

   /**
   * Get ldapGroupFilter
   * @return ldapGroupFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupFilter() {
    return ldapGroupFilter;
  }


  public void setLdapGroupFilter(String ldapGroupFilter) {
    this.ldapGroupFilter = ldapGroupFilter;
  }


  public KerberosConfigPart ldapUrl(String ldapUrl) {
    
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


  public KerberosConfigPart ldapUserAttr(String ldapUserAttr) {
    
    this.ldapUserAttr = ldapUserAttr;
    return this;
  }

   /**
   * Get ldapUserAttr
   * @return ldapUserAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUserAttr() {
    return ldapUserAttr;
  }


  public void setLdapUserAttr(String ldapUserAttr) {
    this.ldapUserAttr = ldapUserAttr;
  }


  public KerberosConfigPart ldapUserDn(String ldapUserDn) {
    
    this.ldapUserDn = ldapUserDn;
    return this;
  }

   /**
   * Get ldapUserDn
   * @return ldapUserDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUserDn() {
    return ldapUserDn;
  }


  public void setLdapUserDn(String ldapUserDn) {
    this.ldapUserDn = ldapUserDn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosConfigPart kerberosConfigPart = (KerberosConfigPart) o;
    return Objects.equals(this.kerberosAccessId, kerberosConfigPart.kerberosAccessId) &&
        Objects.equals(this.kerberosKeytab, kerberosConfigPart.kerberosKeytab) &&
        Objects.equals(this.kerberosKrb5Conf, kerberosConfigPart.kerberosKrb5Conf) &&
        Objects.equals(this.kerberosPrivateKey, kerberosConfigPart.kerberosPrivateKey) &&
        Objects.equals(this.ldapAnonymousSearch, kerberosConfigPart.ldapAnonymousSearch) &&
        Objects.equals(this.ldapBindDn, kerberosConfigPart.ldapBindDn) &&
        Objects.equals(this.ldapBindPassword, kerberosConfigPart.ldapBindPassword) &&
        Objects.equals(this.ldapCert, kerberosConfigPart.ldapCert) &&
        Objects.equals(this.ldapGroupAttr, kerberosConfigPart.ldapGroupAttr) &&
        Objects.equals(this.ldapGroupDn, kerberosConfigPart.ldapGroupDn) &&
        Objects.equals(this.ldapGroupFilter, kerberosConfigPart.ldapGroupFilter) &&
        Objects.equals(this.ldapUrl, kerberosConfigPart.ldapUrl) &&
        Objects.equals(this.ldapUserAttr, kerberosConfigPart.ldapUserAttr) &&
        Objects.equals(this.ldapUserDn, kerberosConfigPart.ldapUserDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kerberosAccessId, kerberosKeytab, kerberosKrb5Conf, kerberosPrivateKey, ldapAnonymousSearch, ldapBindDn, ldapBindPassword, ldapCert, ldapGroupAttr, ldapGroupDn, ldapGroupFilter, ldapUrl, ldapUserAttr, ldapUserDn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosConfigPart {\n");
    sb.append("    kerberosAccessId: ").append(toIndentedString(kerberosAccessId)).append("\n");
    sb.append("    kerberosKeytab: ").append(toIndentedString(kerberosKeytab)).append("\n");
    sb.append("    kerberosKrb5Conf: ").append(toIndentedString(kerberosKrb5Conf)).append("\n");
    sb.append("    kerberosPrivateKey: ").append(toIndentedString(kerberosPrivateKey)).append("\n");
    sb.append("    ldapAnonymousSearch: ").append(toIndentedString(ldapAnonymousSearch)).append("\n");
    sb.append("    ldapBindDn: ").append(toIndentedString(ldapBindDn)).append("\n");
    sb.append("    ldapBindPassword: ").append(toIndentedString(ldapBindPassword)).append("\n");
    sb.append("    ldapCert: ").append(toIndentedString(ldapCert)).append("\n");
    sb.append("    ldapGroupAttr: ").append(toIndentedString(ldapGroupAttr)).append("\n");
    sb.append("    ldapGroupDn: ").append(toIndentedString(ldapGroupDn)).append("\n");
    sb.append("    ldapGroupFilter: ").append(toIndentedString(ldapGroupFilter)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    ldapUserAttr: ").append(toIndentedString(ldapUserAttr)).append("\n");
    sb.append("    ldapUserDn: ").append(toIndentedString(ldapUserDn)).append("\n");
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
