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
 * createAuthMethodOAuth2 is a command that creates a new auth method that will be able to authenticate using OpenID/Oauth2.
 */
@ApiModel(description = "createAuthMethodOAuth2 is a command that creates a new auth method that will be able to authenticate using OpenID/Oauth2.")

public class CreateAuthMethodOAuth2 {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_BOUND_CLIENT_IDS = "bound-client-ids";
  @SerializedName(SERIALIZED_NAME_BOUND_CLIENT_IDS)
  private List<String> boundClientIds = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks-uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateAuthMethodOAuth2 accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodOAuth2 audience(String audience) {
    
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


  public CreateAuthMethodOAuth2 boundClientIds(List<String> boundClientIds) {
    
    this.boundClientIds = boundClientIds;
    return this;
  }

  public CreateAuthMethodOAuth2 addBoundClientIdsItem(String boundClientIdsItem) {
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


  public CreateAuthMethodOAuth2 boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodOAuth2 addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist of the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist of the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public CreateAuthMethodOAuth2 forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodOAuth2 issuer(String issuer) {
    
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


  public CreateAuthMethodOAuth2 jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.
   * @return jwksUri
  **/
  @ApiModelProperty(required = true, value = "The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public CreateAuthMethodOAuth2 name(String name) {
    
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


  public CreateAuthMethodOAuth2 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateAuthMethodOAuth2 token(String token) {
    
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


  public CreateAuthMethodOAuth2 uidToken(String uidToken) {
    
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


  public CreateAuthMethodOAuth2 uniqueIdentifier(String uniqueIdentifier) {
    
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


  public CreateAuthMethodOAuth2 username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthMethodOAuth2 createAuthMethodOAuth2 = (CreateAuthMethodOAuth2) o;
    return Objects.equals(this.accessExpires, createAuthMethodOAuth2.accessExpires) &&
        Objects.equals(this.audience, createAuthMethodOAuth2.audience) &&
        Objects.equals(this.boundClientIds, createAuthMethodOAuth2.boundClientIds) &&
        Objects.equals(this.boundIps, createAuthMethodOAuth2.boundIps) &&
        Objects.equals(this.forceSubClaims, createAuthMethodOAuth2.forceSubClaims) &&
        Objects.equals(this.issuer, createAuthMethodOAuth2.issuer) &&
        Objects.equals(this.jwksUri, createAuthMethodOAuth2.jwksUri) &&
        Objects.equals(this.name, createAuthMethodOAuth2.name) &&
        Objects.equals(this.password, createAuthMethodOAuth2.password) &&
        Objects.equals(this.token, createAuthMethodOAuth2.token) &&
        Objects.equals(this.uidToken, createAuthMethodOAuth2.uidToken) &&
        Objects.equals(this.uniqueIdentifier, createAuthMethodOAuth2.uniqueIdentifier) &&
        Objects.equals(this.username, createAuthMethodOAuth2.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, boundClientIds, boundIps, forceSubClaims, issuer, jwksUri, name, password, token, uidToken, uniqueIdentifier, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodOAuth2 {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundClientIds: ").append(toIndentedString(boundClientIds)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

