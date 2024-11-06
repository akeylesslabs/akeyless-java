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
 * signEcDsa Calculates the signature of a given message using ECDSA and a sha hash algorithm matching the key size
 */
@ApiModel(description = "signEcDsa Calculates the signature of a given message using ECDSA and a sha hash algorithm matching the key size")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignEcDsa {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PREHASHED = "prehashed";
  @SerializedName(SERIALIZED_NAME_PREHASHED)
  private Boolean prehashed;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public SignEcDsa() { 
  }

  public SignEcDsa accessibility(String accessibility) {
    
    this.accessibility = accessibility;
    return this;
  }

   /**
   * for personal password manager
   * @return accessibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for personal password manager")

  public String getAccessibility() {
    return accessibility;
  }


  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }


  public SignEcDsa displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the EC key to use for the signing process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the EC key to use for the signing process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public SignEcDsa itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the EC key to use for the signing process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the EC key to use for the signing process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public SignEcDsa json(Boolean json) {
    
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


  public SignEcDsa keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the EC key to use for the signing process
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the EC key to use for the signing process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public SignEcDsa message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The input message to sign in a base64 format
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The input message to sign in a base64 format")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SignEcDsa prehashed(Boolean prehashed) {
    
    this.prehashed = prehashed;
    return this;
  }

   /**
   * Markes that the message is already hashed
   * @return prehashed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Markes that the message is already hashed")

  public Boolean getPrehashed() {
    return prehashed;
  }


  public void setPrehashed(Boolean prehashed) {
    this.prehashed = prehashed;
  }


  public SignEcDsa token(String token) {
    
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


  public SignEcDsa uidToken(String uidToken) {
    
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


  public SignEcDsa version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the key to use for signing
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the key to use for signing")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignEcDsa signEcDsa = (SignEcDsa) o;
    return Objects.equals(this.accessibility, signEcDsa.accessibility) &&
        Objects.equals(this.displayId, signEcDsa.displayId) &&
        Objects.equals(this.itemId, signEcDsa.itemId) &&
        Objects.equals(this.json, signEcDsa.json) &&
        Objects.equals(this.keyName, signEcDsa.keyName) &&
        Objects.equals(this.message, signEcDsa.message) &&
        Objects.equals(this.prehashed, signEcDsa.prehashed) &&
        Objects.equals(this.token, signEcDsa.token) &&
        Objects.equals(this.uidToken, signEcDsa.uidToken) &&
        Objects.equals(this.version, signEcDsa.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, displayId, itemId, json, keyName, message, prehashed, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignEcDsa {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    prehashed: ").append(toIndentedString(prehashed)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

