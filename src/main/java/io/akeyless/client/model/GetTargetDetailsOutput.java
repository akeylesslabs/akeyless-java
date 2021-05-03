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
import io.akeyless.client.model.Target;
import io.akeyless.client.model.TargetTypeDetailesInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetTargetDetailsOutput
 */

public class GetTargetDetailsOutput {
  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private Target target;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private TargetTypeDetailesInput value;


  public GetTargetDetailsOutput target(Target target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Target getTarget() {
    return target;
  }


  public void setTarget(Target target) {
    this.target = target;
  }


  public GetTargetDetailsOutput value(TargetTypeDetailesInput value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetTypeDetailesInput getValue() {
    return value;
  }


  public void setValue(TargetTypeDetailesInput value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTargetDetailsOutput getTargetDetailsOutput = (GetTargetDetailsOutput) o;
    return Objects.equals(this.target, getTargetDetailsOutput.target) &&
        Objects.equals(this.value, getTargetDetailsOutput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTargetDetailsOutput {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

