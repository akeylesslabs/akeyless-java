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
 * createAuthMethodSAML is a command that creates a new auth method that will be available to authenticate using SAML. [Deprecated: Use auth-method-create-saml command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateAuthMethodSAML {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  @javax.annotation.Nullable
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_ALLOWED_REDIRECT_URI = "allowed-redirect-uri";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REDIRECT_URI)
  @javax.annotation.Nullable
  private List<String> allowedRedirectUri = new ArrayList<>();

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

  public static final String SERIALIZED_NAME_IDP_METADATA_URL = "idp-metadata-url";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_URL)
  @javax.annotation.Nullable
  private String idpMetadataUrl;

  public static final String SERIALIZED_NAME_IDP_METADATA_XML_DATA = "idp-metadata-xml-data";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_XML_DATA)
  @javax.annotation.Nullable
  private String idpMetadataXmlData;

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

  public static final String SERIALIZED_NAME_SUBCLAIMS_DELIMITERS = "subclaims-delimiters";
  @SerializedName(SERIALIZED_NAME_SUBCLAIMS_DELIMITERS)
  @javax.annotation.Nullable
  private List<String> subclaimsDelimiters = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  @javax.annotation.Nonnull
  private String uniqueIdentifier;

  public CreateAuthMethodSAML() {
  }

  public CreateAuthMethodSAML accessExpires(@javax.annotation.Nullable Long accessExpires) {
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


  public CreateAuthMethodSAML allowedRedirectUri(@javax.annotation.Nullable List<String> allowedRedirectUri) {
    this.allowedRedirectUri = allowedRedirectUri;
    return this;
  }

  public CreateAuthMethodSAML addAllowedRedirectUriItem(String allowedRedirectUriItem) {
    if (this.allowedRedirectUri == null) {
      this.allowedRedirectUri = new ArrayList<>();
    }
    this.allowedRedirectUri.add(allowedRedirectUriItem);
    return this;
  }

  /**
   * Allowed redirect URIs after the authentication
   * @return allowedRedirectUri
   */
  @javax.annotation.Nullable
  public List<String> getAllowedRedirectUri() {
    return allowedRedirectUri;
  }

  public void setAllowedRedirectUri(@javax.annotation.Nullable List<String> allowedRedirectUri) {
    this.allowedRedirectUri = allowedRedirectUri;
  }


  public CreateAuthMethodSAML auditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public CreateAuthMethodSAML addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public CreateAuthMethodSAML boundIps(@javax.annotation.Nullable List<String> boundIps) {
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodSAML addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodSAML deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public CreateAuthMethodSAML description(@javax.annotation.Nullable String description) {
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


  public CreateAuthMethodSAML expirationEventIn(@javax.annotation.Nullable List<String> expirationEventIn) {
    this.expirationEventIn = expirationEventIn;
    return this;
  }

  public CreateAuthMethodSAML addExpirationEventInItem(String expirationEventInItem) {
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


  public CreateAuthMethodSAML forceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
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


  public CreateAuthMethodSAML gwBoundIps(@javax.annotation.Nullable List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodSAML addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public CreateAuthMethodSAML idpMetadataUrl(@javax.annotation.Nullable String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
    return this;
  }

  /**
   * IDP metadata url
   * @return idpMetadataUrl
   */
  @javax.annotation.Nullable
  public String getIdpMetadataUrl() {
    return idpMetadataUrl;
  }

  public void setIdpMetadataUrl(@javax.annotation.Nullable String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
  }


  public CreateAuthMethodSAML idpMetadataXmlData(@javax.annotation.Nullable String idpMetadataXmlData) {
    this.idpMetadataXmlData = idpMetadataXmlData;
    return this;
  }

  /**
   * IDP metadata xml data
   * @return idpMetadataXmlData
   */
  @javax.annotation.Nullable
  public String getIdpMetadataXmlData() {
    return idpMetadataXmlData;
  }

  public void setIdpMetadataXmlData(@javax.annotation.Nullable String idpMetadataXmlData) {
    this.idpMetadataXmlData = idpMetadataXmlData;
  }


  public CreateAuthMethodSAML json(@javax.annotation.Nullable Boolean json) {
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


  public CreateAuthMethodSAML jwtTtl(@javax.annotation.Nullable Long jwtTtl) {
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


  public CreateAuthMethodSAML name(@javax.annotation.Nonnull String name) {
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


  public CreateAuthMethodSAML productType(@javax.annotation.Nullable List<String> productType) {
    this.productType = productType;
    return this;
  }

  public CreateAuthMethodSAML addProductTypeItem(String productTypeItem) {
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


  public CreateAuthMethodSAML subclaimsDelimiters(@javax.annotation.Nullable List<String> subclaimsDelimiters) {
    this.subclaimsDelimiters = subclaimsDelimiters;
    return this;
  }

  public CreateAuthMethodSAML addSubclaimsDelimitersItem(String subclaimsDelimitersItem) {
    if (this.subclaimsDelimiters == null) {
      this.subclaimsDelimiters = new ArrayList<>();
    }
    this.subclaimsDelimiters.add(subclaimsDelimitersItem);
    return this;
  }

  /**
   * A list of additional sub claims delimiters (relevant only for SAML, OIDC, OAuth2/JWT)
   * @return subclaimsDelimiters
   */
  @javax.annotation.Nullable
  public List<String> getSubclaimsDelimiters() {
    return subclaimsDelimiters;
  }

  public void setSubclaimsDelimiters(@javax.annotation.Nullable List<String> subclaimsDelimiters) {
    this.subclaimsDelimiters = subclaimsDelimiters;
  }


  public CreateAuthMethodSAML token(@javax.annotation.Nullable String token) {
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


  public CreateAuthMethodSAML uidToken(@javax.annotation.Nullable String uidToken) {
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


  public CreateAuthMethodSAML uniqueIdentifier(@javax.annotation.Nonnull String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
   */
  @javax.annotation.Nonnull
  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(@javax.annotation.Nonnull String uniqueIdentifier) {
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
    CreateAuthMethodSAML createAuthMethodSAML = (CreateAuthMethodSAML) o;
    return Objects.equals(this.accessExpires, createAuthMethodSAML.accessExpires) &&
        Objects.equals(this.allowedRedirectUri, createAuthMethodSAML.allowedRedirectUri) &&
        Objects.equals(this.auditLogsClaims, createAuthMethodSAML.auditLogsClaims) &&
        Objects.equals(this.boundIps, createAuthMethodSAML.boundIps) &&
        Objects.equals(this.deleteProtection, createAuthMethodSAML.deleteProtection) &&
        Objects.equals(this.description, createAuthMethodSAML.description) &&
        Objects.equals(this.expirationEventIn, createAuthMethodSAML.expirationEventIn) &&
        Objects.equals(this.forceSubClaims, createAuthMethodSAML.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, createAuthMethodSAML.gwBoundIps) &&
        Objects.equals(this.idpMetadataUrl, createAuthMethodSAML.idpMetadataUrl) &&
        Objects.equals(this.idpMetadataXmlData, createAuthMethodSAML.idpMetadataXmlData) &&
        Objects.equals(this.json, createAuthMethodSAML.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodSAML.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodSAML.name) &&
        Objects.equals(this.productType, createAuthMethodSAML.productType) &&
        Objects.equals(this.subclaimsDelimiters, createAuthMethodSAML.subclaimsDelimiters) &&
        Objects.equals(this.token, createAuthMethodSAML.token) &&
        Objects.equals(this.uidToken, createAuthMethodSAML.uidToken) &&
        Objects.equals(this.uniqueIdentifier, createAuthMethodSAML.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, allowedRedirectUri, auditLogsClaims, boundIps, deleteProtection, description, expirationEventIn, forceSubClaims, gwBoundIps, idpMetadataUrl, idpMetadataXmlData, json, jwtTtl, name, productType, subclaimsDelimiters, token, uidToken, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodSAML {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    allowedRedirectUri: ").append(toIndentedString(allowedRedirectUri)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationEventIn: ").append(toIndentedString(expirationEventIn)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    idpMetadataUrl: ").append(toIndentedString(idpMetadataUrl)).append("\n");
    sb.append("    idpMetadataXmlData: ").append(toIndentedString(idpMetadataXmlData)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    subclaimsDelimiters: ").append(toIndentedString(subclaimsDelimiters)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access-expires");
    openapiFields.add("allowed-redirect-uri");
    openapiFields.add("audit-logs-claims");
    openapiFields.add("bound-ips");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("expiration-event-in");
    openapiFields.add("force-sub-claims");
    openapiFields.add("gw-bound-ips");
    openapiFields.add("idp-metadata-url");
    openapiFields.add("idp-metadata-xml-data");
    openapiFields.add("json");
    openapiFields.add("jwt-ttl");
    openapiFields.add("name");
    openapiFields.add("product-type");
    openapiFields.add("subclaims-delimiters");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("unique-identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("unique-identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAuthMethodSAML
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAuthMethodSAML.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAuthMethodSAML is not found in the empty JSON string", CreateAuthMethodSAML.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAuthMethodSAML.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAuthMethodSAML` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAuthMethodSAML.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed-redirect-uri") != null && !jsonObj.get("allowed-redirect-uri").isJsonNull() && !jsonObj.get("allowed-redirect-uri").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed-redirect-uri` to be an array in the JSON string but got `%s`", jsonObj.get("allowed-redirect-uri").toString()));
      }
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
      if ((jsonObj.get("idp-metadata-url") != null && !jsonObj.get("idp-metadata-url").isJsonNull()) && !jsonObj.get("idp-metadata-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idp-metadata-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idp-metadata-url").toString()));
      }
      if ((jsonObj.get("idp-metadata-xml-data") != null && !jsonObj.get("idp-metadata-xml-data").isJsonNull()) && !jsonObj.get("idp-metadata-xml-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idp-metadata-xml-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idp-metadata-xml-data").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("product-type") != null && !jsonObj.get("product-type").isJsonNull() && !jsonObj.get("product-type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `product-type` to be an array in the JSON string but got `%s`", jsonObj.get("product-type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subclaims-delimiters") != null && !jsonObj.get("subclaims-delimiters").isJsonNull() && !jsonObj.get("subclaims-delimiters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subclaims-delimiters` to be an array in the JSON string but got `%s`", jsonObj.get("subclaims-delimiters").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if (!jsonObj.get("unique-identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique-identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique-identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAuthMethodSAML.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAuthMethodSAML' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAuthMethodSAML> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAuthMethodSAML.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAuthMethodSAML>() {
           @Override
           public void write(JsonWriter out, CreateAuthMethodSAML value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAuthMethodSAML read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAuthMethodSAML given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAuthMethodSAML
   * @throws IOException if the JSON string is invalid with respect to CreateAuthMethodSAML
   */
  public static CreateAuthMethodSAML fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAuthMethodSAML.class);
  }

  /**
   * Convert an instance of CreateAuthMethodSAML to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

