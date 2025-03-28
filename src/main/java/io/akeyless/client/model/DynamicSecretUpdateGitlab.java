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
 * dynamicSecretUpdateGitlab is a command that updates gitlab dynamic secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretUpdateGitlab {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_GITLAB_ACCESS_TOKEN = "gitlab-access-token";
  @SerializedName(SERIALIZED_NAME_GITLAB_ACCESS_TOKEN)
  @javax.annotation.Nullable
  private String gitlabAccessToken;

  public static final String SERIALIZED_NAME_GITLAB_ACCESS_TYPE = "gitlab-access-type";
  @SerializedName(SERIALIZED_NAME_GITLAB_ACCESS_TYPE)
  @javax.annotation.Nonnull
  private String gitlabAccessType;

  public static final String SERIALIZED_NAME_GITLAB_CERTIFICATE = "gitlab-certificate";
  @SerializedName(SERIALIZED_NAME_GITLAB_CERTIFICATE)
  @javax.annotation.Nullable
  private String gitlabCertificate;

  public static final String SERIALIZED_NAME_GITLAB_ROLE = "gitlab-role";
  @SerializedName(SERIALIZED_NAME_GITLAB_ROLE)
  @javax.annotation.Nullable
  private String gitlabRole;

  public static final String SERIALIZED_NAME_GITLAB_TOKEN_SCOPES = "gitlab-token-scopes";
  @SerializedName(SERIALIZED_NAME_GITLAB_TOKEN_SCOPES)
  @javax.annotation.Nonnull
  private String gitlabTokenScopes;

  public static final String SERIALIZED_NAME_GITLAB_URL = "gitlab-url";
  @SerializedName(SERIALIZED_NAME_GITLAB_URL)
  @javax.annotation.Nullable
  private String gitlabUrl = "https://gitlab.com/";

  public static final String SERIALIZED_NAME_GROUP_NAME = "group-name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  @javax.annotation.Nullable
  private String groupName;

  public static final String SERIALIZED_NAME_INSTALLATION_ORGANIZATION = "installation-organization";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ORGANIZATION)
  @javax.annotation.Nullable
  private String installationOrganization;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

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

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  @javax.annotation.Nullable
  private String ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public DynamicSecretUpdateGitlab() {
  }

  public DynamicSecretUpdateGitlab deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public DynamicSecretUpdateGitlab description(@javax.annotation.Nullable String description) {
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


  public DynamicSecretUpdateGitlab gitlabAccessToken(@javax.annotation.Nullable String gitlabAccessToken) {
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


  public DynamicSecretUpdateGitlab gitlabAccessType(@javax.annotation.Nonnull String gitlabAccessType) {
    this.gitlabAccessType = gitlabAccessType;
    return this;
  }

  /**
   * Gitlab access token type [project,group]
   * @return gitlabAccessType
   */
  @javax.annotation.Nonnull
  public String getGitlabAccessType() {
    return gitlabAccessType;
  }

  public void setGitlabAccessType(@javax.annotation.Nonnull String gitlabAccessType) {
    this.gitlabAccessType = gitlabAccessType;
  }


  public DynamicSecretUpdateGitlab gitlabCertificate(@javax.annotation.Nullable String gitlabCertificate) {
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


  public DynamicSecretUpdateGitlab gitlabRole(@javax.annotation.Nullable String gitlabRole) {
    this.gitlabRole = gitlabRole;
    return this;
  }

  /**
   * Gitlab role
   * @return gitlabRole
   */
  @javax.annotation.Nullable
  public String getGitlabRole() {
    return gitlabRole;
  }

  public void setGitlabRole(@javax.annotation.Nullable String gitlabRole) {
    this.gitlabRole = gitlabRole;
  }


  public DynamicSecretUpdateGitlab gitlabTokenScopes(@javax.annotation.Nonnull String gitlabTokenScopes) {
    this.gitlabTokenScopes = gitlabTokenScopes;
    return this;
  }

  /**
   * Comma-separated list of access token scopes to grant
   * @return gitlabTokenScopes
   */
  @javax.annotation.Nonnull
  public String getGitlabTokenScopes() {
    return gitlabTokenScopes;
  }

  public void setGitlabTokenScopes(@javax.annotation.Nonnull String gitlabTokenScopes) {
    this.gitlabTokenScopes = gitlabTokenScopes;
  }


  public DynamicSecretUpdateGitlab gitlabUrl(@javax.annotation.Nullable String gitlabUrl) {
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


  public DynamicSecretUpdateGitlab groupName(@javax.annotation.Nullable String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Gitlab group name, required for access-type&#x3D;group
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(@javax.annotation.Nullable String groupName) {
    this.groupName = groupName;
  }


  public DynamicSecretUpdateGitlab installationOrganization(@javax.annotation.Nullable String installationOrganization) {
    this.installationOrganization = installationOrganization;
    return this;
  }

  /**
   * Gitlab project name, required for access-type&#x3D;project
   * @return installationOrganization
   */
  @javax.annotation.Nullable
  public String getInstallationOrganization() {
    return installationOrganization;
  }

  public void setInstallationOrganization(@javax.annotation.Nullable String installationOrganization) {
    this.installationOrganization = installationOrganization;
  }


  public DynamicSecretUpdateGitlab json(@javax.annotation.Nullable Boolean json) {
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


  public DynamicSecretUpdateGitlab name(@javax.annotation.Nonnull String name) {
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


  public DynamicSecretUpdateGitlab newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Dynamic secret name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateGitlab tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateGitlab addTagsItem(String tagsItem) {
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


  public DynamicSecretUpdateGitlab targetName(@javax.annotation.Nullable String targetName) {
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


  public DynamicSecretUpdateGitlab token(@javax.annotation.Nullable String token) {
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


  public DynamicSecretUpdateGitlab ttl(@javax.annotation.Nullable String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Access Token TTL
   * @return ttl
   */
  @javax.annotation.Nullable
  public String getTtl() {
    return ttl;
  }

  public void setTtl(@javax.annotation.Nullable String ttl) {
    this.ttl = ttl;
  }


  public DynamicSecretUpdateGitlab uidToken(@javax.annotation.Nullable String uidToken) {
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
    DynamicSecretUpdateGitlab dynamicSecretUpdateGitlab = (DynamicSecretUpdateGitlab) o;
    return Objects.equals(this.deleteProtection, dynamicSecretUpdateGitlab.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateGitlab.description) &&
        Objects.equals(this.gitlabAccessToken, dynamicSecretUpdateGitlab.gitlabAccessToken) &&
        Objects.equals(this.gitlabAccessType, dynamicSecretUpdateGitlab.gitlabAccessType) &&
        Objects.equals(this.gitlabCertificate, dynamicSecretUpdateGitlab.gitlabCertificate) &&
        Objects.equals(this.gitlabRole, dynamicSecretUpdateGitlab.gitlabRole) &&
        Objects.equals(this.gitlabTokenScopes, dynamicSecretUpdateGitlab.gitlabTokenScopes) &&
        Objects.equals(this.gitlabUrl, dynamicSecretUpdateGitlab.gitlabUrl) &&
        Objects.equals(this.groupName, dynamicSecretUpdateGitlab.groupName) &&
        Objects.equals(this.installationOrganization, dynamicSecretUpdateGitlab.installationOrganization) &&
        Objects.equals(this.json, dynamicSecretUpdateGitlab.json) &&
        Objects.equals(this.name, dynamicSecretUpdateGitlab.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateGitlab.newName) &&
        Objects.equals(this.tags, dynamicSecretUpdateGitlab.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateGitlab.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateGitlab.token) &&
        Objects.equals(this.ttl, dynamicSecretUpdateGitlab.ttl) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateGitlab.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, gitlabAccessToken, gitlabAccessType, gitlabCertificate, gitlabRole, gitlabTokenScopes, gitlabUrl, groupName, installationOrganization, json, name, newName, tags, targetName, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateGitlab {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitlabAccessToken: ").append(toIndentedString(gitlabAccessToken)).append("\n");
    sb.append("    gitlabAccessType: ").append(toIndentedString(gitlabAccessType)).append("\n");
    sb.append("    gitlabCertificate: ").append(toIndentedString(gitlabCertificate)).append("\n");
    sb.append("    gitlabRole: ").append(toIndentedString(gitlabRole)).append("\n");
    sb.append("    gitlabTokenScopes: ").append(toIndentedString(gitlabTokenScopes)).append("\n");
    sb.append("    gitlabUrl: ").append(toIndentedString(gitlabUrl)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    installationOrganization: ").append(toIndentedString(installationOrganization)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("gitlab-access-token");
    openapiFields.add("gitlab-access-type");
    openapiFields.add("gitlab-certificate");
    openapiFields.add("gitlab-role");
    openapiFields.add("gitlab-token-scopes");
    openapiFields.add("gitlab-url");
    openapiFields.add("group-name");
    openapiFields.add("installation-organization");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("ttl");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gitlab-access-type");
    openapiRequiredFields.add("gitlab-token-scopes");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretUpdateGitlab
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretUpdateGitlab.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretUpdateGitlab is not found in the empty JSON string", DynamicSecretUpdateGitlab.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretUpdateGitlab.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretUpdateGitlab` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicSecretUpdateGitlab.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("gitlab-access-token") != null && !jsonObj.get("gitlab-access-token").isJsonNull()) && !jsonObj.get("gitlab-access-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-access-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-access-token").toString()));
      }
      if (!jsonObj.get("gitlab-access-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-access-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-access-type").toString()));
      }
      if ((jsonObj.get("gitlab-certificate") != null && !jsonObj.get("gitlab-certificate").isJsonNull()) && !jsonObj.get("gitlab-certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-certificate").toString()));
      }
      if ((jsonObj.get("gitlab-role") != null && !jsonObj.get("gitlab-role").isJsonNull()) && !jsonObj.get("gitlab-role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-role").toString()));
      }
      if (!jsonObj.get("gitlab-token-scopes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-token-scopes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-token-scopes").toString()));
      }
      if ((jsonObj.get("gitlab-url") != null && !jsonObj.get("gitlab-url").isJsonNull()) && !jsonObj.get("gitlab-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitlab-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitlab-url").toString()));
      }
      if ((jsonObj.get("group-name") != null && !jsonObj.get("group-name").isJsonNull()) && !jsonObj.get("group-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group-name").toString()));
      }
      if ((jsonObj.get("installation-organization") != null && !jsonObj.get("installation-organization").isJsonNull()) && !jsonObj.get("installation-organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installation-organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installation-organization").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
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
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretUpdateGitlab.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretUpdateGitlab' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretUpdateGitlab> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretUpdateGitlab.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretUpdateGitlab>() {
           @Override
           public void write(JsonWriter out, DynamicSecretUpdateGitlab value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretUpdateGitlab read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretUpdateGitlab given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretUpdateGitlab
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretUpdateGitlab
   */
  public static DynamicSecretUpdateGitlab fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretUpdateGitlab.class);
  }

  /**
   * Convert an instance of DynamicSecretUpdateGitlab to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

