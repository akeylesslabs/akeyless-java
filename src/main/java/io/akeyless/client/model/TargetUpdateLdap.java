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
 * targetUpdateLdap is a command that updates an existing ldap target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetUpdateLdap {
  public static final String SERIALIZED_NAME_BIND_DN = "bind-dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  @javax.annotation.Nonnull
  private String bindDn;

  public static final String SERIALIZED_NAME_BIND_DN_PASSWORD = "bind-dn-password";
  @SerializedName(SERIALIZED_NAME_BIND_DN_PASSWORD)
  @javax.annotation.Nonnull
  private String bindDnPassword;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  @javax.annotation.Nullable
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_LDAP_CA_CERT = "ldap-ca-cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CA_CERT)
  @javax.annotation.Nullable
  private String ldapCaCert;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap-url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  @javax.annotation.Nonnull
  private String ldapUrl;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  @javax.annotation.Nullable
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_SERVER_TYPE = "server-type";
  @SerializedName(SERIALIZED_NAME_SERVER_TYPE)
  @javax.annotation.Nullable
  private String serverType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRATION = "token-expiration";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRATION)
  @javax.annotation.Nullable
  private String tokenExpiration;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public TargetUpdateLdap() {
  }

  public TargetUpdateLdap bindDn(@javax.annotation.Nonnull String bindDn) {
    this.bindDn = bindDn;
    return this;
  }

  /**
   * Bind DN
   * @return bindDn
   */
  @javax.annotation.Nonnull
  public String getBindDn() {
    return bindDn;
  }

  public void setBindDn(@javax.annotation.Nonnull String bindDn) {
    this.bindDn = bindDn;
  }


  public TargetUpdateLdap bindDnPassword(@javax.annotation.Nonnull String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
    return this;
  }

  /**
   * Bind DN Password
   * @return bindDnPassword
   */
  @javax.annotation.Nonnull
  public String getBindDnPassword() {
    return bindDnPassword;
  }

  public void setBindDnPassword(@javax.annotation.Nonnull String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
  }


  public TargetUpdateLdap description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public TargetUpdateLdap json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public TargetUpdateLdap keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

  /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
   */
  @javax.annotation.Nullable
  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }

  public void setKeepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public TargetUpdateLdap key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public TargetUpdateLdap ldapCaCert(@javax.annotation.Nullable String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
    return this;
  }

  /**
   * CA Certificate File Content
   * @return ldapCaCert
   */
  @javax.annotation.Nullable
  public String getLdapCaCert() {
    return ldapCaCert;
  }

  public void setLdapCaCert(@javax.annotation.Nullable String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
  }


  public TargetUpdateLdap ldapUrl(@javax.annotation.Nonnull String ldapUrl) {
    this.ldapUrl = ldapUrl;
    return this;
  }

  /**
   * LDAP Server URL
   * @return ldapUrl
   */
  @javax.annotation.Nonnull
  public String getLdapUrl() {
    return ldapUrl;
  }

  public void setLdapUrl(@javax.annotation.Nonnull String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public TargetUpdateLdap maxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
   */
  @javax.annotation.Nullable
  public String getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public TargetUpdateLdap name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Target name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public TargetUpdateLdap newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * New target name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public TargetUpdateLdap serverType(@javax.annotation.Nullable String serverType) {
    this.serverType = serverType;
    return this;
  }

  /**
   * Set Ldap server type, Options:[OpenLDAP, ActiveDirectory]
   * @return serverType
   */
  @javax.annotation.Nullable
  public String getServerType() {
    return serverType;
  }

  public void setServerType(@javax.annotation.Nullable String serverType) {
    this.serverType = serverType;
  }


  public TargetUpdateLdap token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public TargetUpdateLdap tokenExpiration(@javax.annotation.Nullable String tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
    return this;
  }

  /**
   * Token expiration
   * @return tokenExpiration
   */
  @javax.annotation.Nullable
  public String getTokenExpiration() {
    return tokenExpiration;
  }

  public void setTokenExpiration(@javax.annotation.Nullable String tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }


  public TargetUpdateLdap uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
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
    TargetUpdateLdap targetUpdateLdap = (TargetUpdateLdap) o;
    return Objects.equals(this.bindDn, targetUpdateLdap.bindDn) &&
        Objects.equals(this.bindDnPassword, targetUpdateLdap.bindDnPassword) &&
        Objects.equals(this.description, targetUpdateLdap.description) &&
        Objects.equals(this.json, targetUpdateLdap.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateLdap.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateLdap.key) &&
        Objects.equals(this.ldapCaCert, targetUpdateLdap.ldapCaCert) &&
        Objects.equals(this.ldapUrl, targetUpdateLdap.ldapUrl) &&
        Objects.equals(this.maxVersions, targetUpdateLdap.maxVersions) &&
        Objects.equals(this.name, targetUpdateLdap.name) &&
        Objects.equals(this.newName, targetUpdateLdap.newName) &&
        Objects.equals(this.serverType, targetUpdateLdap.serverType) &&
        Objects.equals(this.token, targetUpdateLdap.token) &&
        Objects.equals(this.tokenExpiration, targetUpdateLdap.tokenExpiration) &&
        Objects.equals(this.uidToken, targetUpdateLdap.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindDn, bindDnPassword, description, json, keepPrevVersion, key, ldapCaCert, ldapUrl, maxVersions, name, newName, serverType, token, tokenExpiration, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateLdap {\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindDnPassword: ").append(toIndentedString(bindDnPassword)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    ldapCaCert: ").append(toIndentedString(ldapCaCert)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bind-dn");
    openapiFields.add("bind-dn-password");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("ldap-ca-cert");
    openapiFields.add("ldap-url");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("server-type");
    openapiFields.add("token");
    openapiFields.add("token-expiration");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bind-dn");
    openapiRequiredFields.add("bind-dn-password");
    openapiRequiredFields.add("ldap-url");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetUpdateLdap
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetUpdateLdap.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetUpdateLdap is not found in the empty JSON string", TargetUpdateLdap.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetUpdateLdap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetUpdateLdap` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetUpdateLdap.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("bind-dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind-dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind-dn").toString()));
      }
      if (!jsonObj.get("bind-dn-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind-dn-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind-dn-password").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("ldap-ca-cert") != null && !jsonObj.get("ldap-ca-cert").isJsonNull()) && !jsonObj.get("ldap-ca-cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap-ca-cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap-ca-cert").toString()));
      }
      if (!jsonObj.get("ldap-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap-url").toString()));
      }
      if ((jsonObj.get("max-versions") != null && !jsonObj.get("max-versions").isJsonNull()) && !jsonObj.get("max-versions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max-versions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max-versions").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("server-type") != null && !jsonObj.get("server-type").isJsonNull()) && !jsonObj.get("server-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server-type").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("token-expiration") != null && !jsonObj.get("token-expiration").isJsonNull()) && !jsonObj.get("token-expiration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token-expiration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token-expiration").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetUpdateLdap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetUpdateLdap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetUpdateLdap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetUpdateLdap.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetUpdateLdap>() {
           @Override
           public void write(JsonWriter out, TargetUpdateLdap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetUpdateLdap read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetUpdateLdap given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetUpdateLdap
   * @throws IOException if the JSON string is invalid with respect to TargetUpdateLdap
   */
  public static TargetUpdateLdap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetUpdateLdap.class);
  }

  /**
   * Convert an instance of TargetUpdateLdap to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

