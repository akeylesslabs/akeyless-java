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
 * verifyRsaSsaPss is a command that Verifies an rsassa-pss signature
 */
@ApiModel(description = "verifyRsaSsaPss is a command that Verifies an rsassa-pss signature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyRsaSsaPss {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_HASH_FUNCTION = "hash-function";
  @SerializedName(SERIALIZED_NAME_HASH_FUNCTION)
  private String hashFunction;

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

  public VerifyRsaSsaPss() { 
  }

  public VerifyRsaSsaPss displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the RSA key to use in the verification process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the RSA key to use in the verification process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public VerifyRsaSsaPss hashFunction(String hashFunction) {
    
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


  public VerifyRsaSsaPss itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the RSA key to use in the verification process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the RSA key to use in the verification process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public VerifyRsaSsaPss json(Boolean json) {
    
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


  public VerifyRsaSsaPss keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the RSA key to use in the verification process
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the RSA key to use in the verification process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public VerifyRsaSsaPss message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The input message to verify in a base64 format
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The input message to verify in a base64 format")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VerifyRsaSsaPss prehashed(Boolean prehashed) {
    
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


  public VerifyRsaSsaPss signature(String signature) {
    
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


  public VerifyRsaSsaPss token(String token) {
    
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


  public VerifyRsaSsaPss uidToken(String uidToken) {
    
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


  public VerifyRsaSsaPss version(Integer version) {
    
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
    VerifyRsaSsaPss verifyRsaSsaPss = (VerifyRsaSsaPss) o;
    return Objects.equals(this.displayId, verifyRsaSsaPss.displayId) &&
        Objects.equals(this.hashFunction, verifyRsaSsaPss.hashFunction) &&
        Objects.equals(this.itemId, verifyRsaSsaPss.itemId) &&
        Objects.equals(this.json, verifyRsaSsaPss.json) &&
        Objects.equals(this.keyName, verifyRsaSsaPss.keyName) &&
        Objects.equals(this.message, verifyRsaSsaPss.message) &&
        Objects.equals(this.prehashed, verifyRsaSsaPss.prehashed) &&
        Objects.equals(this.signature, verifyRsaSsaPss.signature) &&
        Objects.equals(this.token, verifyRsaSsaPss.token) &&
        Objects.equals(this.uidToken, verifyRsaSsaPss.uidToken) &&
        Objects.equals(this.version, verifyRsaSsaPss.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, hashFunction, itemId, json, keyName, message, prehashed, signature, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyRsaSsaPss {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashFunction: ").append(toIndentedString(hashFunction)).append("\n");
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

