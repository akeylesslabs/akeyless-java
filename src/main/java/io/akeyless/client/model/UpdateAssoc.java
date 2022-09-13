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
 * updateAssoc is a command that updates the sub-claims of an association between role and auth method.
 */
@ApiModel(description = "updateAssoc is a command that updates the sub-claims of an association between role and auth method.")

public class UpdateAssoc {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc-id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  private String assocId;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "case-sensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private String caseSensitive;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub-claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  private Map<String, String> subClaims = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateAssoc assocId(String assocId) {
    
    this.assocId = assocId;
    return this;
  }

   /**
   * The association id to be updated
   * @return assocId
  **/
  @ApiModelProperty(required = true, value = "The association id to be updated")

  public String getAssocId() {
    return assocId;
  }


  public void setAssocId(String assocId) {
    this.assocId = assocId;
  }


  public UpdateAssoc caseSensitive(String caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(String caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public UpdateAssoc json(Boolean json) {
    
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


  public UpdateAssoc subClaims(Map<String, String> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public UpdateAssoc putSubClaimsItem(String key, String subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<String, String>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

   /**
   * key/val of sub claims, e.g group&#x3D;admins,developers
   * @return subClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "key/val of sub claims, e.g group=admins,developers")

  public Map<String, String> getSubClaims() {
    return subClaims;
  }


  public void setSubClaims(Map<String, String> subClaims) {
    this.subClaims = subClaims;
  }


  public UpdateAssoc token(String token) {
    
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


  public UpdateAssoc uidToken(String uidToken) {
    
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
    UpdateAssoc updateAssoc = (UpdateAssoc) o;
    return Objects.equals(this.assocId, updateAssoc.assocId) &&
        Objects.equals(this.caseSensitive, updateAssoc.caseSensitive) &&
        Objects.equals(this.json, updateAssoc.json) &&
        Objects.equals(this.subClaims, updateAssoc.subClaims) &&
        Objects.equals(this.token, updateAssoc.token) &&
        Objects.equals(this.uidToken, updateAssoc.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId, caseSensitive, json, subClaims, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssoc {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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

