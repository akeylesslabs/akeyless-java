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
import io.akeyless.client.model.GwClusterIdentity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GatewaysListResponse Gateway cluster identity list
 */
@ApiModel(description = "GatewaysListResponse Gateway cluster identity list")

public class GatewaysListResponse {
  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private List<GwClusterIdentity> clusters = null;


  public GatewaysListResponse clusters(List<GwClusterIdentity> clusters) {
    
    this.clusters = clusters;
    return this;
  }

  public GatewaysListResponse addClustersItem(GwClusterIdentity clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<GwClusterIdentity>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GwClusterIdentity> getClusters() {
    return clusters;
  }


  public void setClusters(List<GwClusterIdentity> clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewaysListResponse gatewaysListResponse = (GatewaysListResponse) o;
    return Objects.equals(this.clusters, gatewaysListResponse.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewaysListResponse {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
