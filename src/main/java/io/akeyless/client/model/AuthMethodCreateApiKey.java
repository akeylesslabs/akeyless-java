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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * authMethodCreateApiKey is a command that creates Api Key auth method
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethodCreateApiKey {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  @javax.annotation.Nullable
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  @javax.annotation.Nullable
  private List<String> auditLogsClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  @javax.annotation.Nullable
  private List<String> boundIps = new ArrayList<>();

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENT_IN = "expiration-event-in";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENT_IN)
  @javax.annotation.Nullable
  private List<String> expirationEventIn = new ArrayList<>();

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  @javax.annotation.Nullable
  private List<String> gwBoundIps = new ArrayList<>();

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  @javax.annotation.Nullable
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product-type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  @javax.annotation.Nullable
  private List<String> productType = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public AuthMethodCreateApiKey() {
  }

  public AuthMethodCreateApiKey accessExpires(@javax.annotation.Nullable Long accessExpires) {
    this.accessExpires = accessExpires;
    return this;
  }

  /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
   */
  @javax.annotation.Nullable
  public Long getAccessExpires() {
    return accessExpires;
  }

  public void setAccessExpires(@javax.annotation.Nullable Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public AuthMethodCreateApiKey auditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodCreateApiKey addAuditLogsClaimsItem(String auditLogsClaimsItem) {
    if (this.auditLogsClaims == null) {
      this.auditLogsClaims = new ArrayList<>();
    }
    this.auditLogsClaims.add(auditLogsClaimsItem);
    return this;
  }

  /**
   * Subclaims to include in audit logs, e.g \&quot;--audit-logs-claims email --audit-logs-claims username\&quot;
   * @return auditLogsClaims
   */
  @javax.annotation.Nullable
  public List<String> getAuditLogsClaims() {
    return auditLogsClaims;
  }

  public void setAuditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
  }


  public AuthMethodCreateApiKey boundIps(@javax.annotation.Nullable List<String> boundIps) {
    this.boundIps = boundIps;
    return this;
  }

  public AuthMethodCreateApiKey addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

  /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
   */
  @javax.annotation.Nullable
  public List<String> getBoundIps() {
    return boundIps;
  }

  public void setBoundIps(@javax.annotation.Nullable List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public AuthMethodCreateApiKey deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public AuthMethodCreateApiKey description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Auth Method description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public AuthMethodCreateApiKey expirationEventIn(@javax.annotation.Nullable List<String> expirationEventIn) {
    this.expirationEventIn = expirationEventIn;
    return this;
  }

  public AuthMethodCreateApiKey addExpirationEventInItem(String expirationEventInItem) {
    if (this.expirationEventIn == null) {
      this.expirationEventIn = new ArrayList<>();
    }
    this.expirationEventIn.add(expirationEventInItem);
    return this;
  }

  /**
   * How many days before the expiration of the auth method would you like to be notified.
   * @return expirationEventIn
   */
  @javax.annotation.Nullable
  public List<String> getExpirationEventIn() {
    return expirationEventIn;
  }

  public void setExpirationEventIn(@javax.annotation.Nullable List<String> expirationEventIn) {
    this.expirationEventIn = expirationEventIn;
  }


  public AuthMethodCreateApiKey forceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
    return this;
  }

  /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
   */
  @javax.annotation.Nullable
  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }

  public void setForceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public AuthMethodCreateApiKey gwBoundIps(@javax.annotation.Nullable List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public AuthMethodCreateApiKey addGwBoundIpsItem(String gwBoundIpsItem) {
    if (this.gwBoundIps == null) {
      this.gwBoundIps = new ArrayList<>();
    }
    this.gwBoundIps.add(gwBoundIpsItem);
    return this;
  }

  /**
   * A CIDR whitelist with the GW IPs that the access is restricted to
   * @return gwBoundIps
   */
  @javax.annotation.Nullable
  public List<String> getGwBoundIps() {
    return gwBoundIps;
  }

  public void setGwBoundIps(@javax.annotation.Nullable List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
  }


  public AuthMethodCreateApiKey json(@javax.annotation.Nullable Boolean json) {
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


  public AuthMethodCreateApiKey jwtTtl(@javax.annotation.Nullable Long jwtTtl) {
    this.jwtTtl = jwtTtl;
    return this;
  }

  /**
   * Jwt TTL
   * @return jwtTtl
   */
  @javax.annotation.Nullable
  public Long getJwtTtl() {
    return jwtTtl;
  }

  public void setJwtTtl(@javax.annotation.Nullable Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public AuthMethodCreateApiKey name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Auth Method name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public AuthMethodCreateApiKey productType(@javax.annotation.Nullable List<String> productType) {
    this.productType = productType;
    return this;
  }

  public AuthMethodCreateApiKey addProductTypeItem(String productTypeItem) {
    if (this.productType == null) {
      this.productType = new ArrayList<>();
    }
    this.productType.add(productTypeItem);
    return this;
  }

  /**
   * Choose the relevant product type for the auth method [sm, sra, pm, dp, ca]
   * @return productType
   */
  @javax.annotation.Nullable
  public List<String> getProductType() {
    return productType;
  }

  public void setProductType(@javax.annotation.Nullable List<String> productType) {
    this.productType = productType;
  }


  public AuthMethodCreateApiKey token(@javax.annotation.Nullable String token) {
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


  public AuthMethodCreateApiKey uidToken(@javax.annotation.Nullable String uidToken) {
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
    AuthMethodCreateApiKey authMethodCreateApiKey = (AuthMethodCreateApiKey) o;
    return Objects.equals(this.accessExpires, authMethodCreateApiKey.accessExpires) &&
        Objects.equals(this.auditLogsClaims, authMethodCreateApiKey.auditLogsClaims) &&
        Objects.equals(this.boundIps, authMethodCreateApiKey.boundIps) &&
        Objects.equals(this.deleteProtection, authMethodCreateApiKey.deleteProtection) &&
        Objects.equals(this.description, authMethodCreateApiKey.description) &&
        Objects.equals(this.expirationEventIn, authMethodCreateApiKey.expirationEventIn) &&
        Objects.equals(this.forceSubClaims, authMethodCreateApiKey.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, authMethodCreateApiKey.gwBoundIps) &&
        Objects.equals(this.json, authMethodCreateApiKey.json) &&
        Objects.equals(this.jwtTtl, authMethodCreateApiKey.jwtTtl) &&
        Objects.equals(this.name, authMethodCreateApiKey.name) &&
        Objects.equals(this.productType, authMethodCreateApiKey.productType) &&
        Objects.equals(this.token, authMethodCreateApiKey.token) &&
        Objects.equals(this.uidToken, authMethodCreateApiKey.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, auditLogsClaims, boundIps, deleteProtection, description, expirationEventIn, forceSubClaims, gwBoundIps, json, jwtTtl, name, productType, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodCreateApiKey {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationEventIn: ").append(toIndentedString(expirationEventIn)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access-expires");
    openapiFields.add("audit-logs-claims");
    openapiFields.add("bound-ips");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("expiration-event-in");
    openapiFields.add("force-sub-claims");
    openapiFields.add("gw-bound-ips");
    openapiFields.add("json");
    openapiFields.add("jwt-ttl");
    openapiFields.add("name");
    openapiFields.add("product-type");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthMethodCreateApiKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethodCreateApiKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethodCreateApiKey is not found in the empty JSON string", AuthMethodCreateApiKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethodCreateApiKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethodCreateApiKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthMethodCreateApiKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("audit-logs-claims") != null && !jsonObj.get("audit-logs-claims").isJsonNull() && !jsonObj.get("audit-logs-claims").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit-logs-claims` to be an array in the JSON string but got `%s`", jsonObj.get("audit-logs-claims").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bound-ips") != null && !jsonObj.get("bound-ips").isJsonNull() && !jsonObj.get("bound-ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bound-ips` to be an array in the JSON string but got `%s`", jsonObj.get("bound-ips").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("expiration-event-in") != null && !jsonObj.get("expiration-event-in").isJsonNull() && !jsonObj.get("expiration-event-in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration-event-in` to be an array in the JSON string but got `%s`", jsonObj.get("expiration-event-in").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("gw-bound-ips") != null && !jsonObj.get("gw-bound-ips").isJsonNull() && !jsonObj.get("gw-bound-ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gw-bound-ips` to be an array in the JSON string but got `%s`", jsonObj.get("gw-bound-ips").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("product-type") != null && !jsonObj.get("product-type").isJsonNull() && !jsonObj.get("product-type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `product-type` to be an array in the JSON string but got `%s`", jsonObj.get("product-type").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthMethodCreateApiKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethodCreateApiKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethodCreateApiKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethodCreateApiKey.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethodCreateApiKey>() {
           @Override
           public void write(JsonWriter out, AuthMethodCreateApiKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethodCreateApiKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethodCreateApiKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethodCreateApiKey
   * @throws IOException if the JSON string is invalid with respect to AuthMethodCreateApiKey
   */
  public static AuthMethodCreateApiKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethodCreateApiKey.class);
  }

  /**
   * Convert an instance of AuthMethodCreateApiKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

