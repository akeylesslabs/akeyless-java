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
 * gatewayCreateProducerPing is a command that creates ping producer [Deprecated: Use dynamic-secret-create-ping command]
 */
@ApiModel(description = "gatewayCreateProducerPing is a command that creates ping producer [Deprecated: Use dynamic-secret-create-ping command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayCreateProducerPing {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PING_ADMINISTRATIVE_PORT = "ping-administrative-port";
  @SerializedName(SERIALIZED_NAME_PING_ADMINISTRATIVE_PORT)
  private String pingAdministrativePort = "9999";

  public static final String SERIALIZED_NAME_PING_ATM_ID = "ping-atm-id";
  @SerializedName(SERIALIZED_NAME_PING_ATM_ID)
  private String pingAtmId;

  public static final String SERIALIZED_NAME_PING_AUTHORIZATION_PORT = "ping-authorization-port";
  @SerializedName(SERIALIZED_NAME_PING_AUTHORIZATION_PORT)
  private String pingAuthorizationPort = "9031";

  public static final String SERIALIZED_NAME_PING_CERT_SUBJECT_DN = "ping-cert-subject-dn";
  @SerializedName(SERIALIZED_NAME_PING_CERT_SUBJECT_DN)
  private String pingCertSubjectDn;

  public static final String SERIALIZED_NAME_PING_CLIENT_AUTHENTICATION_TYPE = "ping-client-authentication-type";
  @SerializedName(SERIALIZED_NAME_PING_CLIENT_AUTHENTICATION_TYPE)
  private String pingClientAuthenticationType = "CLIENT_SECRET";

  public static final String SERIALIZED_NAME_PING_ENFORCE_REPLAY_PREVENTION = "ping-enforce-replay-prevention";
  @SerializedName(SERIALIZED_NAME_PING_ENFORCE_REPLAY_PREVENTION)
  private String pingEnforceReplayPrevention = "false";

  public static final String SERIALIZED_NAME_PING_GRANT_TYPES = "ping-grant-types";
  @SerializedName(SERIALIZED_NAME_PING_GRANT_TYPES)
  private List<String> pingGrantTypes = null;

  public static final String SERIALIZED_NAME_PING_ISSUER_DN = "ping-issuer-dn";
  @SerializedName(SERIALIZED_NAME_PING_ISSUER_DN)
  private String pingIssuerDn;

  public static final String SERIALIZED_NAME_PING_JWKS = "ping-jwks";
  @SerializedName(SERIALIZED_NAME_PING_JWKS)
  private String pingJwks;

  public static final String SERIALIZED_NAME_PING_JWKS_URL = "ping-jwks-url";
  @SerializedName(SERIALIZED_NAME_PING_JWKS_URL)
  private String pingJwksUrl;

  public static final String SERIALIZED_NAME_PING_PASSWORD = "ping-password";
  @SerializedName(SERIALIZED_NAME_PING_PASSWORD)
  private String pingPassword;

  public static final String SERIALIZED_NAME_PING_PRIVILEGED_USER = "ping-privileged-user";
  @SerializedName(SERIALIZED_NAME_PING_PRIVILEGED_USER)
  private String pingPrivilegedUser;

  public static final String SERIALIZED_NAME_PING_REDIRECT_URIS = "ping-redirect-uris";
  @SerializedName(SERIALIZED_NAME_PING_REDIRECT_URIS)
  private List<String> pingRedirectUris = null;

  public static final String SERIALIZED_NAME_PING_RESTRICTED_SCOPES = "ping-restricted-scopes";
  @SerializedName(SERIALIZED_NAME_PING_RESTRICTED_SCOPES)
  private List<String> pingRestrictedScopes = null;

  public static final String SERIALIZED_NAME_PING_SIGNING_ALGO = "ping-signing-algo";
  @SerializedName(SERIALIZED_NAME_PING_SIGNING_ALGO)
  private String pingSigningAlgo;

  public static final String SERIALIZED_NAME_PING_URL = "ping-url";
  @SerializedName(SERIALIZED_NAME_PING_URL)
  private String pingUrl;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public GatewayCreateProducerPing() { 
  }

  public GatewayCreateProducerPing deleteProtection(String deleteProtection) {
    
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


  public GatewayCreateProducerPing json(Boolean json) {
    
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


  public GatewayCreateProducerPing name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateProducerPing pingAdministrativePort(String pingAdministrativePort) {
    
    this.pingAdministrativePort = pingAdministrativePort;
    return this;
  }

   /**
   * Ping Federate administrative port
   * @return pingAdministrativePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate administrative port")

  public String getPingAdministrativePort() {
    return pingAdministrativePort;
  }


  public void setPingAdministrativePort(String pingAdministrativePort) {
    this.pingAdministrativePort = pingAdministrativePort;
  }


  public GatewayCreateProducerPing pingAtmId(String pingAtmId) {
    
    this.pingAtmId = pingAtmId;
    return this;
  }

   /**
   * Set a specific Access Token Management (ATM) instance for the created OAuth Client by providing the ATM Id. If no explicit value is given, the default pingfederate server ATM will be set.
   * @return pingAtmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set a specific Access Token Management (ATM) instance for the created OAuth Client by providing the ATM Id. If no explicit value is given, the default pingfederate server ATM will be set.")

  public String getPingAtmId() {
    return pingAtmId;
  }


  public void setPingAtmId(String pingAtmId) {
    this.pingAtmId = pingAtmId;
  }


  public GatewayCreateProducerPing pingAuthorizationPort(String pingAuthorizationPort) {
    
    this.pingAuthorizationPort = pingAuthorizationPort;
    return this;
  }

   /**
   * Ping Federate authorization port
   * @return pingAuthorizationPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate authorization port")

  public String getPingAuthorizationPort() {
    return pingAuthorizationPort;
  }


  public void setPingAuthorizationPort(String pingAuthorizationPort) {
    this.pingAuthorizationPort = pingAuthorizationPort;
  }


  public GatewayCreateProducerPing pingCertSubjectDn(String pingCertSubjectDn) {
    
    this.pingCertSubjectDn = pingCertSubjectDn;
    return this;
  }

   /**
   * The subject DN of the client certificate. If no explicit value is given, the producer will create CA certificate and matched client certificate and return it as value. Used in conjunction with ping-issuer-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method)
   * @return pingCertSubjectDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject DN of the client certificate. If no explicit value is given, the producer will create CA certificate and matched client certificate and return it as value. Used in conjunction with ping-issuer-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method)")

  public String getPingCertSubjectDn() {
    return pingCertSubjectDn;
  }


  public void setPingCertSubjectDn(String pingCertSubjectDn) {
    this.pingCertSubjectDn = pingCertSubjectDn;
  }


  public GatewayCreateProducerPing pingClientAuthenticationType(String pingClientAuthenticationType) {
    
    this.pingClientAuthenticationType = pingClientAuthenticationType;
    return this;
  }

   /**
   * OAuth Client Authentication Type [CLIENT_SECRET, PRIVATE_KEY_JWT, CLIENT_TLS_CERTIFICATE]
   * @return pingClientAuthenticationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth Client Authentication Type [CLIENT_SECRET, PRIVATE_KEY_JWT, CLIENT_TLS_CERTIFICATE]")

  public String getPingClientAuthenticationType() {
    return pingClientAuthenticationType;
  }


  public void setPingClientAuthenticationType(String pingClientAuthenticationType) {
    this.pingClientAuthenticationType = pingClientAuthenticationType;
  }


  public GatewayCreateProducerPing pingEnforceReplayPrevention(String pingEnforceReplayPrevention) {
    
    this.pingEnforceReplayPrevention = pingEnforceReplayPrevention;
    return this;
  }

   /**
   * Determines whether PingFederate requires a unique signed JWT from the client for each action (relevant for PRIVATE_KEY_JWT authentication method) [true/false]
   * @return pingEnforceReplayPrevention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether PingFederate requires a unique signed JWT from the client for each action (relevant for PRIVATE_KEY_JWT authentication method) [true/false]")

  public String getPingEnforceReplayPrevention() {
    return pingEnforceReplayPrevention;
  }


  public void setPingEnforceReplayPrevention(String pingEnforceReplayPrevention) {
    this.pingEnforceReplayPrevention = pingEnforceReplayPrevention;
  }


  public GatewayCreateProducerPing pingGrantTypes(List<String> pingGrantTypes) {
    
    this.pingGrantTypes = pingGrantTypes;
    return this;
  }

  public GatewayCreateProducerPing addPingGrantTypesItem(String pingGrantTypesItem) {
    if (this.pingGrantTypes == null) {
      this.pingGrantTypes = new ArrayList<String>();
    }
    this.pingGrantTypes.add(pingGrantTypesItem);
    return this;
  }

   /**
   * List of OAuth client grant types [IMPLICIT, AUTHORIZATION_CODE, CLIENT_CREDENTIALS, TOKEN_EXCHANGE, REFRESH_TOKEN, ASSERTION_GRANTS, PASSWORD, RESOURCE_OWNER_CREDENTIALS]. If no explicit value is given, AUTHORIZATION_CODE will be selected as default.
   * @return pingGrantTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of OAuth client grant types [IMPLICIT, AUTHORIZATION_CODE, CLIENT_CREDENTIALS, TOKEN_EXCHANGE, REFRESH_TOKEN, ASSERTION_GRANTS, PASSWORD, RESOURCE_OWNER_CREDENTIALS]. If no explicit value is given, AUTHORIZATION_CODE will be selected as default.")

  public List<String> getPingGrantTypes() {
    return pingGrantTypes;
  }


  public void setPingGrantTypes(List<String> pingGrantTypes) {
    this.pingGrantTypes = pingGrantTypes;
  }


  public GatewayCreateProducerPing pingIssuerDn(String pingIssuerDn) {
    
    this.pingIssuerDn = pingIssuerDn;
    return this;
  }

   /**
   * Issuer DN of trusted CA certificate that imported into Ping Federate server. You may select \\\&quot;Trust Any\\\&quot; to trust all the existing issuers in Ping Federate server. Used in conjunction with ping-cert-subject-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method)
   * @return pingIssuerDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuer DN of trusted CA certificate that imported into Ping Federate server. You may select \\\"Trust Any\\\" to trust all the existing issuers in Ping Federate server. Used in conjunction with ping-cert-subject-dn (relevant for CLIENT_TLS_CERTIFICATE authentication method)")

  public String getPingIssuerDn() {
    return pingIssuerDn;
  }


  public void setPingIssuerDn(String pingIssuerDn) {
    this.pingIssuerDn = pingIssuerDn;
  }


  public GatewayCreateProducerPing pingJwks(String pingJwks) {
    
    this.pingJwks = pingJwks;
    return this;
  }

   /**
   * Base64-encoded JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT (Sign Algo: RS256) and return it as value (relevant for PRIVATE_KEY_JWT authentication method)
   * @return pingJwks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT (Sign Algo: RS256) and return it as value (relevant for PRIVATE_KEY_JWT authentication method)")

  public String getPingJwks() {
    return pingJwks;
  }


  public void setPingJwks(String pingJwks) {
    this.pingJwks = pingJwks;
  }


  public GatewayCreateProducerPing pingJwksUrl(String pingJwksUrl) {
    
    this.pingJwksUrl = pingJwksUrl;
    return this;
  }

   /**
   * The URL of the JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT and return it as value (relevant for PRIVATE_KEY_JWT authentication method)
   * @return pingJwksUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the JSON Web Key Set (JWKS). If no explicit value is given, the producer will create JWKs and matched signed JWT and return it as value (relevant for PRIVATE_KEY_JWT authentication method)")

  public String getPingJwksUrl() {
    return pingJwksUrl;
  }


  public void setPingJwksUrl(String pingJwksUrl) {
    this.pingJwksUrl = pingJwksUrl;
  }


  public GatewayCreateProducerPing pingPassword(String pingPassword) {
    
    this.pingPassword = pingPassword;
    return this;
  }

   /**
   * Ping Federate privileged user password
   * @return pingPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate privileged user password")

  public String getPingPassword() {
    return pingPassword;
  }


  public void setPingPassword(String pingPassword) {
    this.pingPassword = pingPassword;
  }


  public GatewayCreateProducerPing pingPrivilegedUser(String pingPrivilegedUser) {
    
    this.pingPrivilegedUser = pingPrivilegedUser;
    return this;
  }

   /**
   * Ping Federate privileged user
   * @return pingPrivilegedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping Federate privileged user")

  public String getPingPrivilegedUser() {
    return pingPrivilegedUser;
  }


  public void setPingPrivilegedUser(String pingPrivilegedUser) {
    this.pingPrivilegedUser = pingPrivilegedUser;
  }


  public GatewayCreateProducerPing pingRedirectUris(List<String> pingRedirectUris) {
    
    this.pingRedirectUris = pingRedirectUris;
    return this;
  }

  public GatewayCreateProducerPing addPingRedirectUrisItem(String pingRedirectUrisItem) {
    if (this.pingRedirectUris == null) {
      this.pingRedirectUris = new ArrayList<String>();
    }
    this.pingRedirectUris.add(pingRedirectUrisItem);
    return this;
  }

   /**
   * List of URIs to which the OAuth authorization server may redirect the resource owner&#39;s user agent after authorization is obtained. At least one redirection URI is required for the AUTHORIZATION_CODE and IMPLICIT grant types.
   * @return pingRedirectUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of URIs to which the OAuth authorization server may redirect the resource owner's user agent after authorization is obtained. At least one redirection URI is required for the AUTHORIZATION_CODE and IMPLICIT grant types.")

  public List<String> getPingRedirectUris() {
    return pingRedirectUris;
  }


  public void setPingRedirectUris(List<String> pingRedirectUris) {
    this.pingRedirectUris = pingRedirectUris;
  }


  public GatewayCreateProducerPing pingRestrictedScopes(List<String> pingRestrictedScopes) {
    
    this.pingRestrictedScopes = pingRestrictedScopes;
    return this;
  }

  public GatewayCreateProducerPing addPingRestrictedScopesItem(String pingRestrictedScopesItem) {
    if (this.pingRestrictedScopes == null) {
      this.pingRestrictedScopes = new ArrayList<String>();
    }
    this.pingRestrictedScopes.add(pingRestrictedScopesItem);
    return this;
  }

   /**
   * Limit the OAuth client to specific scopes list
   * @return pingRestrictedScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the OAuth client to specific scopes list")

  public List<String> getPingRestrictedScopes() {
    return pingRestrictedScopes;
  }


  public void setPingRestrictedScopes(List<String> pingRestrictedScopes) {
    this.pingRestrictedScopes = pingRestrictedScopes;
  }


  public GatewayCreateProducerPing pingSigningAlgo(String pingSigningAlgo) {
    
    this.pingSigningAlgo = pingSigningAlgo;
    return this;
  }

   /**
   * The signing algorithm that the client must use to sign its request objects [RS256,RS384,RS512,ES256,ES384,ES512,PS256,PS384,PS512] If no explicit value is given, the client can use any of the supported signing algorithms (relevant for PRIVATE_KEY_JWT authentication method)
   * @return pingSigningAlgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The signing algorithm that the client must use to sign its request objects [RS256,RS384,RS512,ES256,ES384,ES512,PS256,PS384,PS512] If no explicit value is given, the client can use any of the supported signing algorithms (relevant for PRIVATE_KEY_JWT authentication method)")

  public String getPingSigningAlgo() {
    return pingSigningAlgo;
  }


  public void setPingSigningAlgo(String pingSigningAlgo) {
    this.pingSigningAlgo = pingSigningAlgo;
  }


  public GatewayCreateProducerPing pingUrl(String pingUrl) {
    
    this.pingUrl = pingUrl;
    return this;
  }

   /**
   * Ping URL
   * @return pingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ping URL")

  public String getPingUrl() {
    return pingUrl;
  }


  public void setPingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
  }


  public GatewayCreateProducerPing producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayCreateProducerPing tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerPing addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayCreateProducerPing targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public GatewayCreateProducerPing token(String token) {
    
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


  public GatewayCreateProducerPing uidToken(String uidToken) {
    
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


  public GatewayCreateProducerPing userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * The time from dynamic secret creation to expiration.
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time from dynamic secret creation to expiration.")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerPing gatewayCreateProducerPing = (GatewayCreateProducerPing) o;
    return Objects.equals(this.deleteProtection, gatewayCreateProducerPing.deleteProtection) &&
        Objects.equals(this.json, gatewayCreateProducerPing.json) &&
        Objects.equals(this.name, gatewayCreateProducerPing.name) &&
        Objects.equals(this.pingAdministrativePort, gatewayCreateProducerPing.pingAdministrativePort) &&
        Objects.equals(this.pingAtmId, gatewayCreateProducerPing.pingAtmId) &&
        Objects.equals(this.pingAuthorizationPort, gatewayCreateProducerPing.pingAuthorizationPort) &&
        Objects.equals(this.pingCertSubjectDn, gatewayCreateProducerPing.pingCertSubjectDn) &&
        Objects.equals(this.pingClientAuthenticationType, gatewayCreateProducerPing.pingClientAuthenticationType) &&
        Objects.equals(this.pingEnforceReplayPrevention, gatewayCreateProducerPing.pingEnforceReplayPrevention) &&
        Objects.equals(this.pingGrantTypes, gatewayCreateProducerPing.pingGrantTypes) &&
        Objects.equals(this.pingIssuerDn, gatewayCreateProducerPing.pingIssuerDn) &&
        Objects.equals(this.pingJwks, gatewayCreateProducerPing.pingJwks) &&
        Objects.equals(this.pingJwksUrl, gatewayCreateProducerPing.pingJwksUrl) &&
        Objects.equals(this.pingPassword, gatewayCreateProducerPing.pingPassword) &&
        Objects.equals(this.pingPrivilegedUser, gatewayCreateProducerPing.pingPrivilegedUser) &&
        Objects.equals(this.pingRedirectUris, gatewayCreateProducerPing.pingRedirectUris) &&
        Objects.equals(this.pingRestrictedScopes, gatewayCreateProducerPing.pingRestrictedScopes) &&
        Objects.equals(this.pingSigningAlgo, gatewayCreateProducerPing.pingSigningAlgo) &&
        Objects.equals(this.pingUrl, gatewayCreateProducerPing.pingUrl) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerPing.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayCreateProducerPing.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerPing.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerPing.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerPing.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerPing.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, json, name, pingAdministrativePort, pingAtmId, pingAuthorizationPort, pingCertSubjectDn, pingClientAuthenticationType, pingEnforceReplayPrevention, pingGrantTypes, pingIssuerDn, pingJwks, pingJwksUrl, pingPassword, pingPrivilegedUser, pingRedirectUris, pingRestrictedScopes, pingSigningAlgo, pingUrl, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerPing {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pingAdministrativePort: ").append(toIndentedString(pingAdministrativePort)).append("\n");
    sb.append("    pingAtmId: ").append(toIndentedString(pingAtmId)).append("\n");
    sb.append("    pingAuthorizationPort: ").append(toIndentedString(pingAuthorizationPort)).append("\n");
    sb.append("    pingCertSubjectDn: ").append(toIndentedString(pingCertSubjectDn)).append("\n");
    sb.append("    pingClientAuthenticationType: ").append(toIndentedString(pingClientAuthenticationType)).append("\n");
    sb.append("    pingEnforceReplayPrevention: ").append(toIndentedString(pingEnforceReplayPrevention)).append("\n");
    sb.append("    pingGrantTypes: ").append(toIndentedString(pingGrantTypes)).append("\n");
    sb.append("    pingIssuerDn: ").append(toIndentedString(pingIssuerDn)).append("\n");
    sb.append("    pingJwks: ").append(toIndentedString(pingJwks)).append("\n");
    sb.append("    pingJwksUrl: ").append(toIndentedString(pingJwksUrl)).append("\n");
    sb.append("    pingPassword: ").append(toIndentedString(pingPassword)).append("\n");
    sb.append("    pingPrivilegedUser: ").append(toIndentedString(pingPrivilegedUser)).append("\n");
    sb.append("    pingRedirectUris: ").append(toIndentedString(pingRedirectUris)).append("\n");
    sb.append("    pingRestrictedScopes: ").append(toIndentedString(pingRestrictedScopes)).append("\n");
    sb.append("    pingSigningAlgo: ").append(toIndentedString(pingSigningAlgo)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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

