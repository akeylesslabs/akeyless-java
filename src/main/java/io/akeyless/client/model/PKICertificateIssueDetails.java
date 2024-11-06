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
import io.akeyless.client.model.CertificateExpirationEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PKICertificateIssueDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PKICertificateIssueDetails {
  public static final String SERIALIZED_NAME_ACME_ENABLED = "acme_enabled";
  @SerializedName(SERIALIZED_NAME_ACME_ENABLED)
  private Boolean acmeEnabled;

  public static final String SERIALIZED_NAME_ALLOW_ANY_NAME = "allow_any_name";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_NAME)
  private Boolean allowAnyName;

  public static final String SERIALIZED_NAME_ALLOW_COPY_EXT_FROM_CSR = "allow_copy_ext_from_csr";
  @SerializedName(SERIALIZED_NAME_ALLOW_COPY_EXT_FROM_CSR)
  private Boolean allowCopyExtFromCsr;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow_subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS_LIST = "allowed_domains_list";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS_LIST)
  private List<String> allowedDomainsList = null;

  public static final String SERIALIZED_NAME_ALLOWED_EXTRA_EXTENSIONS = "allowed_extra_extensions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_EXTRA_EXTENSIONS)
  private Map<String, List<String>> allowedExtraExtensions = null;

  public static final String SERIALIZED_NAME_ALLOWED_URI_SANS = "allowed_uri_sans";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URI_SANS)
  private List<String> allowedUriSans = null;

  public static final String SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE = "auto_renew_certificate";
  @SerializedName(SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE)
  private Boolean autoRenewCertificate;

  public static final String SERIALIZED_NAME_BASIC_CONSTRAINTS_VALID_FOR_NON_CA = "basic_constraints_valid_for_non_ca";
  @SerializedName(SERIALIZED_NAME_BASIC_CONSTRAINTS_VALID_FOR_NON_CA)
  private Boolean basicConstraintsValidForNonCa;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_MODE = "certificate_authority_mode";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_MODE)
  private String certificateAuthorityMode;

  public static final String SERIALIZED_NAME_CLIENT_FLAG = "client_flag";
  @SerializedName(SERIALIZED_NAME_CLIENT_FLAG)
  private Boolean clientFlag;

  public static final String SERIALIZED_NAME_CODE_SIGNING_FLAG = "code_signing_flag";
  @SerializedName(SERIALIZED_NAME_CODE_SIGNING_FLAG)
  private Boolean codeSigningFlag;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private List<String> country = null;

  public static final String SERIALIZED_NAME_CREATE_PRIVATE_CRL = "create_private_crl";
  @SerializedName(SERIALIZED_NAME_CREATE_PRIVATE_CRL)
  private Boolean createPrivateCrl;

  public static final String SERIALIZED_NAME_CREATE_PUBLIC_CRL = "create_public_crl";
  @SerializedName(SERIALIZED_NAME_CREATE_PUBLIC_CRL)
  private Boolean createPublicCrl;

  public static final String SERIALIZED_NAME_DESTINATION_PATH = "destination_path";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PATH)
  private String destinationPath;

  public static final String SERIALIZED_NAME_ENFORCE_HOSTNAMES = "enforce_hostnames";
  @SerializedName(SERIALIZED_NAME_ENFORCE_HOSTNAMES)
  private Boolean enforceHostnames;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENTS = "expiration_events";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENTS)
  private List<CertificateExpirationEvent> expirationEvents = null;

  public static final String SERIALIZED_NAME_GW_CLUSTER_ID = "gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_ID)
  private Long gwClusterId;

  public static final String SERIALIZED_NAME_GW_CLUSTER_URL = "gw_cluster_url";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_URL)
  private String gwClusterUrl;

  public static final String SERIALIZED_NAME_IS_CA = "is_ca";
  @SerializedName(SERIALIZED_NAME_IS_CA)
  private Boolean isCa;

  public static final String SERIALIZED_NAME_KEY_BITS = "key_bits";
  @SerializedName(SERIALIZED_NAME_KEY_BITS)
  private Long keyBits;

  public static final String SERIALIZED_NAME_KEY_TYPE = "key_type";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_KEY_USAGE_LIST = "key_usage_list";
  @SerializedName(SERIALIZED_NAME_KEY_USAGE_LIST)
  private List<String> keyUsageList = null;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private List<String> locality = null;

  public static final String SERIALIZED_NAME_NON_CRITICAL_KEY_USAGE = "non_critical_key_usage";
  @SerializedName(SERIALIZED_NAME_NON_CRITICAL_KEY_USAGE)
  private Boolean nonCriticalKeyUsage;

  public static final String SERIALIZED_NAME_NOT_BEFORE_DURATION = "not_before_duration";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE_DURATION)
  private Long notBeforeDuration;

  public static final String SERIALIZED_NAME_ORGANIZATION_LIST = "organization_list";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_LIST)
  private List<String> organizationList = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_UNIT_LIST = "organization_unit_list";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_UNIT_LIST)
  private List<String> organizationUnitList = null;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private List<String> postalCode = null;

  public static final String SERIALIZED_NAME_PROTECT_GENERATED_CERTIFICATES = "protect_generated_certificates";
  @SerializedName(SERIALIZED_NAME_PROTECT_GENERATED_CERTIFICATES)
  private Boolean protectGeneratedCertificates;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public static final String SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS = "renew_before_expiration_in_days";
  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS)
  private Long renewBeforeExpirationInDays;

  public static final String SERIALIZED_NAME_REQUIRE_CN = "require_cn";
  @SerializedName(SERIALIZED_NAME_REQUIRE_CN)
  private Boolean requireCn;

  public static final String SERIALIZED_NAME_SERVER_FLAG = "server_flag";
  @SerializedName(SERIALIZED_NAME_SERVER_FLAG)
  private Boolean serverFlag;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "street_address";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private List<String> streetAddress = null;

  public PKICertificateIssueDetails() { 
  }

  public PKICertificateIssueDetails acmeEnabled(Boolean acmeEnabled) {
    
    this.acmeEnabled = acmeEnabled;
    return this;
  }

   /**
   * Get acmeEnabled
   * @return acmeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAcmeEnabled() {
    return acmeEnabled;
  }


  public void setAcmeEnabled(Boolean acmeEnabled) {
    this.acmeEnabled = acmeEnabled;
  }


  public PKICertificateIssueDetails allowAnyName(Boolean allowAnyName) {
    
    this.allowAnyName = allowAnyName;
    return this;
  }

   /**
   * Get allowAnyName
   * @return allowAnyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowAnyName() {
    return allowAnyName;
  }


  public void setAllowAnyName(Boolean allowAnyName) {
    this.allowAnyName = allowAnyName;
  }


  public PKICertificateIssueDetails allowCopyExtFromCsr(Boolean allowCopyExtFromCsr) {
    
    this.allowCopyExtFromCsr = allowCopyExtFromCsr;
    return this;
  }

   /**
   * Get allowCopyExtFromCsr
   * @return allowCopyExtFromCsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowCopyExtFromCsr() {
    return allowCopyExtFromCsr;
  }


  public void setAllowCopyExtFromCsr(Boolean allowCopyExtFromCsr) {
    this.allowCopyExtFromCsr = allowCopyExtFromCsr;
  }


  public PKICertificateIssueDetails allowSubdomains(Boolean allowSubdomains) {
    
    this.allowSubdomains = allowSubdomains;
    return this;
  }

   /**
   * Get allowSubdomains
   * @return allowSubdomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }


  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  public PKICertificateIssueDetails allowedDomainsList(List<String> allowedDomainsList) {
    
    this.allowedDomainsList = allowedDomainsList;
    return this;
  }

  public PKICertificateIssueDetails addAllowedDomainsListItem(String allowedDomainsListItem) {
    if (this.allowedDomainsList == null) {
      this.allowedDomainsList = new ArrayList<String>();
    }
    this.allowedDomainsList.add(allowedDomainsListItem);
    return this;
  }

   /**
   * Get allowedDomainsList
   * @return allowedDomainsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedDomainsList() {
    return allowedDomainsList;
  }


  public void setAllowedDomainsList(List<String> allowedDomainsList) {
    this.allowedDomainsList = allowedDomainsList;
  }


  public PKICertificateIssueDetails allowedExtraExtensions(Map<String, List<String>> allowedExtraExtensions) {
    
    this.allowedExtraExtensions = allowedExtraExtensions;
    return this;
  }

  public PKICertificateIssueDetails putAllowedExtraExtensionsItem(String key, List<String> allowedExtraExtensionsItem) {
    if (this.allowedExtraExtensions == null) {
      this.allowedExtraExtensions = new HashMap<String, List<String>>();
    }
    this.allowedExtraExtensions.put(key, allowedExtraExtensionsItem);
    return this;
  }

   /**
   * Get allowedExtraExtensions
   * @return allowedExtraExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getAllowedExtraExtensions() {
    return allowedExtraExtensions;
  }


  public void setAllowedExtraExtensions(Map<String, List<String>> allowedExtraExtensions) {
    this.allowedExtraExtensions = allowedExtraExtensions;
  }


  public PKICertificateIssueDetails allowedUriSans(List<String> allowedUriSans) {
    
    this.allowedUriSans = allowedUriSans;
    return this;
  }

  public PKICertificateIssueDetails addAllowedUriSansItem(String allowedUriSansItem) {
    if (this.allowedUriSans == null) {
      this.allowedUriSans = new ArrayList<String>();
    }
    this.allowedUriSans.add(allowedUriSansItem);
    return this;
  }

   /**
   * Get allowedUriSans
   * @return allowedUriSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedUriSans() {
    return allowedUriSans;
  }


  public void setAllowedUriSans(List<String> allowedUriSans) {
    this.allowedUriSans = allowedUriSans;
  }


  public PKICertificateIssueDetails autoRenewCertificate(Boolean autoRenewCertificate) {
    
    this.autoRenewCertificate = autoRenewCertificate;
    return this;
  }

   /**
   * Get autoRenewCertificate
   * @return autoRenewCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoRenewCertificate() {
    return autoRenewCertificate;
  }


  public void setAutoRenewCertificate(Boolean autoRenewCertificate) {
    this.autoRenewCertificate = autoRenewCertificate;
  }


  public PKICertificateIssueDetails basicConstraintsValidForNonCa(Boolean basicConstraintsValidForNonCa) {
    
    this.basicConstraintsValidForNonCa = basicConstraintsValidForNonCa;
    return this;
  }

   /**
   * Get basicConstraintsValidForNonCa
   * @return basicConstraintsValidForNonCa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBasicConstraintsValidForNonCa() {
    return basicConstraintsValidForNonCa;
  }


  public void setBasicConstraintsValidForNonCa(Boolean basicConstraintsValidForNonCa) {
    this.basicConstraintsValidForNonCa = basicConstraintsValidForNonCa;
  }


  public PKICertificateIssueDetails certificateAuthorityMode(String certificateAuthorityMode) {
    
    this.certificateAuthorityMode = certificateAuthorityMode;
    return this;
  }

   /**
   * Get certificateAuthorityMode
   * @return certificateAuthorityMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateAuthorityMode() {
    return certificateAuthorityMode;
  }


  public void setCertificateAuthorityMode(String certificateAuthorityMode) {
    this.certificateAuthorityMode = certificateAuthorityMode;
  }


  public PKICertificateIssueDetails clientFlag(Boolean clientFlag) {
    
    this.clientFlag = clientFlag;
    return this;
  }

   /**
   * Get clientFlag
   * @return clientFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClientFlag() {
    return clientFlag;
  }


  public void setClientFlag(Boolean clientFlag) {
    this.clientFlag = clientFlag;
  }


  public PKICertificateIssueDetails codeSigningFlag(Boolean codeSigningFlag) {
    
    this.codeSigningFlag = codeSigningFlag;
    return this;
  }

   /**
   * Get codeSigningFlag
   * @return codeSigningFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCodeSigningFlag() {
    return codeSigningFlag;
  }


  public void setCodeSigningFlag(Boolean codeSigningFlag) {
    this.codeSigningFlag = codeSigningFlag;
  }


  public PKICertificateIssueDetails country(List<String> country) {
    
    this.country = country;
    return this;
  }

  public PKICertificateIssueDetails addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<String>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCountry() {
    return country;
  }


  public void setCountry(List<String> country) {
    this.country = country;
  }


  public PKICertificateIssueDetails createPrivateCrl(Boolean createPrivateCrl) {
    
    this.createPrivateCrl = createPrivateCrl;
    return this;
  }

   /**
   * Get createPrivateCrl
   * @return createPrivateCrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreatePrivateCrl() {
    return createPrivateCrl;
  }


  public void setCreatePrivateCrl(Boolean createPrivateCrl) {
    this.createPrivateCrl = createPrivateCrl;
  }


  public PKICertificateIssueDetails createPublicCrl(Boolean createPublicCrl) {
    
    this.createPublicCrl = createPublicCrl;
    return this;
  }

   /**
   * Get createPublicCrl
   * @return createPublicCrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreatePublicCrl() {
    return createPublicCrl;
  }


  public void setCreatePublicCrl(Boolean createPublicCrl) {
    this.createPublicCrl = createPublicCrl;
  }


  public PKICertificateIssueDetails destinationPath(String destinationPath) {
    
    this.destinationPath = destinationPath;
    return this;
  }

   /**
   * DestinationPath is the destination to save generated certificates
   * @return destinationPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DestinationPath is the destination to save generated certificates")

  public String getDestinationPath() {
    return destinationPath;
  }


  public void setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
  }


  public PKICertificateIssueDetails enforceHostnames(Boolean enforceHostnames) {
    
    this.enforceHostnames = enforceHostnames;
    return this;
  }

   /**
   * Get enforceHostnames
   * @return enforceHostnames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnforceHostnames() {
    return enforceHostnames;
  }


  public void setEnforceHostnames(Boolean enforceHostnames) {
    this.enforceHostnames = enforceHostnames;
  }


  public PKICertificateIssueDetails expirationEvents(List<CertificateExpirationEvent> expirationEvents) {
    
    this.expirationEvents = expirationEvents;
    return this;
  }

  public PKICertificateIssueDetails addExpirationEventsItem(CertificateExpirationEvent expirationEventsItem) {
    if (this.expirationEvents == null) {
      this.expirationEvents = new ArrayList<CertificateExpirationEvent>();
    }
    this.expirationEvents.add(expirationEventsItem);
    return this;
  }

   /**
   * ExpirationNotification holds a list of expiration notices that should be sent in case a certificate is about to expire, this value is being propagated to the Certificate resources that are created
   * @return expirationEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExpirationNotification holds a list of expiration notices that should be sent in case a certificate is about to expire, this value is being propagated to the Certificate resources that are created")

  public List<CertificateExpirationEvent> getExpirationEvents() {
    return expirationEvents;
  }


  public void setExpirationEvents(List<CertificateExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
  }


  public PKICertificateIssueDetails gwClusterId(Long gwClusterId) {
    
    this.gwClusterId = gwClusterId;
    return this;
  }

   /**
   * Get gwClusterId
   * @return gwClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGwClusterId() {
    return gwClusterId;
  }


  public void setGwClusterId(Long gwClusterId) {
    this.gwClusterId = gwClusterId;
  }


  public PKICertificateIssueDetails gwClusterUrl(String gwClusterUrl) {
    
    this.gwClusterUrl = gwClusterUrl;
    return this;
  }

   /**
   * GWClusterURL is required when CAMode is \&quot;public\&quot; and it defines the cluster URL the PKI should be issued from. The GW cluster must have permissions to read associated target&#39;s details
   * @return gwClusterUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GWClusterURL is required when CAMode is \"public\" and it defines the cluster URL the PKI should be issued from. The GW cluster must have permissions to read associated target's details")

  public String getGwClusterUrl() {
    return gwClusterUrl;
  }


  public void setGwClusterUrl(String gwClusterUrl) {
    this.gwClusterUrl = gwClusterUrl;
  }


  public PKICertificateIssueDetails isCa(Boolean isCa) {
    
    this.isCa = isCa;
    return this;
  }

   /**
   * Get isCa
   * @return isCa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCa() {
    return isCa;
  }


  public void setIsCa(Boolean isCa) {
    this.isCa = isCa;
  }


  public PKICertificateIssueDetails keyBits(Long keyBits) {
    
    this.keyBits = keyBits;
    return this;
  }

   /**
   * Get keyBits
   * @return keyBits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getKeyBits() {
    return keyBits;
  }


  public void setKeyBits(Long keyBits) {
    this.keyBits = keyBits;
  }


  public PKICertificateIssueDetails keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public PKICertificateIssueDetails keyUsageList(List<String> keyUsageList) {
    
    this.keyUsageList = keyUsageList;
    return this;
  }

  public PKICertificateIssueDetails addKeyUsageListItem(String keyUsageListItem) {
    if (this.keyUsageList == null) {
      this.keyUsageList = new ArrayList<String>();
    }
    this.keyUsageList.add(keyUsageListItem);
    return this;
  }

   /**
   * Get keyUsageList
   * @return keyUsageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeyUsageList() {
    return keyUsageList;
  }


  public void setKeyUsageList(List<String> keyUsageList) {
    this.keyUsageList = keyUsageList;
  }


  public PKICertificateIssueDetails locality(List<String> locality) {
    
    this.locality = locality;
    return this;
  }

  public PKICertificateIssueDetails addLocalityItem(String localityItem) {
    if (this.locality == null) {
      this.locality = new ArrayList<String>();
    }
    this.locality.add(localityItem);
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocality() {
    return locality;
  }


  public void setLocality(List<String> locality) {
    this.locality = locality;
  }


  public PKICertificateIssueDetails nonCriticalKeyUsage(Boolean nonCriticalKeyUsage) {
    
    this.nonCriticalKeyUsage = nonCriticalKeyUsage;
    return this;
  }

   /**
   * Get nonCriticalKeyUsage
   * @return nonCriticalKeyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNonCriticalKeyUsage() {
    return nonCriticalKeyUsage;
  }


  public void setNonCriticalKeyUsage(Boolean nonCriticalKeyUsage) {
    this.nonCriticalKeyUsage = nonCriticalKeyUsage;
  }


  public PKICertificateIssueDetails notBeforeDuration(Long notBeforeDuration) {
    
    this.notBeforeDuration = notBeforeDuration;
    return this;
  }

   /**
   * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
   * @return notBeforeDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.")

  public Long getNotBeforeDuration() {
    return notBeforeDuration;
  }


  public void setNotBeforeDuration(Long notBeforeDuration) {
    this.notBeforeDuration = notBeforeDuration;
  }


  public PKICertificateIssueDetails organizationList(List<String> organizationList) {
    
    this.organizationList = organizationList;
    return this;
  }

  public PKICertificateIssueDetails addOrganizationListItem(String organizationListItem) {
    if (this.organizationList == null) {
      this.organizationList = new ArrayList<String>();
    }
    this.organizationList.add(organizationListItem);
    return this;
  }

   /**
   * Get organizationList
   * @return organizationList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOrganizationList() {
    return organizationList;
  }


  public void setOrganizationList(List<String> organizationList) {
    this.organizationList = organizationList;
  }


  public PKICertificateIssueDetails organizationUnitList(List<String> organizationUnitList) {
    
    this.organizationUnitList = organizationUnitList;
    return this;
  }

  public PKICertificateIssueDetails addOrganizationUnitListItem(String organizationUnitListItem) {
    if (this.organizationUnitList == null) {
      this.organizationUnitList = new ArrayList<String>();
    }
    this.organizationUnitList.add(organizationUnitListItem);
    return this;
  }

   /**
   * Get organizationUnitList
   * @return organizationUnitList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOrganizationUnitList() {
    return organizationUnitList;
  }


  public void setOrganizationUnitList(List<String> organizationUnitList) {
    this.organizationUnitList = organizationUnitList;
  }


  public PKICertificateIssueDetails postalCode(List<String> postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

  public PKICertificateIssueDetails addPostalCodeItem(String postalCodeItem) {
    if (this.postalCode == null) {
      this.postalCode = new ArrayList<String>();
    }
    this.postalCode.add(postalCodeItem);
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(List<String> postalCode) {
    this.postalCode = postalCode;
  }


  public PKICertificateIssueDetails protectGeneratedCertificates(Boolean protectGeneratedCertificates) {
    
    this.protectGeneratedCertificates = protectGeneratedCertificates;
    return this;
  }

   /**
   * ProtectGeneratedCertificates dictates whether the created certificates should be protected from deletion
   * @return protectGeneratedCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProtectGeneratedCertificates dictates whether the created certificates should be protected from deletion")

  public Boolean getProtectGeneratedCertificates() {
    return protectGeneratedCertificates;
  }


  public void setProtectGeneratedCertificates(Boolean protectGeneratedCertificates) {
    this.protectGeneratedCertificates = protectGeneratedCertificates;
  }


  public PKICertificateIssueDetails province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public PKICertificateIssueDetails addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<String>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProvince() {
    return province;
  }


  public void setProvince(List<String> province) {
    this.province = province;
  }


  public PKICertificateIssueDetails renewBeforeExpirationInDays(Long renewBeforeExpirationInDays) {
    
    this.renewBeforeExpirationInDays = renewBeforeExpirationInDays;
    return this;
  }

   /**
   * Get renewBeforeExpirationInDays
   * @return renewBeforeExpirationInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRenewBeforeExpirationInDays() {
    return renewBeforeExpirationInDays;
  }


  public void setRenewBeforeExpirationInDays(Long renewBeforeExpirationInDays) {
    this.renewBeforeExpirationInDays = renewBeforeExpirationInDays;
  }


  public PKICertificateIssueDetails requireCn(Boolean requireCn) {
    
    this.requireCn = requireCn;
    return this;
  }

   /**
   * Get requireCn
   * @return requireCn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireCn() {
    return requireCn;
  }


  public void setRequireCn(Boolean requireCn) {
    this.requireCn = requireCn;
  }


  public PKICertificateIssueDetails serverFlag(Boolean serverFlag) {
    
    this.serverFlag = serverFlag;
    return this;
  }

   /**
   * Get serverFlag
   * @return serverFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getServerFlag() {
    return serverFlag;
  }


  public void setServerFlag(Boolean serverFlag) {
    this.serverFlag = serverFlag;
  }


  public PKICertificateIssueDetails streetAddress(List<String> streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

  public PKICertificateIssueDetails addStreetAddressItem(String streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<String>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(List<String> streetAddress) {
    this.streetAddress = streetAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PKICertificateIssueDetails pkICertificateIssueDetails = (PKICertificateIssueDetails) o;
    return Objects.equals(this.acmeEnabled, pkICertificateIssueDetails.acmeEnabled) &&
        Objects.equals(this.allowAnyName, pkICertificateIssueDetails.allowAnyName) &&
        Objects.equals(this.allowCopyExtFromCsr, pkICertificateIssueDetails.allowCopyExtFromCsr) &&
        Objects.equals(this.allowSubdomains, pkICertificateIssueDetails.allowSubdomains) &&
        Objects.equals(this.allowedDomainsList, pkICertificateIssueDetails.allowedDomainsList) &&
        Objects.equals(this.allowedExtraExtensions, pkICertificateIssueDetails.allowedExtraExtensions) &&
        Objects.equals(this.allowedUriSans, pkICertificateIssueDetails.allowedUriSans) &&
        Objects.equals(this.autoRenewCertificate, pkICertificateIssueDetails.autoRenewCertificate) &&
        Objects.equals(this.basicConstraintsValidForNonCa, pkICertificateIssueDetails.basicConstraintsValidForNonCa) &&
        Objects.equals(this.certificateAuthorityMode, pkICertificateIssueDetails.certificateAuthorityMode) &&
        Objects.equals(this.clientFlag, pkICertificateIssueDetails.clientFlag) &&
        Objects.equals(this.codeSigningFlag, pkICertificateIssueDetails.codeSigningFlag) &&
        Objects.equals(this.country, pkICertificateIssueDetails.country) &&
        Objects.equals(this.createPrivateCrl, pkICertificateIssueDetails.createPrivateCrl) &&
        Objects.equals(this.createPublicCrl, pkICertificateIssueDetails.createPublicCrl) &&
        Objects.equals(this.destinationPath, pkICertificateIssueDetails.destinationPath) &&
        Objects.equals(this.enforceHostnames, pkICertificateIssueDetails.enforceHostnames) &&
        Objects.equals(this.expirationEvents, pkICertificateIssueDetails.expirationEvents) &&
        Objects.equals(this.gwClusterId, pkICertificateIssueDetails.gwClusterId) &&
        Objects.equals(this.gwClusterUrl, pkICertificateIssueDetails.gwClusterUrl) &&
        Objects.equals(this.isCa, pkICertificateIssueDetails.isCa) &&
        Objects.equals(this.keyBits, pkICertificateIssueDetails.keyBits) &&
        Objects.equals(this.keyType, pkICertificateIssueDetails.keyType) &&
        Objects.equals(this.keyUsageList, pkICertificateIssueDetails.keyUsageList) &&
        Objects.equals(this.locality, pkICertificateIssueDetails.locality) &&
        Objects.equals(this.nonCriticalKeyUsage, pkICertificateIssueDetails.nonCriticalKeyUsage) &&
        Objects.equals(this.notBeforeDuration, pkICertificateIssueDetails.notBeforeDuration) &&
        Objects.equals(this.organizationList, pkICertificateIssueDetails.organizationList) &&
        Objects.equals(this.organizationUnitList, pkICertificateIssueDetails.organizationUnitList) &&
        Objects.equals(this.postalCode, pkICertificateIssueDetails.postalCode) &&
        Objects.equals(this.protectGeneratedCertificates, pkICertificateIssueDetails.protectGeneratedCertificates) &&
        Objects.equals(this.province, pkICertificateIssueDetails.province) &&
        Objects.equals(this.renewBeforeExpirationInDays, pkICertificateIssueDetails.renewBeforeExpirationInDays) &&
        Objects.equals(this.requireCn, pkICertificateIssueDetails.requireCn) &&
        Objects.equals(this.serverFlag, pkICertificateIssueDetails.serverFlag) &&
        Objects.equals(this.streetAddress, pkICertificateIssueDetails.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acmeEnabled, allowAnyName, allowCopyExtFromCsr, allowSubdomains, allowedDomainsList, allowedExtraExtensions, allowedUriSans, autoRenewCertificate, basicConstraintsValidForNonCa, certificateAuthorityMode, clientFlag, codeSigningFlag, country, createPrivateCrl, createPublicCrl, destinationPath, enforceHostnames, expirationEvents, gwClusterId, gwClusterUrl, isCa, keyBits, keyType, keyUsageList, locality, nonCriticalKeyUsage, notBeforeDuration, organizationList, organizationUnitList, postalCode, protectGeneratedCertificates, province, renewBeforeExpirationInDays, requireCn, serverFlag, streetAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PKICertificateIssueDetails {\n");
    sb.append("    acmeEnabled: ").append(toIndentedString(acmeEnabled)).append("\n");
    sb.append("    allowAnyName: ").append(toIndentedString(allowAnyName)).append("\n");
    sb.append("    allowCopyExtFromCsr: ").append(toIndentedString(allowCopyExtFromCsr)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomainsList: ").append(toIndentedString(allowedDomainsList)).append("\n");
    sb.append("    allowedExtraExtensions: ").append(toIndentedString(allowedExtraExtensions)).append("\n");
    sb.append("    allowedUriSans: ").append(toIndentedString(allowedUriSans)).append("\n");
    sb.append("    autoRenewCertificate: ").append(toIndentedString(autoRenewCertificate)).append("\n");
    sb.append("    basicConstraintsValidForNonCa: ").append(toIndentedString(basicConstraintsValidForNonCa)).append("\n");
    sb.append("    certificateAuthorityMode: ").append(toIndentedString(certificateAuthorityMode)).append("\n");
    sb.append("    clientFlag: ").append(toIndentedString(clientFlag)).append("\n");
    sb.append("    codeSigningFlag: ").append(toIndentedString(codeSigningFlag)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createPrivateCrl: ").append(toIndentedString(createPrivateCrl)).append("\n");
    sb.append("    createPublicCrl: ").append(toIndentedString(createPublicCrl)).append("\n");
    sb.append("    destinationPath: ").append(toIndentedString(destinationPath)).append("\n");
    sb.append("    enforceHostnames: ").append(toIndentedString(enforceHostnames)).append("\n");
    sb.append("    expirationEvents: ").append(toIndentedString(expirationEvents)).append("\n");
    sb.append("    gwClusterId: ").append(toIndentedString(gwClusterId)).append("\n");
    sb.append("    gwClusterUrl: ").append(toIndentedString(gwClusterUrl)).append("\n");
    sb.append("    isCa: ").append(toIndentedString(isCa)).append("\n");
    sb.append("    keyBits: ").append(toIndentedString(keyBits)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    keyUsageList: ").append(toIndentedString(keyUsageList)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    nonCriticalKeyUsage: ").append(toIndentedString(nonCriticalKeyUsage)).append("\n");
    sb.append("    notBeforeDuration: ").append(toIndentedString(notBeforeDuration)).append("\n");
    sb.append("    organizationList: ").append(toIndentedString(organizationList)).append("\n");
    sb.append("    organizationUnitList: ").append(toIndentedString(organizationUnitList)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    protectGeneratedCertificates: ").append(toIndentedString(protectGeneratedCertificates)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    renewBeforeExpirationInDays: ").append(toIndentedString(renewBeforeExpirationInDays)).append("\n");
    sb.append("    requireCn: ").append(toIndentedString(requireCn)).append("\n");
    sb.append("    serverFlag: ").append(toIndentedString(serverFlag)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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

