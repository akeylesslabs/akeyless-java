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
 * GatewayMessageQueueInfo
 */

public class GatewayMessageQueueInfo {
  public static final String SERIALIZED_NAME_MQ_TYPE = "mq_type";
  @SerializedName(SERIALIZED_NAME_MQ_TYPE)
  private String mqType;

  public static final String SERIALIZED_NAME_QUEUE_NAME = "queue_name";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  private String queueName;

  public static final String SERIALIZED_NAME_QUEUE_URL = "queue_url";
  @SerializedName(SERIALIZED_NAME_QUEUE_URL)
  private String queueUrl;


  public GatewayMessageQueueInfo mqType(String mqType) {
    
    this.mqType = mqType;
    return this;
  }

   /**
   * Get mqType
   * @return mqType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMqType() {
    return mqType;
  }


  public void setMqType(String mqType) {
    this.mqType = mqType;
  }


  public GatewayMessageQueueInfo queueName(String queueName) {
    
    this.queueName = queueName;
    return this;
  }

   /**
   * Get queueName
   * @return queueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueName() {
    return queueName;
  }


  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  public GatewayMessageQueueInfo queueUrl(String queueUrl) {
    
    this.queueUrl = queueUrl;
    return this;
  }

   /**
   * Get queueUrl
   * @return queueUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueUrl() {
    return queueUrl;
  }


  public void setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayMessageQueueInfo gatewayMessageQueueInfo = (GatewayMessageQueueInfo) o;
    return Objects.equals(this.mqType, gatewayMessageQueueInfo.mqType) &&
        Objects.equals(this.queueName, gatewayMessageQueueInfo.queueName) &&
        Objects.equals(this.queueUrl, gatewayMessageQueueInfo.queueUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mqType, queueName, queueUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayMessageQueueInfo {\n");
    sb.append("    mqType: ").append(toIndentedString(mqType)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueUrl: ").append(toIndentedString(queueUrl)).append("\n");
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

