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
 * deleteTargetAssociation is a command that deletes an association between target and item.
 */
@ApiModel(description = "deleteTargetAssociation is a command that deletes an association between target and item.")

public class DeleteTargetAssociation {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc-id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  private String assocId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public DeleteTargetAssociation assocId(String assocId) {
    
    this.assocId = assocId;
    return this;
  }

   /**
   * The association id to be deleted
   * @return assocId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The association id to be deleted")

  public String getAssocId() {
    return assocId;
  }


  public void setAssocId(String assocId) {
    this.assocId = assocId;
  }


  public DeleteTargetAssociation json(Boolean json) {
    
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


  public DeleteTargetAssociation name(String name) {
    
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


  public DeleteTargetAssociation targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * The target to associate
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target to associate")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public DeleteTargetAssociation token(String token) {
    
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


  public DeleteTargetAssociation uidToken(String uidToken) {
    
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
    DeleteTargetAssociation deleteTargetAssociation = (DeleteTargetAssociation) o;
    return Objects.equals(this.assocId, deleteTargetAssociation.assocId) &&
        Objects.equals(this.json, deleteTargetAssociation.json) &&
        Objects.equals(this.name, deleteTargetAssociation.name) &&
        Objects.equals(this.targetName, deleteTargetAssociation.targetName) &&
        Objects.equals(this.token, deleteTargetAssociation.token) &&
        Objects.equals(this.uidToken, deleteTargetAssociation.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId, json, name, targetName, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTargetAssociation {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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

