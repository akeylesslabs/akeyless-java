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
 * createAuthMethodSAML is a command that creates a new auth method that will be available to authenticate using SAML.
 */
@ApiModel(description = "createAuthMethodSAML is a command that creates a new auth method that will be available to authenticate using SAML.")

public class CreateAuthMethodSAML {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_ALLOWED_REDIRECT_URI = "allowed-redirect-uri";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REDIRECT_URI)
  private List<String> allowedRedirectUri = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_IDP_METADATA_URL = "idp-metadata-url";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_URL)
  private String idpMetadataUrl;

  public static final String SERIALIZED_NAME_IDP_METADATA_XML_DATA = "idp-metadata-xml-data";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_XML_DATA)
  private String idpMetadataXmlData;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public CreateAuthMethodSAML accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodSAML allowedRedirectUri(List<String> allowedRedirectUri) {
    
    this.allowedRedirectUri = allowedRedirectUri;
    return this;
  }

  public CreateAuthMethodSAML addAllowedRedirectUriItem(String allowedRedirectUriItem) {
    if (this.allowedRedirectUri == null) {
      this.allowedRedirectUri = new ArrayList<String>();
    }
    this.allowedRedirectUri.add(allowedRedirectUriItem);
    return this;
  }

   /**
   * Allowed redirect URIs after the authentication
   * @return allowedRedirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed redirect URIs after the authentication")

  public List<String> getAllowedRedirectUri() {
    return allowedRedirectUri;
  }


  public void setAllowedRedirectUri(List<String> allowedRedirectUri) {
    this.allowedRedirectUri = allowedRedirectUri;
  }


  public CreateAuthMethodSAML boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodSAML addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodSAML forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodSAML gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodSAML addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public CreateAuthMethodSAML idpMetadataUrl(String idpMetadataUrl) {
    
    this.idpMetadataUrl = idpMetadataUrl;
    return this;
  }

   /**
   * IDP metadata url
   * @return idpMetadataUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDP metadata url")

  public String getIdpMetadataUrl() {
    return idpMetadataUrl;
  }


  public void setIdpMetadataUrl(String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
  }


  public CreateAuthMethodSAML idpMetadataXmlData(String idpMetadataXmlData) {
    
    this.idpMetadataXmlData = idpMetadataXmlData;
    return this;
  }

   /**
   * IDP metadata xml data
   * @return idpMetadataXmlData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDP metadata xml data")

  public String getIdpMetadataXmlData() {
    return idpMetadataXmlData;
  }


  public void setIdpMetadataXmlData(String idpMetadataXmlData) {
    this.idpMetadataXmlData = idpMetadataXmlData;
  }


  public CreateAuthMethodSAML json(Boolean json) {
    
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


  public CreateAuthMethodSAML jwtTtl(Long jwtTtl) {
    
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


  public CreateAuthMethodSAML name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAuthMethodSAML token(String token) {
    
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


  public CreateAuthMethodSAML uidToken(String uidToken) {
    
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


  public CreateAuthMethodSAML uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthMethodSAML createAuthMethodSAML = (CreateAuthMethodSAML) o;
    return Objects.equals(this.accessExpires, createAuthMethodSAML.accessExpires) &&
        Objects.equals(this.allowedRedirectUri, createAuthMethodSAML.allowedRedirectUri) &&
        Objects.equals(this.boundIps, createAuthMethodSAML.boundIps) &&
        Objects.equals(this.forceSubClaims, createAuthMethodSAML.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, createAuthMethodSAML.gwBoundIps) &&
        Objects.equals(this.idpMetadataUrl, createAuthMethodSAML.idpMetadataUrl) &&
        Objects.equals(this.idpMetadataXmlData, createAuthMethodSAML.idpMetadataXmlData) &&
        Objects.equals(this.json, createAuthMethodSAML.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodSAML.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodSAML.name) &&
        Objects.equals(this.token, createAuthMethodSAML.token) &&
        Objects.equals(this.uidToken, createAuthMethodSAML.uidToken) &&
        Objects.equals(this.uniqueIdentifier, createAuthMethodSAML.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, allowedRedirectUri, boundIps, forceSubClaims, gwBoundIps, idpMetadataUrl, idpMetadataXmlData, json, jwtTtl, name, token, uidToken, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodSAML {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    allowedRedirectUri: ").append(toIndentedString(allowedRedirectUri)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    idpMetadataUrl: ").append(toIndentedString(idpMetadataUrl)).append("\n");
    sb.append("    idpMetadataXmlData: ").append(toIndentedString(idpMetadataXmlData)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

