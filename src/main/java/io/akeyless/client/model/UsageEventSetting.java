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
import org.threeten.bp.OffsetDateTime;

/**
 * UsageEventSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageEventSetting {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_ENABLE_TIME = "enable_time";
  @SerializedName(SERIALIZED_NAME_ENABLE_TIME)
  private OffsetDateTime enableTime;

  public static final String SERIALIZED_NAME_INTERVAL_BY_DAYS = "interval_by_days";
  @SerializedName(SERIALIZED_NAME_INTERVAL_BY_DAYS)
  private Long intervalByDays;

  public UsageEventSetting() { 
  }

  public UsageEventSetting enable(Boolean enable) {
    
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


  public UsageEventSetting enableTime(OffsetDateTime enableTime) {
    
    this.enableTime = enableTime;
    return this;
  }

   /**
   * Get enableTime
   * @return enableTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEnableTime() {
    return enableTime;
  }


  public void setEnableTime(OffsetDateTime enableTime) {
    this.enableTime = enableTime;
  }


  public UsageEventSetting intervalByDays(Long intervalByDays) {
    
    this.intervalByDays = intervalByDays;
    return this;
  }

   /**
   * Get intervalByDays
   * @return intervalByDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIntervalByDays() {
    return intervalByDays;
  }


  public void setIntervalByDays(Long intervalByDays) {
    this.intervalByDays = intervalByDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageEventSetting usageEventSetting = (UsageEventSetting) o;
    return Objects.equals(this.enable, usageEventSetting.enable) &&
        Objects.equals(this.enableTime, usageEventSetting.enableTime) &&
        Objects.equals(this.intervalByDays, usageEventSetting.intervalByDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, enableTime, intervalByDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageEventSetting {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    enableTime: ").append(toIndentedString(enableTime)).append("\n");
    sb.append("    intervalByDays: ").append(toIndentedString(intervalByDays)).append("\n");
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

