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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * dynamicSecretUpdateGithub is a command that updates github dynamic secret
 */
@ApiModel(description = "dynamicSecretUpdateGithub is a command that updates github dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretUpdateGithub {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GITHUB_APP_ID = "github-app-id";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_ID)
  private Long githubAppId;

  public static final String SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY = "github-app-private-key";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP_PRIVATE_KEY)
  private String githubAppPrivateKey;

  public static final String SERIALIZED_NAME_GITHUB_BASE_URL = "github-base-url";
  @SerializedName(SERIALIZED_NAME_GITHUB_BASE_URL)
  private String githubBaseUrl = "https://api.github.com/";

  public static final String SERIALIZED_NAME_INSTALLATION_ID = "installation-id";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ID)
  private Long installationId;

  public static final String SERIALIZED_NAME_INSTALLATION_ORGANIZATION = "installation-organization";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ORGANIZATION)
  private String installationOrganization;

  public static final String SERIALIZED_NAME_INSTALLATION_REPOSITORY = "installation-repository";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_REPOSITORY)
  private String installationRepository;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_PERMISSIONS = "token-permissions";
  @SerializedName(SERIALIZED_NAME_TOKEN_PERMISSIONS)
  private List<String> tokenPermissions = null;

  public static final String SERIALIZED_NAME_TOKEN_REPOSITORIES = "token-repositories";
  @SerializedName(SERIALIZED_NAME_TOKEN_REPOSITORIES)
  private List<String> tokenRepositories = null;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DynamicSecretUpdateGithub() { 
  }

  public DynamicSecretUpdateGithub deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this object [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateGithub description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DynamicSecretUpdateGithub githubAppId(Long githubAppId) {
    
    this.githubAppId = githubAppId;
    return this;
  }

   /**
   * Github app id
   * @return githubAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Github app id")

  public Long getGithubAppId() {
    return githubAppId;
  }


  public void setGithubAppId(Long githubAppId) {
    this.githubAppId = githubAppId;
  }


  public DynamicSecretUpdateGithub githubAppPrivateKey(String githubAppPrivateKey) {
    
    this.githubAppPrivateKey = githubAppPrivateKey;
    return this;
  }

   /**
   * App private key
   * @return githubAppPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App private key")

  public String getGithubAppPrivateKey() {
    return githubAppPrivateKey;
  }


  public void setGithubAppPrivateKey(String githubAppPrivateKey) {
    this.githubAppPrivateKey = githubAppPrivateKey;
  }


  public DynamicSecretUpdateGithub githubBaseUrl(String githubBaseUrl) {
    
    this.githubBaseUrl = githubBaseUrl;
    return this;
  }

   /**
   * Base URL
   * @return githubBaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base URL")

  public String getGithubBaseUrl() {
    return githubBaseUrl;
  }


  public void setGithubBaseUrl(String githubBaseUrl) {
    this.githubBaseUrl = githubBaseUrl;
  }


  public DynamicSecretUpdateGithub installationId(Long installationId) {
    
    this.installationId = installationId;
    return this;
  }

   /**
   * GitHub application installation id
   * @return installationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GitHub application installation id")

  public Long getInstallationId() {
    return installationId;
  }


  public void setInstallationId(Long installationId) {
    this.installationId = installationId;
  }


  public DynamicSecretUpdateGithub installationOrganization(String installationOrganization) {
    
    this.installationOrganization = installationOrganization;
    return this;
  }

   /**
   * Optional, mutually exclusive with installation id, GitHub organization name
   * @return installationOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional, mutually exclusive with installation id, GitHub organization name")

  public String getInstallationOrganization() {
    return installationOrganization;
  }


  public void setInstallationOrganization(String installationOrganization) {
    this.installationOrganization = installationOrganization;
  }


  public DynamicSecretUpdateGithub installationRepository(String installationRepository) {
    
    this.installationRepository = installationRepository;
    return this;
  }

   /**
   * Optional, mutually exclusive with installation id, GitHub repository &#39;&lt;owner&gt;/&lt;repo-name&gt;&#39;
   * @return installationRepository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional, mutually exclusive with installation id, GitHub repository '<owner>/<repo-name>'")

  public String getInstallationRepository() {
    return installationRepository;
  }


  public void setInstallationRepository(String installationRepository) {
    this.installationRepository = installationRepository;
  }


  public DynamicSecretUpdateGithub json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public DynamicSecretUpdateGithub name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DynamicSecretUpdateGithub newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Dynamic secret name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic secret name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateGithub tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateGithub addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretUpdateGithub targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretUpdateGithub token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public DynamicSecretUpdateGithub tokenPermissions(List<String> tokenPermissions) {
    
    this.tokenPermissions = tokenPermissions;
    return this;
  }

  public DynamicSecretUpdateGithub addTokenPermissionsItem(String tokenPermissionsItem) {
    if (this.tokenPermissions == null) {
      this.tokenPermissions = new ArrayList<String>();
    }
    this.tokenPermissions.add(tokenPermissionsItem);
    return this;
  }

   /**
   * Optional - installation token&#39;s allowed permissions
   * @return tokenPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional - installation token's allowed permissions")

  public List<String> getTokenPermissions() {
    return tokenPermissions;
  }


  public void setTokenPermissions(List<String> tokenPermissions) {
    this.tokenPermissions = tokenPermissions;
  }


  public DynamicSecretUpdateGithub tokenRepositories(List<String> tokenRepositories) {
    
    this.tokenRepositories = tokenRepositories;
    return this;
  }

  public DynamicSecretUpdateGithub addTokenRepositoriesItem(String tokenRepositoriesItem) {
    if (this.tokenRepositories == null) {
      this.tokenRepositories = new ArrayList<String>();
    }
    this.tokenRepositories.add(tokenRepositoriesItem);
    return this;
  }

   /**
   * Optional - installation token&#39;s allowed repositories
   * @return tokenRepositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional - installation token's allowed repositories")

  public List<String> getTokenRepositories() {
    return tokenRepositories;
  }


  public void setTokenRepositories(List<String> tokenRepositories) {
    this.tokenRepositories = tokenRepositories;
  }


  public DynamicSecretUpdateGithub uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
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
    DynamicSecretUpdateGithub dynamicSecretUpdateGithub = (DynamicSecretUpdateGithub) o;
    return Objects.equals(this.deleteProtection, dynamicSecretUpdateGithub.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateGithub.description) &&
        Objects.equals(this.githubAppId, dynamicSecretUpdateGithub.githubAppId) &&
        Objects.equals(this.githubAppPrivateKey, dynamicSecretUpdateGithub.githubAppPrivateKey) &&
        Objects.equals(this.githubBaseUrl, dynamicSecretUpdateGithub.githubBaseUrl) &&
        Objects.equals(this.installationId, dynamicSecretUpdateGithub.installationId) &&
        Objects.equals(this.installationOrganization, dynamicSecretUpdateGithub.installationOrganization) &&
        Objects.equals(this.installationRepository, dynamicSecretUpdateGithub.installationRepository) &&
        Objects.equals(this.json, dynamicSecretUpdateGithub.json) &&
        Objects.equals(this.name, dynamicSecretUpdateGithub.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateGithub.newName) &&
        Objects.equals(this.tags, dynamicSecretUpdateGithub.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateGithub.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateGithub.token) &&
        Objects.equals(this.tokenPermissions, dynamicSecretUpdateGithub.tokenPermissions) &&
        Objects.equals(this.tokenRepositories, dynamicSecretUpdateGithub.tokenRepositories) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateGithub.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, githubAppId, githubAppPrivateKey, githubBaseUrl, installationId, installationOrganization, installationRepository, json, name, newName, tags, targetName, token, tokenPermissions, tokenRepositories, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateGithub {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    githubAppId: ").append(toIndentedString(githubAppId)).append("\n");
    sb.append("    githubAppPrivateKey: ").append(toIndentedString(githubAppPrivateKey)).append("\n");
    sb.append("    githubBaseUrl: ").append(toIndentedString(githubBaseUrl)).append("\n");
    sb.append("    installationId: ").append(toIndentedString(installationId)).append("\n");
    sb.append("    installationOrganization: ").append(toIndentedString(installationOrganization)).append("\n");
    sb.append("    installationRepository: ").append(toIndentedString(installationRepository)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenPermissions: ").append(toIndentedString(tokenPermissions)).append("\n");
    sb.append("    tokenRepositories: ").append(toIndentedString(tokenRepositories)).append("\n");
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

}

