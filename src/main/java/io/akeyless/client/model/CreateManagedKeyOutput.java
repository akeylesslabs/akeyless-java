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

/**
 * CreateManagedKeyOutput
 */

public class CreateManagedKeyOutput {
  public static final String SERIALIZED_NAME_MANAGED_KEY_ID = "managed_key_id";
  @SerializedName(SERIALIZED_NAME_MANAGED_KEY_ID)
  private Long managedKeyId;

  public static final String SERIALIZED_NAME_MANAGED_KEY_NAME = "managed_key_name";
  @SerializedName(SERIALIZED_NAME_MANAGED_KEY_NAME)
  private String managedKeyName;

  public static final String SERIALIZED_NAME_MANAGED_KEY_TYPE = "managed_key_type";
  @SerializedName(SERIALIZED_NAME_MANAGED_KEY_TYPE)
  private String managedKeyType;


  public CreateManagedKeyOutput managedKeyId(Long managedKeyId) {
    
    this.managedKeyId = managedKeyId;
    return this;
  }

   /**
   * Get managedKeyId
   * @return managedKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getManagedKeyId() {
    return managedKeyId;
  }


  public void setManagedKeyId(Long managedKeyId) {
    this.managedKeyId = managedKeyId;
  }


  public CreateManagedKeyOutput managedKeyName(String managedKeyName) {
    
    this.managedKeyName = managedKeyName;
    return this;
  }

   /**
   * Get managedKeyName
   * @return managedKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagedKeyName() {
    return managedKeyName;
  }


  public void setManagedKeyName(String managedKeyName) {
    this.managedKeyName = managedKeyName;
  }


  public CreateManagedKeyOutput managedKeyType(String managedKeyType) {
    
    this.managedKeyType = managedKeyType;
    return this;
  }

   /**
   * Get managedKeyType
   * @return managedKeyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagedKeyType() {
    return managedKeyType;
  }


  public void setManagedKeyType(String managedKeyType) {
    this.managedKeyType = managedKeyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManagedKeyOutput createManagedKeyOutput = (CreateManagedKeyOutput) o;
    return Objects.equals(this.managedKeyId, createManagedKeyOutput.managedKeyId) &&
        Objects.equals(this.managedKeyName, createManagedKeyOutput.managedKeyName) &&
        Objects.equals(this.managedKeyType, createManagedKeyOutput.managedKeyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedKeyId, managedKeyName, managedKeyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManagedKeyOutput {\n");
    sb.append("    managedKeyId: ").append(toIndentedString(managedKeyId)).append("\n");
    sb.append("    managedKeyName: ").append(toIndentedString(managedKeyName)).append("\n");
    sb.append("    managedKeyType: ").append(toIndentedString(managedKeyType)).append("\n");
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

