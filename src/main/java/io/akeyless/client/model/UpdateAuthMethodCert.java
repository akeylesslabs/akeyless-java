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
 * updateAuthMethodCert is a command that updates a new auth method that will be able to authenticate using a client certificae
 */
@ApiModel(description = "updateAuthMethodCert is a command that updates a new auth method that will be able to authenticate using a client certificae")

public class UpdateAuthMethodCert {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_BOUND_COMMON_NAMES = "bound-common-names";
  @SerializedName(SERIALIZED_NAME_BOUND_COMMON_NAMES)
  private List<String> boundCommonNames = null;

  public static final String SERIALIZED_NAME_BOUND_DNS_SANS = "bound-dns-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_DNS_SANS)
  private List<String> boundDnsSans = null;

  public static final String SERIALIZED_NAME_BOUND_EMAIL_SANS = "bound-email-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_EMAIL_SANS)
  private List<String> boundEmailSans = null;

  public static final String SERIALIZED_NAME_BOUND_EXTENSIONS = "bound-extensions";
  @SerializedName(SERIALIZED_NAME_BOUND_EXTENSIONS)
  private List<String> boundExtensions = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_ORGANIZATIONAL_UNITS = "bound-organizational-units";
  @SerializedName(SERIALIZED_NAME_BOUND_ORGANIZATIONAL_UNITS)
  private List<String> boundOrganizationalUnits = null;

