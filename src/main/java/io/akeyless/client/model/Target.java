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
import io.akeyless.client.model.ItemVersion;
import io.akeyless.client.model.TargetItemAssociation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Target {
  public static final String SERIALIZED_NAME_ACCESS_DATE = "access_date";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE)
  private OffsetDateTime accessDate;

  public static final String SERIALIZED_NAME_ACCESS_DATE_DISPLAY = "access_date_display";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE_DISPLAY)
  private String accessDateDisplay;

  public static final String SERIALIZED_NAME_ACCESS_REQUEST_STATUS = "access_request_status";
  @SerializedName(SERIALIZED_NAME_ACCESS_REQUEST_STATUS)
  private String accessRequestStatus;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  private List<String> clientPermissions = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_CREDENTIALS_LESS = "credentials_less";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_LESS)
  private Boolean credentialsLess;

  public static final String SERIALIZED_NAME_IS_ACCESS_REQUEST_ENABLED = "is_access_request_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ACCESS_REQUEST_ENABLED)
  private Boolean isAccessRequestEnabled;

  public static final String SERIALIZED_NAME_LAST_VERSION = "last_version";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION)
  private Integer lastVersion;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection_key_name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_TARGET_DETAILS = "target_details";
  @SerializedName(SERIALIZED_NAME_TARGET_DETAILS)
  private String targetDetails;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private Long targetId;

  public static final String SERIALIZED_NAME_TARGET_ITEMS_ASSOC = "target_items_assoc";
  @SerializedName(SERIALIZED_NAME_TARGET_ITEMS_ASSOC)
  private List<TargetItemAssociation> targetItemsAssoc = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_SUB_TYPE = "target_sub_type";
  @SerializedName(SERIALIZED_NAME_TARGET_SUB_TYPE)
  private String targetSubType;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_TARGET_VERSIONS = "target_versions";
  @SerializedName(SERIALIZED_NAME_TARGET_VERSIONS)
  private List<ItemVersion> targetVersions = null;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  private Boolean withCustomerFragment;

  public Target() { 
  }

  public Target accessDate(OffsetDateTime accessDate) {
    
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


  public Target accessDateDisplay(String accessDateDisplay) {
    
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


  public Target accessRequestStatus(String accessRequestStatus) {
    
    this.accessRequestStatus = accessRequestStatus;
    return this;
  }

   /**
   * Get accessRequestStatus
   * @return accessRequestStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessRequestStatus() {
    return accessRequestStatus;
  }


  public void setAccessRequestStatus(String accessRequestStatus) {
    this.accessRequestStatus = accessRequestStatus;
  }


  public Target attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Target putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * this is not \&quot;omitempty\&quot; since an empty value causes no update while an empty map will clear the attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this is not \"omitempty\" since an empty value causes no update while an empty map will clear the attributes")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Target clientPermissions(List<String> clientPermissions) {
    
    this.clientPermissions = clientPermissions;
    return this;
  }

  public Target addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<String>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

   /**
   * Get clientPermissions
   * @return clientPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getClientPermissions() {
    return clientPermissions;
  }


  public void setClientPermissions(List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public Target comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public Target creationDate(OffsetDateTime creationDate) {
    
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


  public Target credentialsLess(Boolean credentialsLess) {
    
    this.credentialsLess = credentialsLess;
    return this;
  }

   /**
   * Get credentialsLess
   * @return credentialsLess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCredentialsLess() {
    return credentialsLess;
  }


  public void setCredentialsLess(Boolean credentialsLess) {
    this.credentialsLess = credentialsLess;
  }


  public Target isAccessRequestEnabled(Boolean isAccessRequestEnabled) {
    
    this.isAccessRequestEnabled = isAccessRequestEnabled;
    return this;
  }

   /**
   * Get isAccessRequestEnabled
   * @return isAccessRequestEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAccessRequestEnabled() {
    return isAccessRequestEnabled;
  }


  public void setIsAccessRequestEnabled(Boolean isAccessRequestEnabled) {
    this.isAccessRequestEnabled = isAccessRequestEnabled;
  }


  public Target lastVersion(Integer lastVersion) {
    
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * Get lastVersion
   * @return lastVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastVersion() {
    return lastVersion;
  }


  public void setLastVersion(Integer lastVersion) {
    this.lastVersion = lastVersion;
  }


  public Target modificationDate(OffsetDateTime modificationDate) {
    
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


  public Target protectionKeyName(String protectionKeyName) {
    
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


  public Target targetDetails(String targetDetails) {
    
    this.targetDetails = targetDetails;
    return this;
  }

   /**
   * Get targetDetails
   * @return targetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetDetails() {
    return targetDetails;
  }


  public void setTargetDetails(String targetDetails) {
    this.targetDetails = targetDetails;
  }


  public Target targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTargetId() {
    return targetId;
  }


  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public Target targetItemsAssoc(List<TargetItemAssociation> targetItemsAssoc) {
    
    this.targetItemsAssoc = targetItemsAssoc;
    return this;
  }

  public Target addTargetItemsAssocItem(TargetItemAssociation targetItemsAssocItem) {
    if (this.targetItemsAssoc == null) {
      this.targetItemsAssoc = new ArrayList<TargetItemAssociation>();
    }
    this.targetItemsAssoc.add(targetItemsAssocItem);
    return this;
  }

   /**
   * Get targetItemsAssoc
   * @return targetItemsAssoc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TargetItemAssociation> getTargetItemsAssoc() {
    return targetItemsAssoc;
  }


  public void setTargetItemsAssoc(List<TargetItemAssociation> targetItemsAssoc) {
    this.targetItemsAssoc = targetItemsAssoc;
  }


  public Target targetName(String targetName) {
    
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


  public Target targetSubType(String targetSubType) {
    
    this.targetSubType = targetSubType;
    return this;
  }

   /**
   * Get targetSubType
   * @return targetSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetSubType() {
    return targetSubType;
  }


  public void setTargetSubType(String targetSubType) {
    this.targetSubType = targetSubType;
  }


  public Target targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public Target targetVersions(List<ItemVersion> targetVersions) {
    
    this.targetVersions = targetVersions;
    return this;
  }

  public Target addTargetVersionsItem(ItemVersion targetVersionsItem) {
    if (this.targetVersions == null) {
      this.targetVersions = new ArrayList<ItemVersion>();
    }
    this.targetVersions.add(targetVersionsItem);
    return this;
  }

   /**
   * Get targetVersions
   * @return targetVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemVersion> getTargetVersions() {
    return targetVersions;
  }


  public void setTargetVersions(List<ItemVersion> targetVersions) {
    this.targetVersions = targetVersions;
  }


  public Target withCustomerFragment(Boolean withCustomerFragment) {
    
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
    Target target = (Target) o;
    return Objects.equals(this.accessDate, target.accessDate) &&
        Objects.equals(this.accessDateDisplay, target.accessDateDisplay) &&
        Objects.equals(this.accessRequestStatus, target.accessRequestStatus) &&
        Objects.equals(this.attributes, target.attributes) &&
        Objects.equals(this.clientPermissions, target.clientPermissions) &&
        Objects.equals(this.comment, target.comment) &&
        Objects.equals(this.creationDate, target.creationDate) &&
        Objects.equals(this.credentialsLess, target.credentialsLess) &&
        Objects.equals(this.isAccessRequestEnabled, target.isAccessRequestEnabled) &&
        Objects.equals(this.lastVersion, target.lastVersion) &&
        Objects.equals(this.modificationDate, target.modificationDate) &&
        Objects.equals(this.protectionKeyName, target.protectionKeyName) &&
        Objects.equals(this.targetDetails, target.targetDetails) &&
        Objects.equals(this.targetId, target.targetId) &&
        Objects.equals(this.targetItemsAssoc, target.targetItemsAssoc) &&
        Objects.equals(this.targetName, target.targetName) &&
        Objects.equals(this.targetSubType, target.targetSubType) &&
        Objects.equals(this.targetType, target.targetType) &&
        Objects.equals(this.targetVersions, target.targetVersions) &&
        Objects.equals(this.withCustomerFragment, target.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDate, accessDateDisplay, accessRequestStatus, attributes, clientPermissions, comment, creationDate, credentialsLess, isAccessRequestEnabled, lastVersion, modificationDate, protectionKeyName, targetDetails, targetId, targetItemsAssoc, targetName, targetSubType, targetType, targetVersions, withCustomerFragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    sb.append("    accessDate: ").append(toIndentedString(accessDate)).append("\n");
    sb.append("    accessDateDisplay: ").append(toIndentedString(accessDateDisplay)).append("\n");
    sb.append("    accessRequestStatus: ").append(toIndentedString(accessRequestStatus)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    credentialsLess: ").append(toIndentedString(credentialsLess)).append("\n");
    sb.append("    isAccessRequestEnabled: ").append(toIndentedString(isAccessRequestEnabled)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    protectionKeyName: ").append(toIndentedString(protectionKeyName)).append("\n");
    sb.append("    targetDetails: ").append(toIndentedString(targetDetails)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetItemsAssoc: ").append(toIndentedString(targetItemsAssoc)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetSubType: ").append(toIndentedString(targetSubType)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
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

