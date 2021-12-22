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
import org.threeten.bp.OffsetDateTime;

/**
 * TargetItemVersion
 */

public class TargetItemVersion {
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

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection_key_name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  private Boolean withCustomerFragment;


  public TargetItemVersion creationDate(OffsetDateTime creationDate) {
    
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


  public TargetItemVersion customerFragmentId(String customerFragmentId) {
    
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


  public TargetItemVersion deletionDate(OffsetDateTime deletionDate) {
    
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


  public TargetItemVersion itemVersionState(String itemVersionState) {
    
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


  public TargetItemVersion protectionKeyName(String protectionKeyName) {
    
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


  public TargetItemVersion targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Get targetName
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public TargetItemVersion version(Integer version) {
    
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


  public TargetItemVersion withCustomerFragment(Boolean withCustomerFragment) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetItemVersion targetItemVersion = (TargetItemVersion) o;
    return Objects.equals(this.creationDate, targetItemVersion.creationDate) &&
        Objects.equals(this.customerFragmentId, targetItemVersion.customerFragmentId) &&
        Objects.equals(this.deletionDate, targetItemVersion.deletionDate) &&
        Objects.equals(this.itemVersionState, targetItemVersion.itemVersionState) &&
        Objects.equals(this.protectionKeyName, targetItemVersion.protectionKeyName) &&
        Objects.equals(this.targetName, targetItemVersion.targetName) &&
        Objects.equals(this.version, targetItemVersion.version) &&
        Objects.equals(this.withCustomerFragment, targetItemVersion.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, customerFragmentId, deletionDate, itemVersionState, protectionKeyName, targetName, version, withCustomerFragment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetItemVersion {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customerFragmentId: ").append(toIndentedString(customerFragmentId)).append("\n");
    sb.append("    deletionDate: ").append(toIndentedString(deletionDate)).append("\n");
    sb.append("    itemVersionState: ").append(toIndentedString(itemVersionState)).append("\n");
    sb.append("    protectionKeyName: ").append(toIndentedString(protectionKeyName)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    withCustomerFragment: ").append(toIndentedString(withCustomerFragment)).append("\n");
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
