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
import io.akeyless.client.model.DataProtectionSection;
import io.akeyless.client.model.PasswordPolicyInfo;
import io.akeyless.client.model.SharingPolicyInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountGeneralSettings describes general settings for an account
 */
@ApiModel(description = "AccountGeneralSettings describes general settings for an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountGeneralSettings {
  public static final String SERIALIZED_NAME_DATA_PROTECTION_SECTION = "data_protection_section";
  @SerializedName(SERIALIZED_NAME_DATA_PROTECTION_SECTION)
  private DataProtectionSection dataProtectionSection;

  public static final String SERIALIZED_NAME_ENABLE_REQUEST_FOR_ACCESS = "enable_request_for_access";
  @SerializedName(SERIALIZED_NAME_ENABLE_REQUEST_FOR_ACCESS)
  private Boolean enableRequestForAccess;

  public static final String SERIALIZED_NAME_PASSWORD_POLICY = "password_policy";
  @SerializedName(SERIALIZED_NAME_PASSWORD_POLICY)
  private PasswordPolicyInfo passwordPolicy;

  public static final String SERIALIZED_NAME_SHARING_POLICY = "sharing_policy";
  @SerializedName(SERIALIZED_NAME_SHARING_POLICY)
  private SharingPolicyInfo sharingPolicy;

  public AccountGeneralSettings() { 
  }

  public AccountGeneralSettings dataProtectionSection(DataProtectionSection dataProtectionSection) {
    
    this.dataProtectionSection = dataProtectionSection;
    return this;
  }

   /**
   * Get dataProtectionSection
   * @return dataProtectionSection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataProtectionSection getDataProtectionSection() {
    return dataProtectionSection;
  }


  public void setDataProtectionSection(DataProtectionSection dataProtectionSection) {
    this.dataProtectionSection = dataProtectionSection;
  }


  public AccountGeneralSettings enableRequestForAccess(Boolean enableRequestForAccess) {
    
    this.enableRequestForAccess = enableRequestForAccess;
    return this;
  }

   /**
   * Get enableRequestForAccess
   * @return enableRequestForAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableRequestForAccess() {
    return enableRequestForAccess;
  }


  public void setEnableRequestForAccess(Boolean enableRequestForAccess) {
    this.enableRequestForAccess = enableRequestForAccess;
  }


  public AccountGeneralSettings passwordPolicy(PasswordPolicyInfo passwordPolicy) {
    
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Get passwordPolicy
   * @return passwordPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PasswordPolicyInfo getPasswordPolicy() {
    return passwordPolicy;
  }


  public void setPasswordPolicy(PasswordPolicyInfo passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }


  public AccountGeneralSettings sharingPolicy(SharingPolicyInfo sharingPolicy) {
    
    this.sharingPolicy = sharingPolicy;
    return this;
  }

   /**
   * Get sharingPolicy
   * @return sharingPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SharingPolicyInfo getSharingPolicy() {
    return sharingPolicy;
  }


  public void setSharingPolicy(SharingPolicyInfo sharingPolicy) {
    this.sharingPolicy = sharingPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGeneralSettings accountGeneralSettings = (AccountGeneralSettings) o;
    return Objects.equals(this.dataProtectionSection, accountGeneralSettings.dataProtectionSection) &&
        Objects.equals(this.enableRequestForAccess, accountGeneralSettings.enableRequestForAccess) &&
        Objects.equals(this.passwordPolicy, accountGeneralSettings.passwordPolicy) &&
        Objects.equals(this.sharingPolicy, accountGeneralSettings.sharingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProtectionSection, enableRequestForAccess, passwordPolicy, sharingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGeneralSettings {\n");
    sb.append("    dataProtectionSection: ").append(toIndentedString(dataProtectionSection)).append("\n");
    sb.append("    enableRequestForAccess: ").append(toIndentedString(enableRequestForAccess)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    sharingPolicy: ").append(toIndentedString(sharingPolicy)).append("\n");
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

