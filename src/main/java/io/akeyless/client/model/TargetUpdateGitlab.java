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
 * TargetUpdateGitlab
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TargetUpdateGitlab {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_GITLAB_ACCESS_TOKEN = "gitlab-access-token";
  @SerializedName(SERIALIZED_NAME_GITLAB_ACCESS_TOKEN)
  @javax.annotation.Nullable
  private String gitlabAccessToken;

  public static final String SERIALIZED_NAME_GITLAB_CERTIFICATE = "gitlab-certificate";
  @SerializedName(SERIALIZED_NAME_GITLAB_CERTIFICATE)
  @javax.annotation.Nullable
  private String gitlabCertificate;

  public static final String SERIALIZED_NAME_GITLAB_URL = "gitlab-url";
  @SerializedName(SERIALIZED_NAME_GITLAB_URL)
  @javax.annotation.Nullable
  private String gitlabUrl = "https://gitlab.com/";

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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public TargetUpdateGitlab() {
  }

  public TargetUpdateGitlab description(@javax.annotation.Nullable String description) {
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


  public TargetUpdateGitlab gitlabAccessToken(@javax.annotation.Nullable String gitlabAccessToken) {
    this.gitlabAccessToken = gitlabAccessToken;
    return this;
  }

  /**
   * Gitlab access token
   * @return gitlabAccessToken
   */
  @javax.annotation.Nullable
  public String getGitlabAccessToken() {
    return gitlabAccessToken;
  }

  public void setGitlabAccessToken(@javax.annotation.Nullable String gitlabAccessToken) {
    this.gitlabAccessToken = gitlabAccessToken;
  }


  public TargetUpdateGitlab gitlabCertificate(@javax.annotation.Nullable String gitlabCertificate) {
    this.gitlabCertificate = gitlabCertificate;
    return this;
  }

  /**
   * Gitlab tls certificate (base64 encoded)
   * @return gitlabCertificate
   */
  @javax.annotation.Nullable
  public String getGitlabCertificate() {
    return gitlabCertificate;
  }

  public void setGitlabCertificate(@javax.annotation.Nullable String gitlabCertificate) {
    this.gitlabCertificate = gitlabCertificate;
  }


  public TargetUpdateGitlab gitlabUrl(@javax.annotation.Nullable String gitlabUrl) {
    this.gitlabUrl = gitlabUrl;
    return this;
  }

  /**
   * Gitlab base url
   * @return gitlabUrl
   */
  @javax.annotation.Nullable
  public String getGitlabUrl() {
    return gitlabUrl;
  }

  public void setGitlabUrl(@javax.annotation.Nullable String gitlabUrl) {
    this.gitlabUrl = gitlabUrl;
  }


  public TargetUpdateGitlab json(@javax.annotation.Nullable Boolean json) {
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


  public TargetUpdateGitlab keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
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


  public TargetUpdateGitlab key(@javax.annotation.Nullable String key) {
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


  public TargetUpdateGitlab maxVersions(@javax.annotation.Nullable String maxVersions) {
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


  public TargetUpdateGitlab name(@javax.annotation.Nonnull String name) {
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


  public TargetUpdateGitlab newName(@javax.annotation.Nullable String newName) {
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


  public TargetUpdateGitlab token(@javax.annotation.Nullable String token) {
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


  public TargetUpdateGitlab uidToken(@javax.annotation.Nullable String uidToken) {
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
    TargetUpdateGitlab targetUpdateGitlab = (TargetUpdateGitlab) o;
    return Objects.equals(this.description, targetUpdateGitlab.description) &&
        Objects.equals(this.gitlabAccessToken, targetUpdateGitlab.gitlabAccessToken) &&
        Objects.equals(this.gitlabCertificate, targetUpdateGitlab.gitlabCertificate) &&
        Objects.equals(this.gitlabUrl, targetUpdateGitlab.gitlabUrl) &&
        Objects.equals(this.json, targetUpdateGitlab.json) &&
        Objects.equals(this.keepPrevVersion, targetUpdateGitlab.keepPrevVersion) &&
        Objects.equals(this.key, targetUpdateGitlab.key) &&
        Objects.equals(this.maxVersions, targetUpdateGitlab.maxVersions) &&
        Objects.equals(this.name, targetUpdateGitlab.name) &&
        Objects.equals(this.newName, targetUpdateGitlab.newName) &&
        Objects.equals(this.token, targetUpdateGitlab.token) &&
        Objects.equals(this.uidToken, targetUpdateGitlab.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gitlabAccessToken, gitlabCertificate, gitlabUrl, json, keepPrevVersion, key, maxVersions, name, newName, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUpdateGitlab {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitlabAccessToken: ").append(toIndentedString(gitlabAccessToken)).append("\n");
    sb.append("    gitlabCertificate: ").append(toIndentedString(gitlabCertificate)).append("\n");
    sb.append("    gitlabUrl: ").append(toIndentedString(gitlabUrl)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("gitlab-access-token");
    openapiFields.add("gitlab-certificate");
    openapiFields.add("gitlab-url");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("max-versions");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TargetUpdateGitlab
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TargetUpdateGitlab.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetUpdateGitlab is not found in the empty JSON string", TargetUpdateGitlab.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TargetUpdateGitlab.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetUpdateGitlab` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetUpdateGitlab.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("gitlab-access-token") != null && !jsonObj.get("gitlab-access-token").isJsonNull()) && !jsonObj.get("gitlab-access-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-access-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-access-token").toString()));
      }
      if ((jsonObj.get("gitlab-certificate") != null && !jsonObj.get("gitlab-certificate").isJsonNull()) && !jsonObj.get("gitlab-certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-certificate").toString()));
      }
      if ((jsonObj.get("gitlab-url") != null && !jsonObj.get("gitlab-url").isJsonNull()) && !jsonObj.get("gitlab-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-url").toString()));
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
       if (!TargetUpdateGitlab.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetUpdateGitlab' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetUpdateGitlab> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetUpdateGitlab.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetUpdateGitlab>() {
           @Override
           public void write(JsonWriter out, TargetUpdateGitlab value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetUpdateGitlab read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TargetUpdateGitlab given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TargetUpdateGitlab
   * @throws IOException if the JSON string is invalid with respect to TargetUpdateGitlab
   */
  public static TargetUpdateGitlab fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetUpdateGitlab.class);
  }

  /**
   * Convert an instance of TargetUpdateGitlab to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

