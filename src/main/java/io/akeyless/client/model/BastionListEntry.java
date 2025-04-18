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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * BastionListEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class BastionListEntry {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_ALLOWED_ACCESS_IDS = "allowed_access_ids";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACCESS_IDS)
  @javax.annotation.Nullable
  private List<String> allowedAccessIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_URLS = "allowed_urls";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URLS)
  @javax.annotation.Nullable
  private List<String> allowedUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_URLS_PER_INSTANCE = "allowed_urls_per_instance";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URLS_PER_INSTANCE)
  @javax.annotation.Nullable
  private Map<String, List<String>> allowedUrlsPerInstance = new HashMap<>();

  public static final String SERIALIZED_NAME_BASTION_SSH_PORT = "bastion_ssh_port";
  @SerializedName(SERIALIZED_NAME_BASTION_SSH_PORT)
  @javax.annotation.Nullable
  private Long bastionSshPort;

  public static final String SERIALIZED_NAME_BASTION_URLS_PER_TYPE = "bastion_urls_per_type";
  @SerializedName(SERIALIZED_NAME_BASTION_URLS_PER_TYPE)
  @javax.annotation.Nullable
  private Map<String, String> bastionUrlsPerType = new HashMap<>();

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  @javax.annotation.Nullable
  private String clusterName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_HAS_GATEWAY_IDENTITY = "has_gateway_identity";
  @SerializedName(SERIALIZED_NAME_HAS_GATEWAY_IDENTITY)
  @javax.annotation.Nullable
  private Boolean hasGatewayIdentity;

  public static final String SERIALIZED_NAME_LAST_REPORT = "last_report";
  @SerializedName(SERIALIZED_NAME_LAST_REPORT)
  @javax.annotation.Nullable
  private OffsetDateTime lastReport;

  public BastionListEntry() {
  }

  public BastionListEntry accessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * Get accessId
   * @return accessId
   */
  @javax.annotation.Nullable
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
  }


  public BastionListEntry allowedAccessIds(@javax.annotation.Nullable List<String> allowedAccessIds) {
    this.allowedAccessIds = allowedAccessIds;
    return this;
  }

  public BastionListEntry addAllowedAccessIdsItem(String allowedAccessIdsItem) {
    if (this.allowedAccessIds == null) {
      this.allowedAccessIds = new ArrayList<>();
    }
    this.allowedAccessIds.add(allowedAccessIdsItem);
    return this;
  }

  /**
   * Get allowedAccessIds
   * @return allowedAccessIds
   */
  @javax.annotation.Nullable
  public List<String> getAllowedAccessIds() {
    return allowedAccessIds;
  }

  public void setAllowedAccessIds(@javax.annotation.Nullable List<String> allowedAccessIds) {
    this.allowedAccessIds = allowedAccessIds;
  }


  public BastionListEntry allowedUrls(@javax.annotation.Nullable List<String> allowedUrls) {
    this.allowedUrls = allowedUrls;
    return this;
  }

  public BastionListEntry addAllowedUrlsItem(String allowedUrlsItem) {
    if (this.allowedUrls == null) {
      this.allowedUrls = new ArrayList<>();
    }
    this.allowedUrls.add(allowedUrlsItem);
    return this;
  }

  /**
   * Get allowedUrls
   * @return allowedUrls
   */
  @javax.annotation.Nullable
  public List<String> getAllowedUrls() {
    return allowedUrls;
  }

  public void setAllowedUrls(@javax.annotation.Nullable List<String> allowedUrls) {
    this.allowedUrls = allowedUrls;
  }


  public BastionListEntry allowedUrlsPerInstance(@javax.annotation.Nullable Map<String, List<String>> allowedUrlsPerInstance) {
    this.allowedUrlsPerInstance = allowedUrlsPerInstance;
    return this;
  }

  public BastionListEntry putAllowedUrlsPerInstanceItem(String key, List<String> allowedUrlsPerInstanceItem) {
    if (this.allowedUrlsPerInstance == null) {
      this.allowedUrlsPerInstance = new HashMap<>();
    }
    this.allowedUrlsPerInstance.put(key, allowedUrlsPerInstanceItem);
    return this;
  }

  /**
   * Get allowedUrlsPerInstance
   * @return allowedUrlsPerInstance
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAllowedUrlsPerInstance() {
    return allowedUrlsPerInstance;
  }

  public void setAllowedUrlsPerInstance(@javax.annotation.Nullable Map<String, List<String>> allowedUrlsPerInstance) {
    this.allowedUrlsPerInstance = allowedUrlsPerInstance;
  }


  public BastionListEntry bastionSshPort(@javax.annotation.Nullable Long bastionSshPort) {
    this.bastionSshPort = bastionSshPort;
    return this;
  }

  /**
   * Get bastionSshPort
   * @return bastionSshPort
   */
  @javax.annotation.Nullable
  public Long getBastionSshPort() {
    return bastionSshPort;
  }

  public void setBastionSshPort(@javax.annotation.Nullable Long bastionSshPort) {
    this.bastionSshPort = bastionSshPort;
  }


  public BastionListEntry bastionUrlsPerType(@javax.annotation.Nullable Map<String, String> bastionUrlsPerType) {
    this.bastionUrlsPerType = bastionUrlsPerType;
    return this;
  }

  public BastionListEntry putBastionUrlsPerTypeItem(String key, String bastionUrlsPerTypeItem) {
    if (this.bastionUrlsPerType == null) {
      this.bastionUrlsPerType = new HashMap<>();
    }
    this.bastionUrlsPerType.put(key, bastionUrlsPerTypeItem);
    return this;
  }

  /**
   * Get bastionUrlsPerType
   * @return bastionUrlsPerType
   */
  @javax.annotation.Nullable
  public Map<String, String> getBastionUrlsPerType() {
    return bastionUrlsPerType;
  }

  public void setBastionUrlsPerType(@javax.annotation.Nullable Map<String, String> bastionUrlsPerType) {
    this.bastionUrlsPerType = bastionUrlsPerType;
  }


  public BastionListEntry clusterName(@javax.annotation.Nullable String clusterName) {
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


  public BastionListEntry displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public BastionListEntry hasGatewayIdentity(@javax.annotation.Nullable Boolean hasGatewayIdentity) {
    this.hasGatewayIdentity = hasGatewayIdentity;
    return this;
  }

  /**
   * Get hasGatewayIdentity
   * @return hasGatewayIdentity
   */
  @javax.annotation.Nullable
  public Boolean getHasGatewayIdentity() {
    return hasGatewayIdentity;
  }

  public void setHasGatewayIdentity(@javax.annotation.Nullable Boolean hasGatewayIdentity) {
    this.hasGatewayIdentity = hasGatewayIdentity;
  }


  public BastionListEntry lastReport(@javax.annotation.Nullable OffsetDateTime lastReport) {
    this.lastReport = lastReport;
    return this;
  }

  /**
   * Get lastReport
   * @return lastReport
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastReport() {
    return lastReport;
  }

  public void setLastReport(@javax.annotation.Nullable OffsetDateTime lastReport) {
    this.lastReport = lastReport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BastionListEntry bastionListEntry = (BastionListEntry) o;
    return Objects.equals(this.accessId, bastionListEntry.accessId) &&
        Objects.equals(this.allowedAccessIds, bastionListEntry.allowedAccessIds) &&
        Objects.equals(this.allowedUrls, bastionListEntry.allowedUrls) &&
        Objects.equals(this.allowedUrlsPerInstance, bastionListEntry.allowedUrlsPerInstance) &&
        Objects.equals(this.bastionSshPort, bastionListEntry.bastionSshPort) &&
        Objects.equals(this.bastionUrlsPerType, bastionListEntry.bastionUrlsPerType) &&
        Objects.equals(this.clusterName, bastionListEntry.clusterName) &&
        Objects.equals(this.displayName, bastionListEntry.displayName) &&
        Objects.equals(this.hasGatewayIdentity, bastionListEntry.hasGatewayIdentity) &&
        Objects.equals(this.lastReport, bastionListEntry.lastReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, allowedAccessIds, allowedUrls, allowedUrlsPerInstance, bastionSshPort, bastionUrlsPerType, clusterName, displayName, hasGatewayIdentity, lastReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BastionListEntry {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    allowedAccessIds: ").append(toIndentedString(allowedAccessIds)).append("\n");
    sb.append("    allowedUrls: ").append(toIndentedString(allowedUrls)).append("\n");
    sb.append("    allowedUrlsPerInstance: ").append(toIndentedString(allowedUrlsPerInstance)).append("\n");
    sb.append("    bastionSshPort: ").append(toIndentedString(bastionSshPort)).append("\n");
    sb.append("    bastionUrlsPerType: ").append(toIndentedString(bastionUrlsPerType)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hasGatewayIdentity: ").append(toIndentedString(hasGatewayIdentity)).append("\n");
    sb.append("    lastReport: ").append(toIndentedString(lastReport)).append("\n");
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
    openapiFields.add("access_id");
    openapiFields.add("allowed_access_ids");
    openapiFields.add("allowed_urls");
    openapiFields.add("allowed_urls_per_instance");
    openapiFields.add("bastion_ssh_port");
    openapiFields.add("bastion_urls_per_type");
    openapiFields.add("cluster_name");
    openapiFields.add("display_name");
    openapiFields.add("has_gateway_identity");
    openapiFields.add("last_report");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BastionListEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BastionListEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BastionListEntry is not found in the empty JSON string", BastionListEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BastionListEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BastionListEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_access_ids") != null && !jsonObj.get("allowed_access_ids").isJsonNull() && !jsonObj.get("allowed_access_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_access_ids` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_access_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_urls") != null && !jsonObj.get("allowed_urls").isJsonNull() && !jsonObj.get("allowed_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_urls` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_urls").toString()));
      }
      if ((jsonObj.get("cluster_name") != null && !jsonObj.get("cluster_name").isJsonNull()) && !jsonObj.get("cluster_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_name").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BastionListEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BastionListEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BastionListEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BastionListEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<BastionListEntry>() {
           @Override
           public void write(JsonWriter out, BastionListEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BastionListEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BastionListEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BastionListEntry
   * @throws IOException if the JSON string is invalid with respect to BastionListEntry
   */
  public static BastionListEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BastionListEntry.class);
  }

  /**
   * Convert an instance of BastionListEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

