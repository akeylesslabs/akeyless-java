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
 * gwUpdateRemoteAccessSessionLogsAwsS3 is a command that updates session log forwarding config (aws-s3 target)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GwUpdateRemoteAccessSessionLogsAwsS3 {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  @javax.annotation.Nullable
  private String accessKey;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  @javax.annotation.Nullable
  private String authType;

  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket-name";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  @javax.annotation.Nullable
  private String bucketName;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LOG_FOLDER = "log-folder";
  @SerializedName(SERIALIZED_NAME_LOG_FOLDER)
  @javax.annotation.Nullable
  private String logFolder = "use-existing";

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "output-format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private String outputFormat = "text";

  public static final String SERIALIZED_NAME_PULL_INTERVAL = "pull-interval";
  @SerializedName(SERIALIZED_NAME_PULL_INTERVAL)
  @javax.annotation.Nullable
  private String pullInterval = "10";

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  @javax.annotation.Nullable
  private String region;

  public static final String SERIALIZED_NAME_ROLE_ARN = "role-arn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  @javax.annotation.Nullable
  private String roleArn;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GwUpdateRemoteAccessSessionLogsAwsS3() {
  }

  public GwUpdateRemoteAccessSessionLogsAwsS3 accessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * AWS access id relevant for access_key auth-type
   * @return accessId
   */
  @javax.annotation.Nullable
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 accessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * AWS access key relevant for access_key auth-type
   * @return accessKey
   */
  @javax.annotation.Nullable
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(@javax.annotation.Nullable String accessKey) {
    this.accessKey = accessKey;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 authType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * AWS auth type [access_key/cloud_id/assume_role]
   * @return authType
   */
  @javax.annotation.Nullable
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 bucketName(@javax.annotation.Nullable String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * AWS S3 bucket name
   * @return bucketName
   */
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(@javax.annotation.Nullable String bucketName) {
    this.bucketName = bucketName;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 enable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Enable Log Forwarding [true/false]
   * @return enable
   */
  @javax.annotation.Nullable
  public String getEnable() {
    return enable;
  }

  public void setEnable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 logFolder(@javax.annotation.Nullable String logFolder) {
    this.logFolder = logFolder;
    return this;
  }

  /**
   * AWS S3 destination folder for logs
   * @return logFolder
   */
  @javax.annotation.Nullable
  public String getLogFolder() {
    return logFolder;
  }

  public void setLogFolder(@javax.annotation.Nullable String logFolder) {
    this.logFolder = logFolder;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 outputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Logs format [text/json]
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 pullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
    return this;
  }

  /**
   * Pull interval in seconds
   * @return pullInterval
   */
  @javax.annotation.Nullable
  public String getPullInterval() {
    return pullInterval;
  }

  public void setPullInterval(@javax.annotation.Nullable String pullInterval) {
    this.pullInterval = pullInterval;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 region(@javax.annotation.Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(@javax.annotation.Nullable String region) {
    this.region = region;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 roleArn(@javax.annotation.Nullable String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * AWS role arn relevant for assume_role auth-type
   * @return roleArn
   */
  @javax.annotation.Nullable
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(@javax.annotation.Nullable String roleArn) {
    this.roleArn = roleArn;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public GwUpdateRemoteAccessSessionLogsAwsS3 uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GwUpdateRemoteAccessSessionLogsAwsS3 gwUpdateRemoteAccessSessionLogsAwsS3 = (GwUpdateRemoteAccessSessionLogsAwsS3) o;
    return Objects.equals(this.accessId, gwUpdateRemoteAccessSessionLogsAwsS3.accessId) &&
        Objects.equals(this.accessKey, gwUpdateRemoteAccessSessionLogsAwsS3.accessKey) &&
        Objects.equals(this.authType, gwUpdateRemoteAccessSessionLogsAwsS3.authType) &&
        Objects.equals(this.bucketName, gwUpdateRemoteAccessSessionLogsAwsS3.bucketName) &&
        Objects.equals(this.enable, gwUpdateRemoteAccessSessionLogsAwsS3.enable) &&
        Objects.equals(this.json, gwUpdateRemoteAccessSessionLogsAwsS3.json) &&
        Objects.equals(this.logFolder, gwUpdateRemoteAccessSessionLogsAwsS3.logFolder) &&
        Objects.equals(this.outputFormat, gwUpdateRemoteAccessSessionLogsAwsS3.outputFormat) &&
        Objects.equals(this.pullInterval, gwUpdateRemoteAccessSessionLogsAwsS3.pullInterval) &&
        Objects.equals(this.region, gwUpdateRemoteAccessSessionLogsAwsS3.region) &&
        Objects.equals(this.roleArn, gwUpdateRemoteAccessSessionLogsAwsS3.roleArn) &&
        Objects.equals(this.token, gwUpdateRemoteAccessSessionLogsAwsS3.token) &&
        Objects.equals(this.uidToken, gwUpdateRemoteAccessSessionLogsAwsS3.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessKey, authType, bucketName, enable, json, logFolder, outputFormat, pullInterval, region, roleArn, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GwUpdateRemoteAccessSessionLogsAwsS3 {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    logFolder: ").append(toIndentedString(logFolder)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    pullInterval: ").append(toIndentedString(pullInterval)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("access-id");
    openapiFields.add("access-key");
    openapiFields.add("auth-type");
    openapiFields.add("bucket-name");
    openapiFields.add("enable");
    openapiFields.add("json");
    openapiFields.add("log-folder");
    openapiFields.add("output-format");
    openapiFields.add("pull-interval");
    openapiFields.add("region");
    openapiFields.add("role-arn");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GwUpdateRemoteAccessSessionLogsAwsS3
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GwUpdateRemoteAccessSessionLogsAwsS3.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GwUpdateRemoteAccessSessionLogsAwsS3 is not found in the empty JSON string", GwUpdateRemoteAccessSessionLogsAwsS3.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GwUpdateRemoteAccessSessionLogsAwsS3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GwUpdateRemoteAccessSessionLogsAwsS3` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access-id") != null && !jsonObj.get("access-id").isJsonNull()) && !jsonObj.get("access-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-id").toString()));
      }
      if ((jsonObj.get("access-key") != null && !jsonObj.get("access-key").isJsonNull()) && !jsonObj.get("access-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-key").toString()));
      }
      if ((jsonObj.get("auth-type") != null && !jsonObj.get("auth-type").isJsonNull()) && !jsonObj.get("auth-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth-type").toString()));
      }
      if ((jsonObj.get("bucket-name") != null && !jsonObj.get("bucket-name").isJsonNull()) && !jsonObj.get("bucket-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucket-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucket-name").toString()));
      }
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
      }
      if ((jsonObj.get("log-folder") != null && !jsonObj.get("log-folder").isJsonNull()) && !jsonObj.get("log-folder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log-folder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log-folder").toString()));
      }
      if ((jsonObj.get("output-format") != null && !jsonObj.get("output-format").isJsonNull()) && !jsonObj.get("output-format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output-format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output-format").toString()));
      }
      if ((jsonObj.get("pull-interval") != null && !jsonObj.get("pull-interval").isJsonNull()) && !jsonObj.get("pull-interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull-interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull-interval").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("role-arn") != null && !jsonObj.get("role-arn").isJsonNull()) && !jsonObj.get("role-arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role-arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role-arn").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GwUpdateRemoteAccessSessionLogsAwsS3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GwUpdateRemoteAccessSessionLogsAwsS3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GwUpdateRemoteAccessSessionLogsAwsS3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GwUpdateRemoteAccessSessionLogsAwsS3.class));

       return (TypeAdapter<T>) new TypeAdapter<GwUpdateRemoteAccessSessionLogsAwsS3>() {
           @Override
           public void write(JsonWriter out, GwUpdateRemoteAccessSessionLogsAwsS3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GwUpdateRemoteAccessSessionLogsAwsS3 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GwUpdateRemoteAccessSessionLogsAwsS3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GwUpdateRemoteAccessSessionLogsAwsS3
   * @throws IOException if the JSON string is invalid with respect to GwUpdateRemoteAccessSessionLogsAwsS3
   */
  public static GwUpdateRemoteAccessSessionLogsAwsS3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GwUpdateRemoteAccessSessionLogsAwsS3.class);
  }

  /**
   * Convert an instance of GwUpdateRemoteAccessSessionLogsAwsS3 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

