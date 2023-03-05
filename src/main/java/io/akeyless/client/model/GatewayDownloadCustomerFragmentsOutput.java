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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GatewayDownloadCustomerFragmentsOutput
 */

public class GatewayDownloadCustomerFragmentsOutput {
  public static final String SERIALIZED_NAME_CF_JSON = "cf_json";
  @SerializedName(SERIALIZED_NAME_CF_JSON)
  private Map<String, Object> cfJson = null;


  public GatewayDownloadCustomerFragmentsOutput cfJson(Map<String, Object> cfJson) {
    
    this.cfJson = cfJson;
    return this;
  }

  public GatewayDownloadCustomerFragmentsOutput putCfJsonItem(String key, Object cfJsonItem) {
    if (this.cfJson == null) {
      this.cfJson = new HashMap<String, Object>();
    }
    this.cfJson.put(key, cfJsonItem);
    return this;
  }

   /**
   * Get cfJson
   * @return cfJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCfJson() {
    return cfJson;
  }


  public void setCfJson(Map<String, Object> cfJson) {
    this.cfJson = cfJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayDownloadCustomerFragmentsOutput gatewayDownloadCustomerFragmentsOutput = (GatewayDownloadCustomerFragmentsOutput) o;
    return Objects.equals(this.cfJson, gatewayDownloadCustomerFragmentsOutput.cfJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfJson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayDownloadCustomerFragmentsOutput {\n");
    sb.append("    cfJson: ").append(toIndentedString(cfJson)).append("\n");
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

