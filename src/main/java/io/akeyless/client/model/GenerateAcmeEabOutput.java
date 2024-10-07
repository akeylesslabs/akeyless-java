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
 * GenerateAcmeEabOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenerateAcmeEabOutput {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_MAC_KEY = "mac_key";
  @SerializedName(SERIALIZED_NAME_MAC_KEY)
  private String macKey;

  public GenerateAcmeEabOutput() { 
  }

  public GenerateAcmeEabOutput expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public GenerateAcmeEabOutput kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * Get kid
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public GenerateAcmeEabOutput macKey(String macKey) {
    
    this.macKey = macKey;
    return this;
  }

   /**
   * Get macKey
   * @return macKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacKey() {
    return macKey;
  }


  public void setMacKey(String macKey) {
    this.macKey = macKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateAcmeEabOutput generateAcmeEabOutput = (GenerateAcmeEabOutput) o;
    return Objects.equals(this.expiresAt, generateAcmeEabOutput.expiresAt) &&
        Objects.equals(this.kid, generateAcmeEabOutput.kid) &&
        Objects.equals(this.macKey, generateAcmeEabOutput.macKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, kid, macKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateAcmeEabOutput {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    macKey: ").append(toIndentedString(macKey)).append("\n");
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
