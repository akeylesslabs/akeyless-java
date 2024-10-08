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
import io.akeyless.client.model.AccessPermissionAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_ALIAS = "group_alias";
  @SerializedName(SERIALIZED_NAME_GROUP_ALIAS)
  private String groupAlias;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR = "is_subclaims_with_operator";
  @SerializedName(SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR)
  private Boolean isSubclaimsWithOperator;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_USER_ASSIGNMENTS = "user_assignments";
  @SerializedName(SERIALIZED_NAME_USER_ASSIGNMENTS)
  private List<AccessPermissionAssignment> userAssignments = null;

  public Group() { 
  }

  public Group accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Group creationDate(OffsetDateTime creationDate) {
    
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


  public Group description(String description) {
    
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


  public Group groupAlias(String groupAlias) {
    
    this.groupAlias = groupAlias;
    return this;
  }

   /**
   * Get groupAlias
   * @return groupAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupAlias() {
    return groupAlias;
  }


  public void setGroupAlias(String groupAlias) {
    this.groupAlias = groupAlias;
  }


  public Group groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public Group groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public Group isSubclaimsWithOperator(Boolean isSubclaimsWithOperator) {
    
    this.isSubclaimsWithOperator = isSubclaimsWithOperator;
    return this;
  }

   /**
   * Get isSubclaimsWithOperator
   * @return isSubclaimsWithOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSubclaimsWithOperator() {
    return isSubclaimsWithOperator;
  }


  public void setIsSubclaimsWithOperator(Boolean isSubclaimsWithOperator) {
    this.isSubclaimsWithOperator = isSubclaimsWithOperator;
  }


  public Group modificationDate(OffsetDateTime modificationDate) {
    
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


  public Group userAssignments(List<AccessPermissionAssignment> userAssignments) {
    
    this.userAssignments = userAssignments;
    return this;
  }

  public Group addUserAssignmentsItem(AccessPermissionAssignment userAssignmentsItem) {
    if (this.userAssignments == null) {
      this.userAssignments = new ArrayList<AccessPermissionAssignment>();
    }
    this.userAssignments.add(userAssignmentsItem);
    return this;
  }

   /**
   * Get userAssignments
   * @return userAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccessPermissionAssignment> getUserAssignments() {
    return userAssignments;
  }


  public void setUserAssignments(List<AccessPermissionAssignment> userAssignments) {
    this.userAssignments = userAssignments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.accountId, group.accountId) &&
        Objects.equals(this.creationDate, group.creationDate) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.groupAlias, group.groupAlias) &&
        Objects.equals(this.groupId, group.groupId) &&
        Objects.equals(this.groupName, group.groupName) &&
        Objects.equals(this.isSubclaimsWithOperator, group.isSubclaimsWithOperator) &&
        Objects.equals(this.modificationDate, group.modificationDate) &&
        Objects.equals(this.userAssignments, group.userAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationDate, description, groupAlias, groupId, groupName, isSubclaimsWithOperator, modificationDate, userAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupAlias: ").append(toIndentedString(groupAlias)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    isSubclaimsWithOperator: ").append(toIndentedString(isSubclaimsWithOperator)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    userAssignments: ").append(toIndentedString(userAssignments)).append("\n");
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

