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

/**
 * updateLinkedTarget is a command that updates an existing target. [Deprecated: Use target-update-linked command]
 */
@ApiModel(description = "updateLinkedTarget is a command that updates an existing target. [Deprecated: Use target-update-linked command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateLinkedTarget {
  public static final String SERIALIZED_NAME_ADD_HOSTS = "add-hosts";
  @SerializedName(SERIALIZED_NAME_ADD_HOSTS)
  private String addHosts;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private String hosts;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PARENT_TARGET_NAME = "parent-target-name";
  @SerializedName(SERIALIZED_NAME_PARENT_TARGET_NAME)
  private String parentTargetName;

  public static final String SERIALIZED_NAME_RM_HOSTS = "rm-hosts";
  @SerializedName(SERIALIZED_NAME_RM_HOSTS)
  private String rmHosts;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public UpdateLinkedTarget() { 
  }

  public UpdateLinkedTarget addHosts(String addHosts) {
    
    this.addHosts = addHosts;
    return this;
  }

   /**
   * A comma seperated list of new server hosts and server descriptions joined by semicolon &#39;;&#39; that will be added to the Linked Target hosts.
   * @return addHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma seperated list of new server hosts and server descriptions joined by semicolon ';' that will be added to the Linked Target hosts.")

  public String getAddHosts() {
    return addHosts;
  }


  public void setAddHosts(String addHosts) {
    this.addHosts = addHosts;
  }


  public UpdateLinkedTarget description(String description) {
    
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


  public UpdateLinkedTarget hosts(String hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * A comma seperated list of server hosts and server descriptions joined by semicolon &#39;;&#39; (i.e. &#39;server-dev.com;My Dev server,server-prod.com;My Prod server description&#39;)
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma seperated list of server hosts and server descriptions joined by semicolon ';' (i.e. 'server-dev.com;My Dev server,server-prod.com;My Prod server description')")

  public String getHosts() {
    return hosts;
  }


  public void setHosts(String hosts) {
    this.hosts = hosts;
  }


  public UpdateLinkedTarget json(Boolean json) {
    
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


  public UpdateLinkedTarget keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to keep previous version [true/false]. If not set, use default according to account settings")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateLinkedTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Linked Target name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Linked Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateLinkedTarget newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New Linked Target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New Linked Target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateLinkedTarget parentTargetName(String parentTargetName) {
    
    this.parentTargetName = parentTargetName;
    return this;
  }

   /**
   * The parent Target name
   * @return parentTargetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The parent Target name")

  public String getParentTargetName() {
    return parentTargetName;
  }


  public void setParentTargetName(String parentTargetName) {
    this.parentTargetName = parentTargetName;
  }


  public UpdateLinkedTarget rmHosts(String rmHosts) {
    
    this.rmHosts = rmHosts;
    return this;
  }

   /**
   * Comma separated list of existing hosts that will be removed from Linked Target hosts.
   * @return rmHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma separated list of existing hosts that will be removed from Linked Target hosts.")

  public String getRmHosts() {
    return rmHosts;
  }


  public void setRmHosts(String rmHosts) {
    this.rmHosts = rmHosts;
  }


  public UpdateLinkedTarget token(String token) {
    
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


  public UpdateLinkedTarget type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Specifies the hosts type, relevant only when working without parent target
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the hosts type, relevant only when working without parent target")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UpdateLinkedTarget uidToken(String uidToken) {
    
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
    UpdateLinkedTarget updateLinkedTarget = (UpdateLinkedTarget) o;
    return Objects.equals(this.addHosts, updateLinkedTarget.addHosts) &&
        Objects.equals(this.description, updateLinkedTarget.description) &&
        Objects.equals(this.hosts, updateLinkedTarget.hosts) &&
        Objects.equals(this.json, updateLinkedTarget.json) &&
        Objects.equals(this.keepPrevVersion, updateLinkedTarget.keepPrevVersion) &&
        Objects.equals(this.name, updateLinkedTarget.name) &&
        Objects.equals(this.newName, updateLinkedTarget.newName) &&
        Objects.equals(this.parentTargetName, updateLinkedTarget.parentTargetName) &&
        Objects.equals(this.rmHosts, updateLinkedTarget.rmHosts) &&
        Objects.equals(this.token, updateLinkedTarget.token) &&
        Objects.equals(this.type, updateLinkedTarget.type) &&
        Objects.equals(this.uidToken, updateLinkedTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addHosts, description, hosts, json, keepPrevVersion, name, newName, parentTargetName, rmHosts, token, type, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLinkedTarget {\n");
    sb.append("    addHosts: ").append(toIndentedString(addHosts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    parentTargetName: ").append(toIndentedString(parentTargetName)).append("\n");
    sb.append("    rmHosts: ").append(toIndentedString(rmHosts)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

