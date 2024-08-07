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
 * DecryptGPG
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DecryptGPG {
  public static final String SERIALIZED_NAME_CIPHERTEXT = "ciphertext";
  @SerializedName(SERIALIZED_NAME_CIPHERTEXT)
  private String ciphertext;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_INPUT_FORMAT = "input-format";
  @SerializedName(SERIALIZED_NAME_INPUT_FORMAT)
  private String inputFormat = "base64";

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat;

  public static final String SERIALIZED_NAME_PASSPHRASE = "passphrase";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE)
  private String passphrase;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DecryptGPG() { 
  }

  public DecryptGPG ciphertext(String ciphertext) {
    
    this.ciphertext = ciphertext;
    return this;
  }

   /**
   * Ciphertext to be decrypted
   * @return ciphertext
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Ciphertext to be decrypted")

  public String getCiphertext() {
    return ciphertext;
  }


  public void setCiphertext(String ciphertext) {
    this.ciphertext = ciphertext;
  }


  public DecryptGPG displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the decryption process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the decryption process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public DecryptGPG inputFormat(String inputFormat) {
    
    this.inputFormat = inputFormat;
    return this;
  }

   /**
   * Select default assumed format for the ciphertext. Currently supported options: [base64,raw]
   * @return inputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Select default assumed format for the ciphertext. Currently supported options: [base64,raw]")

  public String getInputFormat() {
    return inputFormat;
  }


  public void setInputFormat(String inputFormat) {
    this.inputFormat = inputFormat;
  }


  public DecryptGPG itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the decryption process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the decryption process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DecryptGPG json(Boolean json) {
    
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


  public DecryptGPG keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the key to use in the decryption process
   * @return keyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the key to use in the decryption process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public DecryptGPG outputFormat(String outputFormat) {
    
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * If specified, the output will be formatted accordingly. options: [base64]
   * @return outputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the output will be formatted accordingly. options: [base64]")

  public String getOutputFormat() {
    return outputFormat;
  }


  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public DecryptGPG passphrase(String passphrase) {
    
    this.passphrase = passphrase;
    return this;
  }

   /**
   * Passphrase that was used to generate the key
   * @return passphrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Passphrase that was used to generate the key")

  public String getPassphrase() {
    return passphrase;
  }


  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  public DecryptGPG token(String token) {
    
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


  public DecryptGPG uidToken(String uidToken) {
    
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
    DecryptGPG decryptGPG = (DecryptGPG) o;
    return Objects.equals(this.ciphertext, decryptGPG.ciphertext) &&
        Objects.equals(this.displayId, decryptGPG.displayId) &&
        Objects.equals(this.inputFormat, decryptGPG.inputFormat) &&
        Objects.equals(this.itemId, decryptGPG.itemId) &&
        Objects.equals(this.json, decryptGPG.json) &&
        Objects.equals(this.keyName, decryptGPG.keyName) &&
        Objects.equals(this.outputFormat, decryptGPG.outputFormat) &&
        Objects.equals(this.passphrase, decryptGPG.passphrase) &&
        Objects.equals(this.token, decryptGPG.token) &&
        Objects.equals(this.uidToken, decryptGPG.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphertext, displayId, inputFormat, itemId, json, keyName, outputFormat, passphrase, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptGPG {\n");
    sb.append("    ciphertext: ").append(toIndentedString(ciphertext)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
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

