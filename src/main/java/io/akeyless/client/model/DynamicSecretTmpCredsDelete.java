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
 * dynamicSecretTmpCredsDelete is a command that deletes dynamic secret temp creds
 */
@ApiModel(description = "dynamicSecretTmpCredsDelete is a command that deletes dynamic secret temp creds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretTmpCredsDelete {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REVOKE_ALL = "revoke-all";
  @SerializedName(SERIALIZED_NAME_REVOKE_ALL)
  private Boolean revokeAll;

  public static final String SERIALIZED_NAME_SOFT_DELETE = "soft-delete";
  @SerializedName(SERIALIZED_NAME_SOFT_DELETE)
  private Boolean softDelete;

  public static final String SERIALIZED_NAME_TMP_CREDS_ID = "tmp-creds-id";
  @SerializedName(SERIALIZED_NAME_TMP_CREDS_ID)
  private String tmpCredsId = "demo_default_tmp_creds_id_for_sdk_bc";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DynamicSecretTmpCredsDelete() { 
  }

  public DynamicSecretTmpCredsDelete host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public DynamicSecretTmpCredsDelete json(Boolean json) {
    
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


  public DynamicSecretTmpCredsDelete name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DynamicSecretTmpCredsDelete revokeAll(Boolean revokeAll) {
    
    this.revokeAll = revokeAll;
    return this;
  }

   /**
   * Revoke All Temp Creds
   * @return revokeAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revoke All Temp Creds")

  public Boolean getRevokeAll() {
    return revokeAll;
  }


  public void setRevokeAll(Boolean revokeAll) {
    this.revokeAll = revokeAll;
  }


  public DynamicSecretTmpCredsDelete softDelete(Boolean softDelete) {
    
    this.softDelete = softDelete;
    return this;
  }

   /**
   * Soft Delete
   * @return softDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Soft Delete")

  public Boolean getSoftDelete() {
    return softDelete;
  }


  public void setSoftDelete(Boolean softDelete) {
    this.softDelete = softDelete;
  }


  public DynamicSecretTmpCredsDelete tmpCredsId(String tmpCredsId) {
    
    this.tmpCredsId = tmpCredsId;
    return this;
  }

   /**
   * Tmp Creds ID
   * @return tmpCredsId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tmp Creds ID")

  public String getTmpCredsId() {
    return tmpCredsId;
  }


  public void setTmpCredsId(String tmpCredsId) {
    this.tmpCredsId = tmpCredsId;
  }


  public DynamicSecretTmpCredsDelete token(String token) {
    
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


  public DynamicSecretTmpCredsDelete uidToken(String uidToken) {
    
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
    DynamicSecretTmpCredsDelete dynamicSecretTmpCredsDelete = (DynamicSecretTmpCredsDelete) o;
    return Objects.equals(this.host, dynamicSecretTmpCredsDelete.host) &&
        Objects.equals(this.json, dynamicSecretTmpCredsDelete.json) &&
        Objects.equals(this.name, dynamicSecretTmpCredsDelete.name) &&
        Objects.equals(this.revokeAll, dynamicSecretTmpCredsDelete.revokeAll) &&
        Objects.equals(this.softDelete, dynamicSecretTmpCredsDelete.softDelete) &&
        Objects.equals(this.tmpCredsId, dynamicSecretTmpCredsDelete.tmpCredsId) &&
        Objects.equals(this.token, dynamicSecretTmpCredsDelete.token) &&
        Objects.equals(this.uidToken, dynamicSecretTmpCredsDelete.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, json, name, revokeAll, softDelete, tmpCredsId, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretTmpCredsDelete {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revokeAll: ").append(toIndentedString(revokeAll)).append("\n");
    sb.append("    softDelete: ").append(toIndentedString(softDelete)).append("\n");
    sb.append("    tmpCredsId: ").append(toIndentedString(tmpCredsId)).append("\n");
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
