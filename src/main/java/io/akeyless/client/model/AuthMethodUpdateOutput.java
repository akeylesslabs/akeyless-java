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
 * AuthMethodUpdateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthMethodUpdateOutput {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRV_KEY = "prv_key";
  @SerializedName(SERIALIZED_NAME_PRV_KEY)
  private String prvKey;

  public AuthMethodUpdateOutput() { 
  }

  public AuthMethodUpdateOutput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AuthMethodUpdateOutput prvKey(String prvKey) {
    
    this.prvKey = prvKey;
    return this;
  }

   /**
   * Get prvKey
   * @return prvKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrvKey() {
    return prvKey;
  }


  public void setPrvKey(String prvKey) {
    this.prvKey = prvKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodUpdateOutput authMethodUpdateOutput = (AuthMethodUpdateOutput) o;
    return Objects.equals(this.name, authMethodUpdateOutput.name) &&
        Objects.equals(this.prvKey, authMethodUpdateOutput.prvKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, prvKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodUpdateOutput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prvKey: ").append(toIndentedString(prvKey)).append("\n");
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

