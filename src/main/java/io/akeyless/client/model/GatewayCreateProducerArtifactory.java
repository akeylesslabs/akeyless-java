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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * gatewayCreateProducerArtifactory is a command that creates artifactory producer [Deprecated: Use dynamic-secret-create-artifactory command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayCreateProducerArtifactory {
  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME = "artifactory-admin-name";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME)
  @javax.annotation.Nullable
  private String artifactoryAdminName;

  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD = "artifactory-admin-pwd";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD)
  @javax.annotation.Nullable
  private String artifactoryAdminPwd;

  public static final String SERIALIZED_NAME_ARTIFACTORY_TOKEN_AUDIENCE = "artifactory-token-audience";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_TOKEN_AUDIENCE)
  @javax.annotation.Nonnull
  private String artifactoryTokenAudience;

  public static final String SERIALIZED_NAME_ARTIFACTORY_TOKEN_SCOPE = "artifactory-token-scope";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_TOKEN_SCOPE)
  @javax.annotation.Nonnull
  private String artifactoryTokenScope;

  public static final String SERIALIZED_NAME_BASE_URL = "base-url";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  @javax.annotation.Nullable
  private String baseUrl;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public GatewayCreateProducerArtifactory() {
  }

  public GatewayCreateProducerArtifactory artifactoryAdminName(@javax.annotation.Nullable String artifactoryAdminName) {
    this.artifactoryAdminName = artifactoryAdminName;
    return this;
  }

  /**
   * Artifactory Admin Name
   * @return artifactoryAdminName
   */
  @javax.annotation.Nullable
  public String getArtifactoryAdminName() {
    return artifactoryAdminName;
  }

  public void setArtifactoryAdminName(@javax.annotation.Nullable String artifactoryAdminName) {
    this.artifactoryAdminName = artifactoryAdminName;
  }


  public GatewayCreateProducerArtifactory artifactoryAdminPwd(@javax.annotation.Nullable String artifactoryAdminPwd) {
    this.artifactoryAdminPwd = artifactoryAdminPwd;
    return this;
  }

  /**
   * Artifactory Admin password
   * @return artifactoryAdminPwd
   */
  @javax.annotation.Nullable
  public String getArtifactoryAdminPwd() {
    return artifactoryAdminPwd;
  }

  public void setArtifactoryAdminPwd(@javax.annotation.Nullable String artifactoryAdminPwd) {
    this.artifactoryAdminPwd = artifactoryAdminPwd;
  }


  public GatewayCreateProducerArtifactory artifactoryTokenAudience(@javax.annotation.Nonnull String artifactoryTokenAudience) {
    this.artifactoryTokenAudience = artifactoryTokenAudience;
    return this;
  }

  /**
   * Token Audience
   * @return artifactoryTokenAudience
   */
  @javax.annotation.Nonnull
  public String getArtifactoryTokenAudience() {
    return artifactoryTokenAudience;
  }

  public void setArtifactoryTokenAudience(@javax.annotation.Nonnull String artifactoryTokenAudience) {
    this.artifactoryTokenAudience = artifactoryTokenAudience;
  }


  public GatewayCreateProducerArtifactory artifactoryTokenScope(@javax.annotation.Nonnull String artifactoryTokenScope) {
    this.artifactoryTokenScope = artifactoryTokenScope;
    return this;
  }

  /**
   * Token Scope
   * @return artifactoryTokenScope
   */
  @javax.annotation.Nonnull
  public String getArtifactoryTokenScope() {
    return artifactoryTokenScope;
  }

  public void setArtifactoryTokenScope(@javax.annotation.Nonnull String artifactoryTokenScope) {
    this.artifactoryTokenScope = artifactoryTokenScope;
  }


  public GatewayCreateProducerArtifactory baseUrl(@javax.annotation.Nullable String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL
   * @return baseUrl
   */
  @javax.annotation.Nullable
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(@javax.annotation.Nullable String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public GatewayCreateProducerArtifactory deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayCreateProducerArtifactory json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayCreateProducerArtifactory name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GatewayCreateProducerArtifactory producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayCreateProducerArtifactory tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerArtifactory addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public GatewayCreateProducerArtifactory targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public GatewayCreateProducerArtifactory token(@javax.annotation.Nullable String token) {
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


  public GatewayCreateProducerArtifactory uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GatewayCreateProducerArtifactory userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerArtifactory gatewayCreateProducerArtifactory = (GatewayCreateProducerArtifactory) o;
    return Objects.equals(this.artifactoryAdminName, gatewayCreateProducerArtifactory.artifactoryAdminName) &&
        Objects.equals(this.artifactoryAdminPwd, gatewayCreateProducerArtifactory.artifactoryAdminPwd) &&
        Objects.equals(this.artifactoryTokenAudience, gatewayCreateProducerArtifactory.artifactoryTokenAudience) &&
        Objects.equals(this.artifactoryTokenScope, gatewayCreateProducerArtifactory.artifactoryTokenScope) &&
        Objects.equals(this.baseUrl, gatewayCreateProducerArtifactory.baseUrl) &&
        Objects.equals(this.deleteProtection, gatewayCreateProducerArtifactory.deleteProtection) &&
        Objects.equals(this.json, gatewayCreateProducerArtifactory.json) &&
        Objects.equals(this.name, gatewayCreateProducerArtifactory.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerArtifactory.producerEncryptionKeyName) &&
        Objects.equals(this.tags, gatewayCreateProducerArtifactory.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerArtifactory.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerArtifactory.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerArtifactory.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerArtifactory.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAdminName, artifactoryAdminPwd, artifactoryTokenAudience, artifactoryTokenScope, baseUrl, deleteProtection, json, name, producerEncryptionKeyName, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerArtifactory {\n");
    sb.append("    artifactoryAdminName: ").append(toIndentedString(artifactoryAdminName)).append("\n");
    sb.append("    artifactoryAdminPwd: ").append(toIndentedString(artifactoryAdminPwd)).append("\n");
    sb.append("    artifactoryTokenAudience: ").append(toIndentedString(artifactoryTokenAudience)).append("\n");
    sb.append("    artifactoryTokenScope: ").append(toIndentedString(artifactoryTokenScope)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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
    openapiFields.add("artifactory-admin-name");
    openapiFields.add("artifactory-admin-pwd");
    openapiFields.add("artifactory-token-audience");
    openapiFields.add("artifactory-token-scope");
    openapiFields.add("base-url");
    openapiFields.add("delete_protection");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artifactory-token-audience");
    openapiRequiredFields.add("artifactory-token-scope");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayCreateProducerArtifactory
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayCreateProducerArtifactory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayCreateProducerArtifactory is not found in the empty JSON string", GatewayCreateProducerArtifactory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayCreateProducerArtifactory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayCreateProducerArtifactory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayCreateProducerArtifactory.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artifactory-admin-name") != null && !jsonObj.get("artifactory-admin-name").isJsonNull()) && !jsonObj.get("artifactory-admin-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-admin-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-admin-name").toString()));
      }
      if ((jsonObj.get("artifactory-admin-pwd") != null && !jsonObj.get("artifactory-admin-pwd").isJsonNull()) && !jsonObj.get("artifactory-admin-pwd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-admin-pwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-admin-pwd").toString()));
      }
      if (!jsonObj.get("artifactory-token-audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-token-audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-token-audience").toString()));
      }
      if (!jsonObj.get("artifactory-token-scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-token-scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-token-scope").toString()));
      }
      if ((jsonObj.get("base-url") != null && !jsonObj.get("base-url").isJsonNull()) && !jsonObj.get("base-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base-url").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayCreateProducerArtifactory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayCreateProducerArtifactory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayCreateProducerArtifactory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayCreateProducerArtifactory.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayCreateProducerArtifactory>() {
           @Override
           public void write(JsonWriter out, GatewayCreateProducerArtifactory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayCreateProducerArtifactory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayCreateProducerArtifactory given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayCreateProducerArtifactory
   * @throws IOException if the JSON string is invalid with respect to GatewayCreateProducerArtifactory
   */
  public static GatewayCreateProducerArtifactory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayCreateProducerArtifactory.class);
  }

  /**
   * Convert an instance of GatewayCreateProducerArtifactory to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

