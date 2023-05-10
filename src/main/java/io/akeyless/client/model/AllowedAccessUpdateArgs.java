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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AllowedAccessUpdateArgs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllowedAccessUpdateArgs {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private String permissions;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub-claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  private Map<String, String> subClaims = null;

  public AllowedAccessUpdateArgs() { 
  }

  public AllowedAccessUpdateArgs accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Access ID The access id to be attached to this allowed access. Auth method with this access id should already exist.
   * @return accessId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Access ID The access id to be attached to this allowed access. Auth method with this access id should already exist.")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public AllowedAccessUpdateArgs description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Allowed access description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed access description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AllowedAccessUpdateArgs name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Allowed access name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Allowed access name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AllowedAccessUpdateArgs newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New allowed access name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New allowed access name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public AllowedAccessUpdateArgs permissions(String permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Permissions  Comma-seperated list of permissions for this allowed access. Available permissions: [defaults,targets,classic_keys,automatic_migration,ldap_auth,dynamic_secret,k8s_auth,log_forwarding,zero_knowledge_encryption,rotated_secret,caching,event_forwarding,admin,kmip,general]
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permissions  Comma-seperated list of permissions for this allowed access. Available permissions: [defaults,targets,classic_keys,automatic_migration,ldap_auth,dynamic_secret,k8s_auth,log_forwarding,zero_knowledge_encryption,rotated_secret,caching,event_forwarding,admin,kmip,general]")

  public String getPermissions() {
    return permissions;
  }


  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }


  public AllowedAccessUpdateArgs subClaims(Map<String, String> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public AllowedAccessUpdateArgs putSubClaimsItem(String key, String subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<String, String>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

   /**
   * Sub claims key/val of sub claims, e.g group&#x3D;admins,developers
   * @return subClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sub claims key/val of sub claims, e.g group=admins,developers")

  public Map<String, String> getSubClaims() {
    return subClaims;
  }


  public void setSubClaims(Map<String, String> subClaims) {
    this.subClaims = subClaims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedAccessUpdateArgs allowedAccessUpdateArgs = (AllowedAccessUpdateArgs) o;
    return Objects.equals(this.accessId, allowedAccessUpdateArgs.accessId) &&
        Objects.equals(this.description, allowedAccessUpdateArgs.description) &&
        Objects.equals(this.name, allowedAccessUpdateArgs.name) &&
        Objects.equals(this.newName, allowedAccessUpdateArgs.newName) &&
        Objects.equals(this.permissions, allowedAccessUpdateArgs.permissions) &&
        Objects.equals(this.subClaims, allowedAccessUpdateArgs.subClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, description, name, newName, permissions, subClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedAccessUpdateArgs {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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
