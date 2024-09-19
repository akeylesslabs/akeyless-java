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
import org.threeten.bp.OffsetDateTime;

/**
 * EmailPassAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmailPassAccessRules {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ENC_EMAIL_WITH_SHARED_KEY = "enc_email_with_shared_key";
  @SerializedName(SERIALIZED_NAME_ENC_EMAIL_WITH_SHARED_KEY)
  private String encEmailWithSharedKey;

  public static final String SERIALIZED_NAME_HASH_PASS = "hash_pass";
  @SerializedName(SERIALIZED_NAME_HASH_PASS)
  private String hashPass;

  public static final String SERIALIZED_NAME_LAST_RESET_PASSWORD = "last_reset_password";
  @SerializedName(SERIALIZED_NAME_LAST_RESET_PASSWORD)
  private OffsetDateTime lastResetPassword;

  public EmailPassAccessRules() { 
  }

  public EmailPassAccessRules alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Get alg
   * @return alg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public EmailPassAccessRules email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The Email value
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Email value")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmailPassAccessRules encEmailWithSharedKey(String encEmailWithSharedKey) {
    
    this.encEmailWithSharedKey = encEmailWithSharedKey;
    return this;
  }

   /**
   * EncEmailWithSharedKey is the email of this auth method, encrypted with the shared auth/uam key (for use in uam)
   * @return encEmailWithSharedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EncEmailWithSharedKey is the email of this auth method, encrypted with the shared auth/uam key (for use in uam)")

  public String getEncEmailWithSharedKey() {
    return encEmailWithSharedKey;
  }


  public void setEncEmailWithSharedKey(String encEmailWithSharedKey) {
    this.encEmailWithSharedKey = encEmailWithSharedKey;
  }


  public EmailPassAccessRules hashPass(String hashPass) {
    
    this.hashPass = hashPass;
    return this;
  }

   /**
   * The password value
   * @return hashPass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password value")

  public String getHashPass() {
    return hashPass;
  }


  public void setHashPass(String hashPass) {
    this.hashPass = hashPass;
  }


  public EmailPassAccessRules lastResetPassword(OffsetDateTime lastResetPassword) {
    
    this.lastResetPassword = lastResetPassword;
    return this;
  }

   /**
   * The last password change date
   * @return lastResetPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last password change date")

  public OffsetDateTime getLastResetPassword() {
    return lastResetPassword;
  }


  public void setLastResetPassword(OffsetDateTime lastResetPassword) {
    this.lastResetPassword = lastResetPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPassAccessRules emailPassAccessRules = (EmailPassAccessRules) o;
    return Objects.equals(this.alg, emailPassAccessRules.alg) &&
        Objects.equals(this.email, emailPassAccessRules.email) &&
        Objects.equals(this.encEmailWithSharedKey, emailPassAccessRules.encEmailWithSharedKey) &&
        Objects.equals(this.hashPass, emailPassAccessRules.hashPass) &&
        Objects.equals(this.lastResetPassword, emailPassAccessRules.lastResetPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, email, encEmailWithSharedKey, hashPass, lastResetPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPassAccessRules {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    encEmailWithSharedKey: ").append(toIndentedString(encEmailWithSharedKey)).append("\n");
    sb.append("    hashPass: ").append(toIndentedString(hashPass)).append("\n");
    sb.append("    lastResetPassword: ").append(toIndentedString(lastResetPassword)).append("\n");
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

