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
 * SystemAccessCredentialsReplyObj
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SystemAccessCredentialsReplyObj {
  public static final String SERIALIZED_NAME_AUTH_CREDS = "auth_creds";
  @SerializedName(SERIALIZED_NAME_AUTH_CREDS)
  private String authCreds;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private Long expiry;

  public static final String SERIALIZED_NAME_KFM_CREDS = "kfm_creds";
  @SerializedName(SERIALIZED_NAME_KFM_CREDS)
  private String kfmCreds;

  public static final String SERIALIZED_NAME_REQUIRED_MFA = "required_mfa";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MFA)
  private String requiredMfa;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UAM_CREDS = "uam_creds";
  @SerializedName(SERIALIZED_NAME_UAM_CREDS)
  private String uamCreds;

  public SystemAccessCredentialsReplyObj() { 
  }

  public SystemAccessCredentialsReplyObj authCreds(String authCreds) {
    
    this.authCreds = authCreds;
    return this;
  }

   /**
   * Temporary credentials for accessing Auth
   * @return authCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Temporary credentials for accessing Auth")

  public String getAuthCreds() {
    return authCreds;
  }


  public void setAuthCreds(String authCreds) {
    this.authCreds = authCreds;
  }


  public SystemAccessCredentialsReplyObj expiry(Long expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Credentials expiration date
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credentials expiration date")

  public Long getExpiry() {
    return expiry;
  }


  public void setExpiry(Long expiry) {
    this.expiry = expiry;
  }


  public SystemAccessCredentialsReplyObj kfmCreds(String kfmCreds) {
    
    this.kfmCreds = kfmCreds;
    return this;
  }

   /**
   * Temporary credentials for accessing the KFMs instances
   * @return kfmCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Temporary credentials for accessing the KFMs instances")

  public String getKfmCreds() {
    return kfmCreds;
  }


  public void setKfmCreds(String kfmCreds) {
    this.kfmCreds = kfmCreds;
  }


  public SystemAccessCredentialsReplyObj requiredMfa(String requiredMfa) {
    
    this.requiredMfa = requiredMfa;
    return this;
  }

   /**
   * Get requiredMfa
   * @return requiredMfa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequiredMfa() {
    return requiredMfa;
  }


  public void setRequiredMfa(String requiredMfa) {
    this.requiredMfa = requiredMfa;
  }


  public SystemAccessCredentialsReplyObj token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Credentials tmp token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credentials tmp token")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public SystemAccessCredentialsReplyObj uamCreds(String uamCreds) {
    
    this.uamCreds = uamCreds;
    return this;
  }

   /**
   * Temporary credentials for accessing the UAM service
   * @return uamCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Temporary credentials for accessing the UAM service")

  public String getUamCreds() {
    return uamCreds;
  }


  public void setUamCreds(String uamCreds) {
    this.uamCreds = uamCreds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAccessCredentialsReplyObj systemAccessCredentialsReplyObj = (SystemAccessCredentialsReplyObj) o;
    return Objects.equals(this.authCreds, systemAccessCredentialsReplyObj.authCreds) &&
        Objects.equals(this.expiry, systemAccessCredentialsReplyObj.expiry) &&
        Objects.equals(this.kfmCreds, systemAccessCredentialsReplyObj.kfmCreds) &&
        Objects.equals(this.requiredMfa, systemAccessCredentialsReplyObj.requiredMfa) &&
        Objects.equals(this.token, systemAccessCredentialsReplyObj.token) &&
        Objects.equals(this.uamCreds, systemAccessCredentialsReplyObj.uamCreds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCreds, expiry, kfmCreds, requiredMfa, token, uamCreds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAccessCredentialsReplyObj {\n");
    sb.append("    authCreds: ").append(toIndentedString(authCreds)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    kfmCreds: ").append(toIndentedString(kfmCreds)).append("\n");
    sb.append("    requiredMfa: ").append(toIndentedString(requiredMfa)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uamCreds: ").append(toIndentedString(uamCreds)).append("\n");
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

