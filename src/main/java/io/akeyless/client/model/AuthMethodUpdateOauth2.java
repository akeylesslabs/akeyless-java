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
 * authMethodUpdateOauth2 is a command that updates a new auth method that will be able to authenticate using Oauth2.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethodUpdateOauth2 {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  @javax.annotation.Nullable
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  @javax.annotation.Nullable
  private String audience;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  @javax.annotation.Nullable
  private List<String> auditLogsClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOUND_CLIENT_IDS = "bound-client-ids";
  @SerializedName(SERIALIZED_NAME_BOUND_CLIENT_IDS)
  @javax.annotation.Nullable
  private List<String> boundClientIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  @javax.annotation.Nullable
  private List<String> boundIps = new ArrayList<>();

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  @javax.annotation.Nullable
  private String cert;

  public static final String SERIALIZED_NAME_CERT_FILE_DATA = "cert-file-data";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_DATA)
  @javax.annotation.Nullable
  private String certFileData;

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

  public static final String SERIALIZED_NAME_GATEWAY_URL = "gateway-url";
  @SerializedName(SERIALIZED_NAME_GATEWAY_URL)
  @javax.annotation.Nullable
  private String gatewayUrl;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  @javax.annotation.Nullable
  private List<String> gwBoundIps = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private String issuer;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWKS_JSON_DATA = "jwks-json-data";
  @SerializedName(SERIALIZED_NAME_JWKS_JSON_DATA)
  @javax.annotation.Nullable
  private String jwksJsonData;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks-uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  @javax.annotation.Nullable
  private String jwksUri;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  @javax.annotation.Nullable
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

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

  public AuthMethodUpdateOauth2() {
  }

  public AuthMethodUpdateOauth2 accessExpires(@javax.annotation.Nullable Long accessExpires) {
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


  public AuthMethodUpdateOauth2 audience(@javax.annotation.Nullable String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * The audience in the JWT
   * @return audience
   */
  @javax.annotation.Nullable
  public String getAudience() {
    return audience;
  }

  public void setAudience(@javax.annotation.Nullable String audience) {
    this.audience = audience;
  }


  public AuthMethodUpdateOauth2 auditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodUpdateOauth2 addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public AuthMethodUpdateOauth2 boundClientIds(@javax.annotation.Nullable List<String> boundClientIds) {
    this.boundClientIds = boundClientIds;
    return this;
  }

  public AuthMethodUpdateOauth2 addBoundClientIdsItem(String boundClientIdsItem) {
    if (this.boundClientIds == null) {
      this.boundClientIds = new ArrayList<>();
    }
    this.boundClientIds.add(boundClientIdsItem);
    return this;
  }

  /**
   * The clients ids that the access is restricted to
   * @return boundClientIds
   */
  @javax.annotation.Nullable
  public List<String> getBoundClientIds() {
    return boundClientIds;
  }

  public void setBoundClientIds(@javax.annotation.Nullable List<String> boundClientIds) {
    this.boundClientIds = boundClientIds;
  }


  public AuthMethodUpdateOauth2 boundIps(@javax.annotation.Nullable List<String> boundIps) {
    this.boundIps = boundIps;
    return this;
  }

  public AuthMethodUpdateOauth2 addBoundIpsItem(String boundIpsItem) {
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


  public AuthMethodUpdateOauth2 cert(@javax.annotation.Nullable String cert) {
    this.cert = cert;
    return this;
  }

  /**
   * CertificateFile Path to a file that contain the certificate in a PEM format.
   * @return cert
   */
  @javax.annotation.Nullable
  public String getCert() {
    return cert;
  }

  public void setCert(@javax.annotation.Nullable String cert) {
    this.cert = cert;
  }


  public AuthMethodUpdateOauth2 certFileData(@javax.annotation.Nullable String certFileData) {
    this.certFileData = certFileData;
    return this;
  }

  /**
   * CertificateFileData PEM Certificate in a Base64 format.
   * @return certFileData
   */
  @javax.annotation.Nullable
  public String getCertFileData() {
    return certFileData;
  }

  public void setCertFileData(@javax.annotation.Nullable String certFileData) {
    this.certFileData = certFileData;
  }


  public AuthMethodUpdateOauth2 deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public AuthMethodUpdateOauth2 description(@javax.annotation.Nullable String description) {
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


  public AuthMethodUpdateOauth2 expirationEventIn(@javax.annotation.Nullable List<String> expirationEventIn) {
    this.expirationEventIn = expirationEventIn;
    return this;
  }

  public AuthMethodUpdateOauth2 addExpirationEventInItem(String expirationEventInItem) {
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


  public AuthMethodUpdateOauth2 forceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
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


  public AuthMethodUpdateOauth2 gatewayUrl(@javax.annotation.Nullable String gatewayUrl) {
    this.gatewayUrl = gatewayUrl;
    return this;
  }

  /**
   * Akeyless Gateway URL (Configuration Management port). Relevant only when the jwks-uri is accessible only from the gateway.
   * @return gatewayUrl
   */
  @javax.annotation.Nullable
  public String getGatewayUrl() {
    return gatewayUrl;
  }

  public void setGatewayUrl(@javax.annotation.Nullable String gatewayUrl) {
    this.gatewayUrl = gatewayUrl;
  }


  public AuthMethodUpdateOauth2 gwBoundIps(@javax.annotation.Nullable List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public AuthMethodUpdateOauth2 addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public AuthMethodUpdateOauth2 issuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Issuer URL
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }


  public AuthMethodUpdateOauth2 json(@javax.annotation.Nullable Boolean json) {
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


  public AuthMethodUpdateOauth2 jwksJsonData(@javax.annotation.Nullable String jwksJsonData) {
    this.jwksJsonData = jwksJsonData;
    return this;
  }

  /**
   * The JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. base64 encoded string
   * @return jwksJsonData
   */
  @javax.annotation.Nullable
  public String getJwksJsonData() {
    return jwksJsonData;
  }

  public void setJwksJsonData(@javax.annotation.Nullable String jwksJsonData) {
    this.jwksJsonData = jwksJsonData;
  }


  public AuthMethodUpdateOauth2 jwksUri(@javax.annotation.Nullable String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.
   * @return jwksUri
   */
  @javax.annotation.Nullable
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(@javax.annotation.Nullable String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public AuthMethodUpdateOauth2 jwtTtl(@javax.annotation.Nullable Long jwtTtl) {
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


  public AuthMethodUpdateOauth2 name(@javax.annotation.Nonnull String name) {
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


  public AuthMethodUpdateOauth2 newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Auth Method new name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public AuthMethodUpdateOauth2 productType(@javax.annotation.Nullable List<String> productType) {
    this.productType = productType;
    return this;
  }

  public AuthMethodUpdateOauth2 addProductTypeItem(String productTypeItem) {
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


  public AuthMethodUpdateOauth2 subclaimsDelimiters(@javax.annotation.Nullable List<String> subclaimsDelimiters) {
    this.subclaimsDelimiters = subclaimsDelimiters;
    return this;
  }

  public AuthMethodUpdateOauth2 addSubclaimsDelimitersItem(String subclaimsDelimitersItem) {
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


  public AuthMethodUpdateOauth2 token(@javax.annotation.Nullable String token) {
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


  public AuthMethodUpdateOauth2 uidToken(@javax.annotation.Nullable String uidToken) {
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


  public AuthMethodUpdateOauth2 uniqueIdentifier(@javax.annotation.Nonnull String uniqueIdentifier) {
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
    AuthMethodUpdateOauth2 authMethodUpdateOauth2 = (AuthMethodUpdateOauth2) o;
    return Objects.equals(this.accessExpires, authMethodUpdateOauth2.accessExpires) &&
        Objects.equals(this.audience, authMethodUpdateOauth2.audience) &&
        Objects.equals(this.auditLogsClaims, authMethodUpdateOauth2.auditLogsClaims) &&
        Objects.equals(this.boundClientIds, authMethodUpdateOauth2.boundClientIds) &&
        Objects.equals(this.boundIps, authMethodUpdateOauth2.boundIps) &&
        Objects.equals(this.cert, authMethodUpdateOauth2.cert) &&
        Objects.equals(this.certFileData, authMethodUpdateOauth2.certFileData) &&
        Objects.equals(this.deleteProtection, authMethodUpdateOauth2.deleteProtection) &&
        Objects.equals(this.description, authMethodUpdateOauth2.description) &&
        Objects.equals(this.expirationEventIn, authMethodUpdateOauth2.expirationEventIn) &&
        Objects.equals(this.forceSubClaims, authMethodUpdateOauth2.forceSubClaims) &&
        Objects.equals(this.gatewayUrl, authMethodUpdateOauth2.gatewayUrl) &&
        Objects.equals(this.gwBoundIps, authMethodUpdateOauth2.gwBoundIps) &&
        Objects.equals(this.issuer, authMethodUpdateOauth2.issuer) &&
        Objects.equals(this.json, authMethodUpdateOauth2.json) &&
        Objects.equals(this.jwksJsonData, authMethodUpdateOauth2.jwksJsonData) &&
        Objects.equals(this.jwksUri, authMethodUpdateOauth2.jwksUri) &&
        Objects.equals(this.jwtTtl, authMethodUpdateOauth2.jwtTtl) &&
        Objects.equals(this.name, authMethodUpdateOauth2.name) &&
        Objects.equals(this.newName, authMethodUpdateOauth2.newName) &&
        Objects.equals(this.productType, authMethodUpdateOauth2.productType) &&
        Objects.equals(this.subclaimsDelimiters, authMethodUpdateOauth2.subclaimsDelimiters) &&
        Objects.equals(this.token, authMethodUpdateOauth2.token) &&
        Objects.equals(this.uidToken, authMethodUpdateOauth2.uidToken) &&
        Objects.equals(this.uniqueIdentifier, authMethodUpdateOauth2.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, auditLogsClaims, boundClientIds, boundIps, cert, certFileData, deleteProtection, description, expirationEventIn, forceSubClaims, gatewayUrl, gwBoundIps, issuer, json, jwksJsonData, jwksUri, jwtTtl, name, newName, productType, subclaimsDelimiters, token, uidToken, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodUpdateOauth2 {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundClientIds: ").append(toIndentedString(boundClientIds)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certFileData: ").append(toIndentedString(certFileData)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationEventIn: ").append(toIndentedString(expirationEventIn)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gatewayUrl: ").append(toIndentedString(gatewayUrl)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwksJsonData: ").append(toIndentedString(jwksJsonData)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("audit-logs-claims");
    openapiFields.add("bound-client-ids");
    openapiFields.add("bound-ips");
    openapiFields.add("cert");
    openapiFields.add("cert-file-data");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("expiration-event-in");
    openapiFields.add("force-sub-claims");
    openapiFields.add("gateway-url");
    openapiFields.add("gw-bound-ips");
    openapiFields.add("issuer");
    openapiFields.add("json");
    openapiFields.add("jwks-json-data");
    openapiFields.add("jwks-uri");
    openapiFields.add("jwt-ttl");
    openapiFields.add("name");
    openapiFields.add("new-name");
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
   * @throws IOException if the JSON Element is invalid with respect to AuthMethodUpdateOauth2
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethodUpdateOauth2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethodUpdateOauth2 is not found in the empty JSON string", AuthMethodUpdateOauth2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethodUpdateOauth2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethodUpdateOauth2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthMethodUpdateOauth2.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audit-logs-claims") != null && !jsonObj.get("audit-logs-claims").isJsonNull() && !jsonObj.get("audit-logs-claims").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit-logs-claims` to be an array in the JSON string but got `%s`", jsonObj.get("audit-logs-claims").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bound-client-ids") != null && !jsonObj.get("bound-client-ids").isJsonNull() && !jsonObj.get("bound-client-ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bound-client-ids` to be an array in the JSON string but got `%s`", jsonObj.get("bound-client-ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bound-ips") != null && !jsonObj.get("bound-ips").isJsonNull() && !jsonObj.get("bound-ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bound-ips` to be an array in the JSON string but got `%s`", jsonObj.get("bound-ips").toString()));
      }
      if ((jsonObj.get("cert") != null && !jsonObj.get("cert").isJsonNull()) && !jsonObj.get("cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert").toString()));
      }
      if ((jsonObj.get("cert-file-data") != null && !jsonObj.get("cert-file-data").isJsonNull()) && !jsonObj.get("cert-file-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert-file-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert-file-data").toString()));
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
      if ((jsonObj.get("gateway-url") != null && !jsonObj.get("gateway-url").isJsonNull()) && !jsonObj.get("gateway-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway-url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("gw-bound-ips") != null && !jsonObj.get("gw-bound-ips").isJsonNull() && !jsonObj.get("gw-bound-ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gw-bound-ips` to be an array in the JSON string but got `%s`", jsonObj.get("gw-bound-ips").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if ((jsonObj.get("jwks-json-data") != null && !jsonObj.get("jwks-json-data").isJsonNull()) && !jsonObj.get("jwks-json-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks-json-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks-json-data").toString()));
      }
      if ((jsonObj.get("jwks-uri") != null && !jsonObj.get("jwks-uri").isJsonNull()) && !jsonObj.get("jwks-uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks-uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks-uri").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
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
       if (!AuthMethodUpdateOauth2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethodUpdateOauth2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethodUpdateOauth2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethodUpdateOauth2.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethodUpdateOauth2>() {
           @Override
           public void write(JsonWriter out, AuthMethodUpdateOauth2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethodUpdateOauth2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethodUpdateOauth2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethodUpdateOauth2
   * @throws IOException if the JSON string is invalid with respect to AuthMethodUpdateOauth2
   */
  public static AuthMethodUpdateOauth2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethodUpdateOauth2.class);
  }

  /**
   * Convert an instance of AuthMethodUpdateOauth2 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

