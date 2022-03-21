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
 * gatewayAddAllowedManagementAccess is a command that adds sub-admins
 */
@ApiModel(description = "gatewayAddAllowedManagementAccess is a command that adds sub-admins")

public class GatewayAddAllowedManagementAccess {
  public static final String SERIALIZED_NAME_ALLOW_GW_API = "allow-gw-api";
  @SerializedName(SERIALIZED_NAME_ALLOW_GW_API)
  private Boolean allowGwApi;

  public static final String SERIALIZED_NAME_ALLOW_GW_LOGIN = "allow-gw-login";
  @SerializedName(SERIALIZED_NAME_ALLOW_GW_LOGIN)
  private Boolean allowGwLogin;

  public static final String SERIALIZED_NAME_SUB_ADMIN_ACCESS_ID = "sub-admin-access-id";
  @SerializedName(SERIALIZED_NAME_SUB_ADMIN_ACCESS_ID)
  private String subAdminAccessId;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub-claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  private Map<String, String> subClaims = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public GatewayAddAllowedManagementAccess allowGwApi(Boolean allowGwApi) {
    
    this.allowGwApi = allowGwApi;
    return this;
  }

   /**
   * Get allowGwApi
   * @return allowGwApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowGwApi() {
    return allowGwApi;
  }


  public void setAllowGwApi(Boolean allowGwApi) {
    this.allowGwApi = allowGwApi;
  }


  public GatewayAddAllowedManagementAccess allowGwLogin(Boolean allowGwLogin) {
    
    this.allowGwLogin = allowGwLogin;
    return this;
  }

   /**
   * Get allowGwLogin
   * @return allowGwLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowGwLogin() {
    return allowGwLogin;
  }


  public void setAllowGwLogin(Boolean allowGwLogin) {
    this.allowGwLogin = allowGwLogin;
  }


  public GatewayAddAllowedManagementAccess subAdminAccessId(String subAdminAccessId) {
    
    this.subAdminAccessId = subAdminAccessId;
    return this;
  }

   /**
   * SubAdmins to add
   * @return subAdminAccessId
  **/
  @ApiModelProperty(required = true, value = "SubAdmins to add")

  public String getSubAdminAccessId() {
    return subAdminAccessId;
  }


  public void setSubAdminAccessId(String subAdminAccessId) {
    this.subAdminAccessId = subAdminAccessId;
  }


  public GatewayAddAllowedManagementAccess subClaims(Map<String, String> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public GatewayAddAllowedManagementAccess putSubClaimsItem(String key, String subClaimsItem) {
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


  public GatewayAddAllowedManagementAccess token(String token) {
    
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


  public GatewayAddAllowedManagementAccess uidToken(String uidToken) {
    
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
    GatewayAddAllowedManagementAccess gatewayAddAllowedManagementAccess = (GatewayAddAllowedManagementAccess) o;
    return Objects.equals(this.allowGwApi, gatewayAddAllowedManagementAccess.allowGwApi) &&
        Objects.equals(this.allowGwLogin, gatewayAddAllowedManagementAccess.allowGwLogin) &&
        Objects.equals(this.subAdminAccessId, gatewayAddAllowedManagementAccess.subAdminAccessId) &&
        Objects.equals(this.subClaims, gatewayAddAllowedManagementAccess.subClaims) &&
        Objects.equals(this.token, gatewayAddAllowedManagementAccess.token) &&
        Objects.equals(this.uidToken, gatewayAddAllowedManagementAccess.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowGwApi, allowGwLogin, subAdminAccessId, subClaims, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayAddAllowedManagementAccess {\n");
    sb.append("    allowGwApi: ").append(toIndentedString(allowGwApi)).append("\n");
    sb.append("    allowGwLogin: ").append(toIndentedString(allowGwLogin)).append("\n");
    sb.append("    subAdminAccessId: ").append(toIndentedString(subAdminAccessId)).append("\n");
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

