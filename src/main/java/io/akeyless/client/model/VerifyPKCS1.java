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
 * VerifyPKCS1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyPKCS1 {
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

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public VerifyPKCS1() { 
  }

  public VerifyPKCS1 displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the verification process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the verification process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public VerifyPKCS1 hashFunction(String hashFunction) {
    
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


  public VerifyPKCS1 inputFormat(String inputFormat) {
    
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


  public VerifyPKCS1 itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the verification process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the verification process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public VerifyPKCS1 json(Boolean json) {
    
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


  public VerifyPKCS1 keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the RSA key to use in the verification process
   * @return keyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the RSA key to use in the verification process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public VerifyPKCS1 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message to be verified
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message to be verified")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VerifyPKCS1 prehashed(Boolean prehashed) {
    
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


  public VerifyPKCS1 signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * The message&#39;s signature
   * @return signature
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message's signature")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public VerifyPKCS1 token(String token) {
    
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


  public VerifyPKCS1 uidToken(String uidToken) {
    
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


  public VerifyPKCS1 version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the key to use for verification
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the key to use for verification")

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
    VerifyPKCS1 verifyPKCS1 = (VerifyPKCS1) o;
    return Objects.equals(this.displayId, verifyPKCS1.displayId) &&
        Objects.equals(this.hashFunction, verifyPKCS1.hashFunction) &&
        Objects.equals(this.inputFormat, verifyPKCS1.inputFormat) &&
        Objects.equals(this.itemId, verifyPKCS1.itemId) &&
        Objects.equals(this.json, verifyPKCS1.json) &&
        Objects.equals(this.keyName, verifyPKCS1.keyName) &&
        Objects.equals(this.message, verifyPKCS1.message) &&
        Objects.equals(this.prehashed, verifyPKCS1.prehashed) &&
        Objects.equals(this.signature, verifyPKCS1.signature) &&
        Objects.equals(this.token, verifyPKCS1.token) &&
        Objects.equals(this.uidToken, verifyPKCS1.uidToken) &&
        Objects.equals(this.version, verifyPKCS1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, hashFunction, inputFormat, itemId, json, keyName, message, prehashed, signature, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPKCS1 {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashFunction: ").append(toIndentedString(hashFunction)).append("\n");
    sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    prehashed: ").append(toIndentedString(prehashed)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

