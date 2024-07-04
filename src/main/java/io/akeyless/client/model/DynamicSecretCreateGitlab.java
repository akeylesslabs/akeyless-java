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
 * dynamicSecretCreateGitlab is a command that creates gitlab dynamic secret
 */
@ApiModel(description = "dynamicSecretCreateGitlab is a command that creates gitlab dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretCreateGitlab {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GITLAB_ACCESS_TOKEN = "gitlab-access-token";
  @SerializedName(SERIALIZED_NAME_GITLAB_ACCESS_TOKEN)
  private String gitlabAccessToken;

  public static final String SERIALIZED_NAME_GITLAB_ACCESS_TYPE = "gitlab-access-type";
  @SerializedName(SERIALIZED_NAME_GITLAB_ACCESS_TYPE)
  private String gitlabAccessType;

  public static final String SERIALIZED_NAME_GITLAB_CERTIFICATE = "gitlab-certificate";
  @SerializedName(SERIALIZED_NAME_GITLAB_CERTIFICATE)
  private String gitlabCertificate;

  public static final String SERIALIZED_NAME_GITLAB_ROLE = "gitlab-role";
  @SerializedName(SERIALIZED_NAME_GITLAB_ROLE)
  private String gitlabRole;

  public static final String SERIALIZED_NAME_GITLAB_TOKEN_SCOPES = "gitlab-token-scopes";
  @SerializedName(SERIALIZED_NAME_GITLAB_TOKEN_SCOPES)
  private String gitlabTokenScopes;

  public static final String SERIALIZED_NAME_GITLAB_URL = "gitlab-url";
  @SerializedName(SERIALIZED_NAME_GITLAB_URL)
  private String gitlabUrl = "https://gitlab.com/";

  public static final String SERIALIZED_NAME_GROUP_NAME = "group-name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_INSTALLATION_ORGANIZATION = "installation-organization";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ORGANIZATION)
  private String installationOrganization;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DynamicSecretCreateGitlab() { 
  }

  public DynamicSecretCreateGitlab deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretCreateGitlab description(String description) {
    
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


  public DynamicSecretCreateGitlab gitlabAccessToken(String gitlabAccessToken) {
    
    this.gitlabAccessToken = gitlabAccessToken;
    return this;
  }

   /**
   * Gitlab access token
   * @return gitlabAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab access token")

  public String getGitlabAccessToken() {
    return gitlabAccessToken;
  }


  public void setGitlabAccessToken(String gitlabAccessToken) {
    this.gitlabAccessToken = gitlabAccessToken;
  }


  public DynamicSecretCreateGitlab gitlabAccessType(String gitlabAccessType) {
    
    this.gitlabAccessType = gitlabAccessType;
    return this;
  }

   /**
   * Gitlab access token type [project,group]
   * @return gitlabAccessType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Gitlab access token type [project,group]")

  public String getGitlabAccessType() {
    return gitlabAccessType;
  }


  public void setGitlabAccessType(String gitlabAccessType) {
    this.gitlabAccessType = gitlabAccessType;
  }


  public DynamicSecretCreateGitlab gitlabCertificate(String gitlabCertificate) {
    
    this.gitlabCertificate = gitlabCertificate;
    return this;
  }

   /**
   * Gitlab tls certificate (base64 encoded)
   * @return gitlabCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab tls certificate (base64 encoded)")

  public String getGitlabCertificate() {
    return gitlabCertificate;
  }


  public void setGitlabCertificate(String gitlabCertificate) {
    this.gitlabCertificate = gitlabCertificate;
  }


  public DynamicSecretCreateGitlab gitlabRole(String gitlabRole) {
    
    this.gitlabRole = gitlabRole;
    return this;
  }

   /**
   * Gitlab role
   * @return gitlabRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab role")

  public String getGitlabRole() {
    return gitlabRole;
  }


  public void setGitlabRole(String gitlabRole) {
    this.gitlabRole = gitlabRole;
  }


  public DynamicSecretCreateGitlab gitlabTokenScopes(String gitlabTokenScopes) {
    
    this.gitlabTokenScopes = gitlabTokenScopes;
    return this;
  }

   /**
   * Comma-separated list of access token scopes to grant
   * @return gitlabTokenScopes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Comma-separated list of access token scopes to grant")

  public String getGitlabTokenScopes() {
    return gitlabTokenScopes;
  }


  public void setGitlabTokenScopes(String gitlabTokenScopes) {
    this.gitlabTokenScopes = gitlabTokenScopes;
  }


  public DynamicSecretCreateGitlab gitlabUrl(String gitlabUrl) {
    
    this.gitlabUrl = gitlabUrl;
    return this;
  }

   /**
   * Gitlab base url
   * @return gitlabUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab base url")

  public String getGitlabUrl() {
    return gitlabUrl;
  }


  public void setGitlabUrl(String gitlabUrl) {
    this.gitlabUrl = gitlabUrl;
  }


  public DynamicSecretCreateGitlab groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Gitlab group name, required for access-type&#x3D;group
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab group name, required for access-type=group")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public DynamicSecretCreateGitlab installationOrganization(String installationOrganization) {
    
    this.installationOrganization = installationOrganization;
    return this;
  }

   /**
   * Gitlab project name, required for access-type&#x3D;project
   * @return installationOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab project name, required for access-type=project")

  public String getInstallationOrganization() {
    return installationOrganization;
  }


  public void setInstallationOrganization(String installationOrganization) {
    this.installationOrganization = installationOrganization;
  }


  public DynamicSecretCreateGitlab json(Boolean json) {
    
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


  public DynamicSecretCreateGitlab name(String name) {
    
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


  public DynamicSecretCreateGitlab tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateGitlab addTagsItem(String tagsItem) {
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


  public DynamicSecretCreateGitlab targetName(String targetName) {
    
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


  public DynamicSecretCreateGitlab token(String token) {
    
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


  public DynamicSecretCreateGitlab ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Access Token TTL
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Token TTL")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  public DynamicSecretCreateGitlab uidToken(String uidToken) {
    
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
    DynamicSecretCreateGitlab dynamicSecretCreateGitlab = (DynamicSecretCreateGitlab) o;
    return Objects.equals(this.deleteProtection, dynamicSecretCreateGitlab.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateGitlab.description) &&
        Objects.equals(this.gitlabAccessToken, dynamicSecretCreateGitlab.gitlabAccessToken) &&
        Objects.equals(this.gitlabAccessType, dynamicSecretCreateGitlab.gitlabAccessType) &&
        Objects.equals(this.gitlabCertificate, dynamicSecretCreateGitlab.gitlabCertificate) &&
        Objects.equals(this.gitlabRole, dynamicSecretCreateGitlab.gitlabRole) &&
        Objects.equals(this.gitlabTokenScopes, dynamicSecretCreateGitlab.gitlabTokenScopes) &&
        Objects.equals(this.gitlabUrl, dynamicSecretCreateGitlab.gitlabUrl) &&
        Objects.equals(this.groupName, dynamicSecretCreateGitlab.groupName) &&
        Objects.equals(this.installationOrganization, dynamicSecretCreateGitlab.installationOrganization) &&
        Objects.equals(this.json, dynamicSecretCreateGitlab.json) &&
        Objects.equals(this.name, dynamicSecretCreateGitlab.name) &&
        Objects.equals(this.tags, dynamicSecretCreateGitlab.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateGitlab.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateGitlab.token) &&
        Objects.equals(this.ttl, dynamicSecretCreateGitlab.ttl) &&
        Objects.equals(this.uidToken, dynamicSecretCreateGitlab.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, gitlabAccessToken, gitlabAccessType, gitlabCertificate, gitlabRole, gitlabTokenScopes, gitlabUrl, groupName, installationOrganization, json, name, tags, targetName, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateGitlab {\n");
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

}

