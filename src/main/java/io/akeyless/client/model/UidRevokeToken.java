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
 * UidRevokeToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UidRevokeToken {
  public static final String SERIALIZED_NAME_AUTH_METHOD_NAME = "auth-method-name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_NAME)
  private String authMethodName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_REVOKE_TOKEN = "revoke-token";
  @SerializedName(SERIALIZED_NAME_REVOKE_TOKEN)
  private String revokeToken;

  public static final String SERIALIZED_NAME_REVOKE_TYPE = "revoke-type";
  @SerializedName(SERIALIZED_NAME_REVOKE_TYPE)
  private String revokeType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public UidRevokeToken() { 
  }

  public UidRevokeToken authMethodName(String authMethodName) {
    
    this.authMethodName = authMethodName;
    return this;
  }

   /**
   * The universal identity auth method name
   * @return authMethodName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity auth method name")

  public String getAuthMethodName() {
    return authMethodName;
  }


  public void setAuthMethodName(String authMethodName) {
    this.authMethodName = authMethodName;
  }


  public UidRevokeToken json(Boolean json) {
    
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


  public UidRevokeToken revokeToken(String revokeToken) {
    
    this.revokeToken = revokeToken;
    return this;
  }

   /**
   * the universal identity token/token-id to revoke
   * @return revokeToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the universal identity token/token-id to revoke")

  public String getRevokeToken() {
    return revokeToken;
  }


  public void setRevokeToken(String revokeToken) {
    this.revokeToken = revokeToken;
  }


  public UidRevokeToken revokeType(String revokeType) {
    
    this.revokeType = revokeType;
    return this;
  }

   /**
   * revokeSelf/revokeAll (delete only this token/this token and his children)
   * @return revokeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "revokeSelf/revokeAll (delete only this token/this token and his children)")

  public String getRevokeType() {
    return revokeType;
  }


  public void setRevokeType(String revokeType) {
    this.revokeType = revokeType;
  }


  public UidRevokeToken token(String token) {
    
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


  public UidRevokeToken uidToken(String uidToken) {
    
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
    UidRevokeToken uidRevokeToken = (UidRevokeToken) o;
    return Objects.equals(this.authMethodName, uidRevokeToken.authMethodName) &&
        Objects.equals(this.json, uidRevokeToken.json) &&
        Objects.equals(this.revokeToken, uidRevokeToken.revokeToken) &&
        Objects.equals(this.revokeType, uidRevokeToken.revokeType) &&
        Objects.equals(this.token, uidRevokeToken.token) &&
        Objects.equals(this.uidToken, uidRevokeToken.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethodName, json, revokeToken, revokeType, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UidRevokeToken {\n");
    sb.append("    authMethodName: ").append(toIndentedString(authMethodName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    revokeToken: ").append(toIndentedString(revokeToken)).append("\n");
    sb.append("    revokeType: ").append(toIndentedString(revokeType)).append("\n");
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

