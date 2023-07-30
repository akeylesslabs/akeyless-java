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
 * AWSTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AWSTargetDetails {
  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_ID = "aws_access_key_id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_ID)
  private String awsAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws_region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  private String awsRegion;

  public static final String SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY = "aws_secret_access_key";
  @SerializedName(SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY)
  private String awsSecretAccessKey;

  public static final String SERIALIZED_NAME_AWS_SESSION_TOKEN = "aws_session_token";
  @SerializedName(SERIALIZED_NAME_AWS_SESSION_TOKEN)
  private String awsSessionToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use_gw_cloud_identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;

  public AWSTargetDetails() { 
  }

  public AWSTargetDetails awsAccessKeyId(String awsAccessKeyId) {
    
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

   /**
   * Get awsAccessKeyId
   * @return awsAccessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }


  public void setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }


  public AWSTargetDetails awsRegion(String awsRegion) {
    
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * Get awsRegion
   * @return awsRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAwsRegion() {
    return awsRegion;
  }


  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }


  public AWSTargetDetails awsSecretAccessKey(String awsSecretAccessKey) {
    
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

   /**
   * Get awsSecretAccessKey
   * @return awsSecretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }


  public void setAwsSecretAccessKey(String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
  }


  public AWSTargetDetails awsSessionToken(String awsSessionToken) {
    
    this.awsSessionToken = awsSessionToken;
    return this;
  }

   /**
   * Get awsSessionToken
   * @return awsSessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAwsSessionToken() {
    return awsSessionToken;
  }


  public void setAwsSessionToken(String awsSessionToken) {
    this.awsSessionToken = awsSessionToken;
  }


  public AWSTargetDetails useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTargetDetails awSTargetDetails = (AWSTargetDetails) o;
    return Objects.equals(this.awsAccessKeyId, awSTargetDetails.awsAccessKeyId) &&
        Objects.equals(this.awsRegion, awSTargetDetails.awsRegion) &&
        Objects.equals(this.awsSecretAccessKey, awSTargetDetails.awsSecretAccessKey) &&
        Objects.equals(this.awsSessionToken, awSTargetDetails.awsSessionToken) &&
        Objects.equals(this.useGwCloudIdentity, awSTargetDetails.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessKeyId, awsRegion, awsSecretAccessKey, awsSessionToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTargetDetails {\n");
    sb.append("    awsAccessKeyId: ").append(toIndentedString(awsAccessKeyId)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    awsSecretAccessKey: ").append(toIndentedString(awsSecretAccessKey)).append("\n");
    sb.append("    awsSessionToken: ").append(toIndentedString(awsSessionToken)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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

