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
 * signPKCS1 is a command that calculates the signature of hashed data using RSASSA-PKCS1-V1_5-SIGN from RSA PKCS#1 v1.5.
 */
@ApiModel(description = "signPKCS1 is a command that calculates the signature of hashed data using RSASSA-PKCS1-V1_5-SIGN from RSA PKCS#1 v1.5.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignPKCS1 {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_HASH_FUNCTION = "hash-function";
  @SerializedName(SERIALIZED_NAME_HASH_FUNCTION)
  private String hashFunction;

  public static final String SERIALIZED_NAME_INPUT_FORMAT = "input-format";
  @SerializedName(SERIALIZED_NAME_INPUT_FORMAT)
  private String inputFormat;

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

  public SignPKCS1() { 
  }

  public SignPKCS1 displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the signing process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the signing process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public SignPKCS1 hashFunction(String hashFunction) {
    
    this.hashFunction = hashFunction;
    return this;
  }

   /**
   * HashFunction defines the hash function (e.g. sha-256)
   * @return hashFunction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashFunction defines the hash function (e.g. sha-256)")

  public String getHashFunction() {
    return hashFunction;
  }


  public void setHashFunction(String hashFunction) {
    this.hashFunction = hashFunction;
  }


  public SignPKCS1 inputFormat(String inputFormat) {
    
    this.inputFormat = inputFormat;
    return this;
  }

   /**
   * Select default assumed format for the plaintext message. Currently supported options: [base64]
   * @return inputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Select default assumed format for the plaintext message. Currently supported options: [base64]")

  public String getInputFormat() {
    return inputFormat;
  }


  public void setInputFormat(String inputFormat) {
    this.inputFormat = inputFormat;
  }


  public SignPKCS1 itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the signing process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the signing process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public SignPKCS1 json(Boolean json) {
    
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


  public SignPKCS1 keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the RSA key to use in the signing process
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the RSA key to use in the signing process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public SignPKCS1 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message to be signed
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message to be signed")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SignPKCS1 prehashed(Boolean prehashed) {
    
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


  public SignPKCS1 token(String token) {
    
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


  public SignPKCS1 uidToken(String uidToken) {
    
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


  public SignPKCS1 version(Integer version) {
    
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
    SignPKCS1 signPKCS1 = (SignPKCS1) o;
    return Objects.equals(this.displayId, signPKCS1.displayId) &&
        Objects.equals(this.hashFunction, signPKCS1.hashFunction) &&
        Objects.equals(this.inputFormat, signPKCS1.inputFormat) &&
        Objects.equals(this.itemId, signPKCS1.itemId) &&
        Objects.equals(this.json, signPKCS1.json) &&
        Objects.equals(this.keyName, signPKCS1.keyName) &&
        Objects.equals(this.message, signPKCS1.message) &&
        Objects.equals(this.prehashed, signPKCS1.prehashed) &&
        Objects.equals(this.token, signPKCS1.token) &&
        Objects.equals(this.uidToken, signPKCS1.uidToken) &&
        Objects.equals(this.version, signPKCS1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, hashFunction, inputFormat, itemId, json, keyName, message, prehashed, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignPKCS1 {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashFunction: ").append(toIndentedString(hashFunction)).append("\n");
    sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
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

