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
 * DeleteItemOutput
 */

public class DeleteItemOutput {
  public static final String SERIALIZED_NAME_DELETION_DATE = "deletion_date";
  @SerializedName(SERIALIZED_NAME_DELETION_DATE)
  private OffsetDateTime deletionDate;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_VERSION_DELETED = "version_deleted";
  @SerializedName(SERIALIZED_NAME_VERSION_DELETED)
  private Integer versionDeleted;


  public DeleteItemOutput deletionDate(OffsetDateTime deletionDate) {
    
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


  public DeleteItemOutput itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DeleteItemOutput itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public DeleteItemOutput versionDeleted(Integer versionDeleted) {
    
    this.versionDeleted = versionDeleted;
    return this;
  }

   /**
   * Get versionDeleted
   * @return versionDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionDeleted() {
    return versionDeleted;
  }


  public void setVersionDeleted(Integer versionDeleted) {
    this.versionDeleted = versionDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteItemOutput deleteItemOutput = (DeleteItemOutput) o;
    return Objects.equals(this.deletionDate, deleteItemOutput.deletionDate) &&
        Objects.equals(this.itemId, deleteItemOutput.itemId) &&
        Objects.equals(this.itemName, deleteItemOutput.itemName) &&
        Objects.equals(this.versionDeleted, deleteItemOutput.versionDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionDate, itemId, itemName, versionDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItemOutput {\n");
    sb.append("    deletionDate: ").append(toIndentedString(deletionDate)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    versionDeleted: ").append(toIndentedString(versionDeleted)).append("\n");
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

