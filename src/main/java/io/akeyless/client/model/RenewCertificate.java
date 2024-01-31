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
 * RenewCertificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RenewCertificate {
  public static final String SERIALIZED_NAME_GENERATE_KEY = "generate-key";
  @SerializedName(SERIALIZED_NAME_GENERATE_KEY)
  private Boolean generateKey;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

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

  public RenewCertificate() { 
  }

  public RenewCertificate generateKey(Boolean generateKey) {
    
    this.generateKey = generateKey;
    return this;
  }

   /**
   * Generate a new key as part of the certificate renewal
   * @return generateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Generate a new key as part of the certificate renewal")

  public Boolean getGenerateKey() {
    return generateKey;
  }


  public void setGenerateKey(Boolean generateKey) {
    this.generateKey = generateKey;
  }


  public RenewCertificate itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Certificate item id
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate item id")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public RenewCertificate json(Boolean json) {
    
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


  public RenewCertificate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Certificate name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RenewCertificate token(String token) {
    
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


  public RenewCertificate uidToken(String uidToken) {
    
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
    RenewCertificate renewCertificate = (RenewCertificate) o;
    return Objects.equals(this.generateKey, renewCertificate.generateKey) &&
        Objects.equals(this.itemId, renewCertificate.itemId) &&
        Objects.equals(this.json, renewCertificate.json) &&
        Objects.equals(this.name, renewCertificate.name) &&
        Objects.equals(this.token, renewCertificate.token) &&
        Objects.equals(this.uidToken, renewCertificate.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateKey, itemId, json, name, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewCertificate {\n");
    sb.append("    generateKey: ").append(toIndentedString(generateKey)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

