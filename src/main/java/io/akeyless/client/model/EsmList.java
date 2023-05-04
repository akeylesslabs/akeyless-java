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
 * esmList is a command that lists the secrets of an External Secrets Manager
 */
@ApiModel(description = "esmList is a command that lists the secrets of an External Secrets Manager")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EsmList {
  public static final String SERIALIZED_NAME_ESM_NAME = "esm-name";
  @SerializedName(SERIALIZED_NAME_ESM_NAME)
  private String esmName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public EsmList() { 
  }

  public EsmList esmName(String esmName) {
    
    this.esmName = esmName;
    return this;
  }

   /**
   * Name of the External Secrets Manager item
   * @return esmName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the External Secrets Manager item")

  public String getEsmName() {
    return esmName;
  }


  public void setEsmName(String esmName) {
    this.esmName = esmName;
  }


  public EsmList json(Boolean json) {
    
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


  public EsmList token(String token) {
    
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


  public EsmList uidToken(String uidToken) {
    
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
    EsmList esmList = (EsmList) o;
    return Objects.equals(this.esmName, esmList.esmName) &&
        Objects.equals(this.json, esmList.json) &&
        Objects.equals(this.token, esmList.token) &&
        Objects.equals(this.uidToken, esmList.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esmName, json, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsmList {\n");
    sb.append("    esmName: ").append(toIndentedString(esmName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

