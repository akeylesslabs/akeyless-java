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
 * DecryptWithClassicKey
 */

public class DecryptWithClassicKey {
  public static final String SERIALIZED_NAME_CIPHERTEXT = "ciphertext";
  @SerializedName(SERIALIZED_NAME_CIPHERTEXT)
  private String ciphertext;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public DecryptWithClassicKey ciphertext(String ciphertext) {
    
    this.ciphertext = ciphertext;
    return this;
  }

   /**
   * Ciphertext to be decrypted in base64 encoded format
   * @return ciphertext
  **/
  @ApiModelProperty(required = true, value = "Ciphertext to be decrypted in base64 encoded format")

  public String getCiphertext() {
    return ciphertext;
  }


  public void setCiphertext(String ciphertext) {
    this.ciphertext = ciphertext;
  }


  public DecryptWithClassicKey displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The name of the key to use in the encryption process
   * @return displayId
  **/
  @ApiModelProperty(required = true, value = "The name of the key to use in the encryption process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public DecryptWithClassicKey token(String token) {
    
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


  public DecryptWithClassicKey uidToken(String uidToken) {
    
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


  public DecryptWithClassicKey version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * classic key version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "classic key version")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecryptWithClassicKey decryptWithClassicKey = (DecryptWithClassicKey) o;
    return Objects.equals(this.ciphertext, decryptWithClassicKey.ciphertext) &&
        Objects.equals(this.displayId, decryptWithClassicKey.displayId) &&
        Objects.equals(this.token, decryptWithClassicKey.token) &&
        Objects.equals(this.uidToken, decryptWithClassicKey.uidToken) &&
        Objects.equals(this.version, decryptWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphertext, displayId, token, uidToken, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptWithClassicKey {\n");
    sb.append("    ciphertext: ").append(toIndentedString(ciphertext)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

