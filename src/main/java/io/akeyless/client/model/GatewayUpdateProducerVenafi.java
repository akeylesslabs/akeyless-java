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
 * gatewayUpdateProducerVenafi is a command that updates a Venafi dynamic secret producer to dynamically update certificates generated by Venafi or have Akeyless generated certificates using PKI be monitored by Venafi [Deprecated: Use dynamic-secret-update-venafi command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateProducerVenafi {
  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin-rotation-interval-days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  @javax.annotation.Nullable
  private Long adminRotationIntervalDays = 0l;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow-subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  @javax.annotation.Nullable
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed-domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  @javax.annotation.Nullable
  private List<String> allowedDomains = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_GENERATED_FOLDER = "auto-generated-folder";
  @SerializedName(SERIALIZED_NAME_AUTO_GENERATED_FOLDER)
  @javax.annotation.Nullable
  private String autoGeneratedFolder;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  @javax.annotation.Nullable
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_ROOT_FIRST_IN_CHAIN = "root-first-in-chain";
  @SerializedName(SERIALIZED_NAME_ROOT_FIRST_IN_CHAIN)
  @javax.annotation.Nullable
  private Boolean rootFirstInChain;

  public static final String SERIALIZED_NAME_SIGN_USING_AKEYLESS_PKI = "sign-using-akeyless-pki";
  @SerializedName(SERIALIZED_NAME_SIGN_USING_AKEYLESS_PKI)
  @javax.annotation.Nullable
  private Boolean signUsingAkeylessPki;

  public static final String SERIALIZED_NAME_SIGNER_KEY_NAME = "signer-key-name";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_NAME)
  @javax.annotation.Nullable
  private String signerKeyName;

  public static final String SERIALIZED_NAME_STORE_PRIVATE_KEY = "store-private-key";
  @SerializedName(SERIALIZED_NAME_STORE_PRIVATE_KEY)
  @javax.annotation.Nullable
  private Boolean storePrivateKey;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "2160h";

  public static final String SERIALIZED_NAME_VENAFI_ACCESS_TOKEN = "venafi-access-token";
  @SerializedName(SERIALIZED_NAME_VENAFI_ACCESS_TOKEN)
  @javax.annotation.Nullable
  private String venafiAccessToken;

  public static final String SERIALIZED_NAME_VENAFI_API_KEY = "venafi-api-key";
  @SerializedName(SERIALIZED_NAME_VENAFI_API_KEY)
  @javax.annotation.Nullable
  private String venafiApiKey;

  public static final String SERIALIZED_NAME_VENAFI_BASEURL = "venafi-baseurl";
  @SerializedName(SERIALIZED_NAME_VENAFI_BASEURL)
  @javax.annotation.Nullable
  private String venafiBaseurl;

  public static final String SERIALIZED_NAME_VENAFI_CLIENT_ID = "venafi-client-id";
  @SerializedName(SERIALIZED_NAME_VENAFI_CLIENT_ID)
  @javax.annotation.Nullable
  private String venafiClientId = "akeyless";

  public static final String SERIALIZED_NAME_VENAFI_REFRESH_TOKEN = "venafi-refresh-token";
  @SerializedName(SERIALIZED_NAME_VENAFI_REFRESH_TOKEN)
  @javax.annotation.Nullable
  private String venafiRefreshToken;

  public static final String SERIALIZED_NAME_VENAFI_USE_TPP = "venafi-use-tpp";
  @SerializedName(SERIALIZED_NAME_VENAFI_USE_TPP)
  @javax.annotation.Nullable
  private Boolean venafiUseTpp;

  public static final String SERIALIZED_NAME_VENAFI_ZONE = "venafi-zone";
  @SerializedName(SERIALIZED_NAME_VENAFI_ZONE)
  @javax.annotation.Nullable
  private String venafiZone;

  public GatewayUpdateProducerVenafi() {
  }

  public GatewayUpdateProducerVenafi adminRotationIntervalDays(@javax.annotation.Nullable Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

  /**
   * Admin credentials rotation interval (days)
   * @return adminRotationIntervalDays
   */
  @javax.annotation.Nullable
  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }

  public void setAdminRotationIntervalDays(@javax.annotation.Nullable Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public GatewayUpdateProducerVenafi allowSubdomains(@javax.annotation.Nullable Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
    return this;
  }

  /**
   * Allow subdomains
   * @return allowSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }

  public void setAllowSubdomains(@javax.annotation.Nullable Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  public GatewayUpdateProducerVenafi allowedDomains(@javax.annotation.Nullable List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GatewayUpdateProducerVenafi addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new ArrayList<>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

  /**
   * Allowed domains
   * @return allowedDomains
   */
  @javax.annotation.Nullable
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  public void setAllowedDomains(@javax.annotation.Nullable List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  public GatewayUpdateProducerVenafi autoGeneratedFolder(@javax.annotation.Nullable String autoGeneratedFolder) {
    this.autoGeneratedFolder = autoGeneratedFolder;
    return this;
  }

  /**
   * Auto generated folder
   * @return autoGeneratedFolder
   */
  @javax.annotation.Nullable
  public String getAutoGeneratedFolder() {
    return autoGeneratedFolder;
  }

  public void setAutoGeneratedFolder(@javax.annotation.Nullable String autoGeneratedFolder) {
    this.autoGeneratedFolder = autoGeneratedFolder;
  }


  public GatewayUpdateProducerVenafi deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public GatewayUpdateProducerVenafi enableAdminRotation(@javax.annotation.Nullable Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

  /**
   * Automatic admin credentials rotation
   * @return enableAdminRotation
   */
  @javax.annotation.Nullable
  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }

  public void setEnableAdminRotation(@javax.annotation.Nullable Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public GatewayUpdateProducerVenafi json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayUpdateProducerVenafi name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GatewayUpdateProducerVenafi newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Dynamic secret name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerVenafi producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayUpdateProducerVenafi rootFirstInChain(@javax.annotation.Nullable Boolean rootFirstInChain) {
    this.rootFirstInChain = rootFirstInChain;
    return this;
  }

  /**
   * Root first in chain
   * @return rootFirstInChain
   */
  @javax.annotation.Nullable
  public Boolean getRootFirstInChain() {
    return rootFirstInChain;
  }

  public void setRootFirstInChain(@javax.annotation.Nullable Boolean rootFirstInChain) {
    this.rootFirstInChain = rootFirstInChain;
  }


  public GatewayUpdateProducerVenafi signUsingAkeylessPki(@javax.annotation.Nullable Boolean signUsingAkeylessPki) {
    this.signUsingAkeylessPki = signUsingAkeylessPki;
    return this;
  }

  /**
   * Use Akeyless PKI issuer or Venafi issuer
   * @return signUsingAkeylessPki
   */
  @javax.annotation.Nullable
  public Boolean getSignUsingAkeylessPki() {
    return signUsingAkeylessPki;
  }

  public void setSignUsingAkeylessPki(@javax.annotation.Nullable Boolean signUsingAkeylessPki) {
    this.signUsingAkeylessPki = signUsingAkeylessPki;
  }


  public GatewayUpdateProducerVenafi signerKeyName(@javax.annotation.Nullable String signerKeyName) {
    this.signerKeyName = signerKeyName;
    return this;
  }

  /**
   * Signer key name
   * @return signerKeyName
   */
  @javax.annotation.Nullable
  public String getSignerKeyName() {
    return signerKeyName;
  }

  public void setSignerKeyName(@javax.annotation.Nullable String signerKeyName) {
    this.signerKeyName = signerKeyName;
  }


  public GatewayUpdateProducerVenafi storePrivateKey(@javax.annotation.Nullable Boolean storePrivateKey) {
    this.storePrivateKey = storePrivateKey;
    return this;
  }

  /**
   * Store private key
   * @return storePrivateKey
   */
  @javax.annotation.Nullable
  public Boolean getStorePrivateKey() {
    return storePrivateKey;
  }

  public void setStorePrivateKey(@javax.annotation.Nullable Boolean storePrivateKey) {
    this.storePrivateKey = storePrivateKey;
  }


  public GatewayUpdateProducerVenafi tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerVenafi addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public GatewayUpdateProducerVenafi targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public GatewayUpdateProducerVenafi token(@javax.annotation.Nullable String token) {
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


  public GatewayUpdateProducerVenafi uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GatewayUpdateProducerVenafi userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL in time.Duration format (2160h / 129600m / etc...). When using sign-using-akeyless-pki certificates created will have this validity period, otherwise the user-ttl is taken from the Validity Period field of the Zone&#39;s&#39; Issuing Template. When using cert-manager it is advised to have a TTL of above 60 days (1440h). For more information - https://cert-manager.io/docs/usage/certificate/
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
  }


  public GatewayUpdateProducerVenafi venafiAccessToken(@javax.annotation.Nullable String venafiAccessToken) {
    this.venafiAccessToken = venafiAccessToken;
    return this;
  }

  /**
   * Venafi Access Token to use to access the TPP environment (Relevant when using TPP)
   * @return venafiAccessToken
   */
  @javax.annotation.Nullable
  public String getVenafiAccessToken() {
    return venafiAccessToken;
  }

  public void setVenafiAccessToken(@javax.annotation.Nullable String venafiAccessToken) {
    this.venafiAccessToken = venafiAccessToken;
  }


  public GatewayUpdateProducerVenafi venafiApiKey(@javax.annotation.Nullable String venafiApiKey) {
    this.venafiApiKey = venafiApiKey;
    return this;
  }

  /**
   * Venafi API key
   * @return venafiApiKey
   */
  @javax.annotation.Nullable
  public String getVenafiApiKey() {
    return venafiApiKey;
  }

  public void setVenafiApiKey(@javax.annotation.Nullable String venafiApiKey) {
    this.venafiApiKey = venafiApiKey;
  }


  public GatewayUpdateProducerVenafi venafiBaseurl(@javax.annotation.Nullable String venafiBaseurl) {
    this.venafiBaseurl = venafiBaseurl;
    return this;
  }

  /**
   * Venafi Baseurl
   * @return venafiBaseurl
   */
  @javax.annotation.Nullable
  public String getVenafiBaseurl() {
    return venafiBaseurl;
  }

  public void setVenafiBaseurl(@javax.annotation.Nullable String venafiBaseurl) {
    this.venafiBaseurl = venafiBaseurl;
  }


  public GatewayUpdateProducerVenafi venafiClientId(@javax.annotation.Nullable String venafiClientId) {
    this.venafiClientId = venafiClientId;
    return this;
  }

  /**
   * Venafi Client ID that was used when the access token was generated
   * @return venafiClientId
   */
  @javax.annotation.Nullable
  public String getVenafiClientId() {
    return venafiClientId;
  }

  public void setVenafiClientId(@javax.annotation.Nullable String venafiClientId) {
    this.venafiClientId = venafiClientId;
  }


  public GatewayUpdateProducerVenafi venafiRefreshToken(@javax.annotation.Nullable String venafiRefreshToken) {
    this.venafiRefreshToken = venafiRefreshToken;
    return this;
  }

  /**
   * Venafi Refresh Token to use when the Access Token is expired (Relevant when using TPP)
   * @return venafiRefreshToken
   */
  @javax.annotation.Nullable
  public String getVenafiRefreshToken() {
    return venafiRefreshToken;
  }

  public void setVenafiRefreshToken(@javax.annotation.Nullable String venafiRefreshToken) {
    this.venafiRefreshToken = venafiRefreshToken;
  }


  public GatewayUpdateProducerVenafi venafiUseTpp(@javax.annotation.Nullable Boolean venafiUseTpp) {
    this.venafiUseTpp = venafiUseTpp;
    return this;
  }

  /**
   * Venafi using TPP
   * @return venafiUseTpp
   */
  @javax.annotation.Nullable
  public Boolean getVenafiUseTpp() {
    return venafiUseTpp;
  }

  public void setVenafiUseTpp(@javax.annotation.Nullable Boolean venafiUseTpp) {
    this.venafiUseTpp = venafiUseTpp;
  }


  public GatewayUpdateProducerVenafi venafiZone(@javax.annotation.Nullable String venafiZone) {
    this.venafiZone = venafiZone;
    return this;
  }

  /**
   * Venafi Zone
   * @return venafiZone
   */
  @javax.annotation.Nullable
  public String getVenafiZone() {
    return venafiZone;
  }

  public void setVenafiZone(@javax.annotation.Nullable String venafiZone) {
    this.venafiZone = venafiZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateProducerVenafi gatewayUpdateProducerVenafi = (GatewayUpdateProducerVenafi) o;
    return Objects.equals(this.adminRotationIntervalDays, gatewayUpdateProducerVenafi.adminRotationIntervalDays) &&
        Objects.equals(this.allowSubdomains, gatewayUpdateProducerVenafi.allowSubdomains) &&
        Objects.equals(this.allowedDomains, gatewayUpdateProducerVenafi.allowedDomains) &&
        Objects.equals(this.autoGeneratedFolder, gatewayUpdateProducerVenafi.autoGeneratedFolder) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerVenafi.deleteProtection) &&
        Objects.equals(this.enableAdminRotation, gatewayUpdateProducerVenafi.enableAdminRotation) &&
        Objects.equals(this.json, gatewayUpdateProducerVenafi.json) &&
        Objects.equals(this.name, gatewayUpdateProducerVenafi.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerVenafi.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerVenafi.producerEncryptionKeyName) &&
        Objects.equals(this.rootFirstInChain, gatewayUpdateProducerVenafi.rootFirstInChain) &&
        Objects.equals(this.signUsingAkeylessPki, gatewayUpdateProducerVenafi.signUsingAkeylessPki) &&
        Objects.equals(this.signerKeyName, gatewayUpdateProducerVenafi.signerKeyName) &&
        Objects.equals(this.storePrivateKey, gatewayUpdateProducerVenafi.storePrivateKey) &&
        Objects.equals(this.tags, gatewayUpdateProducerVenafi.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerVenafi.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerVenafi.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerVenafi.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerVenafi.userTtl) &&
        Objects.equals(this.venafiAccessToken, gatewayUpdateProducerVenafi.venafiAccessToken) &&
        Objects.equals(this.venafiApiKey, gatewayUpdateProducerVenafi.venafiApiKey) &&
        Objects.equals(this.venafiBaseurl, gatewayUpdateProducerVenafi.venafiBaseurl) &&
        Objects.equals(this.venafiClientId, gatewayUpdateProducerVenafi.venafiClientId) &&
        Objects.equals(this.venafiRefreshToken, gatewayUpdateProducerVenafi.venafiRefreshToken) &&
        Objects.equals(this.venafiUseTpp, gatewayUpdateProducerVenafi.venafiUseTpp) &&
        Objects.equals(this.venafiZone, gatewayUpdateProducerVenafi.venafiZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminRotationIntervalDays, allowSubdomains, allowedDomains, autoGeneratedFolder, deleteProtection, enableAdminRotation, json, name, newName, producerEncryptionKeyName, rootFirstInChain, signUsingAkeylessPki, signerKeyName, storePrivateKey, tags, targetName, token, uidToken, userTtl, venafiAccessToken, venafiApiKey, venafiBaseurl, venafiClientId, venafiRefreshToken, venafiUseTpp, venafiZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerVenafi {\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    autoGeneratedFolder: ").append(toIndentedString(autoGeneratedFolder)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    rootFirstInChain: ").append(toIndentedString(rootFirstInChain)).append("\n");
    sb.append("    signUsingAkeylessPki: ").append(toIndentedString(signUsingAkeylessPki)).append("\n");
    sb.append("    signerKeyName: ").append(toIndentedString(signerKeyName)).append("\n");
    sb.append("    storePrivateKey: ").append(toIndentedString(storePrivateKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("    venafiAccessToken: ").append(toIndentedString(venafiAccessToken)).append("\n");
    sb.append("    venafiApiKey: ").append(toIndentedString(venafiApiKey)).append("\n");
    sb.append("    venafiBaseurl: ").append(toIndentedString(venafiBaseurl)).append("\n");
    sb.append("    venafiClientId: ").append(toIndentedString(venafiClientId)).append("\n");
    sb.append("    venafiRefreshToken: ").append(toIndentedString(venafiRefreshToken)).append("\n");
    sb.append("    venafiUseTpp: ").append(toIndentedString(venafiUseTpp)).append("\n");
    sb.append("    venafiZone: ").append(toIndentedString(venafiZone)).append("\n");
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
    openapiFields.add("admin-rotation-interval-days");
    openapiFields.add("allow-subdomains");
    openapiFields.add("allowed-domains");
    openapiFields.add("auto-generated-folder");
    openapiFields.add("delete_protection");
    openapiFields.add("enable-admin-rotation");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("root-first-in-chain");
    openapiFields.add("sign-using-akeyless-pki");
    openapiFields.add("signer-key-name");
    openapiFields.add("store-private-key");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");
    openapiFields.add("venafi-access-token");
    openapiFields.add("venafi-api-key");
    openapiFields.add("venafi-baseurl");
    openapiFields.add("venafi-client-id");
    openapiFields.add("venafi-refresh-token");
    openapiFields.add("venafi-use-tpp");
    openapiFields.add("venafi-zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateProducerVenafi
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateProducerVenafi.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateProducerVenafi is not found in the empty JSON string", GatewayUpdateProducerVenafi.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateProducerVenafi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateProducerVenafi` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayUpdateProducerVenafi.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed-domains") != null && !jsonObj.get("allowed-domains").isJsonNull() && !jsonObj.get("allowed-domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed-domains` to be an array in the JSON string but got `%s`", jsonObj.get("allowed-domains").toString()));
      }
      if ((jsonObj.get("auto-generated-folder") != null && !jsonObj.get("auto-generated-folder").isJsonNull()) && !jsonObj.get("auto-generated-folder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto-generated-folder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auto-generated-folder").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if ((jsonObj.get("signer-key-name") != null && !jsonObj.get("signer-key-name").isJsonNull()) && !jsonObj.get("signer-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signer-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signer-key-name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
      if ((jsonObj.get("venafi-access-token") != null && !jsonObj.get("venafi-access-token").isJsonNull()) && !jsonObj.get("venafi-access-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-access-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-access-token").toString()));
      }
      if ((jsonObj.get("venafi-api-key") != null && !jsonObj.get("venafi-api-key").isJsonNull()) && !jsonObj.get("venafi-api-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-api-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-api-key").toString()));
      }
      if ((jsonObj.get("venafi-baseurl") != null && !jsonObj.get("venafi-baseurl").isJsonNull()) && !jsonObj.get("venafi-baseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-baseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-baseurl").toString()));
      }
      if ((jsonObj.get("venafi-client-id") != null && !jsonObj.get("venafi-client-id").isJsonNull()) && !jsonObj.get("venafi-client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-client-id").toString()));
      }
      if ((jsonObj.get("venafi-refresh-token") != null && !jsonObj.get("venafi-refresh-token").isJsonNull()) && !jsonObj.get("venafi-refresh-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-refresh-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-refresh-token").toString()));
      }
      if ((jsonObj.get("venafi-zone") != null && !jsonObj.get("venafi-zone").isJsonNull()) && !jsonObj.get("venafi-zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `venafi-zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("venafi-zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayUpdateProducerVenafi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateProducerVenafi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateProducerVenafi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateProducerVenafi.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateProducerVenafi>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateProducerVenafi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateProducerVenafi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateProducerVenafi given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateProducerVenafi
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateProducerVenafi
   */
  public static GatewayUpdateProducerVenafi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateProducerVenafi.class);
  }

  /**
   * Convert an instance of GatewayUpdateProducerVenafi to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

