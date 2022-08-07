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
 * DescribeItem
 */

public class DescribeItem {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHOW_VERSIONS = "show-versions";
  @SerializedName(SERIALIZED_NAME_SHOW_VERSIONS)
  private Boolean showVersions = false;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public DescribeItem displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the item
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the item")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public DescribeItem itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Item id of the item
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item id of the item")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DescribeItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Item name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Item name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DescribeItem showVersions(Boolean showVersions) {
    
    this.showVersions = showVersions;
    return this;
  }

   /**
   * Include all item versions in reply
   * @return showVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include all item versions in reply")

  public Boolean getShowVersions() {
    return showVersions;
  }


  public void setShowVersions(Boolean showVersions) {
    this.showVersions = showVersions;
  }


  public DescribeItem token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public DescribeItem uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeItem describeItem = (DescribeItem) o;
    return Objects.equals(this.displayId, describeItem.displayId) &&
        Objects.equals(this.itemId, describeItem.itemId) &&
        Objects.equals(this.name, describeItem.name) &&
        Objects.equals(this.showVersions, describeItem.showVersions) &&
        Objects.equals(this.token, describeItem.token) &&
        Objects.equals(this.uidToken, describeItem.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, itemId, name, showVersions, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeItem {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showVersions: ").append(toIndentedString(showVersions)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

