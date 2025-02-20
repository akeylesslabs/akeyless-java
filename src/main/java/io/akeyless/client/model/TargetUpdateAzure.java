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
 * TargetUpdateAzure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetUpdateAzure {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client-secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  @javax.annotation.Nullable
  private String clientSecret;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  @javax.annotation.Nullable
  private String keepPrevVersion;

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

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_NAME = "resource-group-name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_NAME)
  @javax.annotation.Nullable
  private String resourceGroupName;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resource-name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  @javax.annotation.Nullable
  private String resourceName;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription-id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  @javax.annotation.Nullable
  private String subscriptionId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant-id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nullable
  private String tenantId;

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

  public TargetUpdateAzure() {
  }

  public TargetUpdateAzure clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Azure client/application id
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public TargetUpdateAzure clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Azure client secret
   * @return clientSecret
   */
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public TargetUpdateAzure description(@javax.annotation.Nullable String description) {
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


  public TargetUpdateAzure json(@javax.annotation.Nullable Boolean json) {
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


  public TargetUpdateAzure keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

  /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
   */
  @javax.annotation.Nullable
  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }

  public void setKeepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public TargetUpdateAzure key(@javax.annotation.Nullable String key) {
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


  public TargetUpdateAzure maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetUpdateAzure name(@javax.annotation.Nonnull String name) {
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


  public TargetUpdateAzure newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * New target name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public TargetUpdateAzure resourceGroupName(@javax.annotation.Nullable String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
    return this;
  }

  /**
   * The Resource Group name in your Azure subscription
   * @return resourceGroupName
   */
  @javax.annotation.Nullable
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  public void setResourceGroupName(@javax.annotation.Nullable String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }


  public TargetUpdateAzure resourceName(@javax.annotation.Nullable String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the relevant Resource
   * @return resourceName
   */
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(@javax.annotation.Nullable String resourceName) {
    this.resourceName = resourceName;
  }


  public TargetUpdateAzure subscriptionId(@javax.annotation.Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Azure Subscription Id
   * @return subscriptionId
   */
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(@javax.annotation.Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public TargetUpdateAzure tenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Azure tenant id
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nullable String tenantId) {
    this.tenantId = tenantId;
  }


  public TargetUpdateAzure token(@javax.annotation.Nullable String token) {
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


  public TargetUpdateAzure uidToken(@javax.annotation.Nullable String uidToken) {
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


  public TargetUpdateAzure useGwCloudIdentity(@javax.annotation.Nullable Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

  /**
   * Use the GW&#39;s Cloud IAM [Deprecated: Use connection-type&#x3D;cloud-identity]
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
    TargetUpdateAzure targetUpdateAzure = (TargetUpdateAzure) o;
    return Objects.equals(this.clientId, targetUpdateAzure.clientId) &&
        Objects.equals(this.clientSecret, targetUpdateAzure.clientSecret) &&
        Objects.equals(this.description, targetUpdateAzure.description) &&
        Objects.equals(this.json, targetUpdateAzure.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateAzure.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateAzure.key) &&
        Objects.equals(this.maxVersions, targetUpdateAzure.maxVersions) &&
        Objects.equals(this.name, targetUpdateAzure.name) &&
        Objects.equals(this.newName, targetUpdateAzure.newName) &&
        Objects.equals(this.resourceGroupName, targetUpdateAzure.resourceGroupName) &&
        Objects.equals(this.resourceName, targetUpdateAzure.resourceName) &&
        Objects.equals(this.subscriptionId, targetUpdateAzure.subscriptionId) &&
        Objects.equals(this.tenantId, targetUpdateAzure.tenantId) &&
        Objects.equals(this.token, targetUpdateAzure.token) &&
        Objects.equals(this.uidToken, targetUpdateAzure.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, targetUpdateAzure.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, description, json, keepPrevVersion, key, maxVersions, name, newName, resourceGroupName, resourceName, subscriptionId, tenantId, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateAzure {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("client-id");
    openapiFields.add("client-secret");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("resource-group-name");
    openapiFields.add("resource-name");
    openapiFields.add("subscription-id");
    openapiFields.add("tenant-id");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("use-gw-cloud-identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetUpdateAzure
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetUpdateAzure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetUpdateAzure is not found in the empty JSON string", TargetUpdateAzure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetUpdateAzure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetUpdateAzure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetUpdateAzure.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client-id") != null && !jsonObj.get("client-id").isJsonNull()) && !jsonObj.get("client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-id").toString()));
      }
      if ((jsonObj.get("client-secret") != null && !jsonObj.get("client-secret").isJsonNull()) && !jsonObj.get("client-secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-secret").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
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
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("resource-group-name") != null && !jsonObj.get("resource-group-name").isJsonNull()) && !jsonObj.get("resource-group-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource-group-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource-group-name").toString()));
      }
      if ((jsonObj.get("resource-name") != null && !jsonObj.get("resource-name").isJsonNull()) && !jsonObj.get("resource-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource-name").toString()));
      }
      if ((jsonObj.get("subscription-id") != null && !jsonObj.get("subscription-id").isJsonNull()) && !jsonObj.get("subscription-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription-id").toString()));
      }
      if ((jsonObj.get("tenant-id") != null && !jsonObj.get("tenant-id").isJsonNull()) && !jsonObj.get("tenant-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant-id").toString()));
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
       if (!TargetUpdateAzure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetUpdateAzure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetUpdateAzure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetUpdateAzure.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetUpdateAzure>() {
           @Override
           public void write(JsonWriter out, TargetUpdateAzure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetUpdateAzure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetUpdateAzure given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetUpdateAzure
   * @throws IOException if the JSON string is invalid with respect to TargetUpdateAzure
   */
  public static TargetUpdateAzure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetUpdateAzure.class);
  }

  /**
   * Convert an instance of TargetUpdateAzure to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

