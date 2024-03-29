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
 * Hmac
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Hmac {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_HASH_FUNCTION = "hash-function";
  @SerializedName(SERIALIZED_NAME_HASH_FUNCTION)
  private String hashFunction = "sha-256";

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

  public static final String SERIALIZED_NAME_PLAINTEXT = "plaintext";
  @SerializedName(SERIALIZED_NAME_PLAINTEXT)
  private String plaintext;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public Hmac() { 
  }

  public Hmac displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the encryption process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the encryption process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public Hmac hashFunction(String hashFunction) {
    
    this.hashFunction = hashFunction;
    return this;
  }

   /**
   * Hash function [sha-256,sha-512]
   * @return hashFunction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hash function [sha-256,sha-512]")

  public String getHashFunction() {
    return hashFunction;
  }


  public void setHashFunction(String hashFunction) {
    this.hashFunction = hashFunction;
  }


  public Hmac inputFormat(String inputFormat) {
    
    this.inputFormat = inputFormat;
    return this;
  }

   /**
   * Select default assumed format for any plaintext input. Currently supported options: [base64]
   * @return inputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Select default assumed format for any plaintext input. Currently supported options: [base64]")

  public String getInputFormat() {
    return inputFormat;
  }


  public void setInputFormat(String inputFormat) {
    this.inputFormat = inputFormat;
  }


  public Hmac itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the encryption process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the encryption process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public Hmac json(Boolean json) {
    
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


  public Hmac keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the key to use in the encryption process
   * @return keyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the key to use in the encryption process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public Hmac plaintext(String plaintext) {
    
    this.plaintext = plaintext;
    return this;
  }

   /**
   * Data to perform hmac on
   * @return plaintext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data to perform hmac on")

  public String getPlaintext() {
    return plaintext;
  }


  public void setPlaintext(String plaintext) {
    this.plaintext = plaintext;
  }


  public Hmac token(String token) {
    
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


  public Hmac uidToken(String uidToken) {
    
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
    Hmac hmac = (Hmac) o;
    return Objects.equals(this.displayId, hmac.displayId) &&
        Objects.equals(this.hashFunction, hmac.hashFunction) &&
        Objects.equals(this.inputFormat, hmac.inputFormat) &&
        Objects.equals(this.itemId, hmac.itemId) &&
        Objects.equals(this.json, hmac.json) &&
        Objects.equals(this.keyName, hmac.keyName) &&
        Objects.equals(this.plaintext, hmac.plaintext) &&
        Objects.equals(this.token, hmac.token) &&
        Objects.equals(this.uidToken, hmac.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, hashFunction, inputFormat, itemId, json, keyName, plaintext, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hmac {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashFunction: ").append(toIndentedString(hashFunction)).append("\n");
    sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    plaintext: ").append(toIndentedString(plaintext)).append("\n");
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

