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
 * CreateUSC is a command that creates a Universal Secrets Connector
 */
@ApiModel(description = "CreateUSC is a command that creates a Universal Secrets Connector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateUSC {
  public static final String SERIALIZED_NAME_AZURE_KV_NAME = "azure-kv-name";
  @SerializedName(SERIALIZED_NAME_AZURE_KV_NAME)
  private String azureKvName;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_K8S_NAMESPACE = "k8s-namespace";
  @SerializedName(SERIALIZED_NAME_K8S_NAMESPACE)
  private String k8sNamespace;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_TO_ASSOCIATE = "target-to-associate";
  @SerializedName(SERIALIZED_NAME_TARGET_TO_ASSOCIATE)
  private String targetToAssociate;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateUSC() { 
  }

  public CreateUSC azureKvName(String azureKvName) {
    
    this.azureKvName = azureKvName;
    return this;
  }

   /**
   * Azure Key Vault name (Relevant only for Azure targets)
   * @return azureKvName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Key Vault name (Relevant only for Azure targets)")

  public String getAzureKvName() {
    return azureKvName;
  }


  public void setAzureKvName(String azureKvName) {
    this.azureKvName = azureKvName;
  }


  public CreateUSC deleteProtection(String deleteProtection) {
    
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


  public CreateUSC description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Universal Secrets Connector
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the Universal Secrets Connector")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateUSC json(Boolean json) {
    
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


  public CreateUSC k8sNamespace(String k8sNamespace) {
    
    this.k8sNamespace = k8sNamespace;
    return this;
  }

   /**
   * K8s namespace (Relevant to Kubernetes targets)
   * @return k8sNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s namespace (Relevant to Kubernetes targets)")

  public String getK8sNamespace() {
    return k8sNamespace;
  }


  public void setK8sNamespace(String k8sNamespace) {
    this.k8sNamespace = k8sNamespace;
  }


  public CreateUSC name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Universal Secrets Connector name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Universal Secrets Connector name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateUSC tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateUSC addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this Universal Secrets Connector
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this Universal Secrets Connector")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateUSC targetToAssociate(String targetToAssociate) {
    
    this.targetToAssociate = targetToAssociate;
    return this;
  }

   /**
   * Target Universal Secrets Connector to connect
   * @return targetToAssociate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target Universal Secrets Connector to connect")

  public String getTargetToAssociate() {
    return targetToAssociate;
  }


  public void setTargetToAssociate(String targetToAssociate) {
    this.targetToAssociate = targetToAssociate;
  }


  public CreateUSC token(String token) {
    
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


  public CreateUSC uidToken(String uidToken) {
    
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
    CreateUSC createUSC = (CreateUSC) o;
    return Objects.equals(this.azureKvName, createUSC.azureKvName) &&
        Objects.equals(this.deleteProtection, createUSC.deleteProtection) &&
        Objects.equals(this.description, createUSC.description) &&
        Objects.equals(this.json, createUSC.json) &&
        Objects.equals(this.k8sNamespace, createUSC.k8sNamespace) &&
        Objects.equals(this.name, createUSC.name) &&
        Objects.equals(this.tags, createUSC.tags) &&
        Objects.equals(this.targetToAssociate, createUSC.targetToAssociate) &&
        Objects.equals(this.token, createUSC.token) &&
        Objects.equals(this.uidToken, createUSC.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureKvName, deleteProtection, description, json, k8sNamespace, name, tags, targetToAssociate, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUSC {\n");
    sb.append("    azureKvName: ").append(toIndentedString(azureKvName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    k8sNamespace: ").append(toIndentedString(k8sNamespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetToAssociate: ").append(toIndentedString(targetToAssociate)).append("\n");
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

}

