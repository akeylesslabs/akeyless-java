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
 * createAuthMethodK8S is a command that creates a new auth method that will be able to authenticate using K8S.
 */
@ApiModel(description = "createAuthMethodK8S is a command that creates a new auth method that will be able to authenticate using K8S.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAuthMethodK8S {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_NAMESPACES = "bound-namespaces";
  @SerializedName(SERIALIZED_NAME_BOUND_NAMESPACES)
  private List<String> boundNamespaces = null;

  public static final String SERIALIZED_NAME_BOUND_POD_NAMES = "bound-pod-names";
  @SerializedName(SERIALIZED_NAME_BOUND_POD_NAMES)
  private List<String> boundPodNames = null;

  public static final String SERIALIZED_NAME_BOUND_SA_NAMES = "bound-sa-names";
  @SerializedName(SERIALIZED_NAME_BOUND_SA_NAMES)
  private List<String> boundSaNames = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GEN_KEY = "gen-key";
  @SerializedName(SERIALIZED_NAME_GEN_KEY)
  private String genKey = "true";

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public-key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateAuthMethodK8S() { 
  }

  public CreateAuthMethodK8S accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodK8S audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * The audience in the Kubernetes JWT that the access is restricted to
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audience in the Kubernetes JWT that the access is restricted to")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public CreateAuthMethodK8S boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodK8S addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodK8S boundNamespaces(List<String> boundNamespaces) {
    
    this.boundNamespaces = boundNamespaces;
    return this;
  }

  public CreateAuthMethodK8S addBoundNamespacesItem(String boundNamespacesItem) {
    if (this.boundNamespaces == null) {
      this.boundNamespaces = new ArrayList<String>();
    }
    this.boundNamespaces.add(boundNamespacesItem);
    return this;
  }

   /**
   * A list of namespaces that the access is restricted to
   * @return boundNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of namespaces that the access is restricted to")

  public List<String> getBoundNamespaces() {
    return boundNamespaces;
  }


  public void setBoundNamespaces(List<String> boundNamespaces) {
    this.boundNamespaces = boundNamespaces;
  }


  public CreateAuthMethodK8S boundPodNames(List<String> boundPodNames) {
    
    this.boundPodNames = boundPodNames;
    return this;
  }

  public CreateAuthMethodK8S addBoundPodNamesItem(String boundPodNamesItem) {
    if (this.boundPodNames == null) {
      this.boundPodNames = new ArrayList<String>();
    }
    this.boundPodNames.add(boundPodNamesItem);
    return this;
  }

   /**
   * A list of pod names that the access is restricted to
   * @return boundPodNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pod names that the access is restricted to")

  public List<String> getBoundPodNames() {
    return boundPodNames;
  }


  public void setBoundPodNames(List<String> boundPodNames) {
    this.boundPodNames = boundPodNames;
  }


  public CreateAuthMethodK8S boundSaNames(List<String> boundSaNames) {
    
    this.boundSaNames = boundSaNames;
    return this;
  }

  public CreateAuthMethodK8S addBoundSaNamesItem(String boundSaNamesItem) {
    if (this.boundSaNames == null) {
      this.boundSaNames = new ArrayList<String>();
    }
    this.boundSaNames.add(boundSaNamesItem);
    return this;
  }

   /**
   * A list of service account names that the access is restricted to
   * @return boundSaNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of service account names that the access is restricted to")

  public List<String> getBoundSaNames() {
    return boundSaNames;
  }


  public void setBoundSaNames(List<String> boundSaNames) {
    this.boundSaNames = boundSaNames;
  }


  public CreateAuthMethodK8S forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodK8S genKey(String genKey) {
    
    this.genKey = genKey;
    return this;
  }

   /**
   * Automatically generate key-pair for K8S configuration. If set to false, a public key needs to be provided [true/false]
   * @return genKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatically generate key-pair for K8S configuration. If set to false, a public key needs to be provided [true/false]")

  public String getGenKey() {
    return genKey;
  }


  public void setGenKey(String genKey) {
    this.genKey = genKey;
  }


  public CreateAuthMethodK8S gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodK8S addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public CreateAuthMethodK8S json(Boolean json) {
    
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


  public CreateAuthMethodK8S jwtTtl(Long jwtTtl) {
    
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


  public CreateAuthMethodK8S name(String name) {
    
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


  public CreateAuthMethodK8S publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Base64-encoded or PEM formatted public key data for K8S authentication method is required [RSA2048]
   * @return publicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded or PEM formatted public key data for K8S authentication method is required [RSA2048]")

  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public CreateAuthMethodK8S token(String token) {
    
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


  public CreateAuthMethodK8S uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthMethodK8S createAuthMethodK8S = (CreateAuthMethodK8S) o;
    return Objects.equals(this.accessExpires, createAuthMethodK8S.accessExpires) &&
        Objects.equals(this.audience, createAuthMethodK8S.audience) &&
        Objects.equals(this.boundIps, createAuthMethodK8S.boundIps) &&
        Objects.equals(this.boundNamespaces, createAuthMethodK8S.boundNamespaces) &&
        Objects.equals(this.boundPodNames, createAuthMethodK8S.boundPodNames) &&
        Objects.equals(this.boundSaNames, createAuthMethodK8S.boundSaNames) &&
        Objects.equals(this.forceSubClaims, createAuthMethodK8S.forceSubClaims) &&
        Objects.equals(this.genKey, createAuthMethodK8S.genKey) &&
        Objects.equals(this.gwBoundIps, createAuthMethodK8S.gwBoundIps) &&
        Objects.equals(this.json, createAuthMethodK8S.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodK8S.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodK8S.name) &&
        Objects.equals(this.publicKey, createAuthMethodK8S.publicKey) &&
        Objects.equals(this.token, createAuthMethodK8S.token) &&
        Objects.equals(this.uidToken, createAuthMethodK8S.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, boundIps, boundNamespaces, boundPodNames, boundSaNames, forceSubClaims, genKey, gwBoundIps, json, jwtTtl, name, publicKey, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodK8S {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundNamespaces: ").append(toIndentedString(boundNamespaces)).append("\n");
    sb.append("    boundPodNames: ").append(toIndentedString(boundPodNames)).append("\n");
    sb.append("    boundSaNames: ").append(toIndentedString(boundSaNames)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    genKey: ").append(toIndentedString(genKey)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

}

