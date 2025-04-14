/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.akeyless.client.model.ItemVersion;
import io.akeyless.client.model.TargetItemAssociation;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * Target
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Target {
  public static final String SERIALIZED_NAME_ACCESS_DATE = "access_date";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime accessDate;

  public static final String SERIALIZED_NAME_ACCESS_DATE_DISPLAY = "access_date_display";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE_DISPLAY)
  @javax.annotation.Nullable
  private String accessDateDisplay;

  public static final String SERIALIZED_NAME_ACCESS_REQUEST_STATUS = "access_request_status";
  @SerializedName(SERIALIZED_NAME_ACCESS_REQUEST_STATUS)
  @javax.annotation.Nullable
  private String accessRequestStatus;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private Map<String, Object> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  @javax.annotation.Nullable
  private List<String> clientPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_IS_ACCESS_REQUEST_ENABLED = "is_access_request_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ACCESS_REQUEST_ENABLED)
  @javax.annotation.Nullable
  private Boolean isAccessRequestEnabled;

  public static final String SERIALIZED_NAME_LAST_VERSION = "last_version";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION)
  @javax.annotation.Nullable
  private Integer lastVersion;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_PARENT_TARGET_NAME = "parent_target_name";
  @SerializedName(SERIALIZED_NAME_PARENT_TARGET_NAME)
  @javax.annotation.Nullable
  private String parentTargetName;

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection_key_name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  @javax.annotation.Nullable
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_TARGET_DETAILS = "target_details";
  @SerializedName(SERIALIZED_NAME_TARGET_DETAILS)
  @javax.annotation.Nullable
  private String targetDetails;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  @javax.annotation.Nullable
  private Long targetId;

  public static final String SERIALIZED_NAME_TARGET_ITEMS_ASSOC = "target_items_assoc";
  @SerializedName(SERIALIZED_NAME_TARGET_ITEMS_ASSOC)
  @javax.annotation.Nullable
  private List<TargetItemAssociation> targetItemsAssoc = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_SUB_TYPE = "target_sub_type";
  @SerializedName(SERIALIZED_NAME_TARGET_SUB_TYPE)
  @javax.annotation.Nullable
  private String targetSubType;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  @javax.annotation.Nullable
  private String targetType;

  public static final String SERIALIZED_NAME_TARGET_VERSIONS = "target_versions";
  @SerializedName(SERIALIZED_NAME_TARGET_VERSIONS)
  @javax.annotation.Nullable
  private List<ItemVersion> targetVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  @javax.annotation.Nullable
  private Boolean withCustomerFragment;

  public Target() {
  }

  public Target accessDate(@javax.annotation.Nullable OffsetDateTime accessDate) {
    this.accessDate = accessDate;
    return this;
  }

  /**
   * Get accessDate
   * @return accessDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAccessDate() {
    return accessDate;
  }

  public void setAccessDate(@javax.annotation.Nullable OffsetDateTime accessDate) {
    this.accessDate = accessDate;
  }


  public Target accessDateDisplay(@javax.annotation.Nullable String accessDateDisplay) {
    this.accessDateDisplay = accessDateDisplay;
    return this;
  }

  /**
   * Get accessDateDisplay
   * @return accessDateDisplay
   */
  @javax.annotation.Nullable
  public String getAccessDateDisplay() {
    return accessDateDisplay;
  }

  public void setAccessDateDisplay(@javax.annotation.Nullable String accessDateDisplay) {
    this.accessDateDisplay = accessDateDisplay;
  }


  public Target accessRequestStatus(@javax.annotation.Nullable String accessRequestStatus) {
    this.accessRequestStatus = accessRequestStatus;
    return this;
  }

  /**
   * Get accessRequestStatus
   * @return accessRequestStatus
   */
  @javax.annotation.Nullable
  public String getAccessRequestStatus() {
    return accessRequestStatus;
  }

  public void setAccessRequestStatus(@javax.annotation.Nullable String accessRequestStatus) {
    this.accessRequestStatus = accessRequestStatus;
  }


  public Target attributes(@javax.annotation.Nullable Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Target putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * this is not \&quot;omitempty\&quot; since an empty value causes no update while an empty map will clear the attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Target clientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
    return this;
  }

  public Target addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

  /**
   * Get clientPermissions
   * @return clientPermissions
   */
  @javax.annotation.Nullable
  public List<String> getClientPermissions() {
    return clientPermissions;
  }

  public void setClientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public Target comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public Target creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Target isAccessRequestEnabled(@javax.annotation.Nullable Boolean isAccessRequestEnabled) {
    this.isAccessRequestEnabled = isAccessRequestEnabled;
    return this;
  }

  /**
   * Get isAccessRequestEnabled
   * @return isAccessRequestEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsAccessRequestEnabled() {
    return isAccessRequestEnabled;
  }

  public void setIsAccessRequestEnabled(@javax.annotation.Nullable Boolean isAccessRequestEnabled) {
    this.isAccessRequestEnabled = isAccessRequestEnabled;
  }


  public Target lastVersion(@javax.annotation.Nullable Integer lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

  /**
   * Get lastVersion
   * @return lastVersion
   */
  @javax.annotation.Nullable
  public Integer getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(@javax.annotation.Nullable Integer lastVersion) {
    this.lastVersion = lastVersion;
  }


  public Target modificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public Target parentTargetName(@javax.annotation.Nullable String parentTargetName) {
    this.parentTargetName = parentTargetName;
    return this;
  }

  /**
   * Get parentTargetName
   * @return parentTargetName
   */
  @javax.annotation.Nullable
  public String getParentTargetName() {
    return parentTargetName;
  }

  public void setParentTargetName(@javax.annotation.Nullable String parentTargetName) {
    this.parentTargetName = parentTargetName;
  }


  public Target protectionKeyName(@javax.annotation.Nullable String protectionKeyName) {
    this.protectionKeyName = protectionKeyName;
    return this;
  }

  /**
   * Get protectionKeyName
   * @return protectionKeyName
   */
  @javax.annotation.Nullable
  public String getProtectionKeyName() {
    return protectionKeyName;
  }

  public void setProtectionKeyName(@javax.annotation.Nullable String protectionKeyName) {
    this.protectionKeyName = protectionKeyName;
  }


  public Target targetDetails(@javax.annotation.Nullable String targetDetails) {
    this.targetDetails = targetDetails;
    return this;
  }

  /**
   * Get targetDetails
   * @return targetDetails
   */
  @javax.annotation.Nullable
  public String getTargetDetails() {
    return targetDetails;
  }

  public void setTargetDetails(@javax.annotation.Nullable String targetDetails) {
    this.targetDetails = targetDetails;
  }


  public Target targetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   */
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
  }


  public Target targetItemsAssoc(@javax.annotation.Nullable List<TargetItemAssociation> targetItemsAssoc) {
    this.targetItemsAssoc = targetItemsAssoc;
    return this;
  }

  public Target addTargetItemsAssocItem(TargetItemAssociation targetItemsAssocItem) {
    if (this.targetItemsAssoc == null) {
      this.targetItemsAssoc = new ArrayList<>();
    }
    this.targetItemsAssoc.add(targetItemsAssocItem);
    return this;
  }

  /**
   * Get targetItemsAssoc
   * @return targetItemsAssoc
   */
  @javax.annotation.Nullable
  public List<TargetItemAssociation> getTargetItemsAssoc() {
    return targetItemsAssoc;
  }

  public void setTargetItemsAssoc(@javax.annotation.Nullable List<TargetItemAssociation> targetItemsAssoc) {
    this.targetItemsAssoc = targetItemsAssoc;
  }


  public Target targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public Target targetSubType(@javax.annotation.Nullable String targetSubType) {
    this.targetSubType = targetSubType;
    return this;
  }

  /**
   * Get targetSubType
   * @return targetSubType
   */
  @javax.annotation.Nullable
  public String getTargetSubType() {
    return targetSubType;
  }

  public void setTargetSubType(@javax.annotation.Nullable String targetSubType) {
    this.targetSubType = targetSubType;
  }


  public Target targetType(@javax.annotation.Nullable String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
   */
  @javax.annotation.Nullable
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(@javax.annotation.Nullable String targetType) {
    this.targetType = targetType;
  }


  public Target targetVersions(@javax.annotation.Nullable List<ItemVersion> targetVersions) {
    this.targetVersions = targetVersions;
    return this;
  }

  public Target addTargetVersionsItem(ItemVersion targetVersionsItem) {
    if (this.targetVersions == null) {
      this.targetVersions = new ArrayList<>();
    }
    this.targetVersions.add(targetVersionsItem);
    return this;
  }

  /**
   * Get targetVersions
   * @return targetVersions
   */
  @javax.annotation.Nullable
  public List<ItemVersion> getTargetVersions() {
    return targetVersions;
  }

  public void setTargetVersions(@javax.annotation.Nullable List<ItemVersion> targetVersions) {
    this.targetVersions = targetVersions;
  }


  public Target withCustomerFragment(@javax.annotation.Nullable Boolean withCustomerFragment) {
    this.withCustomerFragment = withCustomerFragment;
    return this;
  }

  /**
   * Get withCustomerFragment
   * @return withCustomerFragment
   */
  @javax.annotation.Nullable
  public Boolean getWithCustomerFragment() {
    return withCustomerFragment;
  }

  public void setWithCustomerFragment(@javax.annotation.Nullable Boolean withCustomerFragment) {
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
        Objects.equals(this.isAccessRequestEnabled, target.isAccessRequestEnabled) &&
        Objects.equals(this.lastVersion, target.lastVersion) &&
        Objects.equals(this.modificationDate, target.modificationDate) &&
        Objects.equals(this.parentTargetName, target.parentTargetName) &&
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
    return Objects.hash(accessDate, accessDateDisplay, accessRequestStatus, attributes, clientPermissions, comment, creationDate, isAccessRequestEnabled, lastVersion, modificationDate, parentTargetName, protectionKeyName, targetDetails, targetId, targetItemsAssoc, targetName, targetSubType, targetType, targetVersions, withCustomerFragment);
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
    sb.append("    isAccessRequestEnabled: ").append(toIndentedString(isAccessRequestEnabled)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    parentTargetName: ").append(toIndentedString(parentTargetName)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access_date");
    openapiFields.add("access_date_display");
    openapiFields.add("access_request_status");
    openapiFields.add("attributes");
    openapiFields.add("client_permissions");
    openapiFields.add("comment");
    openapiFields.add("creation_date");
    openapiFields.add("is_access_request_enabled");
    openapiFields.add("last_version");
    openapiFields.add("modification_date");
    openapiFields.add("parent_target_name");
    openapiFields.add("protection_key_name");
    openapiFields.add("target_details");
    openapiFields.add("target_id");
    openapiFields.add("target_items_assoc");
    openapiFields.add("target_name");
    openapiFields.add("target_sub_type");
    openapiFields.add("target_type");
    openapiFields.add("target_versions");
    openapiFields.add("with_customer_fragment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Target
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Target.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Target is not found in the empty JSON string", Target.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Target.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Target` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_date_display") != null && !jsonObj.get("access_date_display").isJsonNull()) && !jsonObj.get("access_date_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_date_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_date_display").toString()));
      }
      if ((jsonObj.get("access_request_status") != null && !jsonObj.get("access_request_status").isJsonNull()) && !jsonObj.get("access_request_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_request_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_request_status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("client_permissions") != null && !jsonObj.get("client_permissions").isJsonNull() && !jsonObj.get("client_permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("client_permissions").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("parent_target_name") != null && !jsonObj.get("parent_target_name").isJsonNull()) && !jsonObj.get("parent_target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_target_name").toString()));
      }
      if ((jsonObj.get("protection_key_name") != null && !jsonObj.get("protection_key_name").isJsonNull()) && !jsonObj.get("protection_key_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection_key_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection_key_name").toString()));
      }
      if ((jsonObj.get("target_details") != null && !jsonObj.get("target_details").isJsonNull()) && !jsonObj.get("target_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_details").toString()));
      }
      if (jsonObj.get("target_items_assoc") != null && !jsonObj.get("target_items_assoc").isJsonNull()) {
        JsonArray jsonArraytargetItemsAssoc = jsonObj.getAsJsonArray("target_items_assoc");
        if (jsonArraytargetItemsAssoc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("target_items_assoc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `target_items_assoc` to be an array in the JSON string but got `%s`", jsonObj.get("target_items_assoc").toString()));
          }

          // validate the optional field `target_items_assoc` (array)
          for (int i = 0; i < jsonArraytargetItemsAssoc.size(); i++) {
            TargetItemAssociation.validateJsonElement(jsonArraytargetItemsAssoc.get(i));
          };
        }
      }
      if ((jsonObj.get("target_name") != null && !jsonObj.get("target_name").isJsonNull()) && !jsonObj.get("target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_name").toString()));
      }
      if ((jsonObj.get("target_sub_type") != null && !jsonObj.get("target_sub_type").isJsonNull()) && !jsonObj.get("target_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_sub_type").toString()));
      }
      if ((jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonNull()) && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      if (jsonObj.get("target_versions") != null && !jsonObj.get("target_versions").isJsonNull()) {
        JsonArray jsonArraytargetVersions = jsonObj.getAsJsonArray("target_versions");
        if (jsonArraytargetVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("target_versions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `target_versions` to be an array in the JSON string but got `%s`", jsonObj.get("target_versions").toString()));
          }

          // validate the optional field `target_versions` (array)
          for (int i = 0; i < jsonArraytargetVersions.size(); i++) {
            ItemVersion.validateJsonElement(jsonArraytargetVersions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Target.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Target' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Target> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Target.class));

       return (TypeAdapter<T>) new TypeAdapter<Target>() {
           @Override
           public void write(JsonWriter out, Target value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Target read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Target given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Target
   * @throws IOException if the JSON string is invalid with respect to Target
   */
  public static Target fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Target.class);
  }

  /**
   * Convert an instance of Target to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

