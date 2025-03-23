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
 * LdapTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LdapTargetDetails {
  public static final String SERIALIZED_NAME_IMPLEMENTATION_TYPE = "implementation_type";
  @SerializedName(SERIALIZED_NAME_IMPLEMENTATION_TYPE)
  @javax.annotation.Nullable
  private String implementationType;

  public static final String SERIALIZED_NAME_LDAP_AUDIENCE = "ldap_audience";
  @SerializedName(SERIALIZED_NAME_LDAP_AUDIENCE)
  @javax.annotation.Nullable
  private String ldapAudience;

  public static final String SERIALIZED_NAME_LDAP_BIND_DN = "ldap_bind_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_DN)
  @javax.annotation.Nullable
  private String ldapBindDn;

  public static final String SERIALIZED_NAME_LDAP_BIND_PASSWORD = "ldap_bind_password";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_PASSWORD)
  @javax.annotation.Nullable
  private String ldapBindPassword;

  public static final String SERIALIZED_NAME_LDAP_CERTIFICATE = "ldap_certificate";
  @SerializedName(SERIALIZED_NAME_LDAP_CERTIFICATE)
  @javax.annotation.Nullable
  private String ldapCertificate;

  public static final String SERIALIZED_NAME_LDAP_TOKEN_EXPIRATION = "ldap_token_expiration";
  @SerializedName(SERIALIZED_NAME_LDAP_TOKEN_EXPIRATION)
  @javax.annotation.Nullable
  private String ldapTokenExpiration;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap_url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  @javax.annotation.Nullable
  private String ldapUrl;

  public LdapTargetDetails() {
  }

  public LdapTargetDetails implementationType(@javax.annotation.Nullable String implementationType) {
    this.implementationType = implementationType;
    return this;
  }

  /**
   * Get implementationType
   * @return implementationType
   */
  @javax.annotation.Nullable
  public String getImplementationType() {
    return implementationType;
  }

  public void setImplementationType(@javax.annotation.Nullable String implementationType) {
    this.implementationType = implementationType;
  }


  public LdapTargetDetails ldapAudience(@javax.annotation.Nullable String ldapAudience) {
    this.ldapAudience = ldapAudience;
    return this;
  }

  /**
   * Get ldapAudience
   * @return ldapAudience
   */
  @javax.annotation.Nullable
  public String getLdapAudience() {
    return ldapAudience;
  }

  public void setLdapAudience(@javax.annotation.Nullable String ldapAudience) {
    this.ldapAudience = ldapAudience;
  }


  public LdapTargetDetails ldapBindDn(@javax.annotation.Nullable String ldapBindDn) {
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


  public LdapTargetDetails ldapBindPassword(@javax.annotation.Nullable String ldapBindPassword) {
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


  public LdapTargetDetails ldapCertificate(@javax.annotation.Nullable String ldapCertificate) {
    this.ldapCertificate = ldapCertificate;
    return this;
  }

  /**
   * Get ldapCertificate
   * @return ldapCertificate
   */
  @javax.annotation.Nullable
  public String getLdapCertificate() {
    return ldapCertificate;
  }

  public void setLdapCertificate(@javax.annotation.Nullable String ldapCertificate) {
    this.ldapCertificate = ldapCertificate;
  }


  public LdapTargetDetails ldapTokenExpiration(@javax.annotation.Nullable String ldapTokenExpiration) {
    this.ldapTokenExpiration = ldapTokenExpiration;
    return this;
  }

  /**
   * Get ldapTokenExpiration
   * @return ldapTokenExpiration
   */
  @javax.annotation.Nullable
  public String getLdapTokenExpiration() {
    return ldapTokenExpiration;
  }

  public void setLdapTokenExpiration(@javax.annotation.Nullable String ldapTokenExpiration) {
    this.ldapTokenExpiration = ldapTokenExpiration;
  }


  public LdapTargetDetails ldapUrl(@javax.annotation.Nullable String ldapUrl) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapTargetDetails ldapTargetDetails = (LdapTargetDetails) o;
    return Objects.equals(this.implementationType, ldapTargetDetails.implementationType) &&
        Objects.equals(this.ldapAudience, ldapTargetDetails.ldapAudience) &&
        Objects.equals(this.ldapBindDn, ldapTargetDetails.ldapBindDn) &&
        Objects.equals(this.ldapBindPassword, ldapTargetDetails.ldapBindPassword) &&
        Objects.equals(this.ldapCertificate, ldapTargetDetails.ldapCertificate) &&
        Objects.equals(this.ldapTokenExpiration, ldapTargetDetails.ldapTokenExpiration) &&
        Objects.equals(this.ldapUrl, ldapTargetDetails.ldapUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implementationType, ldapAudience, ldapBindDn, ldapBindPassword, ldapCertificate, ldapTokenExpiration, ldapUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapTargetDetails {\n");
    sb.append("    implementationType: ").append(toIndentedString(implementationType)).append("\n");
    sb.append("    ldapAudience: ").append(toIndentedString(ldapAudience)).append("\n");
    sb.append("    ldapBindDn: ").append(toIndentedString(ldapBindDn)).append("\n");
    sb.append("    ldapBindPassword: ").append(toIndentedString(ldapBindPassword)).append("\n");
    sb.append("    ldapCertificate: ").append(toIndentedString(ldapCertificate)).append("\n");
    sb.append("    ldapTokenExpiration: ").append(toIndentedString(ldapTokenExpiration)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
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
    openapiFields.add("implementation_type");
    openapiFields.add("ldap_audience");
    openapiFields.add("ldap_bind_dn");
    openapiFields.add("ldap_bind_password");
    openapiFields.add("ldap_certificate");
    openapiFields.add("ldap_token_expiration");
    openapiFields.add("ldap_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LdapTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LdapTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LdapTargetDetails is not found in the empty JSON string", LdapTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LdapTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LdapTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("implementation_type") != null && !jsonObj.get("implementation_type").isJsonNull()) && !jsonObj.get("implementation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implementation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implementation_type").toString()));
      }
      if ((jsonObj.get("ldap_audience") != null && !jsonObj.get("ldap_audience").isJsonNull()) && !jsonObj.get("ldap_audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_audience").toString()));
      }
      if ((jsonObj.get("ldap_bind_dn") != null && !jsonObj.get("ldap_bind_dn").isJsonNull()) && !jsonObj.get("ldap_bind_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_bind_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_bind_dn").toString()));
      }
      if ((jsonObj.get("ldap_bind_password") != null && !jsonObj.get("ldap_bind_password").isJsonNull()) && !jsonObj.get("ldap_bind_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_bind_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_bind_password").toString()));
      }
      if ((jsonObj.get("ldap_certificate") != null && !jsonObj.get("ldap_certificate").isJsonNull()) && !jsonObj.get("ldap_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_certificate").toString()));
      }
      if ((jsonObj.get("ldap_token_expiration") != null && !jsonObj.get("ldap_token_expiration").isJsonNull()) && !jsonObj.get("ldap_token_expiration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_token_expiration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_token_expiration").toString()));
      }
      if ((jsonObj.get("ldap_url") != null && !jsonObj.get("ldap_url").isJsonNull()) && !jsonObj.get("ldap_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LdapTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LdapTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LdapTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LdapTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<LdapTargetDetails>() {
           @Override
           public void write(JsonWriter out, LdapTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LdapTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LdapTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LdapTargetDetails
   * @throws IOException if the JSON string is invalid with respect to LdapTargetDetails
   */
  public static LdapTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LdapTargetDetails.class);
  }

  /**
   * Convert an instance of LdapTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

