/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * KerberosConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KerberosConfigPart {
  public static final String SERIALIZED_NAME_KERBEROS_ACCESS_ID = "kerberos_access_id";
  @SerializedName(SERIALIZED_NAME_KERBEROS_ACCESS_ID)
  @javax.annotation.Nullable
  private String kerberosAccessId;

  public static final String SERIALIZED_NAME_KERBEROS_KEYTAB = "kerberos_keytab";
  @SerializedName(SERIALIZED_NAME_KERBEROS_KEYTAB)
  @javax.annotation.Nullable
  private String kerberosKeytab;

  public static final String SERIALIZED_NAME_KERBEROS_KRB5_CONF = "kerberos_krb_5_conf";
  @SerializedName(SERIALIZED_NAME_KERBEROS_KRB5_CONF)
  @javax.annotation.Nullable
  private String kerberosKrb5Conf;

  public static final String SERIALIZED_NAME_KERBEROS_PRIVATE_KEY = "kerberos_private_key";
  @SerializedName(SERIALIZED_NAME_KERBEROS_PRIVATE_KEY)
  @javax.annotation.Nullable
  private String kerberosPrivateKey;

  public static final String SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH = "ldap_anonymous_search";
  @SerializedName(SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH)
  @javax.annotation.Nullable
  private Boolean ldapAnonymousSearch;

  public static final String SERIALIZED_NAME_LDAP_BIND_DN = "ldap_bind_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_DN)
  @javax.annotation.Nullable
  private String ldapBindDn;

  public static final String SERIALIZED_NAME_LDAP_BIND_PASSWORD = "ldap_bind_password";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_PASSWORD)
  @javax.annotation.Nullable
  private String ldapBindPassword;

  public static final String SERIALIZED_NAME_LDAP_CERT = "ldap_cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CERT)
  @javax.annotation.Nullable
  private String ldapCert;

  public static final String SERIALIZED_NAME_LDAP_GROUP_ATTR = "ldap_group_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_ATTR)
  @javax.annotation.Nullable
  private String ldapGroupAttr;

  public static final String SERIALIZED_NAME_LDAP_GROUP_DN = "ldap_group_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_DN)
  @javax.annotation.Nullable
  private String ldapGroupDn;

  public static final String SERIALIZED_NAME_LDAP_GROUP_FILTER = "ldap_group_filter";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_FILTER)
  @javax.annotation.Nullable
  private String ldapGroupFilter;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap_url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  @javax.annotation.Nullable
  private String ldapUrl;

  public static final String SERIALIZED_NAME_LDAP_USER_ATTR = "ldap_user_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_ATTR)
  @javax.annotation.Nullable
  private String ldapUserAttr;

  public static final String SERIALIZED_NAME_LDAP_USER_DN = "ldap_user_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_DN)
  @javax.annotation.Nullable
  private String ldapUserDn;

  public KerberosConfigPart() {
  }

  public KerberosConfigPart kerberosAccessId(@javax.annotation.Nullable String kerberosAccessId) {
    this.kerberosAccessId = kerberosAccessId;
    return this;
  }

  /**
   * Get kerberosAccessId
   * @return kerberosAccessId
   */
  @javax.annotation.Nullable
  public String getKerberosAccessId() {
    return kerberosAccessId;
  }

  public void setKerberosAccessId(@javax.annotation.Nullable String kerberosAccessId) {
    this.kerberosAccessId = kerberosAccessId;
  }


  public KerberosConfigPart kerberosKeytab(@javax.annotation.Nullable String kerberosKeytab) {
    this.kerberosKeytab = kerberosKeytab;
    return this;
  }

  /**
   * Get kerberosKeytab
   * @return kerberosKeytab
   */
  @javax.annotation.Nullable
  public String getKerberosKeytab() {
    return kerberosKeytab;
  }

  public void setKerberosKeytab(@javax.annotation.Nullable String kerberosKeytab) {
    this.kerberosKeytab = kerberosKeytab;
  }


  public KerberosConfigPart kerberosKrb5Conf(@javax.annotation.Nullable String kerberosKrb5Conf) {
    this.kerberosKrb5Conf = kerberosKrb5Conf;
    return this;
  }

  /**
   * Get kerberosKrb5Conf
   * @return kerberosKrb5Conf
   */
  @javax.annotation.Nullable
  public String getKerberosKrb5Conf() {
    return kerberosKrb5Conf;
  }

  public void setKerberosKrb5Conf(@javax.annotation.Nullable String kerberosKrb5Conf) {
    this.kerberosKrb5Conf = kerberosKrb5Conf;
  }


  public KerberosConfigPart kerberosPrivateKey(@javax.annotation.Nullable String kerberosPrivateKey) {
    this.kerberosPrivateKey = kerberosPrivateKey;
    return this;
  }

  /**
   * Get kerberosPrivateKey
   * @return kerberosPrivateKey
   */
  @javax.annotation.Nullable
  public String getKerberosPrivateKey() {
    return kerberosPrivateKey;
  }

  public void setKerberosPrivateKey(@javax.annotation.Nullable String kerberosPrivateKey) {
    this.kerberosPrivateKey = kerberosPrivateKey;
  }


  public KerberosConfigPart ldapAnonymousSearch(@javax.annotation.Nullable Boolean ldapAnonymousSearch) {
    this.ldapAnonymousSearch = ldapAnonymousSearch;
    return this;
  }

  /**
   * Get ldapAnonymousSearch
   * @return ldapAnonymousSearch
   */
  @javax.annotation.Nullable
  public Boolean getLdapAnonymousSearch() {
    return ldapAnonymousSearch;
  }

  public void setLdapAnonymousSearch(@javax.annotation.Nullable Boolean ldapAnonymousSearch) {
    this.ldapAnonymousSearch = ldapAnonymousSearch;
  }


  public KerberosConfigPart ldapBindDn(@javax.annotation.Nullable String ldapBindDn) {
    this.ldapBindDn = ldapBindDn;
    return this;
  }

  /**
   * Get ldapBindDn
   * @return ldapBindDn
   */
  @javax.annotation.Nullable
  public String getLdapBindDn() {
    return ldapBindDn;
  }

  public void setLdapBindDn(@javax.annotation.Nullable String ldapBindDn) {
    this.ldapBindDn = ldapBindDn;
  }


  public KerberosConfigPart ldapBindPassword(@javax.annotation.Nullable String ldapBindPassword) {
    this.ldapBindPassword = ldapBindPassword;
    return this;
  }

  /**
   * Get ldapBindPassword
   * @return ldapBindPassword
   */
  @javax.annotation.Nullable
  public String getLdapBindPassword() {
    return ldapBindPassword;
  }

  public void setLdapBindPassword(@javax.annotation.Nullable String ldapBindPassword) {
    this.ldapBindPassword = ldapBindPassword;
  }


  public KerberosConfigPart ldapCert(@javax.annotation.Nullable String ldapCert) {
    this.ldapCert = ldapCert;
    return this;
  }

  /**
   * Get ldapCert
   * @return ldapCert
   */
  @javax.annotation.Nullable
  public String getLdapCert() {
    return ldapCert;
  }

  public void setLdapCert(@javax.annotation.Nullable String ldapCert) {
    this.ldapCert = ldapCert;
  }


  public KerberosConfigPart ldapGroupAttr(@javax.annotation.Nullable String ldapGroupAttr) {
    this.ldapGroupAttr = ldapGroupAttr;
    return this;
  }

  /**
   * Get ldapGroupAttr
   * @return ldapGroupAttr
   */
  @javax.annotation.Nullable
  public String getLdapGroupAttr() {
    return ldapGroupAttr;
  }

  public void setLdapGroupAttr(@javax.annotation.Nullable String ldapGroupAttr) {
    this.ldapGroupAttr = ldapGroupAttr;
  }


  public KerberosConfigPart ldapGroupDn(@javax.annotation.Nullable String ldapGroupDn) {
    this.ldapGroupDn = ldapGroupDn;
    return this;
  }

  /**
   * Get ldapGroupDn
   * @return ldapGroupDn
   */
  @javax.annotation.Nullable
  public String getLdapGroupDn() {
    return ldapGroupDn;
  }

  public void setLdapGroupDn(@javax.annotation.Nullable String ldapGroupDn) {
    this.ldapGroupDn = ldapGroupDn;
  }


  public KerberosConfigPart ldapGroupFilter(@javax.annotation.Nullable String ldapGroupFilter) {
    this.ldapGroupFilter = ldapGroupFilter;
    return this;
  }

  /**
   * Get ldapGroupFilter
   * @return ldapGroupFilter
   */
  @javax.annotation.Nullable
  public String getLdapGroupFilter() {
    return ldapGroupFilter;
  }

  public void setLdapGroupFilter(@javax.annotation.Nullable String ldapGroupFilter) {
    this.ldapGroupFilter = ldapGroupFilter;
  }


  public KerberosConfigPart ldapUrl(@javax.annotation.Nullable String ldapUrl) {
    this.ldapUrl = ldapUrl;
    return this;
  }

  /**
   * Get ldapUrl
   * @return ldapUrl
   */
  @javax.annotation.Nullable
  public String getLdapUrl() {
    return ldapUrl;
  }

  public void setLdapUrl(@javax.annotation.Nullable String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public KerberosConfigPart ldapUserAttr(@javax.annotation.Nullable String ldapUserAttr) {
    this.ldapUserAttr = ldapUserAttr;
    return this;
  }

  /**
   * Get ldapUserAttr
   * @return ldapUserAttr
   */
  @javax.annotation.Nullable
  public String getLdapUserAttr() {
    return ldapUserAttr;
  }

  public void setLdapUserAttr(@javax.annotation.Nullable String ldapUserAttr) {
    this.ldapUserAttr = ldapUserAttr;
  }


  public KerberosConfigPart ldapUserDn(@javax.annotation.Nullable String ldapUserDn) {
    this.ldapUserDn = ldapUserDn;
    return this;
  }

  /**
   * Get ldapUserDn
   * @return ldapUserDn
   */
  @javax.annotation.Nullable
  public String getLdapUserDn() {
    return ldapUserDn;
  }

  public void setLdapUserDn(@javax.annotation.Nullable String ldapUserDn) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("kerberos_access_id");
    openapiFields.add("kerberos_keytab");
    openapiFields.add("kerberos_krb_5_conf");
    openapiFields.add("kerberos_private_key");
    openapiFields.add("ldap_anonymous_search");
    openapiFields.add("ldap_bind_dn");
    openapiFields.add("ldap_bind_password");
    openapiFields.add("ldap_cert");
    openapiFields.add("ldap_group_attr");
    openapiFields.add("ldap_group_dn");
    openapiFields.add("ldap_group_filter");
    openapiFields.add("ldap_url");
    openapiFields.add("ldap_user_attr");
    openapiFields.add("ldap_user_dn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KerberosConfigPart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KerberosConfigPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KerberosConfigPart is not found in the empty JSON string", KerberosConfigPart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KerberosConfigPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KerberosConfigPart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("kerberos_access_id") != null && !jsonObj.get("kerberos_access_id").isJsonNull()) && !jsonObj.get("kerberos_access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kerberos_access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kerberos_access_id").toString()));
      }
      if ((jsonObj.get("kerberos_keytab") != null && !jsonObj.get("kerberos_keytab").isJsonNull()) && !jsonObj.get("kerberos_keytab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kerberos_keytab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kerberos_keytab").toString()));
      }
      if ((jsonObj.get("kerberos_krb_5_conf") != null && !jsonObj.get("kerberos_krb_5_conf").isJsonNull()) && !jsonObj.get("kerberos_krb_5_conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kerberos_krb_5_conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kerberos_krb_5_conf").toString()));
      }
      if ((jsonObj.get("kerberos_private_key") != null && !jsonObj.get("kerberos_private_key").isJsonNull()) && !jsonObj.get("kerberos_private_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kerberos_private_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kerberos_private_key").toString()));
      }
      if ((jsonObj.get("ldap_bind_dn") != null && !jsonObj.get("ldap_bind_dn").isJsonNull()) && !jsonObj.get("ldap_bind_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_bind_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_bind_dn").toString()));
      }
      if ((jsonObj.get("ldap_bind_password") != null && !jsonObj.get("ldap_bind_password").isJsonNull()) && !jsonObj.get("ldap_bind_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_bind_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_bind_password").toString()));
      }
      if ((jsonObj.get("ldap_cert") != null && !jsonObj.get("ldap_cert").isJsonNull()) && !jsonObj.get("ldap_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_cert").toString()));
      }
      if ((jsonObj.get("ldap_group_attr") != null && !jsonObj.get("ldap_group_attr").isJsonNull()) && !jsonObj.get("ldap_group_attr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_group_attr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_group_attr").toString()));
      }
      if ((jsonObj.get("ldap_group_dn") != null && !jsonObj.get("ldap_group_dn").isJsonNull()) && !jsonObj.get("ldap_group_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_group_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_group_dn").toString()));
      }
      if ((jsonObj.get("ldap_group_filter") != null && !jsonObj.get("ldap_group_filter").isJsonNull()) && !jsonObj.get("ldap_group_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_group_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_group_filter").toString()));
      }
      if ((jsonObj.get("ldap_url") != null && !jsonObj.get("ldap_url").isJsonNull()) && !jsonObj.get("ldap_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_url").toString()));
      }
      if ((jsonObj.get("ldap_user_attr") != null && !jsonObj.get("ldap_user_attr").isJsonNull()) && !jsonObj.get("ldap_user_attr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_user_attr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_user_attr").toString()));
      }
      if ((jsonObj.get("ldap_user_dn") != null && !jsonObj.get("ldap_user_dn").isJsonNull()) && !jsonObj.get("ldap_user_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_user_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_user_dn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KerberosConfigPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KerberosConfigPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KerberosConfigPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KerberosConfigPart.class));

       return (TypeAdapter<T>) new TypeAdapter<KerberosConfigPart>() {
           @Override
           public void write(JsonWriter out, KerberosConfigPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KerberosConfigPart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KerberosConfigPart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KerberosConfigPart
   * @throws IOException if the JSON string is invalid with respect to KerberosConfigPart
   */
  public static KerberosConfigPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KerberosConfigPart.class);
  }

  /**
   * Convert an instance of KerberosConfigPart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

