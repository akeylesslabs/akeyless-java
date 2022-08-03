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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountGeneralSettings describes general settings for an account
 */
@ApiModel(description = "AccountGeneralSettings describes general settings for an account")

public class AccountGeneralSettings {
  public static final String SERIALIZED_NAME_DATA_PROTECTION_SECTION = "data_protection_section";
  @SerializedName(SERIALIZED_NAME_DATA_PROTECTION_SECTION)
  private DataProtectionSection dataProtectionSection;


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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGeneralSettings accountGeneralSettings = (AccountGeneralSettings) o;
    return Objects.equals(this.dataProtectionSection, accountGeneralSettings.dataProtectionSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProtectionSection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGeneralSettings {\n");
    sb.append("    dataProtectionSection: ").append(toIndentedString(dataProtectionSection)).append("\n");
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
