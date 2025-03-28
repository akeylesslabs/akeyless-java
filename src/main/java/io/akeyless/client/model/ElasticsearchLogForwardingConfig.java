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
 * ElasticsearchLogForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ElasticsearchLogForwardingConfig {
  public static final String SERIALIZED_NAME_ELASTICSEARCH_API_KEY = "elasticsearch_api_key";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_API_KEY)
  @javax.annotation.Nullable
  private String elasticsearchApiKey;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_AUTH_TYPE = "elasticsearch_auth_type";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_AUTH_TYPE)
  @javax.annotation.Nullable
  private String elasticsearchAuthType;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_CLOUD_ID = "elasticsearch_cloud_id";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_CLOUD_ID)
  @javax.annotation.Nullable
  private String elasticsearchCloudId;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_ENABLE_TLS = "elasticsearch_enable_tls";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_ENABLE_TLS)
  @javax.annotation.Nullable
  private Boolean elasticsearchEnableTls;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_INDEX = "elasticsearch_index";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_INDEX)
  @javax.annotation.Nullable
  private String elasticsearchIndex;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_NODES = "elasticsearch_nodes";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_NODES)
  @javax.annotation.Nullable
  private String elasticsearchNodes;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_PASSWORD = "elasticsearch_password";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_PASSWORD)
  @javax.annotation.Nullable
  private String elasticsearchPassword;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_SERVER_TYPE = "elasticsearch_server_type";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_SERVER_TYPE)
  @javax.annotation.Nullable
  private String elasticsearchServerType;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_TLS_CERTIFICATE = "elasticsearch_tls_certificate";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_TLS_CERTIFICATE)
  @javax.annotation.Nullable
  private String elasticsearchTlsCertificate;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_USER_NAME = "elasticsearch_user_name";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_USER_NAME)
  @javax.annotation.Nullable
  private String elasticsearchUserName;

  public ElasticsearchLogForwardingConfig() {
  }

  public ElasticsearchLogForwardingConfig elasticsearchApiKey(@javax.annotation.Nullable String elasticsearchApiKey) {
    this.elasticsearchApiKey = elasticsearchApiKey;
    return this;
  }

  /**
   * Get elasticsearchApiKey
   * @return elasticsearchApiKey
   */
  @javax.annotation.Nullable
  public String getElasticsearchApiKey() {
    return elasticsearchApiKey;
  }

  public void setElasticsearchApiKey(@javax.annotation.Nullable String elasticsearchApiKey) {
    this.elasticsearchApiKey = elasticsearchApiKey;
  }


  public ElasticsearchLogForwardingConfig elasticsearchAuthType(@javax.annotation.Nullable String elasticsearchAuthType) {
    this.elasticsearchAuthType = elasticsearchAuthType;
    return this;
  }

  /**
   * Get elasticsearchAuthType
   * @return elasticsearchAuthType
   */
  @javax.annotation.Nullable
  public String getElasticsearchAuthType() {
    return elasticsearchAuthType;
  }

  public void setElasticsearchAuthType(@javax.annotation.Nullable String elasticsearchAuthType) {
    this.elasticsearchAuthType = elasticsearchAuthType;
  }


  public ElasticsearchLogForwardingConfig elasticsearchCloudId(@javax.annotation.Nullable String elasticsearchCloudId) {
    this.elasticsearchCloudId = elasticsearchCloudId;
    return this;
  }

  /**
   * Get elasticsearchCloudId
   * @return elasticsearchCloudId
   */
  @javax.annotation.Nullable
  public String getElasticsearchCloudId() {
    return elasticsearchCloudId;
  }

  public void setElasticsearchCloudId(@javax.annotation.Nullable String elasticsearchCloudId) {
    this.elasticsearchCloudId = elasticsearchCloudId;
  }


  public ElasticsearchLogForwardingConfig elasticsearchEnableTls(@javax.annotation.Nullable Boolean elasticsearchEnableTls) {
    this.elasticsearchEnableTls = elasticsearchEnableTls;
    return this;
  }

  /**
   * Get elasticsearchEnableTls
   * @return elasticsearchEnableTls
   */
  @javax.annotation.Nullable
  public Boolean getElasticsearchEnableTls() {
    return elasticsearchEnableTls;
  }

  public void setElasticsearchEnableTls(@javax.annotation.Nullable Boolean elasticsearchEnableTls) {
    this.elasticsearchEnableTls = elasticsearchEnableTls;
  }


  public ElasticsearchLogForwardingConfig elasticsearchIndex(@javax.annotation.Nullable String elasticsearchIndex) {
    this.elasticsearchIndex = elasticsearchIndex;
    return this;
  }

  /**
   * Get elasticsearchIndex
   * @return elasticsearchIndex
   */
  @javax.annotation.Nullable
  public String getElasticsearchIndex() {
    return elasticsearchIndex;
  }

  public void setElasticsearchIndex(@javax.annotation.Nullable String elasticsearchIndex) {
    this.elasticsearchIndex = elasticsearchIndex;
  }


  public ElasticsearchLogForwardingConfig elasticsearchNodes(@javax.annotation.Nullable String elasticsearchNodes) {
    this.elasticsearchNodes = elasticsearchNodes;
    return this;
  }

  /**
   * Get elasticsearchNodes
   * @return elasticsearchNodes
   */
  @javax.annotation.Nullable
  public String getElasticsearchNodes() {
    return elasticsearchNodes;
  }

  public void setElasticsearchNodes(@javax.annotation.Nullable String elasticsearchNodes) {
    this.elasticsearchNodes = elasticsearchNodes;
  }


  public ElasticsearchLogForwardingConfig elasticsearchPassword(@javax.annotation.Nullable String elasticsearchPassword) {
    this.elasticsearchPassword = elasticsearchPassword;
    return this;
  }

  /**
   * Get elasticsearchPassword
   * @return elasticsearchPassword
   */
  @javax.annotation.Nullable
  public String getElasticsearchPassword() {
    return elasticsearchPassword;
  }

  public void setElasticsearchPassword(@javax.annotation.Nullable String elasticsearchPassword) {
    this.elasticsearchPassword = elasticsearchPassword;
  }


  public ElasticsearchLogForwardingConfig elasticsearchServerType(@javax.annotation.Nullable String elasticsearchServerType) {
    this.elasticsearchServerType = elasticsearchServerType;
    return this;
  }

  /**
   * Get elasticsearchServerType
   * @return elasticsearchServerType
   */
  @javax.annotation.Nullable
  public String getElasticsearchServerType() {
    return elasticsearchServerType;
  }

  public void setElasticsearchServerType(@javax.annotation.Nullable String elasticsearchServerType) {
    this.elasticsearchServerType = elasticsearchServerType;
  }


  public ElasticsearchLogForwardingConfig elasticsearchTlsCertificate(@javax.annotation.Nullable String elasticsearchTlsCertificate) {
    this.elasticsearchTlsCertificate = elasticsearchTlsCertificate;
    return this;
  }

  /**
   * Get elasticsearchTlsCertificate
   * @return elasticsearchTlsCertificate
   */
  @javax.annotation.Nullable
  public String getElasticsearchTlsCertificate() {
    return elasticsearchTlsCertificate;
  }

  public void setElasticsearchTlsCertificate(@javax.annotation.Nullable String elasticsearchTlsCertificate) {
    this.elasticsearchTlsCertificate = elasticsearchTlsCertificate;
  }


  public ElasticsearchLogForwardingConfig elasticsearchUserName(@javax.annotation.Nullable String elasticsearchUserName) {
    this.elasticsearchUserName = elasticsearchUserName;
    return this;
  }

  /**
   * Get elasticsearchUserName
   * @return elasticsearchUserName
   */
  @javax.annotation.Nullable
  public String getElasticsearchUserName() {
    return elasticsearchUserName;
  }

  public void setElasticsearchUserName(@javax.annotation.Nullable String elasticsearchUserName) {
    this.elasticsearchUserName = elasticsearchUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchLogForwardingConfig elasticsearchLogForwardingConfig = (ElasticsearchLogForwardingConfig) o;
    return Objects.equals(this.elasticsearchApiKey, elasticsearchLogForwardingConfig.elasticsearchApiKey) &&
        Objects.equals(this.elasticsearchAuthType, elasticsearchLogForwardingConfig.elasticsearchAuthType) &&
        Objects.equals(this.elasticsearchCloudId, elasticsearchLogForwardingConfig.elasticsearchCloudId) &&
        Objects.equals(this.elasticsearchEnableTls, elasticsearchLogForwardingConfig.elasticsearchEnableTls) &&
        Objects.equals(this.elasticsearchIndex, elasticsearchLogForwardingConfig.elasticsearchIndex) &&
        Objects.equals(this.elasticsearchNodes, elasticsearchLogForwardingConfig.elasticsearchNodes) &&
        Objects.equals(this.elasticsearchPassword, elasticsearchLogForwardingConfig.elasticsearchPassword) &&
        Objects.equals(this.elasticsearchServerType, elasticsearchLogForwardingConfig.elasticsearchServerType) &&
        Objects.equals(this.elasticsearchTlsCertificate, elasticsearchLogForwardingConfig.elasticsearchTlsCertificate) &&
        Objects.equals(this.elasticsearchUserName, elasticsearchLogForwardingConfig.elasticsearchUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticsearchApiKey, elasticsearchAuthType, elasticsearchCloudId, elasticsearchEnableTls, elasticsearchIndex, elasticsearchNodes, elasticsearchPassword, elasticsearchServerType, elasticsearchTlsCertificate, elasticsearchUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchLogForwardingConfig {\n");
    sb.append("    elasticsearchApiKey: ").append(toIndentedString(elasticsearchApiKey)).append("\n");
    sb.append("    elasticsearchAuthType: ").append(toIndentedString(elasticsearchAuthType)).append("\n");
    sb.append("    elasticsearchCloudId: ").append(toIndentedString(elasticsearchCloudId)).append("\n");
    sb.append("    elasticsearchEnableTls: ").append(toIndentedString(elasticsearchEnableTls)).append("\n");
    sb.append("    elasticsearchIndex: ").append(toIndentedString(elasticsearchIndex)).append("\n");
    sb.append("    elasticsearchNodes: ").append(toIndentedString(elasticsearchNodes)).append("\n");
    sb.append("    elasticsearchPassword: ").append(toIndentedString(elasticsearchPassword)).append("\n");
    sb.append("    elasticsearchServerType: ").append(toIndentedString(elasticsearchServerType)).append("\n");
    sb.append("    elasticsearchTlsCertificate: ").append(toIndentedString(elasticsearchTlsCertificate)).append("\n");
    sb.append("    elasticsearchUserName: ").append(toIndentedString(elasticsearchUserName)).append("\n");
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
    openapiFields.add("elasticsearch_api_key");
    openapiFields.add("elasticsearch_auth_type");
    openapiFields.add("elasticsearch_cloud_id");
    openapiFields.add("elasticsearch_enable_tls");
    openapiFields.add("elasticsearch_index");
    openapiFields.add("elasticsearch_nodes");
    openapiFields.add("elasticsearch_password");
    openapiFields.add("elasticsearch_server_type");
    openapiFields.add("elasticsearch_tls_certificate");
    openapiFields.add("elasticsearch_user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElasticsearchLogForwardingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticsearchLogForwardingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticsearchLogForwardingConfig is not found in the empty JSON string", ElasticsearchLogForwardingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticsearchLogForwardingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticsearchLogForwardingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("elasticsearch_api_key") != null && !jsonObj.get("elasticsearch_api_key").isJsonNull()) && !jsonObj.get("elasticsearch_api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_api_key").toString()));
      }
      if ((jsonObj.get("elasticsearch_auth_type") != null && !jsonObj.get("elasticsearch_auth_type").isJsonNull()) && !jsonObj.get("elasticsearch_auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_auth_type").toString()));
      }
      if ((jsonObj.get("elasticsearch_cloud_id") != null && !jsonObj.get("elasticsearch_cloud_id").isJsonNull()) && !jsonObj.get("elasticsearch_cloud_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_cloud_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_cloud_id").toString()));
      }
      if ((jsonObj.get("elasticsearch_index") != null && !jsonObj.get("elasticsearch_index").isJsonNull()) && !jsonObj.get("elasticsearch_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_index").toString()));
      }
      if ((jsonObj.get("elasticsearch_nodes") != null && !jsonObj.get("elasticsearch_nodes").isJsonNull()) && !jsonObj.get("elasticsearch_nodes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_nodes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_nodes").toString()));
      }
      if ((jsonObj.get("elasticsearch_password") != null && !jsonObj.get("elasticsearch_password").isJsonNull()) && !jsonObj.get("elasticsearch_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_password").toString()));
      }
      if ((jsonObj.get("elasticsearch_server_type") != null && !jsonObj.get("elasticsearch_server_type").isJsonNull()) && !jsonObj.get("elasticsearch_server_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_server_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_server_type").toString()));
      }
      if ((jsonObj.get("elasticsearch_tls_certificate") != null && !jsonObj.get("elasticsearch_tls_certificate").isJsonNull()) && !jsonObj.get("elasticsearch_tls_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_tls_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_tls_certificate").toString()));
      }
      if ((jsonObj.get("elasticsearch_user_name") != null && !jsonObj.get("elasticsearch_user_name").isJsonNull()) && !jsonObj.get("elasticsearch_user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elasticsearch_user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elasticsearch_user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticsearchLogForwardingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticsearchLogForwardingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticsearchLogForwardingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticsearchLogForwardingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticsearchLogForwardingConfig>() {
           @Override
           public void write(JsonWriter out, ElasticsearchLogForwardingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticsearchLogForwardingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElasticsearchLogForwardingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElasticsearchLogForwardingConfig
   * @throws IOException if the JSON string is invalid with respect to ElasticsearchLogForwardingConfig
   */
  public static ElasticsearchLogForwardingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticsearchLogForwardingConfig.class);
  }

  /**
   * Convert an instance of ElasticsearchLogForwardingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

