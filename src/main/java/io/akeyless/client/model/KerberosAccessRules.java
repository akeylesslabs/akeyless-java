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
 * KerberosAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KerberosAccessRules {
  public static final String SERIALIZED_NAME_SIGN_PUBLIC_KEY = "sign_public_key";
  @SerializedName(SERIALIZED_NAME_SIGN_PUBLIC_KEY)
  private String signPublicKey;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public KerberosAccessRules() { 
  }

  public KerberosAccessRules signPublicKey(String signPublicKey) {
    
    this.signPublicKey = signPublicKey;
    return this;
  }

   /**
   * Get signPublicKey
   * @return signPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignPublicKey() {
    return signPublicKey;
  }


  public void setSignPublicKey(String signPublicKey) {
    this.signPublicKey = signPublicKey;
  }


  public KerberosAccessRules uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * Get uniqueIdentifier
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosAccessRules kerberosAccessRules = (KerberosAccessRules) o;
    return Objects.equals(this.signPublicKey, kerberosAccessRules.signPublicKey) &&
        Objects.equals(this.uniqueIdentifier, kerberosAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signPublicKey, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosAccessRules {\n");
    sb.append("    signPublicKey: ").append(toIndentedString(signPublicKey)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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
