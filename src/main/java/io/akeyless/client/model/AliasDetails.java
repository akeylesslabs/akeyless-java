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
 * AliasDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AliasDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_ALIAS = "account-alias";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ALIAS)
  private String accountAlias;

  public static final String SERIALIZED_NAME_AUTH_METHOD_NAME = "auth-method-name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_NAME)
  private String authMethodName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public AliasDetails() { 
  }

  public AliasDetails accountAlias(String accountAlias) {
    
    this.accountAlias = accountAlias;
    return this;
  }

   /**
   * Account alias
   * @return accountAlias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Account alias")

  public String getAccountAlias() {
    return accountAlias;
  }


  public void setAccountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
  }


  public AliasDetails authMethodName(String authMethodName) {
    
    this.authMethodName = authMethodName;
    return this;
  }

   /**
   * Auth method name
   * @return authMethodName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Auth method name")

  public String getAuthMethodName() {
    return authMethodName;
  }


  public void setAuthMethodName(String authMethodName) {
    this.authMethodName = authMethodName;
  }


  public AliasDetails json(Boolean json) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasDetails aliasDetails = (AliasDetails) o;
    return Objects.equals(this.accountAlias, aliasDetails.accountAlias) &&
        Objects.equals(this.authMethodName, aliasDetails.authMethodName) &&
        Objects.equals(this.json, aliasDetails.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAlias, authMethodName, json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasDetails {\n");
    sb.append("    accountAlias: ").append(toIndentedString(accountAlias)).append("\n");
    sb.append("    authMethodName: ").append(toIndentedString(authMethodName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

