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
 * RotationSecretMaxInterval
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotationSecretMaxInterval {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_MAX_INTERVAL_BY_DAYS = "max_interval_by_days";
  @SerializedName(SERIALIZED_NAME_MAX_INTERVAL_BY_DAYS)
  private Integer maxIntervalByDays;

  public RotationSecretMaxInterval() { 
  }

  public RotationSecretMaxInterval enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public RotationSecretMaxInterval maxIntervalByDays(Integer maxIntervalByDays) {
    
    this.maxIntervalByDays = maxIntervalByDays;
    return this;
  }

   /**
   * Get maxIntervalByDays
   * @return maxIntervalByDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIntervalByDays() {
    return maxIntervalByDays;
  }


  public void setMaxIntervalByDays(Integer maxIntervalByDays) {
    this.maxIntervalByDays = maxIntervalByDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotationSecretMaxInterval rotationSecretMaxInterval = (RotationSecretMaxInterval) o;
    return Objects.equals(this.enable, rotationSecretMaxInterval.enable) &&
        Objects.equals(this.maxIntervalByDays, rotationSecretMaxInterval.maxIntervalByDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, maxIntervalByDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotationSecretMaxInterval {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    maxIntervalByDays: ").append(toIndentedString(maxIntervalByDays)).append("\n");
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

