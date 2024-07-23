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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePKICertIssuer {
  public static final String SERIALIZED_NAME_ALLOW_ANY_NAME = "allow-any-name";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_NAME)
  private Boolean allowAnyName;

  public static final String SERIALIZED_NAME_ALLOW_COPY_EXT_FROM_CSR = "allow-copy-ext-from-csr";
  @SerializedName(SERIALIZED_NAME_ALLOW_COPY_EXT_FROM_CSR)
  private Boolean allowCopyExtFromCsr;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow-subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed-domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private String allowedDomains;

  public static final String SERIALIZED_NAME_ALLOWED_EXTRA_EXTENSIONS = "allowed-extra-extensions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_EXTRA_EXTENSIONS)
  private String allowedExtraExtensions;

  public static final String SERIALIZED_NAME_ALLOWED_URI_SANS = "allowed-uri-sans";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URI_SANS)
  private String allowedUriSans;

  public static final String SERIALIZED_NAME_CA_TARGET = "ca-target";
  @SerializedName(SERIALIZED_NAME_CA_TARGET)
  private String caTarget;

  public static final String SERIALIZED_NAME_CLIENT_FLAG = "client-flag";
  @SerializedName(SERIALIZED_NAME_CLIENT_FLAG)
  private Boolean clientFlag;

  public static final String SERIALIZED_NAME_CODE_SIGNING_FLAG = "code-signing-flag";
  @SerializedName(SERIALIZED_NAME_CODE_SIGNING_FLAG)
  private Boolean codeSigningFlag;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATE_PRIVATE_CRL = "create-private-crl";
  @SerializedName(SERIALIZED_NAME_CREATE_PRIVATE_CRL)
  private Boolean createPrivateCrl;

  public static final String SERIALIZED_NAME_CREATE_PUBLIC_CRL = "create-public-crl";
  @SerializedName(SERIALIZED_NAME_CREATE_PUBLIC_CRL)
  private Boolean createPublicCrl;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESTINATION_PATH = "destination-path";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PATH)
  private String destinationPath;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENT_IN = "expiration-event-in";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENT_IN)
  private List<String> expirationEventIn = null;

  public static final String SERIALIZED_NAME_GW_CLUSTER_URL = "gw-cluster-url";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_URL)
  private String gwClusterUrl;

  public static final String SERIALIZED_NAME_IS_CA = "is-ca";
  @SerializedName(SERIALIZED_NAME_IS_CA)
  private Boolean isCa;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_PROTECT_CERTIFICATES = "protect-certificates";
  @SerializedName(SERIALIZED_NAME_PROTECT_CERTIFICATES)
  private Boolean protectCertificates;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_SERVER_FLAG = "server-flag";
  @SerializedName(SERIALIZED_NAME_SERVER_FLAG)
  private Boolean serverFlag;

  public static final String SERIALIZED_NAME_SIGNER_KEY_NAME = "signer-key-name";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_NAME)
  private String signerKeyName = "dummy_signer_key";

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
  private String ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreatePKICertIssuer() { 
  }

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


  public CreatePKICertIssuer allowCopyExtFromCsr(Boolean allowCopyExtFromCsr) {
    
    this.allowCopyExtFromCsr = allowCopyExtFromCsr;
    return this;
  }

   /**
   * If set, will allow copying the extra extensions from the csr file (if given)
   * @return allowCopyExtFromCsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, will allow copying the extra extensions from the csr file (if given)")

  public Boolean getAllowCopyExtFromCsr() {
    return allowCopyExtFromCsr;
  }


  public void setAllowCopyExtFromCsr(Boolean allowCopyExtFromCsr) {
    this.allowCopyExtFromCsr = allowCopyExtFromCsr;
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


  public CreatePKICertIssuer allowedExtraExtensions(String allowedExtraExtensions) {
    
    this.allowedExtraExtensions = allowedExtraExtensions;
    return this;
  }

   /**
   * A json string containing the allowed extra extensions for the pki cert issuer
   * @return allowedExtraExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A json string containing the allowed extra extensions for the pki cert issuer")

  public String getAllowedExtraExtensions() {
    return allowedExtraExtensions;
  }


  public void setAllowedExtraExtensions(String allowedExtraExtensions) {
    this.allowedExtraExtensions = allowedExtraExtensions;
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


  public CreatePKICertIssuer caTarget(String caTarget) {
    
    this.caTarget = caTarget;
    return this;
  }

   /**
   * The name of an existing CA target to attach this PKI Certificate Issuer to, required in Public CA mode
   * @return caTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of an existing CA target to attach this PKI Certificate Issuer to, required in Public CA mode")

  public String getCaTarget() {
    return caTarget;
  }


  public void setCaTarget(String caTarget) {
    this.caTarget = caTarget;
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
   * A comma-separated list of countries that will be set in the issued certificate
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of countries that will be set in the issued certificate")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CreatePKICertIssuer createPrivateCrl(Boolean createPrivateCrl) {
    
    this.createPrivateCrl = createPrivateCrl;
    return this;
  }

   /**
   * Set this to allow the issuer will expose a CRL endpoint in the Gateway
   * @return createPrivateCrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this to allow the issuer will expose a CRL endpoint in the Gateway")

  public Boolean getCreatePrivateCrl() {
    return createPrivateCrl;
  }


  public void setCreatePrivateCrl(Boolean createPrivateCrl) {
    this.createPrivateCrl = createPrivateCrl;
  }


  public CreatePKICertIssuer createPublicCrl(Boolean createPublicCrl) {
    
    this.createPublicCrl = createPublicCrl;
    return this;
  }

   /**
   * Set this to allow the cert issuer will expose a public CRL endpoint
   * @return createPublicCrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this to allow the cert issuer will expose a public CRL endpoint")

  public Boolean getCreatePublicCrl() {
    return createPublicCrl;
  }


  public void setCreatePublicCrl(Boolean createPublicCrl) {
    this.createPublicCrl = createPublicCrl;
  }


  public CreatePKICertIssuer deleteProtection(String deleteProtection) {
    
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


  public CreatePKICertIssuer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreatePKICertIssuer destinationPath(String destinationPath) {
    
    this.destinationPath = destinationPath;
    return this;
  }

   /**
   * A path in which to save generated certificates
   * @return destinationPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A path in which to save generated certificates")

  public String getDestinationPath() {
    return destinationPath;
  }


  public void setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
  }


  public CreatePKICertIssuer expirationEventIn(List<String> expirationEventIn) {
    
    this.expirationEventIn = expirationEventIn;
    return this;
  }

  public CreatePKICertIssuer addExpirationEventInItem(String expirationEventInItem) {
    if (this.expirationEventIn == null) {
      this.expirationEventIn = new ArrayList<String>();
    }
    this.expirationEventIn.add(expirationEventInItem);
    return this;
  }

   /**
   * How many days before the expiration of the certificate would you like to be notified.
   * @return expirationEventIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many days before the expiration of the certificate would you like to be notified.")

  public List<String> getExpirationEventIn() {
    return expirationEventIn;
  }


  public void setExpirationEventIn(List<String> expirationEventIn) {
    this.expirationEventIn = expirationEventIn;
  }


  public CreatePKICertIssuer gwClusterUrl(String gwClusterUrl) {
    
    this.gwClusterUrl = gwClusterUrl;
    return this;
  }

   /**
   * The GW cluster URL to issue the certificate from, required in Public CA mode or to allow CRLs on private CA
   * @return gwClusterUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GW cluster URL to issue the certificate from, required in Public CA mode or to allow CRLs on private CA")

  public String getGwClusterUrl() {
    return gwClusterUrl;
  }


  public void setGwClusterUrl(String gwClusterUrl) {
    this.gwClusterUrl = gwClusterUrl;
  }


  public CreatePKICertIssuer isCa(Boolean isCa) {
    
    this.isCa = isCa;
    return this;
  }

   /**
   * If set, the basic constraints extension will be added to certificate
   * @return isCa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, the basic constraints extension will be added to certificate")

  public Boolean getIsCa() {
    return isCa;
  }


  public void setIsCa(Boolean isCa) {
    this.isCa = isCa;
  }


  public CreatePKICertIssuer json(Boolean json) {
    
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
   * A comma-separated list of localities that will be set in the issued certificate
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of localities that will be set in the issued certificate")

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
   * Deprecated - use description
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

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
  @javax.annotation.Nonnull
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
   * A comma-separated list of postal codes that will be set in the issued certificate
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of postal codes that will be set in the issued certificate")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CreatePKICertIssuer protectCertificates(Boolean protectCertificates) {
    
    this.protectCertificates = protectCertificates;
    return this;
  }

   /**
   * Whether to protect generated certificates from deletion
   * @return protectCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to protect generated certificates from deletion")

  public Boolean getProtectCertificates() {
    return protectCertificates;
  }


  public void setProtectCertificates(Boolean protectCertificates) {
    this.protectCertificates = protectCertificates;
  }


  public CreatePKICertIssuer province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * A comma-separated list of provinces that will be set in the issued certificate
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of provinces that will be set in the issued certificate")

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
   * A key to sign the certificate with, required in Private CA mode
   * @return signerKeyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A key to sign the certificate with, required in Private CA mode")

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
   * A comma-separated list of street addresses that will be set in the issued certificate
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of street addresses that will be set in the issued certificate")

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


  public CreatePKICertIssuer ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * The maximum requested Time To Live for issued certificates, in seconds. In case of Public CA, this is based on the CA target&#39;s supported maximum TTLs
   * @return ttl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum requested Time To Live for issued certificates, in seconds. In case of Public CA, this is based on the CA target's supported maximum TTLs")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePKICertIssuer createPKICertIssuer = (CreatePKICertIssuer) o;
    return Objects.equals(this.allowAnyName, createPKICertIssuer.allowAnyName) &&
        Objects.equals(this.allowCopyExtFromCsr, createPKICertIssuer.allowCopyExtFromCsr) &&
        Objects.equals(this.allowSubdomains, createPKICertIssuer.allowSubdomains) &&
        Objects.equals(this.allowedDomains, createPKICertIssuer.allowedDomains) &&
        Objects.equals(this.allowedExtraExtensions, createPKICertIssuer.allowedExtraExtensions) &&
        Objects.equals(this.allowedUriSans, createPKICertIssuer.allowedUriSans) &&
        Objects.equals(this.caTarget, createPKICertIssuer.caTarget) &&
        Objects.equals(this.clientFlag, createPKICertIssuer.clientFlag) &&
        Objects.equals(this.codeSigningFlag, createPKICertIssuer.codeSigningFlag) &&
        Objects.equals(this.country, createPKICertIssuer.country) &&
        Objects.equals(this.createPrivateCrl, createPKICertIssuer.createPrivateCrl) &&
        Objects.equals(this.createPublicCrl, createPKICertIssuer.createPublicCrl) &&
        Objects.equals(this.deleteProtection, createPKICertIssuer.deleteProtection) &&
        Objects.equals(this.description, createPKICertIssuer.description) &&
        Objects.equals(this.destinationPath, createPKICertIssuer.destinationPath) &&
        Objects.equals(this.expirationEventIn, createPKICertIssuer.expirationEventIn) &&
        Objects.equals(this.gwClusterUrl, createPKICertIssuer.gwClusterUrl) &&
        Objects.equals(this.isCa, createPKICertIssuer.isCa) &&
        Objects.equals(this.json, createPKICertIssuer.json) &&
        Objects.equals(this.keyUsage, createPKICertIssuer.keyUsage) &&
        Objects.equals(this.locality, createPKICertIssuer.locality) &&
        Objects.equals(this.metadata, createPKICertIssuer.metadata) &&
        Objects.equals(this.name, createPKICertIssuer.name) &&
        Objects.equals(this.notEnforceHostnames, createPKICertIssuer.notEnforceHostnames) &&
        Objects.equals(this.notRequireCn, createPKICertIssuer.notRequireCn) &&
        Objects.equals(this.organizationalUnits, createPKICertIssuer.organizationalUnits) &&
        Objects.equals(this.organizations, createPKICertIssuer.organizations) &&
        Objects.equals(this.postalCode, createPKICertIssuer.postalCode) &&
        Objects.equals(this.protectCertificates, createPKICertIssuer.protectCertificates) &&
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
    return Objects.hash(allowAnyName, allowCopyExtFromCsr, allowSubdomains, allowedDomains, allowedExtraExtensions, allowedUriSans, caTarget, clientFlag, codeSigningFlag, country, createPrivateCrl, createPublicCrl, deleteProtection, description, destinationPath, expirationEventIn, gwClusterUrl, isCa, json, keyUsage, locality, metadata, name, notEnforceHostnames, notRequireCn, organizationalUnits, organizations, postalCode, protectCertificates, province, serverFlag, signerKeyName, streetAddress, tag, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePKICertIssuer {\n");
    sb.append("    allowAnyName: ").append(toIndentedString(allowAnyName)).append("\n");
    sb.append("    allowCopyExtFromCsr: ").append(toIndentedString(allowCopyExtFromCsr)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowedExtraExtensions: ").append(toIndentedString(allowedExtraExtensions)).append("\n");
    sb.append("    allowedUriSans: ").append(toIndentedString(allowedUriSans)).append("\n");
    sb.append("    caTarget: ").append(toIndentedString(caTarget)).append("\n");
    sb.append("    clientFlag: ").append(toIndentedString(clientFlag)).append("\n");
    sb.append("    codeSigningFlag: ").append(toIndentedString(codeSigningFlag)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createPrivateCrl: ").append(toIndentedString(createPrivateCrl)).append("\n");
    sb.append("    createPublicCrl: ").append(toIndentedString(createPublicCrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationPath: ").append(toIndentedString(destinationPath)).append("\n");
    sb.append("    expirationEventIn: ").append(toIndentedString(expirationEventIn)).append("\n");
    sb.append("    gwClusterUrl: ").append(toIndentedString(gwClusterUrl)).append("\n");
    sb.append("    isCa: ").append(toIndentedString(isCa)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notEnforceHostnames: ").append(toIndentedString(notEnforceHostnames)).append("\n");
    sb.append("    notRequireCn: ").append(toIndentedString(notRequireCn)).append("\n");
    sb.append("    organizationalUnits: ").append(toIndentedString(organizationalUnits)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    protectCertificates: ").append(toIndentedString(protectCertificates)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

