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
 * DynamicSecretProducerInfo The dynamic secret producer info This parameter relevant and required only in case of create update dynamic secret.
 */
@ApiModel(description = "DynamicSecretProducerInfo The dynamic secret producer info This parameter relevant and required only in case of create update dynamic secret.")

public class DynamicSecretProducerInfo {
  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_GW_CLUSTER_ID = "gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_ID)
  private Long gwClusterId;

  public static final String SERIALIZED_NAME_K8S_ALLOWED_NAMESPACES = "k8s_allowed_namespaces";
  @SerializedName(SERIALIZED_NAME_K8S_ALLOWED_NAMESPACES)
  private String k8sAllowedNamespaces;

  public static final String SERIALIZED_NAME_K8S_DYNAMIC_MODE = "k8s_dynamic_mode";
  @SerializedName(SERIALIZED_NAME_K8S_DYNAMIC_MODE)
  private Boolean k8sDynamicMode;

  public static final String SERIALIZED_NAME_PRODUCER_LAST_KEEP_ALIVE = "producer_last_keep_alive";
  @SerializedName(SERIALIZED_NAME_PRODUCER_LAST_KEEP_ALIVE)
  private String producerLastKeepAlive;

  public static final String SERIALIZED_NAME_PRODUCER_METADATA = "producer_metadata";
  @SerializedName(SERIALIZED_NAME_PRODUCER_METADATA)
  private String producerMetadata;

  public static final String SERIALIZED_NAME_PRODUCER_STATUS = "producer_status";
  @SerializedName(SERIALIZED_NAME_PRODUCER_STATUS)
  private String producerStatus;

  public static final String SERIALIZED_NAME_PRODUCER_TYPE = "producer_type";
  @SerializedName(SERIALIZED_NAME_PRODUCER_TYPE)
  private String producerType;


  public DynamicSecretProducerInfo failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public DynamicSecretProducerInfo gwClusterId(Long gwClusterId) {
    
    this.gwClusterId = gwClusterId;
    return this;
  }

   /**
   * Get gwClusterId
   * @return gwClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGwClusterId() {
    return gwClusterId;
  }


  public void setGwClusterId(Long gwClusterId) {
    this.gwClusterId = gwClusterId;
  }


  public DynamicSecretProducerInfo k8sAllowedNamespaces(String k8sAllowedNamespaces) {
    
    this.k8sAllowedNamespaces = k8sAllowedNamespaces;
    return this;
  }

   /**
   * Relevant only for generic k8s producer
   * @return k8sAllowedNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relevant only for generic k8s producer")

  public String getK8sAllowedNamespaces() {
    return k8sAllowedNamespaces;
  }


  public void setK8sAllowedNamespaces(String k8sAllowedNamespaces) {
    this.k8sAllowedNamespaces = k8sAllowedNamespaces;
  }


  public DynamicSecretProducerInfo k8sDynamicMode(Boolean k8sDynamicMode) {
    
    this.k8sDynamicMode = k8sDynamicMode;
    return this;
  }

   /**
   * Relevant only for generic k8s producer
   * @return k8sDynamicMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relevant only for generic k8s producer")

  public Boolean getK8sDynamicMode() {
    return k8sDynamicMode;
  }


  public void setK8sDynamicMode(Boolean k8sDynamicMode) {
    this.k8sDynamicMode = k8sDynamicMode;
  }


  public DynamicSecretProducerInfo producerLastKeepAlive(String producerLastKeepAlive) {
    
    this.producerLastKeepAlive = producerLastKeepAlive;
    return this;
  }

   /**
   * Get producerLastKeepAlive
   * @return producerLastKeepAlive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProducerLastKeepAlive() {
    return producerLastKeepAlive;
  }


  public void setProducerLastKeepAlive(String producerLastKeepAlive) {
    this.producerLastKeepAlive = producerLastKeepAlive;
  }


  public DynamicSecretProducerInfo producerMetadata(String producerMetadata) {
    
    this.producerMetadata = producerMetadata;
    return this;
  }

   /**
   * Get producerMetadata
   * @return producerMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProducerMetadata() {
    return producerMetadata;
  }


  public void setProducerMetadata(String producerMetadata) {
    this.producerMetadata = producerMetadata;
  }


  public DynamicSecretProducerInfo producerStatus(String producerStatus) {
    
    this.producerStatus = producerStatus;
    return this;
  }

   /**
   * RotationStatus defines types of rotation Status
   * @return producerStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RotationStatus defines types of rotation Status")

  public String getProducerStatus() {
    return producerStatus;
  }


  public void setProducerStatus(String producerStatus) {
    this.producerStatus = producerStatus;
  }


  public DynamicSecretProducerInfo producerType(String producerType) {
    
    this.producerType = producerType;
    return this;
  }

   /**
   * Get producerType
   * @return producerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProducerType() {
    return producerType;
  }


  public void setProducerType(String producerType) {
    this.producerType = producerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretProducerInfo dynamicSecretProducerInfo = (DynamicSecretProducerInfo) o;
    return Objects.equals(this.failureMessage, dynamicSecretProducerInfo.failureMessage) &&
        Objects.equals(this.gwClusterId, dynamicSecretProducerInfo.gwClusterId) &&
        Objects.equals(this.k8sAllowedNamespaces, dynamicSecretProducerInfo.k8sAllowedNamespaces) &&
        Objects.equals(this.k8sDynamicMode, dynamicSecretProducerInfo.k8sDynamicMode) &&
        Objects.equals(this.producerLastKeepAlive, dynamicSecretProducerInfo.producerLastKeepAlive) &&
        Objects.equals(this.producerMetadata, dynamicSecretProducerInfo.producerMetadata) &&
        Objects.equals(this.producerStatus, dynamicSecretProducerInfo.producerStatus) &&
        Objects.equals(this.producerType, dynamicSecretProducerInfo.producerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureMessage, gwClusterId, k8sAllowedNamespaces, k8sDynamicMode, producerLastKeepAlive, producerMetadata, producerStatus, producerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretProducerInfo {\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    gwClusterId: ").append(toIndentedString(gwClusterId)).append("\n");
    sb.append("    k8sAllowedNamespaces: ").append(toIndentedString(k8sAllowedNamespaces)).append("\n");
    sb.append("    k8sDynamicMode: ").append(toIndentedString(k8sDynamicMode)).append("\n");
    sb.append("    producerLastKeepAlive: ").append(toIndentedString(producerLastKeepAlive)).append("\n");
    sb.append("    producerMetadata: ").append(toIndentedString(producerMetadata)).append("\n");
    sb.append("    producerStatus: ").append(toIndentedString(producerStatus)).append("\n");
    sb.append("    producerType: ").append(toIndentedString(producerType)).append("\n");
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

