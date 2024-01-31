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
 * SetRoleRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetRoleRule {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private List<String> capability = new ArrayList<String>();

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_ROLE_NAME = "role-name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule-type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private String ruleType = "item-rule";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public SetRoleRule() { 
  }

  public SetRoleRule capability(List<String> capability) {
    
    this.capability = capability;
    return this;
  }

  public SetRoleRule addCapabilityItem(String capabilityItem) {
    this.capability.add(capabilityItem);
    return this;
  }

   /**
   * List of the approved/denied capabilities in the path options: [read, create, update, delete, list, deny]
   * @return capability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of the approved/denied capabilities in the path options: [read, create, update, delete, list, deny]")

  public List<String> getCapability() {
    return capability;
  }


  public void setCapability(List<String> capability) {
    this.capability = capability;
  }


  public SetRoleRule json(Boolean json) {
    
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


  public SetRoleRule path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path the rule refers to
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path the rule refers to")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SetRoleRule roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * The role name to be updated
   * @return roleName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The role name to be updated")

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public SetRoleRule ruleType(String ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * item-rule, target-rule, role-rule, auth-method-rule, search-rule, reports-rule, gw-reports-rule or sra-reports-rule, sra-rule
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "item-rule, target-rule, role-rule, auth-method-rule, search-rule, reports-rule, gw-reports-rule or sra-reports-rule, sra-rule")

  public String getRuleType() {
    return ruleType;
  }


  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }


  public SetRoleRule token(String token) {
    
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


  public SetRoleRule ttl(Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * RoleRule ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RoleRule ttl")

  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  public SetRoleRule uidToken(String uidToken) {
    
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
    SetRoleRule setRoleRule = (SetRoleRule) o;
    return Objects.equals(this.capability, setRoleRule.capability) &&
        Objects.equals(this.json, setRoleRule.json) &&
        Objects.equals(this.path, setRoleRule.path) &&
        Objects.equals(this.roleName, setRoleRule.roleName) &&
        Objects.equals(this.ruleType, setRoleRule.ruleType) &&
        Objects.equals(this.token, setRoleRule.token) &&
        Objects.equals(this.ttl, setRoleRule.ttl) &&
        Objects.equals(this.uidToken, setRoleRule.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, json, path, roleName, ruleType, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRoleRule {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