  public static final String SERIALIZED_NAME_BOUND_URI_SANS = "bound-uri-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_URI_SANS)
  private List<String> boundUriSans = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_DATA = "certificate-data";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA)
  private String certificateData;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_REVOKED_CERT_IDS = "revoked-cert-ids";
  @SerializedName(SERIALIZED_NAME_REVOKED_CERT_IDS)
  private List<String> revokedCertIds = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public UpdateAuthMethodCert accessExpires(Long accessExpires) {
    
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


  public UpdateAuthMethodCert boundCommonNames(List<String> boundCommonNames) {
    
    this.boundCommonNames = boundCommonNames;
    return this;
  }

  public UpdateAuthMethodCert addBoundCommonNamesItem(String boundCommonNamesItem) {
    if (this.boundCommonNames == null) {
      this.boundCommonNames = new ArrayList<String>();
    }
    this.boundCommonNames.add(boundCommonNamesItem);
    return this;
  }

   /**
   * A list of names. At least one must exist in the Common Name. Supports globbing.
   * @return boundCommonNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of names. At least one must exist in the Common Name. Supports globbing.")

  public List<String> getBoundCommonNames() {
    return boundCommonNames;
  }


  public void setBoundCommonNames(List<String> boundCommonNames) {
    this.boundCommonNames = boundCommonNames;
  }


  public UpdateAuthMethodCert boundDnsSans(List<String> boundDnsSans) {
    
    this.boundDnsSans = boundDnsSans;
    return this;
  }

  public UpdateAuthMethodCert addBoundDnsSansItem(String boundDnsSansItem) {
    if (this.boundDnsSans == null) {
      this.boundDnsSans = new ArrayList<String>();
    }
    this.boundDnsSans.add(boundDnsSansItem);
    return this;
  }

   /**
   * A list of DNS names. At least one must exist in the SANs. Supports globbing.
   * @return boundDnsSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS names. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundDnsSans() {
    return boundDnsSans;
  }


  public void setBoundDnsSans(List<String> boundDnsSans) {
    this.boundDnsSans = boundDnsSans;
  }


  public UpdateAuthMethodCert boundEmailSans(List<String> boundEmailSans) {
    
    this.boundEmailSans = boundEmailSans;
    return this;
  }

  public UpdateAuthMethodCert addBoundEmailSansItem(String boundEmailSansItem) {
    if (this.boundEmailSans == null) {
      this.boundEmailSans = new ArrayList<String>();
    }
    this.boundEmailSans.add(boundEmailSansItem);
    return this;
  }

   /**
   * A list of Email Addresses. At least one must exist in the SANs. Supports globbing.
   * @return boundEmailSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Email Addresses. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundEmailSans() {
    return boundEmailSans;
  }


  public void setBoundEmailSans(List<String> boundEmailSans) {
    this.boundEmailSans = boundEmailSans;
  }


  public UpdateAuthMethodCert boundExtensions(List<String> boundExtensions) {
    
    this.boundExtensions = boundExtensions;
    return this;
  }

  public UpdateAuthMethodCert addBoundExtensionsItem(String boundExtensionsItem) {
    if (this.boundExtensions == null) {
      this.boundExtensions = new ArrayList<String>();
    }
    this.boundExtensions.add(boundExtensionsItem);
    return this;
  }

   /**
   * A list of extensions formatted as \&quot;oid:value\&quot;. Expects the extension value to be some type of ASN1 encoded string. All values much match. Supports globbing on \&quot;value\&quot;.
   * @return boundExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of extensions formatted as \"oid:value\". Expects the extension value to be some type of ASN1 encoded string. All values much match. Supports globbing on \"value\".")

  public List<String> getBoundExtensions() {
    return boundExtensions;
  }


  public void setBoundExtensions(List<String> boundExtensions) {
    this.boundExtensions = boundExtensions;
  }


  public UpdateAuthMethodCert boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public UpdateAuthMethodCert addBoundIpsItem(String boundIpsItem) {
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


  public UpdateAuthMethodCert boundOrganizationalUnits(List<String> boundOrganizationalUnits) {
    
    this.boundOrganizationalUnits = boundOrganizationalUnits;
    return this;
  }

  public UpdateAuthMethodCert addBoundOrganizationalUnitsItem(String boundOrganizationalUnitsItem) {
    if (this.boundOrganizationalUnits == null) {
      this.boundOrganizationalUnits = new ArrayList<String>();
    }
    this.boundOrganizationalUnits.add(boundOrganizationalUnitsItem);
    return this;
  }

   /**
   * A list of Organizational Units names. At least one must exist in the OU field.
   * @return boundOrganizationalUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Organizational Units names. At least one must exist in the OU field.")

  public List<String> getBoundOrganizationalUnits() {
    return boundOrganizationalUnits;
  }


  public void setBoundOrganizationalUnits(List<String> boundOrganizationalUnits) {
    this.boundOrganizationalUnits = boundOrganizationalUnits;
  }


  public UpdateAuthMethodCert boundUriSans(List<String> boundUriSans) {
    
    this.boundUriSans = boundUriSans;
    return this;
  }

  public UpdateAuthMethodCert addBoundUriSansItem(String boundUriSansItem) {
    if (this.boundUriSans == null) {
      this.boundUriSans = new ArrayList<String>();
    }
    this.boundUriSans.add(boundUriSansItem);
    return this;
  }

   /**
   * A list of URIs. At least one must exist in the SANs. Supports globbing.
   * @return boundUriSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of URIs. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundUriSans() {
    return boundUriSans;
  }


  public void setBoundUriSans(List<String> boundUriSans) {
    this.boundUriSans = boundUriSans;
  }


  public UpdateAuthMethodCert certificateData(String certificateData) {
    
    this.certificateData = certificateData;
    return this;
  }

   /**
   * The certificate data in base64, if no file was provided
   * @return certificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The certificate data in base64, if no file was provided")

  public String getCertificateData() {
    return certificateData;
  }


  public void setCertificateData(String certificateData) {
    this.certificateData = certificateData;
  }


  public UpdateAuthMethodCert forceSubClaims(Boolean forceSubClaims) {
    
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


  public UpdateAuthMethodCert gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public UpdateAuthMethodCert addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public UpdateAuthMethodCert json(Boolean json) {
    
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


  public UpdateAuthMethodCert jwtTtl(Long jwtTtl) {
    
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


  public UpdateAuthMethodCert name(String name) {
    
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


  public UpdateAuthMethodCert newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Auth Method new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateAuthMethodCert revokedCertIds(List<String> revokedCertIds) {
    
    this.revokedCertIds = revokedCertIds;
    return this;
  }

  public UpdateAuthMethodCert addRevokedCertIdsItem(String revokedCertIdsItem) {
    if (this.revokedCertIds == null) {
      this.revokedCertIds = new ArrayList<String>();
    }
    this.revokedCertIds.add(revokedCertIdsItem);
    return this;
  }

   /**
   * A list of revoked cert ids
   * @return revokedCertIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of revoked cert ids")

  public List<String> getRevokedCertIds() {
    return revokedCertIds;
  }


  public void setRevokedCertIds(List<String> revokedCertIds) {
    this.revokedCertIds = revokedCertIds;
  }


  public UpdateAuthMethodCert token(String token) {
    
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


  public UpdateAuthMethodCert uidToken(String uidToken) {
    
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


  public UpdateAuthMethodCert uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured, such as common_name or organizational_unit Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A unique identifier (ID) value should be configured, such as common_name or organizational_unit Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

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
    UpdateAuthMethodCert updateAuthMethodCert = (UpdateAuthMethodCert) o;
    return Objects.equals(this.accessExpires, updateAuthMethodCert.accessExpires) &&
        Objects.equals(this.boundCommonNames, updateAuthMethodCert.boundCommonNames) &&
        Objects.equals(this.boundDnsSans, updateAuthMethodCert.boundDnsSans) &&
        Objects.equals(this.boundEmailSans, updateAuthMethodCert.boundEmailSans) &&
        Objects.equals(this.boundExtensions, updateAuthMethodCert.boundExtensions) &&
        Objects.equals(this.boundIps, updateAuthMethodCert.boundIps) &&
        Objects.equals(this.boundOrganizationalUnits, updateAuthMethodCert.boundOrganizationalUnits) &&
        Objects.equals(this.boundUriSans, updateAuthMethodCert.boundUriSans) &&
        Objects.equals(this.certificateData, updateAuthMethodCert.certificateData) &&
        Objects.equals(this.forceSubClaims, updateAuthMethodCert.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, updateAuthMethodCert.gwBoundIps) &&
        Objects.equals(this.json, updateAuthMethodCert.json) &&
        Objects.equals(this.jwtTtl, updateAuthMethodCert.jwtTtl) &&
        Objects.equals(this.name, updateAuthMethodCert.name) &&
        Objects.equals(this.newName, updateAuthMethodCert.newName) &&
        Objects.equals(this.revokedCertIds, updateAuthMethodCert.revokedCertIds) &&
        Objects.equals(this.token, updateAuthMethodCert.token) &&
        Objects.equals(this.uidToken, updateAuthMethodCert.uidToken) &&
        Objects.equals(this.uniqueIdentifier, updateAuthMethodCert.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, boundCommonNames, boundDnsSans, boundEmailSans, boundExtensions, boundIps, boundOrganizationalUnits, boundUriSans, certificateData, forceSubClaims, gwBoundIps, json, jwtTtl, name, newName, revokedCertIds, token, uidToken, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthMethodCert {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    boundCommonNames: ").append(toIndentedString(boundCommonNames)).append("\n");
    sb.append("    boundDnsSans: ").append(toIndentedString(boundDnsSans)).append("\n");
    sb.append("    boundEmailSans: ").append(toIndentedString(boundEmailSans)).append("\n");
    sb.append("    boundExtensions: ").append(toIndentedString(boundExtensions)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundOrganizationalUnits: ").append(toIndentedString(boundOrganizationalUnits)).append("\n");
    sb.append("    boundUriSans: ").append(toIndentedString(boundUriSans)).append("\n");
    sb.append("    certificateData: ").append(toIndentedString(certificateData)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    revokedCertIds: ").append(toIndentedString(revokedCertIds)).append("\n");
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

