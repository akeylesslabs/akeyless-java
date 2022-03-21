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
 * CreatePKICertIssuer
 */

public class CreatePKICertIssuer {
  public static final String SERIALIZED_NAME_ALLOW_ANY_NAME = "allow-any-name";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_NAME)
  private Boolean allowAnyName;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow-subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed-domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private String allowedDomains;

  public static final String SERIALIZED_NAME_ALLOWED_URI_SANS = "allowed-uri-sans";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URI_SANS)
  private String allowedUriSans;

  public static final String SERIALIZED_NAME_CLIENT_FLAG = "client-flag";
  @SerializedName(SERIALIZED_NAME_CLIENT_FLAG)
  private Boolean clientFlag;

  public static final String SERIALIZED_NAME_CODE_SIGNING_FLAG = "code-signing-flag";
  @SerializedName(SERIALIZED_NAME_CODE_SIGNING_FLAG)
  private Boolean codeSigningFlag;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_KEY_USAGE = "key-usage";
  @SerializedName(SERIALIZED_NAME_KEY_USAGE)
  private String keyUsage = "DigitalSignature,KeyAgreement,KeyEncipherment";

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOT_ENFORCE_HOSTNAMES = "not-enforce-hostnames";
  @SerializedName(SERIALIZED_NAME_NOT_ENFORCE_HOSTNAMES)
  private Boolean notEnforceHostnames;

  public static final String SERIALIZED_NAME_NOT_REQUIRE_CN = "not-require-cn";
  @SerializedName(SERIALIZED_NAME_NOT_REQUIRE_CN)
  private Boolean notRequireCn;

  public static final String SERIALIZED_NAME_ORGANIZATIONAL_UNITS = "organizational-units";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONAL_UNITS)
  private String organizationalUnits;

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private String organizations;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal-code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_SERVER_FLAG = "server-flag";
  @SerializedName(SERIALIZED_NAME_SERVER_FLAG)
  private Boolean serverFlag;

  public static final String SERIALIZED_NAME_SIGNER_KEY_NAME = "signer-key-name";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_NAME)
  private String signerKeyName;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "street-address";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public CreatePKICertIssuer allowAnyName(Boolean allowAnyName) {
    
    this.allowAnyName = allowAnyName;
    return this;
  }

   /**
   * If set, clients can request certificates for any CN
   * @return allowAnyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, clients can request certificates for any CN")

  public Boolean getAllowAnyName() {
    return allowAnyName;
  }


  public void setAllowAnyName(Boolean allowAnyName) {
    this.allowAnyName = allowAnyName;
  }


  public CreatePKICertIssuer allowSubdomains(Boolean allowSubdomains) {
    
    this.allowSubdomains = allowSubdomains;
    return this;
  }

   /**
   * If set, clients can request certificates for subdomains and wildcard subdomains of the allowed domains
   * @return allowSubdomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, clients can request certificates for subdomains and wildcard subdomains of the allowed domains")

  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }


  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  public CreatePKICertIssuer allowedDomains(String allowedDomains) {
    
    this.allowedDomains = allowedDomains;
    return this;
  }

   /**
   * A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list)
   * @return allowedDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the allowed domains that clients can request to be included in the certificate (in a comma-delimited list)")

  public String getAllowedDomains() {
    return allowedDomains;
  }


  public void setAllowedDomains(String allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  public CreatePKICertIssuer allowedUriSans(String allowedUriSans) {
    
    this.allowedUriSans = allowedUriSans;
    return this;
  }

   /**
   * A list of the allowed URIs that clients can request to be included in the certificate as part of the URI Subject Alternative Names (in a comma-delimited list)
   * @return allowedUriSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the allowed URIs that clients can request to be included in the certificate as part of the URI Subject Alternative Names (in a comma-delimited list)")

  public String getAllowedUriSans() {
    return allowedUriSans;
  }


  public void setAllowedUriSans(String allowedUriSans) {
    this.allowedUriSans = allowedUriSans;
  }


  public CreatePKICertIssuer clientFlag(Boolean clientFlag) {
    
    this.clientFlag = clientFlag;
    return this;
  }

   /**
   * If set, certificates will be flagged for client auth use
   * @return clientFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, certificates will be flagged for client auth use")

  public Boolean getClientFlag() {
    return clientFlag;
  }


  public void setClientFlag(Boolean clientFlag) {
    this.clientFlag = clientFlag;
  }


  public CreatePKICertIssuer codeSigningFlag(Boolean codeSigningFlag) {
    
    this.codeSigningFlag = codeSigningFlag;
    return this;
  }

   /**
   * If set, certificates will be flagged for code signing use
   * @return codeSigningFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, certificates will be flagged for code signing use")

  public Boolean getCodeSigningFlag() {
    return codeSigningFlag;
  }


  public void setCodeSigningFlag(Boolean codeSigningFlag) {
    this.codeSigningFlag = codeSigningFlag;
  }


  public CreatePKICertIssuer country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * A comma-separated list of the country that will be set in the issued certificate
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of the country that will be set in the issued certificate")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CreatePKICertIssuer keyUsage(String keyUsage) {
    
    this.keyUsage = keyUsage;
    return this;
  }

   /**
   * key-usage
   * @return keyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "key-usage")

  public String getKeyUsage() {
    return keyUsage;
  }


  public void setKeyUsage(String keyUsage) {
    this.keyUsage = keyUsage;
  }


  public CreatePKICertIssuer locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * A comma-separated list of the locality that will be set in the issued certificate
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of the locality that will be set in the issued certificate")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public CreatePKICertIssuer metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A metadata about the issuer
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A metadata about the issuer")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreatePKICertIssuer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * PKI certificate issuer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "PKI certificate issuer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreatePKICertIssuer notEnforceHostnames(Boolean notEnforceHostnames) {
    
    this.notEnforceHostnames = notEnforceHostnames;
    return this;
  }

   /**
   * If set, any names are allowed for CN and SANs in the certificate and not only a valid host name
   * @return notEnforceHostnames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, any names are allowed for CN and SANs in the certificate and not only a valid host name")

  public Boolean getNotEnforceHostnames() {
    return notEnforceHostnames;
  }


  public void setNotEnforceHostnames(Boolean notEnforceHostnames) {
    this.notEnforceHostnames = notEnforceHostnames;
  }


  public CreatePKICertIssuer notRequireCn(Boolean notRequireCn) {
    
    this.notRequireCn = notRequireCn;
    return this;
  }

   /**
   * If set, clients can request certificates without a CN
   * @return notRequireCn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, clients can request certificates without a CN")

  public Boolean getNotRequireCn() {
    return notRequireCn;
  }


  public void setNotRequireCn(Boolean notRequireCn) {
    this.notRequireCn = notRequireCn;
  }


  public CreatePKICertIssuer organizationalUnits(String organizationalUnits) {
    
    this.organizationalUnits = organizationalUnits;
    return this;
  }

   /**
   * A comma-separated list of organizational units (OU) that will be set in the issued certificate
   * @return organizationalUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of organizational units (OU) that will be set in the issued certificate")

  public String getOrganizationalUnits() {
    return organizationalUnits;
  }


  public void setOrganizationalUnits(String organizationalUnits) {
    this.organizationalUnits = organizationalUnits;
  }


  public CreatePKICertIssuer organizations(String organizations) {
    
    this.organizations = organizations;
    return this;
  }

   /**
   * A comma-separated list of organizations (O) that will be set in the issued certificate
   * @return organizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of organizations (O) that will be set in the issued certificate")

  public String getOrganizations() {
    return organizations;
  }


  public void setOrganizations(String organizations) {
    this.organizations = organizations;
  }


  public CreatePKICertIssuer postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A comma-separated list of the postal code that will be set in the issued certificate
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of the postal code that will be set in the issued certificate")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CreatePKICertIssuer province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * A comma-separated list of the province that will be set in the issued certificate
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of the province that will be set in the issued certificate")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public CreatePKICertIssuer serverFlag(Boolean serverFlag) {
    
    this.serverFlag = serverFlag;
    return this;
  }

   /**
   * If set, certificates will be flagged for server auth use
   * @return serverFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, certificates will be flagged for server auth use")

  public Boolean getServerFlag() {
    return serverFlag;
  }


  public void setServerFlag(Boolean serverFlag) {
    this.serverFlag = serverFlag;
  }


  public CreatePKICertIssuer signerKeyName(String signerKeyName) {
    
    this.signerKeyName = signerKeyName;
    return this;
  }

   /**
   * A key to sign the certificate with
   * @return signerKeyName
  **/
  @ApiModelProperty(required = true, value = "A key to sign the certificate with")

  public String getSignerKeyName() {
    return signerKeyName;
  }


  public void setSignerKeyName(String signerKeyName) {
    this.signerKeyName = signerKeyName;
  }


  public CreatePKICertIssuer streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * A comma-separated list of the street address that will be set in the issued certificate
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of the street address that will be set in the issued certificate")

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public CreatePKICertIssuer tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public CreatePKICertIssuer addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * List of the tags attached to this key
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this key")

  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public CreatePKICertIssuer token(String token) {
    
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


  public CreatePKICertIssuer ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * he requested Time To Live for the certificate, in seconds
   * @return ttl
  **/
  @ApiModelProperty(required = true, value = "he requested Time To Live for the certificate, in seconds")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public CreatePKICertIssuer uidToken(String uidToken) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePKICertIssuer createPKICertIssuer = (CreatePKICertIssuer) o;
    return Objects.equals(this.allowAnyName, createPKICertIssuer.allowAnyName) &&
        Objects.equals(this.allowSubdomains, createPKICertIssuer.allowSubdomains) &&
        Objects.equals(this.allowedDomains, createPKICertIssuer.allowedDomains) &&
        Objects.equals(this.allowedUriSans, createPKICertIssuer.allowedUriSans) &&
        Objects.equals(this.clientFlag, createPKICertIssuer.clientFlag) &&
        Objects.equals(this.codeSigningFlag, createPKICertIssuer.codeSigningFlag) &&
        Objects.equals(this.country, createPKICertIssuer.country) &&
        Objects.equals(this.keyUsage, createPKICertIssuer.keyUsage) &&
        Objects.equals(this.locality, createPKICertIssuer.locality) &&
        Objects.equals(this.metadata, createPKICertIssuer.metadata) &&
        Objects.equals(this.name, createPKICertIssuer.name) &&
        Objects.equals(this.notEnforceHostnames, createPKICertIssuer.notEnforceHostnames) &&
        Objects.equals(this.notRequireCn, createPKICertIssuer.notRequireCn) &&
        Objects.equals(this.organizationalUnits, createPKICertIssuer.organizationalUnits) &&
        Objects.equals(this.organizations, createPKICertIssuer.organizations) &&
        Objects.equals(this.postalCode, createPKICertIssuer.postalCode) &&
        Objects.equals(this.province, createPKICertIssuer.province) &&
        Objects.equals(this.serverFlag, createPKICertIssuer.serverFlag) &&
        Objects.equals(this.signerKeyName, createPKICertIssuer.signerKeyName) &&
        Objects.equals(this.streetAddress, createPKICertIssuer.streetAddress) &&
        Objects.equals(this.tag, createPKICertIssuer.tag) &&
        Objects.equals(this.token, createPKICertIssuer.token) &&
        Objects.equals(this.ttl, createPKICertIssuer.ttl) &&
        Objects.equals(this.uidToken, createPKICertIssuer.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAnyName, allowSubdomains, allowedDomains, allowedUriSans, clientFlag, codeSigningFlag, country, keyUsage, locality, metadata, name, notEnforceHostnames, notRequireCn, organizationalUnits, organizations, postalCode, province, serverFlag, signerKeyName, streetAddress, tag, token, ttl, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePKICertIssuer {\n");
    sb.append("    allowAnyName: ").append(toIndentedString(allowAnyName)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowedUriSans: ").append(toIndentedString(allowedUriSans)).append("\n");
    sb.append("    clientFlag: ").append(toIndentedString(clientFlag)).append("\n");
    sb.append("    codeSigningFlag: ").append(toIndentedString(codeSigningFlag)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notEnforceHostnames: ").append(toIndentedString(notEnforceHostnames)).append("\n");
    sb.append("    notRequireCn: ").append(toIndentedString(notRequireCn)).append("\n");
    sb.append("    organizationalUnits: ").append(toIndentedString(organizationalUnits)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    serverFlag: ").append(toIndentedString(serverFlag)).append("\n");
    sb.append("    signerKeyName: ").append(toIndentedString(signerKeyName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

