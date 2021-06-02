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
 * GetSSHCertificate
 */

public class GetSSHCertificate {
  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  private String certIssuerName;

  public static final String SERIALIZED_NAME_CERT_USERNAME = "cert-username";
  @SerializedName(SERIALIZED_NAME_CERT_USERNAME)
  private String certUsername;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_DATA = "public-key-data";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_DATA)
  private String publicKeyData;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public GetSSHCertificate certIssuerName(String certIssuerName) {
    
    this.certIssuerName = certIssuerName;
    return this;
  }

   /**
   * The name of the SSH certificate issuer
   * @return certIssuerName
  **/
  @ApiModelProperty(required = true, value = "The name of the SSH certificate issuer")

  public String getCertIssuerName() {
    return certIssuerName;
  }


  public void setCertIssuerName(String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public GetSSHCertificate certUsername(String certUsername) {
    
    this.certUsername = certUsername;
    return this;
  }

   /**
   * The username to sign in the SSH certificate
   * @return certUsername
  **/
  @ApiModelProperty(required = true, value = "The username to sign in the SSH certificate")

  public String getCertUsername() {
    return certUsername;
  }


  public void setCertUsername(String certUsername) {
    this.certUsername = certUsername;
  }


  public GetSSHCertificate password(String password) {
    
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


  public GetSSHCertificate publicKeyData(String publicKeyData) {
    
    this.publicKeyData = publicKeyData;
    return this;
  }

   /**
   * SSH public key file contents. If this option is used, the certificate will be printed to stdout
   * @return publicKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSH public key file contents. If this option is used, the certificate will be printed to stdout")

  public String getPublicKeyData() {
    return publicKeyData;
  }


  public void setPublicKeyData(String publicKeyData) {
    this.publicKeyData = publicKeyData;
  }


  public GetSSHCertificate token(String token) {
    
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


  public GetSSHCertificate uidToken(String uidToken) {
    
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


  public GetSSHCertificate username(String username) {
    
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
    GetSSHCertificate getSSHCertificate = (GetSSHCertificate) o;
    return Objects.equals(this.certIssuerName, getSSHCertificate.certIssuerName) &&
        Objects.equals(this.certUsername, getSSHCertificate.certUsername) &&
        Objects.equals(this.password, getSSHCertificate.password) &&
        Objects.equals(this.publicKeyData, getSSHCertificate.publicKeyData) &&
        Objects.equals(this.token, getSSHCertificate.token) &&
        Objects.equals(this.uidToken, getSSHCertificate.uidToken) &&
        Objects.equals(this.username, getSSHCertificate.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certIssuerName, certUsername, password, publicKeyData, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSSHCertificate {\n");
    sb.append("    certIssuerName: ").append(toIndentedString(certIssuerName)).append("\n");
    sb.append("    certUsername: ").append(toIndentedString(certUsername)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    publicKeyData: ").append(toIndentedString(publicKeyData)).append("\n");
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

