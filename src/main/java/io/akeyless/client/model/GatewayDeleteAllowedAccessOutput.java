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
 * GatewayDeleteAllowedAccessOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayDeleteAllowedAccessOutput {
  public static final String SERIALIZED_NAME_ALLOWED_ACCESS_NAME = "allowed_access_name";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACCESS_NAME)
  private String allowedAccessName;

  public GatewayDeleteAllowedAccessOutput() { 
  }

  public GatewayDeleteAllowedAccessOutput allowedAccessName(String allowedAccessName) {
    
    this.allowedAccessName = allowedAccessName;
    return this;
  }

   /**
   * Get allowedAccessName
   * @return allowedAccessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedAccessName() {
    return allowedAccessName;
  }


  public void setAllowedAccessName(String allowedAccessName) {
    this.allowedAccessName = allowedAccessName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayDeleteAllowedAccessOutput gatewayDeleteAllowedAccessOutput = (GatewayDeleteAllowedAccessOutput) o;
    return Objects.equals(this.allowedAccessName, gatewayDeleteAllowedAccessOutput.allowedAccessName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAccessName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayDeleteAllowedAccessOutput {\n");
    sb.append("    allowedAccessName: ").append(toIndentedString(allowedAccessName)).append("\n");
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

