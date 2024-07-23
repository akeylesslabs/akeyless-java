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
 * authMethodCreateOauth2 is a command that creates a new auth method that will be able to authenticate using Oauth2.
 */
@ApiModel(description = "authMethodCreateOauth2 is a command that creates a new auth method that will be able to authenticate using Oauth2.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthMethodCreateOauth2 {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit-logs-claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  private List<String> auditLogsClaims = null;

  public static final String SERIALIZED_NAME_BOUND_CLIENT_IDS = "bound-client-ids";
  @SerializedName(SERIALIZED_NAME_BOUND_CLIENT_IDS)
  private List<String> boundClientIds = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  private String cert;

  public static final String SERIALIZED_NAME_CERT_FILE_DATA = "cert-file-data";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_DATA)
  private String certFileData;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GATEWAY_URL = "gateway-url";
  @SerializedName(SERIALIZED_NAME_GATEWAY_URL)
  private String gatewayUrl;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWKS_JSON_DATA = "jwks-json-data";
  @SerializedName(SERIALIZED_NAME_JWKS_JSON_DATA)
  private String jwksJsonData;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks-uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri = "default_jwks_url";

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public AuthMethodCreateOauth2() { 
  }

  public AuthMethodCreateOauth2 accessExpires(Long accessExpires) {
    
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


  public AuthMethodCreateOauth2 audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * The audience in the JWT
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audience in the JWT")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public AuthMethodCreateOauth2 auditLogsClaims(List<String> auditLogsClaims) {
    
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodCreateOauth2 addAuditLogsClaimsItem(String auditLogsClaimsItem) {
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


  public AuthMethodCreateOauth2 boundClientIds(List<String> boundClientIds) {
    
    this.boundClientIds = boundClientIds;
    return this;
  }

  public AuthMethodCreateOauth2 addBoundClientIdsItem(String boundClientIdsItem) {
    if (this.boundClientIds == null) {
      this.boundClientIds = new ArrayList<String>();
    }
    this.boundClientIds.add(boundClientIdsItem);
    return this;
  }

   /**
   * The clients ids that the access is restricted to
   * @return boundClientIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The clients ids that the access is restricted to")

  public List<String> getBoundClientIds() {
    return boundClientIds;
  }


  public void setBoundClientIds(List<String> boundClientIds) {
    this.boundClientIds = boundClientIds;
  }


  public AuthMethodCreateOauth2 boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public AuthMethodCreateOauth2 addBoundIpsItem(String boundIpsItem) {
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


  public AuthMethodCreateOauth2 cert(String cert) {
    
    this.cert = cert;
    return this;
  }

   /**
   * CertificateFile Path to a file that contain the certificate in a PEM format.
   * @return cert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CertificateFile Path to a file that contain the certificate in a PEM format.")

  public String getCert() {
    return cert;
  }


  public void setCert(String cert) {
    this.cert = cert;
  }


  public AuthMethodCreateOauth2 certFileData(String certFileData) {
    
    this.certFileData = certFileData;
    return this;
  }

   /**
   * CertificateFileData PEM Certificate in a Base64 format.
   * @return certFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CertificateFileData PEM Certificate in a Base64 format.")

  public String getCertFileData() {
    return certFileData;
  }


  public void setCertFileData(String certFileData) {
    this.certFileData = certFileData;
  }


  public AuthMethodCreateOauth2 deleteProtection(String deleteProtection) {
    
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


  public AuthMethodCreateOauth2 description(String description) {
    
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


  public AuthMethodCreateOauth2 forceSubClaims(Boolean forceSubClaims) {
    
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


  public AuthMethodCreateOauth2 gatewayUrl(String gatewayUrl) {
    
    this.gatewayUrl = gatewayUrl;
    return this;
  }

   /**
   * Akeyless Gateway URL (Configuration Management port). Relevant only when the jwks-uri is accessible only from the gateway.
   * @return gatewayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Akeyless Gateway URL (Configuration Management port). Relevant only when the jwks-uri is accessible only from the gateway.")

  public String getGatewayUrl() {
    return gatewayUrl;
  }


  public void setGatewayUrl(String gatewayUrl) {
    this.gatewayUrl = gatewayUrl;
  }


  public AuthMethodCreateOauth2 gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public AuthMethodCreateOauth2 addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public AuthMethodCreateOauth2 issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer URL
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuer URL")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public AuthMethodCreateOauth2 json(Boolean json) {
    
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


  public AuthMethodCreateOauth2 jwksJsonData(String jwksJsonData) {
    
    this.jwksJsonData = jwksJsonData;
    return this;
  }

   /**
   * The JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. base64 encoded string
   * @return jwksJsonData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server. base64 encoded string")

  public String getJwksJsonData() {
    return jwksJsonData;
  }


  public void setJwksJsonData(String jwksJsonData) {
    this.jwksJsonData = jwksJsonData;
  }


  public AuthMethodCreateOauth2 jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.
   * @return jwksUri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public AuthMethodCreateOauth2 jwtTtl(Long jwtTtl) {
    
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


  public AuthMethodCreateOauth2 name(String name) {
    
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


  public AuthMethodCreateOauth2 productType(List<String> productType) {
    
    this.productType = productType;
    return this;
  }

  public AuthMethodCreateOauth2 addProductTypeItem(String productTypeItem) {
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


  public AuthMethodCreateOauth2 subclaimsDelimiters(List<String> subclaimsDelimiters) {
    
    this.subclaimsDelimiters = subclaimsDelimiters;
    return this;
  }

  public AuthMethodCreateOauth2 addSubclaimsDelimitersItem(String subclaimsDelimitersItem) {
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


  public AuthMethodCreateOauth2 token(String token) {
    
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


  public AuthMethodCreateOauth2 uidToken(String uidToken) {
    
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


  public AuthMethodCreateOauth2 uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

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
    AuthMethodCreateOauth2 authMethodCreateOauth2 = (AuthMethodCreateOauth2) o;
    return Objects.equals(this.accessExpires, authMethodCreateOauth2.accessExpires) &&
        Objects.equals(this.audience, authMethodCreateOauth2.audience) &&
        Objects.equals(this.auditLogsClaims, authMethodCreateOauth2.auditLogsClaims) &&
        Objects.equals(this.boundClientIds, authMethodCreateOauth2.boundClientIds) &&
        Objects.equals(this.boundIps, authMethodCreateOauth2.boundIps) &&
        Objects.equals(this.cert, authMethodCreateOauth2.cert) &&
        Objects.equals(this.certFileData, authMethodCreateOauth2.certFileData) &&
        Objects.equals(this.deleteProtection, authMethodCreateOauth2.deleteProtection) &&
        Objects.equals(this.description, authMethodCreateOauth2.description) &&
        Objects.equals(this.forceSubClaims, authMethodCreateOauth2.forceSubClaims) &&
        Objects.equals(this.gatewayUrl, authMethodCreateOauth2.gatewayUrl) &&
        Objects.equals(this.gwBoundIps, authMethodCreateOauth2.gwBoundIps) &&
        Objects.equals(this.issuer, authMethodCreateOauth2.issuer) &&
        Objects.equals(this.json, authMethodCreateOauth2.json) &&
        Objects.equals(this.jwksJsonData, authMethodCreateOauth2.jwksJsonData) &&
        Objects.equals(this.jwksUri, authMethodCreateOauth2.jwksUri) &&
        Objects.equals(this.jwtTtl, authMethodCreateOauth2.jwtTtl) &&
        Objects.equals(this.name, authMethodCreateOauth2.name) &&
        Objects.equals(this.productType, authMethodCreateOauth2.productType) &&
        Objects.equals(this.subclaimsDelimiters, authMethodCreateOauth2.subclaimsDelimiters) &&
        Objects.equals(this.token, authMethodCreateOauth2.token) &&
        Objects.equals(this.uidToken, authMethodCreateOauth2.uidToken) &&
        Objects.equals(this.uniqueIdentifier, authMethodCreateOauth2.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, auditLogsClaims, boundClientIds, boundIps, cert, certFileData, deleteProtection, description, forceSubClaims, gatewayUrl, gwBoundIps, issuer, json, jwksJsonData, jwksUri, jwtTtl, name, productType, subclaimsDelimiters, token, uidToken, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodCreateOauth2 {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    boundClientIds: ").append(toIndentedString(boundClientIds)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certFileData: ").append(toIndentedString(certFileData)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gatewayUrl: ").append(toIndentedString(gatewayUrl)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwksJsonData: ").append(toIndentedString(jwksJsonData)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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

}

