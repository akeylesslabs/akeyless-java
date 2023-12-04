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
 * RotateSecret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotateSecret {
  public static final String SERIALIZED_NAME_ROTATE_ALL_SERVICES_BOOLEAN = "RotateAllServicesBoolean";
  @SerializedName(SERIALIZED_NAME_ROTATE_ALL_SERVICES_BOOLEAN)
  private Boolean rotateAllServicesBoolean;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROTATE_ALL_SERVICES = "rotate-all-services";
  @SerializedName(SERIALIZED_NAME_ROTATE_ALL_SERVICES)
  private String rotateAllServices = "false";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public RotateSecret() { 
  }

  public RotateSecret rotateAllServicesBoolean(Boolean rotateAllServicesBoolean) {
    
    this.rotateAllServicesBoolean = rotateAllServicesBoolean;
    return this;
  }

   /**
   * Get rotateAllServicesBoolean
   * @return rotateAllServicesBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRotateAllServicesBoolean() {
    return rotateAllServicesBoolean;
  }


  public void setRotateAllServicesBoolean(Boolean rotateAllServicesBoolean) {
    this.rotateAllServicesBoolean = rotateAllServicesBoolean;
  }


  public RotateSecret json(Boolean json) {
    
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


  public RotateSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Secret name (Rotated Secret or Custom Dynamic Secret)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret name (Rotated Secret or Custom Dynamic Secret)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RotateSecret rotateAllServices(String rotateAllServices) {
    
    this.rotateAllServices = rotateAllServices;
    return this;
  }

   /**
   * Rotate all associated services
   * @return rotateAllServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotate all associated services")

  public String getRotateAllServices() {
    return rotateAllServices;
  }


  public void setRotateAllServices(String rotateAllServices) {
    this.rotateAllServices = rotateAllServices;
  }


  public RotateSecret token(String token) {
    
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


  public RotateSecret uidToken(String uidToken) {
    
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
    RotateSecret rotateSecret = (RotateSecret) o;
    return Objects.equals(this.rotateAllServicesBoolean, rotateSecret.rotateAllServicesBoolean) &&
        Objects.equals(this.json, rotateSecret.json) &&
        Objects.equals(this.name, rotateSecret.name) &&
        Objects.equals(this.rotateAllServices, rotateSecret.rotateAllServices) &&
        Objects.equals(this.token, rotateSecret.token) &&
        Objects.equals(this.uidToken, rotateSecret.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotateAllServicesBoolean, json, name, rotateAllServices, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateSecret {\n");
    sb.append("    rotateAllServicesBoolean: ").append(toIndentedString(rotateAllServicesBoolean)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rotateAllServices: ").append(toIndentedString(rotateAllServices)).append("\n");
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

