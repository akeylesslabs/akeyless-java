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
 * gatewayUpdateAllowedAccess is a command that update allowed access in Gator
 */
@ApiModel(description = "gatewayUpdateAllowedAccess is a command that update allowed access in Gator")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateAllowedAccess {
  public static final String SERIALIZED_NAME_SUB_CLAIMS_CASE_INSENSITIVE = "SubClaimsCaseInsensitive";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS_CASE_INSENSITIVE)
  private Boolean subClaimsCaseInsensitive;

  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "case-sensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private String caseSensitive = "true";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public GatewayUpdateAllowedAccess() { 
  }

  public GatewayUpdateAllowedAccess subClaimsCaseInsensitive(Boolean subClaimsCaseInsensitive) {
    
    this.subClaimsCaseInsensitive = subClaimsCaseInsensitive;
    return this;
  }

   /**
   * Get subClaimsCaseInsensitive
   * @return subClaimsCaseInsensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSubClaimsCaseInsensitive() {
    return subClaimsCaseInsensitive;
  }


  public void setSubClaimsCaseInsensitive(Boolean subClaimsCaseInsensitive) {
    this.subClaimsCaseInsensitive = subClaimsCaseInsensitive;
  }


  public GatewayUpdateAllowedAccess accessId(String accessId) {
    
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


  public GatewayUpdateAllowedAccess caseSensitive(String caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Treat sub claims as case-sensitive [true/false]
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Treat sub claims as case-sensitive [true/false]")

  public String getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(String caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public GatewayUpdateAllowedAccess description(String description) {
    
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


  public GatewayUpdateAllowedAccess json(Boolean json) {
    
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


  public GatewayUpdateAllowedAccess name(String name) {
    
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


  public GatewayUpdateAllowedAccess newName(String newName) {
    
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


  public GatewayUpdateAllowedAccess permissions(String permissions) {
    
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


  public GatewayUpdateAllowedAccess subClaims(Map<String, String> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public GatewayUpdateAllowedAccess putSubClaimsItem(String key, String subClaimsItem) {
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


  public GatewayUpdateAllowedAccess token(String token) {
    
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


  public GatewayUpdateAllowedAccess uidToken(String uidToken) {
    
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
    GatewayUpdateAllowedAccess gatewayUpdateAllowedAccess = (GatewayUpdateAllowedAccess) o;
    return Objects.equals(this.subClaimsCaseInsensitive, gatewayUpdateAllowedAccess.subClaimsCaseInsensitive) &&
        Objects.equals(this.accessId, gatewayUpdateAllowedAccess.accessId) &&
        Objects.equals(this.caseSensitive, gatewayUpdateAllowedAccess.caseSensitive) &&
        Objects.equals(this.description, gatewayUpdateAllowedAccess.description) &&
        Objects.equals(this.json, gatewayUpdateAllowedAccess.json) &&
        Objects.equals(this.name, gatewayUpdateAllowedAccess.name) &&
        Objects.equals(this.newName, gatewayUpdateAllowedAccess.newName) &&
        Objects.equals(this.permissions, gatewayUpdateAllowedAccess.permissions) &&
        Objects.equals(this.subClaims, gatewayUpdateAllowedAccess.subClaims) &&
        Objects.equals(this.token, gatewayUpdateAllowedAccess.token) &&
        Objects.equals(this.uidToken, gatewayUpdateAllowedAccess.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subClaimsCaseInsensitive, accessId, caseSensitive, description, json, name, newName, permissions, subClaims, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateAllowedAccess {\n");
    sb.append("    subClaimsCaseInsensitive: ").append(toIndentedString(subClaimsCaseInsensitive)).append("\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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

