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
import io.akeyless.client.model.ConfigChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GatewayCreateK8SAuthConfigOutput
 */

public class GatewayCreateK8SAuthConfigOutput {
  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_PARTS_CHANGE = "parts_change";
  @SerializedName(SERIALIZED_NAME_PARTS_CHANGE)
  private ConfigChange partsChange;

  public static final String SERIALIZED_NAME_TOTAL_HASH = "total_hash";
  @SerializedName(SERIALIZED_NAME_TOTAL_HASH)
  private String totalHash;


  public GatewayCreateK8SAuthConfigOutput clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public GatewayCreateK8SAuthConfigOutput partsChange(ConfigChange partsChange) {
    
    this.partsChange = partsChange;
    return this;
  }

   /**
   * Get partsChange
   * @return partsChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigChange getPartsChange() {
    return partsChange;
  }


  public void setPartsChange(ConfigChange partsChange) {
    this.partsChange = partsChange;
  }


  public GatewayCreateK8SAuthConfigOutput totalHash(String totalHash) {
    
    this.totalHash = totalHash;
    return this;
  }

   /**
   * Get totalHash
   * @return totalHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalHash() {
    return totalHash;
  }


  public void setTotalHash(String totalHash) {
    this.totalHash = totalHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateK8SAuthConfigOutput gatewayCreateK8SAuthConfigOutput = (GatewayCreateK8SAuthConfigOutput) o;
    return Objects.equals(this.clusterId, gatewayCreateK8SAuthConfigOutput.clusterId) &&
        Objects.equals(this.partsChange, gatewayCreateK8SAuthConfigOutput.partsChange) &&
        Objects.equals(this.totalHash, gatewayCreateK8SAuthConfigOutput.totalHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, partsChange, totalHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateK8SAuthConfigOutput {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    partsChange: ").append(toIndentedString(partsChange)).append("\n");
    sb.append("    totalHash: ").append(toIndentedString(totalHash)).append("\n");
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

