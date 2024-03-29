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
import java.util.List;

/**
 * DeleteItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteItems {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private List<String> item = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = "dummy_path";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DeleteItems() { 
  }

  public DeleteItems item(List<String> item) {
    
    this.item = item;
    return this;
  }

  public DeleteItems addItemItem(String itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<String>();
    }
    this.item.add(itemItem);
    return this;
  }

   /**
   * A list of items to delete, To specify multiple items use argument multiple times
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of items to delete, To specify multiple items use argument multiple times")

  public List<String> getItem() {
    return item;
  }


  public void setItem(List<String> item) {
    this.item = item;
  }


  public DeleteItems json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public DeleteItems path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to delete the items from
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path to delete the items from")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DeleteItems token(String token) {
    
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


  public DeleteItems uidToken(String uidToken) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteItems deleteItems = (DeleteItems) o;
    return Objects.equals(this.item, deleteItems.item) &&
        Objects.equals(this.json, deleteItems.json) &&
        Objects.equals(this.path, deleteItems.path) &&
        Objects.equals(this.token, deleteItems.token) &&
        Objects.equals(this.uidToken, deleteItems.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, json, path, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItems {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

