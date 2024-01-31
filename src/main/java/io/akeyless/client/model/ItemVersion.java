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
import io.akeyless.client.model.CertificateVersionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ItemVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemVersion {
  public static final String SERIALIZED_NAME_ACCESS_DATE = "access_date";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE)
  private OffsetDateTime accessDate;

  public static final String SERIALIZED_NAME_ACCESS_DATE_DISPLAY = "access_date_display";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE_DISPLAY)
  private String accessDateDisplay;

  public static final String SERIALIZED_NAME_CERTIFICATE_VERSION_INFO = "certificate_version_info";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_VERSION_INFO)
  private CertificateVersionInfo certificateVersionInfo;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_CUSTOMER_FRAGMENT_ID = "customer_fragment_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRAGMENT_ID)
  private String customerFragmentId;

  public static final String SERIALIZED_NAME_DELETION_DATE = "deletion_date";
  @SerializedName(SERIALIZED_NAME_DELETION_DATE)
  private OffsetDateTime deletionDate;

  public static final String SERIALIZED_NAME_ITEM_VERSION_STATE = "item_version_state";
  @SerializedName(SERIALIZED_NAME_ITEM_VERSION_STATE)
  private String itemVersionState;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection_key_name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  private Boolean withCustomerFragment;

  public ItemVersion() { 
  }

  public ItemVersion accessDate(OffsetDateTime accessDate) {
    
    this.accessDate = accessDate;
    return this;
  }

   /**
   * Get accessDate
   * @return accessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAccessDate() {
    return accessDate;
  }


  public void setAccessDate(OffsetDateTime accessDate) {
    this.accessDate = accessDate;
  }


  public ItemVersion accessDateDisplay(String accessDateDisplay) {
    
    this.accessDateDisplay = accessDateDisplay;
    return this;
  }

   /**
   * Get accessDateDisplay
   * @return accessDateDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessDateDisplay() {
    return accessDateDisplay;
  }


  public void setAccessDateDisplay(String accessDateDisplay) {
    this.accessDateDisplay = accessDateDisplay;
  }


  public ItemVersion certificateVersionInfo(CertificateVersionInfo certificateVersionInfo) {
    
    this.certificateVersionInfo = certificateVersionInfo;
    return this;
  }

   /**
   * Get certificateVersionInfo
   * @return certificateVersionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateVersionInfo getCertificateVersionInfo() {
    return certificateVersionInfo;
  }


  public void setCertificateVersionInfo(CertificateVersionInfo certificateVersionInfo) {
    this.certificateVersionInfo = certificateVersionInfo;
  }


  public ItemVersion creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ItemVersion customerFragmentId(String customerFragmentId) {
    
    this.customerFragmentId = customerFragmentId;
    return this;
  }

   /**
   * Get customerFragmentId
   * @return customerFragmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerFragmentId() {
    return customerFragmentId;
  }


  public void setCustomerFragmentId(String customerFragmentId) {
    this.customerFragmentId = customerFragmentId;
  }


  public ItemVersion deletionDate(OffsetDateTime deletionDate) {
    
    this.deletionDate = deletionDate;
    return this;
  }

   /**
   * Get deletionDate
   * @return deletionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeletionDate() {
    return deletionDate;
  }


  public void setDeletionDate(OffsetDateTime deletionDate) {
    this.deletionDate = deletionDate;
  }


  public ItemVersion itemVersionState(String itemVersionState) {
    
    this.itemVersionState = itemVersionState;
    return this;
  }

   /**
   * ItemState defines the different states an Item can be in
   * @return itemVersionState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ItemState defines the different states an Item can be in")

  public String getItemVersionState() {
    return itemVersionState;
  }


  public void setItemVersionState(String itemVersionState) {
    this.itemVersionState = itemVersionState;
  }


  public ItemVersion modificationDate(OffsetDateTime modificationDate) {
    
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }


  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public ItemVersion protectionKeyName(String protectionKeyName) {
    
    this.protectionKeyName = protectionKeyName;
    return this;
  }

   /**
   * Get protectionKeyName
   * @return protectionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtectionKeyName() {
    return protectionKeyName;
  }


  public void setProtectionKeyName(String protectionKeyName) {
    this.protectionKeyName = protectionKeyName;
  }


  public ItemVersion version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ItemVersion withCustomerFragment(Boolean withCustomerFragment) {
    
    this.withCustomerFragment = withCustomerFragment;
    return this;
  }

   /**
   * Get withCustomerFragment
   * @return withCustomerFragment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithCustomerFragment() {
    return withCustomerFragment;
  }


  public void setWithCustomerFragment(Boolean withCustomerFragment) {
    this.withCustomerFragment = withCustomerFragment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemVersion itemVersion = (ItemVersion) o;
    return Objects.equals(this.accessDate, itemVersion.accessDate) &&
        Objects.equals(this.accessDateDisplay, itemVersion.accessDateDisplay) &&
        Objects.equals(this.certificateVersionInfo, itemVersion.certificateVersionInfo) &&
        Objects.equals(this.creationDate, itemVersion.creationDate) &&
        Objects.equals(this.customerFragmentId, itemVersion.customerFragmentId) &&
        Objects.equals(this.deletionDate, itemVersion.deletionDate) &&
        Objects.equals(this.itemVersionState, itemVersion.itemVersionState) &&
        Objects.equals(this.modificationDate, itemVersion.modificationDate) &&
        Objects.equals(this.protectionKeyName, itemVersion.protectionKeyName) &&
        Objects.equals(this.version, itemVersion.version) &&
        Objects.equals(this.withCustomerFragment, itemVersion.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDate, accessDateDisplay, certificateVersionInfo, creationDate, customerFragmentId, deletionDate, itemVersionState, modificationDate, protectionKeyName, version, withCustomerFragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemVersion {\n");
    sb.append("    accessDate: ").append(toIndentedString(accessDate)).append("\n");
    sb.append("    accessDateDisplay: ").append(toIndentedString(accessDateDisplay)).append("\n");
    sb.append("    certificateVersionInfo: ").append(toIndentedString(certificateVersionInfo)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customerFragmentId: ").append(toIndentedString(customerFragmentId)).append("\n");
    sb.append("    deletionDate: ").append(toIndentedString(deletionDate)).append("\n");
    sb.append("    itemVersionState: ").append(toIndentedString(itemVersionState)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    protectionKeyName: ").append(toIndentedString(protectionKeyName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    withCustomerFragment: ").append(toIndentedString(withCustomerFragment)).append("\n");
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

