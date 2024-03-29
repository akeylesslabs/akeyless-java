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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * AllowedAccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllowedAccess {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private Long clusterId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub_claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  private Map<String, List<String>> subClaims = null;

  public static final String SERIALIZED_NAME_SUB_CLAIMS_CASE_INSENSITIVE = "sub_claims_case_insensitive";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS_CASE_INSENSITIVE)
  private Boolean subClaimsCaseInsensitive;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AllowedAccess() { 
  }

  public AllowedAccess accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Get accessId
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public AllowedAccess accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public AllowedAccess clusterId(Long clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getClusterId() {
    return clusterId;
  }


  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }


  public AllowedAccess createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AllowedAccess description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AllowedAccess editable(Boolean editable) {
    
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEditable() {
    return editable;
  }


  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public AllowedAccess error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public AllowedAccess id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AllowedAccess isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public AllowedAccess name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AllowedAccess permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public AllowedAccess addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public AllowedAccess subClaims(Map<String, List<String>> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public AllowedAccess putSubClaimsItem(String key, List<String> subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<String, List<String>>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

   /**
   * Get subClaims
   * @return subClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getSubClaims() {
    return subClaims;
  }


  public void setSubClaims(Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
  }


  public AllowedAccess subClaimsCaseInsensitive(Boolean subClaimsCaseInsensitive) {
    
    this.subClaimsCaseInsensitive = subClaimsCaseInsensitive;
    return this;
  }

   /**
   * Get subClaimsCaseInsensitive
   * @return subClaimsCaseInsensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSubClaimsCaseInsensitive() {
    return subClaimsCaseInsensitive;
  }


  public void setSubClaimsCaseInsensitive(Boolean subClaimsCaseInsensitive) {
    this.subClaimsCaseInsensitive = subClaimsCaseInsensitive;
  }


  public AllowedAccess updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedAccess allowedAccess = (AllowedAccess) o;
    return Objects.equals(this.accessId, allowedAccess.accessId) &&
        Objects.equals(this.accessType, allowedAccess.accessType) &&
        Objects.equals(this.clusterId, allowedAccess.clusterId) &&
        Objects.equals(this.createdAt, allowedAccess.createdAt) &&
        Objects.equals(this.description, allowedAccess.description) &&
        Objects.equals(this.editable, allowedAccess.editable) &&
        Objects.equals(this.error, allowedAccess.error) &&
        Objects.equals(this.id, allowedAccess.id) &&
        Objects.equals(this.isValid, allowedAccess.isValid) &&
        Objects.equals(this.name, allowedAccess.name) &&
        Objects.equals(this.permissions, allowedAccess.permissions) &&
        Objects.equals(this.subClaims, allowedAccess.subClaims) &&
        Objects.equals(this.subClaimsCaseInsensitive, allowedAccess.subClaimsCaseInsensitive) &&
        Objects.equals(this.updatedAt, allowedAccess.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessType, clusterId, createdAt, description, editable, error, id, isValid, name, permissions, subClaims, subClaimsCaseInsensitive, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedAccess {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
    sb.append("    subClaimsCaseInsensitive: ").append(toIndentedString(subClaimsCaseInsensitive)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

