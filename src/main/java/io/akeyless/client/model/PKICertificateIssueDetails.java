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
 * PKICertificateIssueDetails
 */

public class PKICertificateIssueDetails {
  public static final String SERIALIZED_NAME_ALLOW_ANY_NAME = "allow_any_name";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_NAME)
  private Boolean allowAnyName;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow_subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS_LIST = "allowed_domains_list";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS_LIST)
  private List<String> allowedDomainsList = null;

  public static final String SERIALIZED_NAME_ALLOWED_URI_SANS = "allowed_uri_sans";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URI_SANS)
  private List<String> allowedUriSans = null;

  public static final String SERIALIZED_NAME_BASIC_CONSTRAINTS_VALID_FOR_NON_CA = "basic_constraints_valid_for_non_ca";
  @SerializedName(SERIALIZED_NAME_BASIC_CONSTRAINTS_VALID_FOR_NON_CA)
  private Boolean basicConstraintsValidForNonCa;

  public static final String SERIALIZED_NAME_CLIENT_FLAG = "client_flag";
  @SerializedName(SERIALIZED_NAME_CLIENT_FLAG)
  private Boolean clientFlag;

  public static final String SERIALIZED_NAME_CODE_SIGNING_FLAG = "code_signing_flag";
  @SerializedName(SERIALIZED_NAME_CODE_SIGNING_FLAG)
  private Boolean codeSigningFlag;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private List<String> country = null;

  public static final String SERIALIZED_NAME_ENFORCE_HOSTNAMES = "enforce_hostnames";
  @SerializedName(SERIALIZED_NAME_ENFORCE_HOSTNAMES)
  private Boolean enforceHostnames;

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

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public static final String SERIALIZED_NAME_REQUIRE_CN = "require_cn";
  @SerializedName(SERIALIZED_NAME_REQUIRE_CN)
  private Boolean requireCn;

  public static final String SERIALIZED_NAME_SERVER_FLAG = "server_flag";
  @SerializedName(SERIALIZED_NAME_SERVER_FLAG)
  private Boolean serverFlag;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "street_address";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private List<String> streetAddress = null;


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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PKICertificateIssueDetails pkICertificateIssueDetails = (PKICertificateIssueDetails) o;
    return Objects.equals(this.allowAnyName, pkICertificateIssueDetails.allowAnyName) &&
        Objects.equals(this.allowSubdomains, pkICertificateIssueDetails.allowSubdomains) &&
        Objects.equals(this.allowedDomainsList, pkICertificateIssueDetails.allowedDomainsList) &&
        Objects.equals(this.allowedUriSans, pkICertificateIssueDetails.allowedUriSans) &&
        Objects.equals(this.basicConstraintsValidForNonCa, pkICertificateIssueDetails.basicConstraintsValidForNonCa) &&
        Objects.equals(this.clientFlag, pkICertificateIssueDetails.clientFlag) &&
        Objects.equals(this.codeSigningFlag, pkICertificateIssueDetails.codeSigningFlag) &&
        Objects.equals(this.country, pkICertificateIssueDetails.country) &&
        Objects.equals(this.enforceHostnames, pkICertificateIssueDetails.enforceHostnames) &&
        Objects.equals(this.isCa, pkICertificateIssueDetails.isCa) &&
        Objects.equals(this.keyBits, pkICertificateIssueDetails.keyBits) &&
        Objects.equals(this.keyType, pkICertificateIssueDetails.keyType) &&
        Objects.equals(this.keyUsageList, pkICertificateIssueDetails.keyUsageList) &&
        Objects.equals(this.locality, pkICertificateIssueDetails.locality) &&
        Objects.equals(this.notBeforeDuration, pkICertificateIssueDetails.notBeforeDuration) &&
        Objects.equals(this.organizationList, pkICertificateIssueDetails.organizationList) &&
        Objects.equals(this.organizationUnitList, pkICertificateIssueDetails.organizationUnitList) &&
        Objects.equals(this.postalCode, pkICertificateIssueDetails.postalCode) &&
        Objects.equals(this.province, pkICertificateIssueDetails.province) &&
        Objects.equals(this.requireCn, pkICertificateIssueDetails.requireCn) &&
        Objects.equals(this.serverFlag, pkICertificateIssueDetails.serverFlag) &&
        Objects.equals(this.streetAddress, pkICertificateIssueDetails.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAnyName, allowSubdomains, allowedDomainsList, allowedUriSans, basicConstraintsValidForNonCa, clientFlag, codeSigningFlag, country, enforceHostnames, isCa, keyBits, keyType, keyUsageList, locality, notBeforeDuration, organizationList, organizationUnitList, postalCode, province, requireCn, serverFlag, streetAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PKICertificateIssueDetails {\n");
    sb.append("    allowAnyName: ").append(toIndentedString(allowAnyName)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomainsList: ").append(toIndentedString(allowedDomainsList)).append("\n");
    sb.append("    allowedUriSans: ").append(toIndentedString(allowedUriSans)).append("\n");
    sb.append("    basicConstraintsValidForNonCa: ").append(toIndentedString(basicConstraintsValidForNonCa)).append("\n");
    sb.append("    clientFlag: ").append(toIndentedString(clientFlag)).append("\n");
    sb.append("    codeSigningFlag: ").append(toIndentedString(codeSigningFlag)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    enforceHostnames: ").append(toIndentedString(enforceHostnames)).append("\n");
    sb.append("    isCa: ").append(toIndentedString(isCa)).append("\n");
    sb.append("    keyBits: ").append(toIndentedString(keyBits)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    keyUsageList: ").append(toIndentedString(keyUsageList)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    notBeforeDuration: ").append(toIndentedString(notBeforeDuration)).append("\n");
    sb.append("    organizationList: ").append(toIndentedString(organizationList)).append("\n");
    sb.append("    organizationUnitList: ").append(toIndentedString(organizationUnitList)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

