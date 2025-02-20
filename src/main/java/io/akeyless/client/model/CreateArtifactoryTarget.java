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
 * createArtifactoryTarget is a command that creates a new target. [Deprecated: Use target-create-artifactory command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateArtifactoryTarget {
  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME = "artifactory-admin-name";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_NAME)
  @javax.annotation.Nonnull
  private String artifactoryAdminName;

  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD = "artifactory-admin-pwd";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_PWD)
  @javax.annotation.Nonnull
  private String artifactoryAdminPwd;

  public static final String SERIALIZED_NAME_BASE_URL = "base-url";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  @javax.annotation.Nonnull
  private String baseUrl;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

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

  public CreateArtifactoryTarget() {
  }

  public CreateArtifactoryTarget artifactoryAdminName(@javax.annotation.Nonnull String artifactoryAdminName) {
    this.artifactoryAdminName = artifactoryAdminName;
    return this;
  }

  /**
   * Artifactory Admin Name
   * @return artifactoryAdminName
   */
  @javax.annotation.Nonnull
  public String getArtifactoryAdminName() {
    return artifactoryAdminName;
  }

  public void setArtifactoryAdminName(@javax.annotation.Nonnull String artifactoryAdminName) {
    this.artifactoryAdminName = artifactoryAdminName;
  }


  public CreateArtifactoryTarget artifactoryAdminPwd(@javax.annotation.Nonnull String artifactoryAdminPwd) {
    this.artifactoryAdminPwd = artifactoryAdminPwd;
    return this;
  }

  /**
   * Artifactory Admin password
   * @return artifactoryAdminPwd
   */
  @javax.annotation.Nonnull
  public String getArtifactoryAdminPwd() {
    return artifactoryAdminPwd;
  }

  public void setArtifactoryAdminPwd(@javax.annotation.Nonnull String artifactoryAdminPwd) {
    this.artifactoryAdminPwd = artifactoryAdminPwd;
  }


  public CreateArtifactoryTarget baseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL
   * @return baseUrl
   */
  @javax.annotation.Nonnull
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public CreateArtifactoryTarget comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Deprecated - use description
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public CreateArtifactoryTarget description(@javax.annotation.Nullable String description) {
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


  public CreateArtifactoryTarget json(@javax.annotation.Nullable Boolean json) {
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


  public CreateArtifactoryTarget key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public CreateArtifactoryTarget maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public CreateArtifactoryTarget name(@javax.annotation.Nonnull String name) {
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


  public CreateArtifactoryTarget token(@javax.annotation.Nullable String token) {
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


  public CreateArtifactoryTarget uidToken(@javax.annotation.Nullable String uidToken) {
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
    CreateArtifactoryTarget createArtifactoryTarget = (CreateArtifactoryTarget) o;
    return Objects.equals(this.artifactoryAdminName, createArtifactoryTarget.artifactoryAdminName) &&
        Objects.equals(this.artifactoryAdminPwd, createArtifactoryTarget.artifactoryAdminPwd) &&
        Objects.equals(this.baseUrl, createArtifactoryTarget.baseUrl) &&
        Objects.equals(this.comment, createArtifactoryTarget.comment) &&
        Objects.equals(this.description, createArtifactoryTarget.description) &&
        Objects.equals(this.json, createArtifactoryTarget.json) &&
        Objects.equals(this.key, createArtifactoryTarget.key) &&
        Objects.equals(this.maxVersions, createArtifactoryTarget.maxVersions) &&
        Objects.equals(this.name, createArtifactoryTarget.name) &&
        Objects.equals(this.token, createArtifactoryTarget.token) &&
        Objects.equals(this.uidToken, createArtifactoryTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAdminName, artifactoryAdminPwd, baseUrl, comment, description, json, key, maxVersions, name, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateArtifactoryTarget {\n");
    sb.append("    artifactoryAdminName: ").append(toIndentedString(artifactoryAdminName)).append("\n");
    sb.append("    artifactoryAdminPwd: ").append(toIndentedString(artifactoryAdminPwd)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("artifactory-admin-name");
    openapiFields.add("artifactory-admin-pwd");
    openapiFields.add("base-url");
    openapiFields.add("comment");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artifactory-admin-name");
    openapiRequiredFields.add("artifactory-admin-pwd");
    openapiRequiredFields.add("base-url");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateArtifactoryTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateArtifactoryTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateArtifactoryTarget is not found in the empty JSON string", CreateArtifactoryTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateArtifactoryTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateArtifactoryTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateArtifactoryTarget.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("artifactory-admin-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-admin-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-admin-name").toString()));
      }
      if (!jsonObj.get("artifactory-admin-pwd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory-admin-pwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory-admin-pwd").toString()));
      }
      if (!jsonObj.get("base-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base-url").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
       if (!CreateArtifactoryTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateArtifactoryTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateArtifactoryTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateArtifactoryTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateArtifactoryTarget>() {
           @Override
           public void write(JsonWriter out, CreateArtifactoryTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateArtifactoryTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateArtifactoryTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateArtifactoryTarget
   * @throws IOException if the JSON string is invalid with respect to CreateArtifactoryTarget
   */
  public static CreateArtifactoryTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateArtifactoryTarget.class);
  }

  /**
   * Convert an instance of CreateArtifactoryTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

