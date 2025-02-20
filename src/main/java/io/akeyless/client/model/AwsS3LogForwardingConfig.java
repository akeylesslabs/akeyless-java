/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * AwsS3LogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AwsS3LogForwardingConfig {
  public static final String SERIALIZED_NAME_AWS_ACCESS_ID = "aws_access_id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_ID)
  @javax.annotation.Nullable
  private String awsAccessId;

  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY = "aws_access_key";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY)
  @javax.annotation.Nullable
  private String awsAccessKey;

  public static final String SERIALIZED_NAME_AWS_AUTH_TYPE = "aws_auth_type";
  @SerializedName(SERIALIZED_NAME_AWS_AUTH_TYPE)
  @javax.annotation.Nullable
  private String awsAuthType;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws_region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  @javax.annotation.Nullable
  private String awsRegion;

  public static final String SERIALIZED_NAME_AWS_ROLE_ARN = "aws_role_arn";
  @SerializedName(SERIALIZED_NAME_AWS_ROLE_ARN)
  @javax.annotation.Nullable
  private String awsRoleArn;

  public static final String SERIALIZED_NAME_AWS_USE_GATEWAY_CLOUD_IDENTITY = "aws_use_gateway_cloud_identity";
  @SerializedName(SERIALIZED_NAME_AWS_USE_GATEWAY_CLOUD_IDENTITY)
  @javax.annotation.Nullable
  private Boolean awsUseGatewayCloudIdentity;

  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket_name";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  @javax.annotation.Nullable
  private String bucketName;

  public static final String SERIALIZED_NAME_LOG_FOLDER = "log_folder";
  @SerializedName(SERIALIZED_NAME_LOG_FOLDER)
  @javax.annotation.Nullable
  private String logFolder;

  public AwsS3LogForwardingConfig() {
  }

  public AwsS3LogForwardingConfig awsAccessId(@javax.annotation.Nullable String awsAccessId) {
    this.awsAccessId = awsAccessId;
    return this;
  }

  /**
   * Get awsAccessId
   * @return awsAccessId
   */
  @javax.annotation.Nullable
  public String getAwsAccessId() {
    return awsAccessId;
  }

  public void setAwsAccessId(@javax.annotation.Nullable String awsAccessId) {
    this.awsAccessId = awsAccessId;
  }


  public AwsS3LogForwardingConfig awsAccessKey(@javax.annotation.Nullable String awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
    return this;
  }

  /**
   * Get awsAccessKey
   * @return awsAccessKey
   */
  @javax.annotation.Nullable
  public String getAwsAccessKey() {
    return awsAccessKey;
  }

  public void setAwsAccessKey(@javax.annotation.Nullable String awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
  }


  public AwsS3LogForwardingConfig awsAuthType(@javax.annotation.Nullable String awsAuthType) {
    this.awsAuthType = awsAuthType;
    return this;
  }

  /**
   * Get awsAuthType
   * @return awsAuthType
   */
  @javax.annotation.Nullable
  public String getAwsAuthType() {
    return awsAuthType;
  }

  public void setAwsAuthType(@javax.annotation.Nullable String awsAuthType) {
    this.awsAuthType = awsAuthType;
  }


  public AwsS3LogForwardingConfig awsRegion(@javax.annotation.Nullable String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  /**
   * Get awsRegion
   * @return awsRegion
   */
  @javax.annotation.Nullable
  public String getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(@javax.annotation.Nullable String awsRegion) {
    this.awsRegion = awsRegion;
  }


  public AwsS3LogForwardingConfig awsRoleArn(@javax.annotation.Nullable String awsRoleArn) {
    this.awsRoleArn = awsRoleArn;
    return this;
  }

  /**
   * Get awsRoleArn
   * @return awsRoleArn
   */
  @javax.annotation.Nullable
  public String getAwsRoleArn() {
    return awsRoleArn;
  }

  public void setAwsRoleArn(@javax.annotation.Nullable String awsRoleArn) {
    this.awsRoleArn = awsRoleArn;
  }


  public AwsS3LogForwardingConfig awsUseGatewayCloudIdentity(@javax.annotation.Nullable Boolean awsUseGatewayCloudIdentity) {
    this.awsUseGatewayCloudIdentity = awsUseGatewayCloudIdentity;
    return this;
  }

  /**
   * deprecated
   * @return awsUseGatewayCloudIdentity
   */
  @javax.annotation.Nullable
  public Boolean getAwsUseGatewayCloudIdentity() {
    return awsUseGatewayCloudIdentity;
  }

  public void setAwsUseGatewayCloudIdentity(@javax.annotation.Nullable Boolean awsUseGatewayCloudIdentity) {
    this.awsUseGatewayCloudIdentity = awsUseGatewayCloudIdentity;
  }


  public AwsS3LogForwardingConfig bucketName(@javax.annotation.Nullable String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Get bucketName
   * @return bucketName
   */
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(@javax.annotation.Nullable String bucketName) {
    this.bucketName = bucketName;
  }


  public AwsS3LogForwardingConfig logFolder(@javax.annotation.Nullable String logFolder) {
    this.logFolder = logFolder;
    return this;
  }

  /**
   * Get logFolder
   * @return logFolder
   */
  @javax.annotation.Nullable
  public String getLogFolder() {
    return logFolder;
  }

  public void setLogFolder(@javax.annotation.Nullable String logFolder) {
    this.logFolder = logFolder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsS3LogForwardingConfig awsS3LogForwardingConfig = (AwsS3LogForwardingConfig) o;
    return Objects.equals(this.awsAccessId, awsS3LogForwardingConfig.awsAccessId) &&
        Objects.equals(this.awsAccessKey, awsS3LogForwardingConfig.awsAccessKey) &&
        Objects.equals(this.awsAuthType, awsS3LogForwardingConfig.awsAuthType) &&
        Objects.equals(this.awsRegion, awsS3LogForwardingConfig.awsRegion) &&
        Objects.equals(this.awsRoleArn, awsS3LogForwardingConfig.awsRoleArn) &&
        Objects.equals(this.awsUseGatewayCloudIdentity, awsS3LogForwardingConfig.awsUseGatewayCloudIdentity) &&
        Objects.equals(this.bucketName, awsS3LogForwardingConfig.bucketName) &&
        Objects.equals(this.logFolder, awsS3LogForwardingConfig.logFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessId, awsAccessKey, awsAuthType, awsRegion, awsRoleArn, awsUseGatewayCloudIdentity, bucketName, logFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsS3LogForwardingConfig {\n");
    sb.append("    awsAccessId: ").append(toIndentedString(awsAccessId)).append("\n");
    sb.append("    awsAccessKey: ").append(toIndentedString(awsAccessKey)).append("\n");
    sb.append("    awsAuthType: ").append(toIndentedString(awsAuthType)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    awsRoleArn: ").append(toIndentedString(awsRoleArn)).append("\n");
    sb.append("    awsUseGatewayCloudIdentity: ").append(toIndentedString(awsUseGatewayCloudIdentity)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    logFolder: ").append(toIndentedString(logFolder)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aws_access_id");
    openapiFields.add("aws_access_key");
    openapiFields.add("aws_auth_type");
    openapiFields.add("aws_region");
    openapiFields.add("aws_role_arn");
    openapiFields.add("aws_use_gateway_cloud_identity");
    openapiFields.add("bucket_name");
    openapiFields.add("log_folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsS3LogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsS3LogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsS3LogForwardingConfig is not found in the empty JSON string", AwsS3LogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsS3LogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsS3LogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aws_access_id") != null && !jsonObj.get("aws_access_id").isJsonNull()) && !jsonObj.get("aws_access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_access_id").toString()));
      }
      if ((jsonObj.get("aws_access_key") != null && !jsonObj.get("aws_access_key").isJsonNull()) && !jsonObj.get("aws_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_access_key").toString()));
      }
      if ((jsonObj.get("aws_auth_type") != null && !jsonObj.get("aws_auth_type").isJsonNull()) && !jsonObj.get("aws_auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_auth_type").toString()));
      }
      if ((jsonObj.get("aws_region") != null && !jsonObj.get("aws_region").isJsonNull()) && !jsonObj.get("aws_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_region").toString()));
      }
      if ((jsonObj.get("aws_role_arn") != null && !jsonObj.get("aws_role_arn").isJsonNull()) && !jsonObj.get("aws_role_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_role_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_role_arn").toString()));
      }
      if ((jsonObj.get("bucket_name") != null && !jsonObj.get("bucket_name").isJsonNull()) && !jsonObj.get("bucket_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucket_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucket_name").toString()));
      }
      if ((jsonObj.get("log_folder") != null && !jsonObj.get("log_folder").isJsonNull()) && !jsonObj.get("log_folder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_folder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_folder").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsS3LogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsS3LogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsS3LogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsS3LogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsS3LogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, AwsS3LogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsS3LogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsS3LogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsS3LogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to AwsS3LogForwardingConfig
   */
  public static AwsS3LogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsS3LogForwardingConfig.class);
  }

  /**
   * Convert an instance of AwsS3LogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

