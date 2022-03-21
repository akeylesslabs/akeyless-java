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
 * EncryptWithClassicKey
 */

public class EncryptWithClassicKey {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_PLAINTEXT = "plaintext";
  @SerializedName(SERIALIZED_NAME_PLAINTEXT)
  private String plaintext;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public EncryptWithClassicKey displayId(String displayId) {
    
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


  public EncryptWithClassicKey plaintext(String plaintext) {
    
    this.plaintext = plaintext;
    return this;
  }

   /**
   * Data to be encrypted
   * @return plaintext
  **/
  @ApiModelProperty(required = true, value = "Data to be encrypted")

  public String getPlaintext() {
    return plaintext;
  }


  public void setPlaintext(String plaintext) {
    this.plaintext = plaintext;
  }


  public EncryptWithClassicKey token(String token) {
    
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


  public EncryptWithClassicKey uidToken(String uidToken) {
    
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


  public EncryptWithClassicKey version(Integer version) {
    
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
    EncryptWithClassicKey encryptWithClassicKey = (EncryptWithClassicKey) o;
    return Objects.equals(this.displayId, encryptWithClassicKey.displayId) &&
        Objects.equals(this.plaintext, encryptWithClassicKey.plaintext) &&
        Objects.equals(this.token, encryptWithClassicKey.token) &&
        Objects.equals(this.uidToken, encryptWithClassicKey.uidToken) &&
        Objects.equals(this.version, encryptWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, plaintext, token, uidToken, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptWithClassicKey {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    plaintext: ").append(toIndentedString(plaintext)).append("\n");
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

