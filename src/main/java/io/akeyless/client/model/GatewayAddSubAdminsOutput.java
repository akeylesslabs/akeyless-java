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
import java.util.ArrayList;
import java.util.List;

/**
 * GatewayAddSubAdminsOutput
 */

public class GatewayAddSubAdminsOutput {
  public static final String SERIALIZED_NAME_SUB_ADMINS = "sub-admins";
  @SerializedName(SERIALIZED_NAME_SUB_ADMINS)
  private List<String> subAdmins = null;


  public GatewayAddSubAdminsOutput subAdmins(List<String> subAdmins) {
    
    this.subAdmins = subAdmins;
    return this;
  }

  public GatewayAddSubAdminsOutput addSubAdminsItem(String subAdminsItem) {
    if (this.subAdmins == null) {
      this.subAdmins = new ArrayList<String>();
    }
    this.subAdmins.add(subAdminsItem);
    return this;
  }

   /**
   * Get subAdmins
   * @return subAdmins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubAdmins() {
    return subAdmins;
  }


  public void setSubAdmins(List<String> subAdmins) {
    this.subAdmins = subAdmins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayAddSubAdminsOutput gatewayAddSubAdminsOutput = (GatewayAddSubAdminsOutput) o;
    return Objects.equals(this.subAdmins, gatewayAddSubAdminsOutput.subAdmins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subAdmins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayAddSubAdminsOutput {\n");
    sb.append("    subAdmins: ").append(toIndentedString(subAdmins)).append("\n");
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

