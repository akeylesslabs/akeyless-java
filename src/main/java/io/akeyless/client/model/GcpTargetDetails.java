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
 * GcpTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GcpTargetDetails {
  public static final String SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_EMAIL = "gcp_service_account_email";
  @SerializedName(SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_EMAIL)
  @javax.annotation.Nullable
  private String gcpServiceAccountEmail;

  public static final String SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY = "gcp_service_account_key";
  @SerializedName(SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY)
  @javax.annotation.Nullable
  private String gcpServiceAccountKey;

  public static final String SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY_BASE64 = "gcp_service_account_key_base64";
  @SerializedName(SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY_BASE64)
  @javax.annotation.Nullable
  private String gcpServiceAccountKeyBase64;

  public static final String SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY_ID = "gcp_service_account_key_id";
  @SerializedName(SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_KEY_ID)
  @javax.annotation.Nullable
  private String gcpServiceAccountKeyId;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use_gw_cloud_identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  @javax.annotation.Nullable
  private Boolean useGwCloudIdentity;

  public GcpTargetDetails() {
  }

  public GcpTargetDetails gcpServiceAccountEmail(@javax.annotation.Nullable String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    return this;
  }

  /**
   * Get gcpServiceAccountEmail
   * @return gcpServiceAccountEmail
   */
  @javax.annotation.Nullable
  public String getGcpServiceAccountEmail() {
    return gcpServiceAccountEmail;
  }

  public void setGcpServiceAccountEmail(@javax.annotation.Nullable String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
  }


  public GcpTargetDetails gcpServiceAccountKey(@javax.annotation.Nullable String gcpServiceAccountKey) {
    this.gcpServiceAccountKey = gcpServiceAccountKey;
    return this;
  }

  /**
   * Get gcpServiceAccountKey
   * @return gcpServiceAccountKey
   */
  @javax.annotation.Nullable
  public String getGcpServiceAccountKey() {
    return gcpServiceAccountKey;
  }

  public void setGcpServiceAccountKey(@javax.annotation.Nullable String gcpServiceAccountKey) {
    this.gcpServiceAccountKey = gcpServiceAccountKey;
  }


  public GcpTargetDetails gcpServiceAccountKeyBase64(@javax.annotation.Nullable String gcpServiceAccountKeyBase64) {
    this.gcpServiceAccountKeyBase64 = gcpServiceAccountKeyBase64;
    return this;
  }

  /**
   * Get gcpServiceAccountKeyBase64
   * @return gcpServiceAccountKeyBase64
   */
  @javax.annotation.Nullable
  public String getGcpServiceAccountKeyBase64() {
    return gcpServiceAccountKeyBase64;
  }

  public void setGcpServiceAccountKeyBase64(@javax.annotation.Nullable String gcpServiceAccountKeyBase64) {
    this.gcpServiceAccountKeyBase64 = gcpServiceAccountKeyBase64;
  }


  public GcpTargetDetails gcpServiceAccountKeyId(@javax.annotation.Nullable String gcpServiceAccountKeyId) {
    this.gcpServiceAccountKeyId = gcpServiceAccountKeyId;
    return this;
  }

  /**
   * Get gcpServiceAccountKeyId
   * @return gcpServiceAccountKeyId
   */
  @javax.annotation.Nullable
  public String getGcpServiceAccountKeyId() {
    return gcpServiceAccountKeyId;
  }

  public void setGcpServiceAccountKeyId(@javax.annotation.Nullable String gcpServiceAccountKeyId) {
    this.gcpServiceAccountKeyId = gcpServiceAccountKeyId;
  }


  public GcpTargetDetails useGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
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
    GcpTargetDetails gcpTargetDetails = (GcpTargetDetails) o;
    return Objects.equals(this.gcpServiceAccountEmail, gcpTargetDetails.gcpServiceAccountEmail) &&
        Objects.equals(this.gcpServiceAccountKey, gcpTargetDetails.gcpServiceAccountKey) &&
        Objects.equals(this.gcpServiceAccountKeyBase64, gcpTargetDetails.gcpServiceAccountKeyBase64) &&
        Objects.equals(this.gcpServiceAccountKeyId, gcpTargetDetails.gcpServiceAccountKeyId) &&
        Objects.equals(this.useGwCloudIdentity, gcpTargetDetails.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpServiceAccountEmail, gcpServiceAccountKey, gcpServiceAccountKeyBase64, gcpServiceAccountKeyId, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcpTargetDetails {\n");
    sb.append("    gcpServiceAccountEmail: ").append(toIndentedString(gcpServiceAccountEmail)).append("\n");
    sb.append("    gcpServiceAccountKey: ").append(toIndentedString(gcpServiceAccountKey)).append("\n");
    sb.append("    gcpServiceAccountKeyBase64: ").append(toIndentedString(gcpServiceAccountKeyBase64)).append("\n");
    sb.append("    gcpServiceAccountKeyId: ").append(toIndentedString(gcpServiceAccountKeyId)).append("\n");
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
    openapiFields.add("gcp_service_account_email");
    openapiFields.add("gcp_service_account_key");
    openapiFields.add("gcp_service_account_key_base64");
    openapiFields.add("gcp_service_account_key_id");
    openapiFields.add("use_gw_cloud_identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GcpTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GcpTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcpTargetDetails is not found in the empty JSON string", GcpTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GcpTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcpTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gcp_service_account_email") != null && !jsonObj.get("gcp_service_account_email").isJsonNull()) && !jsonObj.get("gcp_service_account_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcp_service_account_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcp_service_account_email").toString()));
      }
      if ((jsonObj.get("gcp_service_account_key") != null && !jsonObj.get("gcp_service_account_key").isJsonNull()) && !jsonObj.get("gcp_service_account_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcp_service_account_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcp_service_account_key").toString()));
      }
      if ((jsonObj.get("gcp_service_account_key_base64") != null && !jsonObj.get("gcp_service_account_key_base64").isJsonNull()) && !jsonObj.get("gcp_service_account_key_base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcp_service_account_key_base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcp_service_account_key_base64").toString()));
      }
      if ((jsonObj.get("gcp_service_account_key_id") != null && !jsonObj.get("gcp_service_account_key_id").isJsonNull()) && !jsonObj.get("gcp_service_account_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcp_service_account_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcp_service_account_key_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcpTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcpTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcpTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcpTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GcpTargetDetails>() {
           @Override
           public void write(JsonWriter out, GcpTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcpTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GcpTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GcpTargetDetails
   * @throws IOException if the JSON string is invalid with respect to GcpTargetDetails
   */
  public static GcpTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcpTargetDetails.class);
  }

  /**
   * Convert an instance of GcpTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

