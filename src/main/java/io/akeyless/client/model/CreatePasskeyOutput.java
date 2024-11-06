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
 * CreatePasskeyOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePasskeyOutput {
  public static final String SERIALIZED_NAME_CLASSIC_KEY_ID = "classic_key_id";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_ID)
  private String classicKeyId;

  public static final String SERIALIZED_NAME_CLASSIC_KEY_NAME = "classic_key_name";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_NAME)
  private String classicKeyName;

  public static final String SERIALIZED_NAME_CLASSIC_KEY_TYPE = "classic_key_type";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_TYPE)
  private String classicKeyType;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public CreatePasskeyOutput() { 
  }

  public CreatePasskeyOutput classicKeyId(String classicKeyId) {
    
    this.classicKeyId = classicKeyId;
    return this;
  }

   /**
   * Get classicKeyId
   * @return classicKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassicKeyId() {
    return classicKeyId;
  }


  public void setClassicKeyId(String classicKeyId) {
    this.classicKeyId = classicKeyId;
  }


  public CreatePasskeyOutput classicKeyName(String classicKeyName) {
    
    this.classicKeyName = classicKeyName;
    return this;
  }

   /**
   * Get classicKeyName
   * @return classicKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassicKeyName() {
    return classicKeyName;
  }


  public void setClassicKeyName(String classicKeyName) {
    this.classicKeyName = classicKeyName;
  }


  public CreatePasskeyOutput classicKeyType(String classicKeyType) {
    
    this.classicKeyType = classicKeyType;
    return this;
  }

   /**
   * Get classicKeyType
   * @return classicKeyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassicKeyType() {
    return classicKeyType;
  }


  public void setClassicKeyType(String classicKeyType) {
    this.classicKeyType = classicKeyType;
  }


  public CreatePasskeyOutput publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePasskeyOutput createPasskeyOutput = (CreatePasskeyOutput) o;
    return Objects.equals(this.classicKeyId, createPasskeyOutput.classicKeyId) &&
        Objects.equals(this.classicKeyName, createPasskeyOutput.classicKeyName) &&
        Objects.equals(this.classicKeyType, createPasskeyOutput.classicKeyType) &&
        Objects.equals(this.publicKey, createPasskeyOutput.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classicKeyId, classicKeyName, classicKeyType, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePasskeyOutput {\n");
    sb.append("    classicKeyId: ").append(toIndentedString(classicKeyId)).append("\n");
    sb.append("    classicKeyName: ").append(toIndentedString(classicKeyName)).append("\n");
    sb.append("    classicKeyType: ").append(toIndentedString(classicKeyType)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
