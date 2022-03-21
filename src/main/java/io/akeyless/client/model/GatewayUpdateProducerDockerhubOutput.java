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
import io.akeyless.client.model.DSProducerDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GatewayUpdateProducerDockerhubOutput
 */

public class GatewayUpdateProducerDockerhubOutput {
  public static final String SERIALIZED_NAME_PRODUCER_DETAILS = "producer_details";
  @SerializedName(SERIALIZED_NAME_PRODUCER_DETAILS)
  private DSProducerDetails producerDetails;


  public GatewayUpdateProducerDockerhubOutput producerDetails(DSProducerDetails producerDetails) {
    
    this.producerDetails = producerDetails;
    return this;
  }

   /**
   * Get producerDetails
   * @return producerDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DSProducerDetails getProducerDetails() {
    return producerDetails;
  }


  public void setProducerDetails(DSProducerDetails producerDetails) {
    this.producerDetails = producerDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateProducerDockerhubOutput gatewayUpdateProducerDockerhubOutput = (GatewayUpdateProducerDockerhubOutput) o;
    return Objects.equals(this.producerDetails, gatewayUpdateProducerDockerhubOutput.producerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerDockerhubOutput {\n");
    sb.append("    producerDetails: ").append(toIndentedString(producerDetails)).append("\n");
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

