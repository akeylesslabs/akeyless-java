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
 * TokenizeOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenizeOutput {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_TWEAK = "tweak";
  @SerializedName(SERIALIZED_NAME_TWEAK)
  private String tweak;

  public TokenizeOutput() { 
  }

  public TokenizeOutput result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public TokenizeOutput tweak(String tweak) {
    
    this.tweak = tweak;
    return this;
  }

   /**
   * Get tweak
   * @return tweak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTweak() {
    return tweak;
  }


  public void setTweak(String tweak) {
    this.tweak = tweak;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeOutput tokenizeOutput = (TokenizeOutput) o;
    return Objects.equals(this.result, tokenizeOutput.result) &&
        Objects.equals(this.tweak, tokenizeOutput.tweak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, tweak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeOutput {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    tweak: ").append(toIndentedString(tweak)).append("\n");
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

