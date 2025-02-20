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
 * AWSTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AWSTargetDetails {
  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_ID = "aws_access_key_id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_ID)
  @javax.annotation.Nullable
  private String awsAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws_region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  @javax.annotation.Nullable
  private String awsRegion;

  public static final String SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY = "aws_secret_access_key";
  @SerializedName(SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY)
  @javax.annotation.Nullable
  private String awsSecretAccessKey;

  public static final String SERIALIZED_NAME_AWS_SESSION_TOKEN = "aws_session_token";
  @SerializedName(SERIALIZED_NAME_AWS_SESSION_TOKEN)
  @javax.annotation.Nullable
  private String awsSessionToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use_gw_cloud_identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  @javax.annotation.Nullable
  private Boolean useGwCloudIdentity;

  public AWSTargetDetails() {
  }

  public AWSTargetDetails awsAccessKeyId(@javax.annotation.Nullable String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

  /**
   * Get awsAccessKeyId
   * @return awsAccessKeyId
   */
  @javax.annotation.Nullable
  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public void setAwsAccessKeyId(@javax.annotation.Nullable String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }


  public AWSTargetDetails awsRegion(@javax.annotation.Nullable String awsRegion) {
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


  public AWSTargetDetails awsSecretAccessKey(@javax.annotation.Nullable String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

  /**
   * Get awsSecretAccessKey
   * @return awsSecretAccessKey
   */
  @javax.annotation.Nullable
  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }

  public void setAwsSecretAccessKey(@javax.annotation.Nullable String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
  }


  public AWSTargetDetails awsSessionToken(@javax.annotation.Nullable String awsSessionToken) {
    this.awsSessionToken = awsSessionToken;
    return this;
  }

  /**
   * Get awsSessionToken
   * @return awsSessionToken
   */
  @javax.annotation.Nullable
  public String getAwsSessionToken() {
    return awsSessionToken;
  }

  public void setAwsSessionToken(@javax.annotation.Nullable String awsSessionToken) {
    this.awsSessionToken = awsSessionToken;
  }


  public AWSTargetDetails useGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

  /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
   */
  @javax.annotation.Nullable
  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }

  public void setUseGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aws_access_key_id");
    openapiFields.add("aws_region");
    openapiFields.add("aws_secret_access_key");
    openapiFields.add("aws_session_token");
    openapiFields.add("use_gw_cloud_identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AWSTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AWSTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AWSTargetDetails is not found in the empty JSON string", AWSTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AWSTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AWSTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aws_access_key_id") != null && !jsonObj.get("aws_access_key_id").isJsonNull()) && !jsonObj.get("aws_access_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_access_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_access_key_id").toString()));
      }
      if ((jsonObj.get("aws_region") != null && !jsonObj.get("aws_region").isJsonNull()) && !jsonObj.get("aws_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_region").toString()));
      }
      if ((jsonObj.get("aws_secret_access_key") != null && !jsonObj.get("aws_secret_access_key").isJsonNull()) && !jsonObj.get("aws_secret_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_secret_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_secret_access_key").toString()));
      }
      if ((jsonObj.get("aws_session_token") != null && !jsonObj.get("aws_session_token").isJsonNull()) && !jsonObj.get("aws_session_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_session_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_session_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AWSTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AWSTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AWSTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AWSTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AWSTargetDetails>() {
           @Override
           public void write(JsonWriter out, AWSTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AWSTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AWSTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AWSTargetDetails
   * @throws IOException if the JSON string is invalid with respect to AWSTargetDetails
   */
  public static AWSTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AWSTargetDetails.class);
  }

  /**
   * Convert an instance of AWSTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

