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
 * GodaddyTargetDetails
 */
@ApiModel(description = "GodaddyTargetDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GodaddyTargetDetails {
  public static final String SERIALIZED_NAME_IMAP_FQDN = "imap_fqdn";
  @SerializedName(SERIALIZED_NAME_IMAP_FQDN)
  private String imapFqdn;

  public static final String SERIALIZED_NAME_IMAP_PASSWORD = "imap_password";
  @SerializedName(SERIALIZED_NAME_IMAP_PASSWORD)
  private String imapPassword;

  public static final String SERIALIZED_NAME_IMAP_PORT = "imap_port";
  @SerializedName(SERIALIZED_NAME_IMAP_PORT)
  private String imapPort;

  public static final String SERIALIZED_NAME_IMAP_USER = "imap_user";
  @SerializedName(SERIALIZED_NAME_IMAP_USER)
  private String imapUser;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_VALIDATION_EMAIL = "validation_email";
  @SerializedName(SERIALIZED_NAME_VALIDATION_EMAIL)
  private String validationEmail;

  public GodaddyTargetDetails() { 
  }

  public GodaddyTargetDetails imapFqdn(String imapFqdn) {
    
    this.imapFqdn = imapFqdn;
    return this;
  }

   /**
   * Get imapFqdn
   * @return imapFqdn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImapFqdn() {
    return imapFqdn;
  }


  public void setImapFqdn(String imapFqdn) {
    this.imapFqdn = imapFqdn;
  }


  public GodaddyTargetDetails imapPassword(String imapPassword) {
    
    this.imapPassword = imapPassword;
    return this;
  }

   /**
   * Get imapPassword
   * @return imapPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImapPassword() {
    return imapPassword;
  }


  public void setImapPassword(String imapPassword) {
    this.imapPassword = imapPassword;
  }


  public GodaddyTargetDetails imapPort(String imapPort) {
    
    this.imapPort = imapPort;
    return this;
  }

   /**
   * Get imapPort
   * @return imapPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImapPort() {
    return imapPort;
  }


  public void setImapPort(String imapPort) {
    this.imapPort = imapPort;
  }


  public GodaddyTargetDetails imapUser(String imapUser) {
    
    this.imapUser = imapUser;
    return this;
  }

   /**
   * Get imapUser
   * @return imapUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImapUser() {
    return imapUser;
  }


  public void setImapUser(String imapUser) {
    this.imapUser = imapUser;
  }


  public GodaddyTargetDetails key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public GodaddyTargetDetails secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public GodaddyTargetDetails timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public GodaddyTargetDetails validationEmail(String validationEmail) {
    
    this.validationEmail = validationEmail;
    return this;
  }

   /**
   * Get validationEmail
   * @return validationEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidationEmail() {
    return validationEmail;
  }


  public void setValidationEmail(String validationEmail) {
    this.validationEmail = validationEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GodaddyTargetDetails godaddyTargetDetails = (GodaddyTargetDetails) o;
    return Objects.equals(this.imapFqdn, godaddyTargetDetails.imapFqdn) &&
        Objects.equals(this.imapPassword, godaddyTargetDetails.imapPassword) &&
        Objects.equals(this.imapPort, godaddyTargetDetails.imapPort) &&
        Objects.equals(this.imapUser, godaddyTargetDetails.imapUser) &&
        Objects.equals(this.key, godaddyTargetDetails.key) &&
        Objects.equals(this.secret, godaddyTargetDetails.secret) &&
        Objects.equals(this.timeout, godaddyTargetDetails.timeout) &&
        Objects.equals(this.validationEmail, godaddyTargetDetails.validationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imapFqdn, imapPassword, imapPort, imapUser, key, secret, timeout, validationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GodaddyTargetDetails {\n");
    sb.append("    imapFqdn: ").append(toIndentedString(imapFqdn)).append("\n");
    sb.append("    imapPassword: ").append(toIndentedString(imapPassword)).append("\n");
    sb.append("    imapPort: ").append(toIndentedString(imapPort)).append("\n");
    sb.append("    imapUser: ").append(toIndentedString(imapUser)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    validationEmail: ").append(toIndentedString(validationEmail)).append("\n");
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

