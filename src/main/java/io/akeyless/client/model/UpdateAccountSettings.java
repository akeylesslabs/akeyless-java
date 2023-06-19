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

/**
 * UpdateAccountSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAccountSettings {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company-name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DEFAULT_SHARE_LINK_TTL_MINUTES = "default-share-link-ttl-minutes";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SHARE_LINK_TTL_MINUTES)
  private String defaultShareLinkTtlMinutes;

  public static final String SERIALIZED_NAME_DEFAULT_VERSIONING = "default-versioning";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VERSIONING)
  private String defaultVersioning;

  public static final String SERIALIZED_NAME_DP_ENABLE_CLASSIC_KEY_PROTECTION = "dp-enable-classic-key-protection";
  @SerializedName(SERIALIZED_NAME_DP_ENABLE_CLASSIC_KEY_PROTECTION)
  private String dpEnableClassicKeyProtection;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item-type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public static final String SERIALIZED_NAME_ITEMS_DELETION_PROTECTION = "items-deletion-protection";
  @SerializedName(SERIALIZED_NAME_ITEMS_DELETION_PROTECTION)
  private String itemsDeletionProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL_DEFAULT = "jwt-ttl-default";
  @SerializedName(SERIALIZED_NAME_JWT_TTL_DEFAULT)
  private Long jwtTtlDefault;

  public static final String SERIALIZED_NAME_JWT_TTL_MAX = "jwt-ttl-max";
  @SerializedName(SERIALIZED_NAME_JWT_TTL_MAX)
  private Long jwtTtlMax;

  public static final String SERIALIZED_NAME_JWT_TTL_MIN = "jwt-ttl-min";
  @SerializedName(SERIALIZED_NAME_JWT_TTL_MIN)
  private Long jwtTtlMin;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private Long passwordLength;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal-code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_LOWER_LETTERS = "use-lower-letters";
  @SerializedName(SERIALIZED_NAME_USE_LOWER_LETTERS)
  private String useLowerLetters;

  public static final String SERIALIZED_NAME_USE_NUMBERS = "use-numbers";
  @SerializedName(SERIALIZED_NAME_USE_NUMBERS)
  private String useNumbers;

  public static final String SERIALIZED_NAME_USE_SPECIAL_CHARACTERS = "use-special-characters";
  @SerializedName(SERIALIZED_NAME_USE_SPECIAL_CHARACTERS)
  private String useSpecialCharacters;

  public static final String SERIALIZED_NAME_USE_CAPITAL_LETTERS = "use_capital-letters";
  @SerializedName(SERIALIZED_NAME_USE_CAPITAL_LETTERS)
  private String useCapitalLetters;

  public UpdateAccountSettings() { 
  }

  public UpdateAccountSettings address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public UpdateAccountSettings city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UpdateAccountSettings companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company name")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public UpdateAccountSettings country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public UpdateAccountSettings defaultShareLinkTtlMinutes(String defaultShareLinkTtlMinutes) {
    
    this.defaultShareLinkTtlMinutes = defaultShareLinkTtlMinutes;
    return this;
  }

   /**
   * Set the default ttl in minutes for sharing item number between 60 and 43200
   * @return defaultShareLinkTtlMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the default ttl in minutes for sharing item number between 60 and 43200")

  public String getDefaultShareLinkTtlMinutes() {
    return defaultShareLinkTtlMinutes;
  }


  public void setDefaultShareLinkTtlMinutes(String defaultShareLinkTtlMinutes) {
    this.defaultShareLinkTtlMinutes = defaultShareLinkTtlMinutes;
  }


  public UpdateAccountSettings defaultVersioning(String defaultVersioning) {
    
    this.defaultVersioning = defaultVersioning;
    return this;
  }

   /**
   * If set to true, new item version will be created on each update [true/false]
   * @return defaultVersioning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, new item version will be created on each update [true/false]")

  public String getDefaultVersioning() {
    return defaultVersioning;
  }


  public void setDefaultVersioning(String defaultVersioning) {
    this.defaultVersioning = defaultVersioning;
  }


  public UpdateAccountSettings dpEnableClassicKeyProtection(String dpEnableClassicKeyProtection) {
    
    this.dpEnableClassicKeyProtection = dpEnableClassicKeyProtection;
    return this;
  }

   /**
   * Set to update protection with classic keys state [true/false]
   * @return dpEnableClassicKeyProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to update protection with classic keys state [true/false]")

  public String getDpEnableClassicKeyProtection() {
    return dpEnableClassicKeyProtection;
  }


  public void setDpEnableClassicKeyProtection(String dpEnableClassicKeyProtection) {
    this.dpEnableClassicKeyProtection = dpEnableClassicKeyProtection;
  }


  public UpdateAccountSettings itemType(String itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * VersionSettingsObjectType defines object types for account version settings
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VersionSettingsObjectType defines object types for account version settings")

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  public UpdateAccountSettings itemsDeletionProtection(String itemsDeletionProtection) {
    
    this.itemsDeletionProtection = itemsDeletionProtection;
    return this;
  }

   /**
   * Set or unset the default behaviour of items deletion protection [true/false]
   * @return itemsDeletionProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set or unset the default behaviour of items deletion protection [true/false]")

  public String getItemsDeletionProtection() {
    return itemsDeletionProtection;
  }


  public void setItemsDeletionProtection(String itemsDeletionProtection) {
    this.itemsDeletionProtection = itemsDeletionProtection;
  }


  public UpdateAccountSettings json(Boolean json) {
    
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


  public UpdateAccountSettings jwtTtlDefault(Long jwtTtlDefault) {
    
    this.jwtTtlDefault = jwtTtlDefault;
    return this;
  }

   /**
   * Default ttl
   * @return jwtTtlDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default ttl")

  public Long getJwtTtlDefault() {
    return jwtTtlDefault;
  }


  public void setJwtTtlDefault(Long jwtTtlDefault) {
    this.jwtTtlDefault = jwtTtlDefault;
  }


  public UpdateAccountSettings jwtTtlMax(Long jwtTtlMax) {
    
    this.jwtTtlMax = jwtTtlMax;
    return this;
  }

   /**
   * Maximum ttl
   * @return jwtTtlMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum ttl")

  public Long getJwtTtlMax() {
    return jwtTtlMax;
  }


  public void setJwtTtlMax(Long jwtTtlMax) {
    this.jwtTtlMax = jwtTtlMax;
  }


  public UpdateAccountSettings jwtTtlMin(Long jwtTtlMin) {
    
    this.jwtTtlMin = jwtTtlMin;
    return this;
  }

   /**
   * Minimum ttl
   * @return jwtTtlMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum ttl")

  public Long getJwtTtlMin() {
    return jwtTtlMin;
  }


  public void setJwtTtlMin(Long jwtTtlMin) {
    this.jwtTtlMin = jwtTtlMin;
  }


  public UpdateAccountSettings maxVersions(String maxVersions) {
    
    this.maxVersions = maxVersions;
    return this;
  }

   /**
   * Max versions
   * @return maxVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max versions")

  public String getMaxVersions() {
    return maxVersions;
  }


  public void setMaxVersions(String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public UpdateAccountSettings passwordLength(Long passwordLength) {
    
    this.passwordLength = passwordLength;
    return this;
  }

   /**
   * Password length between 5 - to 50 characters
   * @return passwordLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password length between 5 - to 50 characters")

  public Long getPasswordLength() {
    return passwordLength;
  }


  public void setPasswordLength(Long passwordLength) {
    this.passwordLength = passwordLength;
  }


  public UpdateAccountSettings phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public UpdateAccountSettings postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public UpdateAccountSettings token(String token) {
    
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


  public UpdateAccountSettings uidToken(String uidToken) {
    
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


  public UpdateAccountSettings useLowerLetters(String useLowerLetters) {
    
    this.useLowerLetters = useLowerLetters;
    return this;
  }

   /**
   * Password must contain lower case letters [true/false]
   * @return useLowerLetters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password must contain lower case letters [true/false]")

  public String getUseLowerLetters() {
    return useLowerLetters;
  }


  public void setUseLowerLetters(String useLowerLetters) {
    this.useLowerLetters = useLowerLetters;
  }


  public UpdateAccountSettings useNumbers(String useNumbers) {
    
    this.useNumbers = useNumbers;
    return this;
  }

   /**
   * Password must contain numbers [true/false]
   * @return useNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password must contain numbers [true/false]")

  public String getUseNumbers() {
    return useNumbers;
  }


  public void setUseNumbers(String useNumbers) {
    this.useNumbers = useNumbers;
  }


  public UpdateAccountSettings useSpecialCharacters(String useSpecialCharacters) {
    
    this.useSpecialCharacters = useSpecialCharacters;
    return this;
  }

   /**
   * Password must contain special characters [true/false]
   * @return useSpecialCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password must contain special characters [true/false]")

  public String getUseSpecialCharacters() {
    return useSpecialCharacters;
  }


  public void setUseSpecialCharacters(String useSpecialCharacters) {
    this.useSpecialCharacters = useSpecialCharacters;
  }


  public UpdateAccountSettings useCapitalLetters(String useCapitalLetters) {
    
    this.useCapitalLetters = useCapitalLetters;
    return this;
  }

   /**
   * Password must contain capital letters [true/false]
   * @return useCapitalLetters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password must contain capital letters [true/false]")

  public String getUseCapitalLetters() {
    return useCapitalLetters;
  }


  public void setUseCapitalLetters(String useCapitalLetters) {
    this.useCapitalLetters = useCapitalLetters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountSettings updateAccountSettings = (UpdateAccountSettings) o;
    return Objects.equals(this.address, updateAccountSettings.address) &&
        Objects.equals(this.city, updateAccountSettings.city) &&
        Objects.equals(this.companyName, updateAccountSettings.companyName) &&
        Objects.equals(this.country, updateAccountSettings.country) &&
        Objects.equals(this.defaultShareLinkTtlMinutes, updateAccountSettings.defaultShareLinkTtlMinutes) &&
        Objects.equals(this.defaultVersioning, updateAccountSettings.defaultVersioning) &&
        Objects.equals(this.dpEnableClassicKeyProtection, updateAccountSettings.dpEnableClassicKeyProtection) &&
        Objects.equals(this.itemType, updateAccountSettings.itemType) &&
        Objects.equals(this.itemsDeletionProtection, updateAccountSettings.itemsDeletionProtection) &&
        Objects.equals(this.json, updateAccountSettings.json) &&
        Objects.equals(this.jwtTtlDefault, updateAccountSettings.jwtTtlDefault) &&
        Objects.equals(this.jwtTtlMax, updateAccountSettings.jwtTtlMax) &&
        Objects.equals(this.jwtTtlMin, updateAccountSettings.jwtTtlMin) &&
        Objects.equals(this.maxVersions, updateAccountSettings.maxVersions) &&
        Objects.equals(this.passwordLength, updateAccountSettings.passwordLength) &&
        Objects.equals(this.phone, updateAccountSettings.phone) &&
        Objects.equals(this.postalCode, updateAccountSettings.postalCode) &&
        Objects.equals(this.token, updateAccountSettings.token) &&
        Objects.equals(this.uidToken, updateAccountSettings.uidToken) &&
        Objects.equals(this.useLowerLetters, updateAccountSettings.useLowerLetters) &&
        Objects.equals(this.useNumbers, updateAccountSettings.useNumbers) &&
        Objects.equals(this.useSpecialCharacters, updateAccountSettings.useSpecialCharacters) &&
        Objects.equals(this.useCapitalLetters, updateAccountSettings.useCapitalLetters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, companyName, country, defaultShareLinkTtlMinutes, defaultVersioning, dpEnableClassicKeyProtection, itemType, itemsDeletionProtection, json, jwtTtlDefault, jwtTtlMax, jwtTtlMin, maxVersions, passwordLength, phone, postalCode, token, uidToken, useLowerLetters, useNumbers, useSpecialCharacters, useCapitalLetters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountSettings {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultShareLinkTtlMinutes: ").append(toIndentedString(defaultShareLinkTtlMinutes)).append("\n");
    sb.append("    defaultVersioning: ").append(toIndentedString(defaultVersioning)).append("\n");
    sb.append("    dpEnableClassicKeyProtection: ").append(toIndentedString(dpEnableClassicKeyProtection)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    itemsDeletionProtection: ").append(toIndentedString(itemsDeletionProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtlDefault: ").append(toIndentedString(jwtTtlDefault)).append("\n");
    sb.append("    jwtTtlMax: ").append(toIndentedString(jwtTtlMax)).append("\n");
    sb.append("    jwtTtlMin: ").append(toIndentedString(jwtTtlMin)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useLowerLetters: ").append(toIndentedString(useLowerLetters)).append("\n");
    sb.append("    useNumbers: ").append(toIndentedString(useNumbers)).append("\n");
    sb.append("    useSpecialCharacters: ").append(toIndentedString(useSpecialCharacters)).append("\n");
    sb.append("    useCapitalLetters: ").append(toIndentedString(useCapitalLetters)).append("\n");
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

