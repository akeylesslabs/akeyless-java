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
 * GatewayBasicInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayBasicInfo {
  public static final String SERIALIZED_NAME_CLUSTER_DISPLAY_NAME = "cluster_display_name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String clusterDisplayName;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  @javax.annotation.Nullable
  private Long clusterId;

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  @javax.annotation.Nullable
  private String clusterName;

  public static final String SERIALIZED_NAME_CLUSTER_URL = "cluster_url";
  @SerializedName(SERIALIZED_NAME_CLUSTER_URL)
  @javax.annotation.Nullable
  private String clusterUrl;

  public static final String SERIALIZED_NAME_IS_CLUSTER_AVAILABLE = "is_cluster_available";
  @SerializedName(SERIALIZED_NAME_IS_CLUSTER_AVAILABLE)
  @javax.annotation.Nullable
  private Boolean isClusterAvailable;

  public GatewayBasicInfo() {
  }

  public GatewayBasicInfo clusterDisplayName(@javax.annotation.Nullable String clusterDisplayName) {
    this.clusterDisplayName = clusterDisplayName;
    return this;
  }

  /**
   * Get clusterDisplayName
   * @return clusterDisplayName
   */
  @javax.annotation.Nullable
  public String getClusterDisplayName() {
    return clusterDisplayName;
  }

  public void setClusterDisplayName(@javax.annotation.Nullable String clusterDisplayName) {
    this.clusterDisplayName = clusterDisplayName;
  }


  public GatewayBasicInfo clusterId(@javax.annotation.Nullable Long clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * Get clusterId
   * @return clusterId
   */
  @javax.annotation.Nullable
  public Long getClusterId() {
    return clusterId;
  }

  public void setClusterId(@javax.annotation.Nullable Long clusterId) {
    this.clusterId = clusterId;
  }


  public GatewayBasicInfo clusterName(@javax.annotation.Nullable String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Get clusterName
   * @return clusterName
   */
  @javax.annotation.Nullable
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@javax.annotation.Nullable String clusterName) {
    this.clusterName = clusterName;
  }


  public GatewayBasicInfo clusterUrl(@javax.annotation.Nullable String clusterUrl) {
    this.clusterUrl = clusterUrl;
    return this;
  }

  /**
   * Get clusterUrl
   * @return clusterUrl
   */
  @javax.annotation.Nullable
  public String getClusterUrl() {
    return clusterUrl;
  }

  public void setClusterUrl(@javax.annotation.Nullable String clusterUrl) {
    this.clusterUrl = clusterUrl;
  }


  public GatewayBasicInfo isClusterAvailable(@javax.annotation.Nullable Boolean isClusterAvailable) {
    this.isClusterAvailable = isClusterAvailable;
    return this;
  }

  /**
   * Get isClusterAvailable
   * @return isClusterAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsClusterAvailable() {
    return isClusterAvailable;
  }

  public void setIsClusterAvailable(@javax.annotation.Nullable Boolean isClusterAvailable) {
    this.isClusterAvailable = isClusterAvailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayBasicInfo gatewayBasicInfo = (GatewayBasicInfo) o;
    return Objects.equals(this.clusterDisplayName, gatewayBasicInfo.clusterDisplayName) &&
        Objects.equals(this.clusterId, gatewayBasicInfo.clusterId) &&
        Objects.equals(this.clusterName, gatewayBasicInfo.clusterName) &&
        Objects.equals(this.clusterUrl, gatewayBasicInfo.clusterUrl) &&
        Objects.equals(this.isClusterAvailable, gatewayBasicInfo.isClusterAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDisplayName, clusterId, clusterName, clusterUrl, isClusterAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayBasicInfo {\n");
    sb.append("    clusterDisplayName: ").append(toIndentedString(clusterDisplayName)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterUrl: ").append(toIndentedString(clusterUrl)).append("\n");
    sb.append("    isClusterAvailable: ").append(toIndentedString(isClusterAvailable)).append("\n");
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
    openapiFields.add("cluster_display_name");
    openapiFields.add("cluster_id");
    openapiFields.add("cluster_name");
    openapiFields.add("cluster_url");
    openapiFields.add("is_cluster_available");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayBasicInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayBasicInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayBasicInfo is not found in the empty JSON string", GatewayBasicInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayBasicInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayBasicInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cluster_display_name") != null && !jsonObj.get("cluster_display_name").isJsonNull()) && !jsonObj.get("cluster_display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_display_name").toString()));
      }
      if ((jsonObj.get("cluster_name") != null && !jsonObj.get("cluster_name").isJsonNull()) && !jsonObj.get("cluster_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_name").toString()));
      }
      if ((jsonObj.get("cluster_url") != null && !jsonObj.get("cluster_url").isJsonNull()) && !jsonObj.get("cluster_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayBasicInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayBasicInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayBasicInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayBasicInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayBasicInfo>() {
           @Override
           public void write(JsonWriter out, GatewayBasicInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayBasicInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayBasicInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayBasicInfo
   * @throws IOException if the JSON string is invalid with respect to GatewayBasicInfo
   */
  public static GatewayBasicInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayBasicInfo.class);
  }

  /**
   * Convert an instance of GatewayBasicInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

