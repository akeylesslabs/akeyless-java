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
import io.akeyless.client.model.OAuth2CustomClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OAuth2AccessRules contains access rules specific to OAuth2 authentication method.
 */
@ApiModel(description = "OAuth2AccessRules contains access rules specific to OAuth2 authentication method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuth2AccessRules {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_BOUND_CLAIMS = "bound_claims";
  @SerializedName(SERIALIZED_NAME_BOUND_CLAIMS)
  private List<OAuth2CustomClaim> boundClaims = null;

  public static final String SERIALIZED_NAME_BOUND_CLIENTS_ID = "bound_clients_id";
  @SerializedName(SERIALIZED_NAME_BOUND_CLIENTS_ID)
  private List<String> boundClientsId = null;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JWKS_JSON_DATA = "jwks_json_data";
  @SerializedName(SERIALIZED_NAME_JWKS_JSON_DATA)
  private String jwksJsonData;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks_uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public OAuth2AccessRules() { 
  }

  public OAuth2AccessRules audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * The audience in the JWT.
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audience in the JWT.")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public OAuth2AccessRules boundClaims(List<OAuth2CustomClaim> boundClaims) {
    
    this.boundClaims = boundClaims;
    return this;
  }

  public OAuth2AccessRules addBoundClaimsItem(OAuth2CustomClaim boundClaimsItem) {
    if (this.boundClaims == null) {
      this.boundClaims = new ArrayList<OAuth2CustomClaim>();
    }
    this.boundClaims.add(boundClaimsItem);
    return this;
  }

   /**
   * The claims that login is restricted to.
   * @return boundClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The claims that login is restricted to.")

  public List<OAuth2CustomClaim> getBoundClaims() {
    return boundClaims;
  }


  public void setBoundClaims(List<OAuth2CustomClaim> boundClaims) {
    this.boundClaims = boundClaims;
  }


  public OAuth2AccessRules boundClientsId(List<String> boundClientsId) {
    
    this.boundClientsId = boundClientsId;
    return this;
  }

  public OAuth2AccessRules addBoundClientsIdItem(String boundClientsIdItem) {
    if (this.boundClientsId == null) {
      this.boundClientsId = new ArrayList<String>();
    }
    this.boundClientsId.add(boundClientsIdItem);
    return this;
  }

   /**
   * The clients ids that login is restricted to.
   * @return boundClientsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The clients ids that login is restricted to.")

  public List<String> getBoundClientsId() {
    return boundClientsId;
  }


  public void setBoundClientsId(List<String> boundClientsId) {
    this.boundClientsId = boundClientsId;
  }


  public OAuth2AccessRules issuer(String issuer) {
    
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


  public OAuth2AccessRules jwksJsonData(String jwksJsonData) {
    
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


  public OAuth2AccessRules jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.
   * @return jwksUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the JSON Web Key Set (JWKS) that containing the public keys that should be used to verify any JSON Web Token (JWT) issued by the authorization server.")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public OAuth2AccessRules uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier to distinguish different users
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier to distinguish different users")

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
    OAuth2AccessRules oauth2AccessRules = (OAuth2AccessRules) o;
    return Objects.equals(this.audience, oauth2AccessRules.audience) &&
        Objects.equals(this.boundClaims, oauth2AccessRules.boundClaims) &&
        Objects.equals(this.boundClientsId, oauth2AccessRules.boundClientsId) &&
        Objects.equals(this.issuer, oauth2AccessRules.issuer) &&
        Objects.equals(this.jwksJsonData, oauth2AccessRules.jwksJsonData) &&
        Objects.equals(this.jwksUri, oauth2AccessRules.jwksUri) &&
        Objects.equals(this.uniqueIdentifier, oauth2AccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, boundClaims, boundClientsId, issuer, jwksJsonData, jwksUri, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2AccessRules {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundClaims: ").append(toIndentedString(boundClaims)).append("\n");
    sb.append("    boundClientsId: ").append(toIndentedString(boundClientsId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwksJsonData: ").append(toIndentedString(jwksJsonData)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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

