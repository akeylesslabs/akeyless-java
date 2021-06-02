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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EncryptFile
 */

public class EncryptFile {
  public static final String SERIALIZED_NAME_ENCRYPTION_CONTEXT = "encryption-context";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_CONTEXT)
  private Map<String, String> encryptionContext = null;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private String in;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_OUT = "out";
  @SerializedName(SERIALIZED_NAME_OUT)
  private String out;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public EncryptFile encryptionContext(Map<String, String> encryptionContext) {
    
    this.encryptionContext = encryptionContext;
    return this;
  }

  public EncryptFile putEncryptionContextItem(String key, String encryptionContextItem) {
    if (this.encryptionContext == null) {
      this.encryptionContext = new HashMap<String, String>();
    }
    this.encryptionContext.put(key, encryptionContextItem);
    return this;
  }

   /**
   * name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail
   * @return encryptionContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail")

  public Map<String, String> getEncryptionContext() {
    return encryptionContext;
  }


  public void setEncryptionContext(Map<String, String> encryptionContext) {
    this.encryptionContext = encryptionContext;
  }


  public EncryptFile in(String in) {
    
    this.in = in;
    return this;
  }

   /**
   * Path to the file to be encrypted. If not provided, the content will be taken from stdin
   * @return in
  **/
  @ApiModelProperty(required = true, value = "Path to the file to be encrypted. If not provided, the content will be taken from stdin")

  public String getIn() {
    return in;
  }


  public void setIn(String in) {
    this.in = in;
  }


  public EncryptFile keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the key to use in the encryption process
   * @return keyName
  **/
  @ApiModelProperty(required = true, value = "The name of the key to use in the encryption process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public EncryptFile out(String out) {
    
    this.out = out;
    return this;
  }

   /**
   * Path to the output file. If not provided, the output will be sent to stdout
   * @return out
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the output file. If not provided, the output will be sent to stdout")

  public String getOut() {
    return out;
  }


  public void setOut(String out) {
    this.out = out;
  }


  public EncryptFile password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public EncryptFile token(String token) {
    
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


  public EncryptFile uidToken(String uidToken) {
    
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


  public EncryptFile username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptFile encryptFile = (EncryptFile) o;
    return Objects.equals(this.encryptionContext, encryptFile.encryptionContext) &&
        Objects.equals(this.in, encryptFile.in) &&
        Objects.equals(this.keyName, encryptFile.keyName) &&
        Objects.equals(this.out, encryptFile.out) &&
        Objects.equals(this.password, encryptFile.password) &&
        Objects.equals(this.token, encryptFile.token) &&
        Objects.equals(this.uidToken, encryptFile.uidToken) &&
        Objects.equals(this.username, encryptFile.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionContext, in, keyName, out, password, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptFile {\n");
    sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

