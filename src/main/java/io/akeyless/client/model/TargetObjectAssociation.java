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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TargetObjectAssociation includes details of an association between a target and an object (target, migration_id).
 */
@ApiModel(description = "TargetObjectAssociation includes details of an association between a target and an object (target, migration_id).")

public class TargetObjectAssociation {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc_id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  private String assocId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "object_name";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;


  public TargetObjectAssociation assocId(String assocId) {
    
    this.assocId = assocId;
    return this;
  }

   /**
   * Get assocId
   * @return assocId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssocId() {
    return assocId;
  }


  public void setAssocId(String assocId) {
    this.assocId = assocId;
  }


  public TargetObjectAssociation attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TargetObjectAssociation putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public TargetObjectAssociation objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public TargetObjectAssociation objectName(String objectName) {
    
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  public TargetObjectAssociation objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public TargetObjectAssociation targetName(String targetName) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetObjectAssociation targetObjectAssociation = (TargetObjectAssociation) o;
    return Objects.equals(this.assocId, targetObjectAssociation.assocId) &&
        Objects.equals(this.attributes, targetObjectAssociation.attributes) &&
        Objects.equals(this.objectId, targetObjectAssociation.objectId) &&
        Objects.equals(this.objectName, targetObjectAssociation.objectName) &&
        Objects.equals(this.objectType, targetObjectAssociation.objectType) &&
        Objects.equals(this.targetName, targetObjectAssociation.targetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId, attributes, objectId, objectName, objectType, targetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetObjectAssociation {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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

