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
 * CreateGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroup {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_ALIAS = "group-alias";
  @SerializedName(SERIALIZED_NAME_GROUP_ALIAS)
  private String groupAlias;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_ASSIGNMENT = "user-assignment";
  @SerializedName(SERIALIZED_NAME_USER_ASSIGNMENT)
  private String userAssignment;

  public CreateGroup() { 
  }

  public CreateGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateGroup groupAlias(String groupAlias) {
    
    this.groupAlias = groupAlias;
    return this;
  }

   /**
   * A short group alias
   * @return groupAlias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A short group alias")

  public String getGroupAlias() {
    return groupAlias;
  }


  public void setGroupAlias(String groupAlias) {
    this.groupAlias = groupAlias;
  }


  public CreateGroup json(Boolean json) {
    
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


  public CreateGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Group name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGroup token(String token) {
    
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


  public CreateGroup uidToken(String uidToken) {
    
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


  public CreateGroup userAssignment(String userAssignment) {
    
    this.userAssignment = userAssignment;
    return this;
  }

   /**
   * A json string defining the access permission assignment for this client
   * @return userAssignment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A json string defining the access permission assignment for this client")

  public String getUserAssignment() {
    return userAssignment;
  }


  public void setUserAssignment(String userAssignment) {
    this.userAssignment = userAssignment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroup createGroup = (CreateGroup) o;
    return Objects.equals(this.description, createGroup.description) &&
        Objects.equals(this.groupAlias, createGroup.groupAlias) &&
        Objects.equals(this.json, createGroup.json) &&
        Objects.equals(this.name, createGroup.name) &&
        Objects.equals(this.token, createGroup.token) &&
        Objects.equals(this.uidToken, createGroup.uidToken) &&
        Objects.equals(this.userAssignment, createGroup.userAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groupAlias, json, name, token, uidToken, userAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroup {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupAlias: ").append(toIndentedString(groupAlias)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userAssignment: ").append(toIndentedString(userAssignment)).append("\n");
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

