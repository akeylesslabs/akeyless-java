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
 * TargetCreateEks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetCreateEks {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EKS_ACCESS_KEY_ID = "eks-access-key-id";
  @SerializedName(SERIALIZED_NAME_EKS_ACCESS_KEY_ID)
  @javax.annotation.Nonnull
  private String eksAccessKeyId;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_CA_CERT = "eks-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_CA_CERT)
  @javax.annotation.Nonnull
  private String eksClusterCaCert;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT = "eks-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT)
  @javax.annotation.Nonnull
  private String eksClusterEndpoint;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_NAME = "eks-cluster-name";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_NAME)
  @javax.annotation.Nonnull
  private String eksClusterName;

  public static final String SERIALIZED_NAME_EKS_REGION = "eks-region";
  @SerializedName(SERIALIZED_NAME_EKS_REGION)
  @javax.annotation.Nullable
  private String eksRegion = "us-east-2";

  public static final String SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY = "eks-secret-access-key";
  @SerializedName(SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY)
  @javax.annotation.Nonnull
  private String eksSecretAccessKey;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  @javax.annotation.Nullable
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  @javax.annotation.Nullable
  private Boolean useGwCloudIdentity;

  public TargetCreateEks() {
  }

  public TargetCreateEks description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public TargetCreateEks eksAccessKeyId(@javax.annotation.Nonnull String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
    return this;
  }

  /**
   * Access Key ID
   * @return eksAccessKeyId
   */
  @javax.annotation.Nonnull
  public String getEksAccessKeyId() {
    return eksAccessKeyId;
  }

  public void setEksAccessKeyId(@javax.annotation.Nonnull String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
  }


  public TargetCreateEks eksClusterCaCert(@javax.annotation.Nonnull String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
    return this;
  }

  /**
   * EKS cluster CA certificate
   * @return eksClusterCaCert
   */
  @javax.annotation.Nonnull
  public String getEksClusterCaCert() {
    return eksClusterCaCert;
  }

  public void setEksClusterCaCert(@javax.annotation.Nonnull String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
  }


  public TargetCreateEks eksClusterEndpoint(@javax.annotation.Nonnull String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
    return this;
  }

  /**
   * EKS cluster URL endpoint
   * @return eksClusterEndpoint
   */
  @javax.annotation.Nonnull
  public String getEksClusterEndpoint() {
    return eksClusterEndpoint;
  }

  public void setEksClusterEndpoint(@javax.annotation.Nonnull String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
  }


  public TargetCreateEks eksClusterName(@javax.annotation.Nonnull String eksClusterName) {
    this.eksClusterName = eksClusterName;
    return this;
  }

  /**
   * EKS cluster name
   * @return eksClusterName
   */
  @javax.annotation.Nonnull
  public String getEksClusterName() {
    return eksClusterName;
  }

  public void setEksClusterName(@javax.annotation.Nonnull String eksClusterName) {
    this.eksClusterName = eksClusterName;
  }


  public TargetCreateEks eksRegion(@javax.annotation.Nullable String eksRegion) {
    this.eksRegion = eksRegion;
    return this;
  }

  /**
   * Region
   * @return eksRegion
   */
  @javax.annotation.Nullable
  public String getEksRegion() {
    return eksRegion;
  }

  public void setEksRegion(@javax.annotation.Nullable String eksRegion) {
    this.eksRegion = eksRegion;
  }


  public TargetCreateEks eksSecretAccessKey(@javax.annotation.Nonnull String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
    return this;
  }

  /**
   * Secret Access Key
   * @return eksSecretAccessKey
   */
  @javax.annotation.Nonnull
  public String getEksSecretAccessKey() {
    return eksSecretAccessKey;
  }

  public void setEksSecretAccessKey(@javax.annotation.Nonnull String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
  }


  public TargetCreateEks json(@javax.annotation.Nullable Boolean json) {
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


  public TargetCreateEks key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public TargetCreateEks maxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
   */
  @javax.annotation.Nullable
  public String getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(@javax.annotation.Nullable String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public TargetCreateEks name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Target name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public TargetCreateEks token(@javax.annotation.Nullable String token) {
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


  public TargetCreateEks uidToken(@javax.annotation.Nullable String uidToken) {
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


  public TargetCreateEks useGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
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
    TargetCreateEks targetCreateEks = (TargetCreateEks) o;
    return Objects.equals(this.description, targetCreateEks.description) &&
        Objects.equals(this.eksAccessKeyId, targetCreateEks.eksAccessKeyId) &&
        Objects.equals(this.eksClusterCaCert, targetCreateEks.eksClusterCaCert) &&
        Objects.equals(this.eksClusterEndpoint, targetCreateEks.eksClusterEndpoint) &&
        Objects.equals(this.eksClusterName, targetCreateEks.eksClusterName) &&
        Objects.equals(this.eksRegion, targetCreateEks.eksRegion) &&
        Objects.equals(this.eksSecretAccessKey, targetCreateEks.eksSecretAccessKey) &&
        Objects.equals(this.json, targetCreateEks.json) &&
        Objects.equals(this.key, targetCreateEks.key) &&
        Objects.equals(this.maxVersions, targetCreateEks.maxVersions) &&
        Objects.equals(this.name, targetCreateEks.name) &&
        Objects.equals(this.token, targetCreateEks.token) &&
        Objects.equals(this.uidToken, targetCreateEks.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, targetCreateEks.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, eksAccessKeyId, eksClusterCaCert, eksClusterEndpoint, eksClusterName, eksRegion, eksSecretAccessKey, json, key, maxVersions, name, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateEks {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eksAccessKeyId: ").append(toIndentedString(eksAccessKeyId)).append("\n");
    sb.append("    eksClusterCaCert: ").append(toIndentedString(eksClusterCaCert)).append("\n");
    sb.append("    eksClusterEndpoint: ").append(toIndentedString(eksClusterEndpoint)).append("\n");
    sb.append("    eksClusterName: ").append(toIndentedString(eksClusterName)).append("\n");
    sb.append("    eksRegion: ").append(toIndentedString(eksRegion)).append("\n");
    sb.append("    eksSecretAccessKey: ").append(toIndentedString(eksSecretAccessKey)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("eks-access-key-id");
    openapiFields.add("eks-cluster-ca-cert");
    openapiFields.add("eks-cluster-endpoint");
    openapiFields.add("eks-cluster-name");
    openapiFields.add("eks-region");
    openapiFields.add("eks-secret-access-key");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("use-gw-cloud-identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eks-access-key-id");
    openapiRequiredFields.add("eks-cluster-ca-cert");
    openapiRequiredFields.add("eks-cluster-endpoint");
    openapiRequiredFields.add("eks-cluster-name");
    openapiRequiredFields.add("eks-secret-access-key");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetCreateEks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetCreateEks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetCreateEks is not found in the empty JSON string", TargetCreateEks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetCreateEks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetCreateEks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetCreateEks.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("eks-access-key-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-access-key-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-access-key-id").toString()));
      }
      if (!jsonObj.get("eks-cluster-ca-cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-ca-cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-ca-cert").toString()));
      }
      if (!jsonObj.get("eks-cluster-endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-endpoint").toString()));
      }
      if (!jsonObj.get("eks-cluster-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-name").toString()));
      }
      if ((jsonObj.get("eks-region") != null && !jsonObj.get("eks-region").isJsonNull()) && !jsonObj.get("eks-region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-region").toString()));
      }
      if (!jsonObj.get("eks-secret-access-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-secret-access-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-secret-access-key").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("max-versions") != null && !jsonObj.get("max-versions").isJsonNull()) && !jsonObj.get("max-versions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max-versions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max-versions").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!TargetCreateEks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetCreateEks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetCreateEks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetCreateEks.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetCreateEks>() {
           @Override
           public void write(JsonWriter out, TargetCreateEks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetCreateEks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetCreateEks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetCreateEks
   * @throws IOException if the JSON string is invalid with respect to TargetCreateEks
   */
  public static TargetCreateEks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetCreateEks.class);
  }

  /**
   * Convert an instance of TargetCreateEks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

